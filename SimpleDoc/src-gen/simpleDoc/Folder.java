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
 *   <li>{@link simpleDoc.Folder#getSuperFolder <em>Super Folder</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link simpleDoc.Folder#getSuperFolder <em>Super Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folders</em>' containment reference list.
	 * @see simpleDoc.SimpleDocPackage#getFolder_SubFolders()
	 * @see simpleDoc.Folder#getSuperFolder
	 * @model opposite="superFolder" containment="true"
	 * @generated
	 */
	EList<Folder> getSubFolders();

	/**
	 * Returns the value of the '<em><b>Docs</b></em>' containment reference list.
	 * The list contents are of type {@link simpleDoc.Doc}.
	 * It is bidirectional and its opposite is '{@link simpleDoc.Doc#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docs</em>' containment reference list.
	 * @see simpleDoc.SimpleDocPackage#getFolder_Docs()
	 * @see simpleDoc.Doc#getFolder
	 * @model opposite="folder" containment="true"
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

	/**
	 * Returns the value of the '<em><b>Super Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simpleDoc.Folder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Folder</em>' container reference.
	 * @see #setSuperFolder(Folder)
	 * @see simpleDoc.SimpleDocPackage#getFolder_SuperFolder()
	 * @see simpleDoc.Folder#getSubFolders
	 * @model opposite="subFolders" transient="false"
	 * @generated
	 */
	Folder getSuperFolder();

	/**
	 * Sets the value of the '{@link simpleDoc.Folder#getSuperFolder <em>Super Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Folder</em>' container reference.
	 * @see #getSuperFolder()
	 * @generated
	 */
	void setSuperFolder(Folder value);

} // Folder
