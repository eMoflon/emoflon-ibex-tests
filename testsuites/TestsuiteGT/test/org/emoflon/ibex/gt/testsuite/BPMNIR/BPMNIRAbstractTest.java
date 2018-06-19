package org.emoflon.ibex.gt.testsuite.BPMNIR;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import BPMNIRGraphTransformation.api.BPMNIRGraphTransformationAPI;
import BPMNIRGraphTransformation.api.BPMNIRGraphTransformationApp;

/**
 * Abstract test class for the BPMN IR Graph Transformation API. All tests for
 * this API should inherit from this class.
 */
public class BPMNIRAbstractTest extends GTAppTestCase<BPMNIRGraphTransformationApp, BPMNIRGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "BPMN-IR";
	}

	@Override
	protected BPMNIRGraphTransformationApp getApp() {
		return new BPMNIRGraphTransformationApp();
	}
}
