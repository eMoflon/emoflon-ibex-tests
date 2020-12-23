/**
 */
package ExtTypeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtTypeModel.Type#isInterface <em>Interface</em>}</li>
 *   <li>{@link ExtTypeModel.Type#getExtendedBy <em>Extended By</em>}</li>
 *   <li>{@link ExtTypeModel.Type#getInheritsFrom <em>Inherits From</em>}</li>
 *   <li>{@link ExtTypeModel.Type#getMethods <em>Methods</em>}</li>
 *   <li>{@link ExtTypeModel.Type#getFields <em>Fields</em>}</li>
 *   <li>{@link ExtTypeModel.Type#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see ExtTypeModel.ExtTypeModelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see ExtTypeModel.ExtTypeModelPackage#getType_Interface()
	 * @model
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Type#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Extended By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Type#getInheritsFrom <em>Inherits From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended By</em>' reference.
	 * @see #setExtendedBy(Type)
	 * @see ExtTypeModel.ExtTypeModelPackage#getType_ExtendedBy()
	 * @see ExtTypeModel.Type#getInheritsFrom
	 * @model opposite="inheritsFrom"
	 * @generated
	 */
	Type getExtendedBy();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Type#getExtendedBy <em>Extended By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended By</em>' reference.
	 * @see #getExtendedBy()
	 * @generated
	 */
	void setExtendedBy(Type value);

	/**
	 * Returns the value of the '<em><b>Inherits From</b></em>' reference list.
	 * The list contents are of type {@link ExtTypeModel.Type}.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Type#getExtendedBy <em>Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits From</em>' reference list.
	 * @see ExtTypeModel.ExtTypeModelPackage#getType_InheritsFrom()
	 * @see ExtTypeModel.Type#getExtendedBy
	 * @model opposite="extendedBy"
	 * @generated
	 */
	EList<Type> getInheritsFrom();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link ExtTypeModel.Method}.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Method#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see ExtTypeModel.ExtTypeModelPackage#getType_Methods()
	 * @see ExtTypeModel.Method#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ExtTypeModel.Field}.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Field#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see ExtTypeModel.ExtTypeModelPackage#getType_Fields()
	 * @see ExtTypeModel.Field#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Package#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(ExtTypeModel.Package)
	 * @see ExtTypeModel.ExtTypeModelPackage#getType_Package()
	 * @see ExtTypeModel.Package#getTypes
	 * @model opposite="types" transient="false"
	 * @generated
	 */
	ExtTypeModel.Package getPackage();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Type#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(ExtTypeModel.Package value);

} // Type
