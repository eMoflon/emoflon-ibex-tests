package org.emoflon.ibex.gt.testsuite.SimpleNetwork;

import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;
import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import SimpleNetworkGraphTransformation2.api.SimpleNetworkGraphTransformation2API;
import SimpleNetworkGraphTransformation2.api.SimpleNetworkGraphTransformation2App;
	
public class SimpleNetworkAbstractTest2 extends GTAppTestCase<SimpleNetworkGraphTransformation2App, SimpleNetworkGraphTransformation2API>{
		
		protected String engine = GTAppTestCase.PM_DEFAULT;
		
		@Override
		protected String getTestName() {
			return "SimpleNetwork";
		}

		@Override
		protected SimpleNetworkGraphTransformation2App getApp() {
			IContextPatternInterpreter interpreter = initEngine();
			if(interpreter instanceof DemoclesGTEngine) {
				engine = GTAppTestCase.PM_DEMOCLES;
			} else if(interpreter instanceof HiPEGTEngine) {
				engine = GTAppTestCase.PM_HIPE;
			}
			return new SimpleNetworkGraphTransformation2App(interpreter, workspacePath);
		}
}

