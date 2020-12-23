/**
 */
package ExtTypeModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtTypeModel.Field#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see ExtTypeModel.ExtTypeModelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Type#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(Type)
	 * @see ExtTypeModel.ExtTypeModelPackage#getField_Method()
	 * @see ExtTypeModel.Type#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	Type getMethod();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Field#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Type value);

} // Field
