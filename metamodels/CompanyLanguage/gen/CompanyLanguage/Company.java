/**
 */
package CompanyLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompanyLanguage.Company#getEmployee <em>Employee</em>}</li>
 *   <li>{@link CompanyLanguage.Company#getCeo <em>Ceo</em>}</li>
 *   <li>{@link CompanyLanguage.Company#getAdmin <em>Admin</em>}</li>
 *   <li>{@link CompanyLanguage.Company#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompanyLanguage.CompanyLanguagePackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
	/**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link CompanyLanguage.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see CompanyLanguage.CompanyLanguagePackage#getCompany_Employee()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployee();

	/**
	 * Returns the value of the '<em><b>Ceo</b></em>' containment reference list.
	 * The list contents are of type {@link CompanyLanguage.CEO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceo</em>' containment reference list.
	 * @see CompanyLanguage.CompanyLanguagePackage#getCompany_Ceo()
	 * @model containment="true"
	 * @generated
	 */
	EList<CEO> getCeo();

	/**
	 * Returns the value of the '<em><b>Admin</b></em>' containment reference list.
	 * The list contents are of type {@link CompanyLanguage.Admin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' containment reference list.
	 * @see CompanyLanguage.CompanyLanguagePackage#getCompany_Admin()
	 * @model containment="true"
	 * @generated
	 */
	EList<Admin> getAdmin();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CompanyLanguage.CompanyLanguagePackage#getCompany_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CompanyLanguage.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Company
