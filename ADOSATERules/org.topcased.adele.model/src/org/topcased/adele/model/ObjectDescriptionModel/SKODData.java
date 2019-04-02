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

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SKOD Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#getValue <em>Value</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#isModified <em>Modified</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#getDom <em>Dom</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#getNode <em>Node</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#isExternal <em>External</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODData()
 * @model
 * @generated
 */
public interface SKODData extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODData_Value()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODData_Modified()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	boolean isModified();

	/**
	 * Returns the value of the '<em><b>Dom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dom</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODData_Dom()
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.Document" required="true" changeable="false"
	 * @generated
	 */
	Document getDom();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODData_Node()
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.Node" required="true" changeable="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODData_External()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	void setValue(String p_data)throws SKODSFactoryException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet" required="true" p_modifiedDomsDataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet"
	 * @generated
	 */
	HashSet flush(HashSet p_modifiedDoms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet" required="true" p_modifiedDomsDataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet"
	 * @generated
	 */
	//HashSet flush(HashSet p_modifiedDoms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet" required="true" p_modifiedDomsDataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet"
	 * @generated
	 */
	//HashSet flush(HashSet p_modifiedDoms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet" required="true" p_modifiedDomsDataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet"
	 * @generated NOT
	 */
	HashSet<Document> flush(HashSet<Document> p_modifiedDoms,
			boolean force);

} // SKODData
