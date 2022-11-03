package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import SheRememberedCaterpillars.COLOR;
import caterpillars.gt.api.GtHiPEGtAPI;

/**
 * Abstract test class for the SheRememberedCaterpillars Graph Transformation
 * API. All tests for this API should inherit from this class.
 */
public abstract class SheRememberedCaterpillarsAbstractTest extends
		GTAppTestCase<GtHiPEGtAPI> {

	@Override
	public String getTestName() {
		return "SheRememberedCaterpillars";
	}

	@Override
	protected GtHiPEGtAPI getApi() {
		return new GtHiPEGtAPI();
	}

	public static void assertCharacterColorCount(final GtHiPEGtAPI api,
			final int blueCount, final int redCount, final int purpleCount) {
		assertMatchCount(blueCount, api.findCharacterOfColor(COLOR.BLUE));
		assertMatchCount(redCount, api.findCharacterOfColor(COLOR.RED));
		assertMatchCount(purpleCount, api.findCharacterOfColor(COLOR.PURPLE));
	}
}
