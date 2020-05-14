package org.benchmarx.woodenblockset.core

import WoodenBlockSet.Construction
import java.util.Comparator
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import java.util.Collections

class ConstructionNormalizer implements Comparator<Construction> {
	
	def normalize(EList<Construction> constructions) {
		val list = new LinkedList(constructions)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Construction c1, Construction c2) {
		return c1.name.compareTo(c2.name)
	}
	
}