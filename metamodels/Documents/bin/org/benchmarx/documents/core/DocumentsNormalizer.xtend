package org.benchmarx.documents.core

import java.util.List
import java.util.Comparator
import java.util.Collections
import java.util.ArrayList
import Documents.Document

class DocumentsNormalizer implements Comparator<Document> {
	boolean checkAttributeValues
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
	}

	override compare(Document doc1, Document doc2) {
		val docString1 = stringify(doc1)
		val docString2 = stringify(doc2)
		
		return docString1.compareTo(docString2)
	}
	
	def String stringify(Document doc) {
		'''
			Document {
				name = "«IF checkAttributeValues»«doc.name»«ELSE»doc«ENDIF»",
				references = [
				«val List<Document> sortedReferences = new ArrayList<Document>(doc.reference)»
				«this.normalize(sortedReferences)»
				«FOR ssc : sortedReferences SEPARATOR ", "»
					«IF checkAttributeValues»«ssc.name»«ELSE»ref«ENDIF»
				«ENDFOR»
				]
			}
		'''
	}

	def normalize(List<Document> docs){
		Collections.sort(docs, this);
	}
}
