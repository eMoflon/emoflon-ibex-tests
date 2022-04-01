package org.benchmarx.strategy.core

import org.benchmarx.emf.Comparator

import static org.junit.jupiter.api.Assertions.*
import java.util.List
import java.util.ArrayList
import Strategies.StrategyContainer
import Strategies.Strategy

class StrategyComparator implements Comparator<StrategyContainer> {
	
	/** 
	 * checkAttributeValues determines if equality requires equal values in all EAttributes.
	 * MODELGEN tests cannot handle this and therefore require checkAttributeValues == false.
	 */	
	
	override assertEquals(StrategyContainer expected, StrategyContainer actual) {
		assertTrue(stringify(expected).startsWith("StrategyContainer"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	
	def stringify(StrategyContainer strategyContainer) {
	return '''
	StrategyContainer {
		name = "StrategyContainer",
		strategies = [
		«val List<Strategy> sortedList = new ArrayList<Strategy>(strategyContainer.strategies)»
		«FOR c : sortedList SEPARATOR ", "»
			«"s"»
		«ENDFOR»
		]
	}
	'''
}
	
}