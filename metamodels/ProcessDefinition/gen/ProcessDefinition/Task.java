/**
 */
package ProcessDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProcessDefinition.Task#getSystemModule <em>System Module</em>}</li>
 *   <li>{@link ProcessDefinition.Task#getModule <em>Module</em>}</li>
 *   <li>{@link ProcessDefinition.Task#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link ProcessDefinition.Task#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link ProcessDefinition.Task#getImports <em>Imports</em>}</li>
 *   <li>{@link ProcessDefinition.Task#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProcessDefinition.ProcessDefinitionPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>System Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.SystemModule#getAllTasks <em>All Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Module</em>' reference.
	 * @see #setSystemModule(SystemModule)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getTask_SystemModule()
	 * @see ProcessDefinition.SystemModule#getAllTasks
	 * @model opposite="allTasks" required="true"
	 * @generated
	 */
	SystemModule getSystemModule();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Task#getSystemModule <em>System Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Module</em>' reference.
	 * @see #getSystemModule()
	 * @generated
	 */
	void setSystemModule(SystemModule value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Module#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getTask_Module()
	 * @see ProcessDefinition.Module#getTasks
	 * @model opposite="tasks" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Task#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Invocation</b></em>' reference list.
	 * The list contents are of type {@link ProcessDefinition.Invocation}.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Invocation#getInvokedTask <em>Invoked Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation</em>' reference list.
	 * @see ProcessDefinition.ProcessDefinitionPackage#getTask_Invocation()
	 * @see ProcessDefinition.Invocation#getInvokedTask
	 * @model opposite="invokedTask"
	 * @generated
	 */
	EList<Invocation> getInvocation();

	/**
	 * Returns the value of the '<em><b>Invocations</b></em>' containment reference list.
	 * The list contents are of type {@link ProcessDefinition.Invocation}.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Invocation#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocations</em>' containment reference list.
	 * @see ProcessDefinition.ProcessDefinitionPackage#getTask_Invocations()
	 * @see ProcessDefinition.Invocation#getTask
	 * @model opposite="task" containment="true"
	 * @generated
	 */
	EList<Invocation> getInvocations();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link ProcessDefinition.Import}.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Import#getImportingTask <em>Importing Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see ProcessDefinition.ProcessDefinitionPackage#getTask_Imports()
	 * @see ProcessDefinition.Import#getImportingTask
	 * @model opposite="importingTask" containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getTask_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Task#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Task
