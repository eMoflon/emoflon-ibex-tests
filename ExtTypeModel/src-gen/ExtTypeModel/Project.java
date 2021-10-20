/**
 */
package ExtTypeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtTypeModel.Project#getRootPackages <em>Root Packages</em>}</li>
 * </ul>
 *
 * @see ExtTypeModel.ExtTypeModelPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Packages</b></em>' containment reference list.
	 * The list contents are of type {@link ExtTypeModel.Package}.
	 * It is bidirectional and its opposite is '{@link ExtTypeModel.Package#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Packages</em>' containment reference list.
	 * @see ExtTypeModel.ExtTypeModelPackage#getProject_RootPackages()
	 * @see ExtTypeModel.Package#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<ExtTypeModel.Package> getRootPackages();

} // Project
