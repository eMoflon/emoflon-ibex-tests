/**
 */
package BlockDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BlockDiagram.Provide#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see BlockDiagram.BlockDiagramPackage#getProvide()
 * @model
 * @generated
 */
public interface Provide extends Port {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link BlockDiagram.Connector#getPub <em>Pub</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see BlockDiagram.BlockDiagramPackage#getProvide_Connector()
	 * @see BlockDiagram.Connector#getPub
	 * @model opposite="pub" required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link BlockDiagram.Provide#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Provide
