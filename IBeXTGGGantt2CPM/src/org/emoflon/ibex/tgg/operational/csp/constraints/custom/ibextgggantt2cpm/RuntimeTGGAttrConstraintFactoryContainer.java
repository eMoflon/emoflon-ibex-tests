package org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm;

import java.util.Collection;
import java.util.LinkedList;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm.*;
import org.emoflon.ibex.tgg.runtime.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;

public class RuntimeTGGAttrConstraintFactoryContainer {

	private Collection<RuntimeTGGAttrConstraintFactory> factories = new LinkedList<>();

	public RuntimeTGGAttrConstraintFactoryContainer() {
		factories.add(new CustomConditionsRuntimeTGGAttrConstraintFactory());
	}
	
	public Collection<RuntimeTGGAttrConstraintFactory> getFactories() {
		return factories;
	}
}
