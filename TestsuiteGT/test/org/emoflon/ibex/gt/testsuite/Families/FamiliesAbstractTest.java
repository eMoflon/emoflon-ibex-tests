package org.emoflon.ibex.gt.testsuite.Families;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import families.gt.api.GtGtApi;
import families.gt.api.GtHiPEGtApi;


/**
 * Abstract test class for the SimpleFamilies Graph Transformation Api. All
 * tests for this Api should inherit from this class.
 */
public abstract class FamiliesAbstractTest
		extends GTAppTestCase<GtGtApi<?>> {

	@Override
	public String getTestName() {
		return "Families";
	}

	@Override
	protected GtGtApi<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtApi<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtApi();}
			case PM_VIATRA ->{throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
			case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
			default -> {yield new GtHiPEGtApi();}
		};
	}
}
