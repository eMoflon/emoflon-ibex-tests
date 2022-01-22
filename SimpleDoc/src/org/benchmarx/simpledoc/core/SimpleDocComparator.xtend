package org.benchmarx.simpledoc.core

import org.benchmarx.emf.Comparator
import simpleDoc.Doc
import simpleDoc.Folder

import static org.junit.Assert.*

class SimpleDocComparator implements Comparator<Folder> {
	
	boolean checkAttributeValues
	FolderNormaliser folderNormaliser
	DocNormaliser docNormaliser
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		folderNormaliser = new FolderNormaliser()
		docNormaliser = new DocNormaliser()
	}	
	
	override assertEquals(Folder expected, Folder actual) {
		assertTrue(stringify(expected).startsWith("Folder"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def String stringify(Folder folder) {
		'''
			Folder {
				«IF(checkAttributeValues)»«folder.name»«ELSE»folder«ENDIF» 
				«stringifySubFolder(folder)»
			}
		'''
	}
	
	def String stringifySubFolder(Folder folder){
		'''
			folders = {
				«FOR f : folderNormaliser.normalise(folder.subFolders)»
					«stringify(f)»
				«ENDFOR»
			}
			docs = {
				«FOR d : docNormaliser.normalise(folder.docs)»
					«stringify(d)»
				«ENDFOR»
			}
		'''
	}
	
	def String stringify(Doc doc) {
		'''
			Doc {
				«IF(checkAttributeValues)»«doc.name»«ELSE»doc«ENDIF» 
				«IF(checkAttributeValues)»«doc.content»«ENDIF» 
			}
		'''
	}
	
}
