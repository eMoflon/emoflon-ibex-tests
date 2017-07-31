/**
 */
package ProcessDefinition.impl;

import ProcessDefinition.Import;
import ProcessDefinition.Invocation;
import ProcessDefinition.Module;
import ProcessDefinition.ProcessDefinitionFactory;
import ProcessDefinition.ProcessDefinitionPackage;
import ProcessDefinition.SystemModule;
import ProcessDefinition.Task;

import ProcessDefinition.facade.FacadePackage;

import ProcessDefinition.facade.impl.FacadePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessDefinitionPackageImpl extends EPackageImpl implements ProcessDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

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
	 * @see ProcessDefinition.ProcessDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessDefinitionPackageImpl() {
		super(eNS_URI, ProcessDefinitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProcessDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessDefinitionPackage init() {
		if (isInited)
			return (ProcessDefinitionPackage) EPackage.Registry.INSTANCE.getEPackage(ProcessDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		ProcessDefinitionPackageImpl theProcessDefinitionPackage = (ProcessDefinitionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ProcessDefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ProcessDefinitionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FacadePackageImpl theFacadePackage = (FacadePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FacadePackage.eNS_URI) instanceof FacadePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) : FacadePackage.eINSTANCE);

		// Create package meta-data objects
		theProcessDefinitionPackage.createPackageContents();
		theFacadePackage.createPackageContents();

		// Initialize created meta-data
		theProcessDefinitionPackage.initializePackageContents();
		theFacadePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessDefinitionPackage.eNS_URI, theProcessDefinitionPackage);
		return theProcessDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_ImportingTask() {
		return (EReference) importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_Module() {
		return (EReference) importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocation() {
		return invocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_Task() {
		return (EReference) invocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocation_InvokedTask() {
		return (EReference) invocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_SystemModule() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Import() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Tasks() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Description() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemModule() {
		return systemModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemModule_Helper() {
		return (EReference) systemModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemModule_AllTasks() {
		return (EReference) systemModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemModule_AllModules() {
		return (EReference) systemModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemModule_Name() {
		return (EAttribute) systemModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_SystemModule() {
		return (EReference) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Module() {
		return (EReference) taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Invocation() {
		return (EReference) taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Invocations() {
		return (EReference) taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Imports() {
		return (EReference) taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDefinitionFactory getProcessDefinitionFactory() {
		return (ProcessDefinitionFactory) getEFactoryInstance();
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
		importEClass = createEClass(IMPORT);
		createEReference(importEClass, IMPORT__IMPORTING_TASK);
		createEReference(importEClass, IMPORT__MODULE);

		invocationEClass = createEClass(INVOCATION);
		createEReference(invocationEClass, INVOCATION__TASK);
		createEReference(invocationEClass, INVOCATION__INVOKED_TASK);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__SYSTEM_MODULE);
		createEReference(moduleEClass, MODULE__IMPORT);
		createEReference(moduleEClass, MODULE__TASKS);
		createEAttribute(moduleEClass, MODULE__DESCRIPTION);

		systemModuleEClass = createEClass(SYSTEM_MODULE);
		createEReference(systemModuleEClass, SYSTEM_MODULE__HELPER);
		createEReference(systemModuleEClass, SYSTEM_MODULE__ALL_TASKS);
		createEReference(systemModuleEClass, SYSTEM_MODULE__ALL_MODULES);
		createEAttribute(systemModuleEClass, SYSTEM_MODULE__NAME);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__SYSTEM_MODULE);
		createEReference(taskEClass, TASK__MODULE);
		createEReference(taskEClass, TASK__INVOCATION);
		createEReference(taskEClass, TASK__INVOCATIONS);
		createEReference(taskEClass, TASK__IMPORTS);
		createEAttribute(taskEClass, TASK__ID);
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
		FacadePackage theFacadePackage = (FacadePackage) EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFacadePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImport_ImportingTask(), this.getTask(), this.getTask_Imports(), "importingTask", null, 1, 1,
				Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImport_Module(), this.getModule(), this.getModule_Import(), "module", null, 1, 1,
				Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invocationEClass, Invocation.class, "Invocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocation_Task(), this.getTask(), this.getTask_Invocations(), "task", null, 1, 1,
				Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvocation_InvokedTask(), this.getTask(), this.getTask_Invocation(), "invokedTask", null, 1,
				1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_SystemModule(), this.getSystemModule(), this.getSystemModule_AllModules(),
				"systemModule", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Import(), this.getImport(), this.getImport_Module(), "import", null, 1, 1,
				Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Tasks(), this.getTask(), this.getTask_Module(), "tasks", null, 0, -1, Module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Description(), ecorePackage.getEString(), "description", null, 1, 1, Module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(systemModuleEClass, SystemModule.class, "SystemModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemModule_Helper(), theFacadePackage.getHelper(), null, "helper", null, 1, 1,
				SystemModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemModule_AllTasks(), this.getTask(), this.getTask_SystemModule(), "allTasks", null, 0, -1,
				SystemModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemModule_AllModules(), this.getModule(), this.getModule_SystemModule(), "allModules",
				null, 0, -1, SystemModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemModule_Name(), ecorePackage.getEString(), "name", null, 1, 1, SystemModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_SystemModule(), this.getSystemModule(), this.getSystemModule_AllTasks(), "systemModule",
				null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Module(), this.getModule(), this.getModule_Tasks(), "module", null, 1, 1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Invocation(), this.getInvocation(), this.getInvocation_InvokedTask(), "invocation", null,
				0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Invocations(), this.getInvocation(), this.getInvocation_Task(), "invocations", null, 0,
				-1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Imports(), this.getImport(), this.getImport_ImportingTask(), "imports", null, 0, -1,
				Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Id(), ecorePackage.getEString(), "id", null, 1, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProcessDefinitionPackageImpl
