package testsuite.ibex.Express2Uml.common

import ExpressModel.ExpressModelFactory
import ExpressModel.SchemaContainer
import ExpressModel.Schema
import ExpressModel.Entity
import ExpressModel.Attribute

class ExpressHelper {
	
	def static createSchemaContainer() {
		val container = ExpressModelFactory.eINSTANCE.createSchemaContainer();
		container
	}
	
	def static createSchema(SchemaContainer container ,String name) {
		val schema = ExpressModelFactory.eINSTANCE.createSchema();
		schema.name = name
		container.schemas.add(schema);
		schema
	}

	def static createEntity(Schema schema, String name) {
		val entity = ExpressModelFactory.eINSTANCE.createEntity();
		entity.name = name;
		schema.getDeclarations().add(entity);
		entity
	}
	
	def static createSubEntity(Schema schema, Entity entity, String name) {
		val subEntity = ExpressModelFactory.eINSTANCE.createEntity();
		subEntity.name = name;
		subEntity.superType = entity
		schema.getDeclarations().add(subEntity);
		subEntity
	}
	
	def static createIntegerAttribute(Entity entity, String name) {
		createAttribute([ExpressModelFactory.eINSTANCE.createIntegerAttribute], entity, name)
	}
	
	def static createStringAttribute(Entity entity, String name) {
		createAttribute([ExpressModelFactory.eINSTANCE.createStringAttribute], entity, name)
	}
	
	def static createAttribute(()=>Attribute f, Entity entity, String name) {
		val attr = f.apply()
		attr.name = name
		attr.optional = false

		entity.attributes.add(attr);
		attr
	}
	
	def static createFunction(Schema schema, String name) {
		val function = ExpressModelFactory.eINSTANCE.createFunction()
		function.name = name
		schema.declarations.add(function)
		function
	}
	
	def static createEnumerationType(Schema schema, String name) {
		val enumerationType = ExpressModelFactory.eINSTANCE.createEnumerationType()
		enumerationType.name = name
		schema.declarations.add(enumerationType)
		enumerationType
	}

}
