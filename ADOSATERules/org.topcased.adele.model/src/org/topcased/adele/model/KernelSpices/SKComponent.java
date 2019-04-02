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
package org.topcased.adele.model.KernelSpices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SK Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKComponent#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKComponent#getAuthorizedSubcomponents <em>Authorized Subcomponents</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKComponent#getAuthorizedFeatures <em>Authorized Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKComponent()
 * @model
 * @generated
 */
public interface SKComponent extends SKHierarchicalObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.KernelSpices.SKFeature}.
	 * It is bidirectional and its opposite is '{@link org.topcased.adele.model.KernelSpices.SKFeature#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKComponent_Features()
	 * @see org.topcased.adele.model.KernelSpices.SKFeature#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<SKFeature> getFeatures();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SKFeature getNamedFeature(String p_name);


	/**
	 * Returns the value of the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Subcomponents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Subcomponents</em>' attribute.
	 * @see #setAuthorizedSubcomponents(EList)
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKComponent_AuthorizedSubcomponents()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<SKComponent> getAuthorizedSubcomponents();


	/**
	 * Sets the value of the '{@link org.topcased.adele.model.KernelSpices.SKComponent#getAuthorizedSubcomponents <em>Authorized Subcomponents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorized Subcomponents</em>' attribute.
	 * @see #getAuthorizedSubcomponents()
	 * @generated
	 */
	void setAuthorizedSubcomponents(EList<SKComponent> value);


	/**
	 * Returns the value of the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Features</em>' attribute.
	 * @see #setAuthorizedFeatures(EList)
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKComponent_AuthorizedFeatures()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<SKComponent> getAuthorizedFeatures();


	/**
	 * Sets the value of the '{@link org.topcased.adele.model.KernelSpices.SKComponent#getAuthorizedFeatures <em>Authorized Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorized Features</em>' attribute.
	 * @see #getAuthorizedFeatures()
	 * @generated
	 */
	void setAuthorizedFeatures(EList<SKComponent> value);

} // SKComponent