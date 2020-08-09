package testsuite.ibex.Express2Uml.common

import org.emoflon.express.express.Schema
import org.emoflon.express.express.Entity
import org.emoflon.express.express.ExpressFactory
import org.emoflon.express.express.Declaration
import java.util.Collection

class ExpressHelper {
	
	def static createSchema(String name) {
		val schema = ExpressFactory.eINSTANCE.createSchema();
		schema.name = name
		schema
	}

	def static createEntity(Schema schema, String name) {
		val entity = ExpressFactory.eINSTANCE.createEntity();
		entity.setName(name);
		schema.getDeclarations().add(entity);
	}

}
