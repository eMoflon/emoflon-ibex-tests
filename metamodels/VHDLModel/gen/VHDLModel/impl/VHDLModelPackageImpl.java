/**
 */
package VHDLModel.impl;

import VHDLModel.AndGate;
import VHDLModel.BinaryGate;
import VHDLModel.Block;
import VHDLModel.BlockRef;
import VHDLModel.ComplexBlock;
import VHDLModel.CompositeBlock;
import VHDLModel.InputPort;
import VHDLModel.NotGate;
import VHDLModel.OrGate;
import VHDLModel.OutputPort;
import VHDLModel.Port;
import VHDLModel.Signal;
import VHDLModel.VHDLModelFactory;
import VHDLModel.VHDLModelPackage;
import VHDLModel.VHDLSpecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VHDLModelPackageImpl extends EPackageImpl implements VHDLModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhdlSpecificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see VHDLModel.VHDLModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VHDLModelPackageImpl() {
		super(eNS_URI, VHDLModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VHDLModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VHDLModelPackage init() {
		if (isInited)
			return (VHDLModelPackage) EPackage.Registry.INSTANCE.getEPackage(VHDLModelPackage.eNS_URI);

		// Obtain or create and register package
		VHDLModelPackageImpl theVHDLModelPackage = (VHDLModelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof VHDLModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new VHDLModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVHDLModelPackage.createPackageContents();

		// Initialize created meta-data
		theVHDLModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVHDLModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VHDLModelPackage.eNS_URI, theVHDLModelPackage);
		return theVHDLModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndGate() {
		return andGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAndGate__Eval() {
		return andGateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryGate() {
		return binaryGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryGate_Inputport2() {
		return (EReference) binaryGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryGate_Inputport1() {
		return (EReference) binaryGateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryGate_Outputport() {
		return (EReference) binaryGateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Inputs() {
		return (EReference) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Name() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__Eval() {
		return blockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockRef() {
		return blockRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockRef_Block() {
		return (EReference) blockRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlockRef__Eval() {
		return blockRefEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexBlock() {
		return complexBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexBlock_Ports() {
		return (EReference) complexBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeBlock() {
		return compositeBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeBlock_Blocks() {
		return (EReference) compositeBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeBlock__Eval() {
		return compositeBlockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeBlock__PullValue__Port() {
		return compositeBlockEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotGate() {
		return notGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotGate_Outputport() {
		return (EReference) notGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotGate_Inputport() {
		return (EReference) notGateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotGate__Eval() {
		return notGateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrGate() {
		return orGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrGate__Eval() {
		return orGateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Src() {
		return (EReference) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Block() {
		return (EReference) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_High() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHDLSpecification() {
		return vhdlSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVHDLSpecification_Blocks() {
		return (EReference) vhdlSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVHDLSpecification_Name() {
		return (EAttribute) vhdlSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHDLModelFactory getVHDLModelFactory() {
		return (VHDLModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		andGateEClass = createEClass(AND_GATE);
		createEOperation(andGateEClass, AND_GATE___EVAL);

		binaryGateEClass = createEClass(BINARY_GATE);
		createEReference(binaryGateEClass, BINARY_GATE__INPUTPORT2);
		createEReference(binaryGateEClass, BINARY_GATE__INPUTPORT1);
		createEReference(binaryGateEClass, BINARY_GATE__OUTPUTPORT);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__INPUTS);
		createEAttribute(blockEClass, BLOCK__NAME);
		createEOperation(blockEClass, BLOCK___EVAL);

		blockRefEClass = createEClass(BLOCK_REF);
		createEReference(blockRefEClass, BLOCK_REF__BLOCK);
		createEOperation(blockRefEClass, BLOCK_REF___EVAL);

		complexBlockEClass = createEClass(COMPLEX_BLOCK);
		createEReference(complexBlockEClass, COMPLEX_BLOCK__PORTS);

		compositeBlockEClass = createEClass(COMPOSITE_BLOCK);
		createEReference(compositeBlockEClass, COMPOSITE_BLOCK__BLOCKS);
		createEOperation(compositeBlockEClass, COMPOSITE_BLOCK___EVAL);
		createEOperation(compositeBlockEClass, COMPOSITE_BLOCK___PULL_VALUE__PORT);

		inputPortEClass = createEClass(INPUT_PORT);

		notGateEClass = createEClass(NOT_GATE);
		createEReference(notGateEClass, NOT_GATE__OUTPUTPORT);
		createEReference(notGateEClass, NOT_GATE__INPUTPORT);
		createEOperation(notGateEClass, NOT_GATE___EVAL);

		orGateEClass = createEClass(OR_GATE);
		createEOperation(orGateEClass, OR_GATE___EVAL);

		outputPortEClass = createEClass(OUTPUT_PORT);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__SRC);
		createEReference(portEClass, PORT__BLOCK);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__HIGH);

		signalEClass = createEClass(SIGNAL);

		vhdlSpecificationEClass = createEClass(VHDL_SPECIFICATION);
		createEReference(vhdlSpecificationEClass, VHDL_SPECIFICATION__BLOCKS);
		createEAttribute(vhdlSpecificationEClass, VHDL_SPECIFICATION__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		andGateEClass.getESuperTypes().add(this.getBinaryGate());
		binaryGateEClass.getESuperTypes().add(this.getBlock());
		blockRefEClass.getESuperTypes().add(this.getComplexBlock());
		complexBlockEClass.getESuperTypes().add(this.getBlock());
		compositeBlockEClass.getESuperTypes().add(this.getComplexBlock());
		inputPortEClass.getESuperTypes().add(this.getPort());
		notGateEClass.getESuperTypes().add(this.getBlock());
		orGateEClass.getESuperTypes().add(this.getBinaryGate());
		outputPortEClass.getESuperTypes().add(this.getPort());
		signalEClass.getESuperTypes().add(this.getPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(andGateEClass, AndGate.class, "AndGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAndGate__Eval(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(binaryGateEClass, BinaryGate.class, "BinaryGate", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryGate_Inputport2(), this.getInputPort(), null, "inputport2", null, 1, 1,
				BinaryGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryGate_Inputport1(), this.getInputPort(), null, "inputport1", null, 1, 1,
				BinaryGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryGate_Outputport(), this.getOutputPort(), null, "outputport", null, 1, 1,
				BinaryGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Inputs(), this.getInputPort(), null, "inputs", null, 0, -1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBlock_Name(), ecorePackage.getEString(), "name", null, 1, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBlock__Eval(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(blockRefEClass, BlockRef.class, "BlockRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockRef_Block(), this.getCompositeBlock(), null, "block", null, 1, 1, BlockRef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBlockRef__Eval(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(complexBlockEClass, ComplexBlock.class, "ComplexBlock", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexBlock_Ports(), this.getPort(), null, "ports", null, 0, -1, ComplexBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeBlockEClass, CompositeBlock.class, "CompositeBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeBlock_Blocks(), this.getBlock(), null, "blocks", null, 1, -1, CompositeBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompositeBlock__Eval(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getCompositeBlock__PullValue__Port(), null, "pullValue", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getPort(), "port", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(notGateEClass, NotGate.class, "NotGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotGate_Outputport(), this.getOutputPort(), null, "outputport", null, 1, 1, NotGate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotGate_Inputport(), this.getInputPort(), null, "inputport", null, 1, 1, NotGate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNotGate__Eval(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orGateEClass, OrGate.class, "OrGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOrGate__Eval(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Src(), this.getPort(), null, "src", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Block(), this.getBlock(), null, "block", null, 1, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 1, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_High(), ecorePackage.getEBoolean(), "high", null, 1, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhdlSpecificationEClass, VHDLSpecification.class, "VHDLSpecification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVHDLSpecification_Blocks(), this.getCompositeBlock(), null, "blocks", null, 0, -1,
				VHDLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVHDLSpecification_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				VHDLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VHDLModelPackageImpl
