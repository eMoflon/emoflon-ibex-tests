/**
 */
package simpleDoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleDoc.Doc#getName <em>Name</em>}</li>
 *   <li>{@link simpleDoc.Doc#getContent <em>Content</em>}</li>
 *   <li>{@link simpleDoc.Doc#getFolder <em>Folder</em>}</li>
 * </ul>
 *
 * @see simpleDoc.SimpleDocPackage#getDoc()
 * @model
 * @generated
 */
public interface Doc extends EObject {
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
	 * @see simpleDoc.SimpleDocPackage#getDoc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleDoc.Doc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see simpleDoc.SimpleDocPackage#getDoc_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link simpleDoc.Doc#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simpleDoc.Folder#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' container reference.
	 * @see #setFolder(Folder)
	 * @see simpleDoc.SimpleDocPackage#getDoc_Folder()
	 * @see simpleDoc.Folder#getDocs
	 * @model opposite="docs" transient="false"
	 * @generated
	 */
	Folder getFolder();

	/**
	 * Sets the value of the '{@link simpleDoc.Doc#getFolder <em>Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' container reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(Folder value);

} // Doc
