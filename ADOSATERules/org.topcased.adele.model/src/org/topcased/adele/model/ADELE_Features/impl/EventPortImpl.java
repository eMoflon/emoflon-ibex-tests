/**
 * Copyright (c) 2009 Ellidiss Technologies
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Arnaud Schach, arnaud.schach.com
 */
package org.topcased.adele.model.ADELE_Features.impl;

import org.eclipse.emf.ecore.EClass;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.EventPort;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Event Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventPortImpl extends DirectedFeatureImpl implements EventPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_FeaturesPackage.Literals.EVENT_PORT;
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("event port") || p_keyword.equals("port")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE event port
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isEventPort(){
		return true;
	}
	
	/**
	 * Test if the current element is an ADELE port
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isPort(){
		return true;
	}
//	
//	@Override
//	public void setName( String p_name ) {
//		super.setName( p_name );
//	}
//
//	public String aadlSerialization(String packageName, String componentIdentifier, ResourceSet res, SKODSFactory odStructure, boolean isRefined) {
//		String aadl="";
//		String directionFact = direction.toString();
//		
//		if (directionFact==ADELE_PortDirection.INOUT_LITERAL.toString())
//			directionFact="IN OUT";
//		
//		aadl+="isFeature('PORT','"+ packageName+"','"+componentIdentifier+"','"+name+"','"+directionFact+"','EVENT','NIL','NIL','NIL','0').\n";
//		
//		aadl+=super.aadlSerialization(packageName, componentIdentifier, res, odStructure, isRefined);
//		
//		return aadl;
//	}

} //ADELE_EventPortImpl