package org.benchmarx.blockDiagram.core

import org.benchmarx.blockDiagram.core.Normalizer
import BlockDiagram.Port

class PortNormalizer extends Normalizer<Port> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override stringify(Port p) {
		return '''
			Port {
				id = "«IF checkAttributeValues»«p.id»«ELSE»id«ENDIF»",
			}
		'''
	}
}