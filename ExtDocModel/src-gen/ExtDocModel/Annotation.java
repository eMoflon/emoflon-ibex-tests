/**
 */
package ExtDocModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.Annotation#getEntry <em>Entry</em>}</li>
 *   <li>{@link ExtDocModel.Annotation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ExtDocModel.ExtDocModelPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ExtDocModel.Entry#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' container reference.
	 * @see #setEntry(Entry)
	 * @see ExtDocModel.ExtDocModelPackage#getAnnotation_Entry()
	 * @see ExtDocModel.Entry#getAnnotation
	 * @model opposite="annotation" transient="false"
	 * @generated
	 */
	Entry getEntry();

	/**
	 * Sets the value of the '{@link ExtDocModel.Annotation#getEntry <em>Entry</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' container reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Entry value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ExtDocModel.ExtDocModelPackage#getAnnotation_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ExtDocModel.Annotation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Annotation
