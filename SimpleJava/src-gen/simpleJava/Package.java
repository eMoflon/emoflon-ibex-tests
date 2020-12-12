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
 *   <li>{@link simpleJava.Package#getClazzes <em>Clazzes</em>}</li>
 *   <li>{@link simpleJava.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link simpleJava.Package#getName <em>Name</em>}</li>
 *   <li>{@link simpleJava.Package#getFullQualifier <em>Full Qualifier</em>}</li>
 *   <li>{@link simpleJava.Package#getSuperPackage <em>Super Package</em>}</li>
 * </ul>
 *
 * @see simpleJava.SimpleJavaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Clazzes</b></em>' containment reference list.
	 * The list contents are of type {@link simpleJava.Clazz}.
	 * It is bidirectional and its opposite is '{@link simpleJava.Clazz#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazzes</em>' containment reference list.
	 * @see simpleJava.SimpleJavaPackage#getPackage_Clazzes()
	 * @see simpleJava.Clazz#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<Clazz> getClazzes();

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link simpleJava.Package}.
	 * It is bidirectional and its opposite is '{@link simpleJava.Package#getSuperPackage <em>Super Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see simpleJava.SimpleJavaPackage#getPackage_SubPackages()
	 * @see simpleJava.Package#getSuperPackage
	 * @model opposite="superPackage" containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
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

	/**
	 * Returns the value of the '<em><b>Super Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simpleJava.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Package</em>' container reference.
	 * @see #setSuperPackage(Package)
	 * @see simpleJava.SimpleJavaPackage#getPackage_SuperPackage()
	 * @see simpleJava.Package#getSubPackages
	 * @model opposite="subPackages" transient="false"
	 * @generated
	 */
	Package getSuperPackage();

	/**
	 * Sets the value of the '{@link simpleJava.Package#getSuperPackage <em>Super Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Package</em>' container reference.
	 * @see #getSuperPackage()
	 * @generated
	 */
	void setSuperPackage(Package value);

} // Package
