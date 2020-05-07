/**
 */
package Triangles;

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
 * @see Triangles.TrianglesFactory
 * @model kind="package"
 * @generated
 */
public interface TrianglesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Triangles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Triangles/model/Triangles.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Triangles";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrianglesPackage eINSTANCE = Triangles.impl.TrianglesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Triangles.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Triangles.impl.ContainerImpl
	 * @see Triangles.impl.TrianglesPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__B = 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__C = 2;

	/**
	 * The feature id for the '<em><b>D</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__D = 3;

	/**
	 * The feature id for the '<em><b>E</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__E = 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Triangles.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Triangles.impl.AbstractClassImpl
	 * @see Triangles.impl.TrianglesPackageImpl#getAbstractClass()
	 * @generated
	 */
	int ABSTRACT_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__FLAG = 2;

	/**
	 * The number of structural features of the '<em>Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Triangles.impl.A_ClassImpl <em>AClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Triangles.impl.A_ClassImpl
	 * @see Triangles.impl.TrianglesPackageImpl#getA_Class()
	 * @generated
	 */
	int ACLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS__ID = ABSTRACT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS__NAME = ABSTRACT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS__FLAG = ABSTRACT_CLASS__FLAG;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS__B = ABSTRACT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS__C = ABSTRACT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_OPERATION_COUNT = ABSTRACT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Triangles.impl.B_ClassImpl <em>BClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Triangles.impl.B_ClassImpl
	 * @see Triangles.impl.TrianglesPackageImpl#getB_Class()
	 * @generated
	 */
	int BCLASS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__ID = ABSTRACT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__NAME = ABSTRACT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__FLAG = ABSTRACT_CLASS__FLAG;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__A = ABSTRACT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__C = ABSTRACT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS_OPERATION_COUNT = ABSTRACT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Triangles.impl.C_ClassImpl <em>CClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Triangles.impl.C_ClassImpl
	 * @see Triangles.impl.TrianglesPackageImpl#getC_Class()
	 * @generated
	 */
	int CCLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__ID = ABSTRACT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__NAME = ABSTRACT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__FLAG = ABSTRACT_CLASS__FLAG;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__A = ABSTRACT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__B = ABSTRACT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS_OPERATION_COUNT = ABSTRACT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Triangles.impl.E_ClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Triangles.impl.E_ClassImpl
	 * @see Triangles.impl.TrianglesPackageImpl#getE_Class()
	 * @generated
	 */
	int ECLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ID = ABSTRACT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = ABSTRACT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__FLAG = ABSTRACT_CLASS__FLAG;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__B = ABSTRACT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = ABSTRACT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Triangles.impl.D_ClassImpl <em>DClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Triangles.impl.D_ClassImpl
	 * @see Triangles.impl.TrianglesPackageImpl#getD_Class()
	 * @generated
	 */
	int DCLASS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__ID = ABSTRACT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__NAME = ABSTRACT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__FLAG = ABSTRACT_CLASS__FLAG;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS__A = ABSTRACT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCLASS_OPERATION_COUNT = ABSTRACT_CLASS_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link Triangles.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see Triangles.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link Triangles.Container#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see Triangles.Container#getA()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_A();

	/**
	 * Returns the meta object for the containment reference list '{@link Triangles.Container#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see Triangles.Container#getB()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_B();

	/**
	 * Returns the meta object for the containment reference list '{@link Triangles.Container#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>C</em>'.
	 * @see Triangles.Container#getC()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_C();

	/**
	 * Returns the meta object for the containment reference list '{@link Triangles.Container#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>D</em>'.
	 * @see Triangles.Container#getD()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_D();

	/**
	 * Returns the meta object for the containment reference list '{@link Triangles.Container#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>E</em>'.
	 * @see Triangles.Container#getE()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_E();

	/**
	 * Returns the meta object for class '{@link Triangles.A_Class <em>AClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AClass</em>'.
	 * @see Triangles.A_Class
	 * @generated
	 */
	EClass getA_Class();

	/**
	 * Returns the meta object for the reference list '{@link Triangles.A_Class#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>B</em>'.
	 * @see Triangles.A_Class#getB()
	 * @see #getA_Class()
	 * @generated
	 */
	EReference getA_Class_B();

	/**
	 * Returns the meta object for the reference list '{@link Triangles.A_Class#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>C</em>'.
	 * @see Triangles.A_Class#getC()
	 * @see #getA_Class()
	 * @generated
	 */
	EReference getA_Class_C();

	/**
	 * Returns the meta object for class '{@link Triangles.B_Class <em>BClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BClass</em>'.
	 * @see Triangles.B_Class
	 * @generated
	 */
	EClass getB_Class();

	/**
	 * Returns the meta object for the reference list '{@link Triangles.B_Class#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>A</em>'.
	 * @see Triangles.B_Class#getA()
	 * @see #getB_Class()
	 * @generated
	 */
	EReference getB_Class_A();

	/**
	 * Returns the meta object for the reference list '{@link Triangles.B_Class#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>C</em>'.
	 * @see Triangles.B_Class#getC()
	 * @see #getB_Class()
	 * @generated
	 */
	EReference getB_Class_C();

	/**
	 * Returns the meta object for class '{@link Triangles.C_Class <em>CClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CClass</em>'.
	 * @see Triangles.C_Class
	 * @generated
	 */
	EClass getC_Class();

	/**
	 * Returns the meta object for the reference list '{@link Triangles.C_Class#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>A</em>'.
	 * @see Triangles.C_Class#getA()
	 * @see #getC_Class()
	 * @generated
	 */
	EReference getC_Class_A();

	/**
	 * Returns the meta object for the reference list '{@link Triangles.C_Class#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>B</em>'.
	 * @see Triangles.C_Class#getB()
	 * @see #getC_Class()
	 * @generated
	 */
	EReference getC_Class_B();

	/**
	 * Returns the meta object for class '{@link Triangles.E_Class <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see Triangles.E_Class
	 * @generated
	 */
	EClass getE_Class();

	/**
	 * Returns the meta object for the reference list '{@link Triangles.E_Class#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>B</em>'.
	 * @see Triangles.E_Class#getB()
	 * @see #getE_Class()
	 * @generated
	 */
	EReference getE_Class_B();

	/**
	 * Returns the meta object for class '{@link Triangles.D_Class <em>DClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DClass</em>'.
	 * @see Triangles.D_Class
	 * @generated
	 */
	EClass getD_Class();

	/**
	 * Returns the meta object for the reference list '{@link Triangles.D_Class#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>A</em>'.
	 * @see Triangles.D_Class#getA()
	 * @see #getD_Class()
	 * @generated
	 */
	EReference getD_Class_A();

	/**
	 * Returns the meta object for class '{@link Triangles.AbstractClass <em>Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Class</em>'.
	 * @see Triangles.AbstractClass
	 * @generated
	 */
	EClass getAbstractClass();

	/**
	 * Returns the meta object for the attribute '{@link Triangles.AbstractClass#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Triangles.AbstractClass#getId()
	 * @see #getAbstractClass()
	 * @generated
	 */
	EAttribute getAbstractClass_Id();

	/**
	 * Returns the meta object for the attribute '{@link Triangles.AbstractClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Triangles.AbstractClass#getName()
	 * @see #getAbstractClass()
	 * @generated
	 */
	EAttribute getAbstractClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link Triangles.AbstractClass#isFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag</em>'.
	 * @see Triangles.AbstractClass#isFlag()
	 * @see #getAbstractClass()
	 * @generated
	 */
	EAttribute getAbstractClass_Flag();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrianglesFactory getTrianglesFactory();

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
		 * The meta object literal for the '{@link Triangles.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Triangles.impl.ContainerImpl
		 * @see Triangles.impl.TrianglesPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__A = eINSTANCE.getContainer_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__B = eINSTANCE.getContainer_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__C = eINSTANCE.getContainer_C();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__D = eINSTANCE.getContainer_D();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__E = eINSTANCE.getContainer_E();

		/**
		 * The meta object literal for the '{@link Triangles.impl.A_ClassImpl <em>AClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Triangles.impl.A_ClassImpl
		 * @see Triangles.impl.TrianglesPackageImpl#getA_Class()
		 * @generated
		 */
		EClass ACLASS = eINSTANCE.getA_Class();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACLASS__B = eINSTANCE.getA_Class_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACLASS__C = eINSTANCE.getA_Class_C();

		/**
		 * The meta object literal for the '{@link Triangles.impl.B_ClassImpl <em>BClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Triangles.impl.B_ClassImpl
		 * @see Triangles.impl.TrianglesPackageImpl#getB_Class()
		 * @generated
		 */
		EClass BCLASS = eINSTANCE.getB_Class();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCLASS__A = eINSTANCE.getB_Class_A();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCLASS__C = eINSTANCE.getB_Class_C();

		/**
		 * The meta object literal for the '{@link Triangles.impl.C_ClassImpl <em>CClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Triangles.impl.C_ClassImpl
		 * @see Triangles.impl.TrianglesPackageImpl#getC_Class()
		 * @generated
		 */
		EClass CCLASS = eINSTANCE.getC_Class();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLASS__A = eINSTANCE.getC_Class_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLASS__B = eINSTANCE.getC_Class_B();

		/**
		 * The meta object literal for the '{@link Triangles.impl.E_ClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Triangles.impl.E_ClassImpl
		 * @see Triangles.impl.TrianglesPackageImpl#getE_Class()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getE_Class();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__B = eINSTANCE.getE_Class_B();

		/**
		 * The meta object literal for the '{@link Triangles.impl.D_ClassImpl <em>DClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Triangles.impl.D_ClassImpl
		 * @see Triangles.impl.TrianglesPackageImpl#getD_Class()
		 * @generated
		 */
		EClass DCLASS = eINSTANCE.getD_Class();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCLASS__A = eINSTANCE.getD_Class_A();

		/**
		 * The meta object literal for the '{@link Triangles.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Triangles.impl.AbstractClassImpl
		 * @see Triangles.impl.TrianglesPackageImpl#getAbstractClass()
		 * @generated
		 */
		EClass ABSTRACT_CLASS = eINSTANCE.getAbstractClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLASS__ID = eINSTANCE.getAbstractClass_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLASS__NAME = eINSTANCE.getAbstractClass_Name();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLASS__FLAG = eINSTANCE.getAbstractClass_Flag();

	}

} //TrianglesPackage
