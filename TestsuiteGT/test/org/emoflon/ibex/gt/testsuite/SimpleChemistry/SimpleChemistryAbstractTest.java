package org.emoflon.ibex.gt.testsuite.SimpleChemistry;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import SimpleChemistryGraphTransformation.api.SimpleChemistryGraphTransformationAPI;
import SimpleChemistryGraphTransformation.api.SimpleChemistryGraphTransformationApp;



public class SimpleChemistryAbstractTest extends GTAppTestCase<SimpleChemistryGraphTransformationApp, SimpleChemistryGraphTransformationAPI>  {

	@Override
	protected String getTestName() {
		return "SimpleChemistry";
	}

	@Override
	protected SimpleChemistryGraphTransformationApp getApp() {
		return new SimpleChemistryGraphTransformationApp(initEngine(), workspacePath);
	}
}
