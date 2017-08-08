package org.benchmarx.processDefinition.core;

import ProcessDefinition.Import;
import ProcessDefinition.Invocation;
import ProcessDefinition.Module;
import ProcessDefinition.ProcessDefinitionFactory;
import ProcessDefinition.SystemModule;
import ProcessDefinition.Task;

public class ProcessDefinitionHelper {

	public void createSubModule(SystemModule sm, String name) {
		Module subModule = ProcessDefinitionFactory.eINSTANCE.createModule();
		sm.getAllModules().add(subModule);
		subModule.setDescription(name);
	}

	public void createTask(SystemModule sm, String id, int index) {
		Module module = sm.getAllModules().get(index);
		Task task = ProcessDefinitionFactory.eINSTANCE.createTask();
		module.getTasks().add(task);
		task.setSystemModule(sm);
		task.setId(id);
	}

	public void createImport(SystemModule sm, int index, int taskIndex, int importIndex) {
		Task task = sm.getAllModules().get(index).getTasks().get(taskIndex);
		Import immport = ProcessDefinitionFactory.eINSTANCE.createImport();
		task.getImports().add(immport);
		immport.setModule(sm.getAllModules().get(importIndex));
	}

	public void createInvocation(SystemModule sm, int index, int taskIndex, int invocationModuleIndex, int invocationTaskIndex) {
		Task task = sm.getAllModules().get(index).getTasks().get(taskIndex);
		Invocation invocation = ProcessDefinitionFactory.eINSTANCE.createInvocation();
		task.getInvocations().add(invocation);
		invocation.setInvokedTask(sm.getAllModules().get(invocationModuleIndex).getTasks().get(invocationTaskIndex));
	}

}
