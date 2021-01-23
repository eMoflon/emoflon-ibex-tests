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
 *   <li>{@link ExtDocModel.GlossaryEntry#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link ExtDocModel.GlossaryEntry#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getGlossaryEntry()
 * @model
 * @generated
 */
public interface GlossaryEntry extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Glossary#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary</em>' container reference.
	 * @see #setGlossary(Glossary)
	 * @see ExtDocModel.ExtDocModelPackage#getGlossaryEntry_Glossary()
	 * @see ExtDocModel.Glossary#getEntries
	 * @model opposite="entries" transient="false"
	 * @generated
	 */
	Glossary getGlossary();

	/**
	 * Sets the value of the '{@link ExtDocModel.GlossaryEntry#getGlossary <em>Glossary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossary</em>' container reference.
	 * @see #getGlossary()
	 * @generated
	 */
	void setGlossary(Glossary value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' reference list.
	 * The list contents are of type {@link ExtDocModel.Entry}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Entry#getGlossaryEntries <em>Glossary Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getGlossaryEntry_Entries()
	 * @see ExtDocModel.Entry#getGlossaryEntries
	 * @model opposite="glossaryEntries"
	 * @generated
	 */
	EList<Entry> getEntries();

} // GlossaryEntry
