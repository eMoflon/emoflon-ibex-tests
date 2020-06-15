package org.glossarDoc.core

import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.common.util.EList
import java.util.Comparator
import glossarDocumentation.*

class EntryNormaliser implements Comparator<Entry> {
	
	def normalise(EList<Entry> pkgs) {
		val list = new ArrayList(pkgs)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Entry f1, Entry f2) {
		return f1.name.compareTo(f2.name)
	}
}
