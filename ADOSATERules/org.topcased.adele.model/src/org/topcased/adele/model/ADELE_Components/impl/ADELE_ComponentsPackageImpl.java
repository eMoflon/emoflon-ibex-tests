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
package org.topcased.adele.model.ADELE_Components.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsFactory;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage;
import org.topcased.adele.model.ADELE_Components.Abstract;
import org.topcased.adele.model.ADELE_Components.Bus;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Components.Data;
import org.topcased.adele.model.ADELE_Components.Device;
import org.topcased.adele.model.ADELE_Components.Memory;
import org.topcased.adele.model.ADELE_Components.Processor;
import org.topcased.adele.model.ADELE_Components.Subprogram;
import org.topcased.adele.model.ADELE_Components.SubprogramGroup;
import org.topcased.adele.model.ADELE_Components.VirtualBus;
import org.topcased.adele.model.ADELE_Components.VirtualProcessor;
import org.topcased.adele.model.ADELE_Components.util.ADELE_ComponentsValidator;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl;
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
public class ADELE_ComponentsPackageImpl extends EPackageImpl implements ADELE_ComponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBusEClass = null;

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
	 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ADELE_ComponentsPackageImpl() {
		super(eNS_URI, ADELE_ComponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ADELE_ComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ADELE_ComponentsPackage init() {
		if (isInited) return (ADELE_ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI);

		// Obtain or create and register package
		ADELE_ComponentsPackageImpl theADELE_ComponentsPackage = (ADELE_ComponentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ADELE_ComponentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ADELE_ComponentsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ADELE_FeaturesPackageImpl theADELE_FeaturesPackage = (ADELE_FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) instanceof ADELE_FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) : ADELE_FeaturesPackage.eINSTANCE);
		ADELE_RelationsPackageImpl theADELE_RelationsPackage = (ADELE_RelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) instanceof ADELE_RelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) : ADELE_RelationsPackage.eINSTANCE);
		Ba_componentsPackageImpl theBa_componentsPackage = (Ba_componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) instanceof Ba_componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) : Ba_componentsPackage.eINSTANCE);
		Ba_featuresPackageImpl theBa_featuresPackage = (Ba_featuresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) instanceof Ba_featuresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI) : Ba_featuresPackage.eINSTANCE);
		Ba_relationsPackageImpl theBa_relationsPackage = (Ba_relationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) instanceof Ba_relationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) : Ba_relationsPackage.eINSTANCE);
		KernelSpicesPackageImpl theKernelSpicesPackage = (KernelSpicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) instanceof KernelSpicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) : KernelSpicesPackage.eINSTANCE);
		ObjectDescriptionModelPackageImpl theObjectDescriptionModelPackage = (ObjectDescriptionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) instanceof ObjectDescriptionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) : ObjectDescriptionModelPackage.eINSTANCE);

		// Create package meta-data objects
		theADELE_ComponentsPackage.createPackageContents();
		theADELE_FeaturesPackage.createPackageContents();
		theADELE_RelationsPackage.createPackageContents();
		theBa_componentsPackage.createPackageContents();
		theBa_featuresPackage.createPackageContents();
		theBa_relationsPackage.createPackageContents();
		theKernelSpicesPackage.createPackageContents();
		theObjectDescriptionModelPackage.createPackageContents();

		// Initialize created meta-data
		theADELE_ComponentsPackage.initializePackageContents();
		theADELE_FeaturesPackage.initializePackageContents();
		theADELE_RelationsPackage.initializePackageContents();
		theBa_componentsPackage.initializePackageContents();
		theBa_featuresPackage.initializePackageContents();
		theBa_relationsPackage.initializePackageContents();
		theKernelSpicesPackage.initializePackageContents();
		theObjectDescriptionModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theADELE_ComponentsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ADELE_ComponentsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theADELE_ComponentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ADELE_ComponentsPackage.eNS_URI, theADELE_ComponentsPackage);
		return theADELE_ComponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Multiplicity() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Min() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Type() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Implementation() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ImplementationName() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_FeaturesLock() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_SubcomponentsLock() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Refines() {
		return (EReference)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_SubcomponentRefinement() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_BaTransition() {
		return (EReference)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_EventDataPortConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_EventPortConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_DataPortConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_DataAccessConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_BusAccessConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_SubprogramAccessConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ParameterConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_SubprogramGroupAccessConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AbstractFeatureConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_FeatureGroupConnection() {
		return (EReference)componentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllRefines() {
		return (EReference)componentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_RefinedSubcomponent() {
		return (EReference)componentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllRealFeatures() {
		return (EReference)componentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllRealChildrenComponents() {
		return (EReference)componentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OriginalComponent() {
		return (EReference)componentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllRelations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllRealRelations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllOriginalRelations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_SubcomponentType() {
		return (EReference)componentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogram() {
		return subprogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadGroup() {
		return threadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramGroup() {
		return subprogramGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstract() {
		return abstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualProcessor() {
		return virtualProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualBus() {
		return virtualBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_ComponentsFactory getADELE_ComponentsFactory() {
		return (ADELE_ComponentsFactory)getEFactoryInstance();
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
		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__MULTIPLICITY);
		createEAttribute(componentEClass, COMPONENT__MIN);
		createEReference(componentEClass, COMPONENT__TYPE);
		createEReference(componentEClass, COMPONENT__IMPLEMENTATION);
		createEAttribute(componentEClass, COMPONENT__IMPLEMENTATION_NAME);
		createEAttribute(componentEClass, COMPONENT__FEATURES_LOCK);
		createEAttribute(componentEClass, COMPONENT__SUBCOMPONENTS_LOCK);
		createEReference(componentEClass, COMPONENT__REFINES);
		createEAttribute(componentEClass, COMPONENT__SUBCOMPONENT_REFINEMENT);
		createEReference(componentEClass, COMPONENT__BA_TRANSITION);
		createEReference(componentEClass, COMPONENT__EVENT_DATA_PORT_CONNECTION);
		createEReference(componentEClass, COMPONENT__EVENT_PORT_CONNECTION);
		createEReference(componentEClass, COMPONENT__DATA_PORT_CONNECTION);
		createEReference(componentEClass, COMPONENT__DATA_ACCESS_CONNECTION);
		createEReference(componentEClass, COMPONENT__BUS_ACCESS_CONNECTION);
		createEReference(componentEClass, COMPONENT__SUBPROGRAM_ACCESS_CONNECTION);
		createEReference(componentEClass, COMPONENT__PARAMETER_CONNECTION);
		createEReference(componentEClass, COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION);
		createEReference(componentEClass, COMPONENT__ABSTRACT_FEATURE_CONNECTION);
		createEReference(componentEClass, COMPONENT__FEATURE_GROUP_CONNECTION);
		createEReference(componentEClass, COMPONENT__ALL_REFINES);
		createEReference(componentEClass, COMPONENT__REFINED_SUBCOMPONENT);
		createEReference(componentEClass, COMPONENT__ALL_REAL_FEATURES);
		createEReference(componentEClass, COMPONENT__ALL_REAL_CHILDREN_COMPONENTS);
		createEReference(componentEClass, COMPONENT__ORIGINAL_COMPONENT);
		createEReference(componentEClass, COMPONENT__ALL_RELATIONS);
		createEReference(componentEClass, COMPONENT__ALL_REAL_RELATIONS);
		createEReference(componentEClass, COMPONENT__ALL_ORIGINAL_RELATIONS);
		createEReference(componentEClass, COMPONENT__SUBCOMPONENT_TYPE);

		busEClass = createEClass(BUS);

		packageEClass = createEClass(PACKAGE);

		dataEClass = createEClass(DATA);

		deviceEClass = createEClass(DEVICE);

		memoryEClass = createEClass(MEMORY);

		processEClass = createEClass(PROCESS);

		processorEClass = createEClass(PROCESSOR);

		subprogramEClass = createEClass(SUBPROGRAM);

		systemEClass = createEClass(SYSTEM);

		threadEClass = createEClass(THREAD);

		threadGroupEClass = createEClass(THREAD_GROUP);

		subprogramGroupEClass = createEClass(SUBPROGRAM_GROUP);

		abstractEClass = createEClass(ABSTRACT);

		virtualProcessorEClass = createEClass(VIRTUAL_PROCESSOR);

		virtualBusEClass = createEClass(VIRTUAL_BUS);
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
		Ba_relationsPackage theBa_relationsPackage = (Ba_relationsPackage)EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI);
		ADELE_RelationsPackage theADELE_RelationsPackage = (ADELE_RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theKernelSpicesPackage.getSKComponent());
		busEClass.getESuperTypes().add(this.getComponent());
		packageEClass.getESuperTypes().add(this.getComponent());
		dataEClass.getESuperTypes().add(this.getComponent());
		deviceEClass.getESuperTypes().add(this.getComponent());
		memoryEClass.getESuperTypes().add(this.getComponent());
		processEClass.getESuperTypes().add(this.getComponent());
		processorEClass.getESuperTypes().add(this.getComponent());
		subprogramEClass.getESuperTypes().add(this.getComponent());
		systemEClass.getESuperTypes().add(this.getComponent());
		threadEClass.getESuperTypes().add(this.getComponent());
		threadGroupEClass.getESuperTypes().add(this.getComponent());
		subprogramGroupEClass.getESuperTypes().add(this.getComponent());
		abstractEClass.getESuperTypes().add(this.getComponent());
		virtualProcessorEClass.getESuperTypes().add(this.getComponent());
		virtualBusEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Multiplicity(), ecorePackage.getEInt(), "multiplicity", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Min(), ecorePackage.getEInt(), "min", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Type(), this.getComponent(), null, "type", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Implementation(), this.getComponent(), null, "implementation", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ImplementationName(), ecorePackage.getEString(), "implementationName", "", 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_FeaturesLock(), ecorePackage.getEBoolean(), "featuresLock", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_SubcomponentsLock(), ecorePackage.getEBoolean(), "subcomponentsLock", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Refines(), this.getComponent(), null, "refines", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_SubcomponentRefinement(), ecorePackage.getEBoolean(), "subcomponentRefinement", "false", 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_BaTransition(), theBa_relationsPackage.getBATransition(), null, "baTransition", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_EventDataPortConnection(), theADELE_RelationsPackage.getEventDataPortConnection(), null, "eventDataPortConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_EventPortConnection(), theADELE_RelationsPackage.getEventPortConnection(), null, "eventPortConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_DataPortConnection(), theADELE_RelationsPackage.getDataPortConnection(), null, "dataPortConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_DataAccessConnection(), theADELE_RelationsPackage.getDataAccessConnection(), null, "dataAccessConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_BusAccessConnection(), theADELE_RelationsPackage.getBusAccessConnection(), null, "busAccessConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_SubprogramAccessConnection(), theADELE_RelationsPackage.getSubprogramAccessConnection(), null, "subprogramAccessConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ParameterConnection(), theADELE_RelationsPackage.getParameterConnection(), null, "parameterConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_SubprogramGroupAccessConnection(), theADELE_RelationsPackage.getSubprogramGroupAccessConnection(), null, "subprogramGroupAccessConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AbstractFeatureConnection(), theADELE_RelationsPackage.getAbstractFeatureConnection(), null, "abstractFeatureConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_FeatureGroupConnection(), theADELE_RelationsPackage.getFeatureGroupConnection(), null, "featureGroupConnection", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllRefines(), this.getComponent(), null, "allRefines", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_RefinedSubcomponent(), this.getComponent(), null, "refinedSubcomponent", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllRealFeatures(), theKernelSpicesPackage.getSKFeature(), null, "allRealFeatures", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllRealChildrenComponents(), theKernelSpicesPackage.getSKComponent(), null, "allRealChildrenComponents", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OriginalComponent(), this.getComponent(), null, "originalComponent", null, 0, 1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllRelations(), theADELE_RelationsPackage.getRelation(), null, "allRelations", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllRealRelations(), theADELE_RelationsPackage.getRelation(), null, "allRealRelations", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllOriginalRelations(), theADELE_RelationsPackage.getRelation(), null, "allOriginalRelations", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_SubcomponentType(), this.getComponent(), null, "subcomponentType", null, 0, 1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(componentEClass, ecorePackage.getEInt(), "getMax", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentEClass, this.getComponent(), "getClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentEClass, ecorePackage.getEBoolean(), "isType", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentEClass, ecorePackage.getEBoolean(), "isImplementation", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentEClass, ecorePackage.getEBoolean(), "isInstance", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentEClass, ecorePackage.getEBoolean(), "isClassifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentEClass, ecorePackage.getEBoolean(), "isSubcomponent", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, org.topcased.adele.model.ADELE_Components.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processEClass, org.topcased.adele.model.ADELE_Components.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramEClass, Subprogram.class, "Subprogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, org.topcased.adele.model.ADELE_Components.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadEClass, org.topcased.adele.model.ADELE_Components.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadGroupEClass, org.topcased.adele.model.ADELE_Components.ThreadGroup.class, "ThreadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramGroupEClass, SubprogramGroup.class, "SubprogramGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualProcessorEClass, VirtualProcessor.class, "VirtualProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualBusEClass, VirtualBus.class, "VirtualBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (componentEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueChildrenNames legalName legalChildren"
		   });
	}
	
	// DB: Find a better way to remove the ADELE prefix
//	
//	@Override
//	protected EClass initEClass(EClass c, Class<?> instanceClass, String _name,
//			boolean isAbstract, boolean isInterface, boolean isGenerated) {
//		if (_name.startsWith("ADELE_")) {
//			_name = _name.substring(6);
//		}
//		return super.initEClass(c, instanceClass, _name, isAbstract, isInterface,
//				isGenerated);
//	}

} //ADELE_ComponentsPackageImpl
