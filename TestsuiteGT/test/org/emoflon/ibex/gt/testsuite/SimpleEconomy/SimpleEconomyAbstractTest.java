package org.emoflon.ibex.gt.testsuite.SimpleEconomy;

import SimpleEconomyGraphTransformation.api.SimpleEconomyGraphTransformationAPI;
import SimpleEconomyGraphTransformation.api.SimpleEconomyGraphTransformationApp;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

public class SimpleEconomyAbstractTest extends GTAppTestCase<SimpleEconomyGraphTransformationApp, SimpleEconomyGraphTransformationAPI>  {

	@Override
	protected String getTestName() {
		return "SimpleEconomy";
	}

	@Override
	protected SimpleEconomyGraphTransformationApp getApp() {
		return new SimpleEconomyGraphTransformationApp(initEngine(), workspacePath);
	}
}