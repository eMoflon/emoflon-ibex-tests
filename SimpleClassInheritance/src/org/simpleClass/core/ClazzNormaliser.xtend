package org.simpleClass.core

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.EList
import simpleClassInheritance.Clazz

class ClazzNormaliser implements Comparator<Clazz> {
	
	def normalise(EList<Clazz> groups) {
		val list = new ArrayList(groups)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Clazz d1, Clazz d2) {
		return d1.name.compareTo(d2.name)
	}
	
}
