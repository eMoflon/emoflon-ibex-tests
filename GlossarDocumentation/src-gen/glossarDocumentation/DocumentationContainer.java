/**
 */
package glossarDocumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.DocumentationContainer#getDocuments <em>Documents</em>}</li>
 *   <li>{@link glossarDocumentation.DocumentationContainer#getGlossar <em>Glossar</em>}</li>
 * </ul>
 *
 * @see glossarDocumentation.GlossarDocumentationPackage#getDocumentationContainer()
 * @model
 * @generated
 */
public interface DocumentationContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link glossarDocumentation.Document}.
	 * It is bidirectional and its opposite is '{@link glossarDocumentation.Document#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see glossarDocumentation.GlossarDocumentationPackage#getDocumentationContainer_Documents()
	 * @see glossarDocumentation.Document#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Document> getDocuments();

	/**
	 * Returns the value of the '<em><b>Glossar</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link glossarDocumentation.Glossar#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossar</em>' containment reference.
	 * @see #setGlossar(Glossar)
	 * @see glossarDocumentation.GlossarDocumentationPackage#getDocumentationContainer_Glossar()
	 * @see glossarDocumentation.Glossar#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	Glossar getGlossar();

	/**
	 * Sets the value of the '{@link glossarDocumentation.DocumentationContainer#getGlossar <em>Glossar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossar</em>' containment reference.
	 * @see #getGlossar()
	 * @generated
	 */
	void setGlossar(Glossar value);

} // DocumentationContainer
