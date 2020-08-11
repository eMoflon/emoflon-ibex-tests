/**
 */
package simpleClassInheritance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleClassInheritance.Parameter#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see simpleClassInheritance.SimpleClassInheritancePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Method#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getParameter_Method()
	 * @see simpleClassInheritance.Method#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link simpleClassInheritance.Parameter#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);
} // Parameter
