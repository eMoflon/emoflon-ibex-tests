/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_componentsPackage.java,v 1.3 2012-04-30 12:06:53 aschach Exp $
 */
package org.topcased.adele.model.ba_components;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
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
 * @see org.topcased.adele.model.ba_components.Ba_componentsFactory
 * @model kind="package"
 * @generated
 */
public interface Ba_componentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ba_components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ba_components/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ba_components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ba_componentsPackage eINSTANCE = org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ba_components.impl.BAComponentImpl <em>BA Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ba_components.impl.BAComponentImpl
	 * @see org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl#getBAComponent()
	 * @generated
	 */
	int BA_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__NAME = KernelSpicesPackage.SK_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__ID = KernelSpicesPackage.SK_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__LEVEL = KernelSpicesPackage.SK_COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__PROPERTIES = KernelSpicesPackage.SK_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__PARENT = KernelSpicesPackage.SK_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__CHILDREN = KernelSpicesPackage.SK_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__FEATURES = KernelSpicesPackage.SK_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__OD_SYSTEMS = KernelSpicesPackage.SK_COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__AUTHORIZED_SUBCOMPONENTS = KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT__AUTHORIZED_FEATURES = KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The number of structural features of the '<em>BA Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_COMPONENT_FEATURE_COUNT = KernelSpicesPackage.SK_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ba_components.impl.BehaviorAnnexImpl <em>Behavior Annex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ba_components.impl.BehaviorAnnexImpl
	 * @see org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl#getBehaviorAnnex()
	 * @generated
	 */
	int BEHAVIOR_ANNEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__NAME = BA_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__ID = BA_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__LEVEL = BA_COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__PROPERTIES = BA_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__PARENT = BA_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__CHILDREN = BA_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__FEATURES = BA_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__OD_SYSTEMS = BA_COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__AUTHORIZED_SUBCOMPONENTS = BA_COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX__AUTHORIZED_FEATURES = BA_COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The number of structural features of the '<em>Behavior Annex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ANNEX_FEATURE_COUNT = BA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ba_components.impl.BAStateImpl <em>BA State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ba_components.impl.BAStateImpl
	 * @see org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl#getBAState()
	 * @generated
	 */
	int BA_STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__NAME = BA_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__ID = BA_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__LEVEL = BA_COMPONENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__PROPERTIES = BA_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__PARENT = BA_COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__CHILDREN = BA_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__FEATURES = BA_COMPONENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__OD_SYSTEMS = BA_COMPONENT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__AUTHORIZED_SUBCOMPONENTS = BA_COMPONENT__AUTHORIZED_SUBCOMPONENTS;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__AUTHORIZED_FEATURES = BA_COMPONENT__AUTHORIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE__KIND = BA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BA State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_STATE_FEATURE_COUNT = BA_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ba_components.BAStateKind <em>BA State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ba_components.BAStateKind
	 * @see org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl#getBAStateKind()
	 * @generated
	 */
	int BA_STATE_KIND = 3;

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ba_components.BehaviorAnnex <em>Behavior Annex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Annex</em>'.
	 * @see org.topcased.adele.model.ba_components.BehaviorAnnex
	 * @generated
	 */
	EClass getBehaviorAnnex();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ba_components.BAState <em>BA State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BA State</em>'.
	 * @see org.topcased.adele.model.ba_components.BAState
	 * @generated
	 */
	EClass getBAState();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ba_components.BAState#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.topcased.adele.model.ba_components.BAState#getKind()
	 * @see #getBAState()
	 * @generated
	 */
	EAttribute getBAState_Kind();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ba_components.BAComponent <em>BA Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BA Component</em>'.
	 * @see org.topcased.adele.model.ba_components.BAComponent
	 * @generated
	 */
	EClass getBAComponent();

	/**
	 * Returns the meta object for enum '{@link org.topcased.adele.model.ba_components.BAStateKind <em>BA State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BA State Kind</em>'.
	 * @see org.topcased.adele.model.ba_components.BAStateKind
	 * @generated
	 */
	EEnum getBAStateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ba_componentsFactory getBa_componentsFactory();

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
		 * The meta object literal for the '{@link org.topcased.adele.model.ba_components.impl.BehaviorAnnexImpl <em>Behavior Annex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ba_components.impl.BehaviorAnnexImpl
		 * @see org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl#getBehaviorAnnex()
		 * @generated
		 */
		EClass BEHAVIOR_ANNEX = eINSTANCE.getBehaviorAnnex();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ba_components.impl.BAStateImpl <em>BA State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ba_components.impl.BAStateImpl
		 * @see org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl#getBAState()
		 * @generated
		 */
		EClass BA_STATE = eINSTANCE.getBAState();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BA_STATE__KIND = eINSTANCE.getBAState_Kind();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ba_components.impl.BAComponentImpl <em>BA Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ba_components.impl.BAComponentImpl
		 * @see org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl#getBAComponent()
		 * @generated
		 */
		EClass BA_COMPONENT = eINSTANCE.getBAComponent();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ba_components.BAStateKind <em>BA State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ba_components.BAStateKind
		 * @see org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl#getBAStateKind()
		 * @generated
		 */
		EEnum BA_STATE_KIND = eINSTANCE.getBAStateKind();

	}

} //Ba_componentsPackage
