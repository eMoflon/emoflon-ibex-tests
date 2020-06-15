/**
 */
package glossarDocumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.Document#getEntries <em>Entries</em>}</li>
 *   <li>{@link glossarDocumentation.Document#getName <em>Name</em>}</li>
 *   <li>{@link glossarDocumentation.Document#getHyperRefs <em>Hyper Refs</em>}</li>
 * </ul>
 *
 * @see glossarDocumentation.GlossarDocumentationPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link glossarDocumentation.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see glossarDocumentation.GlossarDocumentationPackage#getDocument_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see glossarDocumentation.GlossarDocumentationPackage#getDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link glossarDocumentation.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hyper Refs</b></em>' reference list.
	 * The list contents are of type {@link glossarDocumentation.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyper Refs</em>' reference list.
	 * @see glossarDocumentation.GlossarDocumentationPackage#getDocument_HyperRefs()
	 * @model
	 * @generated
	 */
	EList<Document> getHyperRefs();

} // Document
