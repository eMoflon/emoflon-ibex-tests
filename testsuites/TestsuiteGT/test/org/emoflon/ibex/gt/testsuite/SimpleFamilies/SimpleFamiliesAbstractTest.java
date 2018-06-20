package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationApp;

/**
 * Abstract test class for the SimpleFamilies Graph Transformation API. All
 * tests for this API should inherit from this class.
 */
public abstract class SimpleFamiliesAbstractTest
		extends GTAppTestCase<SimpleFamiliesGraphTransformationApp, SimpleFamiliesGraphTransformationAPI> {

	@Override
	public String getTestName() {
		return "SimpleFamilies";
	}

	@Override
	protected SimpleFamiliesGraphTransformationApp getApp() {
		return new SimpleFamiliesGraphTransformationApp(initEngine(), workspacePath);
	}
}
