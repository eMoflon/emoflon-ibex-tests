/**
 */
package MetamodelInheritance3.impl;

import MetamodelInheritance.MetamodelInheritancePackage;

import MetamodelInheritance2.MetamodelInheritance2Package;

import MetamodelInheritance3.ChildC;
import MetamodelInheritance3.ChildD;
import MetamodelInheritance3.MetamodelInheritance3Factory;
import MetamodelInheritance3.MetamodelInheritance3Package;

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
public class MetamodelInheritance3PackageImpl extends EPackageImpl implements MetamodelInheritance3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childDEClass = null;

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
	 * @see MetamodelInheritance3.MetamodelInheritance3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodelInheritance3PackageImpl() {
		super(eNS_URI, MetamodelInheritance3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetamodelInheritance3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetamodelInheritance3Package init() {
		if (isInited)
			return (MetamodelInheritance3Package) EPackage.Registry.INSTANCE
					.getEPackage(MetamodelInheritance3Package.eNS_URI);

		// Obtain or create and register package
		Object registeredMetamodelInheritance3Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetamodelInheritance3PackageImpl theMetamodelInheritance3Package = registeredMetamodelInheritance3Package instanceof MetamodelInheritance3PackageImpl
				? (MetamodelInheritance3PackageImpl) registeredMetamodelInheritance3Package
				: new MetamodelInheritance3PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MetamodelInheritance2Package.eINSTANCE.eClass();
		MetamodelInheritancePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetamodelInheritance3Package.createPackageContents();

		// Initialize created meta-data
		theMetamodelInheritance3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetamodelInheritance3Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetamodelInheritance3Package.eNS_URI, theMetamodelInheritance3Package);
		return theMetamodelInheritance3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildC() {
		return childCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildC_D() {
		return (EReference) childCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildD() {
		return childDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildD_C() {
		return (EReference) childDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildD_A() {
		return (EReference) childDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelInheritance3Factory getMetamodelInheritance3Factory() {
		return (MetamodelInheritance3Factory) getEFactoryInstance();
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
		childCEClass = createEClass(CHILD_C);
		createEReference(childCEClass, CHILD_C__D);

		childDEClass = createEClass(CHILD_D);
		createEReference(childDEClass, CHILD_D__C);
		createEReference(childDEClass, CHILD_D__A);
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
		MetamodelInheritance2Package theMetamodelInheritance2Package = (MetamodelInheritance2Package) EPackage.Registry.INSTANCE
				.getEPackage(MetamodelInheritance2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		childCEClass.getESuperTypes().add(theMetamodelInheritancePackage.getBaseContaineeC());
		childDEClass.getESuperTypes().add(theMetamodelInheritance2Package.getChildContaineeD());

		// Initialize classes, features, and operations; add parameters
		initEClass(childCEClass, ChildC.class, "ChildC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildC_D(), this.getChildD(), this.getChildD_C(), "d", null, 0, -1, ChildC.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childDEClass, ChildD.class, "ChildD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildD_C(), this.getChildC(), this.getChildC_D(), "c", null, 0, -1, ChildD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildD_A(), theMetamodelInheritancePackage.getBaseContaineeA(), null, "a", null, 0, -1,
				ChildD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MetamodelInheritance3PackageImpl
