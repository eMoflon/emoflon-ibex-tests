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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ADELE_ComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ADELE_Components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ADELE_Components";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ADELE_Components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ADELE_ComponentsPackage eINSTANCE = org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.ComponentImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = KernelSpicesPackage.SK_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = KernelSpicesPackage.SK_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LEVEL = KernelSpicesPackage.SK_COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = KernelSpicesPackage.SK_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = KernelSpicesPackage.SK_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CHILDREN = KernelSpicesPackage.SK_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OD_SYSTEMS = KernelSpicesPackage.SK_COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEATURES = KernelSpicesPackage.SK_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTHORIZED_SUBCOMPONENTS = KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTHORIZED_FEATURES = KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MULTIPLICITY = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MIN = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION_NAME = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEATURES_LOCK = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUBCOMPONENTS_LOCK = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFINES = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUBCOMPONENT_REFINEMENT = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BA_TRANSITION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EVENT_DATA_PORT_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EVENT_PORT_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA_PORT_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA_ACCESS_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BUS_ACCESS_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUBPROGRAM_ACCESS_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAMETER_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ABSTRACT_FEATURE_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEATURE_GROUP_CONNECTION = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALL_REFINES = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFINED_SUBCOMPONENT = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALL_REAL_FEATURES = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALL_REAL_CHILDREN_COMPONENTS = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ORIGINAL_COMPONENT = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALL_RELATIONS = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALL_REAL_RELATIONS = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALL_ORIGINAL_RELATIONS = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUBCOMPONENT_TYPE = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 28;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 29;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.BusImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.PackageImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.DataImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getData()
	 * @generated
	 */
	int DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.DeviceImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.MemoryImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.ProcessImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.ProcessorImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.SubprogramImpl <em>Subprogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.SubprogramImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getSubprogram()
	 * @generated
	 */
	int SUBPROGRAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Subprogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.SystemImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.ThreadImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.ThreadGroupImpl <em>Thread Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.ThreadGroupImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getThreadGroup()
	 * @generated
	 */
	int THREAD_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Thread Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.SubprogramGroupImpl <em>Subprogram Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.SubprogramGroupImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getSubprogramGroup()
	 * @generated
	 */
	int SUBPROGRAM_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Subprogram Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.AbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.AbstractImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getAbstract()
	 * @generated
	 */
	int ABSTRACT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.VirtualProcessorImpl <em>Virtual Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.VirtualProcessorImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getVirtualProcessor()
	 * @generated
	 */
	int VIRTUAL_PROCESSOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Virtual Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Components.impl.VirtualBusImpl <em>Virtual Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Components.impl.VirtualBusImpl
	 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getVirtualBus()
	 * @generated
	 */
	int VIRTUAL_BUS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__LEVEL = COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__CHILDREN = COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__OD_SYSTEMS = COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__FEATURES = COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__AUTHORIZED_SUBCOMPONENTS = COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__AUTHORIZED_FEATURES = COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__MULTIPLICITY = COMPONENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__MIN = COMPONENT__MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__TYPE = COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__IMPLEMENTATION = COMPONENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__IMPLEMENTATION_NAME = COMPONENT__IMPLEMENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Features Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__FEATURES_LOCK = COMPONENT__FEATURES_LOCK;

	/**
	 * The feature id for the '<em><b>Subcomponents Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__SUBCOMPONENTS_LOCK = COMPONENT__SUBCOMPONENTS_LOCK;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__REFINES = COMPONENT__REFINES;

	/**
	 * The feature id for the '<em><b>Subcomponent Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__SUBCOMPONENT_REFINEMENT = COMPONENT__SUBCOMPONENT_REFINEMENT;

	/**
	 * The feature id for the '<em><b>Ba Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__BA_TRANSITION = COMPONENT__BA_TRANSITION;

	/**
	 * The feature id for the '<em><b>Event Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__EVENT_DATA_PORT_CONNECTION = COMPONENT__EVENT_DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Event Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__EVENT_PORT_CONNECTION = COMPONENT__EVENT_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Port Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__DATA_PORT_CONNECTION = COMPONENT__DATA_PORT_CONNECTION;

	/**
	 * The feature id for the '<em><b>Data Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__DATA_ACCESS_CONNECTION = COMPONENT__DATA_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Bus Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__BUS_ACCESS_CONNECTION = COMPONENT__BUS_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__SUBPROGRAM_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Parameter Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__PARAMETER_CONNECTION = COMPONENT__PARAMETER_CONNECTION;

	/**
	 * The feature id for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__SUBPROGRAM_GROUP_ACCESS_CONNECTION = COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Abstract Feature Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ABSTRACT_FEATURE_CONNECTION = COMPONENT__ABSTRACT_FEATURE_CONNECTION;

	/**
	 * The feature id for the '<em><b>Feature Group Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__FEATURE_GROUP_CONNECTION = COMPONENT__FEATURE_GROUP_CONNECTION;

	/**
	 * The feature id for the '<em><b>All Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ALL_REFINES = COMPONENT__ALL_REFINES;

	/**
	 * The feature id for the '<em><b>Refined Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__REFINED_SUBCOMPONENT = COMPONENT__REFINED_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ALL_REAL_FEATURES = COMPONENT__ALL_REAL_FEATURES;

	/**
	 * The feature id for the '<em><b>All Real Children Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ALL_REAL_CHILDREN_COMPONENTS = COMPONENT__ALL_REAL_CHILDREN_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Original Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ORIGINAL_COMPONENT = COMPONENT__ORIGINAL_COMPONENT;

	/**
	 * The feature id for the '<em><b>All Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ALL_RELATIONS = COMPONENT__ALL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Real Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ALL_REAL_RELATIONS = COMPONENT__ALL_REAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>All Original Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__ALL_ORIGINAL_RELATIONS = COMPONENT__ALL_ORIGINAL_RELATIONS;

	/**
	 * The feature id for the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS__SUBCOMPONENT_TYPE = COMPONENT__SUBCOMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Virtual Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_BUS_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Components.Component#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getMultiplicity()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Components.Component#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getMin()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Min();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Components.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Type();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Components.Component#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getImplementation()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Components.Component#getImplementationName <em>Implementation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Name</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getImplementationName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ImplementationName();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Components.Component#isFeaturesLock <em>Features Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Features Lock</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#isFeaturesLock()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_FeaturesLock();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Components.Component#isSubcomponentsLock <em>Subcomponents Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subcomponents Lock</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#isSubcomponentsLock()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_SubcomponentsLock();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Components.Component#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getRefines()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Refines();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Components.Component#isSubcomponentRefinement <em>Subcomponent Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subcomponent Refinement</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#isSubcomponentRefinement()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_SubcomponentRefinement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getBaTransition <em>Ba Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ba Transition</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getBaTransition()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_BaTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getEventDataPortConnection <em>Event Data Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Data Port Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getEventDataPortConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_EventDataPortConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getEventPortConnection <em>Event Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Port Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getEventPortConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_EventPortConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getDataPortConnection <em>Data Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Port Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getDataPortConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_DataPortConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getDataAccessConnection <em>Data Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getDataAccessConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_DataAccessConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getBusAccessConnection <em>Bus Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getBusAccessConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_BusAccessConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getSubprogramAccessConnection <em>Subprogram Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subprogram Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getSubprogramAccessConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SubprogramAccessConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getParameterConnection <em>Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getParameterConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ParameterConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getSubprogramGroupAccessConnection <em>Subprogram Group Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subprogram Group Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getSubprogramGroupAccessConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SubprogramGroupAccessConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getAbstractFeatureConnection <em>Abstract Feature Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Feature Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getAbstractFeatureConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AbstractFeatureConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getFeatureGroupConnection <em>Feature Group Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Group Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getFeatureGroupConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_FeatureGroupConnection();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getAllRefines <em>All Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Refines</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getAllRefines()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AllRefines();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Components.Component#getRefinedSubcomponent <em>Refined Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Subcomponent</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getRefinedSubcomponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RefinedSubcomponent();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getAllRealFeatures <em>All Real Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Real Features</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getAllRealFeatures()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AllRealFeatures();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getAllRealChildrenComponents <em>All Real Children Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Real Children Components</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getAllRealChildrenComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AllRealChildrenComponents();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Components.Component#getOriginalComponent <em>Original Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Component</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getOriginalComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OriginalComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getAllRelations <em>All Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Relations</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getAllRelations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AllRelations();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getAllRealRelations <em>All Real Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Real Relations</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getAllRealRelations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AllRealRelations();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.adele.model.ADELE_Components.Component#getAllOriginalRelations <em>All Original Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Original Relations</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getAllOriginalRelations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AllOriginalRelations();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Components.Component#getSubcomponentType <em>Subcomponent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subcomponent Type</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Component#getSubcomponentType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SubcomponentType();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Subprogram <em>Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Subprogram
	 * @generated
	 */
	EClass getSubprogram();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.ThreadGroup <em>Thread Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Group</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.ThreadGroup
	 * @generated
	 */
	EClass getThreadGroup();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.SubprogramGroup <em>Subprogram Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Group</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.SubprogramGroup
	 * @generated
	 */
	EClass getSubprogramGroup();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.Abstract
	 * @generated
	 */
	EClass getAbstract();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.VirtualProcessor <em>Virtual Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Processor</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.VirtualProcessor
	 * @generated
	 */
	EClass getVirtualProcessor();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Components.VirtualBus <em>Virtual Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Bus</em>'.
	 * @see org.topcased.adele.model.ADELE_Components.VirtualBus
	 * @generated
	 */
	EClass getVirtualBus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ADELE_ComponentsFactory getADELE_ComponentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.ComponentImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MULTIPLICITY = eINSTANCE.getComponent_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MIN = eINSTANCE.getComponent_Min();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTATION = eINSTANCE.getComponent_Implementation();

		/**
		 * The meta object literal for the '<em><b>Implementation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IMPLEMENTATION_NAME = eINSTANCE.getComponent_ImplementationName();

		/**
		 * The meta object literal for the '<em><b>Features Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FEATURES_LOCK = eINSTANCE.getComponent_FeaturesLock();

		/**
		 * The meta object literal for the '<em><b>Subcomponents Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SUBCOMPONENTS_LOCK = eINSTANCE.getComponent_SubcomponentsLock();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REFINES = eINSTANCE.getComponent_Refines();

		/**
		 * The meta object literal for the '<em><b>Subcomponent Refinement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SUBCOMPONENT_REFINEMENT = eINSTANCE.getComponent_SubcomponentRefinement();

		/**
		 * The meta object literal for the '<em><b>Ba Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BA_TRANSITION = eINSTANCE.getComponent_BaTransition();

		/**
		 * The meta object literal for the '<em><b>Event Data Port Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__EVENT_DATA_PORT_CONNECTION = eINSTANCE.getComponent_EventDataPortConnection();

		/**
		 * The meta object literal for the '<em><b>Event Port Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__EVENT_PORT_CONNECTION = eINSTANCE.getComponent_EventPortConnection();

		/**
		 * The meta object literal for the '<em><b>Data Port Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DATA_PORT_CONNECTION = eINSTANCE.getComponent_DataPortConnection();

		/**
		 * The meta object literal for the '<em><b>Data Access Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DATA_ACCESS_CONNECTION = eINSTANCE.getComponent_DataAccessConnection();

		/**
		 * The meta object literal for the '<em><b>Bus Access Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BUS_ACCESS_CONNECTION = eINSTANCE.getComponent_BusAccessConnection();

		/**
		 * The meta object literal for the '<em><b>Subprogram Access Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SUBPROGRAM_ACCESS_CONNECTION = eINSTANCE.getComponent_SubprogramAccessConnection();

		/**
		 * The meta object literal for the '<em><b>Parameter Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARAMETER_CONNECTION = eINSTANCE.getComponent_ParameterConnection();

		/**
		 * The meta object literal for the '<em><b>Subprogram Group Access Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION = eINSTANCE.getComponent_SubprogramGroupAccessConnection();

		/**
		 * The meta object literal for the '<em><b>Abstract Feature Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ABSTRACT_FEATURE_CONNECTION = eINSTANCE.getComponent_AbstractFeatureConnection();

		/**
		 * The meta object literal for the '<em><b>Feature Group Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FEATURE_GROUP_CONNECTION = eINSTANCE.getComponent_FeatureGroupConnection();

		/**
		 * The meta object literal for the '<em><b>All Refines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALL_REFINES = eINSTANCE.getComponent_AllRefines();

		/**
		 * The meta object literal for the '<em><b>Refined Subcomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REFINED_SUBCOMPONENT = eINSTANCE.getComponent_RefinedSubcomponent();

		/**
		 * The meta object literal for the '<em><b>All Real Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALL_REAL_FEATURES = eINSTANCE.getComponent_AllRealFeatures();

		/**
		 * The meta object literal for the '<em><b>All Real Children Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALL_REAL_CHILDREN_COMPONENTS = eINSTANCE.getComponent_AllRealChildrenComponents();

		/**
		 * The meta object literal for the '<em><b>Original Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ORIGINAL_COMPONENT = eINSTANCE.getComponent_OriginalComponent();

		/**
		 * The meta object literal for the '<em><b>All Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALL_RELATIONS = eINSTANCE.getComponent_AllRelations();

		/**
		 * The meta object literal for the '<em><b>All Real Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALL_REAL_RELATIONS = eINSTANCE.getComponent_AllRealRelations();

		/**
		 * The meta object literal for the '<em><b>All Original Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALL_ORIGINAL_RELATIONS = eINSTANCE.getComponent_AllOriginalRelations();

		/**
		 * The meta object literal for the '<em><b>Subcomponent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SUBCOMPONENT_TYPE = eINSTANCE.getComponent_SubcomponentType();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.BusImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.PackageImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.DataImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.DeviceImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.MemoryImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.ProcessImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.ProcessorImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.SubprogramImpl <em>Subprogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.SubprogramImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getSubprogram()
		 * @generated
		 */
		EClass SUBPROGRAM = eINSTANCE.getSubprogram();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.SystemImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.ThreadImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.ThreadGroupImpl <em>Thread Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.ThreadGroupImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getThreadGroup()
		 * @generated
		 */
		EClass THREAD_GROUP = eINSTANCE.getThreadGroup();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.SubprogramGroupImpl <em>Subprogram Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.SubprogramGroupImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getSubprogramGroup()
		 * @generated
		 */
		EClass SUBPROGRAM_GROUP = eINSTANCE.getSubprogramGroup();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.AbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.AbstractImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getAbstract()
		 * @generated
		 */
		EClass ABSTRACT = eINSTANCE.getAbstract();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.VirtualProcessorImpl <em>Virtual Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.VirtualProcessorImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getVirtualProcessor()
		 * @generated
		 */
		EClass VIRTUAL_PROCESSOR = eINSTANCE.getVirtualProcessor();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Components.impl.VirtualBusImpl <em>Virtual Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Components.impl.VirtualBusImpl
		 * @see org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl#getVirtualBus()
		 * @generated
		 */
		EClass VIRTUAL_BUS = eINSTANCE.getVirtualBus();

	}

} //ADELE_ComponentsPackage
