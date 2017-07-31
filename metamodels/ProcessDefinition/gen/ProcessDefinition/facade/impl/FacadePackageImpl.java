/**
 */
package ProcessDefinition.facade.impl;

import ProcessDefinition.ProcessDefinitionPackage;

import ProcessDefinition.facade.FacadeFactory;
import ProcessDefinition.facade.FacadePackage;
import ProcessDefinition.facade.Helper;

import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

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
public class FacadePackageImpl extends EPackageImpl implements FacadePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperEClass = null;

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
	 * @see ProcessDefinition.facade.FacadePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FacadePackageImpl() {
		super(eNS_URI, FacadeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FacadePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FacadePackage init() {
		if (isInited)
			return (FacadePackage) EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI);

		// Obtain or create and register package
		FacadePackageImpl theFacadePackage = (FacadePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new FacadePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ProcessDefinitionPackageImpl theProcessDefinitionPackage = (ProcessDefinitionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ProcessDefinitionPackage.eNS_URI) instanceof ProcessDefinitionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ProcessDefinitionPackage.eNS_URI)
						: ProcessDefinitionPackage.eINSTANCE);

		// Create package meta-data objects
		theFacadePackage.createPackageContents();
		theProcessDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theFacadePackage.initializePackageContents();
		theProcessDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFacadePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FacadePackage.eNS_URI, theFacadePackage);
		return theFacadePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelper() {
		return helperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelper_ColoredTask() {
		return (EReference) helperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelper_VisitedTasks() {
		return (EReference) helperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelper_Tasks() {
		return (EReference) helperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHelper__OutputCycle__Task() {
		return helperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHelper__Print__String() {
		return helperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacadeFactory getFacadeFactory() {
		return (FacadeFactory) getEFactoryInstance();
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
		helperEClass = createEClass(HELPER);
		createEReference(helperEClass, HELPER__COLORED_TASK);
		createEReference(helperEClass, HELPER__VISITED_TASKS);
		createEReference(helperEClass, HELPER__TASKS);
		createEOperation(helperEClass, HELPER___OUTPUT_CYCLE__TASK);
		createEOperation(helperEClass, HELPER___PRINT__STRING);
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

		// Obtain other dependent packages
		ProcessDefinitionPackage theProcessDefinitionPackage = (ProcessDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ProcessDefinitionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(helperEClass, Helper.class, "Helper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHelper_ColoredTask(), theProcessDefinitionPackage.getTask(), null, "coloredTask", null, 0, -1,
				Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelper_VisitedTasks(), theProcessDefinitionPackage.getTask(), null, "visitedTasks", null, 0,
				-1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelper_Tasks(), theProcessDefinitionPackage.getTask(), null, "tasks", null, 0, -1,
				Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getHelper__OutputCycle__Task(), null, "outputCycle", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theProcessDefinitionPackage.getTask(), "currentTask", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHelper__Print__String(), null, "print", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //FacadePackageImpl
