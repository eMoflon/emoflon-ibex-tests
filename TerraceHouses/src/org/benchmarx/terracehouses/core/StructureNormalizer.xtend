package org.benchmarx.terracehouses.core

import TerraceHouses.Structure
import java.util.Comparator
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import java.util.Collections

class StructureNormalizer implements Comparator<Structure> {
	
	def normalize(EList<Structure> streetBeginnings) {
		val list = new LinkedList(streetBeginnings)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Structure s1, Structure s2) {
		s1.name.compareTo(s2.name)
	}
	
}