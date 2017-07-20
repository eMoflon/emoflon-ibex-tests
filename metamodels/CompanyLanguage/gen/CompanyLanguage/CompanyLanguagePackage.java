/**
 */
package CompanyLanguage;

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
 * @see CompanyLanguage.CompanyLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface CompanyLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CompanyLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/CompanyLanguage/model/CompanyLanguage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CompanyLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompanyLanguagePackage eINSTANCE = CompanyLanguage.impl.CompanyLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link CompanyLanguage.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompanyLanguage.impl.AdminImpl
	 * @see CompanyLanguage.impl.CompanyLanguagePackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 0;

	/**
	 * The feature id for the '<em><b>Ceo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__CEO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompanyLanguage.impl.CEOImpl <em>CEO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompanyLanguage.impl.CEOImpl
	 * @see CompanyLanguage.impl.CompanyLanguagePackageImpl#getCEO()
	 * @generated
	 */
	int CEO = 1;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEO__EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEO__NAME = 1;

	/**
	 * The number of structural features of the '<em>CEO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CEO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompanyLanguage.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompanyLanguage.impl.CompanyImpl
	 * @see CompanyLanguage.impl.CompanyLanguagePackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 2;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Ceo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__CEO = 1;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__ADMIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CompanyLanguage.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CompanyLanguage.impl.EmployeeImpl
	 * @see CompanyLanguage.impl.CompanyLanguagePackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link CompanyLanguage.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see CompanyLanguage.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the reference '{@link CompanyLanguage.Admin#getCeo <em>Ceo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ceo</em>'.
	 * @see CompanyLanguage.Admin#getCeo()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Ceo();

	/**
	 * Returns the meta object for the attribute '{@link CompanyLanguage.Admin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CompanyLanguage.Admin#getName()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_Name();

	/**
	 * Returns the meta object for class '{@link CompanyLanguage.CEO <em>CEO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEO</em>'.
	 * @see CompanyLanguage.CEO
	 * @generated
	 */
	EClass getCEO();

	/**
	 * Returns the meta object for the reference list '{@link CompanyLanguage.CEO#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employee</em>'.
	 * @see CompanyLanguage.CEO#getEmployee()
	 * @see #getCEO()
	 * @generated
	 */
	EReference getCEO_Employee();

	/**
	 * Returns the meta object for the attribute '{@link CompanyLanguage.CEO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CompanyLanguage.CEO#getName()
	 * @see #getCEO()
	 * @generated
	 */
	EAttribute getCEO_Name();

	/**
	 * Returns the meta object for class '{@link CompanyLanguage.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see CompanyLanguage.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the containment reference list '{@link CompanyLanguage.Company#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employee</em>'.
	 * @see CompanyLanguage.Company#getEmployee()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Employee();

	/**
	 * Returns the meta object for the containment reference list '{@link CompanyLanguage.Company#getCeo <em>Ceo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ceo</em>'.
	 * @see CompanyLanguage.Company#getCeo()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Ceo();

	/**
	 * Returns the meta object for the containment reference list '{@link CompanyLanguage.Company#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Admin</em>'.
	 * @see CompanyLanguage.Company#getAdmin()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Admin();

	/**
	 * Returns the meta object for the attribute '{@link CompanyLanguage.Company#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CompanyLanguage.Company#getName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Name();

	/**
	 * Returns the meta object for class '{@link CompanyLanguage.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see CompanyLanguage.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link CompanyLanguage.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CompanyLanguage.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompanyLanguageFactory getCompanyLanguageFactory();

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
		 * The meta object literal for the '{@link CompanyLanguage.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompanyLanguage.impl.AdminImpl
		 * @see CompanyLanguage.impl.CompanyLanguagePackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Ceo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__CEO = eINSTANCE.getAdmin_Ceo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__NAME = eINSTANCE.getAdmin_Name();

		/**
		 * The meta object literal for the '{@link CompanyLanguage.impl.CEOImpl <em>CEO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompanyLanguage.impl.CEOImpl
		 * @see CompanyLanguage.impl.CompanyLanguagePackageImpl#getCEO()
		 * @generated
		 */
		EClass CEO = eINSTANCE.getCEO();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEO__EMPLOYEE = eINSTANCE.getCEO_Employee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEO__NAME = eINSTANCE.getCEO_Name();

		/**
		 * The meta object literal for the '{@link CompanyLanguage.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompanyLanguage.impl.CompanyImpl
		 * @see CompanyLanguage.impl.CompanyLanguagePackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__EMPLOYEE = eINSTANCE.getCompany_Employee();

		/**
		 * The meta object literal for the '<em><b>Ceo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__CEO = eINSTANCE.getCompany_Ceo();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__ADMIN = eINSTANCE.getCompany_Admin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

		/**
		 * The meta object literal for the '{@link CompanyLanguage.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CompanyLanguage.impl.EmployeeImpl
		 * @see CompanyLanguage.impl.CompanyLanguagePackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

	}

} //CompanyLanguagePackage
