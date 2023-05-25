package org.emoflon.ibex.gt.testsuite.GenericNodes;

import genericnodes.gt.api.GtGtApi;
import genericnodes.gt.api.GtHiPEGtApi;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtApi();}
			case PM_VIATRA -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
			case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
			default -> {yield new GtHiPEGtApi();}
		};
	}
	
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
	
}
