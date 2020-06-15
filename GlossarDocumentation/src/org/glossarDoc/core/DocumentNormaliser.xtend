package org.glossarDoc.core

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.EList
import glossarDocumentation.*

class DocumentNormaliser implements Comparator<Document> {
	
	def normalise(EList<Document> groups) {
		val list = new ArrayList(groups)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Document d1, Document d2) {
		return d1.name.compareTo(d2.name)
	}
	 
}
