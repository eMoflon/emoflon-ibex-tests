/**
 */
package FeatureModelSafe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FeatureModelSafe.FeatureModelSafeFactory
 * @model kind="package"
 * @generated
 */
public interface FeatureModelSafePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FeatureModelSafe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/FeatureModelSafe/model/FeatureModelSafe.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FeatureModelSafe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureModelSafePackage eINSTANCE = FeatureModelSafe.impl.FeatureModelSafePackageImpl.init();

	/**
	 * The meta object id for the '{@link FeatureModelSafe.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureModelSafe.impl.NamedElementImpl
	 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FeatureModelSafe.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureModelSafe.impl.ModelImpl
	 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FeatureModelSafe.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureModelSafe.impl.FeatureImpl
	 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Solitary Sub Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SOLITARY_SUB_FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FeatureModelSafe.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureModelSafe.impl.GroupImpl
	 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FeatureModelSafe.impl.OrGroupImpl <em>Or Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureModelSafe.impl.OrGroupImpl
	 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getOrGroup()
	 * @generated
	 */
	int OR_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP__MEMBERS = GROUP__MEMBERS;

	/**
	 * The number of structural features of the '<em>Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link FeatureModelSafe.impl.XorGroupImpl <em>Xor Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FeatureModelSafe.impl.XorGroupImpl
	 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getXorGroup()
	 * @generated
	 */
	int XOR_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GROUP__MEMBERS = GROUP__MEMBERS;

	/**
	 * The number of structural features of the '<em>Xor Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_GROUP_OPERATION_COUNT = GROUP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link FeatureModelSafe.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see FeatureModelSafe.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link FeatureModelSafe.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FeatureModelSafe.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link FeatureModelSafe.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see FeatureModelSafe.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link FeatureModelSafe.Model#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see FeatureModelSafe.Model#getRoot()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Root();

	/**
	 * Returns the meta object for class '{@link FeatureModelSafe.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see FeatureModelSafe.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureModelSafe.Feature#getSolitarySubFeatures <em>Solitary Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solitary Sub Features</em>'.
	 * @see FeatureModelSafe.Feature#getSolitarySubFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SolitarySubFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureModelSafe.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see FeatureModelSafe.Feature#getGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Groups();

	/**
	 * Returns the meta object for class '{@link FeatureModelSafe.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see FeatureModelSafe.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link FeatureModelSafe.Group#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see FeatureModelSafe.Group#getMembers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Members();

	/**
	 * Returns the meta object for class '{@link FeatureModelSafe.OrGroup <em>Or Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Group</em>'.
	 * @see FeatureModelSafe.OrGroup
	 * @generated
	 */
	EClass getOrGroup();

	/**
	 * Returns the meta object for class '{@link FeatureModelSafe.XorGroup <em>Xor Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Group</em>'.
	 * @see FeatureModelSafe.XorGroup
	 * @generated
	 */
	EClass getXorGroup();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureModelSafeFactory getFeatureModelSafeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FeatureModelSafe.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureModelSafe.impl.NamedElementImpl
		 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link FeatureModelSafe.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureModelSafe.impl.ModelImpl
		 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOT = eINSTANCE.getModel_Root();

		/**
		 * The meta object literal for the '{@link FeatureModelSafe.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureModelSafe.impl.FeatureImpl
		 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Solitary Sub Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SOLITARY_SUB_FEATURES = eINSTANCE.getFeature_SolitarySubFeatures();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUPS = eINSTANCE.getFeature_Groups();

		/**
		 * The meta object literal for the '{@link FeatureModelSafe.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureModelSafe.impl.GroupImpl
		 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MEMBERS = eINSTANCE.getGroup_Members();

		/**
		 * The meta object literal for the '{@link FeatureModelSafe.impl.OrGroupImpl <em>Or Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureModelSafe.impl.OrGroupImpl
		 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getOrGroup()
		 * @generated
		 */
		EClass OR_GROUP = eINSTANCE.getOrGroup();

		/**
		 * The meta object literal for the '{@link FeatureModelSafe.impl.XorGroupImpl <em>Xor Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FeatureModelSafe.impl.XorGroupImpl
		 * @see FeatureModelSafe.impl.FeatureModelSafePackageImpl#getXorGroup()
		 * @generated
		 */
		EClass XOR_GROUP = eINSTANCE.getXorGroup();

	}

} //FeatureModelSafePackage
