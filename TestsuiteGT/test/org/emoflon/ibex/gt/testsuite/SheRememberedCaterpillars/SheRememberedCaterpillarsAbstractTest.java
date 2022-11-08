package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import SheRememberedCaterpillars.COLOR;
import caterpillars.gt.api.GtGtAPI;
import caterpillars.gt.api.GtHiPEGtAPI;

/**
 * Abstract test class for the SheRememberedCaterpillars Graph Transformation
 * API. All tests for this API should inherit from this class.
 */
public abstract class SheRememberedCaterpillarsAbstractTest extends
		GTAppTestCase<GtGtAPI<?>> {

	@Override
	public String getTestName() {
		return "SheRememberedCaterpillars";
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

	public static void assertCharacterColorCount(final GtGtAPI<?> api,
			final int blueCount, final int redCount, final int purpleCount) {
		assertMatchCount(blueCount, api.findCharacterOfColor(COLOR.BLUE));
		assertMatchCount(redCount, api.findCharacterOfColor(COLOR.RED));
		assertMatchCount(purpleCount, api.findCharacterOfColor(COLOR.PURPLE));
	}
}
