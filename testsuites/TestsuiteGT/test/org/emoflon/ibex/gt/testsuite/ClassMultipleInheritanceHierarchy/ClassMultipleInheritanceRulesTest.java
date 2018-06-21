package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import static org.junit.Assert.assertTrue;

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
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.init("ModifiedDiagram1.xmi",
				"ClassDiagram1.xmi");

		ClassPackage p = assertApplicable(api.createPackage("SecondPackage")).getPackage();
		assertMatchCount(2, api.findPackage());

		FindClassInPackagePattern findPackages = api.findClassInPackage().bindPackage(p);

		assertMatchCount(0, findPackages);
		Clazz a = assertApplicable(api.createClass("SecondA").bindPackage(p)).getClazz();
		assertMatchCount(1, findPackages);

		Clazz b = assertApplicable(api.createClassAsSubClass("SecondB") //
				.bindPackage(p).bindSuperClass(a)).getClazz();
		assertMatchCount(2, findPackages);
		assertTrue(b.getSuperClass().contains(a));

		saveAndTerminate(api);
	}

	@Test
	public void addSuperClass() {
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.init("ModifiedDiagram2.xmi",
				"ClassDiagram1.xmi");

		Clazz a = assertAnyMatchExists(api.findClassByName("TestA")).getClazz();
		Clazz c = assertAnyMatchExists(api.findClassByName("TestC")).getClazz();

		assertApplicable(api.addSuperClass().bindClazz(c).bindSuperClass(a));
		assertMatchCount(3, api.findSubClass().bindClazz(a));

		saveAndTerminate(api);
	}

	@Test
	public void renameClass() {
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.init("ModifiedDiagram3.xmi",
				"ClassDiagram1.xmi");

		assertApplicable(api.renameClass("TestA", "TestNew"));
		assertNoMatch(api.findClassByName("TestA"));
		assertMatchCount(1, api.findClassByName("TestNew"));

		saveAndTerminate(api);
	}

	@Test
	public void deletePackage() {
		ClassMultipleInheritanceHierarchyGraphTransformationAPI api = this.init("ModifiedDiagram4.xmi",
				"ClassDiagram1.xmi");

		assertMatchCount(1, api.findPackage());
		assertNotApplicable(api.deletePackage());
		assertMatchCount(1, api.findPackage());
		assertApplicable(api.deletePackageByName("TestPackage"));
		assertMatchCount(0, api.findPackage());

		saveAndTerminate(api);
	}
}
