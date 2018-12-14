package org.benchmarx.mocaTree.core

import org.benchmarx.mocaTree.core.Normalizer
import MocaTree.Attribute

class AttributeNormalizer extends Normalizer<Attribute> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override stringify(Attribute a) {
		return '''
			Attribute {
				name = "«IF checkAttributeValues»«a.name»«ELSE»attribute«ENDIF»",
				index = "«IF checkAttributeValues»«a.index»«ELSE»index«ENDIF»",
				value = "«IF checkAttributeValues»«a.value»«ELSE»value«ENDIF»",
			}
		'''
	}
	
}