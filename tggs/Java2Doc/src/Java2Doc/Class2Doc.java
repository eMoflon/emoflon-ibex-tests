/**
 */
package Java2Doc;

import org.eclipse.emf.ecore.EObject;

import simpleDoc.Doc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class2 Doc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Java2Doc.Class2Doc#getSource <em>Source</em>}</li>
 *   <li>{@link Java2Doc.Class2Doc#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Java2Doc.Java2DocPackage#getClass2Doc()
 * @model
 * @generated
 */
public interface Class2Doc extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(simpleJava.Class)
	 * @see Java2Doc.Java2DocPackage#getClass2Doc_Source()
	 * @model
	 * @generated
	 */
	simpleJava.Class getSource();

	/**
	 * Sets the value of the '{@link Java2Doc.Class2Doc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(simpleJava.Class value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Doc)
	 * @see Java2Doc.Java2DocPackage#getClass2Doc_Target()
	 * @model
	 * @generated
	 */
	Doc getTarget();

	/**
	 * Sets the value of the '{@link Java2Doc.Class2Doc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Doc value);

} // Class2Doc
