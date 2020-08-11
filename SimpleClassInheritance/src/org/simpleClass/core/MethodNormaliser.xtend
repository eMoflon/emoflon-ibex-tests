package org.simpleClass.core

import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.common.util.EList
import java.util.Comparator
import simpleClassInheritance.Method

class MethodNormaliser implements Comparator<Method> {
	
	def normalise(EList<Method> pkgs) {
		val list = new ArrayList(pkgs)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Method f1, Method f2) {
		return f1.name.compareTo(f2.name)
	}
}
