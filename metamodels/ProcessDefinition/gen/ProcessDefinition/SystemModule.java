/**
 */
package ProcessDefinition;

import ProcessDefinition.facade.Helper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProcessDefinition.SystemModule#getHelper <em>Helper</em>}</li>
 *   <li>{@link ProcessDefinition.SystemModule#getAllTasks <em>All Tasks</em>}</li>
 *   <li>{@link ProcessDefinition.SystemModule#getAllModules <em>All Modules</em>}</li>
 *   <li>{@link ProcessDefinition.SystemModule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProcessDefinition.ProcessDefinitionPackage#getSystemModule()
 * @model
 * @generated
 */
public interface SystemModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper</em>' containment reference.
	 * @see #setHelper(Helper)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getSystemModule_Helper()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Helper getHelper();

	/**
	 * Sets the value of the '{@link ProcessDefinition.SystemModule#getHelper <em>Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper</em>' containment reference.
	 * @see #getHelper()
	 * @generated
	 */
	void setHelper(Helper value);

	/**
	 * Returns the value of the '<em><b>All Tasks</b></em>' reference list.
	 * The list contents are of type {@link ProcessDefinition.Task}.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Task#getSystemModule <em>System Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Tasks</em>' reference list.
	 * @see ProcessDefinition.ProcessDefinitionPackage#getSystemModule_AllTasks()
	 * @see ProcessDefinition.Task#getSystemModule
	 * @model opposite="systemModule"
	 * @generated
	 */
	EList<Task> getAllTasks();

	/**
	 * Returns the value of the '<em><b>All Modules</b></em>' containment reference list.
	 * The list contents are of type {@link ProcessDefinition.Module}.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Module#getSystemModule <em>System Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Modules</em>' containment reference list.
	 * @see ProcessDefinition.ProcessDefinitionPackage#getSystemModule_AllModules()
	 * @see ProcessDefinition.Module#getSystemModule
	 * @model opposite="systemModule" containment="true"
	 * @generated
	 */
	EList<Module> getAllModules();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getSystemModule_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ProcessDefinition.SystemModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SystemModule
