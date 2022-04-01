package org.benchmarx.classMultipleInheritanceHierarchy.core

import classMultipleInheritanceHierarchy.ClassPackage
import classMultipleInheritanceHierarchy.Clazz
import java.util.List
import java.util.ArrayList
import org.benchmarx.emf.Comparator

import static org.junit.jupiter.api.Assertions.*

class ClassMultipleIhneritanceHierarchyComparator implements Comparator<ClassPackage> {
	/** 
	 * checkAttributeValues determines if equality requires equal values in all EAttributes.
	 * MODELGEN tests cannot handle this and therefore require checkAttributeValues == false.
	 */
	boolean checkAttributeValues
	
	ClazzNormalizer clazzNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		clazzNormalizer = new ClazzNormalizer(checkAttributeValues)
	}
	
	override assertEquals(ClassPackage expected, ClassPackage actual) {
		assertTrue(stringify(expected).startsWith("ClassPackage"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def stringify(ClassPackage classPackage) {
		return '''
		ClassPackage {
			name = "«IF checkAttributeValues»«classPackage.name»«ELSE»classPackage«ENDIF»",
			classes = [
			«val List<Clazz> sortedList = new ArrayList<Clazz>(classPackage.classes)»
			«clazzNormalizer.normalize(sortedList)»
			«FOR c : sortedList SEPARATOR ", "»
				«clazzNormalizer.stringify(c)»
			«ENDFOR»
			]
		}
		'''
	}
}