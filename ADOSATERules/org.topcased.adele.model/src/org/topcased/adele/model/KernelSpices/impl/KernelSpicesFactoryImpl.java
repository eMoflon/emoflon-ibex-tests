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
package org.topcased.adele.model.KernelSpices.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.topcased.adele.model.KernelSpices.*;
import org.topcased.adele.model.KernelSpices.KernelSpicesFactory;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKFeatureVisibility;
import org.topcased.adele.model.KernelSpices.SKProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KernelSpicesFactoryImpl extends EFactoryImpl implements KernelSpicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KernelSpicesFactory init() {
		try {
			KernelSpicesFactory theKernelSpicesFactory = (KernelSpicesFactory)EPackage.Registry.INSTANCE.getEFactory(KernelSpicesPackage.eNS_URI);
			if (theKernelSpicesFactory != null) {
				return theKernelSpicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KernelSpicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelSpicesFactoryImpl() {
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
			case KernelSpicesPackage.SK_COMPONENT: return createSKComponent();
			case KernelSpicesPackage.SK_FEATURE: return createSKFeature();
			case KernelSpicesPackage.SK_RELATION: return createSKRelation();
			case KernelSpicesPackage.SK_PROPERTY: return createSKProperty();
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
			case KernelSpicesPackage.SK_FEATURE_VISIBILITY:
				return createSKFeatureVisibilityFromString(eDataType, initialValue);
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
			case KernelSpicesPackage.SK_FEATURE_VISIBILITY:
				return convertSKFeatureVisibilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKComponent createSKComponent() {
		SKComponentImpl skComponent = new SKComponentImpl();
		return skComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKFeature createSKFeature() {
		SKFeatureImpl skFeature = new SKFeatureImpl();
		return skFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKRelation createSKRelation() {
		SKRelationImpl skRelation = new SKRelationImpl();
		return skRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKProperty createSKProperty() {
		SKPropertyImpl skProperty = new SKPropertyImpl();
		return skProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKFeatureVisibility createSKFeatureVisibilityFromString(EDataType eDataType, String initialValue) {
		SKFeatureVisibility result = SKFeatureVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSKFeatureVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelSpicesPackage getKernelSpicesPackage() {
		return (KernelSpicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KernelSpicesPackage getPackage() {
		return KernelSpicesPackage.eINSTANCE;
	}

} //KernelSpicesFactoryImpl
