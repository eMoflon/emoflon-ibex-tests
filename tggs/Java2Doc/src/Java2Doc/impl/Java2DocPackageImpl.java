/**
 */
package Java2Doc.impl;

import Java2Doc.Class2Doc;
import Java2Doc.Java2DocFactory;
import Java2Doc.Java2DocPackage;
import Java2Doc.Package2Folder;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleDoc.SimpleDocPackage;

import simpleJava.SimpleJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Java2DocPackageImpl extends EPackageImpl implements Java2DocPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package2FolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class2DocEClass = null;

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
	 * @see Java2Doc.Java2DocPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Java2DocPackageImpl() {
		super(eNS_URI, Java2DocFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Java2DocPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Java2DocPackage init() {
		if (isInited) return (Java2DocPackage)EPackage.Registry.INSTANCE.getEPackage(Java2DocPackage.eNS_URI);

		// Obtain or create and register package
		Java2DocPackageImpl theJava2DocPackage = (Java2DocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Java2DocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Java2DocPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimpleDocPackage.eINSTANCE.eClass();
		SimpleJavaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJava2DocPackage.createPackageContents();

		// Initialize created meta-data
		theJava2DocPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJava2DocPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Java2DocPackage.eNS_URI, theJava2DocPackage);
		return theJava2DocPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage2Folder() {
		return package2FolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage2Folder_Source() {
		return (EReference)package2FolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage2Folder_Target() {
		return (EReference)package2FolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass2Doc() {
		return class2DocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass2Doc_Source() {
		return (EReference)class2DocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass2Doc_Target() {
		return (EReference)class2DocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2DocFactory getJava2DocFactory() {
		return (Java2DocFactory)getEFactoryInstance();
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
		package2FolderEClass = createEClass(PACKAGE2_FOLDER);
		createEReference(package2FolderEClass, PACKAGE2_FOLDER__SOURCE);
		createEReference(package2FolderEClass, PACKAGE2_FOLDER__TARGET);

		class2DocEClass = createEClass(CLASS2_DOC);
		createEReference(class2DocEClass, CLASS2_DOC__SOURCE);
		createEReference(class2DocEClass, CLASS2_DOC__TARGET);
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
		SimpleJavaPackage theSimpleJavaPackage = (SimpleJavaPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleJavaPackage.eNS_URI);
		SimpleDocPackage theSimpleDocPackage = (SimpleDocPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleDocPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(package2FolderEClass, Package2Folder.class, "Package2Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage2Folder_Source(), theSimpleJavaPackage.getPackage(), null, "source", null, 0, 1, Package2Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage2Folder_Target(), theSimpleDocPackage.getFolder(), null, "target", null, 0, 1, Package2Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(class2DocEClass, Class2Doc.class, "Class2Doc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass2Doc_Source(), theSimpleJavaPackage.getClass_(), null, "source", null, 0, 1, Class2Doc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass2Doc_Target(), theSimpleDocPackage.getDoc(), null, "target", null, 0, 1, Class2Doc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Java2DocPackageImpl
