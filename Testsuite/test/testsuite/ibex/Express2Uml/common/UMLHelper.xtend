package testsuite.ibex.Express2Uml.common

import uml.UmlFactory
import uml.Package

class UMLHelper {
	
	def static createClazz(Package pkg, String name) {
		val clazz = UmlFactory.eINSTANCE.createClass()
		pkg.classes.add(clazz)
		clazz
	}
	
}