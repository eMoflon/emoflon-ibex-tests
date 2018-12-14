package org.benchmarx.blockLanguage.core

import java.util.ArrayList
import java.util.List
import BlockLanguage.Block
import BlockLanguage.Port

class BlockNormalizer extends Normalizer<Block> {
	
	PortNormalizer portNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		portNormalizer = new PortNormalizer(checkAttributeValues)
	}
	
	override stringify(Block b) {
		return '''
			Block {
				name = "«IF checkAttributeValues»«b.name»«ELSE»name«ENDIF»",
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
