/**
 */
package MocaTree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MocaTree.Node#getFile <em>File</em>}</li>
 *   <li>{@link MocaTree.Node#getChildren <em>Children</em>}</li>
 *   <li>{@link MocaTree.Node#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link MocaTree.Node#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link MocaTree.Node#getStartLineIndex <em>Start Line Index</em>}</li>
 *   <li>{@link MocaTree.Node#getStopIndex <em>Stop Index</em>}</li>
 *   <li>{@link MocaTree.Node#getStopLineIndex <em>Stop Line Index</em>}</li>
 * </ul>
 *
 * @see MocaTree.MocaTreePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Text {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link MocaTree.Text}.
	 * It is bidirectional and its opposite is '{@link MocaTree.Text#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see MocaTree.MocaTreePackage#getNode_Children()
	 * @see MocaTree.Text#getParentNode
	 * @model opposite="parentNode" containment="true"
	 * @generated
	 */
	EList<Text> getChildren();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link MocaTree.Attribute}.
	 * It is bidirectional and its opposite is '{@link MocaTree.Attribute#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see MocaTree.MocaTreePackage#getNode_Attribute()
	 * @see MocaTree.Attribute#getNode
	 * @model opposite="node" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Index</em>' attribute.
	 * @see #setStartIndex(int)
	 * @see MocaTree.MocaTreePackage#getNode_StartIndex()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getStartIndex();

	/**
	 * Sets the value of the '{@link MocaTree.Node#getStartIndex <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Index</em>' attribute.
	 * @see #getStartIndex()
	 * @generated
	 */
	void setStartIndex(int value);

	/**
	 * Returns the value of the '<em><b>Start Line Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Line Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line Index</em>' attribute.
	 * @see #setStartLineIndex(int)
	 * @see MocaTree.MocaTreePackage#getNode_StartLineIndex()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getStartLineIndex();

	/**
	 * Sets the value of the '{@link MocaTree.Node#getStartLineIndex <em>Start Line Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line Index</em>' attribute.
	 * @see #getStartLineIndex()
	 * @generated
	 */
	void setStartLineIndex(int value);

	/**
	 * Returns the value of the '<em><b>Stop Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Index</em>' attribute.
	 * @see #setStopIndex(int)
	 * @see MocaTree.MocaTreePackage#getNode_StopIndex()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getStopIndex();

	/**
	 * Sets the value of the '{@link MocaTree.Node#getStopIndex <em>Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Index</em>' attribute.
	 * @see #getStopIndex()
	 * @generated
	 */
	void setStopIndex(int value);

	/**
	 * Returns the value of the '<em><b>Stop Line Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Line Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Line Index</em>' attribute.
	 * @see #setStopLineIndex(int)
	 * @see MocaTree.MocaTreePackage#getNode_StopLineIndex()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getStopLineIndex();

	/**
	 * Sets the value of the '{@link MocaTree.Node#getStopLineIndex <em>Stop Line Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Line Index</em>' attribute.
	 * @see #getStopLineIndex()
	 * @generated
	 */
	void setStopLineIndex(int value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MocaTree.File#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' container reference.
	 * @see #setFile(File)
	 * @see MocaTree.MocaTreePackage#getNode_File()
	 * @see MocaTree.File#getRootNode
	 * @model opposite="rootNode" transient="false"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link MocaTree.Node#getFile <em>File</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' container reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

} // Node
