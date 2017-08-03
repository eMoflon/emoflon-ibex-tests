package org.benchmarx.vhdlModel.core

import org.benchmarx.vhdlModel.core.Normalizer
import VHDLModel.Block
import java.util.ArrayList
import java.util.List
import VHDLModel.CompositeBlock
import VHDLModel.ComplexBlock
import VHDLModel.Port
import VHDLModel.BlockRef
import VHDLModel.AndGate
import VHDLModel.OrGate
import VHDLModel.BinaryGate
import VHDLModel.NotGate

class BlockNormalizer extends Normalizer<Block> {
	PortNormalizer portNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		
		portNormalizer = new PortNormalizer(checkAttributeValues)
	}
	
	override stringify(Block b) {
		if (b instanceof CompositeBlock)
			return stringifyCompositeBlock(b)
		else if (b instanceof BlockRef)
			return stringifyBlockRef(b)
		else if (b instanceof AndGate)
			return stringifyAndGate(b)
		else if (b instanceof OrGate)
			return stringifyOrGate(b)
		else if (b instanceof NotGate)
			return stringifyNotGate(b)
	}
	
	private def stringifyNotGate(NotGate ng) {
		return '''
		NotGate {
			«stringifyBlockProperties(ng)»
			«stringifyNotGateProperties(ng)»
		}
		'''
	}
	
	private def stringifyOrGate(OrGate og) {
		return '''
		OrGate {
			«stringifyBlockProperties(og)»
			«stringifyBinaryGateProperties(og)»
		}
		'''
	}
	
	private def stringifyAndGate(AndGate ag) {
		return '''
		AndGate {
			«stringifyBlockProperties(ag)»
			«stringifyBinaryGateProperties(ag)»
		}
		'''
	}
	
	private def stringifyBlockRef(BlockRef br) {
		return '''
		BlockRef {
			«stringifyBlockProperties(br)»
			«stringifyComplexBlockProperties(br)»
			«stringifyBlockRefProperties(br)»
		}
		'''
	}
	
	private def stringifyCompositeBlock(CompositeBlock cb) {
		return '''
		CompositeBlock {
			«stringifyBlockProperties(cb)»
			«stringifyComplexBlockProperties(cb)»
			«stringifyCompositeBlockProperties(cb)»
		}
		'''
	}
		
	private def stringifyBlockProperties(Block b) {
		return '''
			name = "«IF checkAttributeValues»«b.name»«ELSE»block«ENDIF»",
			inputs = [
			«val List<Port> sortedPortList = new ArrayList<Port>(b.inputs)»
			«portNormalizer.normalize(sortedPortList)»
			«FOR i : sortedPortList SEPARATOR ", "»
				«portNormalizer.stringify(i)»
			«ENDFOR»
			]
		'''
	}
	
	private def stringifyBlockRefProperties(BlockRef br) {
		return '''
			block = "«IF br.block === null»()«ELSE»«IF checkAttributeValues»«br.block.name»«ELSE»block«ENDIF»«ENDIF»",
		'''
	}
	
	private def stringifyCompositeBlockProperties(CompositeBlock cb) {
		return '''
			blocks = [
			«val List<Block> sortedBlockList = new ArrayList<Block>(cb.blocks)»
			«normalize(sortedBlockList)»
			«FOR b : sortedBlockList SEPARATOR ", "»
				«stringify(b)»
			«ENDFOR»
			]
		'''
	}
	
	private def stringifyComplexBlockProperties(ComplexBlock cb) {
		return '''
			ports = [
			«val List<Port> sortedPortList = new ArrayList<Port>(cb.ports)»
			«portNormalizer.normalize(sortedPortList)»
			«FOR p : sortedPortList SEPARATOR ", "»
				«portNormalizer.stringify(p)»
			«ENDFOR»
			]
		'''
	}
	
	private def stringifyNotGateProperties(NotGate ng) {
		return '''
			inputPort = "«IF ng.inputport === null»()«ELSE»«portNormalizer.stringify(ng.inputport)»«ENDIF»",
			outputPort = "«IF ng.outputport === null»()«ELSE»«portNormalizer.stringify(ng.outputport)»«ENDIF»",
		'''
	}
	
	private def stringifyBinaryGateProperties(BinaryGate bg) {
		return '''
			inputPort1 = "«IF bg.inputport1 === null»()«ELSE»«portNormalizer.stringify(bg.inputport1)»«ENDIF»",
			inputPort2 = "«IF bg.inputport2 === null»()«ELSE»«portNormalizer.stringify(bg.inputport2)»«ENDIF»",
			outputPort = "«IF bg.outputport === null»()«ELSE»«portNormalizer.stringify(bg.outputport)»«ENDIF»",
		'''
	}
	
}