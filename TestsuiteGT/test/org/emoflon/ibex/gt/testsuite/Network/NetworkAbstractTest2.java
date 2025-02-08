package org.emoflon.ibex.gt.testsuite.Network;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import network.gt2.api.Gt2GtApi;
import network.gt2.api.Gt2HiPEGtApi;
	
public class NetworkAbstractTest2 extends GTAppTestCase<Gt2GtApi<?>>{
		
		protected String engine = GTAppTestCase.PM_DEFAULT;
		
		@Override
		protected String getTestName() {
			return "Network";
		}

		@Override
		protected Gt2GtApi<?> getApi() {
			return getApi(patternMatcher);
		}
		
		@Override
		protected Gt2GtApi<?> getApi(String patternMatcher) {
			return switch(patternMatcher) {
				case PM_HIPE -> {yield new Gt2HiPEGtApi();}
				default -> {yield new Gt2HiPEGtApi();}
			};
		}
}

