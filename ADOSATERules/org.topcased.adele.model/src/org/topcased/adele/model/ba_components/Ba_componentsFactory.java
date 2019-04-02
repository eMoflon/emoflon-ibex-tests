/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_componentsFactory.java,v 1.1 2012-03-01 09:19:12 aschach Exp $
 */
package org.topcased.adele.model.ba_components;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ba_components.Ba_componentsPackage
 * @generated
 */
public interface Ba_componentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ba_componentsFactory eINSTANCE = org.topcased.adele.model.ba_components.impl.Ba_componentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavior Annex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Annex</em>'.
	 * @generated
	 */
	BehaviorAnnex createBehaviorAnnex();

	/**
	 * Returns a new object of class '<em>BA State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BA State</em>'.
	 * @generated
	 */
	BAState createBAState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ba_componentsPackage getBa_componentsPackage();

} //Ba_componentsFactory
