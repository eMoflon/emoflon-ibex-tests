/**
 */
package classMultipleInheritanceHierarchy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classMultipleInheritanceHierarchy.ClassPackage#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyPackage#getClassPackage()
 * @model
 * @generated
 */
public interface ClassPackage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link classMultipleInheritanceHierarchy.Clazz}.
	 * It is bidirectional and its opposite is '{@link classMultipleInheritanceHierarchy.Clazz#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyPackage#getClassPackage_Classes()
	 * @see classMultipleInheritanceHierarchy.Clazz#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<Clazz> getClasses();

} // ClassPackage
