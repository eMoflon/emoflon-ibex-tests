package org.benchmarx.simpledoc.core

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.EList
import simpleDoc.Folder

class FolderNormaliser implements Comparator<Folder> {
	
	def normalise(EList<Folder> folders) {
		val list = new ArrayList(folders)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Folder f1, Folder f2) {
		return f1.name.compareTo(f2.name)
	}
}
