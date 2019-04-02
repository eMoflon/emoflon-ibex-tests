/**
 * <copyright>
 * </copyright>
 *
 * $Id: BAState.java,v 1.3 2012-04-30 12:06:46 aschach Exp $
 */
package org.topcased.adele.model.ba_components;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BA State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ba_components.BAState#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.ba_components.Ba_componentsPackage#getBAState()
 * @model
 * @generated
 */
public interface BAState extends BAComponent {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.topcased.adele.model.ba_components.BAStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.topcased.adele.model.ba_components.BAStateKind
	 * @see #setKind(BAStateKind)
	 * @see org.topcased.adele.model.ba_components.Ba_componentsPackage#getBAState_Kind()
	 * @model
	 * @generated
	 */
	BAStateKind getKind();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.ba_components.BAState#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.topcased.adele.model.ba_components.BAStateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BAStateKind value);

	String aadlSerialization(String packageName,String annexName, ResourceSet res, SKODSFactory odStructure);
} // BAState
