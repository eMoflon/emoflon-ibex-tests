/**
 */
package ExtDocModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.Folder#getDocs <em>Docs</em>}</li>
 *   <li>{@link ExtDocModel.Folder#getContainer <em>Container</em>}</li>
 *   <li>{@link ExtDocModel.Folder#getSubFolder <em>Sub Folder</em>}</li>
 *   <li>{@link ExtDocModel.Folder#getSuperFolder <em>Super Folder</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Docs</b></em>' containment reference list.
	 * The list contents are of type {@link ExtDocModel.Doc}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Doc#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docs</em>' containment reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getFolder_Docs()
	 * @see ExtDocModel.Doc#getFolder
	 * @model opposite="folder" containment="true" required="true"
	 * @generated
	 */
	EList<Doc> getDocs();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.DocContainer#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(DocContainer)
	 * @see ExtDocModel.ExtDocModelPackage#getFolder_Container()
	 * @see ExtDocModel.DocContainer#getFolders
	 * @model opposite="folders" transient="false"
	 * @generated
	 */
	DocContainer getContainer();

	/**
	 * Sets the value of the '{@link ExtDocModel.Folder#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DocContainer value);

	/**
	 * Returns the value of the '<em><b>Sub Folder</b></em>' containment reference list.
	 * The list contents are of type {@link ExtDocModel.Folder}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Folder#getSuperFolder <em>Super Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folder</em>' containment reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getFolder_SubFolder()
	 * @see ExtDocModel.Folder#getSuperFolder
	 * @model opposite="superFolder" containment="true"
	 * @generated
	 */
	EList<Folder> getSubFolder();

	/**
	 * Returns the value of the '<em><b>Super Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Folder#getSubFolder <em>Sub Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Folder</em>' container reference.
	 * @see #setSuperFolder(Folder)
	 * @see ExtDocModel.ExtDocModelPackage#getFolder_SuperFolder()
	 * @see ExtDocModel.Folder#getSubFolder
	 * @model opposite="subFolder" transient="false"
	 * @generated
	 */
	Folder getSuperFolder();

	/**
	 * Sets the value of the '{@link ExtDocModel.Folder#getSuperFolder <em>Super Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Folder</em>' container reference.
	 * @see #getSuperFolder()
	 * @generated
	 */
	void setSuperFolder(Folder value);

} // Folder
