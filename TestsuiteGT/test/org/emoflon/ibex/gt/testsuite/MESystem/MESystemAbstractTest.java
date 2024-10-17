package org.emoflon.ibex.gt.testsuite.MESystem;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import mesystem.gt.api.GtGtApi;
import mesystem.gt.api.GtHiPEGtApi;

/**
 * Abstract test class for the MESystem. All tests for this Api should inherit
 * from this class.
 */
public class MESystemAbstractTest extends GTAppTestCase<GtGtApi<?>> {

	@Override
	protected String getTestName() {
		return "MESystem";
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
		default -> {
			yield new GtHiPEGtApi();
		}
		};
	}
}
