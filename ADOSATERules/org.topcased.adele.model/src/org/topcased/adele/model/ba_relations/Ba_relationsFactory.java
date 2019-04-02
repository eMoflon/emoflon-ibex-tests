/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_relationsFactory.java,v 1.1 2012-03-01 09:19:10 aschach Exp $
 */
package org.topcased.adele.model.ba_relations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ba_relations.Ba_relationsPackage
 * @generated
 */
public interface Ba_relationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ba_relationsFactory eINSTANCE = org.topcased.adele.model.ba_relations.impl.Ba_relationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BA Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BA Transition</em>'.
	 * @generated
	 */
	BATransition createBATransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ba_relationsPackage getBa_relationsPackage();

} //Ba_relationsFactory
