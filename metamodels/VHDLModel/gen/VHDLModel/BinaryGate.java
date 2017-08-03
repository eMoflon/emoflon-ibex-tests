/**
 */
package VHDLModel;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VHDLModel.BinaryGate#getInputport2 <em>Inputport2</em>}</li>
 *   <li>{@link VHDLModel.BinaryGate#getInputport1 <em>Inputport1</em>}</li>
 *   <li>{@link VHDLModel.BinaryGate#getOutputport <em>Outputport</em>}</li>
 * </ul>
 * </p>
 *
 * @see VHDLModel.VHDLModelPackage#getBinaryGate()
 * @model abstract="true"
 * @generated
 */
public interface BinaryGate extends Block {
	/**
	 * Returns the value of the '<em><b>Inputport2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputport2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputport2</em>' containment reference.
	 * @see #setInputport2(InputPort)
	 * @see VHDLModel.VHDLModelPackage#getBinaryGate_Inputport2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPort getInputport2();

	/**
	 * Sets the value of the '{@link VHDLModel.BinaryGate#getInputport2 <em>Inputport2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputport2</em>' containment reference.
	 * @see #getInputport2()
	 * @generated
	 */
	void setInputport2(InputPort value);

	/**
	 * Returns the value of the '<em><b>Inputport1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputport1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputport1</em>' containment reference.
	 * @see #setInputport1(InputPort)
	 * @see VHDLModel.VHDLModelPackage#getBinaryGate_Inputport1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPort getInputport1();

	/**
	 * Sets the value of the '{@link VHDLModel.BinaryGate#getInputport1 <em>Inputport1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputport1</em>' containment reference.
	 * @see #getInputport1()
	 * @generated
	 */
	void setInputport1(InputPort value);

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
	 * @see VHDLModel.VHDLModelPackage#getBinaryGate_Outputport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputPort getOutputport();

	/**
	 * Sets the value of the '{@link VHDLModel.BinaryGate#getOutputport <em>Outputport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputport</em>' containment reference.
	 * @see #getOutputport()
	 * @generated
	 */
	void setOutputport(OutputPort value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // BinaryGate
