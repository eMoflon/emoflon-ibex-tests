package org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscoibextgg;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.runtime.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscoibextgg.modiscocsps.IsInParameter;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscoibextgg.modiscocsps.IsReturn;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscoibextgg.modiscocsps.ProxyToUmlModelName;

public class ModiscoCSPsRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public ModiscoCSPsRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("isInParameter", () -> new IsInParameter());
		creators.put("isReturn", () -> new IsReturn());
		creators.put("proxyToUmlModelName", () -> new ProxyToUmlModelName());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
	
	@Override
	public String getLibraryName() {
		return "ModiscoCSPs";
	}
}
