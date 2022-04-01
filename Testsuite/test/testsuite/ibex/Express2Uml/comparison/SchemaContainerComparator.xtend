package testsuite.ibex.Express2Uml.comparison

import ExpressModel.Schema
import ExpressModel.SchemaContainer
import org.benchmarx.emf.Comparator
import org.junit.jupiter.api.Assertions

class SchemaContainerComparator implements Comparator<SchemaContainer> {
	
	override assertEquals(SchemaContainer expected, SchemaContainer actual) {
		Assertions.assertEquals(expected.schemas.size, actual.schemas.size)
		for(var index = 0; index < expected.schemas.size; index++) {
			assertEquals(expected.schemas.get(index), actual.schemas.get(index))	
		}
	}
	
	def assertEquals(Schema expected, Schema actual) {
		Assertions.assertEquals(expected.name, actual.name)
	}
	
	
}
