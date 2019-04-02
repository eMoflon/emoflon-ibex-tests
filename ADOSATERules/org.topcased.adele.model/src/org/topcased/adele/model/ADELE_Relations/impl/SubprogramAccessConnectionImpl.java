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
import org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Subprogram Access Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubprogramAccessConnectionImpl extends AccessConnectionImpl implements SubprogramAccessConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramAccessConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_RelationsPackage.Literals.SUBPROGRAM_ACCESS_CONNECTION;
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("connections") || 
				p_keyword.equals("access connections") ||
				p_keyword.equals("subprogram access connection")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE port group
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isSubprogramAccessConnection(){
		return true;
	}
	
	/**
	 * Test if the current element is an ADELE access connection
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isAccessConnection(){
		return true;
	}
	
	/**
	 * Test if the current element is an ADELE connection
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isConnection(){
		return true;
	}
	
	public String getConnectionType() {
		return "SUBPROGRAM ACCESS";
	}
//
//	public String aadlSerialization(String packageName,
//			String componentIdentifier, ResourceSet res,
//			SKODSFactory odStructure) {
//		// TODO Auto-generated method stub
//		return super.aadlSerialization(packageName, componentIdentifier, res, odStructure);
//	}

} //ADELE_SubprogramAccessConnectionImpl
