package org.emoflon.ibex.gt.testsuite;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emoflon.ibex.gt.api.IBeXGtAPI;
import org.emoflon.ibex.gt.engine.IBeXGTCoMatch;
import org.emoflon.ibex.gt.engine.IBeXGTCoPattern;
import org.emoflon.ibex.gt.engine.IBeXGTMatch;
import org.emoflon.ibex.gt.engine.IBeXGTPattern;
import org.emoflon.ibex.gt.engine.IBeXGTRule;

import hipe.generic.actor.junction.util.HiPEConfig;

/**
 * An abstract test case for Graph Transformation.
 *
 * @param <API>
 *            the API to test
 */
public abstract class GTAppTestCase<API extends IBeXGtAPI<?,?,?>> {
	/**
	 * Relative path to the instances directory. Files from this directory are
	 * changed during the transformations.
	 */
	protected static String instancesPath = System.getProperty("user.dir") + "/instances/";

	/**
	 * Relative path to the resources directory. Files from this directory are just
	 * loaded, but never changed during transformation.
	 */
	protected static String resourcePath = System.getProperty("user.dir") + "/resources/";

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
	protected abstract API getApi();

	/**
	 * Initializes the resource set with the given name.
	 * 
	 * The resource is loaded from the resources directory.
	 * 
	 * @param app
	 *            the app
	 * @param resourceFileName
	 *            the name of the resource file 
	 */
	protected void loadModel(final API api, final String resourceFileName) {
		// If a file with the given name exists in the resource folder, copy its
		// contents to the instance file.
		String path = resourcePath + this.getTestName() + "/" + resourceFileName;
		File file = new File(path);
		if (file.exists()) {
			URI resourceURI = URI.createFileURI(path);
			try {
				api.addModel(resourceURI);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	/**
	 * Initializes the resource set with the given name.
	 * 
	 * The resource is created in the instances directory.
	 * 
	 * @param app
	 *            the app
	 * @param resourceFileName
	 *            the name of the resource file 
	 */
	protected void createModel(final API api, final String resourceFileName) {
		// If a file with the given name exists in the resource folder, copy its
		// contents to the instance file.
		String path = resourcePath + this.getTestName() + "/" + resourceFileName;
		URI resourceURI = URI.createFileURI(path);
		try {
			api.createModel(resourceURI);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
	protected API initEmpty(final String modelInstanceFileName) {
		API api = this.getApi();
		this.createModel(api, modelInstanceFileName);
		api.initializeEngine();
		return api;
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
	protected API init(final String resourceFileName) {
		API api = this.getApi();
		this.loadModel(api, resourceFileName);
		api.initializeEngine();
		return api;
	}

//	/**
//	 * Initializes an API with the model files on the given path.
//	 * 
//	 * @param defaultResourceIndex
//	 *            the index of the default resource
//	 * @param testName
//	 *            the name of the test
//	 * @param resourcesFileName
//	 *            the names of the resource files to copy
//	 * @return the API
//	 */
//	protected API init(final int defaultResourceIndex, final String testName, final String... resourcesFileName) {
//		API api = this.getApi();
//		for (final String file : resourcesFileName) {
//			this.createModel(api, testName + "-" + file, file);
//		}
//		api.initializeEngine();
//		return api;
//	}

	/**
	 * Saves the model.
	 * 
	 * @param resourceSet
	 *            the resource set
	 */
	protected void saveAndTerminate(final API api) {
//		api.getModel().getResources().forEach(resource -> {
//			if ((!resource.getURI().toString().endsWith("trash.xmi")) || resource.getContents().size() > 0) {
//				try {
//					resource.save(null);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		});
		api.terminate();
	}

	/**
	 * Asserts that there are no matches for the pattern.
	 * 
	 * @param pattern
	 *            the pattern
	 */
	public static void assertNoMatch(final IBeXGTPattern<?, ?> pattern) {
		assertEquals(0, pattern.countMatches(true));
	}

	/**
	 * Asserts that any match for the pattern exists and returns the match.
	 * 
	 * @param pattern
	 *            the pattern
	 * @return the match
	 */
	public static <M extends IBeXGTMatch<M, P>, P extends IBeXGTPattern<P, M>> M assertAnyMatchExists(
			final P pattern) {
		Optional<M> match = (Optional<M>) pattern.findAnyMatch(true);
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
	public static void assertMatchCount(final int expectedMatchCount, final IBeXGTPattern<?, ?> pattern) {
		assertEquals(expectedMatchCount, pattern.countMatches(true));
		
	}

	/**
	 * Asserts that no co-match exists after rule application.
	 * 
	 * @param rule
	 *            the rule
	 */
	public static <R extends IBeXGTRule<R, P, M, CP, CM>, P extends IBeXGTPattern<P, M>, M extends IBeXGTMatch<M, P>, 
	CP extends IBeXGTCoPattern<CP, CM, R, P, M>, CM extends IBeXGTCoMatch<CM, CP, R, P, M>> 
	void assertNotApplicable(final R rule) {
		assertFalse(rule.hasMatches(true));
	}

	/**
	 * Asserts that a match exists before rule application, a co-match after rule
	 * application exists as well and returns the co-match.
	 * 
	 * @param the
	 *            rule
	 * @return the match
	 */
	public static <R extends IBeXGTRule<R, P, M, CP, CM>, P extends IBeXGTPattern<P, M>, M extends IBeXGTMatch<M, P>, 
	CP extends IBeXGTCoPattern<CP, CM, R, P, M>, CM extends IBeXGTCoMatch<CM, CP, R, P, M>> CM assertApplicableAndApply(
			final R rule) {
		assertTrue(rule.isApplicable(true));
		return rule.applyAny();
	}
}
