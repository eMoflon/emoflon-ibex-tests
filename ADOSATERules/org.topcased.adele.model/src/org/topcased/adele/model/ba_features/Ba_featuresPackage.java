/**
 */
package org.topcased.adele.model.ba_features;

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
 * @see org.topcased.adele.model.ba_features.Ba_featuresFactory
 * @model kind="package"
 * @generated
 */
public interface Ba_featuresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ba_features";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ba_features/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ba_features";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ba_featuresPackage eINSTANCE = org.topcased.adele.model.ba_features.impl.Ba_featuresPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ba_features.impl.BAFeatureImpl <em>BA Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ba_features.impl.BAFeatureImpl
	 * @see org.topcased.adele.model.ba_features.impl.Ba_featuresPackageImpl#getBAFeature()
	 * @generated
	 */
	int BA_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__NAME = KernelSpicesPackage.SK_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__ID = KernelSpicesPackage.SK_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__LEVEL = KernelSpicesPackage.SK_FEATURE__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__PROPERTIES = KernelSpicesPackage.SK_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__PARENT = KernelSpicesPackage.SK_FEATURE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__CHILDREN = KernelSpicesPackage.SK_FEATURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__VISIBILITY = KernelSpicesPackage.SK_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__COMPONENT = KernelSpicesPackage.SK_FEATURE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE__OD_SYSTEMS = KernelSpicesPackage.SK_FEATURE__OD_SYSTEMS;

	/**
	 * The number of structural features of the '<em>BA Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_FEATURE_FEATURE_COUNT = KernelSpicesPackage.SK_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ba_features.impl.BAVariableImpl <em>BA Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ba_features.impl.BAVariableImpl
	 * @see org.topcased.adele.model.ba_features.impl.Ba_featuresPackageImpl#getBAVariable()
	 * @generated
	 */
	int BA_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__NAME = BA_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__ID = BA_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__LEVEL = BA_FEATURE__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__PROPERTIES = BA_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__PARENT = BA_FEATURE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__CHILDREN = BA_FEATURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__VISIBILITY = BA_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__COMPONENT = BA_FEATURE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__OD_SYSTEMS = BA_FEATURE__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE__TYPE = BA_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BA Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BA_VARIABLE_FEATURE_COUNT = BA_FEATURE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ba_features.BAFeature <em>BA Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BA Feature</em>'.
	 * @see org.topcased.adele.model.ba_features.BAFeature
	 * @generated
	 */
	EClass getBAFeature();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ba_features.BAVariable <em>BA Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BA Variable</em>'.
	 * @see org.topcased.adele.model.ba_features.BAVariable
	 * @generated
	 */
	EClass getBAVariable();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ba_features.BAVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.topcased.adele.model.ba_features.BAVariable#getType()
	 * @see #getBAVariable()
	 * @generated
	 */
	EReference getBAVariable_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ba_featuresFactory getBa_featuresFactory();

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
		 * The meta object literal for the '{@link org.topcased.adele.model.ba_features.impl.BAFeatureImpl <em>BA Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ba_features.impl.BAFeatureImpl
		 * @see org.topcased.adele.model.ba_features.impl.Ba_featuresPackageImpl#getBAFeature()
		 * @generated
		 */
		EClass BA_FEATURE = eINSTANCE.getBAFeature();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ba_features.impl.BAVariableImpl <em>BA Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ba_features.impl.BAVariableImpl
		 * @see org.topcased.adele.model.ba_features.impl.Ba_featuresPackageImpl#getBAVariable()
		 * @generated
		 */
		EClass BA_VARIABLE = eINSTANCE.getBAVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BA_VARIABLE__TYPE = eINSTANCE.getBAVariable_Type();

	}

} //Ba_featuresPackage
