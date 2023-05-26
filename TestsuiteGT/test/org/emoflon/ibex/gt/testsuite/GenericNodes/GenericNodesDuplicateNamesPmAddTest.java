package org.emoflon.ibex.gt.testsuite.GenericNodes;

import org.junit.jupiter.api.Test;

import GenericNodes.A;
import GenericNodes.B;
import GenericNodes.GenericNodesFactory;
import GenericNodes.Root;
import genericnodes.gt.api.GtGtApi;

public class GenericNodesDuplicateNamesPmAddTest extends GenericNodesAbstractTest {

	/*
	 * Actual tests.
	 */

	@Test
	public void testDuplicatePatternMatchesEmpty() {
		// Setup
		initAndSanityCheck();

		// Checks
		assertMatchCounts(1, 0, api);
	}

	@Test
	public void testOnlyDuplicatePatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = getRoot();
		final String name = "genNode";
		final A a = GenericNodesFactory.eINSTANCE.createA();
		a.setName(name);
		final B b = GenericNodesFactory.eINSTANCE.createB();
		b.setName(name);
		root.getNodes().add(a);
		root.getNodes().add(b);

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 2, api);
	}

	@Test
	public void testEmptyDuplicatePatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = getRoot();
		final String name = "genNode";
		final A a = GenericNodesFactory.eINSTANCE.createA();
		a.setName(name);
		final B b = GenericNodesFactory.eINSTANCE.createB();
		b.setName(name);
		root.getNodes().add(a);
		root.getNodes().add(b);

		// Other nodes with empty names
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createB());
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createB());

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 2, api);
	}

	@Test
	public void testOtherDuplicatePatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = getRoot();
		final String name = "genNode";
		final A a = GenericNodesFactory.eINSTANCE.createA();
		a.setName(name);
		final B b = GenericNodesFactory.eINSTANCE.createB();
		b.setName(name);
		final A a2 = GenericNodesFactory.eINSTANCE.createA();
		a2.setName(name + "-2");
		final B b2 = GenericNodesFactory.eINSTANCE.createB();
		b2.setName(name + "-2");
		root.getNodes().add(a);
		root.getNodes().add(b);
		root.getNodes().add(a2);
		root.getNodes().add(b2);

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 4, api);
	}

	/*
	 * Utility methods.
	 */

	private void assertMatchCounts(final int root, final int duplicates, final GtGtApi<?> api) {
		assertMatchCount(root, api.findRoot());
		assertMatchCount(duplicates, api.findDuplicateNames());
	}

}
