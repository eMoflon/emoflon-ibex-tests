/**
 */
package VHDLModel;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VHDLModel.NotGate#getOutputport <em>Outputport</em>}</li>
 *   <li>{@link VHDLModel.NotGate#getInputport <em>Inputport</em>}</li>
 * </ul>
 * </p>
 *
 * @see VHDLModel.VHDLModelPackage#getNotGate()
 * @model
 * @generated
 */
public interface NotGate extends Block {
	/**
	 * Returns the value of the '<em><b>Outputport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputport</em>' containment reference.
	 * @see #setOutputport(OutputPort)
	 * @see VHDLModel.VHDLModelPackage#getNotGate_Outputport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPort getOutputport();

	/**
	 * Sets the value of the '{@link VHDLModel.NotGate#getOutputport <em>Outputport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputport</em>' containment reference.
	 * @see #getOutputport()
	 * @generated
	 */
	void setOutputport(OutputPort value);

	/**
	 * Returns the value of the '<em><b>Inputport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputport</em>' containment reference.
	 * @see #setInputport(InputPort)
	 * @see VHDLModel.VHDLModelPackage#getNotGate_Inputport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPort getInputport();

	/**
	 * Sets the value of the '{@link VHDLModel.NotGate#getInputport <em>Inputport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputport</em>' containment reference.
	 * @see #getInputport()
	 * @generated
	 */
	void setInputport(InputPort value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // NotGate
