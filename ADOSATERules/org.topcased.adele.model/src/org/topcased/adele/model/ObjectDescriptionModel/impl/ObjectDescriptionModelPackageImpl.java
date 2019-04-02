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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage;
import org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelFactory;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage;
import org.topcased.adele.model.ObjectDescriptionModel.SKODData;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSMode;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSection;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSystem;
import org.topcased.adele.model.ba_components.Ba_componentsPackage;
import org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl;
import org.topcased.adele.model.ba_features.Ba_featuresPackage;
import org.topcased.adele.model.ba_features.impl.Ba_featuresPackageImpl;
import org.topcased.adele.model.ba_relations.Ba_relationsPackage;
import org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectDescriptionModelPackageImpl extends EPackageImpl implements ObjectDescriptionModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skodSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skodSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skodsFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skodDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum skodsModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType documentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashSetEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ObjectDescriptionModelPackageImpl() {
		super(eNS_URI, ObjectDescriptionModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ObjectDescriptionModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ObjectDescriptionModelPackage init() {
		if (isInited) return (ObjectDescriptionModelPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI);

		// Obtain or create and register package
		ObjectDescriptionModelPackageImpl theObjectDescriptionModelPackage = (ObjectDescriptionModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ObjectDescriptionModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ObjectDescriptionModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ADELE_ComponentsPackageImpl theADELE_ComponentsPackage = (ADELE_ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) instanceof ADELE_ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) : ADELE_ComponentsPackage.eINSTANCE);
		ADELE_FeaturesPackageImpl theADELE_FeaturesPackage = (ADELE_FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) instanceof ADELE_FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) : ADELE_FeaturesPackage.eINSTANCE);
		ADELE_RelationsPackageImpl theADELE_RelationsPackage = (ADELE_RelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) instanceof ADELE_RelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) : ADELE_RelationsPackage.eINSTANCE);
		Ba_componentsPackageImpl theBa_componentsPackage = (Ba_componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) instanceof Ba_componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) : Ba_componentsPackage.eINSTANCE);
		Ba_featuresPackageImpl theBa_featuresPackage = (Ba_featuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) instanceof Ba_featuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) : Ba_featuresPackage.eINSTANCE);
		Ba_relationsPackageImpl theBa_relationsPackage = (Ba_relationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) instanceof Ba_relationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) : Ba_relationsPackage.eINSTANCE);
		KernelSpicesPackageImpl theKernelSpicesPackage = (KernelSpicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) instanceof KernelSpicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) : KernelSpicesPackage.eINSTANCE);

		// Create package meta-data objects
		theObjectDescriptionModelPackage.createPackageContents();
		theADELE_ComponentsPackage.createPackageContents();
		theADELE_FeaturesPackage.createPackageContents();
		theADELE_RelationsPackage.createPackageContents();
		theBa_componentsPackage.createPackageContents();
		theBa_featuresPackage.createPackageContents();
		theBa_relationsPackage.createPackageContents();
		theKernelSpicesPackage.createPackageContents();

		// Initialize created meta-data
		theObjectDescriptionModelPackage.initializePackageContents();
		theADELE_ComponentsPackage.initializePackageContents();
		theADELE_FeaturesPackage.initializePackageContents();
		theADELE_RelationsPackage.initializePackageContents();
		theBa_componentsPackage.initializePackageContents();
		theBa_featuresPackage.initializePackageContents();
		theBa_relationsPackage.initializePackageContents();
		theKernelSpicesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theObjectDescriptionModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ObjectDescriptionModelPackage.eNS_URI, theObjectDescriptionModelPackage);
		return theObjectDescriptionModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKODSection() {
		return skodSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSection_Label() {
		return (EAttribute)skodSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSection_DomODSNode() {
		return (EAttribute)skodSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKODSection_Data() {
		return (EReference)skodSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKODSystem() {
		return skodSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKODSystem_Sections() {
		return (EReference)skodSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSystem_Id() {
		return (EAttribute)skodSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSystem_Label() {
		return (EAttribute)skodSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSystem_Mode() {
		return (EAttribute)skodSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSystem_StyleSheet() {
		return (EAttribute)skodSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSystem_DomData() {
		return (EAttribute)skodSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKODSFactory() {
		return skodsFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSFactory_DomODS() {
		return (EAttribute)skodsFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSFactory_CurrentODSDatafileNode() {
		return (EAttribute)skodsFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODSFactory_DomData() {
		return (EAttribute)skodsFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKODSFactory_CurrentObject() {
		return (EReference)skodsFactoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKODData() {
		return skodDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODData_Value() {
		return (EAttribute)skodDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODData_Modified() {
		return (EAttribute)skodDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODData_Dom() {
		return (EAttribute)skodDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODData_Node() {
		return (EAttribute)skodDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKODData_External() {
		return (EAttribute)skodDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSKODSMode() {
		return skodsModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDocument() {
		return documentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNode() {
		return nodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashMap() {
		return hashMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashSet() {
		return hashSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectDescriptionModelFactory getObjectDescriptionModelFactory() {
		return (ObjectDescriptionModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		skodSectionEClass = createEClass(SKOD_SECTION);
		createEAttribute(skodSectionEClass, SKOD_SECTION__LABEL);
		createEAttribute(skodSectionEClass, SKOD_SECTION__DOM_ODS_NODE);
		createEReference(skodSectionEClass, SKOD_SECTION__DATA);

		skodSystemEClass = createEClass(SKOD_SYSTEM);
		createEReference(skodSystemEClass, SKOD_SYSTEM__SECTIONS);
		createEAttribute(skodSystemEClass, SKOD_SYSTEM__ID);
		createEAttribute(skodSystemEClass, SKOD_SYSTEM__LABEL);
		createEAttribute(skodSystemEClass, SKOD_SYSTEM__MODE);
		createEAttribute(skodSystemEClass, SKOD_SYSTEM__STYLE_SHEET);
		createEAttribute(skodSystemEClass, SKOD_SYSTEM__DOM_DATA);

		skodsFactoryEClass = createEClass(SKODS_FACTORY);
		createEAttribute(skodsFactoryEClass, SKODS_FACTORY__DOM_ODS);
		createEAttribute(skodsFactoryEClass, SKODS_FACTORY__CURRENT_ODS_DATAFILE_NODE);
		createEAttribute(skodsFactoryEClass, SKODS_FACTORY__DOM_DATA);
		createEReference(skodsFactoryEClass, SKODS_FACTORY__CURRENT_OBJECT);

		skodDataEClass = createEClass(SKOD_DATA);
		createEAttribute(skodDataEClass, SKOD_DATA__VALUE);
		createEAttribute(skodDataEClass, SKOD_DATA__MODIFIED);
		createEAttribute(skodDataEClass, SKOD_DATA__DOM);
		createEAttribute(skodDataEClass, SKOD_DATA__NODE);
		createEAttribute(skodDataEClass, SKOD_DATA__EXTERNAL);

		// Create enums
		skodsModeEEnum = createEEnum(SKODS_MODE);

		// Create data types
		documentEDataType = createEDataType(DOCUMENT);
		nodeEDataType = createEDataType(NODE);
		hashMapEDataType = createEDataType(HASH_MAP);
		hashSetEDataType = createEDataType(HASH_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KernelSpicesPackage theKernelSpicesPackage = (KernelSpicesPackage)EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		skodSectionEClass.getESuperTypes().add(theKernelSpicesPackage.getSKHierarchicalObject());

		// Initialize classes and features; add operations and parameters
		initEClass(skodSectionEClass, SKODSection.class, "SKODSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSKODSection_Label(), ecorePackage.getEString(), "label", null, 1, 1, SKODSection.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODSection_DomODSNode(), this.getNode(), "domODSNode", null, 1, 1, SKODSection.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSKODSection_Data(), this.getSKODData(), null, "data", null, 1, 1, SKODSection.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(skodSectionEClass, ecorePackage.getEString(), "getId", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodSectionEClass, ecorePackage.getEBoolean(), "isModified", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodSectionEClass, ecorePackage.getEBoolean(), "isInDeepModified", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(skodSectionEClass, null, "setValueData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "p_data", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skodSectionEClass, this.getHashSet(), "deepFlushData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHashSet(), "p_modifiedDoms", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(skodSystemEClass, SKODSystem.class, "SKODSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSKODSystem_Sections(), this.getSKODSection(), null, "sections", null, 1, -1, SKODSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODSystem_Id(), ecorePackage.getEString(), "id", null, 1, 1, SKODSystem.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODSystem_Label(), ecorePackage.getEString(), "label", null, 1, 1, SKODSystem.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODSystem_Mode(), this.getSKODSMode(), "mode", null, 1, 1, SKODSystem.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODSystem_StyleSheet(), ecorePackage.getEString(), "styleSheet", null, 1, 1, SKODSystem.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODSystem_DomData(), this.getHashMap(), "domData", null, 1, 1, SKODSystem.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(skodSystemEClass, ecorePackage.getEBoolean(), "isModified", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodSystemEClass, null, "save", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skodSystemEClass, ecorePackage.getEString(), "getDomFilename", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDocument(), "p_dom", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skodSystemEClass, null, "save", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "force", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skodSystemEClass, null, "rebuildDomData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSKODSFactory(), "factory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKernelSpicesPackage.getSKHierarchicalObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(skodsFactoryEClass, SKODSFactory.class, "SKODSFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSKODSFactory_DomODS(), this.getDocument(), "domODS", null, 1, 1, SKODSFactory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODSFactory_CurrentODSDatafileNode(), this.getNode(), "currentODSDatafileNode", null, 1, 1, SKODSFactory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODSFactory_DomData(), this.getHashMap(), "domData", null, 0, 1, SKODSFactory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSKODSFactory_CurrentObject(), theKernelSpicesPackage.getSKHierarchicalObject(), null, "currentObject", null, 1, 1, SKODSFactory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentProjectDirectory", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentObjectName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skodsFactoryEClass, this.getSKODSystem(), "getODSystem", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "p_dsId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKernelSpicesPackage.getSKHierarchicalObject(), "p_object", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentWorkspaceDirectory", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentDesignDirectory", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentObjectDirectory", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentObjectLocation", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentProjectName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentDesignName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skodsFactoryEClass, ecorePackage.getEString(), "getCurrentObjectId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skodsFactoryEClass, null, "getODSystemsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(skodsFactoryEClass, null, "getODSystemsLabel", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(skodsFactoryEClass, this.getHashMap(), "rebuildDomData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSKODSystem(), "oldOdsystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKernelSpicesPackage.getSKHierarchicalObject(), "p_object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(skodDataEClass, SKODData.class, "SKODData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSKODData_Value(), ecorePackage.getEString(), "value", null, 1, 1, SKODData.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODData_Modified(), ecorePackage.getEBoolean(), "modified", null, 1, 1, SKODData.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODData_Dom(), this.getDocument(), "dom", null, 1, 1, SKODData.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODData_Node(), this.getNode(), "node", null, 1, 1, SKODData.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKODData_External(), ecorePackage.getEBoolean(), "external", null, 1, 1, SKODData.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(skodDataEClass, null, "setValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "p_data", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skodDataEClass, this.getHashSet(), "flush", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHashSet(), "p_modifiedDoms", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(skodsModeEEnum, SKODSMode.class, "SKODSMode");
		addEEnumLiteral(skodsModeEEnum, SKODSMode.HIERARCHICAL_LITERAL);
		addEEnumLiteral(skodsModeEEnum, SKODSMode.SEQUENTIAL_LITERAL);

		// Initialize data types
		initEDataType(documentEDataType, Document.class, "Document", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nodeEDataType, Node.class, "Node", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashMapEDataType, HashMap.class, "HashMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashSetEDataType, HashSet.class, "HashSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";						
		addAnnotation
		  (documentEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.eclipse.org/emf/2002/Ecore#EJavaObject"
		   });
	}

} //ObjectDescriptionModelPackageImpl
