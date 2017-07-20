/**
 */
package CompanyLanguage;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CompanyLanguage.Admin#getCeo <em>Ceo</em>}</li>
 *   <li>{@link CompanyLanguage.Admin#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CompanyLanguage.CompanyLanguagePackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends EObject {
	/**
	 * Returns the value of the '<em><b>Ceo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceo</em>' reference.
	 * @see #setCeo(CEO)
	 * @see CompanyLanguage.CompanyLanguagePackage#getAdmin_Ceo()
	 * @model
	 * @generated
	 */
	CEO getCeo();

	/**
	 * Sets the value of the '{@link CompanyLanguage.Admin#getCeo <em>Ceo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceo</em>' reference.
	 * @see #getCeo()
	 * @generated
	 */
	void setCeo(CEO value);

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
	 * @see CompanyLanguage.CompanyLanguagePackage#getAdmin_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CompanyLanguage.Admin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Admin
