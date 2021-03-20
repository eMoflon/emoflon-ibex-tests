/**
 */
package ExtTypeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtTypeModel.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link ExtTypeModel.Package#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link ExtTypeModel.Package#getTypes <em>Types</em>}</li>
 *   <li>{@link ExtTypeModel.Package#getFQname <em>FQname</em>}</li>
 *   <li>{@link ExtTypeModel.Package#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see ExtTypeModel.ExtTypeModelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link ExtTypeModel.Package}.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Package#getSuperPackage <em>Super Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see ExtTypeModel.ExtTypeModelPackage#getPackage_SubPackages()
	 * @see ExtTypeModel.Package#getSuperPackage
	 * @model opposite="superPackage" containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

	/**
	 * Returns the value of the '<em><b>Super Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Package</em>' container reference.
	 * @see #setSuperPackage(Package)
	 * @see ExtTypeModel.ExtTypeModelPackage#getPackage_SuperPackage()
	 * @see ExtTypeModel.Package#getSubPackages
	 * @model opposite="subPackages" transient="false"
	 * @generated
	 */
	Package getSuperPackage();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Package#getSuperPackage <em>Super Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Package</em>' container reference.
	 * @see #getSuperPackage()
	 * @generated
	 */
	void setSuperPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link ExtTypeModel.Type}.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see ExtTypeModel.ExtTypeModelPackage#getPackage_Types()
	 * @see ExtTypeModel.Type#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>FQname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FQname</em>' attribute.
	 * @see #setFQname(String)
	 * @see ExtTypeModel.ExtTypeModelPackage#getPackage_FQname()
	 * @model
	 * @generated
	 */
	String getFQname();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Package#getFQname <em>FQname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FQname</em>' attribute.
	 * @see #getFQname()
	 * @generated
	 */
	void setFQname(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Project#getRootPackages <em>Root Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see ExtTypeModel.ExtTypeModelPackage#getPackage_Project()
	 * @see ExtTypeModel.Project#getRootPackages
	 * @model opposite="rootPackages" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link ExtTypeModel.Package#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // Package
