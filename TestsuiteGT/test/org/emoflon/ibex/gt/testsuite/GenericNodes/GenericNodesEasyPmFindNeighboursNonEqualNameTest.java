package org.emoflon.ibex.gt.testsuite.GenericNodes;

import java.util.List;

import org.junit.jupiter.api.Test;

import GenericNodes.Root;
import GenericNodes.NamedElement;
import genericnodes.gt.api.GtGtApi;

public class GenericNodesEasyPmFindNeighboursNonEqualNameTest extends GenericNodesAbstractTest {

	/*
	 * Actual tests.
	 */

	@Test
	public void testFindNeighboursNoNodes() {
		// Setup
		initAndSanityCheck();

		// Checks
		assertFindNameMatchCounts(0, api);
	}

	@Test
	public void testFindOnePairNonEqualName() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a = genDummyNode(NodeType.A, "1");
		final NamedElement b = genDummyNode(NodeType.B, "2");
		a.getNeighbours().add(b);
		root.getNodes().addAll(List.of(a, b));

		// Checks
		assertFindNameMatchCounts(1, api);
	}

	@Test
	public void testFindOneDoublePairNonEqualName() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a = genDummyNode(NodeType.A, "1");
		final NamedElement b = genDummyNode(NodeType.B, "2");
		a.getNeighbours().add(b);
		b.getNeighbours().add(a);
		root.getNodes().addAll(List.of(a, b));

		// Checks
		assertFindNameMatchCounts(2, api);
	}

	@Test
	public void testOnePairEqualName() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a = genDummyNode(NodeType.A, "test");
		final NamedElement b = genDummyNode(NodeType.B, "test");
		a.getNeighbours().add(b);
		root.getNodes().addAll(List.of(a, b));

		// Checks
		assertFindNameMatchCounts(0, api);
	}

	@Test
	public void testTwoPairsOneEqualName() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a1 = genDummyNode(NodeType.A, "test");
		final NamedElement b1 = genDummyNode(NodeType.B, "test");
		final NamedElement a2 = genDummyNode(NodeType.A, "test-1");
		final NamedElement b2 = genDummyNode(NodeType.B, "test-2");
		a1.getNeighbours().add(b1);
		a2.getNeighbours().add(b2);
		root.getNodes().addAll(List.of(a1, b1, a2, b2));

		// Checks
		assertFindNameMatchCounts(1, api);
	}

	@Test
	public void testTwoPairsTwoEqualNames() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a1 = genDummyNode(NodeType.A, "test");
		final NamedElement b1 = genDummyNode(NodeType.B, "test");
		final NamedElement a2 = genDummyNode(NodeType.A, "test-1");
		final NamedElement b2 = genDummyNode(NodeType.B, "test-1");
		a1.getNeighbours().add(b1);
		a2.getNeighbours().add(b2);
		root.getNodes().addAll(List.of(a1, b1, a2, b2));

		// Checks
		assertFindNameMatchCounts(0, api);
	}

	@Test
	public void testTwoPairsTwoEqualNamesButNoNeighbours() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a1 = genDummyNode(NodeType.A, "test");
		final NamedElement b1 = genDummyNode(NodeType.B, "test");
		final NamedElement a2 = genDummyNode(NodeType.A, "test-1");
		final NamedElement b2 = genDummyNode(NodeType.B, "test-1");
		root.getNodes().addAll(List.of(a1, b1, a2, b2));

		// Checks
		assertFindNameMatchCounts(0, api);
	}

	/*
	 * Utility methods.
	 */

	protected void assertFindNameMatchCounts(final int neighbours, final GtGtApi<?> api) {
		assertMatchCount(neighbours, api.findNeighbourPairNonEqualName());
	}

}
