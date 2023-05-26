package org.emoflon.ibex.gt.testsuite.GenericNodes;

import java.util.List;

import org.junit.jupiter.api.Test;

import GenericNodes.Root;
import GenericNodes.NamedElement;
import genericnodes.gt.api.GtGtApi;

public class GenericNodesEasyPmFindNeighboursTest extends GenericNodesAbstractTest {

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
	public void testFindOnePair() {
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
	public void testFindOneDoublePair() {
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
	public void testFindCircleOfThree() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a = genDummyNode(NodeType.A, "1");
		final NamedElement b = genDummyNode(NodeType.B, "2");
		final NamedElement c = genDummyNode(NodeType.C, "3");
		a.getNeighbours().add(b);
		b.getNeighbours().add(c);
		c.getNeighbours().add(a);
		root.getNodes().addAll(List.of(a, b, c));

		// Checks
		assertFindNameMatchCounts(3, api);
	}

	@Test
	public void testFindFullMeshThree() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a = genDummyNode(NodeType.A, "1");
		final NamedElement b = genDummyNode(NodeType.B, "2");
		final NamedElement c = genDummyNode(NodeType.C, "3");
		a.getNeighbours().addAll(List.of(b, c));
		b.getNeighbours().addAll(List.of(a, c));
		c.getNeighbours().addAll(List.of(a, b));
		root.getNodes().addAll(List.of(a, b, c));

		// Checks
		assertFindNameMatchCounts(6, api);
	}

	@Test
	public void testFindFullMeshFourUpdate() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a = genDummyNode(NodeType.A, "1");
		final NamedElement b = genDummyNode(NodeType.B, "2");
		final NamedElement c = genDummyNode(NodeType.C, "3");
		a.getNeighbours().addAll(List.of(b, c));
		b.getNeighbours().addAll(List.of(a, c));
		c.getNeighbours().addAll(List.of(a, b));
		root.getNodes().addAll(List.of(a, b, c));

		// Pre-checks
		assertFindNameMatchCounts(6, api);

		final NamedElement d = genDummyNode(NodeType.D, "4");
		root.getNodes().forEach(n -> n.getNeighbours().add(d));
		d.getNeighbours().addAll(List.of(a, b, c));
		root.getNodes().add(d);
		api.updateMatches();

		// Checks
		assertFindNameMatchCounts(12, api);
	}

	@Test
	public void testFindFullMeshFourRemove() {
		// Setup
		initAndSanityCheck();

		final Root root = getRoot();
		final NamedElement a = genDummyNode(NodeType.A, "1");
		final NamedElement b = genDummyNode(NodeType.B, "2");
		final NamedElement c = genDummyNode(NodeType.C, "3");
		final NamedElement d = genDummyNode(NodeType.D, "4");
		a.getNeighbours().addAll(List.of(b, c, d));
		b.getNeighbours().addAll(List.of(a, c, d));
		c.getNeighbours().addAll(List.of(a, b, d));
		d.getNeighbours().addAll(List.of(a, b, c));
		root.getNodes().addAll(List.of(a, b, c, d));

		// Pre-checks
		assertFindNameMatchCounts(12, api);

		root.getNodes().remove(3);
		api.updateMatches();

		// Checks
		assertFindNameMatchCounts(6, api);
	}

	/*
	 * Utility methods.
	 */

	protected void assertFindNameMatchCounts(final int neighbours, final GtGtApi<?> api) {
		assertMatchCount(neighbours, api.findNeighbourPair());
	}

}
