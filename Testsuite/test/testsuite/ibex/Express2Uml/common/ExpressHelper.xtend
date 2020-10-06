package testsuite.ibex.Express2Uml.common

import org.emoflon.express.express.Entity
import org.emoflon.express.express.ExpressFactory
import org.emoflon.express.express.Schema

class ExpressHelper {
	
	def static createSchema(String name) {
		val schema = ExpressFactory.eINSTANCE.createSchema();
		schema.name = name
		schema
	}

	def static createEntity(Schema schema, String name) {
		val entity = ExpressFactory.eINSTANCE.createEntity();
		entity.abstract_ = false
		entity.name = name;
		schema.getDeclarations().add(entity);
		entity
	}
	
	def static createIntegerAttribute(Entity entity, String name) {
		val attr = ExpressFactory.eINSTANCE.createIntegerAttribute()
		attr.name = name
		attr.optional = false

		entity.attributes.add(attr);
		attr
	}
	
	def static createFunction(Schema schema, String name) {
		val function = ExpressFactory.eINSTANCE.createFunction()
		function.name = name
		schema.declarations.add(function)
	}
	
	def static createEnumerationType(Schema schema, String name) {
		val enumerationType = ExpressFactory.eINSTANCE.createEnumerationType()
		enumerationType.name = name
		schema.declarations.add(enumerationType)
		enumerationType
	}

}
