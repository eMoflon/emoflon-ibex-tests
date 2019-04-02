/**
 * Copyright (c) 2009 Ellidiss Technologies
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Arnaud Schach, arnaud.schach.com
 * 	Jean-Bertrand Hery
 */
package org.topcased.adele.model.KernelSpices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage
 * @generated
 */
public interface KernelSpicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelSpicesFactory eINSTANCE = org.topcased.adele.model.KernelSpices.impl.KernelSpicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SK Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SK Component</em>'.
	 * @generated
	 */
	SKComponent createSKComponent();

	/**
	 * Returns a new object of class '<em>SK Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SK Feature</em>'.
	 * @generated
	 */
	SKFeature createSKFeature();

	/**
	 * Returns a new object of class '<em>SK Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SK Relation</em>'.
	 * @generated
	 */
	SKRelation createSKRelation();

	/**
	 * Returns a new object of class '<em>SK Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SK Property</em>'.
	 * @generated
	 */
	SKProperty createSKProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KernelSpicesPackage getKernelSpicesPackage();

} //KernelSpicesFactory
