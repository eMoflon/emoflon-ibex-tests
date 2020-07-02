/**
 */
package glossarDocumentation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossar Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.GlossarEntry#getValue <em>Value</em>}</li>
 *   <li>{@link glossarDocumentation.GlossarEntry#getGlossar <em>Glossar</em>}</li>
 *   <li>{@link glossarDocumentation.GlossarEntry#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossarEntry()
 * @model
 * @generated
 */
public interface GlossarEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossarEntry_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link glossarDocumentation.GlossarEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Glossar</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link glossarDocumentation.Glossar#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossar</em>' container reference.
	 * @see #setGlossar(Glossar)
	 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossarEntry_Glossar()
	 * @see glossarDocumentation.Glossar#getEntries
	 * @model opposite="entries" transient="false"
	 * @generated
	 */
	Glossar getGlossar();

	/**
	 * Sets the value of the '{@link glossarDocumentation.GlossarEntry#getGlossar <em>Glossar</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossar</em>' container reference.
	 * @see #getGlossar()
	 * @generated
	 */
	void setGlossar(Glossar value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' reference list.
	 * The list contents are of type {@link glossarDocumentation.Entry}.
	 * It is bidirectional and its opposite is '{@link glossarDocumentation.Entry#getGlossarentries <em>Glossarentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' reference list.
	 * @see glossarDocumentation.GlossarDocumentationPackage#getGlossarEntry_Entries()
	 * @see glossarDocumentation.Entry#getGlossarentries
	 * @model opposite="glossarentries"
	 * @generated
	 */
	EList<Entry> getEntries();

} // GlossarEntry
