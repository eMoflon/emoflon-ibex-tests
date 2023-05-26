package org.emoflon.ibex.gt.testsuite.GenericNodes;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import GenericNodes.A;
import GenericNodes.B;
import GenericNodes.C;
import GenericNodes.D;
import GenericNodes.GenericNodesFactory;
import GenericNodes.NamedElement;
import GenericNodes.Root;
import genericnodes.gt.api.GtGtApi;
import genericnodes.gt.api.GtHiPEGtApi;

public abstract class GenericNodesAbstractTest extends GTAppTestCase<GtGtApi<?>> {

	@Override
	protected String getTestName() {
		return "GenericNodes";
	}

	@Override
	protected GtGtApi<?> getApi() {
		return getApi(patternMatcher);
	}

	@Override
	protected GtGtApi<?> getApi(String patternMatcher) {
		return switch (patternMatcher) {
		case PM_HIPE -> {
			yield new GtHiPEGtApi();
		}
		case PM_VIATRA -> {
			throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);
		}
		case PM_DEMOCLES -> {
			throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);
		}
		default -> {
			yield new GtHiPEGtApi();
		}
		};
	}

	GtGtApi<?> api;

	@AfterEach
	public void tearDown() {
		if (api != null) {
			terminate(api);
		}
	}

	@BeforeEach
	public void preCheck() {
		assertNull(api);
	}

	/**
	 * This method loads the initial XMI model and does a small sanity check
	 * afterwards. Its purpose is to prevent IndexOutOfBoundsException(s) in
	 * SmartEMF.
	 */
	protected void initAndSanityCheck() {
		// Setup
		api = this.init("GenericNodes-root-only.xmi");

		// Checks
		assertMatchCounts(1, 0, 0, 0, 0, api);
	}

	/*
	 * Utility methods.
	 */

	protected void assertMatchCounts(final int root, final int a, final int b, final int c, final int d,
			final GtGtApi<?> api) {
		assertMatchCount(root, api.findRoot());
		assertMatchCount(a + b + c + d, api.findAllNodes());
		assertMatchCount(a, api.findA());
		assertMatchCount(b, api.findB());
		assertMatchCount(c, api.findC());
		assertMatchCount(d, api.findD());
	}

	protected NamedElement genDummyNode(final NodeType nodeType, final String nodeName) {
		return switch (nodeType) {
		case A -> {
			final A a = GenericNodesFactory.eINSTANCE.createA();
			a.setName(nodeName);
			yield a;
		}
		case B -> {
			final B b = GenericNodesFactory.eINSTANCE.createB();
			b.setName(nodeName);
			yield b;
		}
		case C -> {
			final C c = GenericNodesFactory.eINSTANCE.createC();
			c.setName(nodeName);
			yield c;
		}
		case D -> {
			final D d = GenericNodesFactory.eINSTANCE.createD();
			d.setName(nodeName);
			yield d;
		}
		default -> {
			throw new UnsupportedOperationException();
		}
		};
	}

	protected Root getRoot() {
		return (Root) api.getModel().getResources().get(0).getContents().get(0);
	}

	protected enum NodeType {
		A, B, C, D
	}

}
