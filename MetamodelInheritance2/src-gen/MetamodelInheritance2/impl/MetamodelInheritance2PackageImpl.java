/**
 */
package MetamodelInheritance2.impl;

import MetamodelInheritance.MetamodelInheritancePackage;

import MetamodelInheritance2.ChildA;
import MetamodelInheritance2.ChildB;
import MetamodelInheritance2.ChildContaineeD;
import MetamodelInheritance2.MetamodelInheritance2Factory;
import MetamodelInheritance2.MetamodelInheritance2Package;

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
public class MetamodelInheritance2PackageImpl extends EPackageImpl implements MetamodelInheritance2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childContaineeDEClass = null;

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
	 * @see MetamodelInheritance2.MetamodelInheritance2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodelInheritance2PackageImpl() {
		super(eNS_URI, MetamodelInheritance2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetamodelInheritance2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetamodelInheritance2Package init() {
		if (isInited)
			return (MetamodelInheritance2Package) EPackage.Registry.INSTANCE
					.getEPackage(MetamodelInheritance2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredMetamodelInheritance2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetamodelInheritance2PackageImpl theMetamodelInheritance2Package = registeredMetamodelInheritance2Package instanceof MetamodelInheritance2PackageImpl
				? (MetamodelInheritance2PackageImpl) registeredMetamodelInheritance2Package
				: new MetamodelInheritance2PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MetamodelInheritancePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetamodelInheritance2Package.createPackageContents();

		// Initialize created meta-data
		theMetamodelInheritance2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetamodelInheritance2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetamodelInheritance2Package.eNS_URI, theMetamodelInheritance2Package);
		return theMetamodelInheritance2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildA() {
		return childAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildA_B() {
		return (EReference) childAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildA_ChildD() {
		return (EReference) childAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildA_C() {
		return (EReference) childAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildB() {
		return childBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildB_A() {
		return (EReference) childBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildB_D() {
		return (EReference) childBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildContaineeD() {
		return childContaineeDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelInheritance2Factory getMetamodelInheritance2Factory() {
		return (MetamodelInheritance2Factory) getEFactoryInstance();
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
		childAEClass = createEClass(CHILD_A);
		createEReference(childAEClass, CHILD_A__B);
		createEReference(childAEClass, CHILD_A__CHILD_D);
		createEReference(childAEClass, CHILD_A__C);

		childBEClass = createEClass(CHILD_B);
		createEReference(childBEClass, CHILD_B__A);
		createEReference(childBEClass, CHILD_B__D);

		childContaineeDEClass = createEClass(CHILD_CONTAINEE_D);
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

		// Obtain other dependent packages
		MetamodelInheritancePackage theMetamodelInheritancePackage = (MetamodelInheritancePackage) EPackage.Registry.INSTANCE
				.getEPackage(MetamodelInheritancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		childAEClass.getESuperTypes().add(theMetamodelInheritancePackage.getBaseContaineeA());
		childBEClass.getESuperTypes().add(theMetamodelInheritancePackage.getBaseContaineeB());

		// Initialize classes, features, and operations; add parameters
		initEClass(childAEClass, ChildA.class, "ChildA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildA_B(), this.getChildB(), null, "b", null, 0, -1, ChildA.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getChildA_ChildD(), this.getChildContaineeD(), null, "childD", null, 0, -1, ChildA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildA_C(), theMetamodelInheritancePackage.getBaseContaineeC(), null, "c", null, 0, -1,
				ChildA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childBEClass, ChildB.class, "ChildB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildB_A(), this.getChildA(), null, "a", null, 0, -1, ChildB.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getChildB_D(), this.getChildContaineeD(), null, "d", null, 0, -1, ChildB.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(childContaineeDEClass, ChildContaineeD.class, "ChildContaineeD", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MetamodelInheritance2PackageImpl
