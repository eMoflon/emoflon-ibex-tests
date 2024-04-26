package org.emoflon.ibex.gt.testsuite.HospitalTransformation;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import hospital.gt.api.GtGtApi;
import hospital.gt.api.GtHiPEGtApi;

	
public class HospitalTransformationAbstractTest extends GTAppTestCase<GtGtApi<?>>{

		@Override
		protected String getTestName() {
			return "HospitalTransformation";
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

