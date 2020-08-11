/**
 */
package simpleClassInheritance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleClassInheritance.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link simpleClassInheritance.Method#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see simpleClassInheritance.SimpleClassInheritancePackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link simpleClassInheritance.Parameter}.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Parameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getMethod_Parameters()
	 * @see simpleClassInheritance.Parameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Clazz#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' container reference.
	 * @see #setClazz(Clazz)
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getMethod_Clazz()
	 * @see simpleClassInheritance.Clazz#getMethods
	 * @model opposite="methods" transient="false"
	 * @generated
	 */
	Clazz getClazz();

	/**
	 * Sets the value of the '{@link simpleClassInheritance.Method#getClazz <em>Clazz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' container reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(Clazz value);

} // Method
