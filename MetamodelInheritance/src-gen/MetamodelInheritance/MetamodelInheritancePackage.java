/**
 */
package MetamodelInheritance;

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
 * @see MetamodelInheritance.MetamodelInheritanceFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelInheritancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MetamodelInheritance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/MetamodelInheritance/model/MetamodelInheritance.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel_inheritance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelInheritancePackage eINSTANCE = MetamodelInheritance.impl.MetamodelInheritancePackageImpl.init();

	/**
	 * The meta object id for the '{@link MetamodelInheritance.impl.BaseContainerImpl <em>Base Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance.impl.BaseContainerImpl
	 * @see MetamodelInheritance.impl.MetamodelInheritancePackageImpl#getBaseContainer()
	 * @generated
	 */
	int BASE_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Base A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER__BASE_A = 0;

	/**
	 * The feature id for the '<em><b>Base B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER__BASE_B = 1;

	/**
	 * The feature id for the '<em><b>Base C</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER__BASE_C = 2;

	/**
	 * The number of structural features of the '<em>Base Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelInheritance.impl.BaseContaineeAImpl <em>Base Containee A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance.impl.BaseContaineeAImpl
	 * @see MetamodelInheritance.impl.MetamodelInheritancePackageImpl#getBaseContaineeA()
	 * @generated
	 */
	int BASE_CONTAINEE_A = 1;

	/**
	 * The number of structural features of the '<em>Base Containee A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINEE_A_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Containee A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINEE_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelInheritance.impl.BaseContaineeBImpl <em>Base Containee B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance.impl.BaseContaineeBImpl
	 * @see MetamodelInheritance.impl.MetamodelInheritancePackageImpl#getBaseContaineeB()
	 * @generated
	 */
	int BASE_CONTAINEE_B = 2;

	/**
	 * The number of structural features of the '<em>Base Containee B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINEE_B_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Containee B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINEE_B_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetamodelInheritance.impl.BaseContaineeCImpl <em>Base Containee C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance.impl.BaseContaineeCImpl
	 * @see MetamodelInheritance.impl.MetamodelInheritancePackageImpl#getBaseContaineeC()
	 * @generated
	 */
	int BASE_CONTAINEE_C = 3;

	/**
	 * The number of structural features of the '<em>Base Containee C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINEE_C_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base Containee C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CONTAINEE_C_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance.BaseContainer <em>Base Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Container</em>'.
	 * @see MetamodelInheritance.BaseContainer
	 * @generated
	 */
	EClass getBaseContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelInheritance.BaseContainer#getBaseA <em>Base A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base A</em>'.
	 * @see MetamodelInheritance.BaseContainer#getBaseA()
	 * @see #getBaseContainer()
	 * @generated
	 */
	EReference getBaseContainer_BaseA();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelInheritance.BaseContainer#getBaseB <em>Base B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base B</em>'.
	 * @see MetamodelInheritance.BaseContainer#getBaseB()
	 * @see #getBaseContainer()
	 * @generated
	 */
	EReference getBaseContainer_BaseB();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelInheritance.BaseContainer#getBaseC <em>Base C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base C</em>'.
	 * @see MetamodelInheritance.BaseContainer#getBaseC()
	 * @see #getBaseContainer()
	 * @generated
	 */
	EReference getBaseContainer_BaseC();

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance.BaseContaineeA <em>Base Containee A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Containee A</em>'.
	 * @see MetamodelInheritance.BaseContaineeA
	 * @generated
	 */
	EClass getBaseContaineeA();

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance.BaseContaineeB <em>Base Containee B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Containee B</em>'.
	 * @see MetamodelInheritance.BaseContaineeB
	 * @generated
	 */
	EClass getBaseContaineeB();

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance.BaseContaineeC <em>Base Containee C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Containee C</em>'.
	 * @see MetamodelInheritance.BaseContaineeC
	 * @generated
	 */
	EClass getBaseContaineeC();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelInheritanceFactory getMetamodelInheritanceFactory();

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
		 * The meta object literal for the '{@link MetamodelInheritance.impl.BaseContainerImpl <em>Base Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance.impl.BaseContainerImpl
		 * @see MetamodelInheritance.impl.MetamodelInheritancePackageImpl#getBaseContainer()
		 * @generated
		 */
		EClass BASE_CONTAINER = eINSTANCE.getBaseContainer();

		/**
		 * The meta object literal for the '<em><b>Base A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_CONTAINER__BASE_A = eINSTANCE.getBaseContainer_BaseA();

		/**
		 * The meta object literal for the '<em><b>Base B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_CONTAINER__BASE_B = eINSTANCE.getBaseContainer_BaseB();

		/**
		 * The meta object literal for the '<em><b>Base C</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_CONTAINER__BASE_C = eINSTANCE.getBaseContainer_BaseC();

		/**
		 * The meta object literal for the '{@link MetamodelInheritance.impl.BaseContaineeAImpl <em>Base Containee A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance.impl.BaseContaineeAImpl
		 * @see MetamodelInheritance.impl.MetamodelInheritancePackageImpl#getBaseContaineeA()
		 * @generated
		 */
		EClass BASE_CONTAINEE_A = eINSTANCE.getBaseContaineeA();

		/**
		 * The meta object literal for the '{@link MetamodelInheritance.impl.BaseContaineeBImpl <em>Base Containee B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance.impl.BaseContaineeBImpl
		 * @see MetamodelInheritance.impl.MetamodelInheritancePackageImpl#getBaseContaineeB()
		 * @generated
		 */
		EClass BASE_CONTAINEE_B = eINSTANCE.getBaseContaineeB();

		/**
		 * The meta object literal for the '{@link MetamodelInheritance.impl.BaseContaineeCImpl <em>Base Containee C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance.impl.BaseContaineeCImpl
		 * @see MetamodelInheritance.impl.MetamodelInheritancePackageImpl#getBaseContaineeC()
		 * @generated
		 */
		EClass BASE_CONTAINEE_C = eINSTANCE.getBaseContaineeC();

	}

} //MetamodelInheritancePackage
