package org.benchmarx.simpledoc.core

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.EList
import simpleJava.Clazz

class ClassNormaliser implements Comparator<Clazz> {
	
	def normalise(EList<Clazz> groups) {
		val list = new ArrayList(groups)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Clazz d1, Clazz d2) {
		if(d1.name.length > d2.name.length)
			return 1
		else if(d1.name.length < d2.name.length)
			return -1
		else if(d1.body !== null && d2.body !== null && d1.body.length > d2.body.length)
			return 1
		else 
		 	return -1
	}
	
}