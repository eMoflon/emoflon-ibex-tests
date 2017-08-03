/**
 */
package VHDLModel;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VHDLModel.CompositeBlock#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see VHDLModel.VHDLModelPackage#getCompositeBlock()
 * @model
 * @generated
 */
public interface CompositeBlock extends ComplexBlock {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link VHDLModel.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see VHDLModel.VHDLModelPackage#getCompositeBlock_Blocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pullValue(Port port);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CompositeBlock
