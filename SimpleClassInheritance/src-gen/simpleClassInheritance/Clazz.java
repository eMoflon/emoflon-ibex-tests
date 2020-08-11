/**
 */
package simpleClassInheritance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleClassInheritance.Clazz#getMethods <em>Methods</em>}</li>
 *   <li>{@link simpleClassInheritance.Clazz#getFields <em>Fields</em>}</li>
 *   <li>{@link simpleClassInheritance.Clazz#getSuperClazz <em>Super Clazz</em>}</li>
 *   <li>{@link simpleClassInheritance.Clazz#getSubClazzes <em>Sub Clazzes</em>}</li>
 *   <li>{@link simpleClassInheritance.Clazz#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see simpleClassInheritance.SimpleClassInheritancePackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link simpleClassInheritance.Method}.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Method#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getClazz_Methods()
	 * @see simpleClassInheritance.Method#getClazz
	 * @model opposite="clazz" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link simpleClassInheritance.Field}.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Field#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getClazz_Fields()
	 * @see simpleClassInheritance.Field#getClazz
	 * @model opposite="clazz" containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Super Clazz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Clazz#getSubClazzes <em>Sub Clazzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Clazz</em>' container reference.
	 * @see #setSuperClazz(Clazz)
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getClazz_SuperClazz()
	 * @see simpleClassInheritance.Clazz#getSubClazzes
	 * @model opposite="subClazzes" transient="false"
	 * @generated
	 */
	Clazz getSuperClazz();

	/**
	 * Sets the value of the '{@link simpleClassInheritance.Clazz#getSuperClazz <em>Super Clazz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Clazz</em>' container reference.
	 * @see #getSuperClazz()
	 * @generated
	 */
	void setSuperClazz(Clazz value);

	/**
	 * Returns the value of the '<em><b>Sub Clazzes</b></em>' containment reference list.
	 * The list contents are of type {@link simpleClassInheritance.Clazz}.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.Clazz#getSuperClazz <em>Super Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Clazzes</em>' containment reference list.
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getClazz_SubClazzes()
	 * @see simpleClassInheritance.Clazz#getSuperClazz
	 * @model opposite="superClazz" containment="true"
	 * @generated
	 */
	EList<Clazz> getSubClazzes();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simpleClassInheritance.ClazzContainer#getClazzes <em>Clazzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(ClazzContainer)
	 * @see simpleClassInheritance.SimpleClassInheritancePackage#getClazz_Container()
	 * @see simpleClassInheritance.ClazzContainer#getClazzes
	 * @model opposite="clazzes" transient="false"
	 * @generated
	 */
	ClazzContainer getContainer();

	/**
	 * Sets the value of the '{@link simpleClassInheritance.Clazz#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ClazzContainer value);

} // Clazz
