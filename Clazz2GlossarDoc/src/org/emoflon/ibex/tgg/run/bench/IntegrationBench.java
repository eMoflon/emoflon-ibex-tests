package org.emoflon.ibex.tgg.run.bench;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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

import Clazz2GlossarDoc.Clazz2DocRule__Marker;
import Clazz2GlossarDoc.Clazz2GlossarDocFactory;
import Clazz2GlossarDoc.Clazz2doc;
import Clazz2GlossarDoc.Container2ContainerRule__Marker;
import Clazz2GlossarDoc.Container2container;
import Clazz2GlossarDoc.Field2EntityRule__Marker;
import Clazz2GlossarDoc.Field2entry;
import Clazz2GlossarDoc.GlossarEntryRule__Marker;
import Clazz2GlossarDoc.GlossarLinkRule__Marker;
import Clazz2GlossarDoc.Method2EntityRule__Marker;
import Clazz2GlossarDoc.Method2entry;
import Clazz2GlossarDoc.Parameter2entry;
import Clazz2GlossarDoc.ParameterRule__Marker;
import Clazz2GlossarDoc.SubClazz2DocRule__Marker;
import glossarDocumentation.Document;
import glossarDocumentation.DocumentationContainer;
import glossarDocumentation.Entry;
import glossarDocumentation.EntryType;
import glossarDocumentation.Glossar;
import glossarDocumentation.GlossarDocumentationFactory;
import glossarDocumentation.GlossarEntry;
import hipe.generic.actor.junction.util.HiPEConfig;
import simpleClassInheritance.Clazz;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.Field;
import simpleClassInheritance.Method;
import simpleClassInheritance.Parameter;
import simpleClassInheritance.SimpleClassInheritanceFactory;

public class IntegrationBench {

	private final SimpleClassInheritanceFactory cFactory = SimpleClassInheritanceFactory.eINSTANCE;
	private final GlossarDocumentationFactory gFactory = GlossarDocumentationFactory.eINSTANCE;
	private final Clazz2GlossarDocFactory corrFactory = Clazz2GlossarDocFactory.eINSTANCE;
	
	private String workspacePath = "";
	private ResourceSet rs = createResourceSet();
	private URI base = URI.createPlatformResourceURI("/", true);

	private Resource source;
	private Resource target;
	private Resource corr;
	private Resource protocol;
	
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
	private Map<Object, EObject> src2corr;
	
	private int elementCounter = 0;
	
	private int attr_conflict_counter = 0;
	
	private int num_of_conflicts = -1;
	
	public static void main(String[] args) {
		new IntegrationBench().generate("test", 60, 1);
	}
	
	private void initScale(int n, int c) {
		num_of_root_classes = n;
		inheritance_depth = 3;
		horizontal_inheritance_scale = 2;
		num_of_fields = 3;
		num_of_methods = 3;
		num_of_parameters = 2;
		num_of_glossar_entries = (int) (Math.sqrt(n) / 10) + 1;
		num_of_glossar_links_per_entry = 2;
		
		num_of_conflicts = c;
	}
	
