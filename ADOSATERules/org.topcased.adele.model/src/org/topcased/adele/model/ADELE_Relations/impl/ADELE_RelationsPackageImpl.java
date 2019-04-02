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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage;
import org.topcased.adele.model.ADELE_Components.impl.ADELE_ComponentsPackageImpl;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsFactory;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection;
import org.topcased.adele.model.ADELE_Relations.AccessConnection;
import org.topcased.adele.model.ADELE_Relations.BusAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataPortConnection;
import org.topcased.adele.model.ADELE_Relations.DirectedFeatureConnection;
import org.topcased.adele.model.ADELE_Relations.EventDataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventPortConnection;
import org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection;
import org.topcased.adele.model.ADELE_Relations.ParameterConnection;
import org.topcased.adele.model.ADELE_Relations.Relation;
import org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection;
import org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection;
import org.topcased.adele.model.ADELE_Relations.util.ADELE_RelationsValidator;
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
public class ADELE_RelationsPackageImpl extends EPackageImpl implements ADELE_RelationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busAccessConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPortConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPortConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDataPortConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedFeatureConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramAccessConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupAccessConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupConnectionEClass = null;

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
	 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ADELE_RelationsPackageImpl() {
		super(eNS_URI, ADELE_RelationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ADELE_RelationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ADELE_RelationsPackage init() {
		if (isInited) return (ADELE_RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI);

		// Obtain or create and register package
		ADELE_RelationsPackageImpl theADELE_RelationsPackage = (ADELE_RelationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ADELE_RelationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ADELE_RelationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ADELE_ComponentsPackageImpl theADELE_ComponentsPackage = (ADELE_ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) instanceof ADELE_ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) : ADELE_ComponentsPackage.eINSTANCE);
		ADELE_FeaturesPackageImpl theADELE_FeaturesPackage = (ADELE_FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) instanceof ADELE_FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) : ADELE_FeaturesPackage.eINSTANCE);
		Ba_componentsPackageImpl theBa_componentsPackage = (Ba_componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) instanceof Ba_componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) : Ba_componentsPackage.eINSTANCE);
		Ba_featuresPackageImpl theBa_featuresPackage = (Ba_featuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) instanceof Ba_featuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) : Ba_featuresPackage.eINSTANCE);
		Ba_relationsPackageImpl theBa_relationsPackage = (Ba_relationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) instanceof Ba_relationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) : Ba_relationsPackage.eINSTANCE);
		KernelSpicesPackageImpl theKernelSpicesPackage = (KernelSpicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) instanceof KernelSpicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) : KernelSpicesPackage.eINSTANCE);
		ObjectDescriptionModelPackageImpl theObjectDescriptionModelPackage = (ObjectDescriptionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) instanceof ObjectDescriptionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) : ObjectDescriptionModelPackage.eINSTANCE);

		// Create package meta-data objects
		theADELE_RelationsPackage.createPackageContents();
		theADELE_ComponentsPackage.createPackageContents();
		theADELE_FeaturesPackage.createPackageContents();
		theBa_componentsPackage.createPackageContents();
		theBa_featuresPackage.createPackageContents();
		theBa_relationsPackage.createPackageContents();
		theKernelSpicesPackage.createPackageContents();
		theObjectDescriptionModelPackage.createPackageContents();

		// Initialize created meta-data
		theADELE_RelationsPackage.initializePackageContents();
		theADELE_ComponentsPackage.initializePackageContents();
		theADELE_FeaturesPackage.initializePackageContents();
		theBa_componentsPackage.initializePackageContents();
		theBa_featuresPackage.initializePackageContents();
		theBa_relationsPackage.initializePackageContents();
		theKernelSpicesPackage.initializePackageContents();
		theObjectDescriptionModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theADELE_RelationsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ADELE_RelationsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theADELE_RelationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ADELE_RelationsPackage.eNS_URI, theADELE_RelationsPackage);
		return theADELE_RelationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusAccessConnection() {
		return busAccessConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccessConnection() {
		return dataAccessConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventPortConnection() {
		return eventPortConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPortConnection() {
		return dataPortConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDataPortConnection() {
		return eventDataPortConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Multiplicity() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Min() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_OriginalSourceFeature() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_OriginalSinkFeature() {
		return (EReference)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_OriginalSourceSubcomponent() {
		return (EReference)relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_OriginalSinkSubcomponent() {
		return (EReference)relationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Source() {
		return (EReference)relationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Sink() {
		return (EReference)relationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_OwningComponent() {
		return (EReference)relationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_OriginalRelation() {
		return (EReference)relationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessConnection() {
		return accessConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedFeatureConnection() {
		return directedFeatureConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramAccessConnection() {
		return subprogramAccessConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterConnection() {
		return parameterConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramGroupAccessConnection() {
		return subprogramGroupAccessConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureConnection() {
		return abstractFeatureConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureGroupConnection() {
		return featureGroupConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_RelationsFactory getADELE_RelationsFactory() {
		return (ADELE_RelationsFactory)getEFactoryInstance();
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
		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__MULTIPLICITY);
		createEAttribute(relationEClass, RELATION__MIN);
		createEReference(relationEClass, RELATION__ORIGINAL_SOURCE_FEATURE);
		createEReference(relationEClass, RELATION__ORIGINAL_SINK_FEATURE);
		createEReference(relationEClass, RELATION__ORIGINAL_SOURCE_SUBCOMPONENT);
		createEReference(relationEClass, RELATION__ORIGINAL_SINK_SUBCOMPONENT);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__SINK);
		createEReference(relationEClass, RELATION__OWNING_COMPONENT);
		createEReference(relationEClass, RELATION__ORIGINAL_RELATION);

		accessConnectionEClass = createEClass(ACCESS_CONNECTION);

		directedFeatureConnectionEClass = createEClass(DIRECTED_FEATURE_CONNECTION);

		busAccessConnectionEClass = createEClass(BUS_ACCESS_CONNECTION);

		dataAccessConnectionEClass = createEClass(DATA_ACCESS_CONNECTION);

		subprogramAccessConnectionEClass = createEClass(SUBPROGRAM_ACCESS_CONNECTION);

		subprogramGroupAccessConnectionEClass = createEClass(SUBPROGRAM_GROUP_ACCESS_CONNECTION);

		eventPortConnectionEClass = createEClass(EVENT_PORT_CONNECTION);

		dataPortConnectionEClass = createEClass(DATA_PORT_CONNECTION);

		eventDataPortConnectionEClass = createEClass(EVENT_DATA_PORT_CONNECTION);

		parameterConnectionEClass = createEClass(PARAMETER_CONNECTION);

		abstractFeatureConnectionEClass = createEClass(ABSTRACT_FEATURE_CONNECTION);

		featureGroupConnectionEClass = createEClass(FEATURE_GROUP_CONNECTION);
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
		ADELE_FeaturesPackage theADELE_FeaturesPackage = (ADELE_FeaturesPackage)EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI);
		ADELE_ComponentsPackage theADELE_ComponentsPackage = (ADELE_ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationEClass.getESuperTypes().add(theKernelSpicesPackage.getSKRelation());
		accessConnectionEClass.getESuperTypes().add(this.getRelation());
		directedFeatureConnectionEClass.getESuperTypes().add(this.getRelation());
		busAccessConnectionEClass.getESuperTypes().add(this.getAccessConnection());
		dataAccessConnectionEClass.getESuperTypes().add(this.getAccessConnection());
		subprogramAccessConnectionEClass.getESuperTypes().add(this.getAccessConnection());
		subprogramGroupAccessConnectionEClass.getESuperTypes().add(this.getAccessConnection());
		eventPortConnectionEClass.getESuperTypes().add(this.getDirectedFeatureConnection());
		dataPortConnectionEClass.getESuperTypes().add(this.getDirectedFeatureConnection());
		eventDataPortConnectionEClass.getESuperTypes().add(this.getDirectedFeatureConnection());
		parameterConnectionEClass.getESuperTypes().add(this.getDirectedFeatureConnection());
		abstractFeatureConnectionEClass.getESuperTypes().add(this.getDirectedFeatureConnection());
		featureGroupConnectionEClass.getESuperTypes().add(this.getDirectedFeatureConnection());

		// Initialize classes and features; add operations and parameters
		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Multiplicity(), ecorePackage.getEInt(), "multiplicity", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Min(), ecorePackage.getEInt(), "min", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_OriginalSourceFeature(), theADELE_FeaturesPackage.getFeature(), null, "originalSourceFeature", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_OriginalSinkFeature(), theADELE_FeaturesPackage.getFeature(), null, "originalSinkFeature", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_OriginalSourceSubcomponent(), theADELE_ComponentsPackage.getComponent(), null, "originalSourceSubcomponent", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_OriginalSinkSubcomponent(), theADELE_ComponentsPackage.getComponent(), null, "originalSinkSubcomponent", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Source(), theKernelSpicesPackage.getSKObject(), null, "source", null, 1, 1, Relation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Sink(), theKernelSpicesPackage.getSKObject(), null, "sink", null, 1, 1, Relation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_OwningComponent(), theADELE_ComponentsPackage.getComponent(), null, "owningComponent", null, 1, 1, Relation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_OriginalRelation(), this.getRelation(), null, "originalRelation", null, 0, 1, Relation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(relationEClass, ecorePackage.getEInt(), "getMax", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessConnectionEClass, AccessConnection.class, "AccessConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directedFeatureConnectionEClass, DirectedFeatureConnection.class, "DirectedFeatureConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(busAccessConnectionEClass, BusAccessConnection.class, "BusAccessConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAccessConnectionEClass, DataAccessConnection.class, "DataAccessConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramAccessConnectionEClass, SubprogramAccessConnection.class, "SubprogramAccessConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramGroupAccessConnectionEClass, SubprogramGroupAccessConnection.class, "SubprogramGroupAccessConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventPortConnectionEClass, EventPortConnection.class, "EventPortConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPortConnectionEClass, DataPortConnection.class, "DataPortConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventDataPortConnectionEClass, EventDataPortConnection.class, "EventDataPortConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterConnectionEClass, ParameterConnection.class, "ParameterConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractFeatureConnectionEClass, AbstractFeatureConnection.class, "AbstractFeatureConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureGroupConnectionEClass, FeatureGroupConnection.class, "FeatureGroupConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (relationEClass, 
		   source, 
		   new String[] {
			 "constraints", "noSubcomponentFeatureOfFeatureGroupConnectionEnd"
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

} //ADELE_RelationsPackageImpl
