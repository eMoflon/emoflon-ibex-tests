package org.emoflon.ibex.tgg.run.bench.util;

import org.emoflon.express.express.Entity;

import Express2UML.Entity2Clazz;
import uml.Clazz;

public class InheritanceContainer {

	private final Entity entity;
	private final Clazz clazz;
	private final Entity2Clazz correspondence;
	
	public InheritanceContainer(Entity entity, Clazz clazz, Entity2Clazz correspondence) {
		super();
		this.entity = entity;
		this.clazz = clazz;
		this.correspondence = correspondence;
	}

	public Entity getEntity() {
		return entity;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public Entity2Clazz getCorrespondence() {
		return correspondence;
	}
	
}
