package org.emoflon.ibex.gt.testsuite.BPMN;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import BPMNGraphTransformation.api.BPMNGraphTransformationAPI;
import bpmn.gt.api.GtHiPEGtAPI;
import bpmn2.Task;

public class BPMNModelCreationTest extends BPMNAbstractTest {

	@Test
	public void insertTaskBetweenExistingTasks() {
		GtHiPEGtAPI api = this.init("BPMN-insertTaskBetween.xmi", "BPMN-ex1.xmi");

		assertMatchCount(2, api.findTask());
//		api.addTaskBetween().s
		assertApplicable(api.addTaskBetween("Step between 1+2"));
		assertMatchCount(3, api.findTask());

		saveAndTerminate(api);
	}

	@Test
	public void insertAtEnds() {
		GtHiPEGtAPI api = this.init("BPMN-insertAtEnd.xmi", "BPMN-ex1.xmi");

		assertMatchCount(2, api.findTask());
		Task task1 = api.findTaskByName("Task 1").findAnyMatch().get().getTask();
		Task task2 = api.findTaskByName("Task 2").findAnyMatch().get().getTask();
		assertApplicable(api.addTaskBefore("Task 0").bindTo(task1));
		assertMatchCount(3, api.findTask());
		Task task0 = api.findTaskByName("Task 0").findAnyMatch().get().getTask();
		assertEquals(task0, task1.getIncoming().get(0).getSourceRef());

		assertApplicable(api.addTaskAfter("Task 3").bindFrom(task2));
		assertMatchCount(4, api.findTask());
		Task task3 = api.findTaskByName("Task 3").findAnyMatch().get().getTask();
		assertEquals(task3, task2.getOutgoing().get(0).getTargetRef());

		saveAndTerminate(api);
	}
}
