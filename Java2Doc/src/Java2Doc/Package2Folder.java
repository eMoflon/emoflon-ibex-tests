/**
 */
package Java2Doc;

import org.eclipse.emf.ecore.EObject;

import simpleDoc.Folder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package2 Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Java2Doc.Package2Folder#getSource <em>Source</em>}</li>
 *   <li>{@link Java2Doc.Package2Folder#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Java2Doc.Java2DocPackage#getPackage2Folder()
 * @model
 * @generated
 */
public interface Package2Folder extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(simpleJava.Package)
	 * @see Java2Doc.Java2DocPackage#getPackage2Folder_Source()
	 * @model
	 * @generated
	 */
	simpleJava.Package getSource();

	/**
	 * Sets the value of the '{@link Java2Doc.Package2Folder#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(simpleJava.Package value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Folder)
	 * @see Java2Doc.Java2DocPackage#getPackage2Folder_Target()
	 * @model
	 * @generated
	 */
	Folder getTarget();

	/**
	 * Sets the value of the '{@link Java2Doc.Package2Folder#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Folder value);

} // Package2Folder
