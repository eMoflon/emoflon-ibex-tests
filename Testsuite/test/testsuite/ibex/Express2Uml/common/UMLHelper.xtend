package testsuite.ibex.Express2Uml.common

import uml.Clazz
import uml.Package
import uml.UmlFactory

class UMLHelper {

	def static createClazz(Package pkg, String name) {
		val clazz = UmlFactory.eINSTANCE.createClazz()
		clazz.name = name
		pkg.clazzes.add(clazz)
		clazz
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

}
