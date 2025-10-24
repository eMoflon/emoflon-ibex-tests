package org.emoflon.ibex.gt.testsuite.URIFragment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.smartemf.persistence.SmartEMFResource;
import org.emoflon.smartemf.persistence.SmartEMFResourceFactoryImpl;
import org.emoflon.smartemf.runtime.SmartObject;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestMethodOrder;

import URIFragmentEMF.URIFragmentEMFPackage;
import URIFragmentSmartEMF.URIFragmentSmartEMFPackage;

/**
 * Tests to validate SmartEMF uri fragment generation against EMF
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class URIFragmentTest {

	private static final URI resourceFolder = URI.createFileURI("./resources/URIFragment/");
	private static final URI emfModelURI = resourceFolder.appendSegment("TestModel-EMF.xmi");
	private static final URI smartEMFModelURI = resourceFolder.appendSegment("TestModel-SmartEMF.xmi");

	private static Resource emfModel;
	private static Resource smartEmfModel;

	private static Resource loadModelWithEMF(URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(URIFragmentEMFPackage.eNS_URI, URIFragmentEMFPackage.eINSTANCE);

		Resource model = resourceSet.getResource(uri, true);
		if (model == null)
			throw new IllegalArgumentException("Unable to load model: " + uri);

		// 'ensure' model is EMF
		assertInstanceOf(ResourceImpl.class, model);
		model.getAllContents().forEachRemaining(eObject -> {
			assertInstanceOf(MinimalEObjectImpl.class, eObject, "Path <" + getPath(eObject) + ">");
		});

		return model;
	}

	private static Resource loadModelWithSmartEMF(URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
				new SmartEMFResourceFactoryImpl("../"));
		// This line does in fact nothing, a SmartEMFResource ignores its ResourceSet
		// registry and only uses the global registry
		// org.emoflon.smartemf.persistence.XmiParserUtil
		resourceSet.getPackageRegistry().put(URIFragmentSmartEMFPackage.eNS_URI, URIFragmentSmartEMFPackage.eINSTANCE);

		Resource model = resourceSet.getResource(uri, true);
		if (model == null)
			throw new IllegalArgumentException("Unable to load model: " + uri);

		// 'ensure' model is SmartEMF
		assertInstanceOf(SmartEMFResource.class, model);
		model.getAllContents().forEachRemaining(eObject -> {
			assertInstanceOf(SmartObject.class, eObject, "Path <" + getPath(eObject) + ">");
		});

		return model;
	}

	private static Stream<EObject> toStream(Iterable<EObject> iterable) {
		return toStream(iterable.iterator());
	}

	private static Stream<EObject> toStream(Iterator<EObject> iterator) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator,
				Spliterator.ORDERED | Spliterator.DISTINCT | Spliterator.NONNULL), false);
	}

	private static String getName(EObject node) {
		EStructuralFeature nameFeature = node.eClass().getEStructuralFeature("name");
		String name = (String) node.eGet(nameFeature);
		if (name == null || name.isBlank())
			throw new IllegalStateException("All nodes need to be named");
		return name;
	}

	private static String getPath(EObject node) {
		List<String> path = new ArrayList<>();
		while (node != null) {
			path.add(getName(node));
			node = node.eContainer();
		}

		return String.join(", ", path.reversed());
	}

	private static boolean isID(EObject eObject, String fragmentURI) {
		String id = EcoreUtil.getID(eObject);
		return id != null && id.equals(fragmentURI);
	}

	@BeforeAll
	public static void loadModels() {
		emfModel = loadModelWithEMF(emfModelURI);
		smartEmfModel = loadModelWithSmartEMF(smartEMFModelURI);
	}

	@TestFactory
	@DisplayName("Valid relative uri fragment path (EcoreUtil)")
	@Order(1)
	public Stream<DynamicTest> testEcoreUtilGeneratesValidrelativeURIfragments() {
		var resource = smartEmfModel;

		return toStream(resource.getContents()) //
				.map(root -> {
					return toStream(root.eAllContents()) //
							// Unlike EMF, SmartEMF eAllContents contains the root element (why?)
							// The relative path from an element to itself is empty, and empty paths are not
							// supported by getEObject, thus we filter the root element out.
							.filter(eObject -> eObject != root) //
							.map(eObject -> {
								return DynamicTest.dynamicTest("Path <" + getPath(eObject) + ">", () -> {
									String uriFragment = EcoreUtil.getRelativeURIFragmentPath(root, eObject);
									assertNotNull(uriFragment, "URI fragment was null");
									EObject found = EcoreUtil.getEObject(root, uriFragment);
									assertNotNull(found, "No object found with URI fragment <" + uriFragment + ">");
									assertEquals(eObject, found,
											"URI fragment <" + uriFragment + "> did not lead to the same object");
								});
							});
				}).flatMap(s -> s);
	}

	@TestFactory
	@DisplayName("Valid uri fragment (Resource)")
	@Order(2)
	public Stream<DynamicTest> testResourceGeneratesValidURIfragments() {
		var resource = smartEmfModel;

		return toStream(resource.getAllContents()).map(eObject -> {
			return DynamicTest.dynamicTest("Path <" + getPath(eObject) + ">", () -> {
				// This may return either a relative URI fragment or an ID.
				String uriFragment = resource.getURIFragment(eObject);
				assertNotNull(uriFragment, "URI fragment was null");
				boolean isFragmentID = isID(eObject, uriFragment);
				Assumptions.assumeFalse(isFragmentID,"Test skipped - SmartEMF does not fully support ID lookups");

				// Doesn't work for SmartEMF if URI fragment == ID
				// Something something child elements are not iterated
				// org.emoflon.smartemf.persistence.UnlockedResourceImpl.getAllProperContents(List<EObject>)
				EObject found = resource.getEObject(uriFragment);
				assertNotNull(found,
						"No object found with " + (isFragmentID ? "ID" : "URI fragment") + " <" + uriFragment + ">");

				assertEquals(eObject, found, (isFragmentID ? "ID" : "URI fragment") + " <" + uriFragment
						+ "> did not lead to the same object");
			});
		});
	}

	@TestFactory
	@DisplayName("EMF and SmartEMF URI fragments compatible")
	@Order(3)
	public Stream<DynamicTest> testSmartEMFisCompatibleToEMF() {
		return toStream(emfModel.getAllContents()).map(eObject -> {
			String uriFragmentEMF = emfModel.getURIFragment(eObject);
			boolean isFragmentID = isID(eObject, uriFragmentEMF);

			String path = getPath(eObject);
			return DynamicTest.dynamicTest("Path <" + path + ">", () -> {
				Assumptions.assumeFalse(isFragmentID,"Test skipped - SmartEMF does not fully support ID lookups");
				
				EObject eSmartObject = smartEmfModel.getEObject(uriFragmentEMF);
				assertNotNull(eSmartObject, "No object found with " + (isFragmentID ? "ID" : "URI fragment") + " <"
						+ uriFragmentEMF + "> in SmartEMF model");

				// SmartEMF should create the same URI fragments as EMF
				String uriFragmentSmartEMF = smartEmfModel.getURIFragment(eSmartObject);
				assertEquals(uriFragmentEMF, uriFragmentSmartEMF, "EMF and SmartEMF URI fragments do not match");

				// equals check not possible, because each eObject is from a different package
				// (emf / smartemf)
				String smartPath = getPath(eSmartObject);
				assertEquals(path, smartPath, "The URI fragment returns a different eObject for SmartEMF than for EMF");
			});
		});
	}

}
