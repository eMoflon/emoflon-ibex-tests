package org.benchmarx.processDefinition.core

import org.benchmarx.processDefinition.core.Normalizer
import ProcessDefinition.Task
import ProcessDefinition.Invocation
import java.util.ArrayList
import java.util.List
import ProcessDefinition.Import

class TaskNormalizer extends Normalizer<Task> {
	
	InvocationNormalizer invocationNormalizer
	ImportNormalizer importNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		invocationNormalizer = new InvocationNormalizer(checkAttributeValues)
		importNormalizer = new ImportNormalizer(checkAttributeValues)
	}
	
	override stringify(Task t) {
		return '''
		Task {
			id = "«IF checkAttributeValues»«t.id»«ELSE»id«ENDIF»",
			imports = [
			«val List<Import> sortedImportList = new ArrayList<Import>(t.imports)»
			«importNormalizer.normalize(sortedImportList)»
			«FOR i : sortedImportList SEPARATOR ", "»
				«importNormalizer.stringify(i)»
			«ENDFOR»
			]
			invocation = [
			«val List<Invocation> sortedInvocationList = new ArrayList<Invocation>(t.invocation)»
			«invocationNormalizer.normalize(sortedInvocationList)»
			«FOR i : sortedInvocationList SEPARATOR ", "»
				«invocationNormalizer.stringify(i)»
			«ENDFOR»
			]
			invocations = [
			«val List<Invocation> sortedInvocationsList = new ArrayList<Invocation>(t.invocations)»
			«invocationNormalizer.normalize(sortedInvocationsList)»
			«FOR i : sortedInvocationsList SEPARATOR ", "»
				«invocationNormalizer.stringify(i)»
			«ENDFOR»
			]
		}
		'''
	}
	
}