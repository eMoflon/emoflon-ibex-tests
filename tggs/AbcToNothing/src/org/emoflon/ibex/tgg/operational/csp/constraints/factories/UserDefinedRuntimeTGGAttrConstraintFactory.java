package org.emoflon.ibex.tgg.operational.csp.constraints.factories;

import java.util.HashMap;
import java.util.HashSet;			


public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
