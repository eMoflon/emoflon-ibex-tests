package org.benchmarx.blockDiagram.core

import org.benchmarx.blockDiagram.core.Normalizer
import BlockDiagram.Require

class RequireNormalizer extends Normalizer<Require> {
	
	ConnectorNormalizer connectorNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		connectorNormalizer = new ConnectorNormalizer(checkAttributeValues)
	}
	
	override stringify(Require r) {
		return '''
			Require {
				id = "«IF checkAttributeValues»«r.id»«ELSE»id«ENDIF»",
				connector = "«IF checkAttributeValues»«connectorNormalizer.stringify(r.connector)»
							 «ELSE»«IF r.connector === null»()
							 	   «ELSE»connector«ENDIF»«ENDIF»",
			}
		'''
	}
}