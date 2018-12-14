package org.benchmarx.processDefinition.core

import org.benchmarx.processDefinition.core.Normalizer
import ProcessDefinition.Invocation

class InvocationNormalizer extends Normalizer<Invocation> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override stringify(Invocation i) {
		return '''
		Invocation {
			invokedTask = "«IF i.invokedTask === null»()«ELSE»«IF checkAttributeValues»«i.invokedTask.id»«ELSE»task«ENDIF»«ENDIF»",
		}
		'''
	}
	
}