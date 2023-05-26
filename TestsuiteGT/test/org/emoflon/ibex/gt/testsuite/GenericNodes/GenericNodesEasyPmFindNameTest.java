package org.emoflon.ibex.gt.testsuite.GenericNodes;

import org.junit.jupiter.api.Test;

import GenericNodes.Root;
import genericnodes.gt.api.GtGtApi;

public class GenericNodesEasyPmFindNameTest extends GenericNodesAbstractTest {

	/*
	 * Actual tests.
	 */

	@Test
	public void testFindPatternNoNodes() {
		// Setup
		initAndSanityCheck();

		// Checks
		assertFindNameMatchCounts(0, "", api);
	}

	@Test
	public void testFindPatternOneNodeEmptyString() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		root.getNodes().add(genDummyNode(NodeType.A, ""));

		// Checks
		assertFindNameMatchCounts(1, "", api);
	}

	@Test
	public void testFindPatternOneNodeBlankString() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		root.getNodes().add(genDummyNode(NodeType.A, " "));

		// Checks
		assertFindNameMatchCounts(1, " ", api);
	}

	@Test
	public void testFindPatternOneMatchInManyNodes() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		root.getNodes().add(genDummyNode(NodeType.A, "bla"));
		root.getNodes().add(genDummyNode(NodeType.A, "blub"));
		root.getNodes().add(genDummyNode(NodeType.A, "a"));
		root.getNodes().add(genDummyNode(NodeType.B, "b"));
		root.getNodes().add(genDummyNode(NodeType.C, "c"));
		root.getNodes().add(genDummyNode(NodeType.D, "d"));

		// Checks
		assertFindNameMatchCounts(1, "bla", api);
	}

	@Test
	public void testFindPatternMultipleMatchesInManyNodes() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		root.getNodes().add(genDummyNode(NodeType.A, "bla"));
		root.getNodes().add(genDummyNode(NodeType.A, "blub"));
		root.getNodes().add(genDummyNode(NodeType.A, "a"));
		root.getNodes().add(genDummyNode(NodeType.B, "b"));
		root.getNodes().add(genDummyNode(NodeType.C, "c"));
		root.getNodes().add(genDummyNode(NodeType.D, "d"));
		root.getNodes().add(genDummyNode(NodeType.D, "d"));
		root.getNodes().add(genDummyNode(NodeType.D, "d"));

		// Checks
		assertFindNameMatchCounts(3, "d", api);
	}
	
	/*
	 * Utility methods.
	 */

	protected void assertFindNameMatchCounts(final int findNames, final String searchName, final GtGtApi<?> api) {
		assertMatchCount(findNames, api.findName(searchName));
	}

}
