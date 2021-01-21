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
 *   <li>{@link ExtTypeModel.Field#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ExtTypeModel.ExtTypeModelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Type#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(Type)
	 * @see ExtTypeModel.ExtTypeModelPackage#getField_Type()
	 * @see ExtTypeModel.Type#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Field#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Field
