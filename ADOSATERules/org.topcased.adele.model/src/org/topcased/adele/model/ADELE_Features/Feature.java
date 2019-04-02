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

import org.eclipse.emf.common.util.Enumerator;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADELE Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.Feature#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.Feature#isRefinement <em>Refinement</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.Feature#getRefinedFeature <em>Refined Feature</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.Feature#getOriginalFeature <em>Original Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueFeatureNames legalName componentNotNull'"
 * @generated
 */
public interface Feature extends SKFeature {

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(SKComponent)
	 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getFeature_Classifier()
	 * @model
	 * @generated
	 */
	SKComponent getClassifier();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Features.Feature#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(SKComponent value);

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' attribute.
	 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getFeature_Refinement()
	 * @model default="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRefinement();

	/**
	 * Returns the value of the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Feature</em>' reference.
	 * @see #setRefinedFeature(Feature)
	 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getFeature_RefinedFeature()
	 * @model
	 * @generated
	 */
	Feature getRefinedFeature();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Features.Feature#getRefinedFeature <em>Refined Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Feature</em>' reference.
	 * @see #getRefinedFeature()
	 * @generated
	 */
	void setRefinedFeature(Feature value);

	//String aadlSerialization(String packageName, String componentIdentifier, ResourceSet res, SKODSFactory odStructure, boolean isRefined);

	Enumerator getDirection();

	Feature getOriginalFeature();
} // ADELE_Feature
