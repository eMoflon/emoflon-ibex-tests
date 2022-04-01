package org.simpleClass.core

import org.benchmarx.emf.Comparator
import simpleClassInheritance.Clazz
import simpleClassInheritance.ClazzContainer
import simpleClassInheritance.Method

import static org.junit.jupiter.api.Assertions.*

class ClazzInheritanceComparator implements Comparator<ClazzContainer> {
	
	ClazzNormaliser clazzNormaliser
	FieldNormaliser fieldNormaliser
	MethodNormaliser methodNormaliser
	ParameterNormaliser parameterNormaliser
	
	new (boolean checkAttributeValues){
		clazzNormaliser = new ClazzNormaliser()
		fieldNormaliser = new FieldNormaliser()
		methodNormaliser = new MethodNormaliser()
		parameterNormaliser = new ParameterNormaliser()
	}	  
	
	override assertEquals(ClazzContainer expected, ClazzContainer actual) {
		assertTrue(stringify(expected).startsWith("ClazzContainer"))
		assertEquals(stringify(expected), stringify(actual))
	} 
	
	def String stringify(ClazzContainer cont) {
		'''
			ClazzContainer {
				clazzes = {
					«FOR f : clazzNormaliser.normalise(cont.clazzes)»
						«stringify(f)»
					«ENDFOR»
				}
			}
		'''
	}
	
	def String stringify(Clazz doc) {
		'''
			Class {
				name = «doc.name»
				methods = {
					«FOR f : methodNormaliser.normalise(doc.methods)»
						«stringify(f)»
					«ENDFOR»
				}
				
				fields = {
					«FOR f : fieldNormaliser.normalise(doc.fields)»
						Field «f.name»
					«ENDFOR»
				}
				
				subClazzes = {
					«FOR f : clazzNormaliser.normalise(doc.subClazzes)»
						«stringify(f)»
					«ENDFOR»
				}
			}
		'''
	}
	
	def String stringify(Method cont){
		'''
			Method {
				name = «cont.name»
				
				parameters = {
					«FOR f : parameterNormaliser.normalise(cont.parameters)»
						Parameter «f.name»
					«ENDFOR»
				}
			}
		'''
	}
	
}
