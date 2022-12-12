package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import classmultipleinheritance.gt.api.GtGtApi;
import classmultipleinheritance.gt.api.GtHiPEGtApi;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

/**
 * Abstract test class for the ClassMultipleInheritanceHierarchy Graph
 * Transformation Api. All tests for this Api should inherit from this class.
 */
public class ClassMultipleInheritanceHierarchyAbstractTest extends GTAppTestCase<GtGtApi<?>> {

	@Override
	protected String getTestName() {
		return "ClassMultipleInheritanceHierarchy";
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
