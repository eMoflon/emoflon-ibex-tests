package org.emoflon.ibex.gt.testsuite.BPMNIR;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import BPMNIRGraphTransformation.api.BPMNIRGraphTransformationAPI;

public class BPMNInstanceCreationTest extends BPMNIRAbstractTest {

	@Test
	public void insertTaskBetweenExistingTasks() {
		ResourceSet model = this.initResourceSet("BPMN-IR-insertTaskBetween.xmi", "BPMN-IR-ex1.xmi");
		BPMNIRGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findTaskIR());
		assertApplicable(api.addInactiveTaskIRBetweenTasks("C").apply());
		assertMatchCount(3, api.findTaskIR());

		saveResourceSet(model);
	}

	@Test
	public void insertTaskBetweenExistingTasksNotApplicable() {
		ResourceSet model = this.initResourceSet("BPMN-IR-insertTaskBetween2.xmi", "BPMN-IR-ex2.xmi");
		BPMNIRGraphTransformationAPI api = this.initAPI(model);

		assertNotApplicable(api.addInactiveTaskIRBetweenTasks("C").apply());
		assertMatchCount(2, api.findTaskIR());

		saveResourceSet(model);
	}
}
