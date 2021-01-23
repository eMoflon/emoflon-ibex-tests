/**
 */
package ExtDocModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.Glossary#getEntries <em>Entries</em>}</li>
 *   <li>{@link ExtDocModel.Glossary#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getGlossary()
 * @model
 * @generated
 */
public interface Glossary extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link ExtDocModel.GlossaryEntry}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.GlossaryEntry#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getGlossary_Entries()
	 * @see ExtDocModel.GlossaryEntry#getGlossary
	 * @model opposite="glossary" containment="true"
	 * @generated
	 */
	EList<GlossaryEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.DocContainer#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(DocContainer)
	 * @see ExtDocModel.ExtDocModelPackage#getGlossary_Container()
	 * @see ExtDocModel.DocContainer#getGlossary
	 * @model opposite="glossary" transient="false"
	 * @generated
	 */
	DocContainer getContainer();

	/**
	 * Sets the value of the '{@link ExtDocModel.Glossary#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DocContainer value);

} // Glossary
