/**
 */
package glossarDocumentation.impl;

import glossarDocumentation.Document;
import glossarDocumentation.DocumentationContainer;
import glossarDocumentation.Entry;
import glossarDocumentation.EntryType;
import glossarDocumentation.Glossar;
import glossarDocumentation.GlossarDocumentationFactory;
import glossarDocumentation.GlossarDocumentationPackage;
import glossarDocumentation.GlossarEntry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossarDocumentationPackageImpl extends EPackageImpl implements GlossarDocumentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossarEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entryTypeEEnum = null;

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
	 * @see glossarDocumentation.GlossarDocumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GlossarDocumentationPackageImpl() {
		super(eNS_URI, GlossarDocumentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GlossarDocumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GlossarDocumentationPackage init() {
		if (isInited)
			return (GlossarDocumentationPackage) EPackage.Registry.INSTANCE
					.getEPackage(GlossarDocumentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGlossarDocumentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GlossarDocumentationPackageImpl theGlossarDocumentationPackage = registeredGlossarDocumentationPackage instanceof GlossarDocumentationPackageImpl
				? (GlossarDocumentationPackageImpl) registeredGlossarDocumentationPackage
				: new GlossarDocumentationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGlossarDocumentationPackage.createPackageContents();

		// Initialize created meta-data
		theGlossarDocumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGlossarDocumentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GlossarDocumentationPackage.eNS_URI, theGlossarDocumentationPackage);
		return theGlossarDocumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_Entries() {
		return (EReference) documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_Name() {
		return (EAttribute) documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_HyperRefs() {
		return (EReference) documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlossar() {
		return glossarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlossar_Entries() {
		return (EReference) glossarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlossarEntry() {
		return glossarEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlossarEntry_Value() {
		return (EAttribute) glossarEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntry_Type() {
		return (EAttribute) entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntry_Glossarentries() {
		return (EReference) entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntry_Name() {
		return (EAttribute) entryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentationContainer() {
		return documentationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentationContainer_Documents() {
		return (EReference) documentationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentationContainer_Glossar() {
		return (EReference) documentationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEntryType() {
		return entryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossarDocumentationFactory getGlossarDocumentationFactory() {
		return (GlossarDocumentationFactory) getEFactoryInstance();
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
		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__ENTRIES);
		createEAttribute(documentEClass, DOCUMENT__NAME);
		createEReference(documentEClass, DOCUMENT__HYPER_REFS);

		glossarEClass = createEClass(GLOSSAR);
		createEReference(glossarEClass, GLOSSAR__ENTRIES);

		glossarEntryEClass = createEClass(GLOSSAR_ENTRY);
		createEAttribute(glossarEntryEClass, GLOSSAR_ENTRY__VALUE);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__TYPE);
		createEReference(entryEClass, ENTRY__GLOSSARENTRIES);
		createEAttribute(entryEClass, ENTRY__NAME);

		documentationContainerEClass = createEClass(DOCUMENTATION_CONTAINER);
		createEReference(documentationContainerEClass, DOCUMENTATION_CONTAINER__DOCUMENTS);
		createEReference(documentationContainerEClass, DOCUMENTATION_CONTAINER__GLOSSAR);

		// Create enums
		entryTypeEEnum = createEEnum(ENTRY_TYPE);
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
		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Entries(), this.getEntry(), null, "entries", null, 0, -1, Document.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Document.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_HyperRefs(), this.getDocument(), null, "hyperRefs", null, 0, -1, Document.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glossarEClass, Glossar.class, "Glossar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlossar_Entries(), this.getGlossarEntry(), null, "entries", null, 0, -1, Glossar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glossarEntryEClass, GlossarEntry.class, "GlossarEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlossarEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, GlossarEntry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Type(), this.getEntryType(), "type", null, 0, 1, Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntry_Glossarentries(), this.getGlossarEntry(), null, "glossarentries", null, 0, -1,
				Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationContainerEClass, DocumentationContainer.class, "DocumentationContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentationContainer_Documents(), this.getDocument(), null, "documents", null, 0, -1,
				DocumentationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentationContainer_Glossar(), this.getGlossar(), null, "glossar", null, 1, 1,
				DocumentationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(entryTypeEEnum, EntryType.class, "EntryType");
		addEEnumLiteral(entryTypeEEnum, EntryType.FIELD);
		addEEnumLiteral(entryTypeEEnum, EntryType.METHOD);

		// Create resource
		createResource(eNS_URI);
	}

} //GlossarDocumentationPackageImpl
