package org.benchmarx.woodenblockset.core

import WoodenBlockSet.Shape3D
import org.benchmarx.util.Normalizer

class Shape3DNormalizer extends Normalizer<Shape3D> {
	
	override compare(Shape3D s1, Shape3D s2) {
		var color1 = s1.color === null ? "" : s1.color;
		var color2 = s2.color === null ? "" : s2.color;
		return s1.class.name.concat(color1).compareTo(s2.class.name.concat(color2))
	}

}
