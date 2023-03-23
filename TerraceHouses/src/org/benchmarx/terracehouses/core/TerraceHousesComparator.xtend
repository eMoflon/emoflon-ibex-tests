package org.benchmarx.terracehouses.core

import TerraceHouses.Building
import TerraceHouses.District
import TerraceHouses.House
import TerraceHouses.Structure
import org.benchmarx.emf.Comparator

import static org.junit.jupiter.api.Assertions.*
import TerraceHouses.Skyway

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
				name: «building.name»
				address: «building.address»
			«ENDIF»
			«IF building.next !== null »«building.next.stringify»«ENDIF»
		}
		'''
	}

	def String stringify(House house) {
		'''
		House {
			«IF checkAttributeValues»
				name: «house.name»
				address: «house.address»
				pitchedRoof: «house.pitchedRoof»
				prefab: «house.prefab»
			«ENDIF»
			«IF house.skywayEntry !== null»«house.skywayEntry.stringify»«ENDIF»
			«IF house.next !== null »«house.next.stringify»«ENDIF»
		}
		'''
	}
	
	def String stringify(Skyway skyway) {
		'''
		Skyway {
			«IF checkAttributeValues»
				name: «skyway.name»
			«ENDIF»
			exit: «skyway.exit.name»
		}
		'''
	}
}
