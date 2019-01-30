/**
 */
package simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleJava.Package#getClasses <em>Classes</em>}</li>
 *   <li>{@link simpleJava.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link simpleJava.Package#getName <em>Name</em>}</li>
 *   <li>{@link simpleJava.Package#getFullQualifier <em>Full Qualifier</em>}</li>
 * </ul>
 *
 * @see simpleJava.SimpleJavaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link simpleJava.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see simpleJava.SimpleJavaPackage#getPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<simpleJava.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link simpleJava.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see simpleJava.SimpleJavaPackage#getPackage_SubPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simpleJava.SimpleJavaPackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleJava.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Full Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Qualifier</em>' attribute.
	 * @see #setFullQualifier(String)
	 * @see simpleJava.SimpleJavaPackage#getPackage_FullQualifier()
	 * @model
	 * @generated
	 */
	String getFullQualifier();

	/**
	 * Sets the value of the '{@link simpleJava.Package#getFullQualifier <em>Full Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Qualifier</em>' attribute.
	 * @see #getFullQualifier()
	 * @generated
	 */
	void setFullQualifier(String value);

} // Package