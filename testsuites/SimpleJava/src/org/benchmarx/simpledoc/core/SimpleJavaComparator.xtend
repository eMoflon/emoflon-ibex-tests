package org.benchmarx.simpledoc.core

import org.benchmarx.emf.Comparator
import simpleJava.Package;
import simpleJava.Class;

import static org.junit.Assert.*

class SimpleJavaComparator implements Comparator<Package> {
	
	boolean checkAttributeValues
	PackageNormaliser packageNormaliser
	ClassNormaliser classNormaliser
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		packageNormaliser = new PackageNormaliser()
		classNormaliser = new ClassNormaliser()
	}	
	
	override assertEquals(Package expected, Package actual) {
		assertTrue(stringify(expected).startsWith("Package"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def String stringify(Package pkg) {
		'''
		Package {
			«IF(checkAttributeValues)»«pkg.name»«ELSE»package«ENDIF» 
			«stringifySubPackage(pkg)»
			
		}
		'''
	}
	
	def String stringifySubPackage(Package pkg){
		'''
		packages = {
			«FOR f : packageNormaliser.normalise(pkg.subPackages)»
			«stringify(f)»
			«ENDFOR»
		}
		classes = {
			«FOR d : classNormaliser.normalise(pkg.classes)»
			«stringify(d)»
			«ENDFOR»
		}
		'''
	}
	
	def String stringify(Class doc) {
		'''
		Class {
			«IF(checkAttributeValues)»«doc.name»«ELSE»class«ENDIF» 
			«IF(checkAttributeValues)»«doc.body»«ENDIF» 
		}
		'''
	}
	
}