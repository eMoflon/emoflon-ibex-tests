package org.emoflon.ibex.gt.testsuite.Families;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import SimpleFamilies.Family;
import families.gt.api.GtGtAPI;
import families.gt.api.match.FindThreeFamiliesOfTheSameNameMatch;

/**
 * Tests for simple constraints and notifications in the SimpleFamilies Graph
 * Transformation API
 */
public class FamiliesConstraintsTest extends FamiliesAbstractTest {

	@Test
	public void constraints() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);

		assertMatchCount(1, api.findFamilyRegister());
		assertMatchCount(2, api.findFamily());
		List<String> familyNames = api.findFamily().matchStream() //
				.map(m -> m.family().getName()) //
				.collect(Collectors.toList());
		
		assertTrue(familyNames.size() == 2);
		assertTrue(familyNames.contains("Simpson"));
		assertTrue(familyNames.contains("Watson"));
		
		assertMatchCount(2, api.findFather());
		assertMatchCount(2, api.findMother());
		assertMatchCount(2, api.findDaughter());
		assertMatchCount(1, api.findSon());
		
		api.terminate();
	}

	@Test
	public void countFamilyByName() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);

		assertMatchCount(1, api.findSimpsonFamily());
		assertEquals("Simpson", api.findSimpsonFamily().findAnyMatch().get().family().getName());

		assertMatchCount(1, api.findFamilyButNotSimpson());
		assertEquals("Watson", api.findFamilyButNotSimpson().findAnyMatch().get().family().getName());

		assertMatchCount(2, api.findFamilyWithNameGreaterOrEqualThanSimpson());
		assertMatchCount(1, api.findFamilyWithNameGreaterThanSimpson());
		assertMatchCount(1, api.findFamilyWithNameSmallerOrEqualThanSimpson());
		assertMatchCount(0, api.findFamilyWithNameSmallerThanSimpson());

		assertMatchCount(0, api.findThreeFamiliesOfTheSameName());
		
		api.terminate();
	}

	@Test
	public void countFamilyByName2() {
		GtGtAPI<?> api = this.init("FamilyRegister2.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);

		assertMatchCount(0, api.findSimpsonFamily());
		assertMatchCount(7, api.findFamilyButNotSimpson());
		assertMatchCount(2, api.findFamilyWithNameGreaterOrEqualThanSimpson());
		assertMatchCount(2, api.findFamilyWithNameGreaterThanSimpson());
		assertMatchCount(5, api.findFamilyWithNameSmallerOrEqualThanSimpson());
		assertMatchCount(5, api.findFamilyWithNameSmallerThanSimpson());
		
		api.terminate();
	}

	@Test
	public void parameterizedAttributeConstraintsForEquality() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);

		assertMatchCount(1, api.findFamilyByName("Simpson"));
		assertMatchCount(1, api.findFamilyByName("Watson"));
		assertMatchCount(0, api.findFamilyByName("Smith"));

		assertMatchCount(1, api.findFamilyNotNamed("Simpson"));
		assertMatchCount(1, api.findFamilyNotNamed("Watson"));
		assertMatchCount(2, api.findFamilyNotNamed("Smith"));
		assertEquals("Watson", api.findFamilyNotNamed("Simpson").findAnyMatch().get().family().getName());
		assertEquals("Simpson", api.findFamilyNotNamed("Watson").findAnyMatch().get().family().getName());
	}

	@Test
	public void parameterizedAttributeConstraintsForGreater() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);

		assertMatchCount(2, api.findFamilyWithNameGreaterThan("S"));
		assertMatchCount(1, api.findFamilyWithNameGreaterThan("Smith"));
		assertMatchCount(0, api.findFamilyWithNameGreaterThan("Watson"));

		assertMatchCount(2, api.findFamilyWithNameGreaterOrEqualThan("A"));
		assertMatchCount(1, api.findFamilyWithNameGreaterOrEqualThan("T"));
		assertMatchCount(0, api.findFamilyWithNameGreaterOrEqualThan("X"));
		
		api.terminate();
	}

	@Test
	public void parameterizedAttributeConstraintsForSmaller() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(0, api.findFamilyWithNameSmallerThan("R"));
		assertMatchCount(1, api.findFamilyWithNameSmallerThan("Watson"));
		assertMatchCount(2, api.findFamilyWithNameSmallerThan("Z"));

		assertMatchCount(0, api.findFamilyWithNameSmallerOrEqualThan("R"));
		assertMatchCount(1, api.findFamilyWithNameSmallerOrEqualThan("Simpson"));
		assertMatchCount(2, api.findFamilyWithNameSmallerOrEqualThan("Watson"));
		
		api.terminate();
	}

	@Test
	public void findMembersTestPositiveApplicationConditions() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(2, api.findFatherWithCondition());
		assertMatchCount(2, api.findMotherWithCondition());
		assertMatchCount(2, api.findDaughterWithCondition());
		assertMatchCount(1, api.findSonWithCondition());
		
		api.terminate();
	}

	@Test
	public void findMembersTestNegativeApplicationCondition() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(6, api.findMemberExceptSonWithCondition());
		
		api.terminate();
	}

	@Test
	public void findMembersTestAndCondition() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(1, api.findSonInSimpsonFamily());
		assertEquals("Bart", api.findSonInSimpsonFamily().findAnyMatch().get().member().getName());
		
		api.terminate();
	}

	@Test
	public void findMembersTestAlternatives() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(4, api.findFemaleMember());
		assertMatchCount(3, api.findMaleMember());
		
		api.terminate();
	}

	@Test
	public void findMembersTestAlternativesWithAttribute() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		// Needs the removal of duplicates (match for Bart found by both alternatives!).
		assertMatchCount(1, api.findSonInSimpsonFamilyOrNamedBart());
		
		api.terminate();
	}

	@Test
	public void findHalfOrphans() {
		GtGtAPI<?> api = this.init("FamilyRegister2.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(4, api.findHalfOrphan());
		List<String> halfOrphans = api.findHalfOrphan().matchStream() //
				.map(m -> m.child().getName() + " " + m.family().getName()) //
				.sorted() //
				.collect(Collectors.toList());
		List<String> expected = Arrays.asList("Charlotte Cooper", "Jason Jackson", "Oliver Owen", "Thea Thompson");
		assertEquals(expected, halfOrphans);
		
		api.terminate();
	}

	@Test
	public void findOrphans() {
		GtGtAPI<?> api = this.init("FamilyRegister2.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		Family adamsFamily = api.findFamilyByName("Adams").findAnyMatch().get().family();
		assertMatchCount(2, api.findOrphan().bindFamily(adamsFamily));
		api.findOrphan().unbindFamily();
		assertMatchCount(3, api.findOrphan());
		
		api.terminate();
	}

	@Test
	public void findChildrenWithTwoParents() {
		GtGtAPI<?> api = this.init("FamilyRegister2.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(1, api.findChildrenWithTwoParents());
		
		api.terminate();
	}

	@Test
	public void findSingleParent() {
		GtGtAPI<?> api = this.init("FamilyRegister2.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(2, api.findSingleFather());
		assertMatchCount(2, api.findSingleMother());
		assertMatchCount(4, api.findSingleParent());
		
		api.terminate();
	}

	@Test
	public void findThreeFamiliesWithTheSameName() {
		GtGtAPI<?> api = this.init("FamilyRegister3.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		// 6 = 3 * 2 matches (each combination of the three "Simpson" families)
		assertMatchCount(6, api.findThreeFamiliesOfTheSameName());

		Set<Family> families = new HashSet<Family>();
		List<FindThreeFamiliesOfTheSameNameMatch> matches = new LinkedList<>(api.findThreeFamiliesOfTheSameName().getMatches());
		matches.forEach(m -> {
			families.add(m.family1());
			families.add(m.family2());
			families.add(m.family3());
		});
		assertEquals(3, families.size());
		assertEquals(1, families.stream().map(f -> f.getName()).distinct().count());
		
		api.terminate();
	}
}
