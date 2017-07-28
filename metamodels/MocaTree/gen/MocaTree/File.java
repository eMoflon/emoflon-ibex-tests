/**
 */
package MocaTree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MocaTree.File#getFolder <em>Folder</em>}</li>
 *   <li>{@link MocaTree.File#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @see MocaTree.MocaTreePackage#getFile()
 * @model
 * @generated
 */
public interface File extends TreeElement {
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MocaTree.Folder#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' container reference.
	 * @see #setFolder(Folder)
	 * @see MocaTree.MocaTreePackage#getFile_Folder()
	 * @see MocaTree.Folder#getFile
	 * @model opposite="file" required="true" transient="false"
	 * @generated
	 */
	Folder getFolder();

	/**
	 * Sets the value of the '{@link MocaTree.File#getFolder <em>Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' container reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link MocaTree.Node#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Node</em>' containment reference.
	 * @see #setRootNode(Node)
	 * @see MocaTree.MocaTreePackage#getFile_RootNode()
	 * @see MocaTree.Node#getFile
	 * @model opposite="file" containment="true" required="true"
	 * @generated
	 */
	Node getRootNode();

	/**
	 * Sets the value of the '{@link MocaTree.File#getRootNode <em>Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Node</em>' containment reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(Node value);

} // File
