package testsuite.ibex.Express2Uml.comparison;

import org.benchmarx.emf.Comparator
import uml.Package
import static org.junit.Assert.assertEquals

class PackageComparator implements Comparator<uml.Package> {
	
	override assertEquals(Package expected, Package actual) {
		assertEquals(expected.name, actual.name)
	}
	
}
