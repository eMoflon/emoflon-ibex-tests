/**
 */
package classMultipleInheritanceHierarchy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classMultipleInheritanceHierarchy.Clazz#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link classMultipleInheritanceHierarchy.Clazz#getPackage <em>Package</em>}</li>
 *   <li>{@link classMultipleInheritanceHierarchy.Clazz#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link classMultipleInheritanceHierarchy.Clazz}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyPackage#getClazz_SuperClass()
	 * @model
	 * @generated
	 */
	EList<Clazz> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link classMultipleInheritanceHierarchy.ClassPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(ClassPackage)
	 * @see classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyPackage#getClazz_Package()
	 * @see classMultipleInheritanceHierarchy.ClassPackage#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	ClassPackage getPackage();

	/**
	 * Sets the value of the '{@link classMultipleInheritanceHierarchy.Clazz#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(ClassPackage value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link classMultipleInheritanceHierarchy.Attribute}.
	 * It is bidirectional and its opposite is '{@link classMultipleInheritanceHierarchy.Attribute#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyPackage#getClazz_Attributes()
	 * @see classMultipleInheritanceHierarchy.Attribute#getClazz
	 * @model opposite="clazz" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Clazz
