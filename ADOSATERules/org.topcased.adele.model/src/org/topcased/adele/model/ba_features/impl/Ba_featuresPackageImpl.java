/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_featuresPackageImpl.java,v 1.2 2012-03-16 08:05:20 aschach Exp $
 */
package org.topcased.adele.model.ba_features.impl;

import org.eclipse.emf.ecore.EClass;
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
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage;
import org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl;
import org.topcased.adele.model.ba_components.Ba_componentsPackage;
import org.topcased.adele.model.ba_components.impl.Ba_componentsPackageImpl;
import org.topcased.adele.model.ba_features.BAFeature;
import org.topcased.adele.model.ba_features.BAVariable;
import org.topcased.adele.model.ba_features.Ba_featuresFactory;
import org.topcased.adele.model.ba_features.Ba_featuresPackage;
import org.topcased.adele.model.ba_relations.Ba_relationsPackage;
import org.topcased.adele.model.ba_relations.impl.Ba_relationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ba_featuresPackageImpl extends EPackageImpl implements Ba_featuresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baVariableEClass = null;

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
	 * @see org.topcased.adele.model.ba_features.Ba_featuresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ba_featuresPackageImpl() {
		super(eNS_URI, Ba_featuresFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Ba_featuresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ba_featuresPackage init() {
		if (isInited) return (Ba_featuresPackage)EPackage.Registry.INSTANCE.getEPackage(Ba_featuresPackage.eNS_URI);

		// Obtain or create and register package
		Ba_featuresPackageImpl theBa_featuresPackage = (Ba_featuresPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ba_featuresPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ba_featuresPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ADELE_ComponentsPackageImpl theADELE_ComponentsPackage = (ADELE_ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) instanceof ADELE_ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI) : ADELE_ComponentsPackage.eINSTANCE);
		ADELE_FeaturesPackageImpl theADELE_FeaturesPackage = (ADELE_FeaturesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) instanceof ADELE_FeaturesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_FeaturesPackage.eNS_URI) : ADELE_FeaturesPackage.eINSTANCE);
		ADELE_RelationsPackageImpl theADELE_RelationsPackage = (ADELE_RelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) instanceof ADELE_RelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ADELE_RelationsPackage.eNS_URI) : ADELE_RelationsPackage.eINSTANCE);
		Ba_componentsPackageImpl theBa_componentsPackage = (Ba_componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) instanceof Ba_componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_componentsPackage.eNS_URI) : Ba_componentsPackage.eINSTANCE);
		Ba_relationsPackageImpl theBa_relationsPackage = (Ba_relationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) instanceof Ba_relationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ba_relationsPackage.eNS_URI) : Ba_relationsPackage.eINSTANCE);
		KernelSpicesPackageImpl theKernelSpicesPackage = (KernelSpicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) instanceof KernelSpicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelSpicesPackage.eNS_URI) : KernelSpicesPackage.eINSTANCE);
		ObjectDescriptionModelPackageImpl theObjectDescriptionModelPackage = (ObjectDescriptionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) instanceof ObjectDescriptionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectDescriptionModelPackage.eNS_URI) : ObjectDescriptionModelPackage.eINSTANCE);

		// Create package meta-data objects
		theBa_featuresPackage.createPackageContents();
		theADELE_ComponentsPackage.createPackageContents();
		theADELE_FeaturesPackage.createPackageContents();
		theADELE_RelationsPackage.createPackageContents();
		theBa_componentsPackage.createPackageContents();
		theBa_relationsPackage.createPackageContents();
		theKernelSpicesPackage.createPackageContents();
		theObjectDescriptionModelPackage.createPackageContents();

		// Initialize created meta-data
		theBa_featuresPackage.initializePackageContents();
		theADELE_ComponentsPackage.initializePackageContents();
		theADELE_FeaturesPackage.initializePackageContents();
		theADELE_RelationsPackage.initializePackageContents();
		theBa_componentsPackage.initializePackageContents();
		theBa_relationsPackage.initializePackageContents();
		theKernelSpicesPackage.initializePackageContents();
		theObjectDescriptionModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBa_featuresPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ba_featuresPackage.eNS_URI, theBa_featuresPackage);
		return theBa_featuresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAFeature() {
		return baFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAVariable() {
		return baVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAVariable_Type() {
		return (EReference)baVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_featuresFactory getBa_featuresFactory() {
		return (Ba_featuresFactory)getEFactoryInstance();
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
		baFeatureEClass = createEClass(BA_FEATURE);

		baVariableEClass = createEClass(BA_VARIABLE);
		createEReference(baVariableEClass, BA_VARIABLE__TYPE);
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
		ADELE_ComponentsPackage theADELE_ComponentsPackage = (ADELE_ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ADELE_ComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		baFeatureEClass.getESuperTypes().add(theKernelSpicesPackage.getSKFeature());
		baVariableEClass.getESuperTypes().add(this.getBAFeature());

		// Initialize classes and features; add operations and parameters
		initEClass(baFeatureEClass, BAFeature.class, "BAFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baVariableEClass, BAVariable.class, "BAVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBAVariable_Type(), theADELE_ComponentsPackage.getData(), null, "type", null, 1, 1, BAVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Ba_featuresPackageImpl
