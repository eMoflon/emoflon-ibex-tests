/**
 */
package BlockDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BlockDiagram.BlockSystem#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link BlockDiagram.BlockSystem#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see BlockDiagram.BlockDiagramPackage#getBlockSystem()
 * @model
 * @generated
 */
public interface BlockSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link BlockDiagram.Block}.
	 * It is bidirectional and its opposite is '{@link BlockDiagram.Block#getBlockSystem <em>Block System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see BlockDiagram.BlockDiagramPackage#getBlockSystem_Blocks()
	 * @see BlockDiagram.Block#getBlockSystem
	 * @model opposite="blockSystem" containment="true"
	 * @generated
	 */
	EList<Block> getBlocks();

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
	 * @see BlockDiagram.BlockDiagramPackage#getBlockSystem_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BlockDiagram.BlockSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // BlockSystem
