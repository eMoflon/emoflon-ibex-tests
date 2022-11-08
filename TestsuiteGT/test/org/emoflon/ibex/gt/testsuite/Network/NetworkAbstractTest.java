package org.emoflon.ibex.gt.testsuite.Network;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import network.gt1.api.Gt1GtAPI;
import network.gt1.api.Gt1HiPEGtAPI;
	
public class NetworkAbstractTest extends GTAppTestCase<Gt1GtAPI<?>>{

		@Override
		protected String getTestName() {
			return "Network";
		}

		@Override
		protected Gt1GtAPI<?> getApi() {
			return getApi(patternMatcher);
		}
		
		@Override
		protected Gt1GtAPI<?> getApi(String patternMatcher) {
			return switch(patternMatcher) {
				case PM_HIPE -> {yield new Gt1HiPEGtAPI();}
				case PM_VIATRA ->{throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
				case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
				default -> {yield new Gt1HiPEGtAPI();}
			};
		}
}

