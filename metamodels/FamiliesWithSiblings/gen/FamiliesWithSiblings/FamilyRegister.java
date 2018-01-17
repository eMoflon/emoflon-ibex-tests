/**
 */
package FamiliesWithSiblings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FamiliesWithSiblings.FamilyRegister#getFamilies <em>Families</em>}</li>
 * </ul>
 *
 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamilyRegister()
 * @model
 * @generated
 */
public interface FamilyRegister extends EObject {
	/**
	 * Returns the value of the '<em><b>Families</b></em>' containment reference list.
	 * The list contents are of type {@link FamiliesWithSiblings.Family}.
	 * It is bidirectional and its opposite is '{@link FamiliesWithSiblings.Family#getFamiliesInverse <em>Families Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Families</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Families</em>' containment reference list.
	 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamilyRegister_Families()
	 * @see FamiliesWithSiblings.Family#getFamiliesInverse
	 * @model opposite="familiesInverse" containment="true"
	 * @generated
	 */
	EList<Family> getFamilies();

} // FamilyRegister
