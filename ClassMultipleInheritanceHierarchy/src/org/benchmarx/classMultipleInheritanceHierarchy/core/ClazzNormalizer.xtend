package org.benchmarx.classMultipleInheritanceHierarchy.core

import classMultipleInheritanceHierarchy.Attribute
import java.util.List
import classMultipleInheritanceHierarchy.Clazz
import java.util.Comparator
import java.util.Collections
import java.util.ArrayList

class ClazzNormalizer implements Comparator<Clazz> {
	boolean checkAttributeValues
	AttributeNormalizer attributeNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		attributeNormalizer = new AttributeNormalizer(checkAttributeValues)
	}

	override compare(Clazz clazz1, Clazz clazz2) {
		val clazzString1 = stringify(clazz1)
		val clazzString2 = stringify(clazz2)
		
		return clazzString1.compareTo(clazzString2)
	}
	
	def String stringify(Clazz clazz) {
		'''
			Clazz {
				name = "«IF checkAttributeValues»«clazz.name»«ELSE»clazz«ENDIF»",
				superClasses = [
				«val List<Clazz> sortedSuperClasses = new ArrayList<Clazz>(clazz.superClass)»
				«this.normalize(sortedSuperClasses)»
				«FOR ssc : sortedSuperClasses SEPARATOR ", "»
				«IF checkAttributeValues»«ssc.name»«ELSE»superClass«ENDIF»
				«ENDFOR»
				]
				attributes = [
				«val List<Attribute> sortedList = new ArrayList<Attribute>(clazz.attributes)»
				«attributeNormalizer.normalize(sortedList)»
				«FOR a : sortedList SEPARATOR ", "»
				«attributeNormalizer.stringify(a)»
				«ENDFOR»
				]
			}
		'''
	}

	def normalize(List<Clazz> clazzes){
		Collections.sort(clazzes, this);
	}
}
