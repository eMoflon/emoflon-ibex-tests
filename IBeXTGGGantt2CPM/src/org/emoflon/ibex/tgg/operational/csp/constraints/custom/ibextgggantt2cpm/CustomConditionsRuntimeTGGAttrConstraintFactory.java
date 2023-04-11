package org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.runtime.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm.customconditions.NotADependencyViaNamingConvention;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm.customconditions.SetCounter;

public class CustomConditionsRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public CustomConditionsRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("notADependencyViaNamingConvention", () -> new NotADependencyViaNamingConvention());
		creators.put("setCounter", () -> new SetCounter());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
	
	@Override
	public String getLibraryName() {
		return "CustomConditions";
	}
}
