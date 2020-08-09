package testsuite.ibex.Express2Uml.comparison

import org.emoflon.express.express.Schema
import org.benchmarx.emf.Comparator

import static org.junit.Assert.*

class SchemaComparator implements Comparator<Schema> {
	
	override assertEquals(Schema expected, Schema actual) {
		assertEquals(expected.name, actual.name)
	}
	
	
}
