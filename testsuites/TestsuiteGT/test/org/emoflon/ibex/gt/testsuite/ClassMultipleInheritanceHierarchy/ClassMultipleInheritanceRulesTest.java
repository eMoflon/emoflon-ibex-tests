package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import ClassMultipleInheritanceHierarchyGraphTransformation.api.ClassMultipleInheritanceHierarchyGraphTransformationAPI;
import ClassMultipleInheritanceHierarchyGraphTransformation.api.rules.FindClassInPackagePattern;
import classMultipleInheritanceHierarchy.ClassPackage;
import classMultipleInheritanceHierarchy.Clazz;

/**
 * Tests for creation rules with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class ClassMultipleInheritanceRulesTest extends ClassMultipleInheritanceHierarchyAbstractTest {

	@Test
	public void createPackage() {
		ResourceSet model = this.initResourceSet("ModifiedDiagram1.xmi", "ClassDiagram1.xmi");
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.initAPI(model);

		ClassPackage p = assertApplicable(api.createPackage("SecondPackage").apply()).getPackage();
		assertMatchCount(2, api.findPackage());

		FindClassInPackagePattern findPackages = api.findClassInPackage().bindPackage(p);

		assertMatchCount(0, findPackages);
		Clazz a = assertApplicable(api.createClass("SecondA").bindPackage(p).apply()).getClazz();
		assertMatchCount(1, findPackages);

		Clazz b = assertApplicable(api.createClassAsSubClass("SecondB") //
				.bindPackage(p).bindSuperClass(a).apply()).getClazz();
		assertMatchCount(2, findPackages);
		assertTrue(b.getSuperClass().contains(a));

		saveResourceSet(model);
	}

	@Test
	public void addSuperClass() {
		ResourceSet model = this.initResourceSet("ModifiedDiagram2.xmi", "ClassDiagram1.xmi");
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.initAPI(model);

		Clazz a = assertAnyMatchExists(api.findClassByName("TestA")).getClazz();
		Clazz c = assertAnyMatchExists(api.findClassByName("TestC")).getClazz();

		assertApplicable(api.addSuperClass().bindClazz(c).bindSuperClass(a).apply());
		assertMatchCount(3, api.findSubClass().bindClazz(a));

		saveResourceSet(model);
	}

	@Test
	public void renameClass() {
		ResourceSet model = this.initResourceSet("ModifiedDiagram3.xmi", "ClassDiagram1.xmi");
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.initAPI(model);

		assertApplicable(api.renameClass("TestA", "TestNew").apply());
		assertNoMatch(api.findClassByName("TestA"));
		assertMatchCount(1, api.findClassByName("TestNew"));

		saveResourceSet(model);
	}

	@Test
	public void deletePackage() {
		ResourceSet model = this.initResourceSet("ModifiedDiagram4.xmi", "ClassDiagram1.xmi");
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findPackage());
		assertNotApplicable(api.deletePackage().apply());
		assertMatchCount(1, api.findPackage());
		assertApplicable(api.deletePackageByName("TestPackage").apply());
		assertMatchCount(0, api.findPackage());

		saveResourceSet(model);
	}
}
