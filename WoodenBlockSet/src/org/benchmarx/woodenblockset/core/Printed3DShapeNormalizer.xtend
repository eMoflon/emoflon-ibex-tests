package org.benchmarx.woodenblockset.core

import org.benchmarx.util.Normalizer
import WoodenBlockSet.Printed3DShape

class Printed3DShapeNormalizer extends Normalizer<Printed3DShape> {
	
	override compare(Printed3DShape s1, Printed3DShape s2) {
		return s1.name.compareTo(s2.name)
	}
	
}