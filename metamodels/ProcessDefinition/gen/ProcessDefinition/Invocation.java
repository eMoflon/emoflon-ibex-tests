/**
 */
package ProcessDefinition;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProcessDefinition.Invocation#getTask <em>Task</em>}</li>
 *   <li>{@link ProcessDefinition.Invocation#getInvokedTask <em>Invoked Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProcessDefinition.ProcessDefinitionPackage#getInvocation()
 * @model
 * @generated
 */
public interface Invocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Task#getInvocations <em>Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getInvocation_Task()
	 * @see ProcessDefinition.Task#getInvocations
	 * @model opposite="invocations" required="true" transient="false"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Invocation#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Invoked Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Task#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked Task</em>' reference.
	 * @see #setInvokedTask(Task)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getInvocation_InvokedTask()
	 * @see ProcessDefinition.Task#getInvocation
	 * @model opposite="invocation" required="true"
	 * @generated
	 */
	Task getInvokedTask();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Invocation#getInvokedTask <em>Invoked Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked Task</em>' reference.
	 * @see #getInvokedTask()
	 * @generated
	 */
	void setInvokedTask(Task value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Invocation
