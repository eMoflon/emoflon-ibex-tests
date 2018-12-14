package org.benchmarx.simpledoc.core

import simpleJava.Package

import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.common.util.EList
import java.util.Comparator

class PackageNormaliser implements Comparator<Package> {
	
	def normalise(EList<Package> pkgs) {
		val list = new ArrayList(pkgs)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Package f1, Package f2) {
		return f1.name.compareTo(f2.name)
	}
}