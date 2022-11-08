package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import classMultipleInheritanceHierarchy.Clazz;
import classmultipleinheritance.gt.api.GtGtAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class ClassMultipleInheritanceSearchTest extends ClassMultipleInheritanceHierarchyAbstractTest {

	@Test
	public void findPackageAndClasses() {
		GtGtAPI<?> api = this.init("ClassDiagram1.xmi");

		assertMatchCount(1, api.findPackage());
		assertMatchCount(6, api.findClass());
	}

	@Test
	public void findSubClasses() {
		GtGtAPI<?> api = this.init("ClassDiagram1.xmi");

		api.findClassByName().setParameters("TestA");
		Clazz testA = assertAnyMatchExists(api.findClassByName()).clazz();
		
		api.findSuperClass().bindClazz(testA);
		assertMatchCount(0, api.findSuperClass());
		
		api.findSubClass().bindClazz(testA);
		assertMatchCount(2, api.findSubClass());

		api.findClassByQualifiedName().setParameters("TestPackage", "SubAB");
		Clazz subAB = assertAnyMatchExists(api.findClassByQualifiedName()).clazz();
		
		api.findSuperClass().bindClazz(subAB);
		api.findSubClass().bindClazz(subAB);
		assertMatchCount(2, api.findSuperClass());
		assertMatchCount(0, api.findSubClass());
		
		terminate(api);
	}

	@Test
	public void notifyIfTwoClassesOfTheSameName() {
		GtGtAPI<?> api = this.init("ClassDiagram1.xmi");

		Set<Clazz> classes = new HashSet<Clazz>();
		api.findTwoClassesOfSameName().subscribeAppearing(m -> {
			classes.add(m.clazz1());
			classes.add(m.clazz2());
		});

		api.createClass().setParameters("TestA");
		assertApplicableAndApply(api.createClass());
		
		api.updateMatches();
		assertEquals(2, classes.size());

		terminate(api);
	}
}
