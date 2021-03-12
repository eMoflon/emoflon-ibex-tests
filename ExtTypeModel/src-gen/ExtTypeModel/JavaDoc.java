/**
 */
package ExtTypeModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtTypeModel.JavaDoc#getComment <em>Comment</em>}</li>
 *   <li>{@link ExtTypeModel.JavaDoc#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see ExtTypeModel.ExtTypeModelPackage#getJavaDoc()
 * @model
 * @generated
 */
public interface JavaDoc extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see ExtTypeModel.ExtTypeModelPackage#getJavaDoc_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link ExtTypeModel.JavaDoc#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Method#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Method)
	 * @see ExtTypeModel.ExtTypeModelPackage#getJavaDoc_Method()
	 * @see ExtTypeModel.Method#getDocs
	 * @model opposite="docs" transient="false"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link ExtTypeModel.JavaDoc#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // JavaDoc
