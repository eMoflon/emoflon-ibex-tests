/**
 */
package ExtDocModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.Entry#getDoc <em>Doc</em>}</li>
 *   <li>{@link ExtDocModel.Entry#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ExtDocModel.Entry#getGlossaryEntries <em>Glossary Entries</em>}</li>
 *   <li>{@link ExtDocModel.Entry#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Doc#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' container reference.
	 * @see #setDoc(Doc)
	 * @see ExtDocModel.ExtDocModelPackage#getEntry_Doc()
	 * @see ExtDocModel.Doc#getEntries
	 * @model opposite="entries" transient="false"
	 * @generated
	 */
	Doc getDoc();

	/**
	 * Sets the value of the '{@link ExtDocModel.Entry#getDoc <em>Doc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' container reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(Doc value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Annotation#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see ExtDocModel.ExtDocModelPackage#getEntry_Annotation()
	 * @see ExtDocModel.Annotation#getEntry
	 * @model opposite="entry" containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link ExtDocModel.Entry#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Glossary Entries</b></em>' reference list.
	 * The list contents are of type {@link ExtDocModel.GlossaryEntry}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.GlossaryEntry#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary Entries</em>' reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getEntry_GlossaryEntries()
	 * @see ExtDocModel.GlossaryEntry#getEntries
	 * @model opposite="entries"
	 * @generated
	 */
	EList<GlossaryEntry> getGlossaryEntries();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ExtDocModel.EntryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ExtDocModel.EntryType
	 * @see #setType(EntryType)
	 * @see ExtDocModel.ExtDocModelPackage#getEntry_Type()
	 * @model
	 * @generated
	 */
	EntryType getType();

	/**
	 * Sets the value of the '{@link ExtDocModel.Entry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ExtDocModel.EntryType
	 * @see #getType()
	 * @generated
	 */
	void setType(EntryType value);

} // Entry
