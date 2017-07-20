package org.benchmarx.itLanguage.core

import java.util.ArrayList
import org.benchmarx.emf.Comparator

import static org.junit.Assert.*
import java.util.List
import ITLanguage.Router
import ITLanguage.Network
import ITLanguage.IT

class ITLanguageComparator implements Comparator<IT> {
	
	boolean checkAttributeValues
	
	RouterNormalizer routerNormalizer
	NetworkNormalizer networkNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		
		routerNormalizer = new RouterNormalizer(checkAttributeValues)
		networkNormalizer = new NetworkNormalizer(checkAttributeValues)
	}
	
	override assertEquals(IT expected, IT actual) {
		assertTrue(stringify(expected).startsWith("IT"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	def stringify(IT itt) {
		return '''
		IT {
			name = "«IF checkAttributeValues»«itt.name»«ELSE»it«ENDIF»",
			routers = [
			«val List<Router> sortedRouterList = new ArrayList<Router>(itt.router)»
			«routerNormalizer.normalize(sortedRouterList)»
			«FOR r : sortedRouterList SEPARATOR ", "»
				«routerNormalizer.stringify(r)»
			«ENDFOR»
			]
			networks = [
			«val List<Network> sortedNetworkList = new ArrayList<Network>(itt.network)»
			«networkNormalizer.normalize(sortedNetworkList)»
			«FOR c : sortedNetworkList SEPARATOR ", "»
				«networkNormalizer.stringify(c)»
			«ENDFOR»
			]
		}
		'''
	}
	
	
}