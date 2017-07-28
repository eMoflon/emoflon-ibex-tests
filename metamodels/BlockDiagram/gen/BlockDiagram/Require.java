/**
 */
package BlockDiagram;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BlockDiagram.Require#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see BlockDiagram.BlockDiagramPackage#getRequire()
 * @model
 * @generated
 */
public interface Require extends Port {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link BlockDiagram.Connector#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(Connector)
	 * @see BlockDiagram.BlockDiagramPackage#getRequire_Connector()
	 * @see BlockDiagram.Connector#getSub
	 * @model opposite="sub" containment="true" required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link BlockDiagram.Require#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Require
