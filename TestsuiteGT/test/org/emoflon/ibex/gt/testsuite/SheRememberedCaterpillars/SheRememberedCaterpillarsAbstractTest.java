package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import SheRememberedCaterpillars.COLOR;
import caterpillars.gt.api.GtGtApi;
import caterpillars.gt.api.GtHiPEGtApi;

/**
 * Abstract test class for the SheRememberedCaterpillars Graph Transformation
 * Api. All tests for this Api should inherit from this class.
 */
public abstract class SheRememberedCaterpillarsAbstractTest extends
		GTAppTestCase<GtGtApi<?>> {

	@Override
	public String getTestName() {
		return "SheRememberedCaterpillars";
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

	public static void assertCharacterColorCount(final GtGtApi<?> api,
			final int blueCount, final int redCount, final int purpleCount) {
		assertMatchCount(blueCount, api.findCharacterOfColor(COLOR.BLUE));
		assertMatchCount(redCount, api.findCharacterOfColor(COLOR.RED));
		assertMatchCount(purpleCount, api.findCharacterOfColor(COLOR.PURPLE));
	}
}
