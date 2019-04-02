package org.emoflon.ibex.tgg.operational.csp.constraints.factories.adele2aadl;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.adele2aadl.UserDefined_test;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("test", () -> new UserDefined_test());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
