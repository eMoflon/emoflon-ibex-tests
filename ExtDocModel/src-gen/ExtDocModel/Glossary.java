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
	 * It is bidirectional and its opposite is '{@link ExtDocModel.GlossaryEntry#getGlossar <em>Glossar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getGlossary_Entries()
	 * @see ExtDocModel.GlossaryEntry#getGlossar
	 * @model opposite="glossar" containment="true"
	 * @generated
	 */
	EList<GlossaryEntry> getEntries();

} // Glossary
