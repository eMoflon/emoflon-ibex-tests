package org.simpleClass.core

import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.common.util.EList
import java.util.Comparator
import simpleClassInheritance.Field

class FieldNormaliser implements Comparator<Field> {
	
	def normalise(EList<Field> pkgs) {
		val list = new ArrayList(pkgs)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Field f1, Field f2) {
		return f1.name.compareTo(f2.name)
	}
}
