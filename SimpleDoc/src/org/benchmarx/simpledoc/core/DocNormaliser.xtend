package org.benchmarx.simpledoc.core

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.EList
import simpleDoc.Doc

class DocNormaliser implements Comparator<Doc> {
	
	def normalise(EList<Doc> groups) {
		val list = new ArrayList(groups)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Doc d1, Doc d2) {
		if(d1.name.length > d2.name.length)
			return 1
		else if(d1.name.length < d2.name.length)
			return -1
		else if(d1.content !== null && d2.content !== null && d1.content.length > d2.content.length)
			return 1
		else 
		 	return -1
	}
	
}
