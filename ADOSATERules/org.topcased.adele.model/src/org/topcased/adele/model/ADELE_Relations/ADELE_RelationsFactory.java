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
package org.topcased.adele.model.ADELE_Relations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage
 * @generated
 */
public interface ADELE_RelationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ADELE_RelationsFactory eINSTANCE = org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bus Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Access Connection</em>'.
	 * @generated
	 */
	BusAccessConnection createBusAccessConnection();

	/**
	 * Returns a new object of class '<em>Data Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Access Connection</em>'.
	 * @generated
	 */
	DataAccessConnection createDataAccessConnection();

	/**
	 * Returns a new object of class '<em>Event Port Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Port Connection</em>'.
	 * @generated
	 */
	EventPortConnection createEventPortConnection();

	/**
	 * Returns a new object of class '<em>Data Port Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Port Connection</em>'.
	 * @generated
	 */
	DataPortConnection createDataPortConnection();

	/**
	 * Returns a new object of class '<em>Event Data Port Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Data Port Connection</em>'.
	 * @generated
	 */
	EventDataPortConnection createEventDataPortConnection();

	/**
	 * Returns a new object of class '<em>Subprogram Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Access Connection</em>'.
	 * @generated
	 */
	SubprogramAccessConnection createSubprogramAccessConnection();

	/**
	 * Returns a new object of class '<em>Parameter Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Connection</em>'.
	 * @generated
	 */
	ParameterConnection createParameterConnection();

	/**
	 * Returns a new object of class '<em>Subprogram Group Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subprogram Group Access Connection</em>'.
	 * @generated
	 */
	SubprogramGroupAccessConnection createSubprogramGroupAccessConnection();

	/**
	 * Returns a new object of class '<em>Abstract Feature Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Feature Connection</em>'.
	 * @generated
	 */
	AbstractFeatureConnection createAbstractFeatureConnection();

	/**
	 * Returns a new object of class '<em>Feature Group Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Group Connection</em>'.
	 * @generated
	 */
	FeatureGroupConnection createFeatureGroupConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ADELE_RelationsPackage getADELE_RelationsPackage();

} //ADELE_RelationsFactory
