package org.benchmarx.processDefinition.core

import org.benchmarx.processDefinition.core.Normalizer
import ProcessDefinition.Module
import ProcessDefinition.Task
import java.util.ArrayList
import java.util.List

class ModuleNormalizer extends Normalizer<Module> {
	
	ImportNormalizer importNormalizer
	TaskNormalizer taskNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		importNormalizer = new ImportNormalizer(checkAttributeValues)
		taskNormalizer = new TaskNormalizer(checkAttributeValues)
	}
	
	override stringify(Module m) {
		return '''
		Module {
			description = "«IF checkAttributeValues»«m.description»«ELSE»description«ENDIF»",
			tasks = [
			«val List<Task> sortedTaskList = new ArrayList<Task>(m.tasks)»
			«taskNormalizer.normalize(sortedTaskList)»
			«FOR t : sortedTaskList SEPARATOR ", "»
				«taskNormalizer.stringify(t)»
			«ENDFOR»
			]
		}
		'''
	}
	
}