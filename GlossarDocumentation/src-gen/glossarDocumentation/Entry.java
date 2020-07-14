/**
 */
package glossarDocumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.Entry#getType <em>Type</em>}</li>
 *   <li>{@link glossarDocumentation.Entry#getGlossarentries <em>Glossarentries</em>}</li>
 *   <li>{@link glossarDocumentation.Entry#getName <em>Name</em>}</li>
 *   <li>{@link glossarDocumentation.Entry#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see glossarDocumentation.GlossarDocumentationPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link glossarDocumentation.EntryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see glossarDocumentation.EntryType
	 * @see #setType(EntryType)
	 * @see glossarDocumentation.GlossarDocumentationPackage#getEntry_Type()
	 * @model
	 * @generated
	 */
	EntryType getType();

	/**
	 * Sets the value of the '{@link glossarDocumentation.Entry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see glossarDocumentation.EntryType
	 * @see #getType()
	 * @generated
	 */
	void setType(EntryType value);

	/**
	 * Returns the value of the '<em><b>Glossarentries</b></em>' reference list.
	 * The list contents are of type {@link glossarDocumentation.GlossarEntry}.
	 * It is bidirectional and its opposite is '{@link glossarDocumentation.GlossarEntry#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossarentries</em>' reference list.
	 * @see glossarDocumentation.GlossarDocumentationPackage#getEntry_Glossarentries()
	 * @see glossarDocumentation.GlossarEntry#getEntries
	 * @model opposite="entries"
	 * @generated
	 */
	EList<GlossarEntry> getGlossarentries();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see glossarDocumentation.GlossarDocumentationPackage#getEntry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link glossarDocumentation.Entry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link glossarDocumentation.Document#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(Document)
	 * @see glossarDocumentation.GlossarDocumentationPackage#getEntry_Document()
	 * @see glossarDocumentation.Document#getEntries
	 * @model opposite="entries" transient="false"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link glossarDocumentation.Entry#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

} // Entry
