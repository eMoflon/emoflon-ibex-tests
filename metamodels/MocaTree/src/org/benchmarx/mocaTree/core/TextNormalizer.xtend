package org.benchmarx.mocaTree.core

import org.benchmarx.mocaTree.core.Normalizer
import MocaTree.Text

class TextNormalizer extends Normalizer<Text> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override stringify(Text t) {
		return '''
			Text {
				name = "«IF checkAttributeValues»«t.name»«ELSE»text«ENDIF»",
				index = "«IF checkAttributeValues»«t.index»«ELSE»index«ENDIF»",
			}
		'''
	}
	
}