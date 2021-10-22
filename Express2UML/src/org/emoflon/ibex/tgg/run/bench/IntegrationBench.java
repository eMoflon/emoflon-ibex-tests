package org.emoflon.ibex.tgg.run.bench;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.Conflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.ConflictResolver;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationFragment;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.emoflon.ibex.tgg.run.bench.util.Express2UMLRegistry;
import org.emoflon.ibex.tgg.run.bench.util.InheritanceContainer;
import org.emoflon.ibex.tgg.run.bench.util.UMLHelper;
import org.emoflon.ibex.tgg.run.express2uml.INTEGRATE_App;

import Express2UML.Entity2Clazz;
import Express2UML.Entity2Clazz__Marker;
import Express2UML.Express2UMLFactory;
import Express2UML.Function2SingleMethodClazz;
import Express2UML.Function2SingleMethodClazz__Marker;
import Express2UML.IntegerAttribute2Integer__Marker;
import Express2UML.IntegerTypeAttribute2Integer;
import Express2UML.Schema2Package;
import Express2UML.Schema2Package__Marker;
import Express2UML.SchemaContainer2UMLContainer;
import Express2UML.SchemaContainer2UMLContainer__Marker;
import Express2UML.StringAttribute2String__Marker;
import Express2UML.StringTypeAttribute2String;
import Express2UML.SubEntity2SubClazz__Marker;
import Express2UML.integrate.bench.benchFirst.BenchFirstConflictResolver;
import ExpressModel.Entity;
import ExpressModel.ExpressModelFactory;
import ExpressModel.Function;
import ExpressModel.IntegerAttribute;
import ExpressModel.Schema;
import ExpressModel.SchemaContainer;
import ExpressModel.StringAttribute;
import uml.Clazz;
import uml.Integer;
import uml.Method;
import uml.Package;
import uml.UMLContainer;
import uml.UmlFactory;

public class IntegrationBench {

	private final ExpressModelFactory eFactory = ExpressModelFactory.eINSTANCE;
	private final UmlFactory uFactory = UmlFactory.eINSTANCE;
	private final Express2UMLFactory corrFactory = Express2UMLFactory.eINSTANCE;

	private String workspacePath = "";
	private ResourceSet rs = createResourceSet();
	private URI base = URI.createPlatformResourceURI("/", true);

	private Resource source;
	private Resource target;
	private Resource corr;
	private Resource protocol;

	private int numSchemasAndPackages;
	private int numEntitiesAndClazzesPerSchemaPackageCorr;
	private int numIntegerAttributesPerClazzEntityCorr;
	private int numStringAttributesPerClazzEntityCorr;
	private int numFunctionsAndSingleClazzMethodsPerSchemaPackageCorr;
	private int numEnumerationTypesAndEnumerationsPerSchemaPackageCorr;
	private int inheritanceScale;

	private SchemaContainer schemaContainer;
	private UMLContainer umlContainer;
	private List<EObject> markers;
	private List<EObject> correspondences;
	private Express2UMLRegistry registry = new Express2UMLRegistry();

	private int elementCounter;
	private int conflictCounter;
	private int conflictSolvedDeletePreserveConflictsCounter;
	private int numOfConflicts;
	private int numConflictsResolved;
	private boolean horizontal;
	private long integrateTime;

	private final List<IntegrationFragment> patternFragments = Arrays.asList( //
			RESOLVE_CONFLICTS, //
			TRANSLATE, //
			RESOLVE_BROKEN_MATCHES, //
			CLEAN_UP //
	);

	private final IntegrationPattern pattern = new IntegrationPattern(patternFragments);

	private ConflictResolver cr = new BenchFirstConflictResolver();
	
	private void initScale(int scalingFactor, int numConflicts) {
		if (horizontal) {
			numSchemasAndPackages = scalingFactor;
			numEntitiesAndClazzesPerSchemaPackageCorr = 3;
			inheritanceScale = 0;
		} else {
			numSchemasAndPackages = 1;
			numEntitiesAndClazzesPerSchemaPackageCorr = 1;
			inheritanceScale = scalingFactor;
		}
		numIntegerAttributesPerClazzEntityCorr = 3;
		numStringAttributesPerClazzEntityCorr = 3;
		numOfConflicts = numConflicts;
	}

