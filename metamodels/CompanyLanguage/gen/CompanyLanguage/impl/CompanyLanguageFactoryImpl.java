/**
 */
package CompanyLanguage.impl;

import CompanyLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompanyLanguageFactoryImpl extends EFactoryImpl implements CompanyLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompanyLanguageFactory init() {
		try {
			CompanyLanguageFactory theCompanyLanguageFactory = (CompanyLanguageFactory) EPackage.Registry.INSTANCE
					.getEFactory(CompanyLanguagePackage.eNS_URI);
			if (theCompanyLanguageFactory != null) {
				return theCompanyLanguageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompanyLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CompanyLanguagePackage.ADMIN:
			return createAdmin();
		case CompanyLanguagePackage.CEO:
			return createCEO();
		case CompanyLanguagePackage.COMPANY:
			return createCompany();
		case CompanyLanguagePackage.EMPLOYEE:
			return createEmployee();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEO createCEO() {
		CEOImpl ceo = new CEOImpl();
		return ceo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company createCompany() {
		CompanyImpl company = new CompanyImpl();
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyLanguagePackage getCompanyLanguagePackage() {
		return (CompanyLanguagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompanyLanguagePackage getPackage() {
		return CompanyLanguagePackage.eINSTANCE;
	}

} //CompanyLanguageFactoryImpl
