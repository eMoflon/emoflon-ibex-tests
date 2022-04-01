package benchmarx.algorithm.core

import org.benchmarx.emf.Comparator

import static org.junit.jupiter.api.Assertions.*
import java.util.List
import java.util.ArrayList
import Algorithms.AlgorithmContainer
import Algorithms.Algorithm

class AlgorithmComparator implements Comparator<AlgorithmContainer> {
	
	/** 
	 * checkAttributeValues determines if equality requires equal values in all EAttributes.
	 * MODELGEN tests cannot handle this and therefore require checkAttributeValues == false.
	 */	
	
	override assertEquals(AlgorithmContainer expected, AlgorithmContainer actual) {
		assertTrue(stringify(expected).startsWith("AlgorithmContainer"))
		assertEquals(stringify(expected), stringify(actual))
	}
	
	
	def stringify(AlgorithmContainer AlgorithmContainer) {
	return '''
	AlgorithmContainer {
		name = "AlgorithmContainer",
		algorithms = [
		«val List<Algorithm> sortedList = new ArrayList<Algorithm>(AlgorithmContainer.algorithms)»
		«FOR c : sortedList SEPARATOR ", "»
			«"a"»
		«ENDFOR»
		]
	}
	'''
}
	
}