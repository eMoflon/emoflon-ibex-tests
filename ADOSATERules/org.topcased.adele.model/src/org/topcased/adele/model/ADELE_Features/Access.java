/**
 */
package org.topcased.adele.model.ADELE_Features;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.Access#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getAccess()
 * @model abstract="true"
 * @generated
 */
public interface Access extends Feature {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.adele.model.ADELE_Features.AccessDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.topcased.adele.model.ADELE_Features.AccessDirection
	 * @see #setDirection(AccessDirection)
	 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#getAccess_Direction()
	 * @model required="true"
	 * @generated
	 */
	AccessDirection getDirection();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ADELE_Features.Access#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.topcased.adele.model.ADELE_Features.AccessDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(AccessDirection value);

} // Access
