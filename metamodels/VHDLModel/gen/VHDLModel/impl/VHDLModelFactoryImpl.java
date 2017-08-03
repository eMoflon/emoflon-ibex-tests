/**
 */
package VHDLModel.impl;

import VHDLModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VHDLModelFactoryImpl extends EFactoryImpl implements VHDLModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VHDLModelFactory init() {
		try {
			VHDLModelFactory theVHDLModelFactory = (VHDLModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(VHDLModelPackage.eNS_URI);
			if (theVHDLModelFactory != null) {
				return theVHDLModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VHDLModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VHDLModelPackage.AND_GATE:
			return createAndGate();
		case VHDLModelPackage.BLOCK_REF:
			return createBlockRef();
		case VHDLModelPackage.COMPOSITE_BLOCK:
			return createCompositeBlock();
		case VHDLModelPackage.INPUT_PORT:
			return createInputPort();
		case VHDLModelPackage.NOT_GATE:
			return createNotGate();
		case VHDLModelPackage.OR_GATE:
			return createOrGate();
		case VHDLModelPackage.OUTPUT_PORT:
			return createOutputPort();
		case VHDLModelPackage.SIGNAL:
			return createSignal();
		case VHDLModelPackage.VHDL_SPECIFICATION:
			return createVHDLSpecification();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndGate createAndGate() {
		AndGateImpl andGate = new AndGateImpl();
		return andGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockRef createBlockRef() {
		BlockRefImpl blockRef = new BlockRefImpl();
		return blockRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeBlock createCompositeBlock() {
		CompositeBlockImpl compositeBlock = new CompositeBlockImpl();
		return compositeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotGate createNotGate() {
		NotGateImpl notGate = new NotGateImpl();
		return notGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrGate createOrGate() {
		OrGateImpl orGate = new OrGateImpl();
		return orGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLSpecification createVHDLSpecification() {
		VHDLSpecificationImpl vhdlSpecification = new VHDLSpecificationImpl();
		return vhdlSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLModelPackage getVHDLModelPackage() {
		return (VHDLModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VHDLModelPackage getPackage() {
		return VHDLModelPackage.eINSTANCE;
	}

} //VHDLModelFactoryImpl
