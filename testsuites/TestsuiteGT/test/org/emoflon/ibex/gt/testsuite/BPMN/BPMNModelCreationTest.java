package org.emoflon.ibex.gt.testsuite.BPMN;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import BPMNGraphTransformation.api.BPMNGraphTransformationAPI;
import bpmn2.Task;

public class BPMNModelCreationTest extends BPMNAbstractTest {

	@Test
	public void insertTaskBetweenExistingTasks() {
		ResourceSet model = this.initResourceSet("BPMN-insertTaskBetween.xmi", "BPMN-ex1.xmi");
		BPMNGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findTask());
		assertApplicable(api.addTaskBetween("Step between 1+2").apply());
		assertMatchCount(3, api.findTask());

		saveResourceSet(model);
	}

	@Test
	public void insertAtEnds() {
		ResourceSet model = this.initResourceSet("BPMN-insertAtEnd.xmi", "BPMN-ex1.xmi");
		BPMNGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findTask());
		Task task1 = api.findTaskByName("Task 1").findAnyMatch().get().getTask();
		Task task2 = api.findTaskByName("Task 2").findAnyMatch().get().getTask();
		assertApplicable(api.addTaskBefore("Task 0").bindTo(task1).apply());
		assertMatchCount(3, api.findTask());
		Task task0 = api.findTaskByName("Task 0").findAnyMatch().get().getTask();
		assertEquals(task0, task1.getIncoming().get(0).getSourceRef());

		assertApplicable(api.addTaskAfter("Task 3").bindFrom(task2).apply());
		assertMatchCount(4, api.findTask());
		Task task3 = api.findTaskByName("Task 3").findAnyMatch().get().getTask();
		assertEquals(task3, task2.getOutgoing().get(0).getTargetRef());

		saveResourceSet(model);
	}
}
