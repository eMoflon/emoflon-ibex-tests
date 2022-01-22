package org.glossarDoc.core

import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.common.util.EList
import java.util.Comparator
import glossarDocumentation.*

class GlossarEntryNormaliser implements Comparator<GlossarEntry> {
	
	def normalise(EList<GlossarEntry> pkgs) {
		val list = new ArrayList(pkgs)
		Collections.sort(list, this)
		return list
	}
	
	override compare(GlossarEntry f1, GlossarEntry f2) {
		if(f1.value === null && f2.value === null){
			return 0
		}else if(f1.value === null && f2.value !== null) {
			return -1
		}else if(f1.value !== null && f2.value === null) {
			return 1
		} else {
			return f1.value.compareTo(f2.value)
		}
	}
}
