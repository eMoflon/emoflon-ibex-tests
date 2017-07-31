/**
 */
package ProcessDefinition;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ProcessDefinition.Import#getImportingTask <em>Importing Task</em>}</li>
 *   <li>{@link ProcessDefinition.Import#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see ProcessDefinition.ProcessDefinitionPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Importing Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Task#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Task</em>' container reference.
	 * @see #setImportingTask(Task)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getImport_ImportingTask()
	 * @see ProcessDefinition.Task#getImports
	 * @model opposite="imports" required="true" transient="false"
	 * @generated
	 */
	Task getImportingTask();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Import#getImportingTask <em>Importing Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Task</em>' container reference.
	 * @see #getImportingTask()
	 * @generated
	 */
	void setImportingTask(Task value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ProcessDefinition.Module#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(Module)
	 * @see ProcessDefinition.ProcessDefinitionPackage#getImport_Module()
	 * @see ProcessDefinition.Module#getImport
	 * @model opposite="import" required="true"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link ProcessDefinition.Import#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Import
