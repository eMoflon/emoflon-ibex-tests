package testsuite.ibex.Express2Uml.common

import org.emoflon.express.express.Entity
import org.emoflon.express.express.Attribute
import org.emoflon.express.express.ExpressFactory
import org.emoflon.express.express.Schema
import org.emoflon.express.express.SchemaContainer

class ExpressHelper {
	
	def static createSchemaContainer() {
		val container = ExpressFactory.eINSTANCE.createSchemaContainer();
		container
	}
	
	def static createSchema(SchemaContainer container ,String name) {
		val schema = ExpressFactory.eINSTANCE.createSchema();
		schema.name = name
		container.schemas.add(schema);
		schema
	}

	def static createEntity(Schema schema, String name) {
		val entity = ExpressFactory.eINSTANCE.createEntity();
		entity.name = name;
		schema.getDeclarations().add(entity);
		entity
	}
	
	def static createSubEntity(Schema schema, Entity entity, String name) {
		val subEntity = ExpressFactory.eINSTANCE.createEntity();
		subEntity.name = name;
		subEntity.superType = entity
		schema.getDeclarations().add(subEntity);
		subEntity
	}
	
	def static createIntegerAttribute(Entity entity, String name) {
		createAttribute([ExpressFactory.eINSTANCE.createIntegerAttribute], entity, name)
	}
	
	def static createStringAttribute(Entity entity, String name) {
		createAttribute([ExpressFactory.eINSTANCE.createStringAttribute], entity, name)
	}
	
	def static createAttribute(()=>Attribute f, Entity entity, String name) {
		val attr = f.apply()
		attr.name = name
		attr.optional = false

		entity.attributes.add(attr);
		attr
	}
	
	def static createFunction(Schema schema, String name) {
		val function = ExpressFactory.eINSTANCE.createFunction()
		function.name = name
		schema.declarations.add(function)
		function
	}
	
	def static createEnumerationType(Schema schema, String name) {
		val enumerationType = ExpressFactory.eINSTANCE.createEnumerationType()
		enumerationType.name = name
		schema.declarations.add(enumerationType)
		enumerationType
	}

}
