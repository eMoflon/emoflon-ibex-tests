package org.emoflon.ibex.gt.testsuite.BPMNIR;

import org.junit.Test;

import BPMNIRGraphTransformation.api.BPMNIRGraphTransformationAPI;

public class BPMNInstanceCreationTest extends BPMNIRAbstractTest {

	@Test
	public void insertTaskBetweenExistingTasks() {
		BPMNIRGraphTransformationAPI api = init("BPMN-IR-insertTaskBetween.xmi", "BPMN-IR-ex1.xmi");

		assertMatchCount(2, api.findTaskIR());
		assertApplicable(api.addInactiveTaskIRBetweenTasks("C"));
		assertMatchCount(3, api.findTaskIR());

		saveAndTerminate(api);
	}

	@Test
	public void insertTaskBetweenExistingTasksNotApplicable() {
		BPMNIRGraphTransformationAPI api = init("BPMN-IR-insertTaskBetween2.xmi", "BPMN-IR-ex2.xmi");

		assertNotApplicable(api.addInactiveTaskIRBetweenTasks("C").apply());
		assertMatchCount(2, api.findTaskIR());

		saveAndTerminate(api);
	}
}
