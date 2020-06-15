package org.benchmarx.woodenblockset.core

import WoodenBlockSet.Shape3D
import java.util.Collections
import java.util.Comparator
import java.util.LinkedList
import org.eclipse.emf.common.util.EList

class Shape3DNormalizer implements Comparator<Shape3D> {
	
	def normalize(EList<Shape3D> shape) {
		val list = new LinkedList(shape)
		Collections.sort(list, this)
		return list
	}

	override compare(Shape3D s1, Shape3D s2) {
		var color1 = s1.color === null ? "" : s1.color;
		var color2 = s2.color === null ? "" : s2.color;
		return s1.class.name.concat(color1).compareTo(s2.class.name.concat(color2))
	}

}
