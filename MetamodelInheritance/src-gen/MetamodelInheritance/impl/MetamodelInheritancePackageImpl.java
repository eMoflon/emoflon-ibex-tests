/**
 */
package MetamodelInheritance.impl;

import MetamodelInheritance.BaseContaineeA;
import MetamodelInheritance.BaseContaineeB;
import MetamodelInheritance.BaseContaineeC;
import MetamodelInheritance.BaseContainer;
import MetamodelInheritance.MetamodelInheritanceFactory;
import MetamodelInheritance.MetamodelInheritancePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelInheritancePackageImpl extends EPackageImpl implements MetamodelInheritancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseContaineeAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseContaineeBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseContaineeCEClass = null;

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
	 * @see MetamodelInheritance.MetamodelInheritancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodelInheritancePackageImpl() {
		super(eNS_URI, MetamodelInheritanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetamodelInheritancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetamodelInheritancePackage init() {
		if (isInited)
			return (MetamodelInheritancePackage) EPackage.Registry.INSTANCE
					.getEPackage(MetamodelInheritancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetamodelInheritancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetamodelInheritancePackageImpl theMetamodelInheritancePackage = registeredMetamodelInheritancePackage instanceof MetamodelInheritancePackageImpl
				? (MetamodelInheritancePackageImpl) registeredMetamodelInheritancePackage
				: new MetamodelInheritancePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetamodelInheritancePackage.createPackageContents();

		// Initialize created meta-data
		theMetamodelInheritancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetamodelInheritancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetamodelInheritancePackage.eNS_URI, theMetamodelInheritancePackage);
		return theMetamodelInheritancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseContainer() {
		return baseContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseContainer_BaseA() {
		return (EReference) baseContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseContainer_BaseB() {
		return (EReference) baseContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseContainer_BaseC() {
		return (EReference) baseContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseContaineeA() {
		return baseContaineeAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseContaineeB() {
		return baseContaineeBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseContaineeC() {
		return baseContaineeCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelInheritanceFactory getMetamodelInheritanceFactory() {
		return (MetamodelInheritanceFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		baseContainerEClass = createEClass(BASE_CONTAINER);
		createEReference(baseContainerEClass, BASE_CONTAINER__BASE_A);
		createEReference(baseContainerEClass, BASE_CONTAINER__BASE_B);
		createEReference(baseContainerEClass, BASE_CONTAINER__BASE_C);

		baseContaineeAEClass = createEClass(BASE_CONTAINEE_A);

		baseContaineeBEClass = createEClass(BASE_CONTAINEE_B);

		baseContaineeCEClass = createEClass(BASE_CONTAINEE_C);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(baseContainerEClass, BaseContainer.class, "BaseContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseContainer_BaseA(), this.getBaseContaineeA(), null, "baseA", null, 0, -1,
				BaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseContainer_BaseB(), this.getBaseContaineeB(), null, "baseB", null, 0, -1,
				BaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseContainer_BaseC(), this.getBaseContaineeC(), null, "baseC", null, 0, -1,
				BaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseContaineeAEClass, BaseContaineeA.class, "BaseContaineeA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseContaineeBEClass, BaseContaineeB.class, "BaseContaineeB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseContaineeCEClass, BaseContaineeC.class, "BaseContaineeC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MetamodelInheritancePackageImpl
