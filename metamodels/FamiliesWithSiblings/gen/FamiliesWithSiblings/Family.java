/**
 */
package FamiliesWithSiblings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FamiliesWithSiblings.Family#getFather <em>Father</em>}</li>
 *   <li>{@link FamiliesWithSiblings.Family#getMother <em>Mother</em>}</li>
 *   <li>{@link FamiliesWithSiblings.Family#getSons <em>Sons</em>}</li>
 *   <li>{@link FamiliesWithSiblings.Family#getDaughters <em>Daughters</em>}</li>
 *   <li>{@link FamiliesWithSiblings.Family#getName <em>Name</em>}</li>
 *   <li>{@link FamiliesWithSiblings.Family#getFamiliesInverse <em>Families Inverse</em>}</li>
 *   <li>{@link FamiliesWithSiblings.Family#getSiblings <em>Siblings</em>}</li>
 * </ul>
 *
 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends EObject {
	/**
	 * Returns the value of the '<em><b>Father</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link FamiliesWithSiblings.FamilyMember#getFatherInverse <em>Father Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' containment reference.
	 * @see #setFather(FamilyMember)
	 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamily_Father()
	 * @see FamiliesWithSiblings.FamilyMember#getFatherInverse
	 * @model opposite="fatherInverse" containment="true"
	 * @generated
	 */
	FamilyMember getFather();

	/**
	 * Sets the value of the '{@link FamiliesWithSiblings.Family#getFather <em>Father</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' containment reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(FamilyMember value);

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link FamiliesWithSiblings.FamilyMember#getMotherInverse <em>Mother Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' containment reference.
	 * @see #setMother(FamilyMember)
	 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamily_Mother()
	 * @see FamiliesWithSiblings.FamilyMember#getMotherInverse
	 * @model opposite="motherInverse" containment="true"
	 * @generated
	 */
	FamilyMember getMother();

	/**
	 * Sets the value of the '{@link FamiliesWithSiblings.Family#getMother <em>Mother</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' containment reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(FamilyMember value);

	/**
	 * Returns the value of the '<em><b>Sons</b></em>' containment reference list.
	 * The list contents are of type {@link FamiliesWithSiblings.FamilyMember}.
	 * It is bidirectional and its opposite is '{@link FamiliesWithSiblings.FamilyMember#getSonsInverse <em>Sons Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sons</em>' containment reference list.
	 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamily_Sons()
	 * @see FamiliesWithSiblings.FamilyMember#getSonsInverse
	 * @model opposite="sonsInverse" containment="true"
	 * @generated
	 */
	EList<FamilyMember> getSons();

	/**
	 * Returns the value of the '<em><b>Daughters</b></em>' containment reference list.
	 * The list contents are of type {@link FamiliesWithSiblings.FamilyMember}.
	 * It is bidirectional and its opposite is '{@link FamiliesWithSiblings.FamilyMember#getDaughtersInverse <em>Daughters Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daughters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daughters</em>' containment reference list.
	 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamily_Daughters()
	 * @see FamiliesWithSiblings.FamilyMember#getDaughtersInverse
	 * @model opposite="daughtersInverse" containment="true"
	 * @generated
	 */
	EList<FamilyMember> getDaughters();

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
	 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamily_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FamiliesWithSiblings.Family#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Families Inverse</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link FamiliesWithSiblings.FamilyRegister#getFamilies <em>Families</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Families Inverse</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Families Inverse</em>' container reference.
	 * @see #setFamiliesInverse(FamilyRegister)
	 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamily_FamiliesInverse()
	 * @see FamiliesWithSiblings.FamilyRegister#getFamilies
	 * @model opposite="families" transient="false"
	 * @generated
	 */
	FamilyRegister getFamiliesInverse();

	/**
	 * Sets the value of the '{@link FamiliesWithSiblings.Family#getFamiliesInverse <em>Families Inverse</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Families Inverse</em>' container reference.
	 * @see #getFamiliesInverse()
	 * @generated
	 */
	void setFamiliesInverse(FamilyRegister value);

	/**
	 * Returns the value of the '<em><b>Siblings</b></em>' reference list.
	 * The list contents are of type {@link FamiliesWithSiblings.Family}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Siblings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Siblings</em>' reference list.
	 * @see FamiliesWithSiblings.FamiliesWithSiblingsPackage#getFamily_Siblings()
	 * @model upper="5"
	 * @generated
	 */
	EList<Family> getSiblings();

} // Family
