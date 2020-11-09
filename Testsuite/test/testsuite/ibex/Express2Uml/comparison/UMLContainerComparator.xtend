package testsuite.ibex.Express2Uml.comparison;

import org.benchmarx.emf.Comparator
import uml.Package
import uml.UMLContainer

import static org.junit.Assert.assertEquals

class UMLContainerComparator implements Comparator<UMLContainer> {
	
	override assertEquals(UMLContainer expected, UMLContainer actual) {
		if (expected.package !== null && actual.package !== null) {
			assertEquals(expected.package, actual.package)
		}
	}
	
	def assertEquals(Package expected, Package actual) {
		assertEquals(expected.name, actual.name)
	}
	
}
