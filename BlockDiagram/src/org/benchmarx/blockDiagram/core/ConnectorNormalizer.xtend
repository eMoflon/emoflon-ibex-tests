package org.benchmarx.blockDiagram.core

import org.benchmarx.blockDiagram.core.Normalizer
import BlockDiagram.Connector

class ConnectorNormalizer extends Normalizer<Connector> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override stringify(Connector c) {
		return '''
			Connector {
				sub = «IF c.sub !== null»«c.sub.id»«ELSE»()«ENDIF»
				pub = «IF c.pub !== null»«c.pub.id»«ELSE»()«ENDIF»
			}
		'''
	}
	
}