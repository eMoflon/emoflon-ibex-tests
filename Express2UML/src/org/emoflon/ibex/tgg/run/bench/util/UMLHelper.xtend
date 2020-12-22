package org.emoflon.ibex.tgg.run.bench.util

import uml.Clazz
import uml.Package
import uml.UmlFactory
import uml.UMLContainer

class UMLHelper {

	def static createUMLContainer()  {
		UmlFactory.eINSTANCE.createUMLContainer()
	}

	def static createPackage(UMLContainer container, String name) {
		val pkg = UmlFactory.eINSTANCE.createPackage()
		pkg.name = name
		container.packages.add(pkg)
		pkg
	}

	def static createClazz(Package pkg, String name) {
		val clazz = UmlFactory.eINSTANCE.createClazz()
		clazz.name = name
		clazz.pkg = pkg
		pkg.clazzes.add(clazz)
		clazz
	}
	
	def static createSubClazz(Package pkg, Clazz clazz, String name) {
		val subClazz = UmlFactory.eINSTANCE.createClazz()
		subClazz.name = name
		subClazz.superClazz = clazz
		pkg.clazzes.add(subClazz)
		subClazz
	}

	def static createMethod(Clazz clazz, String name, boolean isStatic) {
		val method = UmlFactory.eINSTANCE.createMethod()
		method.name = name
		method.static_ = isStatic
		clazz.methods.add(method)
		method
	}

	def static createEnumeration(Package pkg, String name) {
		val enumeration = UmlFactory.eINSTANCE.createEnumeration()
		enumeration.name = name
		pkg.enumerations.add(enumeration)
		enumeration
	}

	def static createInteger(Clazz clazz, String name) {
		val integer = UmlFactory.eINSTANCE.createInteger()
		integer.name = name
		clazz.attributes.add(integer)
		integer
	}
	
	def static createString(Clazz clazz, String name) {
		val str = UmlFactory.eINSTANCE.createString()
		str.name = name
		clazz.attributes.add(str)
		str
	}

}
