package org.benchmarx.blockLanguage.core

import org.benchmarx.emf.Comparator
import static org.junit.Assert.*
import java.util.List
import java.util.ArrayList
import BlockLanguage.Specification
import BlockLanguage.Block

class BlockLanguageComparator implements Comparator<Specification> {
	boolean checkAttributeValues
	
	BlockNormalizer blockNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		
		blockNormalizer = new BlockNormalizer(checkAttributeValues)
	}
	
	override assertEquals(Specification expected, Specification actual) {
		assertTrue(stringify(expected).startsWith("Specification"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def stringify(Specification s) {
		return '''
			Specification {
				name = "«IF checkAttributeValues»«s.name»«ELSE»specification«ENDIF»",
				blocks = [
					«val List<Block> sortedBlockList = new ArrayList<Block>(s.blocks)»
					«blockNormalizer.normalize(sortedBlockList)»
					«FOR b : sortedBlockList SEPARATOR ", "»
						«blockNormalizer.stringify(b)»
					«ENDFOR»
				]
			}
		'''
	}
}
