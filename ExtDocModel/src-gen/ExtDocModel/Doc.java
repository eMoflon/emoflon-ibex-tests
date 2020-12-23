/**
 */
package ExtDocModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.Doc#getContainer <em>Container</em>}</li>
 *   <li>{@link ExtDocModel.Doc#getEntries <em>Entries</em>}</li>
 *   <li>{@link ExtDocModel.Doc#getSubDocs <em>Sub Docs</em>}</li>
 *   <li>{@link ExtDocModel.Doc#getSuperDocs <em>Super Docs</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getDoc()
 * @model
 * @generated
 */
public interface Doc extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.DocContainer#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(DocContainer)
	 * @see ExtDocModel.ExtDocModelPackage#getDoc_Container()
	 * @see ExtDocModel.DocContainer#getDocs
	 * @model opposite="docs" transient="false"
	 * @generated
	 */
	DocContainer getContainer();

	/**
	 * Sets the value of the '{@link ExtDocModel.Doc#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DocContainer value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link ExtDocModel.Entry}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Entry#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getDoc_Entries()
	 * @see ExtDocModel.Entry#getEntry
	 * @model opposite="entry" containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Sub Docs</b></em>' reference list.
	 * The list contents are of type {@link ExtDocModel.Doc}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Doc#getSuperDocs <em>Super Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Docs</em>' reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getDoc_SubDocs()
	 * @see ExtDocModel.Doc#getSuperDocs
	 * @model opposite="superDocs"
	 * @generated
	 */
	EList<Doc> getSubDocs();

	/**
	 * Returns the value of the '<em><b>Super Docs</b></em>' reference list.
	 * The list contents are of type {@link ExtDocModel.Doc}.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Doc#getSubDocs <em>Sub Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Docs</em>' reference list.
	 * @see ExtDocModel.ExtDocModelPackage#getDoc_SuperDocs()
	 * @see ExtDocModel.Doc#getSubDocs
	 * @model opposite="subDocs"
	 * @generated
	 */
	EList<Doc> getSuperDocs();

} // Doc
