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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import org.topcased.adele.model.KernelSpices.KernelSpicesFactory;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.SKFeatureVisibility;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.KernelSpices.SKProperty;
import org.topcased.adele.model.KernelSpices.SKRelation;
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
public class KernelSpicesPackageImpl extends EPackageImpl implements KernelSpicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skHierarchicalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum skFeatureVisibilityEEnum = null;

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
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KernelSpicesPackageImpl() {
		super(eNS_URI, KernelSpicesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KernelSpicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KernelSpicesPackage init() {
		if (isInited) return (KernelSpicesPackage)EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI);

		// Obtain or create and register package
		KernelSpicesPackageImpl theKernelSpicesPackage = (KernelSpicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KernelSpicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KernelSpicesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ADELE_ComponentsPackageImpl theADELE_ComponentsPackage = (ADELE_ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) instanceof ADELE_ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) : ADELE_ComponentsPackage.eINSTANCE);
		ADELE_FeaturesPackageImpl theADELE_FeaturesPackage = (ADELE_FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) instanceof ADELE_FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) : ADELE_FeaturesPackage.eINSTANCE);
		ADELE_RelationsPackageImpl theADELE_RelationsPackage = (ADELE_RelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) instanceof ADELE_RelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) : ADELE_RelationsPackage.eINSTANCE);
		Ba_componentsPackageImpl theBa_componentsPackage = (Ba_componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) instanceof Ba_componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) : Ba_componentsPackage.eINSTANCE);
		Ba_featuresPackageImpl theBa_featuresPackage = (Ba_featuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) instanceof Ba_featuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) : Ba_featuresPackage.eINSTANCE);
		Ba_relationsPackageImpl theBa_relationsPackage = (Ba_relationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) instanceof Ba_relationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) : Ba_relationsPackage.eINSTANCE);
		ObjectDescriptionModelPackageImpl theObjectDescriptionModelPackage = (ObjectDescriptionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) instanceof ObjectDescriptionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) : ObjectDescriptionModelPackage.eINSTANCE);

		// Create package meta-data objects
		theKernelSpicesPackage.createPackageContents();
		theADELE_ComponentsPackage.createPackageContents();
		theADELE_FeaturesPackage.createPackageContents();
		theADELE_RelationsPackage.createPackageContents();
		theBa_componentsPackage.createPackageContents();
		theBa_featuresPackage.createPackageContents();
		theBa_relationsPackage.createPackageContents();
		theObjectDescriptionModelPackage.createPackageContents();

		// Initialize created meta-data
		theKernelSpicesPackage.initializePackageContents();
		theADELE_ComponentsPackage.initializePackageContents();
		theADELE_FeaturesPackage.initializePackageContents();
		theADELE_RelationsPackage.initializePackageContents();
		theBa_componentsPackage.initializePackageContents();
		theBa_featuresPackage.initializePackageContents();
		theBa_relationsPackage.initializePackageContents();
		theObjectDescriptionModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKernelSpicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KernelSpicesPackage.eNS_URI, theKernelSpicesPackage);
		return theKernelSpicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKObject() {
		return skObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKObject_Name() {
		return (EAttribute)skObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKObject_Id() {
		return (EAttribute)skObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKHierarchicalObject() {
		return skHierarchicalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKHierarchicalObject_Level() {
		return (EAttribute)skHierarchicalObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKHierarchicalObject_Properties() {
		return (EReference)skHierarchicalObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKHierarchicalObject_Parent() {
		return (EReference)skHierarchicalObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKHierarchicalObject_Children() {
		return (EReference)skHierarchicalObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKHierarchicalObject_OdSystems() {
		return (EReference)skHierarchicalObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKComponent() {
		return skComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKComponent_Features() {
		return (EReference)skComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKComponent_AuthorizedSubcomponents() {
		return (EAttribute)skComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKComponent_AuthorizedFeatures() {
		return (EAttribute)skComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKFeature() {
		return skFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKFeature_Visibility() {
		return (EAttribute)skFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKFeature_Component() {
		return (EReference)skFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKRelation() {
		return skRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSKRelation_Objects() {
		return (EReference)skRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSKProperty() {
		return skPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSKProperty_Value() {
		return (EAttribute)skPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSKFeatureVisibility() {
		return skFeatureVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelSpicesFactory getKernelSpicesFactory() {
		return (KernelSpicesFactory)getEFactoryInstance();
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
		skObjectEClass = createEClass(SK_OBJECT);
		createEAttribute(skObjectEClass, SK_OBJECT__NAME);
		createEAttribute(skObjectEClass, SK_OBJECT__ID);

		skHierarchicalObjectEClass = createEClass(SK_HIERARCHICAL_OBJECT);
		createEAttribute(skHierarchicalObjectEClass, SK_HIERARCHICAL_OBJECT__LEVEL);
		createEReference(skHierarchicalObjectEClass, SK_HIERARCHICAL_OBJECT__PROPERTIES);
		createEReference(skHierarchicalObjectEClass, SK_HIERARCHICAL_OBJECT__PARENT);
		createEReference(skHierarchicalObjectEClass, SK_HIERARCHICAL_OBJECT__CHILDREN);
		createEReference(skHierarchicalObjectEClass, SK_HIERARCHICAL_OBJECT__OD_SYSTEMS);

		skComponentEClass = createEClass(SK_COMPONENT);
		createEReference(skComponentEClass, SK_COMPONENT__FEATURES);
		createEAttribute(skComponentEClass, SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS);
		createEAttribute(skComponentEClass, SK_COMPONENT__AUTHORIZED_FEATURES);

		skFeatureEClass = createEClass(SK_FEATURE);
		createEAttribute(skFeatureEClass, SK_FEATURE__VISIBILITY);
		createEReference(skFeatureEClass, SK_FEATURE__COMPONENT);

		skRelationEClass = createEClass(SK_RELATION);
		createEReference(skRelationEClass, SK_RELATION__OBJECTS);

		skPropertyEClass = createEClass(SK_PROPERTY);
		createEAttribute(skPropertyEClass, SK_PROPERTY__VALUE);

		// Create enums
		skFeatureVisibilityEEnum = createEEnum(SK_FEATURE_VISIBILITY);
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
		ObjectDescriptionModelPackage theObjectDescriptionModelPackage = (ObjectDescriptionModelPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		skHierarchicalObjectEClass.getESuperTypes().add(this.getSKObject());
		skComponentEClass.getESuperTypes().add(this.getSKHierarchicalObject());
		skFeatureEClass.getESuperTypes().add(this.getSKHierarchicalObject());
		skRelationEClass.getESuperTypes().add(this.getSKHierarchicalObject());
		skPropertyEClass.getESuperTypes().add(this.getSKHierarchicalObject());

		// Initialize classes and features; add operations and parameters
		initEClass(skObjectEClass, SKObject.class, "SKObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSKObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, SKObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSKObject_Id(), ecorePackage.getEString(), "id", null, 1, 1, SKObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(skObjectEClass, ecorePackage.getEBoolean(), "validateName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(skHierarchicalObjectEClass, SKHierarchicalObject.class, "SKHierarchicalObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSKHierarchicalObject_Level(), ecorePackage.getEInt(), "level", null, 1, 1, SKHierarchicalObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSKHierarchicalObject_Properties(), this.getSKProperty(), null, "properties", null, 0, -1, SKHierarchicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSKHierarchicalObject_Parent(), this.getSKHierarchicalObject(), this.getSKHierarchicalObject_Children(), "parent", null, 0, 1, SKHierarchicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSKHierarchicalObject_Children(), this.getSKHierarchicalObject(), this.getSKHierarchicalObject_Parent(), "children", null, 0, -1, SKHierarchicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSKHierarchicalObject_OdSystems(), theObjectDescriptionModelPackage.getSKODSystem(), null, "odSystems", null, 0, -1, SKHierarchicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(skHierarchicalObjectEClass, null, "addChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSKHierarchicalObject(), "p_child", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skHierarchicalObjectEClass, ecorePackage.getEBoolean(), "isRoot", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skHierarchicalObjectEClass, this.getSKHierarchicalObject(), "getNamedChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "p_name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skHierarchicalObjectEClass, null, "getNamedChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "p_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getSKHierarchicalObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(skHierarchicalObjectEClass, null, "findLeveledChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "p_level", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getSKHierarchicalObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(skHierarchicalObjectEClass, ecorePackage.getEBoolean(), "isODSection", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skHierarchicalObjectEClass, ecorePackage.getEBoolean(), "isComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skHierarchicalObjectEClass, ecorePackage.getEBoolean(), "isRelation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skHierarchicalObjectEClass, ecorePackage.getEBoolean(), "isFeature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skHierarchicalObjectEClass, ecorePackage.getEBoolean(), "verify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "p_keyword", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(skHierarchicalObjectEClass, ecorePackage.getEBoolean(), "isTerminal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skHierarchicalObjectEClass, null, "addProperty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skHierarchicalObjectEClass, null, "addProperty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skHierarchicalObjectEClass, null, "setProperty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(skHierarchicalObjectEClass, this.getSKProperty(), "getProperty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(skComponentEClass, SKComponent.class, "SKComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSKComponent_Features(), this.getSKFeature(), this.getSKFeature_Component(), "features", null, 0, -1, SKComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getSKComponent());
		g1.getETypeArguments().add(g2);
		initEAttribute(getSKComponent_AuthorizedSubcomponents(), g1, "authorizedSubcomponents", null, 0, 1, SKComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getSKComponent());
		g1.getETypeArguments().add(g2);
		initEAttribute(getSKComponent_AuthorizedFeatures(), g1, "authorizedFeatures", null, 0, 1, SKComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(skComponentEClass, this.getSKFeature(), "getNamedFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "p_name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(skFeatureEClass, SKFeature.class, "SKFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSKFeature_Visibility(), this.getSKFeatureVisibility(), "visibility", null, 1, 1, SKFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSKFeature_Component(), this.getSKComponent(), this.getSKComponent_Features(), "component", null, 0, 1, SKFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skRelationEClass, SKRelation.class, "SKRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSKRelation_Objects(), this.getSKObject(), null, "objects", null, 2, 2, SKRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skPropertyEClass, SKProperty.class, "SKProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSKProperty_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, SKProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(skFeatureVisibilityEEnum, SKFeatureVisibility.class, "SKFeatureVisibility");
		addEEnumLiteral(skFeatureVisibilityEEnum, SKFeatureVisibility.PROVIDED_LITERAL);
		addEEnumLiteral(skFeatureVisibilityEEnum, SKFeatureVisibility.INTERNAL_LITERAL);
		addEEnumLiteral(skFeatureVisibilityEEnum, SKFeatureVisibility.REQUIRED_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //KernelSpicesPackageImpl
