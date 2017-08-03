/**
 */
package VHDLModel;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link VHDLModel.ComplexBlock#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see VHDLModel.VHDLModelPackage#getComplexBlock()
 * @model abstract="true"
 * @generated
 */
public interface ComplexBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link VHDLModel.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see VHDLModel.VHDLModelPackage#getComplexBlock_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ComplexBlock
