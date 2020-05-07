package org.simpleClass.core

import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.common.util.EList
import java.util.Comparator
import simpleClassInheritance.Parameter

class ParameterNormaliser implements Comparator<Parameter> {
	
	def normalise(EList<Parameter> pkgs) {
		val list = new ArrayList(pkgs)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Parameter f1, Parameter f2) {
		return f1.name.compareTo(f2.name)
	}
}
