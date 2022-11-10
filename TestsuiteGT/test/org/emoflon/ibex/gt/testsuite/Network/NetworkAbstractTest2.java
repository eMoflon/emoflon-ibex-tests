package org.emoflon.ibex.gt.testsuite.Network;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import network.gt2.api.Gt2GtAPI;
import network.gt2.api.Gt2HiPEGtAPI;
	
public class NetworkAbstractTest2 extends GTAppTestCase<Gt2GtAPI<?>>{
		
		protected String engine = GTAppTestCase.PM_DEFAULT;
		
		@Override
		protected String getTestName() {
			return "Network";
		}

		@Override
		protected Gt2GtAPI<?> getApi() {
			return getApi(patternMatcher);
		}
		
		@Override
		protected Gt2GtAPI<?> getApi(String patternMatcher) {
			return switch(patternMatcher) {
				case PM_HIPE -> {yield new Gt2HiPEGtAPI();}
				case PM_VIATRA ->{throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
				case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
				default -> {yield new Gt2HiPEGtAPI();}
			};
		}
}
