package org.emoflon.ibex.tgg.run.bench;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.operational.strategies.opt.CC;
import org.emoflon.ibex.tgg.run.clazz2glossardoc.CC_App;
import org.emoflon.ibex.tgg.run.clazz2glossardoc.INTEGRATE_App;

import glossarDocumentation.Document;
import glossarDocumentation.DocumentationContainer;
import glossarDocumentation.Entry;
import glossarDocumentation.EntryType;
import glossarDocumentation.Glossar;
import glossarDocumentation.GlossarDocumentationFactory;
import glossarDocumentation.GlossarEntry;
import simpleClassInheritance.Clazz;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.Field;
import simpleClassInheritance.Method;
import simpleClassInheritance.Parameter;
import simpleClassInheritance.SimpleClassInheritanceFactory;

public class IntegrationBench {

	private final SimpleClassInheritanceFactory cFactory = SimpleClassInheritanceFactory.eINSTANCE;
	private final GlossarDocumentationFactory gFactory = GlossarDocumentationFactory.eINSTANCE;
	
	private String workspacePath = "";
	private ResourceSet rs = createResourceSet();
	private URI base = URI.createPlatformResourceURI("/", true);

	private Resource source;
	private Resource target;
	
	private int num_of_root_classes = -1;
	private int inheritance_depth = -1;
	private int horizontal_inheritance_scale = -1;
	private int num_of_fields = -1;
	private int num_of_methods = -1;
	private int num_of_parameters = -1;
	private int num_of_glossar_entries = -1;
	private int num_of_glossar_links_per_entry = -1;
	
	private int entry2glossarEntryCounter = 0;
	
	private DocumentationContainer dContainer;
	private Map<String, Document> name2documents;
	private Glossar glossar;
	private Map<String, GlossarEntry> value2gEntry;

	private ClazzContainer cContainer;
	private Map<String, Entry> name2entry;
	private Map<String, Clazz> name2clazz;
	private Map<String, Method> name2method;
	private Map<String, Field> name2field;
	private Map<String, Parameter> name2param;
	
	public static void main(String[] args) {
		new IntegrationBench().generate("test", 1, 1);
	}
	
	private void initScale(int n, int d) {
		num_of_root_classes = n*2;
		inheritance_depth = d;
		horizontal_inheritance_scale = 1;
		num_of_fields = 1;
		num_of_methods = 0;
		num_of_parameters = 2;
		num_of_glossar_entries = 2;
		num_of_glossar_links_per_entry = 1;
	}
	
