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
package org.topcased.adele.model.ObjectDescriptionModel.impl;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelFactory;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage;
import org.topcased.adele.model.ObjectDescriptionModel.SKODData;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSMode;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSection;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSystem;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectDescriptionModelFactoryImpl extends EFactoryImpl implements ObjectDescriptionModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectDescriptionModelFactory init() {
		try {
			ObjectDescriptionModelFactory theObjectDescriptionModelFactory = (ObjectDescriptionModelFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectDescriptionModelPackage.eNS_URI);
			if (theObjectDescriptionModelFactory != null) {
				return theObjectDescriptionModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ObjectDescriptionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDescriptionModelFactoryImpl() {
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
			case ObjectDescriptionModelPackage.SKOD_SECTION: return createSKODSection();
			case ObjectDescriptionModelPackage.SKOD_SYSTEM: return createSKODSystem();
			case ObjectDescriptionModelPackage.SKODS_FACTORY: return createSKODSFactory();
			case ObjectDescriptionModelPackage.SKOD_DATA: return createSKODData();
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
			case ObjectDescriptionModelPackage.SKODS_MODE:
				return createSKODSModeFromString(eDataType, initialValue);
			case ObjectDescriptionModelPackage.DOCUMENT:
				return createDocumentFromString(eDataType, initialValue);
			case ObjectDescriptionModelPackage.NODE:
				return createNodeFromString(eDataType, initialValue);
			case ObjectDescriptionModelPackage.HASH_MAP:
				return createHashMapFromString(eDataType, initialValue);
			case ObjectDescriptionModelPackage.HASH_SET:
				return createHashSetFromString(eDataType, initialValue);
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
			case ObjectDescriptionModelPackage.SKODS_MODE:
				return convertSKODSModeToString(eDataType, instanceValue);
			case ObjectDescriptionModelPackage.DOCUMENT:
				return convertDocumentToString(eDataType, instanceValue);
			case ObjectDescriptionModelPackage.NODE:
				return convertNodeToString(eDataType, instanceValue);
			case ObjectDescriptionModelPackage.HASH_MAP:
				return convertHashMapToString(eDataType, instanceValue);
			case ObjectDescriptionModelPackage.HASH_SET:
				return convertHashSetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKODSection createSKODSection() {
		SKODSectionImpl skodSection = new SKODSectionImpl();
		return skodSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKODSystem createSKODSystem() {
		SKODSystemImpl skodSystem = new SKODSystemImpl();
		return skodSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKODSFactory createSKODSFactory() {
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKODData createSKODData() {
		SKODDataImpl skodData = new SKODDataImpl("");
		return skodData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKODSMode createSKODSModeFromString(EDataType eDataType, String initialValue) {
		SKODSMode result = SKODSMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSKODSModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocumentFromString(EDataType eDataType, String initialValue) {
		return (Document)EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EJAVA_OBJECT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentToString(EDataType eDataType, Object instanceValue) {
		return EcoreFactory.eINSTANCE.convertToString(EcorePackage.Literals.EJAVA_OBJECT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNodeFromString(EDataType eDataType, String initialValue) {
		return (Node)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap createHashMapFromString(EDataType eDataType, String initialValue) {
		return (HashMap)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashSet createHashSetFromString(EDataType eDataType, String initialValue) {
		return (HashSet)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDescriptionModelPackage getObjectDescriptionModelPackage() {
		return (ObjectDescriptionModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ObjectDescriptionModelPackage getPackage() {
		return ObjectDescriptionModelPackage.eINSTANCE;
	}

} //ObjectDescriptionModelFactoryImpl
