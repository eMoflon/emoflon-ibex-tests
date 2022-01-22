package org.emoflon.ibex.tgg.run.bench.util;

import java.util.HashMap;
import java.util.Map;

import ExpressModel.Entity;
import ExpressModel.Schema;
import uml.Clazz;
import uml.Package;

public class Express2UMLRegistry {

	private final Map<String, Schema> schemaRegistry;
	private final Map<String, Entity> entityRegistry;
	private final Map<String, uml.Package> pkgRegistry;
	private final Map<String, Clazz> clazzRegistry;
	
	public Express2UMLRegistry() {
		this.schemaRegistry = new HashMap<String, Schema>();
		this.entityRegistry = new HashMap<String, Entity>();
		this.pkgRegistry = new HashMap<String, uml.Package>();
		this.clazzRegistry = new HashMap<String, Clazz>();
	}
	
	public void addSchema(Schema schema) {
		schemaRegistry.put(schema.getName(), schema);
	}
	
	public Schema getSchema(String name) {
		return schemaRegistry.get(name);
	}
	
	public void addPackage(uml.Package pkg) {
		pkgRegistry.put(pkg.getName(), pkg);
	}
	
	public Package getPackage(String name) {
		return pkgRegistry.get(name);
	}
	
	public void addEntity(Entity entity) {
		entityRegistry.put(entity.getName(), entity);
	}
	
	public void addClazz(Clazz clazz) {
		clazzRegistry.put(clazz.getName(), clazz);
	}
	
	public Clazz getClazz(String name) {
		return clazzRegistry.get(name);
	}
	
}