	public void generate(String name, int n, int d) {
		System.out.println("Initializing...");
		try {
			CC cc = new CC_App("bench", "test");
			
			initializeResource(cc);
			initScale(n, d);
			clearAll();
			System.out.println("Generating Models...");
			generateModels();
			System.out.print("CC...");
			long tic = System.currentTimeMillis();
			cc.run();
			long toc = System.currentTimeMillis();
			System.out.println(cc.generateConsistencyReport());	
			System.out.println("Completed CC in: " + (toc - tic) + " ms");
			System.out.println("Saving Models...");
			cc.saveModels();
			System.out.println("Terminate CC");
			cc.terminate();
			
			System.out.println("Integrate...");
			INTEGRATE integrate = new INTEGRATE_App(cc);
			System.out.println("Apply Deltas...");
			BiConsumer<EObject, EObject> delta = (s, t) -> {
				Field next = name2field.values().iterator().next();
				Entry entry = name2entry.get(next.getName());
				Iterator<GlossarEntry> iterator = value2gEntry.values().iterator();
				GlossarEntry gEntry = iterator.next();
				while(entry.getGlossarentries().contains(gEntry))
					gEntry = iterator.next();
				entry.getGlossarentries().add(gEntry);
				EcoreUtil.delete(next, true);
			};
			
//			BiConsumer<EObject, EObject> delta = (s, t) -> name2field.values().forEach(f -> EcoreUtil.delete(f, true));
			integrate.applyDelta(delta);
//			delta.accept(cContainer, dContainer);
			tic = System.currentTimeMillis();
			System.out.println("Run...");
			integrate.integrate();
			toc = System.currentTimeMillis();
			System.out.println("Completed in: " + (toc - tic) + " ms");
			System.out.println(integrate.getConflicts().isEmpty());
			integrate.terminate();
			integrate.saveModels();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private void generateModels() {
		createClazzContainer();
		createDocContainer();
		
		createGlossarEntries();
		createClazzAndDocs();
	}
	
	private void createDocContainer() {
		dContainer = gFactory.createDocumentationContainer();
		glossar = gFactory.createGlossar();
		dContainer.setGlossar(glossar);
		target.getContents().add(dContainer);
	}
	
	private void createClazzContainer() {
		cContainer = cFactory.createClazzContainer();
		source.getContents().add(cContainer);
	}

	private void createClazzAndDocs() {
		for(int i=0; i<num_of_root_classes; i++) {
			String newPrefix = "_" + i;

			Clazz cRoot = cFactory.createClazz();
			cRoot.setName("Clazz" + newPrefix);
			name2clazz.put(cRoot.getName(), cRoot);
			cContainer.getClazzes().add(cRoot);
			
			Document dRoot = gFactory.createDocument();
			dRoot.setName(cRoot.getName());
			name2documents.put(dRoot.getName(), dRoot);
			dContainer.getDocuments().add(dRoot);

			createMethods(cRoot, dRoot, newPrefix);
			createFields(cRoot, dRoot, newPrefix);
			
			createInheritance(cRoot, dRoot, 0, newPrefix);
		}
	}
	


	private void createInheritance(Clazz cParent, Document dParent, int depth, String prefix) {
		if(depth >= inheritance_depth)
			return;
		
		for(int i=0; i < horizontal_inheritance_scale; i++) {
			String newPrefix = prefix + "_" + i;

			Clazz cSub = cFactory.createClazz();
			cSub.setName("Clazz" + newPrefix);
			name2clazz.put(cSub.getName(), cSub);
			cSub.setSuperClazz(cParent);
			
			Document dSub = gFactory.createDocument();
			dSub.setName(cSub.getName());
			name2documents.put(dSub.getName(), dSub);
			dParent.getHyperRefs().add(dSub);
			dContainer.getDocuments().add(dSub);
			
			createMethods(cSub, dSub, newPrefix);
			createFields(cSub, dSub, newPrefix);
			
			createInheritance(cSub, dSub, depth+1, newPrefix);
		}
	}

	private void createMethods(Clazz c, Document d, String prefix) {
		for(int i=0; i<num_of_methods; i++) {
			String newPrefix = prefix + "_" + i;
			
			Method m = cFactory.createMethod();
			m.setName("Method" + newPrefix);
			name2method.put(m.getName(), m);
			c.getMethods().add(m);
			
			Entry e = gFactory.createEntry();
			e.setName(m.getName());
			e.setType(EntryType.METHOD);
			name2entry.put(e.getName(), e);
			d.getEntries().add(e);
			
			createGlossarLinks(e);
			
			createParameters(m, newPrefix);
		}
	}

	private void createParameters(Method m, String prefix) {
		for(int i=0; i<num_of_parameters; i++) {
			String newPrefix = prefix + "_" + i;

			Parameter p = cFactory.createParameter();
			p.setName("Param" + newPrefix);
			name2param.put(p.getName(), p);
			m.getParameters().add(p);
		}
	}

	private void createFields(Clazz c, Document d, String prefix) {
		for(int i=0; i<num_of_fields; i++) {
			String newPrefix = prefix + "_" + i;

			Field f = cFactory.createField();
			f.setName("Field" + newPrefix);
			name2field.put(f.getName(), f);
			c.getFields().add(f);
			
			Entry e = gFactory.createEntry();
			e.setName(f.getName());
			e.setType(EntryType.FIELD);
			name2entry.put(e.getName(), e);
			d.getEntries().add(e);
			
			createGlossarLinks(e);
		}
	}
	
	private void createGlossarEntries() {
		for(int i=0; i<num_of_glossar_entries; i++) {
			GlossarEntry ge = gFactory.createGlossarEntry();
			ge.setValue("GlossarEntry_" + i);
			value2gEntry.put(ge.getValue(), ge);
			glossar.getEntries().add(ge);
		}
	}
	
	private void createGlossarLinks(Entry e) {
		for(int i=0; i<num_of_glossar_links_per_entry; i++) {
			GlossarEntry ge = value2gEntry.get("GlossarEntry_" + (entry2glossarEntryCounter % num_of_glossar_entries));
			e.getGlossarentries().add(ge);
			entry2glossarEntryCounter++;
		}
	}

	private void clearAll() {
		entry2glossarEntryCounter = 0;
		
		dContainer = null;
		glossar = null;
		name2documents = new HashMap<>();
		value2gEntry = new HashMap<>();
		name2entry = new HashMap<>();
		
		cContainer = null;
		name2clazz = new HashMap<>();
		name2method = new HashMap<>();
		name2field = new HashMap<>();
		name2param = new HashMap<>();
	}


	private void initializeResource(CC cc) {
		source = cc.getOptions().resourceHandler().getSourceResource();
		target = cc.getOptions().resourceHandler().getTargetResource();
	}
	
	private ResourceSet createResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		try {
			rs.getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true), URI.createFileURI(new File(workspacePath).getCanonicalPath() + File.separator));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public Resource createResource(String workspaceRelativePath) {
		URI uri = URI.createURI(workspaceRelativePath);
		Resource res = rs.createResource(uri.resolve(base), ContentHandler.UNSPECIFIED_CONTENT_TYPE);
		return res;
	}
}
