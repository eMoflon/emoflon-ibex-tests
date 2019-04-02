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
package org.topcased.adele.model.ADELE_Features.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesFactory;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.AbstractFeature;
import org.topcased.adele.model.ADELE_Features.AccessDirection;
import org.topcased.adele.model.ADELE_Features.BusAccess;
import org.topcased.adele.model.ADELE_Features.DataAccess;
import org.topcased.adele.model.ADELE_Features.DataPort;
import org.topcased.adele.model.ADELE_Features.EventDataPort;
import org.topcased.adele.model.ADELE_Features.EventPort;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.ADELE_Features.Parameter;
import org.topcased.adele.model.ADELE_Features.PortDirection;
import org.topcased.adele.model.ADELE_Features.SubprogramAccess;
import org.topcased.adele.model.ADELE_Features.SubprogramGroupAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADELE_FeaturesFactoryImpl extends EFactoryImpl implements ADELE_FeaturesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ADELE_FeaturesFactory init() {
		try {
			ADELE_FeaturesFactory theADELE_FeaturesFactory = (ADELE_FeaturesFactory)EPackage.Registry.INSTANCE.getEFactory(ADELE_FeaturesPackage.eNS_URI);
			if (theADELE_FeaturesFactory != null) {
				return theADELE_FeaturesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ADELE_FeaturesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_FeaturesFactoryImpl() {
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
			case ADELE_FeaturesPackage.BUS_ACCESS: return createBusAccess();
			case ADELE_FeaturesPackage.DATA_ACCESS: return createDataAccess();
			case ADELE_FeaturesPackage.SUBPROGRAM_ACCESS: return createSubprogramAccess();
			case ADELE_FeaturesPackage.SUBPROGRAM_GROUP_ACCESS: return createSubprogramGroupAccess();
			case ADELE_FeaturesPackage.PARAMETER: return createParameter();
			case ADELE_FeaturesPackage.FEATURE_GROUP: return createFeatureGroup();
			case ADELE_FeaturesPackage.EVENT_PORT: return createEventPort();
			case ADELE_FeaturesPackage.DATA_PORT: return createDataPort();
			case ADELE_FeaturesPackage.EVENT_DATA_PORT: return createEventDataPort();
			case ADELE_FeaturesPackage.ABSTRACT_FEATURE: return createAbstractFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ADELE_FeaturesPackage.PORT_DIRECTION:
				return createPortDirectionFromString(eDataType, initialValue);
			case ADELE_FeaturesPackage.ACCESS_DIRECTION:
				return createAccessDirectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ADELE_FeaturesPackage.PORT_DIRECTION:
				return convertPortDirectionToString(eDataType, instanceValue);
			case ADELE_FeaturesPackage.ACCESS_DIRECTION:
				return convertAccessDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusAccess createBusAccess() {
		BusAccessImpl busAccess = new BusAccessImpl();
		return busAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccess createDataAccess() {
		DataAccessImpl dataAccess = new DataAccessImpl();
		return dataAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup createFeatureGroup() {
		FeatureGroupImpl featureGroup = new FeatureGroupImpl();
		return featureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPort createEventPort() {
		EventPortImpl eventPort = new EventPortImpl();
		return eventPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort createDataPort() {
		DataPortImpl dataPort = new DataPortImpl();
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDataPort createEventDataPort() {
		EventDataPortImpl eventDataPort = new EventDataPortImpl();
		return eventDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramAccess createSubprogramAccess() {
		SubprogramAccessImpl subprogramAccess = new SubprogramAccessImpl();
		return subprogramAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramGroupAccess createSubprogramGroupAccess() {
		SubprogramGroupAccessImpl subprogramGroupAccess = new SubprogramGroupAccessImpl();
		return subprogramGroupAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeature createAbstractFeature() {
		AbstractFeatureImpl abstractFeature = new AbstractFeatureImpl();
		return abstractFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirection createPortDirectionFromString(EDataType eDataType, String initialValue) {
		PortDirection result = PortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessDirection createAccessDirectionFromString(EDataType eDataType, String initialValue) {
		AccessDirection result = AccessDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_FeaturesPackage getADELE_FeaturesPackage() {
		return (ADELE_FeaturesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ADELE_FeaturesPackage getPackage() {
		return ADELE_FeaturesPackage.eINSTANCE;
	}

} //ADELE_FeaturesFactoryImpl
