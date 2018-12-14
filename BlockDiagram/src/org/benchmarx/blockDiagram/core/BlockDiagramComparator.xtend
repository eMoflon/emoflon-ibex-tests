package org.benchmarx.blockDiagram.core

import org.benchmarx.emf.Comparator
import static org.junit.Assert.*
import java.util.List
import java.util.ArrayList
import BlockDiagram.BlockSystem
import BlockDiagram.Block

class BlockDiagramComparator implements Comparator<BlockSystem> {
	boolean checkAttributeValues
	
	BlockNormalizer blockNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		
		blockNormalizer = new BlockNormalizer(checkAttributeValues)
	}
	
	override assertEquals(BlockSystem expected, BlockSystem actual) {
		assertTrue(stringify(expected).startsWith("BlockSystem"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def stringify(BlockSystem bs) {
		return '''
			BlockSystem {
				name = "«IF checkAttributeValues»«bs.name»«ELSE»blockSystem«ENDIF»",
				blocks = [
					«val List<Block> sortedBlockList = new ArrayList<Block>(bs.blocks)»
					«blockNormalizer.normalize(sortedBlockList)»
					«FOR t : sortedBlockList SEPARATOR ", "»
						«blockNormalizer.stringify(t)»
					«ENDFOR»
				]
			}
		'''
	}
}
