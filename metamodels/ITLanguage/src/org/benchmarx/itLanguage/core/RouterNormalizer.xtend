package org.benchmarx.itLanguage.core

import ITLanguage.Router

class RouterNormalizer extends Normalizer<Router> {
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
	}
	
	override String stringify(Router router) {
		'''
		Router {
			name = "«IF checkAttributeValues»«router.name»«ELSE»router«ENDIF»"
			network = "«IF router.network !== null»«IF checkAttributeValues»«router.network.name»«ELSE»network«ENDIF»«ENDIF»",
		}
		'''
	}
}