package org.emoflon.ibex.gt.testsuite.GenericNodes;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import GenericNodes.A;
import GenericNodes.B;
import GenericNodes.C;
import GenericNodes.D;
import GenericNodes.NamedElement;
import GenericNodes.Root;

public class GenericNodesEasyPmRemoveTest extends GenericNodesAbstractTest {

	final String nodeName = "does-not-matter";

	/*
	 * Actual tests.
	 */

	@Test
	public void testAllAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.A, nodeName));
		root.getNodes().add(genDummyNode(NodeType.B, nodeName));
		root.getNodes().add(genDummyNode(NodeType.C, nodeName));
		root.getNodes().add(genDummyNode(NodeType.D, nodeName));

		api.updateMatches();
		root.getNodes().clear();
		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

	@Test
	public void testAAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.A, nodeName));

		api.updateMatches();
		root.getNodes().clear();
		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

	@Test
	public void testBAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.B, nodeName));

		api.updateMatches();
		root.getNodes().clear();
		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

	@Test
	public void testCAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.C, nodeName));

		api.updateMatches();
		root.getNodes().clear();
		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

	@Test
	public void testDAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.D, nodeName));

		api.updateMatches();
		root.getNodes().clear();
		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

	@Test
	public void testMultipleAtomicPatternMatches() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);

		for (int a = 1; a <= 7; a++) {
			root.getNodes().add(genDummyNode(NodeType.A, nodeName));
		}
		for (int b = 1; b <= 23; b++) {
			root.getNodes().add(genDummyNode(NodeType.B, nodeName));
		}
		for (int c = 1; c <= 42; c++) {
			root.getNodes().add(genDummyNode(NodeType.C, nodeName));
		}
		for (int d = 1; d <= 73; d++) {
			root.getNodes().add(genDummyNode(NodeType.D, nodeName));
		}

		api.updateMatches();
		root.getNodes().clear();
		api.updateMatches();

		// Checks
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

	@Test
	public void testMultipleAtomicPatternMatchesRemovedIndividually() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);

		for (int a = 1; a <= 7; a++) {
			root.getNodes().add(genDummyNode(NodeType.A, nodeName));
		}
		for (int b = 1; b <= 23; b++) {
			root.getNodes().add(genDummyNode(NodeType.B, nodeName));
		}
		for (int c = 1; c <= 42; c++) {
			root.getNodes().add(genDummyNode(NodeType.C, nodeName));
		}
		for (int d = 1; d <= 73; d++) {
			root.getNodes().add(genDummyNode(NodeType.D, nodeName));
		}

		api.updateMatches();

		// Get all nodes
		final HashSet<NamedElement> as = new HashSet<NamedElement>();
		as.addAll(root.getNodes().stream().filter(n -> n instanceof A).toList());
		final HashSet<NamedElement> bs = new HashSet<NamedElement>();
		bs.addAll(root.getNodes().stream().filter(n -> n instanceof B).toList());
		final HashSet<NamedElement> cs = new HashSet<NamedElement>();
		cs.addAll(root.getNodes().stream().filter(n -> n instanceof C).toList());
		final HashSet<NamedElement> ds = new HashSet<NamedElement>();
		ds.addAll(root.getNodes().stream().filter(n -> n instanceof D).toList());

		// Start the removal of types & checks
		// A
		root.getNodes().removeAll(as);
		api.updateMatches();
		assertMatchCounts(1, 0, 23, 42, 73, api);

		// B
		root.getNodes().removeAll(bs);
		api.updateMatches();
		assertMatchCounts(1, 0, 0, 42, 73, api);

		// C
		root.getNodes().removeAll(cs);
		api.updateMatches();
		assertMatchCounts(1, 0, 0, 0, 73, api);

		// D
		root.getNodes().removeAll(ds);
		api.updateMatches();
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

}
