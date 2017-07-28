package org.benchmarx.mocaTree.core

import org.benchmarx.emf.Comparator
import static org.junit.Assert.*
import MocaTree.File

class MocaTreeFileComparator implements Comparator<File> {
	boolean checkAttributeValues
	
	FileNormalizer fileNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		
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