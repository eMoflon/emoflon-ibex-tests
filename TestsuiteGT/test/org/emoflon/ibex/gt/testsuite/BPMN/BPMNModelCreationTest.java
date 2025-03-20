package org.emoflon.ibex.gt.testsuite.BPMN;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bpmn.gt.api.GtGtApi;
import bpmn2.Task;

public class BPMNModelCreationTest extends BPMNAbstractTest {

	@Test
	public void insertTaskBetweenExistingTasks() {
		GtGtApi<?> Api = this.init("BPMN-ex1.xmi");
		assertMatchCount(2, Api.findTask());
		Api.addTaskBetween().setParameters("Step between 1+2");
		assertApplicableAndApply(Api.addTaskBetween());
		assertMatchCount(3, Api.findTask());

		terminate(Api);
	}

	@Test
	public void insertAtEnds() {
		GtGtApi<?> Api = this.init("BPMN-ex1.xmi");

		assertMatchCount(2, Api.findTask());
		Api.findTaskByName().setParameters("Task 1");
		Task task1 = Api.findTaskByName().findAnyMatch(true).get().task();
		Api.findTaskByName().setParameters("Task 2");
		Task task2 = Api.findTaskByName().findAnyMatch(true).get().task();
		Api.addTaskBefore().setParameters("Task 0");
		Api.addTaskBefore().bindTo(task1);
		assertApplicableAndApply(Api.addTaskBefore());
		assertMatchCount(3, Api.findTask());
		Api.findTaskByName().setParameters("Task 0");
		Task task0 = Api.findTaskByName().findAnyMatch(true).get().task();
		assertEquals(task0, task1.getIncoming().get(0).getSourceRef());

		Api.addTaskAfter().setParameters("Task 3");
		Api.addTaskAfter().bindFrm(task2);
		assertApplicableAndApply(Api.addTaskAfter());
		assertMatchCount(4, Api.findTask());
		Api.findTaskByName().setParameters("Task 3");
		Task task3 = Api.findTaskByName().findAnyMatch(true).get().task();
		assertEquals(task3, task2.getOutgoing().get(0).getTargetRef());

		terminate(Api);
	}
}
