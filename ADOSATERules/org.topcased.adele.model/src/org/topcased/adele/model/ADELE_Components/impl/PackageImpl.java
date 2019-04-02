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
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends ComponentImpl implements org.topcased.adele.model.ADELE_Components.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_ComponentsPackage.Literals.PACKAGE;
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("package")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE package
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isPackage(){
		return true;
	}
//	
//	@Override
//	public String aadlSerialization(String packageName,ResourceSet res, SKODSFactory odStructure) {
//		String qualifiedName = name;
//		if (packageName != "")
//			qualifiedName = packageName  + qualifiedName;
//		String aadl = "isPackage('"+qualifiedName+"','PUBLIC','').\n";
//		aadl.concat("isPackage('"+qualifiedName+"','"+qualifiedName+"','').\n");
//		
//		for (Resource withRes : res.getResources()) {
//			String resName = withRes.getURI().lastSegment(); 
//			if (resName.endsWith(".adele"))
//				aadl += "isImportDeclaration('"+qualifiedName+"','PUBLIC','"+new StringTokenizer(resName, ".").nextToken()+"','3').\n";
//		}
//		
//		for (SKComponent child : getChildren()) {
//			if (! ( child instanceof ADELE_Package) )
//				aadl += ( (ADELE_Component)child ).aadlSerialization(qualifiedName,res,odStructure);
//		}
//		return aadl;
//	}

} //ADELE_PackageImpl