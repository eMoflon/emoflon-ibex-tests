/**
 */
package BlockDiagram;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BlockDiagram.Connector#getSub <em>Sub</em>}</li>
 *   <li>{@link BlockDiagram.Connector#getPub <em>Pub</em>}</li>
 * </ul>
 * </p>
 *
 * @see BlockDiagram.BlockDiagramPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link BlockDiagram.Require#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' container reference.
	 * @see #setSub(Require)
	 * @see BlockDiagram.BlockDiagramPackage#getConnector_Sub()
	 * @see BlockDiagram.Require#getConnector
	 * @model opposite="connector" required="true" transient="false"
	 * @generated
	 */
	Require getSub();

	/**
	 * Sets the value of the '{@link BlockDiagram.Connector#getSub <em>Sub</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' container reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(Require value);

	/**
	 * Returns the value of the '<em><b>Pub</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link BlockDiagram.Provide#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub</em>' reference.
	 * @see #setPub(Provide)
	 * @see BlockDiagram.BlockDiagramPackage#getConnector_Pub()
	 * @see BlockDiagram.Provide#getConnector
	 * @model opposite="connector" required="true"
	 * @generated
	 */
	Provide getPub();

	/**
	 * Sets the value of the '{@link BlockDiagram.Connector#getPub <em>Pub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub</em>' reference.
	 * @see #getPub()
	 * @generated
	 */
	void setPub(Provide value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Connector
