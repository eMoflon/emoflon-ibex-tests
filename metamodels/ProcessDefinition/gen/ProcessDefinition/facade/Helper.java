/**
 */
package ProcessDefinition.facade;

import ProcessDefinition.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProcessDefinition.facade.Helper#getColoredTask <em>Colored Task</em>}</li>
 *   <li>{@link ProcessDefinition.facade.Helper#getVisitedTasks <em>Visited Tasks</em>}</li>
 *   <li>{@link ProcessDefinition.facade.Helper#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProcessDefinition.facade.FacadePackage#getHelper()
 * @model
 * @generated
 */
public interface Helper extends EObject {
	/**
	 * Returns the value of the '<em><b>Colored Task</b></em>' reference list.
	 * The list contents are of type {@link ProcessDefinition.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colored Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colored Task</em>' reference list.
	 * @see ProcessDefinition.facade.FacadePackage#getHelper_ColoredTask()
	 * @model
	 * @generated
	 */
	EList<Task> getColoredTask();

	/**
	 * Returns the value of the '<em><b>Visited Tasks</b></em>' reference list.
	 * The list contents are of type {@link ProcessDefinition.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visited Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visited Tasks</em>' reference list.
	 * @see ProcessDefinition.facade.FacadePackage#getHelper_VisitedTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getVisitedTasks();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link ProcessDefinition.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see ProcessDefinition.facade.FacadePackage#getHelper_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void outputCycle(Task currentTask);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void print(String message);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Helper
