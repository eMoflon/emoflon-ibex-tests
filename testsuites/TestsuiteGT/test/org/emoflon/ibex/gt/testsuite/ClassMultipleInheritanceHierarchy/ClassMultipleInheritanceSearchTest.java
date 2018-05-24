package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import ClassMultipleInheritanceHierarchyGraphTransformation.api.ClassMultipleInheritanceHierarchyGraphTransformationAPI;
import classMultipleInheritanceHierarchy.Clazz;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class ClassMultipleInheritanceSearchTest extends ClassMultipleInheritanceHierarchyAbstractTest {

	@Test
	public void findPackageAndClasses() {
		ResourceSet model = this.initResourceSet("ClassDiagram1.xmi");
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findPackage());
		assertMatchCount(6, api.findClass());
	}

	@Test
	public void findSubClasses() {
		ResourceSet model = this.initResourceSet("ClassDiagram1.xmi");
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.initAPI(model);

		Clazz testA = assertAnyMatchExists(api.findClassByName("TestA")).getClazz();
		assertMatchCount(0, api.findSuperClass().bindClazz(testA));
		assertMatchCount(2, api.findSubClass().bindClazz(testA));

		Clazz subAB = assertAnyMatchExists(api.findClassByQualifiedName("TestPackage", "SubAB")).getClazz();
		assertMatchCount(2, api.findSuperClass().bindClazz(subAB));
		assertMatchCount(0, api.findSubClass().bindClazz(subAB));
	}

	@Test
	public void notifyIfTwoClassesOfTheSameName() {
		ResourceSet model = this.initResourceSet("Constraints1.xmi", "ClassDiagram1.xmi");
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.initAPI(model);

		Set<Clazz> classes = new HashSet<Clazz>();
		api.findTwoClassesOfSameName().subscribeAppearing(m -> {
			classes.add(m.getClazz1());
			classes.add(m.getClazz2());
		});

		assertApplicable(api.createClass("TestA").apply());
		assertEquals(2, classes.size());

		saveResourceSet(model);
	}
}
