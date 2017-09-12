package org.benchmarx.featuremodelsafe.core

import FeatureModelSafe.Group
import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.EList

class GroupNormaliser implements Comparator<Group> {
	
	def normalise(EList<Group> groups) {
		val list = new ArrayList(groups)
		Collections.sort(list, this)
		return list
	}
	
	override compare(Group g1, Group g2) {
		if(g1.members.size > g2.members.size)
			return 1
		else if(g1.members.size < g2.members.size)
			return -1
		else {
			val featureNormaliser = new FeatureNormaliser()
			val g1Members = featureNormaliser.normalise(g1.members)
			val g2Members = featureNormaliser.normalise(g2.members)
			
			val g1Label =  '''
			«FOR f : g1Members SEPARATOR "__"»
				«f.name»
			«ENDFOR»
			'''
			
			val g2Label =  '''
			«FOR f : g2Members SEPARATOR "__"»
				«f.name»
			«ENDFOR»
			'''
			
			return g1Label.compareTo(g2Label)
		}
	}
	
}