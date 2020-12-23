/**
 */
package ExtDocModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.DocContainer#getDocs <em>Docs</em>}</li>
 *   <li>{@link ExtDocModel.DocContainer#getGlossary <em>Glossary</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getDocContainer()
 * @model
 * @generated
 */
public interface DocContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Docs</b></em>' containment reference list.
	 * The list contents are of type {@link ExtDocModel.Doc}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Doc#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docs</em>' containment reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getDocContainer_Docs()
	 * @see ExtDocModel.Doc#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EList<Doc> getDocs();

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference.
	 * @see #setGlossary(Glossary)
	 * @see ExtDocModel.ExtDocModelPackage#getDocContainer_Glossary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Glossary getGlossary();

	/**
	 * Sets the value of the '{@link ExtDocModel.DocContainer#getGlossary <em>Glossary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossary</em>' containment reference.
	 * @see #getGlossary()
	 * @generated
	 */
	void setGlossary(Glossary value);

} // DocContainer
