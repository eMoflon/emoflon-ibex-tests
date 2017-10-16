/**
 */
package FeatureModelSafe;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FeatureModelSafe.Model#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see FeatureModelSafe.FeatureModelSafePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Feature)
	 * @see FeatureModelSafe.FeatureModelSafePackage#getModel_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Feature getRoot();

	/**
	 * Sets the value of the '{@link FeatureModelSafe.Model#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Feature value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Model
