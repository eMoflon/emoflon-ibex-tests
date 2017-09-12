package org.benchmarx.featuremodelconcise.core

import FeatureModelConcise.Feature
import FeatureModelConcise.Model
import FeatureModelConcise.OrGroup
import FeatureModelConcise.XorGroup
import org.benchmarx.emf.Comparator

import static org.junit.Assert.*

// TODO:  Make sure collections are sorted
class FeatureModelConciseComparator implements Comparator<Model> {
	
	boolean checkAttributeValues
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
	}	
	
	override assertEquals(Model expected, Model actual) {
		assertTrue(stringify(expected).startsWith("FeatureModelConcise"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def String stringify(Model model) {
		'''
		FeatureModelConcise {
			«IF(checkAttributeValues)»«model.name»«ELSE»model«ENDIF» {
				«stringify(model.root)»
			}
		}
		'''
	}
	
	def String stringify(Feature feature){
		'''
		«IF(checkAttributeValues)»«feature.name»«ELSE»feature«ENDIF» {
			// Groups:
			«FOR group : feature.groups»
			«stringifyGroup(group)»
			«ENDFOR»
			
			// Sub Features:
			«FOR f : feature.subfeatures»
			«stringify(f)»
			«ENDFOR»
		}
		'''
	}
	
	def dispatch String stringifyGroup(XorGroup group){
		'''
		XOR {
			«FOR f : group.members»
			«stringify(f)»
			«ENDFOR»
		}
		'''
	}
	
	def dispatch String stringifyGroup(OrGroup group){
		'''
		OR {
			«FOR f : group.members»
			«stringify(f)»
			«ENDFOR»
		}
		'''
	}	
}