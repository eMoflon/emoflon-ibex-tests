package org.benchmarx.blockLanguage.core

import BlockLanguage.Port
import java.util.List
import java.util.ArrayList
import BlockLanguage.Wire

class PortNormalizer extends Normalizer<Port> {
	
	WireNormalizer wireNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		wireNormalizer = new WireNormalizer(checkAttributeValues)
	}
	
	override stringify(Port p) {
		return '''
			Port {
				id = "«IF checkAttributeValues»«p.id»«ELSE»id«ENDIF»",
				wires = [
					«val List<Wire> sortedWireList = new ArrayList<Wire>(p.wire)»
					«wireNormalizer.normalize(sortedWireList)»
					«FOR w : sortedWireList SEPARATOR ", "»
						«wireNormalizer.stringify(w)»
					«ENDFOR»
				]
			}
		'''
	}
}