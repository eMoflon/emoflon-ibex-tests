package org.benchmarx.itLanguage.core

import ITLanguage.PC

class PCNormalizer extends Normalizer<PC> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}

	
	override String stringify(PC pc) {
		'''
		PC {
			name = "«IF checkAttributeValues»«pc.name»«ELSE»pc«ENDIF»"
		}
		'''
	}
}