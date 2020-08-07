/**
 */
package simpleClassInheritance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleClassInheritance.Field#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see simpleClassInheritance.SimpleClassInheritancePackage#getField()
 * @model
 * @generated
 */
public interface Field extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Clazz#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' container reference.
	 * @see #setClazz(Clazz)
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getField_Clazz()
	 * @see simpleClassInheritance.Clazz#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	Clazz getClazz();

	/**
	 * Sets the value of the '{@link simpleClassInheritance.Field#getClazz <em>Clazz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' container reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(Clazz value);
} // Field
