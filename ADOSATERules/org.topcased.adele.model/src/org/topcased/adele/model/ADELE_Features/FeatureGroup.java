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
package org.topcased.adele.model.ADELE_Features;

import org.eclipse.emf.common.util.EList;
import org.topcased.adele.model.KernelSpices.SKComponent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADELE Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.FeatureGroup#getInverseFeature <em>Inverse Feature</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.FeatureGroup#isType <em>Type</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.FeatureGroup#getAllRealFeatures <em>All Real Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getFeatureGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='consistentDirections'"
 * @generated
 */
public interface FeatureGroup extends DirectedFeature, SKComponent {

	/**
	 * Returns the value of the '<em><b>Inverse Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse Feature</em>' reference.
	 * @see #setInverseFeature(FeatureGroup)
	 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getFeatureGroup_InverseFeature()
	 * @model resolveProxies="false"
	 * @generated
	 */
	FeatureGroup getInverseFeature();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Features.FeatureGroup#getInverseFeature <em>Inverse Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Feature</em>' reference.
	 * @see #getInverseFeature()
	 * @generated
	 */
	void setInverseFeature(FeatureGroup value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getFeatureGroup_Type()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isType();

	/**
	 * Returns the value of the '<em><b>All Real Features</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Features.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Real Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Real Features</em>' reference list.
	 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getFeatureGroup_AllRealFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Feature> getAllRealFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureRequired="true"
	 * @generated
	 */
	boolean isInverse(Feature feature);
} // ADELE_FeatureGroup
