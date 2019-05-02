package org.emoflon.ibex.tgg.operational.csp.constraints.custom.adele2aadl;

import java.util.Random;

import org.eclipse.emf.common.util.Enumerator;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.osate.aadl2.AccessType;
import org.osate.aadl2.DirectionType;
import org.topcased.adele.model.ADELE_Features.AccessDirection;
import org.topcased.adele.model.ADELE_Features.PortDirection;

public class UserDefined_portdirection extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint portdirection(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
        solve(PortDirection.IN_LITERAL, DirectionType.IN, PortDirection.OUT_LITERAL, DirectionType.OUT,PortDirection.INOUT_LITERAL, DirectionType.IN_OUT);
	}
        private void solve(Enumerator typeA1, Enumerator typeB1, Enumerator typeA2, Enumerator typeB2, Enumerator typeA3, Enumerator typeB3) 
        {

		if (variables.size() != 2)
			throw new RuntimeException("The CSP -PORTDIRECTION- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		String bindingStates = getBindingStates(v0, v1);

		
	  	switch(bindingStates) {
	   	  		case "BB": 
	  			PortDirection pd = (PortDirection) v0.getValue();
	  			DirectionType dt = (DirectionType) v1.getValue();
	  			
	  			if (pd.equals(typeA1))
	                setSatisfied(dt.equals(typeB1));
	            else if (pd.equals(typeA2))
	                setSatisfied(dt.equals(typeB2));
	            else if(pd.equals(typeA3));
	  			   setSatisfied(dt.equals(typeB3));
	  			
	  		case "BF": 
	  			 PortDirection pd1 = (PortDirection) v0.getValue();
	             if (pd1.equals(typeA1))
	                 v1.bindToValue(typeB1);
	             else if (pd1.equals(typeA2))
	                 v1.bindToValue(typeB2);
	             else if(pd1.equals(typeA3))
	            	 v1.bindToValue(typeB3);

	             setSatisfied(true);
	             break;
	  		case "FB": 
	  			 DirectionType dt1 = (DirectionType) v1.getValue();

	             if (dt1.equals(typeB1))
	                 v0.bindToValue(typeA1);
	             else if (dt1.equals(typeB2))
	                 v0.bindToValue(typeA2);
	             else if (dt1.equals(typeB3))
	                 v0.bindToValue(typeA3);
	             setSatisfied(true);
	             break;
	  			
	  		case "FF": 
	  			 if (new Random().nextBoolean()) {
	                 v0.bindToValue(typeA1);
	                 v1.bindToValue(typeB1);   	                 
	             } 
	  			 else if(new Random().nextBoolean())
	  			 {
	                 v0.bindToValue(typeA2);
	                 v1.bindToValue(typeB2);
	  			 }
	  			 else if(new Random().nextBoolean())
	  			 {
	                 v0.bindToValue(typeA3);
	                 v1.bindToValue(typeB3);
	             }
	  			 setSatisfied(true);
	             break;	  			
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
}

