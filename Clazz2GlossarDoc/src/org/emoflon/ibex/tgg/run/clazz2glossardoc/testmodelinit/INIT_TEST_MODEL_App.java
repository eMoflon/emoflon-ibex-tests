package org.emoflon.ibex.tgg.run.clazz2glossardoc.testmodelinit;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.clazz2glossardoc.config._DefaultRegistrationHelper;
import org.glossarDoc.core.GlossarDocumentationHelper;
import org.simpleClass.core.SimpleClassInheritanceHelper;

import glossarDocumentation.DocumentationContainer;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.SimpleClassInheritanceFactory;

public class INIT_TEST_MODEL_App extends SYNC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public INIT_TEST_MODEL_App() throws IOException {
		super(registrationHelper.createIbexOptions() //
				.resourceHandler(new TGGResourceHandler() {
					@Override
					public void loadModels() throws IOException {
						source = createResource(options.project.path() + "/instances/src.xmi");
						source.getContents().add(SimpleClassInheritanceFactory.eINSTANCE.createClazzContainer());
						target = createResource(options.project.path() + "/instances/trg.xmi");
						corr = createResource(options.project.path() + "/instances/corr.xmi");
						protocol = createResource(options.project.path() + "/instances/protocol.xmi");
					}
				}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		SimpleClassInheritanceHelper helperClazz;
		GlossarDocumentationHelper helperDoc;

		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		INIT_TEST_MODEL_App sync = new INIT_TEST_MODEL_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for SYNC in: " + (toc - tic) + " ms");

		tic = System.currentTimeMillis();
		sync.forward();
		helperClazz = new SimpleClassInheritanceHelper(
				(ClazzContainer) sync.getResourceHandler().getSourceResource().getContents().get(0));
		helperDoc = new GlossarDocumentationHelper(
				(DocumentationContainer) sync.getResourceHandler().getTargetResource().getContents().get(0));
		helperClazz.createExampleModel();
		sync.forward();
		helperDoc.completeExampleModel();
		sync.backward();
		toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");

		sync.saveModels();
		sync.terminate();
	}
}
