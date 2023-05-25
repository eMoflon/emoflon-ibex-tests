package org.emoflon.ibex.gt.testsuite.GenericNodes;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import GenericNodes.A;
import GenericNodes.B;
import GenericNodes.GenericNodesFactory;
import GenericNodes.Root;
import genericnodes.gt.api.GtGtApi;

public class GenericNodesDuplicateNamesPmTest extends GenericNodesAbstractTest {

	GtGtApi<?> api;

	@AfterEach
	public void tearDown() {
		terminate(api);
	}

	@BeforeEach
	public void preCheck() {
		assertNull(api);
	}

	/*
	 * Actual tests.
	 */

	@Test
	public void testDuplicatePatternMatchesEmpty() {
		// Setup
		api = this.init("GenericNodes-root-only.xmi");

		// Checks
		assertMatchCounts(1, 0, api);
	}

	@Test
	public void testOnlyDuplicatePatternMatchesOnce() {
		// setup
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
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
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
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
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
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

	private void assertMatchCounts(final int root, final int duplicates,
			final GtGtApi<?> api) {
		assertMatchCount(root, api.findRoot());
		assertMatchCount(duplicates, api.findDuplicateNames());
	}

}
