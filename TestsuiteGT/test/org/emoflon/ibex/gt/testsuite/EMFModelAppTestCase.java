package org.emoflon.ibex.gt.testsuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;
import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;
import org.emoflon.ibex.gt.testsuite.EmfAdapterTest.EMFTestContentAdapter;
import org.emoflon.ibex.gt.viatra.runtime.ViatraGTEngine;

import persistence.XtendXMIResourceFactoryImpl;

/**
 * An abstract test case for Model Generation
 *
 */
public abstract class EMFModelAppTestCase {
	/**
	 * Relative path to the directory with the projects with the graph
	 * transformation rules.
	 */
	protected static String workspacePath = "../";

	/**
	 * Relative path to the instances directory. Files from this directory are
	 * changed during the transformations.
	 */
	protected static String instancesPath = "./instances/";

	/**
	 * Relative path to the resources directory. Files from this directory are just
	 * loaded, but never changed during transformation.
	 */
	protected static String resourcePath = "./resources/";

	/**
	 * Returns the name of the test which is used as a name of the subdirectory
	 * within the folders debug, instances and resources.
	 * 
	 * @return the test name
	 */
	protected String getTestName() {
		return "EmfAdapterTest";
	}


	/**
	 * Initializes the engine.
	 * 
	 * @return the engine
	 */
	protected IContextPatternInterpreter initEngine() {
		String patternMatcher;
		IContextPatternInterpreter engine;
		try {
			
			patternMatcher = System.getenv("patternMatcher");
			switch(patternMatcher) {
			case "Democles": 
				engine = new DemoclesGTEngine();
				break;
			case "HiPE": 			
				engine = new HiPEGTEngine();
				break;
			case "Viatra":
				engine = new ViatraGTEngine();
				break;
			default: throw new RuntimeException(patternMatcher + " is not a supported as a pattern matcher!");
			}
		}
		catch (Exception e) {
			System.err.println("Pattern Matcher is not specified. Defaulting to Democles");
			engine = new HiPEGTEngine();
		}
		
		engine.setDebugPath("./debug/" + this.getTestName());
		return engine;
	}

	/**
	 * Initializes the resource set with the given name.
	 * 
	 * The resource is created in the instances directory. The content of the
	 * resource file is copied to the newly created file (optional).
	 * 
	 * @param app
	 *            the app
	 * @param modelInstanceFileName
	 *            the name of the model file
	 * @param resourceFileName
	 *            the name of the resource file to copy
	 * @return a resource set containing the model file
	 */
	protected EMFTestContentAdapter createModel(final GraphTransformationApp<?> app, final String modelInstanceFileName, 
			final String resourceFileName, boolean debug, boolean isSmartEMF, String otherTestName) {
		URI instanceURI = URI.createFileURI(instancesPath + this.getTestName() + "/" + modelInstanceFileName);
		Resource instanceResource = app.createModel(instanceURI);
		
		EMFTestContentAdapter adapter = new EMFTestContentAdapter(app.getModel(), debug, isSmartEMF);
		// If a file with the given name exists in the resource folder, copy its
		// contents to the instance file.
		if (null != resourceFileName) {
			String path = resourcePath + this.getTestName() + "/" + resourceFileName;
			File file = new File(path);
			if (file.exists()) {
				URI resourceURI = URI.createFileURI(path);
				ResourceSetImpl resSet = new ResourceSetImpl();
				Resource res = resSet.getResource(resourceURI, true);
				instanceResource.getContents().addAll(res.getContents());
			}
		}

		// Save the resource.
		try {
			app.saveResourceSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return adapter;
	}
	
	/**
	 * Asserts that the pattern has the expected number of matches.
	 * 
	 * @param expectedMatchCount
	 *            the expected number of matches
	 * @param pattern
	 *            the pattern
	 */
	public static void assertMatchCount(final int expectedMatchCount, final GraphTransformationPattern<?, ?> pattern) {
		assertEquals(expectedMatchCount, pattern.countMatches());
	}
	
	/**
	 * Asserts that there are no matches for the pattern.
	 * 
	 * @param pattern
	 *            the pattern
	 */
	public static void assertNoMatch(final GraphTransformationPattern<?, ?> pattern) {
		assertEquals(0, pattern.countMatches());
		assertFalse(pattern.findAnyMatch().isPresent());
	}
	
}
