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
package org.topcased.adele.model.ADELE_Components;

import org.eclipse.emf.common.util.EList;
import org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection;
import org.topcased.adele.model.ADELE_Relations.BusAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventDataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventPortConnection;
import org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection;
import org.topcased.adele.model.ADELE_Relations.ParameterConnection;
import org.topcased.adele.model.ADELE_Relations.Relation;
import org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection;
import org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.ba_relations.BATransition;
import org.topcased.adele.model.errors.UncompatibleRefinesReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADELE Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getMin <em>Min</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getType <em>Type</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getImplementationName <em>Implementation Name</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#isFeaturesLock <em>Features Lock</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#isSubcomponentsLock <em>Subcomponents Lock</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#isSubcomponentRefinement <em>Subcomponent Refinement</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getBaTransition <em>Ba Transition</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getEventDataPortConnection <em>Event Data Port Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getEventPortConnection <em>Event Port Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getDataPortConnection <em>Data Port Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getDataAccessConnection <em>Data Access Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getBusAccessConnection <em>Bus Access Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getSubprogramAccessConnection <em>Subprogram Access Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getParameterConnection <em>Parameter Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getSubprogramGroupAccessConnection <em>Subprogram Group Access Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getAbstractFeatureConnection <em>Abstract Feature Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getFeatureGroupConnection <em>Feature Group Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getAllRefines <em>All Refines</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getRefinedSubcomponent <em>Refined Subcomponent</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getAllRealFeatures <em>All Real Features</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getAllRealChildrenComponents <em>All Real Children Components</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getOriginalComponent <em>Original Component</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getAllRelations <em>All Relations</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getAllRealRelations <em>All Real Relations</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getAllOriginalRelations <em>All Original Relations</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.Component#getSubcomponentType <em>Subcomponent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueChildrenNames legalName legalChildren'"
 * @generated
 */
public interface Component extends SKComponent {
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
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_Multiplicity()
	 * @model required="true"
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#getMultiplicity <em>Multiplicity</em>}' attribute.
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
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_Type()
	 * @model
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(Component)
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_Implementation()
	 * @model
	 * @generated
	 */
	Component getImplementation();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Component value);

	/**
	 * Returns the value of the '<em><b>Implementation Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Name</em>' attribute.
	 * @see #setImplementationName(String)
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_ImplementationName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getImplementationName();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#getImplementationName <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Name</em>' attribute.
	 * @see #getImplementationName()
	 * @generated
	 */
	void setImplementationName(String value);

	/**
	 * Returns the value of the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Lock</em>' attribute.
	 * @see #setFeaturesLock(boolean)
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_FeaturesLock()
	 * @model required="true"
	 * @generated
	 */
	boolean isFeaturesLock();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#isFeaturesLock <em>Features Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features Lock</em>' attribute.
	 * @see #isFeaturesLock()
	 * @generated
	 */
	void setFeaturesLock(boolean value);

	/**
	 * Returns the value of the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents Lock</em>' attribute.
	 * @see #setSubcomponentsLock(boolean)
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_SubcomponentsLock()
	 * @model required="true"
	 * @generated
	 */
	boolean isSubcomponentsLock();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#isSubcomponentsLock <em>Subcomponents Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcomponents Lock</em>' attribute.
	 * @see #isSubcomponentsLock()
	 * @generated
	 */
	void setSubcomponentsLock(boolean value);

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Component)
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_Refines()
	 * @model
	 * @generated
	 */
	Component getRefines();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Component value);

	/**
	 * Returns the value of the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponent Refinement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent Refinement</em>' attribute.
	 * @see #setSubcomponentRefinement(boolean)
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_SubcomponentRefinement()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSubcomponentRefinement();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#isSubcomponentRefinement <em>Subcomponent Refinement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcomponent Refinement</em>' attribute.
	 * @see #isSubcomponentRefinement()
	 * @generated
	 */
	void setSubcomponentRefinement(boolean value);

	/**
	 * Returns the value of the '<em><b>Ba Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ba_relations.BATransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ba Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ba Transition</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_BaTransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<BATransition> getBaTransition();

	/**
	 * Returns the value of the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.EventDataPortConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Data Port Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Data Port Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_EventDataPortConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventDataPortConnection> getEventDataPortConnection();

	/**
	 * Returns the value of the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.EventPortConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Port Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Port Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_EventPortConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventPortConnection> getEventPortConnection();

	/**
	 * Returns the value of the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.DataPortConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Port Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Port Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_DataPortConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPortConnection> getDataPortConnection();

	/**
	 * Returns the value of the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.DataAccessConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Access Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Access Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_DataAccessConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataAccessConnection> getDataAccessConnection();

	/**
	 * Returns the value of the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.BusAccessConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Access Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Access Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_BusAccessConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusAccessConnection> getBusAccessConnection();

	/**
	 * Returns the value of the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprogram Access Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprogram Access Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_SubprogramAccessConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubprogramAccessConnection> getSubprogramAccessConnection();

	/**
	 * Returns the value of the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.ParameterConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_ParameterConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterConnection> getParameterConnection();

	/**
	 * Returns the value of the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprogram Group Access Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprogram Group Access Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_SubprogramGroupAccessConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubprogramGroupAccessConnection> getSubprogramGroupAccessConnection();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Feature Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_AbstractFeatureConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractFeatureConnection> getAbstractFeatureConnection();

	/**
	 * Returns the value of the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Group Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Group Connection</em>' containment reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_FeatureGroupConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureGroupConnection> getFeatureGroupConnection();

	/**
	 * Returns the value of the '<em><b>All Refines</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Components.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Refines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Refines</em>' reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_AllRefines()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Component> getAllRefines();

	/**
	 * Returns the value of the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Subcomponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Subcomponent</em>' reference.
	 * @see #setRefinedSubcomponent(Component)
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_RefinedSubcomponent()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Component getRefinedSubcomponent();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#getRefinedSubcomponent <em>Refined Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Subcomponent</em>' reference.
	 * @see #getRefinedSubcomponent()
	 * @generated
	 */
	void setRefinedSubcomponent(Component value);

	/**
	 * Returns the value of the '<em><b>All Real Features</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.KernelSpices.SKFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Real Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Real Features</em>' reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_AllRealFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SKFeature> getAllRealFeatures();

	/**
	 * Returns the value of the '<em><b>All Real Children Components</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.KernelSpices.SKComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Children Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Real Children Components</em>' reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_AllRealChildrenComponents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SKComponent> getAllRealChildrenComponents();

	/**
	 * Returns the value of the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Component</em>' reference.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_OriginalComponent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Component getOriginalComponent();

	/**
	 * Returns the value of the '<em><b>All Relations</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Relations</em>' reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_AllRelations()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Relation> getAllRelations();

	/**
	 * Returns the value of the '<em><b>All Real Relations</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Real Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Real Relations</em>' reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_AllRealRelations()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Relation> getAllRealRelations();

	/**
	 * Returns the value of the '<em><b>All Original Relations</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ADELE_Relations.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Original Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Original Relations</em>' reference list.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_AllOriginalRelations()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Relation> getAllOriginalRelations();

	/**
	 * Returns the value of the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponent Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent Type</em>' reference.
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#getComponent_SubcomponentType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Component getSubcomponentType();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Components.Component#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated NOT
	 */
	void setRefinesValidated(Component newRefines) throws UncompatibleRefinesReference;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Component getClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isImplementation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isSubcomponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	//String aadlSerialization(String packageName, ResourceSet res, SKODSFactory odStructure);

} // ADELE_Component
