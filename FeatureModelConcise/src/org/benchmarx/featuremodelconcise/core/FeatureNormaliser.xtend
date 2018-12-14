package org.benchmarx.featuremodelconcise.core

import FeatureModelConcise.Feature
import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.EList

class FeatureNormaliser implements Comparator<Feature> {
	
	def normalise(EList<Feature> features) {
		val list = new ArrayList(features)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Feature f1, Feature f2) {
		return f1.name.compareTo(f2.name)
	}
	
}