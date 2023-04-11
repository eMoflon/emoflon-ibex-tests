package org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.runtime.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm.customconditions.UserDefined_notADependencyViaNamingConvention;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm.customconditions.UserDefined_setCounter;

public class CustomConditionsRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public CustomConditionsRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("notADependencyViaNamingConvention", () -> new UserDefined_notADependencyViaNamingConvention());
		creators.put("setCounter", () -> new UserDefined_setCounter());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
	
	@Override
	public String getLibraryName() {
		return "CustomConditions";
	}
}
