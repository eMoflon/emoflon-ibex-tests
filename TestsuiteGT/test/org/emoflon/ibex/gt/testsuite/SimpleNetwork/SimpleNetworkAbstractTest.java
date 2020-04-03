package org.emoflon.ibex.gt.testsuite.SimpleNetwork;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import SimpleNetworkGraphTransformation.api.SimpleNetworkGraphTransformationAPI;
import SimpleNetworkGraphTransformation.api.SimpleNetworkGraphTransformationApp;
	
public class SimpleNetworkAbstractTest extends GTAppTestCase<SimpleNetworkGraphTransformationApp, SimpleNetworkGraphTransformationAPI>{

		@Override
		protected String getTestName() {
			return "SimpleNetwork";
		}

		@Override
		protected SimpleNetworkGraphTransformationApp getApp() {
			return new SimpleNetworkGraphTransformationApp(initEngine(), workspacePath);
		}
}

