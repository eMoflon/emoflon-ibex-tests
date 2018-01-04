		package org.emoflon.ibex.tgg.operational.csp.constraints.factories;
		
		import java.util.HashMap;
		import java.util.HashSet;			

		import org.emoflon.ibex.tgg.operational.csp.constraints.custom.UserDefined_rand;
		
		public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {
		
			public UserDefinedRuntimeTGGAttrConstraintFactory() {
				super();
			}
			
			@Override
			protected void initialize() {
				creators = new HashMap<>();
				creators.put("rand", () -> new UserDefined_rand());
				
				constraints = new HashSet<String>();
				constraints.addAll(creators.keySet());
			}
		}
