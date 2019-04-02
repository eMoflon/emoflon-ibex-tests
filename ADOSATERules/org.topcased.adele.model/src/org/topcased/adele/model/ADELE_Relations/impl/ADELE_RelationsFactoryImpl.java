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
package org.topcased.adele.model.ADELE_Relations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.topcased.adele.model.ADELE_Relations.*;
import org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection;
import org.topcased.adele.model.ADELE_Relations.BusAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventDataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventPortConnection;
import org.topcased.adele.model.ADELE_Relations.ParameterConnection;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsFactory;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection;
import org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADELE_RelationsFactoryImpl extends EFactoryImpl implements ADELE_RelationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ADELE_RelationsFactory init() {
		try {
			ADELE_RelationsFactory theADELE_RelationsFactory = (ADELE_RelationsFactory)EPackage.Registry.INSTANCE.getEFactory(ADELE_RelationsPackage.eNS_URI);
			if (theADELE_RelationsFactory != null) {
				return theADELE_RelationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ADELE_RelationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_RelationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ADELE_RelationsPackage.BUS_ACCESS_CONNECTION: return createBusAccessConnection();
			case ADELE_RelationsPackage.DATA_ACCESS_CONNECTION: return createDataAccessConnection();
			case ADELE_RelationsPackage.SUBPROGRAM_ACCESS_CONNECTION: return createSubprogramAccessConnection();
			case ADELE_RelationsPackage.SUBPROGRAM_GROUP_ACCESS_CONNECTION: return createSubprogramGroupAccessConnection();
			case ADELE_RelationsPackage.EVENT_PORT_CONNECTION: return createEventPortConnection();
			case ADELE_RelationsPackage.DATA_PORT_CONNECTION: return createDataPortConnection();
			case ADELE_RelationsPackage.EVENT_DATA_PORT_CONNECTION: return createEventDataPortConnection();
			case ADELE_RelationsPackage.PARAMETER_CONNECTION: return createParameterConnection();
			case ADELE_RelationsPackage.ABSTRACT_FEATURE_CONNECTION: return createAbstractFeatureConnection();
			case ADELE_RelationsPackage.FEATURE_GROUP_CONNECTION: return createFeatureGroupConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusAccessConnection createBusAccessConnection() {
		BusAccessConnectionImpl busAccessConnection = new BusAccessConnectionImpl();
		return busAccessConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessConnection createDataAccessConnection() {
		DataAccessConnectionImpl dataAccessConnection = new DataAccessConnectionImpl();
		return dataAccessConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPortConnection createEventPortConnection() {
		EventPortConnectionImpl eventPortConnection = new EventPortConnectionImpl();
		return eventPortConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPortConnection createDataPortConnection() {
		DataPortConnectionImpl dataPortConnection = new DataPortConnectionImpl();
		return dataPortConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDataPortConnection createEventDataPortConnection() {
		EventDataPortConnectionImpl eventDataPortConnection = new EventDataPortConnectionImpl();
		return eventDataPortConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramAccessConnection createSubprogramAccessConnection() {
		SubprogramAccessConnectionImpl subprogramAccessConnection = new SubprogramAccessConnectionImpl();
		return subprogramAccessConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConnection createParameterConnection() {
		ParameterConnectionImpl parameterConnection = new ParameterConnectionImpl();
		return parameterConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramGroupAccessConnection createSubprogramGroupAccessConnection() {
		SubprogramGroupAccessConnectionImpl subprogramGroupAccessConnection = new SubprogramGroupAccessConnectionImpl();
		return subprogramGroupAccessConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeatureConnection createAbstractFeatureConnection() {
		AbstractFeatureConnectionImpl abstractFeatureConnection = new AbstractFeatureConnectionImpl();
		return abstractFeatureConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupConnection createFeatureGroupConnection() {
		FeatureGroupConnectionImpl featureGroupConnection = new FeatureGroupConnectionImpl();
		return featureGroupConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_RelationsPackage getADELE_RelationsPackage() {
		return (ADELE_RelationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ADELE_RelationsPackage getPackage() {
		return ADELE_RelationsPackage.eINSTANCE;
	}

} //ADELE_RelationsFactoryImpl
