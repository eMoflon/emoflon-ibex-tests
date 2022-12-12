package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classMultipleInheritanceHierarchy.ClassPackage;
import classMultipleInheritanceHierarchy.Clazz;
import classmultipleinheritance.gt.api.GtGtApi;
import classmultipleinheritance.gt.api.pattern.FindClassInPackagePattern;

/**
 * Tests for creation rules with the ClassMultipleInheritanceHierarchy Graph
 * Transformation Api.
 */
public class ClassMultipleInheritanceRulesTest extends ClassMultipleInheritanceHierarchyAbstractTest {

	@Test
	public void createPackage() {
		GtGtApi<?> api = this.init("ClassDiagram1.xmi");

		api.createPackage().setParameters("SecondPackage");
		api.updateMatches();
		ClassPackage p = assertApplicableAndApply(api.createPackage()).pkg();
		assertMatchCount(2, api.findPackage());

		FindClassInPackagePattern findPackages = api.findClassInPackage();
		findPackages.bindPkg(p);

		assertMatchCount(0, findPackages);
		api.createClass().setParameters("SecondA");
		api.createClass().bindPkg(p);
		Clazz a = assertApplicableAndApply(api.createClass()).clazz();
		assertMatchCount(1, findPackages);

		api.createClassAsSubClass().setParameters("SecondB");
		api.createClassAsSubClass().bindPkg(p);
		api.createClassAsSubClass().bindSuperClass(a);
		
		
		Clazz b = assertApplicableAndApply(api.createClassAsSubClass()).clazz();
		assertMatchCount(2, findPackages);
		assertTrue(b.getSuperClass().contains(a));

		terminate(api);
	}

	@Test
	public void addSuperClass() {
		GtGtApi<?> api = this.init("ClassDiagram1.xmi");
		api.findClassByName().setParameters("TestA");
		Clazz a = assertAnyMatchExists(api.findClassByName()).clazz();
		api.findClassByName().setParameters("TestC");
		Clazz c = assertAnyMatchExists(api.findClassByName()).clazz();

		api.addSuperClass().bindClazz(c);
		api.addSuperClass().bindSuperClass(a);
		assertApplicableAndApply(api.addSuperClass());
		
		api.findSubClass().bindClazz(a);
		assertMatchCount(3, api.findSubClass());

		terminate(api);
	}

	@Test
	public void renameClass() {
		GtGtApi<?> api = this.init("ClassDiagram1.xmi");

		api.renameClass().setParameters("TestA", "TestNew");
		assertApplicableAndApply(api.renameClass());
		
		api.findClassByName().setParameters("TestA");
		assertNoMatch(api.findClassByName());
		
		api.findClassByName().setParameters("TestNew");
		assertMatchCount(1, api.findClassByName());

		terminate(api);
	}

	@Test
	public void deletePackage() {
		GtGtApi<?> api = this.init("ClassDiagram1.xmi");

		assertMatchCount(1, api.findPackage());
		assertNotApplicable(api.deletePackage());
		assertMatchCount(1, api.findPackage());
		
		api.deletePackageByName().setParameters("TestPackage");
		assertApplicableAndApply(api.deletePackageByName());
		
		assertMatchCount(0, api.findPackage());

		terminate(api);
	}
}
