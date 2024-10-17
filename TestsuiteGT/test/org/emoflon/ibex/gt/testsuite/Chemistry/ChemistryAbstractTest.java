package org.emoflon.ibex.gt.testsuite.Chemistry;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import chemistry.gt.api.GtGtApi;
import chemistry.gt.api.GtHiPEGtApi;

public class ChemistryAbstractTest extends GTAppTestCase<GtGtApi<?>>  {

	@Override
	protected String getTestName() {
		return "Chemistry";
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
