package org.benchmarx.blockDiagram.core

import org.benchmarx.blockDiagram.core.Normalizer
import BlockDiagram.Provide

class ProvideNormalizer extends Normalizer<Provide> {
	
	ConnectorNormalizer connectorNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		connectorNormalizer = new ConnectorNormalizer(checkAttributeValues)
	}
	
	override stringify(Provide p) {
		return '''
			Provide {
				id = "«IF checkAttributeValues»«p.id»«ELSE»id«ENDIF»",
				connector = "«IF checkAttributeValues»«connectorNormalizer.stringify(p.connector)»
							 «ELSE»«IF p.connector === null»()
							 	   «ELSE»connector«ENDIF»«ENDIF»",
			}
		'''
	}
}