package org.emoflon.ibex.gt.testsuite.GenericNodes;

import org.junit.jupiter.api.Test;

import GenericNodes.GenericNodesFactory;
import GenericNodes.Root;

public class GenericNodesEasyPmAddTest extends GenericNodesAbstractTest {

	/*
	 * Actual tests.
	 */

	@Test
	public void testAllAtomicPatternMatchesEmpty() {
		// Setup
		api = this.init("GenericNodes-root-only.xmi");

		// Checks
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

	@Test
	public void testAllAtomicPatternMatchesOnce() {
		// setup
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createA());
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createB());
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createC());
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createD());

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 1, 1, 1, 1, api);
	}

	@Test
	public void testAAtomicPatternMatchesOnce() {
		// setup
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createA());

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 1, 0, 0, 0, api);
	}

	@Test
	public void testBAtomicPatternMatchesOnce() {
		// setup
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createB());

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 1, 0, 0, api);
	}

	@Test
	public void testCAtomicPatternMatchesOnce() {
		// setup
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createC());

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 0, 1, 0, api);
	}

	@Test
	public void testDAtomicPatternMatchesOnce() {
		// setup
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(GenericNodesFactory.eINSTANCE.createD());

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 0, 0, 1, api);
	}

	@Test
	public void testMultipleAtomicPatternMatches() {
		// setup
		api = this.init("GenericNodes-root-only.xmi");
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);

		for (int a = 1; a <= 7; a++) {
			root.getNodes().add(GenericNodesFactory.eINSTANCE.createA());
		}
		for (int b = 1; b <= 23; b++) {
			root.getNodes().add(GenericNodesFactory.eINSTANCE.createB());
		}
		for (int c = 1; c <= 42; c++) {
			root.getNodes().add(GenericNodesFactory.eINSTANCE.createC());
		}
		for (int d = 1; d <= 73; d++) {
			root.getNodes().add(GenericNodesFactory.eINSTANCE.createD());
		}

		api.updateMatches();

		// Checks
		assertMatchCounts(1, 7, 23, 42, 73, api);
	}

}
