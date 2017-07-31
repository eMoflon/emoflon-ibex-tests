package org.benchmarx.mocaTree.core

import org.benchmarx.emf.Comparator
import static org.junit.Assert.*
import MocaTree.Folder

class MocaTreeFolderComparator implements Comparator<Folder> {
	boolean checkAttributeValues
	
	FolderNormalizer folderNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		
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