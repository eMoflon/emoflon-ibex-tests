package org.glossarDoc.core

import org.benchmarx.emf.Comparator
import glossarDocumentation.*

import static org.junit.Assert.*

class GlossarDocumentationComparator implements Comparator<DocumentationContainer> {
	
	DocumentNormaliser docNormaliser
	EntryNormaliser entryNormaliser
	GlossarEntryNormaliser gEntryNormaliser
	
	new (boolean checkAttributeValues){
		docNormaliser = new DocumentNormaliser()
		entryNormaliser = new EntryNormaliser()
		gEntryNormaliser = new GlossarEntryNormaliser()
	}	  
	
	override assertEquals(DocumentationContainer expected, DocumentationContainer actual) {
		assertTrue(stringify(expected).startsWith("DocumentationContainer"))
		assertEquals(stringify(expected), stringify(actual))
	} 
	
	def String stringify(DocumentationContainer cont) {
		'''
			DocumentationContainer {
				documents = {
					«FOR f : docNormaliser.normalise(cont.documents)»
						«stringify(f)»
					«ENDFOR»
				} 
				
				glossar = {
					«FOR f : gEntryNormaliser.normalise(cont.glossar.entries)»
						GlossarEntry «f.value»
					«ENDFOR»
				}
			}
		'''
	}
	
	def String stringify(Document doc) {
		'''
			Document {
				name=«doc.name»
				
				entries = {
				«FOR f : entryNormaliser.normalise(doc.entries)»
					«stringify(f)»
				«ENDFOR» 
				}
				
				hyperRefs = {
				«FOR f : docNormaliser.normalise(doc.hyperRefs)»
					«f.name»
				«ENDFOR»
				}
			}
		'''
	}
	
	def String stringify(Entry cont){
		'''
			Entry {
				name=«cont.name»
				type=«cont.type.getName()»
				
				glossarRefs = {
					«FOR f : gEntryNormaliser.normalise(cont.glossarentries)»
						GlossarEntry «f.value»
					«ENDFOR»
				}
			}
		'''
	}
	
}
