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
 */
package org.topcased.adele.model.ADELE_Features;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage
 * @generated
 */
public interface ADELE_FeaturesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ADELE_FeaturesFactory eINSTANCE = org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bus Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Access</em>'.
	 * @generated
	 */
	BusAccess createBusAccess();

	/**
	 * Returns a new object of class '<em>Data Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Access</em>'.
	 * @generated
	 */
	DataAccess createDataAccess();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Group</em>'.
	 * @generated
	 */
	FeatureGroup createFeatureGroup();

	/**
	 * Returns a new object of class '<em>Event Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Port</em>'.
	 * @generated
	 */
	EventPort createEventPort();

	/**
	 * Returns a new object of class '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Port</em>'.
	 * @generated
	 */
	DataPort createDataPort();

	/**
	 * Returns a new object of class '<em>Event Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Data Port</em>'.
	 * @generated
	 */
	EventDataPort createEventDataPort();

	/**
	 * Returns a new object of class '<em>Subprogram Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Access</em>'.
	 * @generated
	 */
	SubprogramAccess createSubprogramAccess();

	/**
	 * Returns a new object of class '<em>Subprogram Group Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Group Access</em>'.
	 * @generated
	 */
	SubprogramGroupAccess createSubprogramGroupAccess();

	/**
	 * Returns a new object of class '<em>Abstract Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Feature</em>'.
	 * @generated
	 */
	AbstractFeature createAbstractFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ADELE_FeaturesPackage getADELE_FeaturesPackage();

} //ADELE_FeaturesFactory
