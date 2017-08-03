/**
 */
package VHDLModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see VHDLModel.VHDLModelFactory
 * @model kind="package"
 * @generated
 */
public interface VHDLModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "VHDLModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/VHDLModel/model/VHDLModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VHDLModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VHDLModelPackage eINSTANCE = VHDLModel.impl.VHDLModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link VHDLModel.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.BlockImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___EVAL = 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.BinaryGateImpl <em>Binary Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.BinaryGateImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getBinaryGate()
	 * @generated
	 */
	int BINARY_GATE = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GATE__INPUTS = BLOCK__INPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GATE__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Inputport2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GATE__INPUTPORT2 = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputport1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GATE__INPUTPORT1 = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GATE__OUTPUTPORT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GATE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GATE___EVAL = BLOCK___EVAL;

	/**
	 * The number of operations of the '<em>Binary Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GATE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.AndGateImpl <em>And Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.AndGateImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getAndGate()
	 * @generated
	 */
	int AND_GATE = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__INPUTS = BINARY_GATE__INPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__NAME = BINARY_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Inputport2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__INPUTPORT2 = BINARY_GATE__INPUTPORT2;

	/**
	 * The feature id for the '<em><b>Inputport1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__INPUTPORT1 = BINARY_GATE__INPUTPORT1;

	/**
	 * The feature id for the '<em><b>Outputport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE__OUTPUTPORT = BINARY_GATE__OUTPUTPORT;

	/**
	 * The number of structural features of the '<em>And Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_FEATURE_COUNT = BINARY_GATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE___EVAL = BINARY_GATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_OPERATION_COUNT = BINARY_GATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.ComplexBlockImpl <em>Complex Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.ComplexBlockImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getComplexBlock()
	 * @generated
	 */
	int COMPLEX_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BLOCK__INPUTS = BLOCK__INPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BLOCK__PORTS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BLOCK___EVAL = BLOCK___EVAL;

	/**
	 * The number of operations of the '<em>Complex Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.BlockRefImpl <em>Block Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.BlockRefImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getBlockRef()
	 * @generated
	 */
	int BLOCK_REF = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REF__INPUTS = COMPLEX_BLOCK__INPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REF__NAME = COMPLEX_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REF__PORTS = COMPLEX_BLOCK__PORTS;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REF__BLOCK = COMPLEX_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REF_FEATURE_COUNT = COMPLEX_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REF___EVAL = COMPLEX_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REF_OPERATION_COUNT = COMPLEX_BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.CompositeBlockImpl <em>Composite Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.CompositeBlockImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getCompositeBlock()
	 * @generated
	 */
	int COMPOSITE_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BLOCK__INPUTS = COMPLEX_BLOCK__INPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BLOCK__NAME = COMPLEX_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BLOCK__PORTS = COMPLEX_BLOCK__PORTS;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BLOCK__BLOCKS = COMPLEX_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BLOCK_FEATURE_COUNT = COMPLEX_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BLOCK___EVAL = COMPLEX_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Pull Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BLOCK___PULL_VALUE__PORT = COMPLEX_BLOCK_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_BLOCK_OPERATION_COUNT = COMPLEX_BLOCK_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.PortImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 10;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SRC = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 2;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__HIGH = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.InputPortImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 6;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__SRC = PORT__SRC;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__BLOCK = PORT__BLOCK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__HIGH = PORT__HIGH;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.NotGateImpl <em>Not Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.NotGateImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getNotGate()
	 * @generated
	 */
	int NOT_GATE = 7;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GATE__INPUTS = BLOCK__INPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GATE__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Outputport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GATE__OUTPUTPORT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GATE__INPUTPORT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Not Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GATE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GATE___EVAL = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_GATE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.OrGateImpl <em>Or Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.OrGateImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getOrGate()
	 * @generated
	 */
	int OR_GATE = 8;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__INPUTS = BINARY_GATE__INPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__NAME = BINARY_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Inputport2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__INPUTPORT2 = BINARY_GATE__INPUTPORT2;

	/**
	 * The feature id for the '<em><b>Inputport1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__INPUTPORT1 = BINARY_GATE__INPUTPORT1;

	/**
	 * The feature id for the '<em><b>Outputport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE__OUTPUTPORT = BINARY_GATE__OUTPUTPORT;

	/**
	 * The number of structural features of the '<em>Or Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_FEATURE_COUNT = BINARY_GATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Eval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE___EVAL = BINARY_GATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_OPERATION_COUNT = BINARY_GATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.OutputPortImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 9;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__SRC = PORT__SRC;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__BLOCK = PORT__BLOCK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__HIGH = PORT__HIGH;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.SignalImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 11;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SRC = PORT__SRC;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__BLOCK = PORT__BLOCK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__HIGH = PORT__HIGH;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VHDLModel.impl.VHDLSpecificationImpl <em>VHDL Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VHDLModel.impl.VHDLSpecificationImpl
	 * @see VHDLModel.impl.VHDLModelPackageImpl#getVHDLSpecification()
	 * @generated
	 */
	int VHDL_SPECIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SPECIFICATION__BLOCKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SPECIFICATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>VHDL Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VHDL Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHDL_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link VHDLModel.AndGate <em>And Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Gate</em>'.
	 * @see VHDLModel.AndGate
	 * @generated
	 */
	EClass getAndGate();

	/**
	 * Returns the meta object for the '{@link VHDLModel.AndGate#eval() <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see VHDLModel.AndGate#eval()
	 * @generated
	 */
	EOperation getAndGate__Eval();

	/**
	 * Returns the meta object for class '{@link VHDLModel.BinaryGate <em>Binary Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Gate</em>'.
	 * @see VHDLModel.BinaryGate
	 * @generated
	 */
	EClass getBinaryGate();

	/**
	 * Returns the meta object for the containment reference '{@link VHDLModel.BinaryGate#getInputport2 <em>Inputport2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputport2</em>'.
	 * @see VHDLModel.BinaryGate#getInputport2()
	 * @see #getBinaryGate()
	 * @generated
	 */
	EReference getBinaryGate_Inputport2();

	/**
	 * Returns the meta object for the containment reference '{@link VHDLModel.BinaryGate#getInputport1 <em>Inputport1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputport1</em>'.
	 * @see VHDLModel.BinaryGate#getInputport1()
	 * @see #getBinaryGate()
	 * @generated
	 */
	EReference getBinaryGate_Inputport1();

	/**
	 * Returns the meta object for the containment reference '{@link VHDLModel.BinaryGate#getOutputport <em>Outputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputport</em>'.
	 * @see VHDLModel.BinaryGate#getOutputport()
	 * @see #getBinaryGate()
	 * @generated
	 */
	EReference getBinaryGate_Outputport();

	/**
	 * Returns the meta object for class '{@link VHDLModel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see VHDLModel.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the reference list '{@link VHDLModel.Block#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see VHDLModel.Block#getInputs()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link VHDLModel.Block#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VHDLModel.Block#getName()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Name();

	/**
	 * Returns the meta object for the '{@link VHDLModel.Block#eval() <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see VHDLModel.Block#eval()
	 * @generated
	 */
	EOperation getBlock__Eval();

	/**
	 * Returns the meta object for class '{@link VHDLModel.BlockRef <em>Block Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Ref</em>'.
	 * @see VHDLModel.BlockRef
	 * @generated
	 */
	EClass getBlockRef();

	/**
	 * Returns the meta object for the reference '{@link VHDLModel.BlockRef#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see VHDLModel.BlockRef#getBlock()
	 * @see #getBlockRef()
	 * @generated
	 */
	EReference getBlockRef_Block();

	/**
	 * Returns the meta object for the '{@link VHDLModel.BlockRef#eval() <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see VHDLModel.BlockRef#eval()
	 * @generated
	 */
	EOperation getBlockRef__Eval();

	/**
	 * Returns the meta object for class '{@link VHDLModel.ComplexBlock <em>Complex Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Block</em>'.
	 * @see VHDLModel.ComplexBlock
	 * @generated
	 */
	EClass getComplexBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link VHDLModel.ComplexBlock#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see VHDLModel.ComplexBlock#getPorts()
	 * @see #getComplexBlock()
	 * @generated
	 */
	EReference getComplexBlock_Ports();

	/**
	 * Returns the meta object for class '{@link VHDLModel.CompositeBlock <em>Composite Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Block</em>'.
	 * @see VHDLModel.CompositeBlock
	 * @generated
	 */
	EClass getCompositeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link VHDLModel.CompositeBlock#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see VHDLModel.CompositeBlock#getBlocks()
	 * @see #getCompositeBlock()
	 * @generated
	 */
	EReference getCompositeBlock_Blocks();

	/**
	 * Returns the meta object for the '{@link VHDLModel.CompositeBlock#eval() <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see VHDLModel.CompositeBlock#eval()
	 * @generated
	 */
	EOperation getCompositeBlock__Eval();

	/**
	 * Returns the meta object for the '{@link VHDLModel.CompositeBlock#pullValue(VHDLModel.Port) <em>Pull Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pull Value</em>' operation.
	 * @see VHDLModel.CompositeBlock#pullValue(VHDLModel.Port)
	 * @generated
	 */
	EOperation getCompositeBlock__PullValue__Port();

	/**
	 * Returns the meta object for class '{@link VHDLModel.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see VHDLModel.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for class '{@link VHDLModel.NotGate <em>Not Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Gate</em>'.
	 * @see VHDLModel.NotGate
	 * @generated
	 */
	EClass getNotGate();

	/**
	 * Returns the meta object for the containment reference '{@link VHDLModel.NotGate#getOutputport <em>Outputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputport</em>'.
	 * @see VHDLModel.NotGate#getOutputport()
	 * @see #getNotGate()
	 * @generated
	 */
	EReference getNotGate_Outputport();

	/**
	 * Returns the meta object for the containment reference '{@link VHDLModel.NotGate#getInputport <em>Inputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputport</em>'.
	 * @see VHDLModel.NotGate#getInputport()
	 * @see #getNotGate()
	 * @generated
	 */
	EReference getNotGate_Inputport();

	/**
	 * Returns the meta object for the '{@link VHDLModel.NotGate#eval() <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see VHDLModel.NotGate#eval()
	 * @generated
	 */
	EOperation getNotGate__Eval();

	/**
	 * Returns the meta object for class '{@link VHDLModel.OrGate <em>Or Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Gate</em>'.
	 * @see VHDLModel.OrGate
	 * @generated
	 */
	EClass getOrGate();

	/**
	 * Returns the meta object for the '{@link VHDLModel.OrGate#eval() <em>Eval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eval</em>' operation.
	 * @see VHDLModel.OrGate#eval()
	 * @generated
	 */
	EOperation getOrGate__Eval();

	/**
	 * Returns the meta object for class '{@link VHDLModel.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see VHDLModel.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for class '{@link VHDLModel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see VHDLModel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link VHDLModel.Port#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see VHDLModel.Port#getSrc()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Src();

	/**
	 * Returns the meta object for the reference '{@link VHDLModel.Port#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see VHDLModel.Port#getBlock()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Block();

	/**
	 * Returns the meta object for the attribute '{@link VHDLModel.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VHDLModel.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link VHDLModel.Port#isHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see VHDLModel.Port#isHigh()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_High();

	/**
	 * Returns the meta object for class '{@link VHDLModel.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see VHDLModel.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for class '{@link VHDLModel.VHDLSpecification <em>VHDL Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VHDL Specification</em>'.
	 * @see VHDLModel.VHDLSpecification
	 * @generated
	 */
	EClass getVHDLSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link VHDLModel.VHDLSpecification#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see VHDLModel.VHDLSpecification#getBlocks()
	 * @see #getVHDLSpecification()
	 * @generated
	 */
	EReference getVHDLSpecification_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link VHDLModel.VHDLSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VHDLModel.VHDLSpecification#getName()
	 * @see #getVHDLSpecification()
	 * @generated
	 */
	EAttribute getVHDLSpecification_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VHDLModelFactory getVHDLModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link VHDLModel.impl.AndGateImpl <em>And Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.AndGateImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getAndGate()
		 * @generated
		 */
		EClass AND_GATE = eINSTANCE.getAndGate();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AND_GATE___EVAL = eINSTANCE.getAndGate__Eval();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.BinaryGateImpl <em>Binary Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.BinaryGateImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getBinaryGate()
		 * @generated
		 */
		EClass BINARY_GATE = eINSTANCE.getBinaryGate();

		/**
		 * The meta object literal for the '<em><b>Inputport2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_GATE__INPUTPORT2 = eINSTANCE.getBinaryGate_Inputport2();

		/**
		 * The meta object literal for the '<em><b>Inputport1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_GATE__INPUTPORT1 = eINSTANCE.getBinaryGate_Inputport1();

		/**
		 * The meta object literal for the '<em><b>Outputport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_GATE__OUTPUTPORT = eINSTANCE.getBinaryGate_Outputport();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.BlockImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INPUTS = eINSTANCE.getBlock_Inputs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___EVAL = eINSTANCE.getBlock__Eval();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.BlockRefImpl <em>Block Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.BlockRefImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getBlockRef()
		 * @generated
		 */
		EClass BLOCK_REF = eINSTANCE.getBlockRef();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_REF__BLOCK = eINSTANCE.getBlockRef_Block();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK_REF___EVAL = eINSTANCE.getBlockRef__Eval();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.ComplexBlockImpl <em>Complex Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.ComplexBlockImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getComplexBlock()
		 * @generated
		 */
		EClass COMPLEX_BLOCK = eINSTANCE.getComplexBlock();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_BLOCK__PORTS = eINSTANCE.getComplexBlock_Ports();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.CompositeBlockImpl <em>Composite Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.CompositeBlockImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getCompositeBlock()
		 * @generated
		 */
		EClass COMPOSITE_BLOCK = eINSTANCE.getCompositeBlock();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_BLOCK__BLOCKS = eINSTANCE.getCompositeBlock_Blocks();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_BLOCK___EVAL = eINSTANCE.getCompositeBlock__Eval();

		/**
		 * The meta object literal for the '<em><b>Pull Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_BLOCK___PULL_VALUE__PORT = eINSTANCE.getCompositeBlock__PullValue__Port();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.InputPortImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.NotGateImpl <em>Not Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.NotGateImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getNotGate()
		 * @generated
		 */
		EClass NOT_GATE = eINSTANCE.getNotGate();

		/**
		 * The meta object literal for the '<em><b>Outputport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_GATE__OUTPUTPORT = eINSTANCE.getNotGate_Outputport();

		/**
		 * The meta object literal for the '<em><b>Inputport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_GATE__INPUTPORT = eINSTANCE.getNotGate_Inputport();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOT_GATE___EVAL = eINSTANCE.getNotGate__Eval();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.OrGateImpl <em>Or Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.OrGateImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getOrGate()
		 * @generated
		 */
		EClass OR_GATE = eINSTANCE.getOrGate();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OR_GATE___EVAL = eINSTANCE.getOrGate__Eval();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.OutputPortImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.PortImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__SRC = eINSTANCE.getPort_Src();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BLOCK = eINSTANCE.getPort_Block();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__HIGH = eINSTANCE.getPort_High();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.SignalImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '{@link VHDLModel.impl.VHDLSpecificationImpl <em>VHDL Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VHDLModel.impl.VHDLSpecificationImpl
		 * @see VHDLModel.impl.VHDLModelPackageImpl#getVHDLSpecification()
		 * @generated
		 */
		EClass VHDL_SPECIFICATION = eINSTANCE.getVHDLSpecification();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VHDL_SPECIFICATION__BLOCKS = eINSTANCE.getVHDLSpecification_Blocks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VHDL_SPECIFICATION__NAME = eINSTANCE.getVHDLSpecification_Name();

	}

} //VHDLModelPackage
