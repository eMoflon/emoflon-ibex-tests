/**
 */
package org.topcased.adele.model.ba_relations;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.topcased.adele.model.ba_relations.Ba_relationsFactory
 * @model kind="package"
 * @generated
 */
public interface Ba_relationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ba_relations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ba_relations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ba_relations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ba_relationsPackage eINSTANCE = org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ba_relations.impl.BARelationImpl <em>BA Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ba_relations.impl.BARelationImpl
	 * @see org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl#getBARelation()
	 * @generated
	 */
	int BA_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION__NAME = KernelSpicesPackage.SK_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION__ID = KernelSpicesPackage.SK_RELATION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION__LEVEL = KernelSpicesPackage.SK_RELATION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION__PROPERTIES = KernelSpicesPackage.SK_RELATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION__PARENT = KernelSpicesPackage.SK_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION__CHILDREN = KernelSpicesPackage.SK_RELATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION__OBJECTS = KernelSpicesPackage.SK_RELATION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION__OD_SYSTEMS = KernelSpicesPackage.SK_RELATION__OD_SYSTEMS;

	/**
	 * The number of structural features of the '<em>BA Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_RELATION_FEATURE_COUNT = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ba_relations.impl.BATransitionImpl <em>BA Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ba_relations.impl.BATransitionImpl
	 * @see org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl#getBATransition()
	 * @generated
	 */
	int BA_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION__NAME = BA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION__ID = BA_RELATION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION__LEVEL = BA_RELATION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION__PROPERTIES = BA_RELATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION__PARENT = BA_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION__CHILDREN = BA_RELATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION__OBJECTS = BA_RELATION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION__OD_SYSTEMS = BA_RELATION__OD_SYSTEMS;

	/**
	 * The number of structural features of the '<em>BA Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_TRANSITION_FEATURE_COUNT = BA_RELATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ba_relations.BARelation <em>BA Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BA Relation</em>'.
	 * @see org.topcased.adele.model.ba_relations.BARelation
	 * @generated
	 */
	EClass getBARelation();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ba_relations.BATransition <em>BA Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BA Transition</em>'.
	 * @see org.topcased.adele.model.ba_relations.BATransition
	 * @generated
	 */
	EClass getBATransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ba_relationsFactory getBa_relationsFactory();

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
		 * The meta object literal for the '{@link org.topcased.adele.model.ba_relations.impl.BARelationImpl <em>BA Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ba_relations.impl.BARelationImpl
		 * @see org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl#getBARelation()
		 * @generated
		 */
		EClass BA_RELATION = eINSTANCE.getBARelation();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ba_relations.impl.BATransitionImpl <em>BA Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ba_relations.impl.BATransitionImpl
		 * @see org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl#getBATransition()
		 * @generated
		 */
		EClass BA_TRANSITION = eINSTANCE.getBATransition();

	}

} //Ba_relationsPackage
