package org.benchmarx.blockLanguage.core

import org.benchmarx.blockLanguage.core.Normalizer
import BlockLanguage.Wire

class WireNormalizer extends Normalizer<Wire> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override stringify(Wire w) {
		return '''
			Wire {
				port = "«IF w.port === null»()«ELSE»«IF checkAttributeValues»«w.port.id»«ELSE»portID«ENDIF»«ENDIF»"
			}
		'''
	}
	
}