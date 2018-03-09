package org.emoflon.ibex.gt.testsuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An abstract test case for Graph Transformation.
 *
 * @param <API>
 *            the API to test
 */
public abstract class GTTestCase<API extends GraphTransformationAPI> {
	/**
	 * Relative path to the directory with the projects with the graph
	 * transformation rules.
	 */
	public static String workspacePath = "../../gt-rules/";

	/**
	 * Relative path to the instances directory. Files from this directory are
	 * changed during the transformations.
	 */
	private static String instancesPath = "./instances/";

	/**
	 * Relative path to the resources directory. Files from this directory are just
	 * loaded, but never changed during transformation.
	 */
	private static String resourcePath = "./resources/";

	/**
	 * Returns the name of the test which is used as a name of the subdirectory
	 * within the folders debug, instances and resources.
	 * 
	 * @return the test name
	 */
	protected abstract String getTestName();

	/**
	 * Creates an API instance. This method must be implemented for each API.
	 * 
	 * @return the created API
	 */
	protected abstract API getAPI(final IContextPatternInterpreter engine, final ResourceSet model);

	/**
	 * Defines the meta-model packages as a mapping between their URI and the
	 * EPackage.
	 * 
	 * @return a Map containing the meta-model packages
	 */
	protected abstract Map<String, EPackage> getMetaModelPackages();

	/**
	 * Initializes the API for the tests.
	 * 
	 * @param model
	 *            the model file
	 * @return the created API
	 */
	protected API initAPI(final ResourceSet model) {
		DemoclesGTEngine engine = new DemoclesGTEngine();
		engine.setDebugPath("./debug/" + this.getTestName());
		return this.getAPI(engine, model);
	}

	/**
	 * Initializes the resource set with the given name.
	 * 
	 * The resource is created in the instances directory. The content of the
	 * resource file is copied to the newly created file (optional).
	 * 
	 * @param modelInstanceFileName
	 *            the name of the model file
	 * @param resourceFileName
	 *            the name of the resource file to copy
	 * @return a resource set containing the model file
	 */
	protected ResourceSet initResourceSet(final String modelInstanceFileName, final String resourceFileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		URI instanceURI = URI.createFileURI(instancesPath + this.getTestName() + "/" + modelInstanceFileName);
		ResourceSet resourceSet = new ResourceSetImpl();
		Registry packageRegistry = resourceSet.getPackageRegistry();
		this.getMetaModelPackages().forEach((eNS_URI, eINSTANCE) -> packageRegistry.put(eNS_URI, eINSTANCE));

		Resource instanceResource = resourceSet.createResource(instanceURI);

		// If a file with the given name exists in the resource folder, copy its
		// contents to the instance file.
		if (null != resourceFileName) {
			String path = resourcePath + this.getTestName() + "/" + resourceFileName;
			File file = new File(path);
			if (file.exists()) {
				URI resourceURI = URI.createFileURI(path);
				Resource res = resourceSet.getResource(resourceURI, true);
				instanceResource.getContents().addAll(res.getContents());
				resourceSet.getResources().remove(res);
			}
		}

		// Save the resource.
		try {
			instanceResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resourceSet;
	}

	/**
	 * Initializes the resource set with the given name.
	 * 
	 * The resource is created in the instances directory. If a equally named
	 * resource exists in the resources directory, its content is copied to the new
	 * resource.
	 * 
	 * @param modelInstanceFileName
	 *            the name of the model file
	 * @return a resource set containing the model file
	 */
	protected ResourceSet initResourceSet(final String modelInstanceFileName) {
		return this.initResourceSet(modelInstanceFileName, modelInstanceFileName);
	}

	/**
	 * Saves the resource set.
	 * 
	 * @param resourceSet
	 *            the resource set
	 */
	protected static void saveResourceSet(final ResourceSet resourceSet) {
		resourceSet.getResources().forEach(resource -> {
			if ((!resource.getURI().toString().endsWith("trash.xmi")) || resource.getContents().size() > 0) {
				try {
					resource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Asserts that there are no matches for the rule
	 * 
	 * @param rule
	 *            the rule
	 */
	public static void assertNoMatch(final GraphTransformationRule<?, ?> rule) {
		assertEquals(0, rule.countMatches());
		assertFalse(rule.findAnyMatch().isPresent());
	}

	/**
	 * Asserts that any match for the rule exists and returns the match.
	 * 
	 * @param rule
	 *            the rule
	 * @return the match
	 */
	public static <M extends GraphTransformationMatch<M, R>, R extends GraphTransformationRule<M, R>> M assertAnyMatchExists(
			final R rule) {
		Optional<M> match = (Optional<M>) rule.findAnyMatch();
		assertTrue(match.isPresent());
		return match.get();
	}

	/**
	 * Asserts that the rule has the expected number of matches.
	 * 
	 * @param expectedMatchCount
	 *            the expected number of matches
	 * @param rule
	 *            the rule
	 */
	public static void assertMatchCount(final int expectedMatchCount, final GraphTransformationRule<?, ?> rule) {
		assertEquals(expectedMatchCount, rule.countMatches());
	}

	/**
	 * Asserts that no match exists after rule application.
	 * 
	 * @param applyResult
	 *            the result of the apply call
	 * @return the match
	 */
	public static <M> void assertNotApplicable(final Optional<M> applyResult) {
		Optional<M> match = (Optional<M>) applyResult;
		assertFalse(match.isPresent());
	}

	/**
	 * Asserts that a match exists after rule application and returns the match.
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
}
