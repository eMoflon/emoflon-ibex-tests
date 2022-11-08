package org.emoflon.ibex.gt.testsuite.HospitalTransformation;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import hospital.gt.api.GtGtAPI;
import hospital.gt.api.GtHiPEGtAPI;

	
public class HospitalTransformationAbstractTest extends GTAppTestCase<GtGtAPI<?>>{

		@Override
		protected String getTestName() {
			return "HospitalTransformation";
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

