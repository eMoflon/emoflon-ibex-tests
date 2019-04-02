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
package org.topcased.adele.model.ADELE_Relations;

import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.KernelSpices.SKRelation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADELE Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getMin <em>Min</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSourceFeature <em>Original Source Feature</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSinkFeature <em>Original Sink Feature</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSourceSubcomponent <em>Original Source Subcomponent</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSinkSubcomponent <em>Original Sink Subcomponent</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getSink <em>Sink</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getOwningComponent <em>Owning Component</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalRelation <em>Original Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noSubcomponentFeatureOfFeatureGroupConnectionEnd'"
 * @generated
 */
public interface Relation extends SKRelation {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(int)
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_Multiplicity()
	 * @model required="true"
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Relations.Relation#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Relations.Relation#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Source Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Source Feature</em>' reference.
	 * @see #setOriginalSourceFeature(Feature)
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_OriginalSourceFeature()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Feature getOriginalSourceFeature();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSourceFeature <em>Original Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Source Feature</em>' reference.
	 * @see #getOriginalSourceFeature()
	 * @generated
	 */
	void setOriginalSourceFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Sink Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Sink Feature</em>' reference.
	 * @see #setOriginalSinkFeature(Feature)
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_OriginalSinkFeature()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Feature getOriginalSinkFeature();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSinkFeature <em>Original Sink Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Sink Feature</em>' reference.
	 * @see #getOriginalSinkFeature()
	 * @generated
	 */
	void setOriginalSinkFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Source Subcomponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Source Subcomponent</em>' reference.
	 * @see #setOriginalSourceSubcomponent(Component)
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_OriginalSourceSubcomponent()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Component getOriginalSourceSubcomponent();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSourceSubcomponent <em>Original Source Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Source Subcomponent</em>' reference.
	 * @see #getOriginalSourceSubcomponent()
	 * @generated
	 */
	void setOriginalSourceSubcomponent(Component value);

	/**
	 * Returns the value of the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Sink Subcomponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Sink Subcomponent</em>' reference.
	 * @see #setOriginalSinkSubcomponent(Component)
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_OriginalSinkSubcomponent()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Component getOriginalSinkSubcomponent();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSinkSubcomponent <em>Original Sink Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Sink Subcomponent</em>' reference.
	 * @see #getOriginalSinkSubcomponent()
	 * @generated
	 */
	void setOriginalSinkSubcomponent(Component value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_Source()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SKObject getSource();

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' reference.
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_Sink()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SKObject getSink();

	/**
	 * Returns the value of the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Component</em>' reference.
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_OwningComponent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Component getOwningComponent();

	/**
	 * Returns the value of the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Relation</em>' reference.
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#getRelation_OriginalRelation()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Relation getOriginalRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getMax();
	
	//String aadlSerialization(String packageName, String componentIdentifier, ResourceSet res, SKODSFactory odStructure);

} // ADELE_Relation
