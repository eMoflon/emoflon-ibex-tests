package org.emoflon.ibex.gt.testsuite.URIFragment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.smartemf.persistence.SmartEMFResourceFactoryImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import URIFragmentEMF.URIFragmentEMFPackage;
import URIFragmentSmartEMF.URIFragmentSmartEMFPackage;

/**
 * Tests to validate SmartEMF uri fragment generation against EMF
 */
public class URIFragmentTest {

	private static Resource emfModel;
	private static Resource smartEmfModel;

	private static Resource loadModelWithEMF(URI uri) {
		return loadURI(uri, new XMIResourceFactoryImpl(), URIFragmentEMFPackage.eINSTANCE);
	}

	private static Resource loadModelWithSmartEMF(URI uri) {
		return loadURI(uri, new SmartEMFResourceFactoryImpl("../"), URIFragmentSmartEMFPackage.eINSTANCE);
	}

	private static Resource loadURI(URI uri, Resource.Factory resourceFactory, EPackage instance) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", resourceFactory);
		resourceSet.getPackageRegistry().put(URIFragmentEMF.URIFragmentEMFPackage.eNS_URI, instance);
		Resource model = resourceSet.getResource(uri, true);
		if (model == null) {
			throw new IllegalArgumentException("Unable to load model: " + uri);
		}
		return model;
	}

	private static String getName(EObject node) {
		EStructuralFeature nameFeature = node.eClass().getEStructuralFeature("name");
		String name = (String) node.eGet(nameFeature);
		if (name == null || name.isBlank()) {
			throw new IllegalStateException("All nodes need to be named");
		}
		return name;
	}

	private static String[] getPath(EObject node) {
		List<String> path = new ArrayList<>();
		while (node != null) {
			path.add(getName(node));
			node = node.eContainer();
		}
		return path.reversed().toArray(n -> new String[n]);
	}

	@BeforeAll
	public static void loadModels() {
		URI uri = URI.createFileURI("./resources/URIFragment/TestModel-A.xmi");
		emfModel = loadModelWithEMF(uri);
		smartEmfModel = loadModelWithSmartEMF(uri);
	}

	@TestFactory
	@DisplayName("EMF and SmartEMF URI compatible")
	public Stream<DynamicTest> testSmartEMFisCompatibleToEMF() {
		var stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(emfModel.getAllContents(),
				Spliterator.ORDERED | Spliterator.DISTINCT | Spliterator.NONNULL), false);
		return stream.map(eObject -> {
			String emfURIFragment = emfModel.getURIFragment(eObject);
			String[] path = getPath(eObject);
			return DynamicTest.dynamicTest("URI Check for path: " + String.join(", ", path), () -> {
				EObject eSmartObject = smartEmfModel.getEObject(emfURIFragment);
				assertNotNull(eSmartObject, "Fragment URI <" + emfURIFragment + "> returned null");

				String smartEmfURIFragment = smartEmfModel.getURIFragment(eSmartObject);
				assertEquals(emfURIFragment, smartEmfURIFragment, "Fragment URIs are not equal");

				// equals check not possible, because each object is from a different package
				// (emf / smartemf)
				String[] smartPath = getPath(eSmartObject);
				assertEquals(String.join(", ", path), String.join(", ", smartPath),
						"The path should be the same if it's the same node.");
			});
		});
	}

	@TestFactory
	@DisplayName("SmartObject to URI to same SmartObject")
	public Stream<DynamicTest> testSmartObjectToUriToSmartObject() {
		var resource = smartEmfModel;
		var stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(resource.getAllContents(),
				Spliterator.ORDERED | Spliterator.DISTINCT | Spliterator.NONNULL), false);
		return stream.map(eObject -> {
			return DynamicTest.dynamicTest("Node: " + getName(eObject), () -> {
				String fragmentURI = resource.getURIFragment(eObject);
				assertNotNull(fragmentURI, "Fragment URI was null");

				EObject found = resource.getEObject(fragmentURI);
				assertNotNull(found, "Fragment URI <" + fragmentURI + "> returned null");

				assertEquals(eObject, found, "Fragment URI <" + fragmentURI + "> did not return same object");
			});
		});
	}

}
