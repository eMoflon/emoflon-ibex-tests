package org.emoflon.ibex.gt.testsuite.BPMN;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bpmn.gt.api.GtGtAPI;
import bpmn2.Task;

public class BPMNModelCreationTest extends BPMNAbstractTest {

	@Test
	public void insertTaskBetweenExistingTasks() {
		GtGtAPI<?> api = this.init("BPMN-ex1.xmi");
		assertMatchCount(2, api.findTask());
		api.addTaskBetween().setParameters("Step between 1+2");
		assertApplicableAndApply(api.addTaskBetween());
		assertMatchCount(3, api.findTask());

		terminate(api);
	}

	@Test
	public void insertAtEnds() {
		GtGtAPI<?> api = this.init("BPMN-ex1.xmi");

		assertMatchCount(2, api.findTask());
		api.findTaskByName().setParameters("Task 1");
		Task task1 = api.findTaskByName().findAnyMatch(true).get().task();
		api.findTaskByName().setParameters("Task 2");
		Task task2 = api.findTaskByName().findAnyMatch(true).get().task();
		api.addTaskBefore().setParameters("Task 0");
		api.addTaskBefore().bindTo(task1);
		assertApplicableAndApply(api.addTaskBefore());
		assertMatchCount(3, api.findTask());
		api.findTaskByName().setParameters("Task 0");
		Task task0 = api.findTaskByName().findAnyMatch(true).get().task();
		assertEquals(task0, task1.getIncoming().get(0).getSourceRef());

		api.addTaskAfter().setParameters("Task 3");
		api.addTaskAfter().bindFrm(task2);
		assertApplicableAndApply(api.addTaskAfter());
		assertMatchCount(4, api.findTask());
		api.findTaskByName().setParameters("Task 3");
		Task task3 = api.findTaskByName().findAnyMatch(true).get().task();
		assertEquals(task3, task2.getOutgoing().get(0).getTargetRef());

		terminate(api);
	}
}
