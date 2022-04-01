package org.benchmarx.mocaTree.core

import org.benchmarx.emf.Comparator
import static org.junit.jupiter.api.Assertions.*
import MocaTree.Folder

class MocaTreeFolderComparator implements Comparator<Folder> {
	FolderNormalizer folderNormalizer
	
	new (boolean checkAttributeValues){
		folderNormalizer = new FolderNormalizer(checkAttributeValues)
	}
	
	override assertEquals(Folder expected, Folder actual) {
		assertTrue(stringify(expected).startsWith("Folder"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def String stringify(Folder f) {
		return folderNormalizer.stringify(f)
	}
}