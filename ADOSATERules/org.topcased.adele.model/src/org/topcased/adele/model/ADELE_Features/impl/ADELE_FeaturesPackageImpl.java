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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage;
import org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesFactory;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.AbstractFeature;
import org.topcased.adele.model.ADELE_Features.Access;
import org.topcased.adele.model.ADELE_Features.AccessDirection;
import org.topcased.adele.model.ADELE_Features.BusAccess;
import org.topcased.adele.model.ADELE_Features.DataAccess;
import org.topcased.adele.model.ADELE_Features.DataPort;
import org.topcased.adele.model.ADELE_Features.DirectedFeature;
import org.topcased.adele.model.ADELE_Features.EventDataPort;
import org.topcased.adele.model.ADELE_Features.EventPort;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.ADELE_Features.Parameter;
import org.topcased.adele.model.ADELE_Features.PortDirection;
import org.topcased.adele.model.ADELE_Features.SubprogramAccess;
import org.topcased.adele.model.ADELE_Features.SubprogramGroupAccess;
import org.topcased.adele.model.ADELE_Features.util.ADELE_FeaturesValidator;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage;
import org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl;
import org.topcased.adele.model.ba_components.Ba_componentsPackage;
import org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl;
import org.topcased.adele.model.ba_features.Ba_featuresPackage;
import org.topcased.adele.model.ba_features.impl.Ba_featuresPackageImpl;
import org.topcased.adele.model.ba_relations.Ba_relationsPackage;
import org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADELE_FeaturesPackageImpl extends EPackageImpl implements ADELE_FeaturesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDataPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessDirectionEEnum = null;

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
	 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ADELE_FeaturesPackageImpl() {
		super(eNS_URI, ADELE_FeaturesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ADELE_FeaturesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ADELE_FeaturesPackage init() {
		if (isInited) return (ADELE_FeaturesPackage)EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI);

		// Obtain or create and register package
		ADELE_FeaturesPackageImpl theADELE_FeaturesPackage = (ADELE_FeaturesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ADELE_FeaturesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ADELE_FeaturesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ADELE_ComponentsPackageImpl theADELE_ComponentsPackage = (ADELE_ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) instanceof ADELE_ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) : ADELE_ComponentsPackage.eINSTANCE);
		ADELE_RelationsPackageImpl theADELE_RelationsPackage = (ADELE_RelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) instanceof ADELE_RelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) : ADELE_RelationsPackage.eINSTANCE);
		Ba_componentsPackageImpl theBa_componentsPackage = (Ba_componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) instanceof Ba_componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) : Ba_componentsPackage.eINSTANCE);
		Ba_featuresPackageImpl theBa_featuresPackage = (Ba_featuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) instanceof Ba_featuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) : Ba_featuresPackage.eINSTANCE);
		Ba_relationsPackageImpl theBa_relationsPackage = (Ba_relationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) instanceof Ba_relationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) : Ba_relationsPackage.eINSTANCE);
		KernelSpicesPackageImpl theKernelSpicesPackage = (KernelSpicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) instanceof KernelSpicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) : KernelSpicesPackage.eINSTANCE);
		ObjectDescriptionModelPackageImpl theObjectDescriptionModelPackage = (ObjectDescriptionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) instanceof ObjectDescriptionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) : ObjectDescriptionModelPackage.eINSTANCE);

		// Create package meta-data objects
		theADELE_FeaturesPackage.createPackageContents();
		theADELE_ComponentsPackage.createPackageContents();
		theADELE_RelationsPackage.createPackageContents();
		theBa_componentsPackage.createPackageContents();
		theBa_featuresPackage.createPackageContents();
		theBa_relationsPackage.createPackageContents();
		theKernelSpicesPackage.createPackageContents();
		theObjectDescriptionModelPackage.createPackageContents();

		// Initialize created meta-data
		theADELE_FeaturesPackage.initializePackageContents();
		theADELE_ComponentsPackage.initializePackageContents();
		theADELE_RelationsPackage.initializePackageContents();
		theBa_componentsPackage.initializePackageContents();
		theBa_featuresPackage.initializePackageContents();
		theBa_relationsPackage.initializePackageContents();
		theKernelSpicesPackage.initializePackageContents();
		theObjectDescriptionModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theADELE_FeaturesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ADELE_FeaturesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theADELE_FeaturesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ADELE_FeaturesPackage.eNS_URI, theADELE_FeaturesPackage);
		return theADELE_FeaturesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusAccess() {
		return busAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccess() {
		return dataAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureGroup() {
		return featureGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureGroup_InverseFeature() {
		return (EReference)featureGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureGroup_Type() {
		return (EAttribute)featureGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureGroup_AllRealFeatures() {
		return (EReference)featureGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventPort() {
		return eventPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPort() {
		return dataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDataPort() {
		return eventDataPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Classifier() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Refinement() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_RefinedFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_OriginalFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccess() {
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Direction() {
		return (EAttribute)accessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedFeature() {
		return directedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedFeature_Direction() {
		return (EAttribute)directedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramAccess() {
		return subprogramAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramGroupAccess() {
		return subprogramGroupAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeature() {
		return abstractFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortDirection() {
		return portDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessDirection() {
		return accessDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_FeaturesFactory getADELE_FeaturesFactory() {
		return (ADELE_FeaturesFactory)getEFactoryInstance();
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
		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__CLASSIFIER);
		createEAttribute(featureEClass, FEATURE__REFINEMENT);
		createEReference(featureEClass, FEATURE__REFINED_FEATURE);
		createEReference(featureEClass, FEATURE__ORIGINAL_FEATURE);

		accessEClass = createEClass(ACCESS);
		createEAttribute(accessEClass, ACCESS__DIRECTION);

		directedFeatureEClass = createEClass(DIRECTED_FEATURE);
		createEAttribute(directedFeatureEClass, DIRECTED_FEATURE__DIRECTION);

		busAccessEClass = createEClass(BUS_ACCESS);

		dataAccessEClass = createEClass(DATA_ACCESS);

		subprogramAccessEClass = createEClass(SUBPROGRAM_ACCESS);

		subprogramGroupAccessEClass = createEClass(SUBPROGRAM_GROUP_ACCESS);

		parameterEClass = createEClass(PARAMETER);

		featureGroupEClass = createEClass(FEATURE_GROUP);
		createEReference(featureGroupEClass, FEATURE_GROUP__INVERSE_FEATURE);
		createEAttribute(featureGroupEClass, FEATURE_GROUP__TYPE);
		createEReference(featureGroupEClass, FEATURE_GROUP__ALL_REAL_FEATURES);

		eventPortEClass = createEClass(EVENT_PORT);

		dataPortEClass = createEClass(DATA_PORT);

		eventDataPortEClass = createEClass(EVENT_DATA_PORT);

		abstractFeatureEClass = createEClass(ABSTRACT_FEATURE);

		// Create enums
		portDirectionEEnum = createEEnum(PORT_DIRECTION);
		accessDirectionEEnum = createEEnum(ACCESS_DIRECTION);
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
		featureEClass.getESuperTypes().add(theKernelSpicesPackage.getSKFeature());
		accessEClass.getESuperTypes().add(this.getFeature());
		directedFeatureEClass.getESuperTypes().add(this.getFeature());
		busAccessEClass.getESuperTypes().add(this.getAccess());
		dataAccessEClass.getESuperTypes().add(this.getAccess());
		subprogramAccessEClass.getESuperTypes().add(this.getAccess());
		subprogramGroupAccessEClass.getESuperTypes().add(this.getAccess());
		parameterEClass.getESuperTypes().add(this.getDirectedFeature());
		featureGroupEClass.getESuperTypes().add(this.getDirectedFeature());
		featureGroupEClass.getESuperTypes().add(theKernelSpicesPackage.getSKComponent());
		eventPortEClass.getESuperTypes().add(this.getDirectedFeature());
		dataPortEClass.getESuperTypes().add(this.getDirectedFeature());
		eventDataPortEClass.getESuperTypes().add(this.getDirectedFeature());
		abstractFeatureEClass.getESuperTypes().add(this.getDirectedFeature());

		// Initialize classes and features; add operations and parameters
		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Classifier(), theKernelSpicesPackage.getSKComponent(), null, "classifier", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Refinement(), ecorePackage.getEBoolean(), "refinement", "false", 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_RefinedFeature(), this.getFeature(), null, "refinedFeature", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_OriginalFeature(), this.getFeature(), null, "originalFeature", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(accessEClass, Access.class, "Access", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccess_Direction(), this.getAccessDirection(), "direction", null, 1, 1, Access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directedFeatureEClass, DirectedFeature.class, "DirectedFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectedFeature_Direction(), this.getPortDirection(), "direction", null, 1, 1, DirectedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busAccessEClass, BusAccess.class, "BusAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAccessEClass, DataAccess.class, "DataAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramAccessEClass, SubprogramAccess.class, "SubprogramAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramGroupAccessEClass, SubprogramGroupAccess.class, "SubprogramGroupAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureGroupEClass, FeatureGroup.class, "FeatureGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroup_InverseFeature(), this.getFeatureGroup(), null, "inverseFeature", null, 0, 1, FeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureGroup_Type(), ecorePackage.getEBoolean(), "type", null, 1, 1, FeatureGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureGroup_AllRealFeatures(), this.getFeature(), null, "allRealFeatures", null, 0, -1, FeatureGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(featureGroupEClass, ecorePackage.getEBoolean(), "isInverse", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eventPortEClass, EventPort.class, "EventPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPortEClass, DataPort.class, "DataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventDataPortEClass, EventDataPort.class, "EventDataPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractFeatureEClass, AbstractFeature.class, "AbstractFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(portDirectionEEnum, PortDirection.class, "PortDirection");
		addEEnumLiteral(portDirectionEEnum, PortDirection.IN_LITERAL);
		addEEnumLiteral(portDirectionEEnum, PortDirection.OUT_LITERAL);
		addEEnumLiteral(portDirectionEEnum, PortDirection.INOUT_LITERAL);

		initEEnum(accessDirectionEEnum, AccessDirection.class, "AccessDirection");
		addEEnumLiteral(accessDirectionEEnum, AccessDirection.PROVIDED_LITERAL);
		addEEnumLiteral(accessDirectionEEnum, AccessDirection.REQUIRED_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueFeatureNames legalName componentNotNull"
		   });		
		addAnnotation
		  (featureGroupEClass, 
		   source, 
		   new String[] {
			 "constraints", "consistentDirections"
		   });
	}
	// DB: Find a better way to remove the ADELE prefix
//	@Override
//	protected EClass initEClass(EClass c, Class<?> instanceClass, String name,
//			boolean isAbstract, boolean isInterface, boolean isGenerated) {
//		if (name.startsWith("ADELE_")) {
//			name = name.substring(6);
//		}
//		return super.initEClass(c, instanceClass, name, isAbstract, isInterface,
//				isGenerated);
//	}

} //ADELE_FeaturesPackageImpl
