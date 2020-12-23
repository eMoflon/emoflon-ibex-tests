/**
 */
package ExtDocModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.GlossaryEntry#getGlossar <em>Glossar</em>}</li>
 *   <li>{@link ExtDocModel.GlossaryEntry#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getGlossaryEntry()
 * @model
 * @generated
 */
public interface GlossaryEntry extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Glossar</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Glossary#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossar</em>' container reference.
	 * @see #setGlossar(Glossary)
	 * @see ExtDocModel.ExtDocModelPackage#getGlossaryEntry_Glossar()
	 * @see ExtDocModel.Glossary#getEntries
	 * @model opposite="entries" transient="false"
	 * @generated
	 */
	Glossary getGlossar();

	/**
	 * Sets the value of the '{@link ExtDocModel.GlossaryEntry#getGlossar <em>Glossar</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossar</em>' container reference.
	 * @see #getGlossar()
	 * @generated
	 */
	void setGlossar(Glossary value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' reference list.
	 * The list contents are of type {@link ExtDocModel.Entry}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Entry#getGlossarEntries <em>Glossar Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getGlossaryEntry_Entries()
	 * @see ExtDocModel.Entry#getGlossarEntries
	 * @model opposite="glossarEntries"
	 * @generated
	 */
	EList<Entry> getEntries();

} // GlossaryEntry
