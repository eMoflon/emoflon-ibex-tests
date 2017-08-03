/**
 */
package VHDLModel;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VHDLModel.BlockRef#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see VHDLModel.VHDLModelPackage#getBlockRef()
 * @model
 * @generated
 */
public interface BlockRef extends ComplexBlock {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference.
	 * @see #setBlock(CompositeBlock)
	 * @see VHDLModel.VHDLModelPackage#getBlockRef_Block()
	 * @model required="true"
	 * @generated
	 */
	CompositeBlock getBlock();

	/**
	 * Sets the value of the '{@link VHDLModel.BlockRef#getBlock <em>Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(CompositeBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // BlockRef
