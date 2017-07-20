/**
 */
package ITLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ITLanguage.IT#getRouter <em>Router</em>}</li>
 *   <li>{@link ITLanguage.IT#getNetwork <em>Network</em>}</li>
 *   <li>{@link ITLanguage.IT#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ITLanguage.ITLanguagePackage#getIT()
 * @model
 * @generated
 */
public interface IT extends EObject {
	/**
	 * Returns the value of the '<em><b>Router</b></em>' containment reference list.
	 * The list contents are of type {@link ITLanguage.Router}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router</em>' containment reference list.
	 * @see ITLanguage.ITLanguagePackage#getIT_Router()
	 * @model containment="true"
	 * @generated
	 */
	EList<Router> getRouter();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link ITLanguage.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see ITLanguage.ITLanguagePackage#getIT_Network()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetwork();

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
	 * @see ITLanguage.ITLanguagePackage#getIT_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ITLanguage.IT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // IT
