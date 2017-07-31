/**
 */
package ProcessDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ProcessDefinition.ProcessDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProcessDefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ProcessDefinition/model/ProcessDefinition.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProcessDefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessDefinitionPackage eINSTANCE = ProcessDefinition.impl.ProcessDefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ProcessDefinition.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProcessDefinition.impl.ImportImpl
	 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Importing Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTING_TASK = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__MODULE = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProcessDefinition.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProcessDefinition.impl.InvocationImpl
	 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__TASK = 0;

	/**
	 * The feature id for the '<em><b>Invoked Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__INVOKED_TASK = 1;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProcessDefinition.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProcessDefinition.impl.ModuleImpl
	 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>System Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SYSTEM_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TASKS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProcessDefinition.impl.SystemModuleImpl <em>System Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProcessDefinition.impl.SystemModuleImpl
	 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getSystemModule()
	 * @generated
	 */
	int SYSTEM_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODULE__HELPER = 0;

	/**
	 * The feature id for the '<em><b>All Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODULE__ALL_TASKS = 1;

	/**
	 * The feature id for the '<em><b>All Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODULE__ALL_MODULES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODULE__NAME = 3;

	/**
	 * The number of structural features of the '<em>System Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProcessDefinition.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProcessDefinition.impl.TaskImpl
	 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>System Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SYSTEM_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MODULE = 1;

	/**
	 * The feature id for the '<em><b>Invocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INVOCATION = 2;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INVOCATIONS = 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPORTS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link ProcessDefinition.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see ProcessDefinition.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the container reference '{@link ProcessDefinition.Import#getImportingTask <em>Importing Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importing Task</em>'.
	 * @see ProcessDefinition.Import#getImportingTask()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ImportingTask();

	/**
	 * Returns the meta object for the reference '{@link ProcessDefinition.Import#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see ProcessDefinition.Import#getModule()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Module();

	/**
	 * Returns the meta object for class '{@link ProcessDefinition.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see ProcessDefinition.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the container reference '{@link ProcessDefinition.Invocation#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Task</em>'.
	 * @see ProcessDefinition.Invocation#getTask()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_Task();

	/**
	 * Returns the meta object for the reference '{@link ProcessDefinition.Invocation#getInvokedTask <em>Invoked Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked Task</em>'.
	 * @see ProcessDefinition.Invocation#getInvokedTask()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_InvokedTask();

	/**
	 * Returns the meta object for class '{@link ProcessDefinition.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see ProcessDefinition.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the container reference '{@link ProcessDefinition.Module#getSystemModule <em>System Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System Module</em>'.
	 * @see ProcessDefinition.Module#getSystemModule()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_SystemModule();

	/**
	 * Returns the meta object for the reference '{@link ProcessDefinition.Module#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see ProcessDefinition.Module#getImport()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link ProcessDefinition.Module#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see ProcessDefinition.Module#getTasks()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link ProcessDefinition.Module#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ProcessDefinition.Module#getDescription()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Description();

	/**
	 * Returns the meta object for class '{@link ProcessDefinition.SystemModule <em>System Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Module</em>'.
	 * @see ProcessDefinition.SystemModule
	 * @generated
	 */
	EClass getSystemModule();

	/**
	 * Returns the meta object for the containment reference '{@link ProcessDefinition.SystemModule#getHelper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Helper</em>'.
	 * @see ProcessDefinition.SystemModule#getHelper()
	 * @see #getSystemModule()
	 * @generated
	 */
	EReference getSystemModule_Helper();

	/**
	 * Returns the meta object for the reference list '{@link ProcessDefinition.SystemModule#getAllTasks <em>All Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Tasks</em>'.
	 * @see ProcessDefinition.SystemModule#getAllTasks()
	 * @see #getSystemModule()
	 * @generated
	 */
	EReference getSystemModule_AllTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link ProcessDefinition.SystemModule#getAllModules <em>All Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Modules</em>'.
	 * @see ProcessDefinition.SystemModule#getAllModules()
	 * @see #getSystemModule()
	 * @generated
	 */
	EReference getSystemModule_AllModules();

	/**
	 * Returns the meta object for the attribute '{@link ProcessDefinition.SystemModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ProcessDefinition.SystemModule#getName()
	 * @see #getSystemModule()
	 * @generated
	 */
	EAttribute getSystemModule_Name();

	/**
	 * Returns the meta object for class '{@link ProcessDefinition.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see ProcessDefinition.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link ProcessDefinition.Task#getSystemModule <em>System Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Module</em>'.
	 * @see ProcessDefinition.Task#getSystemModule()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_SystemModule();

	/**
	 * Returns the meta object for the container reference '{@link ProcessDefinition.Task#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see ProcessDefinition.Task#getModule()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Module();

	/**
	 * Returns the meta object for the reference list '{@link ProcessDefinition.Task#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invocation</em>'.
	 * @see ProcessDefinition.Task#getInvocation()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Invocation();

	/**
	 * Returns the meta object for the containment reference list '{@link ProcessDefinition.Task#getInvocations <em>Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invocations</em>'.
	 * @see ProcessDefinition.Task#getInvocations()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Invocations();

	/**
	 * Returns the meta object for the containment reference list '{@link ProcessDefinition.Task#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see ProcessDefinition.Task#getImports()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Imports();

	/**
	 * Returns the meta object for the attribute '{@link ProcessDefinition.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ProcessDefinition.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessDefinitionFactory getProcessDefinitionFactory();

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
		 * The meta object literal for the '{@link ProcessDefinition.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProcessDefinition.impl.ImportImpl
		 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Importing Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORTING_TASK = eINSTANCE.getImport_ImportingTask();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__MODULE = eINSTANCE.getImport_Module();

		/**
		 * The meta object literal for the '{@link ProcessDefinition.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProcessDefinition.impl.InvocationImpl
		 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getInvocation()
		 * @generated
		 */
		EClass INVOCATION = eINSTANCE.getInvocation();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__TASK = eINSTANCE.getInvocation_Task();

		/**
		 * The meta object literal for the '<em><b>Invoked Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__INVOKED_TASK = eINSTANCE.getInvocation_InvokedTask();

		/**
		 * The meta object literal for the '{@link ProcessDefinition.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProcessDefinition.impl.ModuleImpl
		 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>System Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SYSTEM_MODULE = eINSTANCE.getModule_SystemModule();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__IMPORT = eINSTANCE.getModule_Import();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__TASKS = eINSTANCE.getModule_Tasks();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__DESCRIPTION = eINSTANCE.getModule_Description();

		/**
		 * The meta object literal for the '{@link ProcessDefinition.impl.SystemModuleImpl <em>System Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProcessDefinition.impl.SystemModuleImpl
		 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getSystemModule()
		 * @generated
		 */
		EClass SYSTEM_MODULE = eINSTANCE.getSystemModule();

		/**
		 * The meta object literal for the '<em><b>Helper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODULE__HELPER = eINSTANCE.getSystemModule_Helper();

		/**
		 * The meta object literal for the '<em><b>All Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODULE__ALL_TASKS = eINSTANCE.getSystemModule_AllTasks();

		/**
		 * The meta object literal for the '<em><b>All Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODULE__ALL_MODULES = eINSTANCE.getSystemModule_AllModules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_MODULE__NAME = eINSTANCE.getSystemModule_Name();

		/**
		 * The meta object literal for the '{@link ProcessDefinition.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProcessDefinition.impl.TaskImpl
		 * @see ProcessDefinition.impl.ProcessDefinitionPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>System Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SYSTEM_MODULE = eINSTANCE.getTask_SystemModule();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__MODULE = eINSTANCE.getTask_Module();

		/**
		 * The meta object literal for the '<em><b>Invocation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INVOCATION = eINSTANCE.getTask_Invocation();

		/**
		 * The meta object literal for the '<em><b>Invocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INVOCATIONS = eINSTANCE.getTask_Invocations();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IMPORTS = eINSTANCE.getTask_Imports();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

	}

} //ProcessDefinitionPackage
