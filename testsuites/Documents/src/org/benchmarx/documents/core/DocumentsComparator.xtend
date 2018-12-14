package org.benchmarx.documents.core
import java.util.List
import java.util.ArrayList
import org.benchmarx.emf.Comparator

import static org.junit.Assert.*
import Documents.Container
import Documents.Document

class DocumentsComparator implements Comparator<Container> {
	/** 
	 * checkAttributeValues determines if equality requires equal values in all EAttributes.
	 * MODELGEN tests cannot handle this and therefore require checkAttributeValues == false.
	 */
	boolean checkAttributeValues
	
	DocumentsNormalizer docNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		docNormalizer = new DocumentsNormalizer(checkAttributeValues)
	}
	
	override assertEquals(Container expected, Container actual) {
		assertTrue(stringify(expected).startsWith("Container"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def stringify(Container docPackage) {
		return '''
			Container {
				name = "«IF checkAttributeValues»«docPackage.name»«ELSE»container«ENDIF»",
				documents = [
				«val List<Document> sorted = new ArrayList<Document>(docPackage.documents)»
				«docNormalizer.normalize(sorted)»
				«FOR c : sorted SEPARATOR ", "»
					«docNormalizer.stringify(c)»
				«ENDFOR»
				]
			}
		'''
	}
}