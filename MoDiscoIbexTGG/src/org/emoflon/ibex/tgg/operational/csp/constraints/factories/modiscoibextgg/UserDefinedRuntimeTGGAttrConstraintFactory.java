package org.emoflon.ibex.tgg.operational.csp.constraints.factories.modiscoibextgg;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscoibextgg.UserDefined_isInParameter;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscoibextgg.UserDefined_isReturn;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscoibextgg.UserDefined_proxyToUmlModelName;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("isInParameter", () -> new UserDefined_isInParameter());
		creators.put("isReturn", () -> new UserDefined_isReturn());
		creators.put("proxyToUmlModelName", () -> new UserDefined_proxyToUmlModelName());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
