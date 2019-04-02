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
 * An implementation of the model object '<em><b>ADELE System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends ComponentImpl implements org.topcased.adele.model.ADELE_Components.System {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_ComponentsPackage.Literals.SYSTEM;
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("system")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE system
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isSystem(){
		return true;
	}
//	
//	@Override
//	public String aadlSerialization(String packageName,ResourceSet res, SKODSFactory odStructure) {
//		String aadl="";
//		if (packageName=="") {
//			String qualifiedName = name;
//			String typeGeneratingName = name+"_" + getId().replaceAll("-", "_");
//			
//			aadl += "isPackage('"+qualifiedName+"','PUBLIC','').\n";
//			
//			for (Resource withRes : res.getResources()) {
//				String resName = withRes.getURI().lastSegment(); 
//				if (resName.endsWith(".adele"))
//					aadl += "isImportDeclaration('"+qualifiedName+"','PUBLIC','"+new StringTokenizer(resName, ".").nextToken()+"','3').\n";
//			}
//			
//			aadl.concat("isPackage('"+qualifiedName+"','"+qualifiedName+"','').\n");
//			
//			aadl += "isComponentType('"+qualifiedName+"','PUBLIC','"+typeGeneratingName+"','SYSTEM','NIL',0).\n";
//		
//			aadl += "isComponentImplementation('"+qualifiedName+"','PUBLIC','"+ typeGeneratingName +
//							"','" + ( (getImplementationName()!="") ? getImplementationName() : "impl") +"','SYSTEM','NIL','NIL',0).\n";
//			
//			for (SKComponent child : getChildren()) {
//				aadl += ( (ADELE_Component)child ).aadlSerialization(qualifiedName,res,odStructure);
//			}
//			
//			aadl += super.aadlConnectionSerialization(qualifiedName, res,odStructure);
//			
//		} else {
//			aadl += super.aadlSerialization(packageName, res,odStructure);
//		}
//		
//		
////		else if (isInstance()) {
////			String classifierName = "";
////			String classifierPackage = "";
////			ADELE_Component classifier;
////			String component_type_identifier="";
////			String component_implementation_identifier="";
////			String componentPackage = packageName;
////			if (getClassifier()==null) {
////				aadl += "isComponentType('"+packageName+"','PUBLIC','"+name+"','SYSTEM','NIL',0).\n";
////			
////				aadl += "isComponentImplementation('"+packageName+"','PUBLIC','"+ name +
////						"','" + getImplementationName() +"','SYSTEM','NIL','NIL',0).\n";
////			} else {
////				classifier = ADELEModelUtils.resolve(getClassifier(), res);
////				
////				if (classifier.getName().contains(".") || classifier.eContainer() instanceof ADELE_Package)
////					classifierName = classifier.getName();
////				else
////					classifierName = classifier.getName() + "." + classifier.getImplementationName();
////				
////				classifierPackage = ADELEModelUtils.getFullNamespaceByEContainer(classifier);
////			}			
////			
////			ADELE_Component containingCompo = (ADELE_Component) eContainer();
////			if (containingCompo.getName().contains(".")) {
////				StringTokenizer tok = new StringTokenizer(containingCompo.getName(), ".");
////				component_type_identifier=tok.nextToken();
////				component_implementation_identifier=tok.nextToken();
////			} else if ( containingCompo.getClassifier()==null ) {
////				component_type_identifier=containingCompo.getName();
////				if (packageName.contains(":"))
////					componentPackage = packageName.substring(0, packageName.lastIndexOf(":")-1);
////				component_implementation_identifier=containingCompo.getImplementationName();
////				if (component_implementation_identifier=="")
////					component_implementation_identifier="impl";
////			}
////			
////			if (component_type_identifier!="")
////				aadl += "isSubcomponent('"+componentPackage+"','"+ component_type_identifier +"','"+component_implementation_identifier+
////									"','"+name+"','"+getClassName()+"','"+ classifierPackage + classifierName + "','NIL','NIL',0).\n";
////
////			for (SKComponent child : getChildren()) {
////				aadl += ( (ADELE_Component)child ).aadlSerialization(packageName,res);
////			}
////			
////		} else {
////			if (isType()) {
////				aadl += "isComponentType('"+packageName+"','PUBLIC','"+name+"','SYSTEM','" +
////								( (getClassifier()!=null) ? getClassifier().getName() : "NIL" ) + "',0).\n";
////				for (SKComponent child : getChildren()) {
////					aadl += ( (ADELE_Component)child ).aadlSerialization(packageName,res);
////				}
////			}
////			if (isImplementation()) {
////				aadl += "isComponentImplementation('"+packageName+"','PUBLIC','"+
////								( (getClassifier()!=null) ? ADELEModelUtils.getFullNamespace(getClassifier())+getClassifier().getName() : "NIL" ) +
////								"','" + name.substring(name.indexOf(".")+1) +"','SYSTEM','NIL','NIL',0).\n";
////
////				for (SKComponent child : getChildren()) {
////					if (child instanceof ADELE_Component)
////						aadl += ( (ADELE_Component)child ).aadlSerialization(packageName,res);
////				}
////				
////				EList<ADELE_Relation> allConnections = new BasicEList<ADELE_Relation>();
////				allConnections.addAll(getAbstractFeatureConnection());
////				allConnections.addAll(getBusAccessConnection());
////				allConnections.addAll(getDataAccessConnection());
////				allConnections.addAll(getDataPortConnection());
////				allConnections.addAll(getEventDataPortConnection());
////				allConnections.addAll(getEventPortConnection());
////				allConnections.addAll(getParameterConnection());
////				allConnections.addAll(getSubprogramAccessConnection());
////				allConnections.addAll(getSubprogramGroupAccessConnection());
////				
////				for (ADELE_Relation cnx : allConnections) {
////					aadl += cnx.aadlSerialization(packageName, name, res);
////				}
////				
////			}
////		}
//		
//		return aadl;
//	}

} //ADELE_SystemImpl