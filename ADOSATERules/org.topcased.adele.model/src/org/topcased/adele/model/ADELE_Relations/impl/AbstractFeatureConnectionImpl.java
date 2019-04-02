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
package org.topcased.adele.model.ADELE_Relations.impl;

import org.eclipse.emf.ecore.EClass;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Abstract Feature Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AbstractFeatureConnectionImpl extends DirectedFeatureConnectionImpl implements AbstractFeatureConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_RelationsPackage.Literals.ABSTRACT_FEATURE_CONNECTION;
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("connections") || p_keyword.equals("feature connections")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE connection
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isConnection(){
		return true;
	}
	
	/**
	 * Test if the current element is an ADELE feature connection
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isFeatureConnection(){
		return true;
	}
	
	public String getConnectionType() {
		return "FEATURE";
	}
//
//	public String aadlSerialization(String packageName,
//			String componentIdentifier, ResourceSet res,
//			SKODSFactory odStructure) {
//		// TODO Auto-generated method stub
//		return super.aadlSerialization(packageName, componentIdentifier, res, odStructure);
//	}

} //ADELE_AbstractFeatureConnectionImpl
