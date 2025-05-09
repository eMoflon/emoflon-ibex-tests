package org.emoflon.ibex.gt.testsuite.VoterModel;

import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import VoterModelGraphTransformation.api.VoterModelGraphTransformationAPI;
import VoterModelGraphTransformation.api.VoterModelGraphTransformationApp;

/**
 * Abstract test class for the VoterModel Graph Transformation API. All tests
 * for this API should inherit from this class.
 */
public class VoterModelAbstractTest
		extends GTAppTestCase<VoterModelGraphTransformationApp, VoterModelGraphTransformationAPI> {

	protected String patternMatcher = PM_DEFAULT;

	public void setPatternMatcher(final String patternMatcher) {
		this.patternMatcher = patternMatcher;
	}

	@Override
	protected VoterModelGraphTransformationAPI init(final String modelInstanceFileName) {
		VoterModelGraphTransformationApp app = this.getApp();
		this.createModel(app, modelInstanceFileName, modelInstanceFileName);
		return app.initAPI();
	}

	@Override
	protected IContextPatternInterpreter initEngine() {
		IContextPatternInterpreter engine;
		try {
			switch (patternMatcher) {
			case PM_HIPE:
				engine = new HiPEGTEngine();
				break;
			default:
				throw new RuntimeException(patternMatcher + " is not a supported as a pattern matcher!");
			}
		} catch (Exception e) {
			System.err.println("Pattern Matcher is not specified. Defaulting to " + PM_DEFAULT);
			engine = new HiPEGTEngine();
		}

		engine.setDebugPath("./debug/" + this.getTestName());
		return engine;
	}

	@Override
	protected String getTestName() {
		return "VoterModel";
	}

	@Override
	protected VoterModelGraphTransformationApp getApp() {
		return new VoterModelGraphTransformationApp(initEngine(), workspacePath);
	}
}
