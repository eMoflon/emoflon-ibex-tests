/**
 */
package ProcessDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProcessDefinition.Module#getSystemModule <em>System Module</em>}</li>
 *   <li>{@link ProcessDefinition.Module#getImport <em>Import</em>}</li>
 *   <li>{@link ProcessDefinition.Module#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ProcessDefinition.Module#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProcessDefinition.ProcessDefinitionPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>System Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.SystemModule#getAllModules <em>All Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Module</em>' container reference.
	 * @see #setSystemModule(SystemModule)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getModule_SystemModule()
	 * @see ProcessDefinition.SystemModule#getAllModules
	 * @model opposite="allModules" required="true" transient="false"
	 * @generated
	 */
	SystemModule getSystemModule();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Module#getSystemModule <em>System Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Module</em>' container reference.
	 * @see #getSystemModule()
	 * @generated
	 */
	void setSystemModule(SystemModule value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Import#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(Import)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getModule_Import()
	 * @see ProcessDefinition.Import#getModule
	 * @model opposite="module" required="true"
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Module#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link ProcessDefinition.Task}.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Task#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see ProcessDefinition.ProcessDefinitionPackage#getModule_Tasks()
	 * @see ProcessDefinition.Task#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getModule_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Module#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Module
