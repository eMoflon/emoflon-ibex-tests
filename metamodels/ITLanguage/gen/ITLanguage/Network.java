/**
 */
package ITLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ITLanguage.Network#getPc <em>Pc</em>}</li>
 *   <li>{@link ITLanguage.Network#getLaptop <em>Laptop</em>}</li>
 *   <li>{@link ITLanguage.Network#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ITLanguage.ITLanguagePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Pc</b></em>' containment reference list.
	 * The list contents are of type {@link ITLanguage.PC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pc</em>' containment reference list.
	 * @see ITLanguage.ITLanguagePackage#getNetwork_Pc()
	 * @model containment="true"
	 * @generated
	 */
	EList<PC> getPc();

	/**
	 * Returns the value of the '<em><b>Laptop</b></em>' containment reference list.
	 * The list contents are of type {@link ITLanguage.Laptop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laptop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laptop</em>' containment reference list.
	 * @see ITLanguage.ITLanguagePackage#getNetwork_Laptop()
	 * @model containment="true"
	 * @generated
	 */
	EList<Laptop> getLaptop();

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
	 * @see ITLanguage.ITLanguagePackage#getNetwork_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ITLanguage.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Network
