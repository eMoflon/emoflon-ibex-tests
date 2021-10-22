package testsuite.ibex.Express2Uml.comparison

import org.benchmarx.emf.Comparator

import static org.junit.Assert.*
import ExpressModel.SchemaContainer
import ExpressModel.Schema

class SchemaContainerComparator implements Comparator<SchemaContainer> {
	
	override assertEquals(SchemaContainer expected, SchemaContainer actual) {
		assertEquals(expected.schemas.size, actual.schemas.size)
		for(var index = 0; index < expected.schemas.size; index++) {
			assertEquals(expected.schemas.get(index), actual.schemas.get(index))	
		}
	}
	
	def assertEquals(Schema expected, Schema actual) {
		assertEquals(expected.name, actual.name)
	}
	
	
}
