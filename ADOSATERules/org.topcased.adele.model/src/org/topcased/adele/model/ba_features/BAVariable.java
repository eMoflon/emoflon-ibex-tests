/**
 * <copyright>
 * </copyright>
 *
 * $Id: BAVariable.java,v 1.3 2012-04-30 12:07:12 aschach Exp $
 */
package org.topcased.adele.model.ba_features;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.topcased.adele.model.ADELE_Components.Data;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BA Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ba_features.BAVariable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ba_features.Ba_featuresPackage#getBAVariable()
 * @model
 * @generated
 */
public interface BAVariable extends BAFeature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Data)
	 * @see org.topcased.adele.model.ba_features.Ba_featuresPackage#getBAVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	Data getType();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ba_features.BAVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Data value);

	String aadlSerialization(String packageName,String annexName, ResourceSet res, SKODSFactory odStructure);
} // BAVariable
