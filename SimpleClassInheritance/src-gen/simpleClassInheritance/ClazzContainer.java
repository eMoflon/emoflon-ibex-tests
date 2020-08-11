/**
 */
package simpleClassInheritance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleClassInheritance.ClazzContainer#getClazzes <em>Clazzes</em>}</li>
 * </ul>
 *
 * @see simpleClassInheritance.SimpleClassInheritancePackage#getClazzContainer()
 * @model
 * @generated
 */
public interface ClazzContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Clazzes</b></em>' containment reference list.
	 * The list contents are of type {@link simpleClassInheritance.Clazz}.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Clazz#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazzes</em>' containment reference list.
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getClazzContainer_Clazzes()
	 * @see simpleClassInheritance.Clazz#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Clazz> getClazzes();

} // ClazzContainer
