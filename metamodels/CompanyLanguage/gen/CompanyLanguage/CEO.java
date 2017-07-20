/**
 */
package CompanyLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompanyLanguage.CEO#getEmployee <em>Employee</em>}</li>
 *   <li>{@link CompanyLanguage.CEO#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompanyLanguage.CompanyLanguagePackage#getCEO()
 * @model
 * @generated
 */
public interface CEO extends EObject {
	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference list.
	 * The list contents are of type {@link CompanyLanguage.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference list.
	 * @see CompanyLanguage.CompanyLanguagePackage#getCEO_Employee()
	 * @model
	 * @generated
	 */
	EList<Employee> getEmployee();

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
	 * @see CompanyLanguage.CompanyLanguagePackage#getCEO_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CompanyLanguage.CEO#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CEO
