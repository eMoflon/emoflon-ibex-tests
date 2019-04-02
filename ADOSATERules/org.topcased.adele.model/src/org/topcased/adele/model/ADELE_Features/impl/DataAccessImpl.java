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
import org.topcased.adele.model.ADELE_Features.DataAccess;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Data Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DataAccessImpl extends AccessImpl implements DataAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_FeaturesPackage.Literals.DATA_ACCESS;
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("data access")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE data access
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isDataAccess(){
		return true;
	}
//
//	public String aadlSerialization(String packageName, String componentIdentifier, ResourceSet res, SKODSFactory odStructure, boolean isRefined) {
//		String aadl="";
//		String dataPortClassifier="NIL";
//		String directionFact = direction.toString().replaceFirst("ed", "es");
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
//		aadl+="isFeature('ACCESS','"+ packageName+"','"+componentIdentifier+"','"+name+"','"+directionFact+"','DATA','"+
//				dataPortClassifier+"','NIL','"+refineClause+"','0').\n";
//		
//		aadl+=super.aadlSerialization(packageName, componentIdentifier, res, odStructure, isRefined);
//		
//		return aadl;
//	}

} //ADELE_DataAccessImpl