	public void generate(String name, int scalingFactor, int numConflicts, boolean horizontal) {
		this.registry = new Express2UMLRegistry();
		this.markers = new LinkedList<EObject>();
		this.correspondences = new LinkedList<EObject>();
		this.horizontal = horizontal;

		System.out.println("Initializing...");
		try {
			INTEGRATE integrate = new INTEGRATE_App("bench", name);
			integrate.getOptions().integration.conflictSolver(container -> {
				long tic = System.currentTimeMillis();
				conflictCounter++;
				cr.resolveConflict(container);
				long toc = System.currentTimeMillis();
				integrateTime += toc - tic;
				numConflictsResolved += container.getConflicts().stream().filter(Conflict::isResolved).count();
			});
			integrate.getOptions().integration.pattern(pattern);

			initializeResource(integrate);
			initScale(scalingFactor, numConflicts);
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
			integrate.applyDelta(this::applyDelta);

			tic = System.currentTimeMillis();
			System.out.println("Propagating...");
			integrate.integrate();
			toc = System.currentTimeMillis();
			System.out.println("	Completed in: " + (toc - tic) + " ms");
			System.out.println("    Time spent in ConflictResolver: " + integrateTime + " ms");
			System.out.println("No conflicts: " + integrate.getConflicts().isEmpty());
			System.out.println("Conflicts detected: " + conflictCounter);
			System.out.println("Conflicts resolved: " + numConflictsResolved);
			System.out.println("DelPres_Conf: " + conflictSolvedDeletePreserveConflictsCounter);
			integrate.saveModels();
			integrate.terminate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BenchEntry bench(String name, int scalingFactor, int numConflicts, boolean horizontal) {
		try {
			this.horizontal = horizontal;
			this.registry = new Express2UMLRegistry();
			this.markers = new LinkedList<EObject>();
			this.correspondences = new LinkedList<EObject>();

			INTEGRATE integrate = new INTEGRATE_App("bench", name);
			integrate.getOptions().integration.conflictSolver(container -> {
				long tic = System.currentTimeMillis();
				conflictCounter++;
				cr.resolveConflict(container);
				long toc = System.currentTimeMillis();
				integrateTime += toc - tic;
			});
			integrate.getOptions().integration.pattern(pattern);

			initializeResource(integrate);
			initScale(scalingFactor, numConflicts);
			clearAll();

			generateModels();

			long tic = System.currentTimeMillis();
			integrate.run();
			long toc = System.currentTimeMillis();
			double init = (double) (toc - tic) / 1000;

			BiConsumer<EObject, EObject> delta = this::applyDelta;
			integrate.applyDelta(delta);

			tic = System.currentTimeMillis();
			integrate.integrate();
			toc = System.currentTimeMillis();
			double resolve = (double) (toc - tic) / 1000;
			Runtime.getRuntime().gc();
			int ram = (int) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024));
			integrate.terminate();
			
			return new BenchEntry(scalingFactor, numConflicts, elementCounter, init, resolve, ((double) integrateTime) / 1000, ram);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void applyDelta(EObject source, EObject target) {
		SchemaContainer schemaContainer = (SchemaContainer) source;
		if (!horizontal) {
			createDeletePreserveConflict(schemaContainer.getSchemas().get(0));
			return;
		}

		for (int i = 0; i < numOfConflicts; i++) {
			Schema schema = schemaContainer.getSchemas().get(0);
			createDeletePreserveConflict(schema);
		}
	}

	private void createDeletePreserveConflict(Schema schema) {
		Package pkg = registry.getPackage(schema.getName());
		pkg.getClazzes().add(UMLHelper.createClazz(pkg, "CONFLICT_" + pkg.getName()));
		EcoreUtil.delete(schema, true);
	}

	private void generateModels() {
		schemaContainer = eFactory.createSchemaContainer();
		source.getContents().add(schemaContainer);
		umlContainer = uFactory.createUMLContainer();
		target.getContents().add(umlContainer);
		elementCounter += 2;

		SchemaContainer2UMLContainer sc2uc = corrFactory.createSchemaContainer2UMLContainer();
		sc2uc.setSource(schemaContainer);
		sc2uc.setTarget(umlContainer);
		this.correspondences.add(sc2uc);

		SchemaContainer2UMLContainer__Marker marker = corrFactory.createSchemaContainer2UMLContainer__Marker();
		marker.setCREATE__SRC__sc(schemaContainer);
		marker.setCREATE__CORR__sc2uc(sc2uc);
		marker.setCREATE__TRG__c(umlContainer);
		this.markers.add(marker);

		for (int index = 0; index < numSchemasAndPackages; index++) {
			createSchemaAndPackage(schemaContainer, umlContainer, sc2uc, "Schema_" + index);
		}

		this.source.getContents().add(schemaContainer);
		this.target.getContents().add(umlContainer);
		this.corr.getContents().addAll(correspondences);
		this.protocol.getContents().addAll(markers);
	}

	private void createSchemaAndPackage(SchemaContainer schemaContainer, UMLContainer umlContainer,
			SchemaContainer2UMLContainer sc2uc, String name) {
		Schema schema = eFactory.createSchema();
		schema.setName(name);
		schemaContainer.getSchemas().add(schema);

		uml.Package pkg = uFactory.createPackage();
		pkg.setName(name);
		pkg.setContainer(umlContainer);
		umlContainer.getPackages().add(pkg);

		elementCounter += 2;

		Schema2Package s2p = corrFactory.createSchema2Package();
		s2p.setSource(schema);
		s2p.setTarget(pkg);
		this.correspondences.add(s2p);

		Schema2Package__Marker marker = corrFactory.createSchema2Package__Marker();
		marker.setCONTEXT__SRC__sc(schemaContainer);
		marker.setCONTEXT__TRG__uc(umlContainer);
		marker.setCONTEXT__CORR__sc2uc(sc2uc);
		marker.setCREATE__SRC__s(schema);
		marker.setCREATE__TRG__p(pkg);
		marker.setCREATE__CORR__s2p(s2p);
		this.markers.add(marker);

		registry.addSchema(schema);
		registry.addPackage(pkg);

		for (int index = 0; index < numEntitiesAndClazzesPerSchemaPackageCorr; index++) {
			InheritanceContainer container = createEntityAndClazz(schema, pkg, s2p, "Entity_" + index, null);
			for(int inheritanceIndex = 0; inheritanceIndex < inheritanceScale; ++inheritanceIndex) {
				container = createEntityAndClazz(schema, pkg, s2p, "Entity_sub" + inheritanceIndex, container);
			}
		}

		for (int index = 0; index < numFunctionsAndSingleClazzMethodsPerSchemaPackageCorr; index++) {
			createFunctionAndSingleMethodClazz(schema, pkg, s2p, "Function_" + index);
		}
	}

	private InheritanceContainer createEntityAndClazz(Schema schema, uml.Package pkg, Schema2Package s2p, String name, InheritanceContainer container) {
		Entity entity = eFactory.createEntity();
		entity.setName(name);
		schema.getDeclarations().add(entity);

		Clazz clazz = uFactory.createClazz();
		clazz.setName(name);
		clazz.setPkg(pkg);
		pkg.getClazzes().add(clazz);

		elementCounter += 2;

		Entity2Clazz e2c = corrFactory.createEntity2Clazz();
		e2c.setSource(entity);
		e2c.setTarget(clazz);
		this.correspondences.add(e2c);

		registry.addEntity(entity);
		registry.addClazz(clazz);
		
		if(container != null) {
			Entity parentEntity = container.getEntity();
			parentEntity.setSubType(entity);
			entity.setSuperType(parentEntity);

			Clazz parentClazz = container.getClazz();
			parentClazz.getSubClazzes().add(clazz);
			clazz.setSuperClazz(parentClazz);

			SubEntity2SubClazz__Marker marker = corrFactory.createSubEntity2SubClazz__Marker();
			marker.setCONTEXT__CORR__s2p(s2p);
			marker.setCONTEXT__SRC__s(schema);
			marker.setCONTEXT__TRG__p(pkg);
			marker.setCONTEXT__CORR__e2c(container.getCorrespondence());
			marker.setCONTEXT__SRC__e(parentEntity);
			marker.setCONTEXT__TRG__c(parentClazz);
			marker.setCREATE__CORR__se2sc(e2c);
			marker.setCREATE__SRC__se(entity);
			marker.setCREATE__TRG__sc(clazz);
			this.markers.add(marker);
		} else {
			Entity2Clazz__Marker marker = corrFactory.createEntity2Clazz__Marker();
			marker.setCONTEXT__CORR__s2p(s2p);
			marker.setCONTEXT__SRC__s(schema);
			marker.setCONTEXT__TRG__p(pkg);
			marker.setCREATE__CORR__e2c(e2c);
			marker.setCREATE__SRC__e(entity);
			marker.setCREATE__TRG__c(clazz);
			this.markers.add(marker);
		}

		for (int index = 0; index < numIntegerAttributesPerClazzEntityCorr; index++) {
			createIntegerAttribute(entity, clazz, e2c, "integerAttribute_" + index);
		}

		for (int index = 0; index < numStringAttributesPerClazzEntityCorr; index++) {
			createStringAttribute(entity, clazz, e2c, "stringAttribute_" + index);
		}
		
		return new InheritanceContainer(entity, clazz, e2c);
	}

	private void createIntegerAttribute(Entity entity, Clazz clazz, Entity2Clazz e2c, String name) {
		IntegerAttribute integerAttribute = eFactory.createIntegerAttribute();
		integerAttribute.setName(name);
		entity.getAttributes().add(integerAttribute);

		Integer integer = uFactory.createInteger();
		integer.setName(name);
		clazz.getAttributes().add(integer);

		elementCounter += 2;

		IntegerTypeAttribute2Integer ia2i = corrFactory.createIntegerTypeAttribute2Integer();
		ia2i.setSource(integerAttribute);
		ia2i.setTarget(integer);
		this.correspondences.add(ia2i);

		IntegerAttribute2Integer__Marker marker = corrFactory.createIntegerAttribute2Integer__Marker();
		marker.setCONTEXT__CORR__e2c(e2c);
		marker.setCONTEXT__SRC__e(entity);
		marker.setCONTEXT__TRG__c(clazz);
		marker.setCREATE__CORR__it2i(ia2i);
		marker.setCREATE__SRC__ia(integerAttribute);
		marker.setCREATE__TRG__i(integer);
		this.markers.add(marker);
	}

	private void createStringAttribute(Entity entity, Clazz clazz, Entity2Clazz e2c, String name) {
		StringAttribute stringAttribute = eFactory.createStringAttribute();
		stringAttribute.setName(name);
		entity.getAttributes().add(stringAttribute);

		uml.String string = uFactory.createString();
		string.setName(name);
		clazz.getAttributes().add(string);

		elementCounter += 2;

		StringTypeAttribute2String sa2s = corrFactory.createStringTypeAttribute2String();
		sa2s.setSource(stringAttribute);
		sa2s.setTarget(string);
		this.correspondences.add(sa2s);

		StringAttribute2String__Marker marker = corrFactory.createStringAttribute2String__Marker();
		marker.setCONTEXT__CORR__e2c(e2c);
		marker.setCONTEXT__SRC__e(entity);
		marker.setCONTEXT__TRG__c(clazz);
		marker.setCREATE__CORR__st2s(sa2s);
		marker.setCREATE__SRC__sa(stringAttribute);
		marker.setCREATE__TRG__s(string);
		this.markers.add(marker);
	}

	private void createFunctionAndSingleMethodClazz(Schema schema, uml.Package pkg, Schema2Package s2p, String name) {
		Function function = eFactory.createFunction();
		function.setName(name);
		schema.getDeclarations().add(function);

		Clazz clazz = uFactory.createClazz();
		clazz.setName(name);
		Method method = uFactory.createMethod();
		method.setName("apply");
		method.setStatic_(true);
		clazz.getMethods().add(method);
		pkg.getClazzes().add(clazz);

		elementCounter += 3;

		Function2SingleMethodClazz f2smc = corrFactory.createFunction2SingleMethodClazz();
		f2smc.setSource(function);
		f2smc.setTarget(clazz);
		this.correspondences.add(f2smc);

		Function2SingleMethodClazz__Marker marker = corrFactory.createFunction2SingleMethodClazz__Marker();
		marker.setCONTEXT__CORR__s2p(s2p);
		marker.setCONTEXT__SRC__s(schema);
		marker.setCONTEXT__TRG__p(pkg);
		marker.setCREATE__CORR__f2smc(f2smc);
		marker.setCREATE__SRC__f(function);
		marker.setCREATE__TRG__c(clazz);
		marker.setCREATE__TRG__m(method);
		this.markers.add(marker);
	}

	private void clearAll() {

	}

	private void initializeResource(INTEGRATE integrate) {
		source = integrate.getOptions().resourceHandler().getSourceResource();
		target = integrate.getOptions().resourceHandler().getTargetResource();
		corr = integrate.getOptions().resourceHandler().getCorrResource();
		protocol = integrate.getOptions().resourceHandler().getProtocolResource();
	}

	private ResourceSet createResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		try {
			rs.getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true),
					URI.createFileURI(new File(workspacePath).getCanonicalPath() + File.separator));
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
