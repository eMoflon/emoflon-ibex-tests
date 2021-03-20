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
 *   <li>{@link ExtDocModel.DocContainer#getFolders <em>Folders</em>}</li>
 *   <li>{@link ExtDocModel.DocContainer#getGlossary <em>Glossary</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getDocContainer()
 * @model
 * @generated
 */
public interface DocContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link ExtDocModel.Folder}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Folder#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getDocContainer_Folders()
	 * @see ExtDocModel.Folder#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Folder> getFolders();

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Glossary#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference.
	 * @see #setGlossary(Glossary)
	 * @see ExtDocModel.ExtDocModelPackage#getDocContainer_Glossary()
	 * @see ExtDocModel.Glossary#getContainer
	 * @model opposite="container" containment="true"
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
