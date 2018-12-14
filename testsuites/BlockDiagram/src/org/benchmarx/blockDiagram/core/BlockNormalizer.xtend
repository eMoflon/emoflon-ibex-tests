package org.benchmarx.blockDiagram.core

import BlockDiagram.Block
import BlockDiagram.Port
import java.util.ArrayList
import java.util.List

class BlockNormalizer extends Normalizer<Block> {
	
	PortNormalizer portNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		portNormalizer = new PortNormalizer(checkAttributeValues)
	}
	
	override stringify(Block b) {
		return '''
			Block {
				id = "«IF checkAttributeValues»«b.id»«ELSE»id«ENDIF»",
				ports = [
					«val List<Port> sortedPortList = new ArrayList<Port>(b.ports)»
					«portNormalizer.normalize(sortedPortList)»
					«FOR p : sortedPortList SEPARATOR ", "»
						«portNormalizer.stringify(p)»
					«ENDFOR»
				]
			}
		'''
	}
	
}
