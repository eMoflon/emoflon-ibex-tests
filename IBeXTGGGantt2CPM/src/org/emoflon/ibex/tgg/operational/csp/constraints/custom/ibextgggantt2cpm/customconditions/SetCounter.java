package org.emoflon.ibex.tgg.operational.csp.constraints.custom.ibextgggantt2cpm.customconditions;

import org.emoflon.ibex.tgg.runtime.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.runtime.csp.RuntimeTGGAttributeConstraintVariable;

public class SetCounter extends RuntimeTGGAttributeConstraint
{
	private static int nextNumber = 1;

   /**
    * Constraint setCounter(v0)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -SETCOUNTER- needs exactly 1 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		String bindingStates = getBindingStates(v0);

		switch (bindingStates) {
		case "F": 
			v0.bindToValue(nextNumber++);
			setSatisfied(true);
			break;
		case "B":
			setSatisfied(true);
			break;
		default:
			throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}

