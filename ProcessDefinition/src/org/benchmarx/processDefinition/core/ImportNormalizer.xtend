package org.benchmarx.processDefinition.core

import org.benchmarx.processDefinition.core.Normalizer
import ProcessDefinition.Import

class ImportNormalizer extends Normalizer<Import> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override stringify(Import i) {
		return '''
		Import {
			module = "«IF i.module === null»()«ELSE»«IF checkAttributeValues»«i.module.description»«ELSE»module«ENDIF»«ENDIF»",
		}
		'''
	}
	
}