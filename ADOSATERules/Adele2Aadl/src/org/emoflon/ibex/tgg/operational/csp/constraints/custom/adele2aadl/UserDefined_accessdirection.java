package org.emoflon.ibex.tgg.operational.csp.constraints.custom.adele2aadl;

import java.util.Random;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.osate.aadl2.AccessType;
import org.topcased.adele.model.ADELE_Features.AccessDirection;

public class UserDefined_accessdirection extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint accessdirection(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		solve(AccessDirection.PROVIDED_LITERAL, AccessType.PROVIDES, AccessDirection.REQUIRED_LITERAL, AccessType.REQUIRES);
	}
	
	private void solve(Enumerator typeA1, Enumerator typeB1, Enumerator typeA2, Enumerator typeB2) {
		if (variables.size() != 2)
			throw new RuntimeException("The CSP -ACCESSDIRECTION- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		String bindingStates = getBindingStates(v0, v1);

		switch (bindingStates) {
		case "BB":
			AccessDirection ad = (AccessDirection) v0.getValue();
			AccessType at = (AccessType) v1.getValue();

			if (ad.equals(typeA1))
				setSatisfied(at.equals(typeB1));
			else if (ad.equals(typeA2))
				setSatisfied(at.equals(typeB2));
			break;
		case "BF":
			AccessDirection ad1 = (AccessDirection) v0.getValue();

			if (ad1.equals(typeA1))
				v1.bindToValue(typeB1);
			else if (ad1.equals(typeA2))
				v1.bindToValue(typeB2);

			setSatisfied(true);
			break;
		case "FB":
			AccessType at1 = (AccessType) v1.getValue();

			if (at1.equals(typeB1))
				v0.bindToValue(typeA1);
			else if (at1.equals(typeB2))
				v0.bindToValue(typeA2);

			setSatisfied(true);
			break;
		case "FF":
			if (new Random().nextBoolean()) {
				v0.bindToValue(createLiteral(typeA1));
				v1.bindToValue(createLiteral(typeB1));
			} else {
				v0.bindToValue(createLiteral(typeA2));
				v1.bindToValue(createLiteral(typeB2));
			}

			setSatisfied(true);
			break;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}

	private EEnumLiteral createLiteral(Enumerator type) {
		EEnumLiteral lit = EcoreFactory.eINSTANCE.createEEnumLiteral();
		lit.setLiteral(type.getLiteral());
		return lit;
	}
	
}

