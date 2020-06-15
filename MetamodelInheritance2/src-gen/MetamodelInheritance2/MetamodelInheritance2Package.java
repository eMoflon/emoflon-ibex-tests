/**
 */
package MetamodelInheritance2;

import MetamodelInheritance.MetamodelInheritancePackage;

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
 * @see MetamodelInheritance2.MetamodelInheritance2Factory
 * @model kind="package"
 * @generated
 */
public interface MetamodelInheritance2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MetamodelInheritance2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/MetamodelInheritance2/model/MetamodelInheritance2.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel_inheritance2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelInheritance2Package eINSTANCE = MetamodelInheritance2.impl.MetamodelInheritance2PackageImpl.init();

	/**
	 * The meta object id for the '{@link MetamodelInheritance2.impl.ChildAImpl <em>Child A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance2.impl.ChildAImpl
	 * @see MetamodelInheritance2.impl.MetamodelInheritance2PackageImpl#getChildA()
	 * @generated
	 */
	int CHILD_A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_A__B = MetamodelInheritancePackage.BASE_CONTAINEE_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child D</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_A__CHILD_D = MetamodelInheritancePackage.BASE_CONTAINEE_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_A__C = MetamodelInheritancePackage.BASE_CONTAINEE_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Child A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_A_FEATURE_COUNT = MetamodelInheritancePackage.BASE_CONTAINEE_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Child A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_A_OPERATION_COUNT = MetamodelInheritancePackage.BASE_CONTAINEE_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelInheritance2.impl.ChildBImpl <em>Child B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance2.impl.ChildBImpl
	 * @see MetamodelInheritance2.impl.MetamodelInheritance2PackageImpl#getChildB()
	 * @generated
	 */
	int CHILD_B = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_B__A = MetamodelInheritancePackage.BASE_CONTAINEE_B_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>D</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_B__D = MetamodelInheritancePackage.BASE_CONTAINEE_B_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Child B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_B_FEATURE_COUNT = MetamodelInheritancePackage.BASE_CONTAINEE_B_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Child B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_B_OPERATION_COUNT = MetamodelInheritancePackage.BASE_CONTAINEE_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelInheritance2.impl.ChildContaineeDImpl <em>Child Containee D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance2.impl.ChildContaineeDImpl
	 * @see MetamodelInheritance2.impl.MetamodelInheritance2PackageImpl#getChildContaineeD()
	 * @generated
	 */
	int CHILD_CONTAINEE_D = 2;

	/**
	 * The number of structural features of the '<em>Child Containee D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTAINEE_D_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Child Containee D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTAINEE_D_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance2.ChildA <em>Child A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child A</em>'.
	 * @see MetamodelInheritance2.ChildA
	 * @generated
	 */
	EClass getChildA();

	/**
	 * Returns the meta object for the reference list '{@link MetamodelInheritance2.ChildA#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>B</em>'.
	 * @see MetamodelInheritance2.ChildA#getB()
	 * @see #getChildA()
	 * @generated
	 */
	EReference getChildA_B();

	/**
	 * Returns the meta object for the containment reference list '{@link MetamodelInheritance2.ChildA#getChildD <em>Child D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child D</em>'.
	 * @see MetamodelInheritance2.ChildA#getChildD()
	 * @see #getChildA()
	 * @generated
	 */
	EReference getChildA_ChildD();

	/**
	 * Returns the meta object for the reference list '{@link MetamodelInheritance2.ChildA#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>C</em>'.
	 * @see MetamodelInheritance2.ChildA#getC()
	 * @see #getChildA()
	 * @generated
	 */
	EReference getChildA_C();

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance2.ChildB <em>Child B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child B</em>'.
	 * @see MetamodelInheritance2.ChildB
	 * @generated
	 */
	EClass getChildB();

	/**
	 * Returns the meta object for the reference list '{@link MetamodelInheritance2.ChildB#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>A</em>'.
	 * @see MetamodelInheritance2.ChildB#getA()
	 * @see #getChildB()
	 * @generated
	 */
	EReference getChildB_A();

	/**
	 * Returns the meta object for the reference list '{@link MetamodelInheritance2.ChildB#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>D</em>'.
	 * @see MetamodelInheritance2.ChildB#getD()
	 * @see #getChildB()
	 * @generated
	 */
	EReference getChildB_D();

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance2.ChildContaineeD <em>Child Containee D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Containee D</em>'.
	 * @see MetamodelInheritance2.ChildContaineeD
	 * @generated
	 */
	EClass getChildContaineeD();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelInheritance2Factory getMetamodelInheritance2Factory();

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
		 * The meta object literal for the '{@link MetamodelInheritance2.impl.ChildAImpl <em>Child A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance2.impl.ChildAImpl
		 * @see MetamodelInheritance2.impl.MetamodelInheritance2PackageImpl#getChildA()
		 * @generated
		 */
		EClass CHILD_A = eINSTANCE.getChildA();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_A__B = eINSTANCE.getChildA_B();

		/**
		 * The meta object literal for the '<em><b>Child D</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_A__CHILD_D = eINSTANCE.getChildA_ChildD();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_A__C = eINSTANCE.getChildA_C();

		/**
		 * The meta object literal for the '{@link MetamodelInheritance2.impl.ChildBImpl <em>Child B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance2.impl.ChildBImpl
		 * @see MetamodelInheritance2.impl.MetamodelInheritance2PackageImpl#getChildB()
		 * @generated
		 */
		EClass CHILD_B = eINSTANCE.getChildB();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_B__A = eINSTANCE.getChildB_A();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_B__D = eINSTANCE.getChildB_D();

		/**
		 * The meta object literal for the '{@link MetamodelInheritance2.impl.ChildContaineeDImpl <em>Child Containee D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance2.impl.ChildContaineeDImpl
		 * @see MetamodelInheritance2.impl.MetamodelInheritance2PackageImpl#getChildContaineeD()
		 * @generated
		 */
		EClass CHILD_CONTAINEE_D = eINSTANCE.getChildContaineeD();

	}

} //MetamodelInheritance2Package
