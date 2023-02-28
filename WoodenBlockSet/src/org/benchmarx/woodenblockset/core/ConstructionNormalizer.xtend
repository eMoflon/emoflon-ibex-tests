package org.benchmarx.woodenblockset.core

import WoodenBlockSet.Construction
import org.benchmarx.util.Normalizer

class ConstructionNormalizer extends Normalizer<Construction> {
	
	override compare(Construction c1, Construction c2) {
		return c1.name.compareTo(c2.name)
	}
	
}