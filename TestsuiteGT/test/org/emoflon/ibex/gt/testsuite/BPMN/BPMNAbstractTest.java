package org.emoflon.ibex.gt.testsuite.BPMN;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import BPMNGraphTransformation.api.BPMNGraphTransformationAPI;
import BPMNGraphTransformation.api.BPMNGraphTransformationApp;
import bpmn.gt.api.GtHiPEGtAPI;

/**
 * Abstract test class for the BPMN Graph Transformation API. All tests for this
 * API should inherit from this class.
 */
public class BPMNAbstractTest extends GTAppTestCase<GtHiPEGtAPI> {

	@Override
	protected String getTestName() {
		return "BPMN";
	}

	@Override
	protected GtHiPEGtAPI getApi() {
		return new GtHiPEGtAPI();
	}
}
