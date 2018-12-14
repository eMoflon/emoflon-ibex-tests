package org.benchmarx.itLanguage.core

import java.util.ArrayList
import ITLanguage.PC
import ITLanguage.Network
import java.util.List
import ITLanguage.Laptop

class NetworkNormalizer extends Normalizer<Network> {
	PCNormalizer pcNormalizer
	LaptopNormalizer laptopNormalizer
	
	new(boolean checkAttributeValues) {
		super(checkAttributeValues)
		pcNormalizer = new PCNormalizer(checkAttributeValues)
		laptopNormalizer = new LaptopNormalizer(checkAttributeValues)
	}

	
	override String stringify(Network network) {
		'''
		Network {
			name = "«IF checkAttributeValues»«network.name»«ELSE»network«ENDIF»"
			pcs = [
				«val List<PC> sortedPCList = new ArrayList<PC>(network.pc)»
				«pcNormalizer.normalize(sortedPCList)»
				«FOR p : sortedPCList SEPARATOR ", "»
					«pcNormalizer.stringify(p)»
				«ENDFOR»
			]
			laptops = [
				«val List<Laptop> sortedLaptopList = new ArrayList<Laptop>(network.laptop)»
				«laptopNormalizer.normalize(sortedLaptopList)»
				«FOR l : sortedLaptopList SEPARATOR ", "»
					«laptopNormalizer.stringify(l)»
				«ENDFOR»
			]
		}
		'''
	}
}