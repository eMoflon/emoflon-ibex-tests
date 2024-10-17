package org.emoflon.ibex.tgg.operational.csp.constraints.custom.clazz2glossardoc;

import java.util.Collection;
import java.util.LinkedList;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.clazz2glossardoc.*;
import org.emoflon.ibex.tgg.runtime.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;

public class RuntimeTGGAttrConstraintFactoryContainer {

	private Collection<RuntimeTGGAttrConstraintFactory> factories = new LinkedList<>();

	public RuntimeTGGAttrConstraintFactoryContainer() {
	}
	
	public Collection<RuntimeTGGAttrConstraintFactory> getFactories() {
		return factories;
	}
}
