package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import classmultipleinheritance.gt.api.GtGtAPI;
import classmultipleinheritance.gt.api.GtHiPEGtAPI;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

/**
 * Abstract test class for the ClassMultipleInheritanceHierarchy Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class ClassMultipleInheritanceHierarchyAbstractTest extends GTAppTestCase<GtGtAPI<?>> {

	@Override
	protected String getTestName() {
		return "ClassMultipleInheritanceHierarchy";
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
