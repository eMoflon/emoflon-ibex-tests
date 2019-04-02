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
import org.topcased.adele.model.ADELE_Features.DataPort;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Data Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataPortImpl extends DirectedFeatureImpl implements DataPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_FeaturesPackage.Literals.DATA_PORT;
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("data port") || p_keyword.equals("port")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE data port
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isDataPort(){
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
//	public String aadlSerialization(String packageName, String componentIdentifier, ResourceSet res, SKODSFactory odStructure, boolean isRefined) {
//		String aadl="";
//		String dataPortClassifier="NIL";
//		String directionFact = direction.toString();
//		
//		if (directionFact==ADELE_PortDirection.INOUT_LITERAL.toString())
//			directionFact="IN OUT";
//		String refineClause = "NIL";
//		if (isRefined)
//			refineClause = "REFINED TO";
//		
//		ADELE_Component classifier = null;
//		if (getClassifier() != null)
//			classifier = ADELEModelUtils.resolve(getClassifier(), res);
//		if (classifier!=null) {
//			if (classifier.getName().contains(".") || classifier.eContainer() instanceof ADELE_Package)
//				dataPortClassifier = classifier.getName();
//			else if (classifier.isInstance())
//				dataPortClassifier =classifier.getName()+ "_" + classifier.getId().replaceAll("-", "_") + "." + classifier.getImplementationName();
//			else
//				dataPortClassifier =classifier.getName() + "." + classifier.getImplementationName();
//			
//			dataPortClassifier = ADELEModelUtils.getFullNamespaceByEContainer(classifier)+dataPortClassifier;
//		}
//		
//		aadl+="isFeature('PORT','"+ packageName+"','"+componentIdentifier+"','"+name+"','"+directionFact+"','DATA','"+
//				dataPortClassifier+"','NIL','"+refineClause+"','0').\n";
//		
//		aadl+=super.aadlSerialization(packageName, componentIdentifier, res, odStructure, isRefined);
//		
//		return aadl;
//	}

} //ADELE_DataPortImpl