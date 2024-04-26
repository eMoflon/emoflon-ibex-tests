package org.emoflon.ibex.gt.testsuite.Economy;

import economy.gt.api.GtGtApi;
import economy.gt.api.GtHiPEGtApi;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;


public class EconomyAbstractTest extends GTAppTestCase<GtGtApi<?>>  {

	@Override
	protected String getTestName() {
		return "Economy";
	}

	@Override
	protected GtGtApi<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtApi<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtApi();}
			default -> {yield new GtHiPEGtApi();}
		};
	}
}