package org.emoflon.ibex.gt.testsuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;
import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;
import org.emoflon.ibex.gt.viatra.runtime.ViatraGTEngine;

/**
 * An abstract test case for Graph Transformation.
 *
 * @param <API>
 *            the API to test
 */
public abstract class GTAppTestCase<App extends GraphTransformationApp<API>, API extends GraphTransformationAPI> {
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
	protected abstract String getTestName();

	/**
	 * Returns a GT application instance.
	 * 
	 * @return the application.
	 */
	protected abstract App getApp();

	/**
	 * Initializes the engine.
	 * 
	 * @return the engine
	 */
	protected IContextPatternInterpreter initEngine() {
//		HiPEGTEngine engine = new HiPEGTEngine();
//		DemoclesGTEngine engine = new DemoclesGTEngine();
		ViatraGTEngine engine = new ViatraGTEngine();
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
	protected void createModel(final App app, final String modelInstanceFileName, final String resourceFileName) {
		URI instanceURI = URI.createFileURI(instancesPath + this.getTestName() + "/" + modelInstanceFileName);
		Resource instanceResource = app.createModel(instanceURI);

		// If a file with the given name exists in the resource folder, copy its
		// contents to the instance file.
		if (null != resourceFileName) {
			String path = resourcePath + this.getTestName() + "/" + resourceFileName;
			File file = new File(path);
			if (file.exists()) {
				URI resourceURI = URI.createFileURI(path);
				Resource res = new ResourceSetImpl().getResource(resourceURI, true);
				instanceResource.getContents().addAll(res.getContents());
			}
		}

		// Save the resource.
		try {
			app.saveResourceSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initializes an API with the model on the given path.
	 * 
	 * @param modelInstanceFileName
	 *            the name of the model file
	 * @return the API
	 */
	protected API init(final String modelInstanceFileName) {
		App app = this.getApp();
		this.createModel(app, modelInstanceFileName, modelInstanceFileName);
		return app.initAPI();
	}

	/**
	 * Initializes an API with the model on the given path.
	 * 
	 * @param modelInstanceFileName
	 *            the name of the model file
	 * @param resourceFileName
	 *            the name of the resource file to copy
	 * @return the API
	 */
	protected API init(final String modelInstanceFileName, final String resourceFileName) {
		App app = this.getApp();
		this.createModel(app, modelInstanceFileName, resourceFileName);
		return app.initAPI();
	}

	/**
	 * Initializes an API with the model files on the given path.
	 * 
	 * @param defaultResourceIndex
	 *            the index of the default resource
	 * @param testName
	 *            the name of the test
	 * @param resourcesFileName
	 *            the names of the resource files to copy
	 * @return the API
	 */
	protected API init(final int defaultResourceIndex, final String testName, final String... resourcesFileName) {
		App app = this.getApp();
		for (final String file : resourcesFileName) {
			this.createModel(app, testName + "-" + file, file);
		}
		app.setDefaultResource(app.getModel().getResources().get(defaultResourceIndex));
		return app.initAPI();
	}

	/**
	 * Saves the model.
	 * 
	 * @param resourceSet
	 *            the resource set
	 */
	protected void saveAndTerminate(final API api) {
		api.getModel().getResources().forEach(resource -> {
			if ((!resource.getURI().toString().endsWith("trash.xmi")) || resource.getContents().size() > 0) {
				try {
					resource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		api.terminate();
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

	/**
	 * Asserts that any match for the pattern exists and returns the match.
	 * 
	 * @param pattern
	 *            the pattern
	 * @return the match
	 */
	public static <M extends GraphTransformationMatch<M, P>, P extends GraphTransformationPattern<M, P>> M assertAnyMatchExists(
			final P pattern) {
		Optional<M> match = (Optional<M>) pattern.findAnyMatch();
		assertTrue(match.isPresent());
		assertEquals(pattern, match.get().getPattern());
		return match.get();
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
	 * Asserts that no co-match exists after rule application.
	 * 
	 * @param rule
	 *            the rule
	 */
	public static <M extends GraphTransformationMatch<M, R>, R extends GraphTransformationRule<M, R>> void assertNotApplicable(
			final R rule) {
		assertFalse(rule.apply().isPresent());
	}

	/**
	 * Asserts that a co-match exists after rule application and returns the
	 * co-match.
	 * 
	 * @param applyResult
	 *            the result of the apply call
	 * @return the match
	 */
	public static <M> M assertApplicable(final Optional<M> applyResult) {
		Optional<M> match = (Optional<M>) applyResult;
		assertTrue(match.isPresent());
		return match.get();
	}

	/**
	 * Asserts that a match exists before rule application, a co-match after rule
	 * application exists as well and returns the co-match.
	 * 
	 * @param the
	 *            rule
	 * @return the match
	 */
	public static <M extends GraphTransformationMatch<M, R>, R extends GraphTransformationRule<M, R>> M assertApplicable(
			final R rule) {
		assertTrue(rule.isApplicable());
		return assertApplicable(rule.apply());
	}
}
