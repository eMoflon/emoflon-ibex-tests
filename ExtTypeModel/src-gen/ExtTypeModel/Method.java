/**
 */
package ExtTypeModel;

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
 *   <li>{@link ExtTypeModel.Method#getParams <em>Params</em>}</li>
 *   <li>{@link ExtTypeModel.Method#getType <em>Type</em>}</li>
 *   <li>{@link ExtTypeModel.Method#getDoc <em>Doc</em>}</li>
 * </ul>
 *
 * @see ExtTypeModel.ExtTypeModelPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link ExtTypeModel.Parameter}.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Parameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see ExtTypeModel.ExtTypeModelPackage#getMethod_Params()
	 * @see ExtTypeModel.Parameter#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Type#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(Type)
	 * @see ExtTypeModel.ExtTypeModelPackage#getMethod_Type()
	 * @see ExtTypeModel.Type#getMethods
	 * @model opposite="methods" transient="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Method#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.JavaDoc#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' containment reference.
	 * @see #setDoc(JavaDoc)
	 * @see ExtTypeModel.ExtTypeModelPackage#getMethod_Doc()
	 * @see ExtTypeModel.JavaDoc#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	JavaDoc getDoc();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Method#getDoc <em>Doc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' containment reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(JavaDoc value);

} // Method
