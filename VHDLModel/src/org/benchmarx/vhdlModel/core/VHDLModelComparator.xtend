package org.benchmarx.vhdlModel.core

import org.benchmarx.emf.Comparator
import VHDLModel.VHDLSpecification
import java.util.List
import java.util.ArrayList
import static org.junit.Assert.*
import VHDLModel.Block

class VHDLModelComparator implements Comparator<VHDLSpecification> {
	boolean checkAttributeValues
	
	BlockNormalizer blockNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		
		blockNormalizer = new BlockNormalizer(checkAttributeValues)
	}
	
	override assertEquals(VHDLSpecification expected, VHDLSpecification actual) {
		assertTrue(stringify(expected).startsWith("VHDLSpecification"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def stringify(VHDLSpecification v) {
		return '''
		VHDLSpecification {
			name = "«IF checkAttributeValues»«v.name»«ELSE»vhdlSpecification«ENDIF»",
			blocks = [
			«val List<Block> sortedBlockList = new ArrayList<Block>(v.blocks)»
			«blockNormalizer.normalize(sortedBlockList)»
			«FOR b : sortedBlockList SEPARATOR ", "»
				«blockNormalizer.stringify(b)»
			«ENDFOR»
			]
		}
		'''
	}
	
	
}