package testsuite.ibex.Express2Uml.comparison;

import org.benchmarx.emf.Comparator
import uml.Package
import uml.UMLContainer

import static org.junit.Assert.assertEquals

class UMLContainerComparator implements Comparator<UMLContainer> {

	override assertEquals(UMLContainer expected, UMLContainer actual) {
		assertEquals(expected.packages.size, actual.packages.size)
		for (var index = 0; index < expected.packages.size; index++) {
			assertEquals(expected.packages.get(index), actual.packages.get(index))
		}
	}

	def assertEquals(Package expected, Package actual) {
		assertEquals(expected.name, actual.name)
	}

}