	public void generate(String name, int n, int c) {
		System.out.println("Initializing...");
		try {
			INTEGRATE integrate = new INTEGRATE_App("bench", name);
			initializeResource(integrate);
			initScale(n, c);
			clearAll();
			
			System.out.print("Generating Models...");
			long tic = System.currentTimeMillis();
			generateModels();
			System.out.println(elementCounter + " elements created");
			
			long toc = System.currentTimeMillis();
			System.out.println("	Completed in: " + (toc - tic) + " ms");

			System.out.println("Initialize Integrate...");
			tic = System.currentTimeMillis();
			integrate.run();
			toc = System.currentTimeMillis();
			System.out.println("	Completed in: " + (toc - tic) + " ms");

			System.out.println("Register Deltas...");
			BiConsumer<EObject, EObject> delta = this::applyDelta;
			integrate.applyDelta(delta);

			tic = System.currentTimeMillis();
			System.out.println("Propagating...");
			integrate.integrate();
			toc = System.currentTimeMillis();
			System.out.println("	Completed in: " + (toc - tic) + " ms");
			System.out.println(integrate.getConflicts().isEmpty());
			integrate.saveModels();
			integrate.terminate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void applyDelta(EObject source, EObject target) {
		System.out.print("	Applying Deltas...");
		long tic = System.currentTimeMillis();

		ClazzContainer cCont = (ClazzContainer) source;
		
		List<Consumer<Clazz>> deltaFuncs = new LinkedList<>();
		deltaFuncs.add(this::createAttributeConflict);
		deltaFuncs.add(this::createContradictingMoveConflict);
		deltaFuncs.add(this::createDeltePreserveConflict);
		
		if(num_of_conflicts > num_of_root_classes)
			throw new RuntimeException("Too many conflicts for this model");
		for(int i=0; i < num_of_conflicts; i++)  {
			deltaFuncs.get(i % 3).accept(cCont.getClazzes().get(i));
		}
		long toc = System.currentTimeMillis();
		System.out.println("completed in: " + (toc - tic) + " ms");
	}

	private void createDeltePreserveConflict(Clazz c) {
		Document d = name2documents.get(c.getName());
		c.setName("DELETE_PRESERVE_" + c.getName());
		d.setName(c.getName());
		
		Document subD = d.getHyperRefs().get(0);
		Clazz subC = c.getSubClazzes().get(0);
		
		EcoreUtil.delete(subC, true);
		if(!subD.getHyperRefs().isEmpty()) {
			subD = subD.getHyperRefs().get(0);
		}
		
		subD.getEntries().get(0).getGlossarentries().add(value2gEntry.get("GlossarEntry_" + (attr_conflict_counter++ % num_of_glossar_entries)));
	}
	
	private void createAttributeConflict(Clazz c) {
		Document d = name2documents.get(c.getName());

		c.setName("ATTR_CONFLICT_" + c.getName() + "_a");
		d.setName("ATTR_CONFLICT_" + d.getName() + "_b");
	}
	
	private void createContradictingMoveConflict(Clazz c) {
		Document d = name2documents.get(c.getName());
		c.setName("MOVE_CONFLICT_" + c.getName());
		d.setName(c.getName());
		
		Document subD1 = d.getHyperRefs().get(0);
		Document subD2 = d.getHyperRefs().get(1);
		d.getHyperRefs().remove(subD1);
		subD2.getHyperRefs().add(subD1);
		
		Clazz subC = c.getSubClazzes().get(0);
		subC.getSubClazzes().get(0).setSuperClazz(c);
	}


	private void generateModels() {
		createContainer();
		
		createGlossarEntries();
		createClazzAndDocs();
	}
	
	private void createContainer() {
		dContainer = gFactory.createDocumentationContainer();
		glossar = gFactory.createGlossar();
		dContainer.setGlossar(glossar);
		target.getContents().add(dContainer);
		
		cContainer = cFactory.createClazzContainer();
		source.getContents().add(cContainer);
		
		elementCounter += 3;

		Container2container c2c = corrFactory.createContainer2container();
		corr.getContents().add(c2c);
		c2c.setSource(cContainer);
		c2c.setTarget(dContainer);
		src2corr.put(cContainer, c2c);
		
		Container2ContainerRule__Marker marker = corrFactory.createContainer2ContainerRule__Marker();
		marker.setCREATE__SRC__cCont(cContainer);
		marker.setCREATE__CORR__c2d(c2c);
		marker.setCREATE__TRG__dCont(dContainer);
		marker.setCREATE__TRG__glossar(glossar);
		protocol.getContents().add(marker);
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
			
			elementCounter+=2;
			
			Clazz2doc c2d = corrFactory.createClazz2doc();
			corr.getContents().add(c2d);
			c2d.setSource(cRoot);
			c2d.setTarget(dRoot);
			src2corr.put(cRoot, c2d);
			
			Clazz2DocRule__Marker marker = corrFactory.createClazz2DocRule__Marker();
			marker.setCONTEXT__SRC__cCont(cContainer);
			marker.setCONTEXT__CORR__cont2cont((Container2container) src2corr.get(cContainer));
			marker.setCONTEXT__TRG__dCont(dContainer);
			marker.setCREATE__SRC__clazz(cRoot);
			marker.setCREATE__CORR__c2d(c2d);
			marker.setCREATE__TRG__doc(dRoot);
			protocol.getContents().add(marker);
			
			createMethods(cRoot, dRoot, newPrefix);
			createFields(cRoot, dRoot, newPrefix);
			
			createInheritance(cRoot, dRoot, 1, newPrefix);
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
			
			elementCounter+=2;
			
			Clazz2doc c2d = corrFactory.createClazz2doc();
			corr.getContents().add(c2d);
			c2d.setSource(cSub);
			c2d.setTarget(dSub);
			src2corr.put(cSub, c2d);
			
			SubClazz2DocRule__Marker marker = corrFactory.createSubClazz2DocRule__Marker();
			marker.setCONTEXT__SRC__superClazz(cParent);
			marker.setCONTEXT__CORR__super2super((Clazz2doc) src2corr.get(cParent));
			marker.setCONTEXT__TRG__dCont(dContainer);
			marker.setCONTEXT__TRG__superDoc(dParent);
			marker.setCREATE__SRC__subClazz(cSub);
			marker.setCREATE__CORR__sub2sub(c2d);
			marker.setCREATE__TRG__subDoc(dSub);
			protocol.getContents().add(marker);

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
			
			elementCounter += 2;

			Method2entry m2e = corrFactory.createMethod2entry();
			corr.getContents().add(m2e);
			m2e.setSource(m);
			m2e.setTarget(e);
			src2corr.put(m, m2e);
			
			Method2EntityRule__Marker marker = corrFactory.createMethod2EntityRule__Marker();
			marker.setCONTEXT__SRC__clazz(c);
			marker.setCONTEXT__CORR__c2d((Clazz2doc) src2corr.get(c));
			marker.setCONTEXT__TRG__doc(d);
			marker.setCREATE__SRC__method(m);
			marker.setCREATE__CORR__f2e(m2e);
			marker.setCREATE__TRG__entry(e);
			protocol.getContents().add(marker);

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
			Entry e = name2entry.get(m.getName());
			
			elementCounter++;
			
			Parameter2entry p2e = corrFactory.createParameter2entry();
			corr.getContents().add(p2e);
			p2e.setSource(p);
			p2e.setTarget(e);
			src2corr.put(p, p2e);
			
			ParameterRule__Marker marker = corrFactory.createParameterRule__Marker();
			marker.setCONTEXT__SRC__method(m);
			marker.setCONTEXT__CORR__m2e((Method2entry) src2corr.get(m));
			marker.setCONTEXT__TRG__entry(e);
			marker.setCREATE__SRC__param(p);
			marker.setCREATE__CORR__p2e(p2e);
			protocol.getContents().add(marker);
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

			elementCounter += 2;
			
			Field2entry f2e = corrFactory.createField2entry();
			corr.getContents().add(f2e);
			f2e.setSource(f);
			f2e.setTarget(e);
			src2corr.put(f, f2e);
			
			Field2EntityRule__Marker marker = corrFactory.createField2EntityRule__Marker();
			marker.setCONTEXT__SRC__clazz(c);
			marker.setCONTEXT__CORR__c2d((Clazz2doc) src2corr.get(c));
			marker.setCONTEXT__TRG__doc(d);
			marker.setCREATE__SRC__field(f);
			marker.setCREATE__CORR__f2e(f2e);
			marker.setCREATE__TRG__entry(e);
			protocol.getContents().add(marker);

			createGlossarLinks(e);
		}
	}
	
	private void createGlossarEntries() {
		for(int i=0; i<num_of_glossar_entries; i++) {
			GlossarEntry ge = gFactory.createGlossarEntry();
			ge.setValue("GlossarEntry_" + i);
			value2gEntry.put(ge.getValue(), ge);
			glossar.getEntries().add(ge);
			
			elementCounter++;
			
			GlossarEntryRule__Marker marker = corrFactory.createGlossarEntryRule__Marker();
			marker.setCONTEXT__TRG__glossar(glossar);
			marker.setCREATE__TRG__entry(ge);
			protocol.getContents().add(marker);
		}
	}
	
	private void createGlossarLinks(Entry e) {
		for(int i=0; i<num_of_glossar_links_per_entry; i++) {
			GlossarEntry ge = value2gEntry.get("GlossarEntry_" + (entry2glossarEntryCounter % num_of_glossar_entries));
			e.getGlossarentries().add(ge);
			entry2glossarEntryCounter++;
			
			GlossarLinkRule__Marker marker = corrFactory.createGlossarLinkRule__Marker();
			marker.setCONTEXT__TRG__entry(e);
			marker.setCONTEXT__TRG__gEntry(ge);
			protocol.getContents().add(marker);
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
		
		src2corr = new HashMap<>();
	}


	private void initializeResource(INTEGRATE integrate) {
		source = integrate.getOptions().resourceHandler().getSourceResource();
		target = integrate.getOptions().resourceHandler().getTargetResource();
		corr = integrate.getOptions().resourceHandler().getCorrResource();
		protocol = integrate.getOptions().resourceHandler().getProtocolResource();
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
