/**
 */
package simpleDoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleDoc.Folder#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link simpleDoc.Folder#getDocs <em>Docs</em>}</li>
 *   <li>{@link simpleDoc.Folder#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see simpleDoc.SimpleDocPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Folders</b></em>' containment reference list.
	 * The list contents are of type {@link simpleDoc.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folders</em>' containment reference list.
	 * @see simpleDoc.SimpleDocPackage#getFolder_SubFolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getSubFolders();

	/**
	 * Returns the value of the '<em><b>Docs</b></em>' containment reference list.
	 * The list contents are of type {@link simpleDoc.Doc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docs</em>' containment reference list.
	 * @see simpleDoc.SimpleDocPackage#getFolder_Docs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Doc> getDocs();

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
	 * @see simpleDoc.SimpleDocPackage#getFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleDoc.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Folder
