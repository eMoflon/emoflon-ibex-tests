/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_featuresFactory.java,v 1.1 2012-03-01 09:19:13 aschach Exp $
 */
package org.topcased.adele.model.ba_features;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ba_features.Ba_featuresPackage
 * @generated
 */
public interface Ba_featuresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ba_featuresFactory eINSTANCE = org.topcased.adele.model.ba_features.impl.Ba_featuresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BA Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BA Variable</em>'.
	 * @generated
	 */
	BAVariable createBAVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ba_featuresPackage getBa_featuresPackage();

} //Ba_featuresFactory
