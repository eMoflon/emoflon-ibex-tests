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



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SK Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKFeature#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKFeature#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKFeature()
 * @model
 * @generated
 */
public interface SKFeature extends SKHierarchicalObject {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.adele.model.KernelSpices.SKFeatureVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.topcased.adele.model.KernelSpices.SKFeatureVisibility
	 * @see #setVisibility(SKFeatureVisibility)
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKFeature_Visibility()
	 * @model required="true"
	 * @generated
	 */
	SKFeatureVisibility getVisibility();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.KernelSpices.SKFeature#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.topcased.adele.model.KernelSpices.SKFeatureVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(SKFeatureVisibility value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.topcased.adele.model.KernelSpices.SKComponent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(SKComponent)
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKFeature_Component()
	 * @see org.topcased.adele.model.KernelSpices.SKComponent#getFeatures
	 * @model opposite="features" transient="false"
	 * @generated
	 */
	SKComponent getComponent();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.KernelSpices.SKFeature#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(SKComponent value);

} // SKFeature
