package org.emoflon.ibex.tgg.operational.csp.constraints.custom;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_rand extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint rand(v0)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -RAND- needs exactly 0 variables");

		RuntimeTGGAttributeConstraintVariable var_0 = variables.get(0);
		String bindingStates = getBindingStates(var_0);

	  	switch(bindingStates) {
	  		case "F": 
	  			var_0.bindToValue(generateValue(var_0.getType()));
				setSatisfied(true);
				return;
				
	  		case "B": 
				setSatisfied(true);
				return;
				
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
}

