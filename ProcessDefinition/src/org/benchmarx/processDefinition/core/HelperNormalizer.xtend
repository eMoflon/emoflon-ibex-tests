package org.benchmarx.processDefinition.core

import org.benchmarx.processDefinition.core.Normalizer
import ProcessDefinition.facade.Helper
import java.util.List
import java.util.ArrayList
import ProcessDefinition.Task

class HelperNormalizer extends Normalizer<Helper> {
	
	TaskNormalizer taskNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		taskNormalizer = new TaskNormalizer(checkAttributeValues)
	}
	
	override stringify(Helper h) {
		return '''
		Helper {
			coloredTasks = [
			«var List<Task> sortedTaskList = new ArrayList<Task>(h.coloredTask)»
			«taskNormalizer.normalize(sortedTaskList)»
			«FOR t : sortedTaskList SEPARATOR ", "»
				«taskNormalizer.stringify(t)»
			«ENDFOR»
			]
			visitedTasks = [
			«sortedTaskList = new ArrayList<Task>(h.visitedTasks)»
			«taskNormalizer.normalize(sortedTaskList)»
			«FOR t : sortedTaskList SEPARATOR ", "»
				«taskNormalizer.stringify(t)»
			«ENDFOR»
			]
			tasks = [
			«sortedTaskList = new ArrayList<Task>(h.tasks)»
			«taskNormalizer.normalize(sortedTaskList)»
			«FOR t : sortedTaskList SEPARATOR ", "»
				«taskNormalizer.stringify(t)»
			«ENDFOR»
			]
		}
		'''
	}
	
}