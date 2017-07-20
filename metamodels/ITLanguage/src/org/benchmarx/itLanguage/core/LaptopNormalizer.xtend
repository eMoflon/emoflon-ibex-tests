package org.benchmarx.itLanguage.core

import ITLanguage.Laptop

class LaptopNormalizer extends Normalizer<Laptop> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}

	
	override String stringify(Laptop laptop) {
		'''
		Laptop {
			name = "«IF checkAttributeValues»«laptop.name»«ELSE»laptop«ENDIF»"
		}
		'''
	}
}