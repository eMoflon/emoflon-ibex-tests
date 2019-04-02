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

import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SKOD Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getLabel <em>Label</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getDomODSNode <em>Dom ODS Node</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSection()
 * @model
 * @generated
 */
public interface SKODSection extends SKHierarchicalObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nom affiché de la section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSection_Label()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Dom ODS Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lien vers la section XML qui a donné naissance à cette section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dom ODS Node</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSection_DomODSNode()
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.Node" required="true" changeable="false"
	 * @generated
	 */
	Node getDomODSNode();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSection_Data()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	SKODData getData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I return my name. id and name are the same datum.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isModified();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isInDeepModified();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setValueData(String p_data) throws SKODSFactoryException ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet" required="true" p_modifiedDomsDataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet"
	 * @generated
	 */
	HashSet deepFlushData(HashSet p_modifiedDoms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet" required="true" p_modifiedDomsDataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet"
	 * @generated
	 */
	//HashSet deepFlushData(HashSet p_modifiedDoms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet" required="true" p_modifiedDomsDataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet"
	 * @generated
	 */
	//HashSet deepFlushData(HashSet p_modifiedDoms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet" required="true" p_modifiedDomsDataType="org.topcased.adele.model.ObjectDescriptionModel.HashSet"
	 * @generated NOT
	 */
	HashSet<Document> deepFlushData(HashSet<Document> p_modifiedDoms,
			boolean force);

} // SKODSection