package org.emoflon.ibex.gt.testsuite.Families;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import families.gt.api.GtGtAPI;
import families.gt.api.GtHiPEGtAPI;


/**
 * Abstract test class for the SimpleFamilies Graph Transformation API. All
 * tests for this API should inherit from this class.
 */
public abstract class FamiliesAbstractTest
		extends GTAppTestCase<GtGtAPI<?>> {

	@Override
	public String getTestName() {
		return "Families";
	}

	@Override
	protected GtGtAPI<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtAPI<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtAPI();}
			case PM_VIATRA ->{throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
			case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
			default -> {yield new GtHiPEGtAPI();}
		};
	}
}
