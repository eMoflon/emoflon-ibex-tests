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
 * 	Jean-Bertrand Hery
 */
package org.topcased.adele.model.ObjectDescriptionModel;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SKODS Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SKODSFactory (Spices Kernel Object Description System Factory) is instanciate with the name of a XML file. Then it can build a specific SKODSystem for a specific SKHierarchicalObject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getDomODS <em>Dom ODS</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getCurrentODSDatafileNode <em>Current ODS Datafile Node</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getDomData <em>Dom Data</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getCurrentObject <em>Current Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSFactory()
 * @model
 * @generated
 */
public interface SKODSFactory extends EObject {

	/**
	 * Returns the value of the '<em><b>Dom ODS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dom ODS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dom ODS</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSFactory_DomODS()
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.Document" required="true" changeable="false"
	 * @generated
	 */
	Document getDomODS();

	/**
	 * Returns the value of the '<em><b>Current ODS Datafile Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current ODS Datafile Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current ODS Datafile Node</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSFactory_CurrentODSDatafileNode()
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.Node" required="true" changeable="false"
	 * @generated
	 */
	Node getCurrentODSDatafileNode();

	/**
	 * Returns the value of the '<em><b>Dom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dom Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dom Data</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSFactory_DomData()
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashMap" changeable="false"
	 * @generated
	 */
	HashMap getDomData();

	/**
	 * Returns the value of the '<em><b>Current Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Object</em>' reference.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSFactory_CurrentObject()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	SKHierarchicalObject getCurrentObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentProjectDirectory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentObjectName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	SKODSystem getODSystem(String p_odsId, SKHierarchicalObject p_object) throws SKODSFactoryException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentWorkspaceDirectory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentDesignDirectory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentObjectDirectory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentObjectLocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentProjectName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentDesignName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getCurrentObjectId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<String> getODSystemsId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" many="false"
	 * @generated
	 */
	EList<String> getODSystemsLabel();

	Map<String, Document> rebuildDomData(SKODSystem odsystem, SKHierarchicalObject object) throws SKODSFactoryException;
	
} // SKODSFactory