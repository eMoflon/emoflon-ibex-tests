package org.benchmarx.mocaTree.core

import org.benchmarx.emf.Comparator
import static org.junit.jupiter.api.Assertions.*
import MocaTree.File

class MocaTreeFileComparator implements Comparator<File> {
	FileNormalizer fileNormalizer
	
	new (boolean checkAttributeValues){
		fileNormalizer = new FileNormalizer(checkAttributeValues)
	}
	
	override assertEquals(File expected, File actual) {
		assertTrue(stringify(expected).startsWith("File"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def String stringify(File f) {
		return fileNormalizer.stringify(f)
	}
}