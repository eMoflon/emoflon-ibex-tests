package org.benchmarx.terracehouses.core

import TerraceHouses.Building
import TerraceHouses.District
import TerraceHouses.House
import TerraceHouses.Structure
import org.benchmarx.emf.Comparator

import static org.junit.jupiter.api.Assertions.*

class TerraceHousesComparator implements Comparator<District> {

	boolean checkAttributeValues;
	StructureNormalizer structureNormalizer;

	new(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
		structureNormalizer = new StructureNormalizer()
	}

	override assertEquals(District expected, District actual) {
		assertEquals(expected.stringify, actual.stringify)
	}
	
	def String stringify(District district) {
		'''
		District {
			streetBeginnings {
				«FOR s : structureNormalizer.normalize(district.streetBeginnings)»
					«s.stringify»
				«ENDFOR»
			}
		}
		'''
	}

	def String stringify(Structure structure) {
		if (structure instanceof Building)
			return structure.stringify
		if (structure instanceof House)
			return structure.stringify
	}

	def String stringify(Building building) {
		'''
		Building {
			«IF checkAttributeValues»
				«building.name»
				«building.address»
			«ENDIF»
			«IF building.next !== null »«building.next.stringify»«ENDIF»
		}
		'''
	}

	def String stringify(House house) {
		'''
		House {
			«IF checkAttributeValues»
				«house.name»
				«house.address»
				«house.pitchedRoof»
			«ENDIF»
			«house.next.stringify»
		}
		'''
	}
}
