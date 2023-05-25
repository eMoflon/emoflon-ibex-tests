package org.emoflon.ibex.gt.testsuite.GenericNodes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import GenericNodes.A;
import GenericNodes.B;
import GenericNodes.C;
import GenericNodes.D;
import GenericNodes.Root;

public class GenericNodesEasyPmUpdateTest extends GenericNodesAbstractTest {

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

		// Pre-checks
		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(1, api.findA());
		assertMatchCount(1, api.findB());
		assertMatchCount(1, api.findC());
		assertMatchCount(1, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals(nodeName, m.a().getName());
		});

		// Change names
		root.getNodes().forEach(n -> {
			n.setName("new-name");
		});

		api.updateMatches();

		// Checks
		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(1, api.findA());
		assertMatchCount(1, api.findB());
		assertMatchCount(1, api.findC());
		assertMatchCount(1, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals("new-name", m.a().getName());
		});
		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals("new-name", m.b().getName());
		});
		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals("new-name", m.c().getName());
		});
		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals("new-name", m.d().getName());
		});
	}

	@Test
	public void testAAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.A, nodeName));

		api.updateMatches();

		// Pre-checks
		assertFalse(api.findA().getMatches().isEmpty());
		assertTrue(api.findB().getMatches().isEmpty());
		assertTrue(api.findC().getMatches().isEmpty());
		assertTrue(api.findD().getMatches().isEmpty());

		assertMatchCount(1, api.findA());
		assertMatchCount(0, api.findB());
		assertMatchCount(0, api.findC());
		assertMatchCount(0, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals(nodeName, m.a().getName());
		});

		// Change names
		root.getNodes().forEach(n -> {
			n.setName("new-name");
		});

		api.updateMatches();

		// Checks
		assertFalse(api.findA().getMatches().isEmpty());
		assertTrue(api.findB().getMatches().isEmpty());
		assertTrue(api.findC().getMatches().isEmpty());
		assertTrue(api.findD().getMatches().isEmpty());

		assertMatchCount(1, api.findA());
		assertMatchCount(0, api.findB());
		assertMatchCount(0, api.findC());
		assertMatchCount(0, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals("new-name", m.a().getName());
		});
	}

	@Test
	public void testBAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.B, nodeName));

		api.updateMatches();

		// Pre-checks
		assertTrue(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertTrue(api.findC().getMatches().isEmpty());
		assertTrue(api.findD().getMatches().isEmpty());

		assertMatchCount(0, api.findA());
		assertMatchCount(1, api.findB());
		assertMatchCount(0, api.findC());
		assertMatchCount(0, api.findD());

		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals(nodeName, m.b().getName());
		});

		// Change names
		root.getNodes().forEach(n -> {
			n.setName("new-name");
		});

		api.updateMatches();

		// Checks
		assertTrue(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertTrue(api.findC().getMatches().isEmpty());
		assertTrue(api.findD().getMatches().isEmpty());

		assertMatchCount(0, api.findA());
		assertMatchCount(1, api.findB());
		assertMatchCount(0, api.findC());
		assertMatchCount(0, api.findD());

		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals("new-name", m.b().getName());
		});
	}

	@Test
	public void testCAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.C, nodeName));

		api.updateMatches();

		// Pre-checks
		assertTrue(api.findA().getMatches().isEmpty());
		assertTrue(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertTrue(api.findD().getMatches().isEmpty());

		assertMatchCount(0, api.findA());
		assertMatchCount(0, api.findB());
		assertMatchCount(1, api.findC());
		assertMatchCount(0, api.findD());

		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals(nodeName, m.c().getName());
		});

		// Change names
		root.getNodes().forEach(n -> {
			n.setName("new-name");
		});

		api.updateMatches();

		// Checks
		assertTrue(api.findA().getMatches().isEmpty());
		assertTrue(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertTrue(api.findD().getMatches().isEmpty());

		assertMatchCount(0, api.findA());
		assertMatchCount(0, api.findB());
		assertMatchCount(1, api.findC());
		assertMatchCount(0, api.findD());

		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals("new-name", m.c().getName());
		});
	}

	@Test
	public void testDAtomicPatternMatchesOnce() {
		// setup
		initAndSanityCheck();
		final Root root = (Root) api.getModel().getResources().get(0).getContents().get(0);
		root.getNodes().add(genDummyNode(NodeType.D, nodeName));

		api.updateMatches();

		// Pre-checks
		assertTrue(api.findA().getMatches().isEmpty());
		assertTrue(api.findB().getMatches().isEmpty());
		assertTrue(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(0, api.findA());
		assertMatchCount(0, api.findB());
		assertMatchCount(0, api.findC());
		assertMatchCount(1, api.findD());

		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals(nodeName, m.d().getName());
		});

		// Change names
		root.getNodes().forEach(n -> {
			n.setName("new-name");
		});

		api.updateMatches();

		// Checks
		assertTrue(api.findA().getMatches().isEmpty());
		assertTrue(api.findB().getMatches().isEmpty());
		assertTrue(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(0, api.findA());
		assertMatchCount(0, api.findB());
		assertMatchCount(0, api.findC());
		assertMatchCount(1, api.findD());

		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals("new-name", m.d().getName());
		});
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

		// Pre-checks
		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(7, api.findA());
		assertMatchCount(23, api.findB());
		assertMatchCount(42, api.findC());
		assertMatchCount(73, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals(nodeName, m.a().getName());
		});
		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals(nodeName, m.b().getName());
		});
		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals(nodeName, m.c().getName());
		});
		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals(nodeName, m.d().getName());
		});

		// Change names
		root.getNodes().forEach(n -> {
			n.setName("new-name");
		});

		api.updateMatches();

		// Checks
		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(7, api.findA());
		assertMatchCount(23, api.findB());
		assertMatchCount(42, api.findC());
		assertMatchCount(73, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals("new-name", m.a().getName());
		});
		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals("new-name", m.b().getName());
		});
		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals("new-name", m.c().getName());
		});
		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals("new-name", m.d().getName());
		});
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

		// Pre-checks
		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(7, api.findA());
		assertMatchCount(23, api.findB());
		assertMatchCount(42, api.findC());
		assertMatchCount(73, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals(nodeName, m.a().getName());
		});
		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals(nodeName, m.b().getName());
		});
		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals(nodeName, m.c().getName());
		});
		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals(nodeName, m.d().getName());
		});

		// Start the renaming of nodes
		// A
		root.getNodes().stream().filter(n -> n instanceof A).forEach(n -> n.setName("new-name"));
		api.updateMatches();

		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(7, api.findA());
		assertMatchCount(23, api.findB());
		assertMatchCount(42, api.findC());
		assertMatchCount(73, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals("new-name", m.a().getName());
		});
		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals(nodeName, m.b().getName());
		});
		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals(nodeName, m.c().getName());
		});
		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals(nodeName, m.d().getName());
		});

		// B
		root.getNodes().stream().filter(n -> n instanceof B).forEach(n -> n.setName("new-name"));
		api.updateMatches();

		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(7, api.findA());
		assertMatchCount(23, api.findB());
		assertMatchCount(42, api.findC());
		assertMatchCount(73, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals("new-name", m.a().getName());
		});
		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals("new-name", m.b().getName());
		});
		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals(nodeName, m.c().getName());
		});
		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals(nodeName, m.d().getName());
		});

		// C
		root.getNodes().stream().filter(n -> n instanceof C).forEach(n -> n.setName("new-name"));
		api.updateMatches();

		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(7, api.findA());
		assertMatchCount(23, api.findB());
		assertMatchCount(42, api.findC());
		assertMatchCount(73, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals("new-name", m.a().getName());
		});
		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals("new-name", m.b().getName());
		});
		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals("new-name", m.c().getName());
		});
		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals(nodeName, m.d().getName());
		});

		// D
		root.getNodes().stream().filter(n -> n instanceof D).forEach(n -> n.setName("new-name"));
		api.updateMatches();

		assertFalse(api.findA().getMatches().isEmpty());
		assertFalse(api.findB().getMatches().isEmpty());
		assertFalse(api.findC().getMatches().isEmpty());
		assertFalse(api.findD().getMatches().isEmpty());

		assertMatchCount(7, api.findA());
		assertMatchCount(23, api.findB());
		assertMatchCount(42, api.findC());
		assertMatchCount(73, api.findD());

		api.findA().getMatches().forEach(m -> {
			assertNotNull(m.a().getName());
			assertEquals("new-name", m.a().getName());
		});
		api.findB().getMatches().forEach(m -> {
			assertNotNull(m.b().getName());
			assertEquals("new-name", m.b().getName());
		});
		api.findC().getMatches().forEach(m -> {
			assertNotNull(m.c().getName());
			assertEquals("new-name", m.c().getName());
		});
		api.findD().getMatches().forEach(m -> {
			assertNotNull(m.d().getName());
			assertEquals("new-name", m.d().getName());
		});
	}

	/**
	 * This method should trigger a SmartEMF exception that may occur if model
	 * elements are changed/removed after the initial loading process of the model
	 * and before the first matches are accessed. The main test method has to be
	 * re-run quite some times to actual trigger the bug reliably.
	 * 
	 * Example trace: [ERROR] [05/25/2023 17:01:04.473]
	 * [HiPE-Engine-akka.actor.default-dispatcher-15]
	 * [akka://HiPE-Engine/user/NotificationActor] Index 77 out of bounds for length
	 * 77 java.lang.ArrayIndexOutOfBoundsException: Index 77 out of bounds for
	 * length 77 at
	 * java.base/java.util.LinkedHashMap.keysToArray(LinkedHashMap.java:545) at
	 * java.base/java.util.HashSet.toArray(HashSet.java:368) at
	 * org.emoflon.smartemf.runtime.collections.SmartCollection.toArray(SmartCollection.java:76)
	 */
	@Disabled
	@Test
	public void triggerSmartEmfExceptionRunner() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Run #" + i);
			assertNull(api);
			updateNodesAfterGeneration();
			terminate(api);
			api = null;
		}

	}

	private void updateNodesAfterGeneration() {
		// setup
		api = this.init("GenericNodes-root-only.xmi");
		// initAndSanityCheck();
		// ^ left out on purpose!
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

		// Change names
		root.getNodes().forEach(n -> {
			n.setName("new-name");
		});
	}

}
