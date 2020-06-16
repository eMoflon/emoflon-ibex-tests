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
 * </ul>
 *
 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossar()
 * @model
 * @generated
 */
public interface Glossar extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link glossarDocumentation.GlossarEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossar_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlossarEntry> getEntries();

} // Glossar