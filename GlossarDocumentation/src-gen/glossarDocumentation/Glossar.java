/**
 */
package glossarDocumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.Glossar#getEntries <em>Entries</em>}</li>
 *   <li>{@link glossarDocumentation.Glossar#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossar()
 * @model
 * @generated
 */
public interface Glossar extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link glossarDocumentation.DocumentationContainer#getGlossar <em>Glossar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(DocumentationContainer)
	 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossar_Container()
	 * @see glossarDocumentation.DocumentationContainer#getGlossar
	 * @model opposite="glossar" transient="false"
	 * @generated
	 */
	DocumentationContainer getContainer();

	/**
	 * Sets the value of the '{@link glossarDocumentation.Glossar#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DocumentationContainer value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link glossarDocumentation.GlossarEntry}.
	 * It is bidirectional and its opposite is '{@link glossarDocumentation.GlossarEntry#getGlossar <em>Glossar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossar_Entries()
	 * @see glossarDocumentation.GlossarEntry#getGlossar
	 * @model opposite="glossar" containment="true"
	 * @generated
	 */
	EList<GlossarEntry> getEntries();

} // Glossar
