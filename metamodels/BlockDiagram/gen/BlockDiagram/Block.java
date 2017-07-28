/**
 */
package BlockDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BlockDiagram.Block#getBlockSystem <em>Block System</em>}</li>
 *   <li>{@link BlockDiagram.Block#getPorts <em>Ports</em>}</li>
 *   <li>{@link BlockDiagram.Block#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see BlockDiagram.BlockDiagramPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Block System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link BlockDiagram.BlockSystem#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block System</em>' container reference.
	 * @see #setBlockSystem(BlockSystem)
	 * @see BlockDiagram.BlockDiagramPackage#getBlock_BlockSystem()
	 * @see BlockDiagram.BlockSystem#getBlocks
	 * @model opposite="blocks" required="true" transient="false"
	 * @generated
	 */
	BlockSystem getBlockSystem();

	/**
	 * Sets the value of the '{@link BlockDiagram.Block#getBlockSystem <em>Block System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block System</em>' container reference.
	 * @see #getBlockSystem()
	 * @generated
	 */
	void setBlockSystem(BlockSystem value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link BlockDiagram.Port}.
	 * It is bidirectional and its opposite is '{@link BlockDiagram.Port#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see BlockDiagram.BlockDiagramPackage#getBlock_Ports()
	 * @see BlockDiagram.Port#getBlock
	 * @model opposite="block" containment="true" required="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see BlockDiagram.BlockDiagramPackage#getBlock_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link BlockDiagram.Block#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Block
