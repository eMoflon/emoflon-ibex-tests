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

import java.io.IOException;
import java.util.Map;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryException;
import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SKOD System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getSections <em>Sections</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getId <em>Id</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getLabel <em>Label</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getMode <em>Mode</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getStyleSheet <em>Style Sheet</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getDomData <em>Dom Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSystem()
 * @model
 * @generated
 */
public interface SKODSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ObjectDescriptionModel.SKODSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSystem_Sections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SKODSection> getSections();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSystem_Id()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSystem_Label()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.adele.model.ObjectDescriptionModel.SKODSMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSMode
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSystem_Mode()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	SKODSMode getMode();

	/**
	 * Returns the value of the '<em><b>Style Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Sheet</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSystem_StyleSheet()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getStyleSheet();

	/**
	 * Returns the value of the '<em><b>Dom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dom Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dom Data</em>' attribute.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#getSKODSystem_DomData()
	 * @model dataType="org.topcased.adele.model.ObjectDescriptionModel.HashMap" required="true" changeable="false"
	 * @generated NOT
	 */
	Map<String, Document> getDomData();
	
	Map<String, String> getDomDataKeys();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	String getDomFilename(Document p_dom);
	
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
	 * @model
	 * @generated NOT
	 */
	void save() throws IOException, TransformerConfigurationException, TransformerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	void save(boolean force) throws IOException, TransformerConfigurationException, TransformerException;

	void rebuildDomData(SKODSFactory factory, SKHierarchicalObject object) throws SKODSFactoryException;

} // SKODSystem