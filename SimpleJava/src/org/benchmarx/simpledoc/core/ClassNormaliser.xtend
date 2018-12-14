package org.benchmarx.simpledoc.core

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.EList
import simpleJava.Class

class ClassNormaliser implements Comparator<Class> {
	
	def normalise(EList<Class> groups) {
		val list = new ArrayList(groups)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Class d1, Class d2) {
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