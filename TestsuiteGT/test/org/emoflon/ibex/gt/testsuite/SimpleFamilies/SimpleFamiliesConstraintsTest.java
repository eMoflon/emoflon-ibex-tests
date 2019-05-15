package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;

/**
 * Tests for simple constraints and notifications in the SimpleFamilies Graph
 * Transformation API
 */
public class SimpleFamiliesConstraintsTest extends SimpleFamiliesAbstractTest {

	@Test
	public void constraints() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(1, api.findRegister());
		assertMatchCount(2, api.findFamily());
		List<String> familyNames = api.findFamily().matchStream() //
				.map(m -> m.getFamily().getName()) //
				.collect(Collectors.toList());
		assertTrue(familyNames.contains("Simpson"));
		assertTrue(familyNames.contains("Watson"));
		
		assertMatchCount(2, api.findFather());
		assertMatchCount(2, api.findMother());
		assertMatchCount(2, api.findDaughter());
		assertMatchCount(1, api.findSon());
	}

	@Test
	public void countFamilyByName() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(1, api.findSimpsonFamily());
		assertEquals("Simpson", api.findSimpsonFamily().findAnyMatch().get().getFamily().getName());

		assertMatchCount(1, api.findFamilyButNotSimpson());
		assertEquals("Watson", api.findFamilyButNotSimpson().findAnyMatch().get().getFamily().getName());

		assertMatchCount(2, api.findFamilyWithNameGreaterOrEqualThanSimpson());
		assertMatchCount(1, api.findFamilyWithNameGreaterThanSimpson());
		assertMatchCount(1, api.findFamilyWithNameSmallerOrEqualThanSimpson());
		assertMatchCount(0, api.findFamilyWithNameSmallerThanSimpson());

		assertMatchCount(0, api.findThreeFamiliesOfTheSameName());
	}

	@Test
	public void countFamilyByName2() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister2.xmi");

		assertMatchCount(0, api.findSimpsonFamily());
		assertMatchCount(7, api.findFamilyButNotSimpson());
		assertMatchCount(2, api.findFamilyWithNameGreaterOrEqualThanSimpson());
		assertMatchCount(2, api.findFamilyWithNameGreaterThanSimpson());
		assertMatchCount(5, api.findFamilyWithNameSmallerOrEqualThanSimpson());
		assertMatchCount(5, api.findFamilyWithNameSmallerThanSimpson());
	}

	@Test
	public void parameterizedAttributeConstraintsForEquality() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(1, api.findFamilyByName("Simpson"));
		assertMatchCount(1, api.findFamilyByName("Watson"));
		assertMatchCount(0, api.findFamilyByName("Smith"));

		assertMatchCount(1, api.findFamilyNotNamed("Simpson"));
		assertMatchCount(1, api.findFamilyNotNamed("Watson"));
		assertMatchCount(2, api.findFamilyNotNamed("Smith"));
		assertEquals("Watson", api.findFamilyNotNamed("Simpson").findAnyMatch().get().getFamily().getName());
		assertEquals("Simpson", api.findFamilyNotNamed("Watson").findAnyMatch().get().getFamily().getName());
	}

	@Test
	public void parameterizedAttributeConstraintsForGreater() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(2, api.findFamilyWithNameGreaterThan("S"));
		assertMatchCount(1, api.findFamilyWithNameGreaterThan("Smith"));
		assertMatchCount(0, api.findFamilyWithNameGreaterThan("Watson"));

		assertMatchCount(2, api.findFamilyWithNameGreaterOrEqualThan("A"));
		assertMatchCount(1, api.findFamilyWithNameGreaterOrEqualThan("T"));
		assertMatchCount(0, api.findFamilyWithNameGreaterOrEqualThan("X"));
	}

	@Test
	public void parameterizedAttributeConstraintsForSmaller() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(0, api.findFamilyWithNameSmallerThan("R"));
		assertMatchCount(1, api.findFamilyWithNameSmallerThan("Watson"));
		assertMatchCount(2, api.findFamilyWithNameSmallerThan("Z"));

		assertMatchCount(0, api.findFamilyWithNameSmallerOrEqualThan("R"));
		assertMatchCount(1, api.findFamilyWithNameSmallerOrEqualThan("Simpson"));
		assertMatchCount(2, api.findFamilyWithNameSmallerOrEqualThan("Watson"));
	}

	@Test
	public void findMembersTestPositiveApplicationConditions() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(2, api.findFatherWithCondition());
		assertMatchCount(2, api.findMotherWithCondition());
		assertMatchCount(2, api.findDaughterWithCondition());
		assertMatchCount(1, api.findSonWithCondition());
	}

	@Test
	public void findMembersTestNegativeApplicationCondition() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(6, api.findMemberExceptSonWithCondition());
	}

	@Test
	public void findMembersTestAndCondition() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(1, api.findSonInSimpsonFamily());
		assertEquals("Bart", api.findSonInSimpsonFamily().findAnyMatch().get().getMember().getName());
	}

	@Test
	public void findMembersTestAlternatives() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		assertMatchCount(4, api.findFemale());
		assertMatchCount(3, api.findMale());
	}

	@Test
	public void findMembersTestAlternativesWithAttribute() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister.xmi");

		// Needs the removal of duplicates (match for Bart found by both alternatives!).
		assertMatchCount(1, api.findSonInSimpsonFamilyOrNamedBart());
	}

	@Test
	public void findHalfOrphans() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister2.xmi");

		assertMatchCount(4, api.findHalfOrphan());
		List<String> halfOrphans = api.findHalfOrphan().matchStream() //
				.map(m -> m.getChild().getName() + " " + m.getFamily().getName()) //
				.sorted() //
				.collect(Collectors.toList());
		List<String> expected = Arrays.asList("Charlotte Cooper", "Jason Jackson", "Oliver Owen", "Thea Thompson");
		assertEquals(expected, halfOrphans);
	}

	@Test
	public void findOrphans() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister2.xmi");

		Family adamsFamily = api.findFamilyByName("Adams").findAnyMatch().get().getFamily();
		assertMatchCount(2, api.findOrphan().bindFamily(adamsFamily));
		assertMatchCount(3, api.findOrphan());
	}

	@Test
	public void findChildrenWithTwoParents() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister2.xmi");

		assertMatchCount(1, api.findChildrenWithTwoParents());
	}

	@Test
	public void findSingleParent() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister2.xmi");

		assertMatchCount(4, api.findSingleParent());
		assertMatchCount(2, api.findSingleFather());
		assertMatchCount(2, api.findSingleMother());
	}

	@Test
	public void findThreeFamiliesWithTheSameName() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamilyRegister3.xmi");

		// 6 = 3 * 2 matches (each combination of the three "Simpson" families)
		assertMatchCount(6, api.findThreeFamiliesOfTheSameName());

		Set<Family> families = new HashSet<Family>();
		api.findThreeFamiliesOfTheSameName().forEachMatch(m -> {
			families.add(m.getFamily1());
			families.add(m.getFamily2());
			families.add(m.getFamily3());
		});
		assertEquals(3, families.size());
		assertEquals(1, families.stream().map(f -> f.getName()).distinct().count());
	}
}
