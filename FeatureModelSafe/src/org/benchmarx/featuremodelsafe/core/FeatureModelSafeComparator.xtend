package org.benchmarx.featuremodelsafe.core

import FeatureModelSafe.Model
import org.benchmarx.emf.Comparator
import static org.junit.jupiter.api.Assertions.*
import FeatureModelSafe.Feature
import FeatureModelSafe.XorGroup
import FeatureModelSafe.OrGroup

class FeatureModelSafeComparator implements Comparator<Model> {
	
	boolean checkAttributeValues
	FeatureNormaliser featureNormaliser
	GroupNormaliser groupNormaliser
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		featureNormaliser = new FeatureNormaliser
		groupNormaliser = new GroupNormaliser
	}	
	
	override assertEquals(Model expected, Model actual) {
		assertTrue(stringify(expected).startsWith("FeatureModelSafe"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def String stringify(Model model) {
		'''
		FeatureModelSafe {
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
			«FOR group : groupNormaliser.normalise(feature.groups)»
			«stringifyGroup(group)»
			«ENDFOR»
			
			// Solitary Sub Features:
			«FOR f : featureNormaliser.normalise(feature.solitarySubFeatures)»
			«stringify(f)»
			«ENDFOR»
		}
		'''
	}
	
	def dispatch String stringifyGroup(XorGroup group){
		'''
		XOR {
			«FOR f : featureNormaliser.normalise(group.members)»
			«stringify(f)»
			«ENDFOR»
		}
		'''
	}
	
	def dispatch String stringifyGroup(OrGroup group){
		'''
		OR {
			«FOR f : featureNormaliser.normalise(group.members)»
			«stringify(f)»
			«ENDFOR»
		}
		'''
	}	
}