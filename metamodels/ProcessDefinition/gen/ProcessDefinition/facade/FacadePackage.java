/**
 */
package ProcessDefinition.facade;

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
 * @see ProcessDefinition.facade.FacadeFactory
 * @model kind="package"
 * @generated
 */
public interface FacadePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "facade";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ProcessDefinition/model/ProcessDefinition.ecore#//facade";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "facade";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacadePackage eINSTANCE = ProcessDefinition.facade.impl.FacadePackageImpl.init();

	/**
	 * The meta object id for the '{@link ProcessDefinition.facade.impl.HelperImpl <em>Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProcessDefinition.facade.impl.HelperImpl
	 * @see ProcessDefinition.facade.impl.FacadePackageImpl#getHelper()
	 * @generated
	 */
	int HELPER = 0;

	/**
	 * The feature id for the '<em><b>Colored Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__COLORED_TASK = 0;

	/**
	 * The feature id for the '<em><b>Visited Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__VISITED_TASKS = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Output Cycle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___OUTPUT_CYCLE__TASK = 0;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER___PRINT__STRING = 1;

	/**
	 * The number of operations of the '<em>Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link ProcessDefinition.facade.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper</em>'.
	 * @see ProcessDefinition.facade.Helper
	 * @generated
	 */
	EClass getHelper();

	/**
	 * Returns the meta object for the reference list '{@link ProcessDefinition.facade.Helper#getColoredTask <em>Colored Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Colored Task</em>'.
	 * @see ProcessDefinition.facade.Helper#getColoredTask()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_ColoredTask();

	/**
	 * Returns the meta object for the reference list '{@link ProcessDefinition.facade.Helper#getVisitedTasks <em>Visited Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visited Tasks</em>'.
	 * @see ProcessDefinition.facade.Helper#getVisitedTasks()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_VisitedTasks();

	/**
	 * Returns the meta object for the reference list '{@link ProcessDefinition.facade.Helper#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see ProcessDefinition.facade.Helper#getTasks()
	 * @see #getHelper()
	 * @generated
	 */
	EReference getHelper_Tasks();

	/**
	 * Returns the meta object for the '{@link ProcessDefinition.facade.Helper#outputCycle(ProcessDefinition.Task) <em>Output Cycle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Cycle</em>' operation.
	 * @see ProcessDefinition.facade.Helper#outputCycle(ProcessDefinition.Task)
	 * @generated
	 */
	EOperation getHelper__OutputCycle__Task();

	/**
	 * Returns the meta object for the '{@link ProcessDefinition.facade.Helper#print(java.lang.String) <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see ProcessDefinition.facade.Helper#print(java.lang.String)
	 * @generated
	 */
	EOperation getHelper__Print__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FacadeFactory getFacadeFactory();

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
		 * The meta object literal for the '{@link ProcessDefinition.facade.impl.HelperImpl <em>Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProcessDefinition.facade.impl.HelperImpl
		 * @see ProcessDefinition.facade.impl.FacadePackageImpl#getHelper()
		 * @generated
		 */
		EClass HELPER = eINSTANCE.getHelper();

		/**
		 * The meta object literal for the '<em><b>Colored Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__COLORED_TASK = eINSTANCE.getHelper_ColoredTask();

		/**
		 * The meta object literal for the '<em><b>Visited Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__VISITED_TASKS = eINSTANCE.getHelper_VisitedTasks();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER__TASKS = eINSTANCE.getHelper_Tasks();

		/**
		 * The meta object literal for the '<em><b>Output Cycle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HELPER___OUTPUT_CYCLE__TASK = eINSTANCE.getHelper__OutputCycle__Task();

		/**
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HELPER___PRINT__STRING = eINSTANCE.getHelper__Print__String();

	}

} //FacadePackage
