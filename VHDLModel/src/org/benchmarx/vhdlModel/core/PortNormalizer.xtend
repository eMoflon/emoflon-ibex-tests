package org.benchmarx.vhdlModel.core

import org.benchmarx.vhdlModel.core.Normalizer
import VHDLModel.Port
import VHDLModel.InputPort
import VHDLModel.OutputPort
import VHDLModel.Signal

class PortNormalizer extends Normalizer<Port> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	
	override stringify(Port p) {
		if (p instanceof InputPort)
			return stringifyInputPort(p)
		else if (p instanceof OutputPort)
			return stringifyOutputPort(p)
		else if (p instanceof Signal)
			return stringifySignal(p)
	}
	
	private def stringifyInputPort(InputPort ip) {
		return '''
		InputPort {
			«stringifyPortProperties(ip)»
		}
		'''
	}
	
	private def stringifyOutputPort(OutputPort op) {
		return '''
		OutputPort {
			«stringifyPortProperties(op)»
		}
		'''
	}
	
	private def stringifySignal(Signal s) {
		return '''
		Signal {
			«stringifyPortProperties(s)»
		}
		'''
	}
	
	private def stringifyPortProperties(Port p) {
		return '''
			name = "«IF checkAttributeValues»«p.name»«ELSE»block«ENDIF»",
			high = "«IF checkAttributeValues»«p.high»«ELSE»bool«ENDIF»",
			block = "«IF p.block === null»()«ELSE»«IF checkAttributeValues»«p.block.name»«ELSE»block«ENDIF»«ENDIF»",
			src = "«IF p.src === null»()«ELSE»«IF checkAttributeValues»«p.src.name»«ELSE»src«ENDIF»«ENDIF»",
		'''
	}
	
}