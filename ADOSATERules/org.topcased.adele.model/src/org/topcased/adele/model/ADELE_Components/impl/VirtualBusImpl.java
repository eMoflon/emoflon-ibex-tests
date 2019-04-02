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
package org.topcased.adele.model.ADELE_Components.impl;

import org.eclipse.emf.ecore.EClass;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage;
import org.topcased.adele.model.ADELE_Components.VirtualBus;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Virtual Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VirtualBusImpl extends ComponentImpl implements VirtualBus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_ComponentsPackage.Literals.VIRTUAL_BUS;
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("virtual bus")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE virtual bus
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isVirtualBus(){
		return true;
	}
	
	@Override
	public String getClassName() {
		return "VIRTUAL BUS";
	}

} //ADELE_VirtualBusImpl
