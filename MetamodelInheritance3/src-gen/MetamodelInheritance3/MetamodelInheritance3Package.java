/**
 */
package MetamodelInheritance3;

import MetamodelInheritance.MetamodelInheritancePackage;

import MetamodelInheritance2.MetamodelInheritance2Package;

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
 * @see MetamodelInheritance3.MetamodelInheritance3Factory
 * @model kind="package"
 * @generated
 */
public interface MetamodelInheritance3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MetamodelInheritance3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/MetamodelInheritance3/model/MetamodelInheritance3.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel_inheritance3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelInheritance3Package eINSTANCE = MetamodelInheritance3.impl.MetamodelInheritance3PackageImpl.init();

	/**
	 * The meta object id for the '{@link MetamodelInheritance3.impl.ChildCImpl <em>Child C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance3.impl.ChildCImpl
	 * @see MetamodelInheritance3.impl.MetamodelInheritance3PackageImpl#getChildC()
	 * @generated
	 */
	int CHILD_C = 0;

	/**
	 * The feature id for the '<em><b>D</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_C__D = MetamodelInheritancePackage.BASE_CONTAINEE_C_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_C_FEATURE_COUNT = MetamodelInheritancePackage.BASE_CONTAINEE_C_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Child C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_C_OPERATION_COUNT = MetamodelInheritancePackage.BASE_CONTAINEE_C_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetamodelInheritance3.impl.ChildDImpl <em>Child D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetamodelInheritance3.impl.ChildDImpl
	 * @see MetamodelInheritance3.impl.MetamodelInheritance3PackageImpl#getChildD()
	 * @generated
	 */
	int CHILD_D = 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_D__C = MetamodelInheritance2Package.CHILD_CONTAINEE_D_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_D__A = MetamodelInheritance2Package.CHILD_CONTAINEE_D_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Child D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_D_FEATURE_COUNT = MetamodelInheritance2Package.CHILD_CONTAINEE_D_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Child D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_D_OPERATION_COUNT = MetamodelInheritance2Package.CHILD_CONTAINEE_D_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance3.ChildC <em>Child C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child C</em>'.
	 * @see MetamodelInheritance3.ChildC
	 * @generated
	 */
	EClass getChildC();

	/**
	 * Returns the meta object for the reference list '{@link MetamodelInheritance3.ChildC#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>D</em>'.
	 * @see MetamodelInheritance3.ChildC#getD()
	 * @see #getChildC()
	 * @generated
	 */
	EReference getChildC_D();

	/**
	 * Returns the meta object for class '{@link MetamodelInheritance3.ChildD <em>Child D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child D</em>'.
	 * @see MetamodelInheritance3.ChildD
	 * @generated
	 */
	EClass getChildD();

	/**
	 * Returns the meta object for the reference list '{@link MetamodelInheritance3.ChildD#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>C</em>'.
	 * @see MetamodelInheritance3.ChildD#getC()
	 * @see #getChildD()
	 * @generated
	 */
	EReference getChildD_C();

	/**
	 * Returns the meta object for the reference list '{@link MetamodelInheritance3.ChildD#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>A</em>'.
	 * @see MetamodelInheritance3.ChildD#getA()
	 * @see #getChildD()
	 * @generated
	 */
	EReference getChildD_A();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelInheritance3Factory getMetamodelInheritance3Factory();

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
		 * The meta object literal for the '{@link MetamodelInheritance3.impl.ChildCImpl <em>Child C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance3.impl.ChildCImpl
		 * @see MetamodelInheritance3.impl.MetamodelInheritance3PackageImpl#getChildC()
		 * @generated
		 */
		EClass CHILD_C = eINSTANCE.getChildC();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_C__D = eINSTANCE.getChildC_D();

		/**
		 * The meta object literal for the '{@link MetamodelInheritance3.impl.ChildDImpl <em>Child D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetamodelInheritance3.impl.ChildDImpl
		 * @see MetamodelInheritance3.impl.MetamodelInheritance3PackageImpl#getChildD()
		 * @generated
		 */
		EClass CHILD_D = eINSTANCE.getChildD();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_D__C = eINSTANCE.getChildD_C();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_D__A = eINSTANCE.getChildD_A();

	}

} //MetamodelInheritance3Package
