/**
 */
package BlockLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BlockLanguage.Port#getWire <em>Wire</em>}</li>
 *   <li>{@link BlockLanguage.Port#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see BlockLanguage.BlockLanguagePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Wire</b></em>' containment reference list.
	 * The list contents are of type {@link BlockLanguage.Wire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire</em>' containment reference list.
	 * @see BlockLanguage.BlockLanguagePackage#getPort_Wire()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wire> getWire();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see BlockLanguage.BlockLanguagePackage#getPort_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link BlockLanguage.Port#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Port
