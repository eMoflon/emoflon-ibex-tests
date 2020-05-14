package org.benchmarx.terracehouses.core

import TerraceHouses.Building
import TerraceHouses.House
import TerraceHouses.Structure
import org.benchmarx.emf.Comparator

import static org.junit.Assert.assertEquals

class TerraceHousesComparator implements Comparator<Structure> {

	boolean checkAttributeValues;

	new(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
	}

	override assertEquals(Structure expected, Structure actual) {
		assertEquals(expected.stringify, actual.stringify)
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
