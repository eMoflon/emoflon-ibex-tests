/**
 */
package glossarDocumentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see glossarDocumentation.GlossarDocumentationFactory
 * @model kind="package"
 * @generated
 */
public interface GlossarDocumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "glossarDocumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/GlossarDocumentation/model/glossarDocumentation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GlossarDocumentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlossarDocumentationPackage eINSTANCE = glossarDocumentation.impl.GlossarDocumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link glossarDocumentation.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossarDocumentation.impl.DocumentImpl
	 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hyper Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__HYPER_REFS = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ENTRIES = 3;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link glossarDocumentation.impl.GlossarImpl <em>Glossar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossarDocumentation.impl.GlossarImpl
	 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getGlossar()
	 * @generated
	 */
	int GLOSSAR = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR__ENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Glossar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Glossar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link glossarDocumentation.impl.GlossarEntryImpl <em>Glossar Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossarDocumentation.impl.GlossarEntryImpl
	 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getGlossarEntry()
	 * @generated
	 */
	int GLOSSAR_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR_ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Glossar</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR_ENTRY__GLOSSAR = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR_ENTRY__ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Glossar Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Glossar Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSAR_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link glossarDocumentation.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossarDocumentation.impl.EntryImpl
	 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Glossarentries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__GLOSSARENTRIES = 3;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link glossarDocumentation.impl.DocumentationContainerImpl <em>Documentation Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossarDocumentation.impl.DocumentationContainerImpl
	 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getDocumentationContainer()
	 * @generated
	 */
	int DOCUMENTATION_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Glossar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_CONTAINER__GLOSSAR = 0;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_CONTAINER__DOCUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Documentation Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Documentation Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link glossarDocumentation.EntryType <em>Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossarDocumentation.EntryType
	 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 5;

	/**
	 * Returns the meta object for class '{@link glossarDocumentation.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see glossarDocumentation.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link glossarDocumentation.Document#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see glossarDocumentation.Document#getEntries()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Entries();

	/**
	 * Returns the meta object for the attribute '{@link glossarDocumentation.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see glossarDocumentation.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the reference list '{@link glossarDocumentation.Document#getHyperRefs <em>Hyper Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hyper Refs</em>'.
	 * @see glossarDocumentation.Document#getHyperRefs()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_HyperRefs();

	/**
	 * Returns the meta object for the container reference '{@link glossarDocumentation.Document#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see glossarDocumentation.Document#getContainer()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Container();

	/**
	 * Returns the meta object for class '{@link glossarDocumentation.Glossar <em>Glossar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossar</em>'.
	 * @see glossarDocumentation.Glossar
	 * @generated
	 */
	EClass getGlossar();

	/**
	 * Returns the meta object for the container reference '{@link glossarDocumentation.Glossar#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see glossarDocumentation.Glossar#getContainer()
	 * @see #getGlossar()
	 * @generated
	 */
	EReference getGlossar_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link glossarDocumentation.Glossar#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see glossarDocumentation.Glossar#getEntries()
	 * @see #getGlossar()
	 * @generated
	 */
	EReference getGlossar_Entries();

	/**
	 * Returns the meta object for class '{@link glossarDocumentation.GlossarEntry <em>Glossar Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossar Entry</em>'.
	 * @see glossarDocumentation.GlossarEntry
	 * @generated
	 */
	EClass getGlossarEntry();

	/**
	 * Returns the meta object for the attribute '{@link glossarDocumentation.GlossarEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see glossarDocumentation.GlossarEntry#getValue()
	 * @see #getGlossarEntry()
	 * @generated
	 */
	EAttribute getGlossarEntry_Value();

	/**
	 * Returns the meta object for the container reference '{@link glossarDocumentation.GlossarEntry#getGlossar <em>Glossar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Glossar</em>'.
	 * @see glossarDocumentation.GlossarEntry#getGlossar()
	 * @see #getGlossarEntry()
	 * @generated
	 */
	EReference getGlossarEntry_Glossar();

	/**
	 * Returns the meta object for the reference list '{@link glossarDocumentation.GlossarEntry#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entries</em>'.
	 * @see glossarDocumentation.GlossarEntry#getEntries()
	 * @see #getGlossarEntry()
	 * @generated
	 */
	EReference getGlossarEntry_Entries();

	/**
	 * Returns the meta object for class '{@link glossarDocumentation.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see glossarDocumentation.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link glossarDocumentation.Entry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see glossarDocumentation.Entry#getType()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Type();

	/**
	 * Returns the meta object for the reference list '{@link glossarDocumentation.Entry#getGlossarentries <em>Glossarentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Glossarentries</em>'.
	 * @see glossarDocumentation.Entry#getGlossarentries()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Glossarentries();

	/**
	 * Returns the meta object for the attribute '{@link glossarDocumentation.Entry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see glossarDocumentation.Entry#getName()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Name();

	/**
	 * Returns the meta object for the container reference '{@link glossarDocumentation.Entry#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see glossarDocumentation.Entry#getDocument()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Document();

	/**
	 * Returns the meta object for class '{@link glossarDocumentation.DocumentationContainer <em>Documentation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Container</em>'.
	 * @see glossarDocumentation.DocumentationContainer
	 * @generated
	 */
	EClass getDocumentationContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link glossarDocumentation.DocumentationContainer#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see glossarDocumentation.DocumentationContainer#getDocuments()
	 * @see #getDocumentationContainer()
	 * @generated
	 */
	EReference getDocumentationContainer_Documents();

	/**
	 * Returns the meta object for the containment reference '{@link glossarDocumentation.DocumentationContainer#getGlossar <em>Glossar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glossar</em>'.
	 * @see glossarDocumentation.DocumentationContainer#getGlossar()
	 * @see #getDocumentationContainer()
	 * @generated
	 */
	EReference getDocumentationContainer_Glossar();

	/**
	 * Returns the meta object for enum '{@link glossarDocumentation.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Type</em>'.
	 * @see glossarDocumentation.EntryType
	 * @generated
	 */
	EEnum getEntryType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlossarDocumentationFactory getGlossarDocumentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link glossarDocumentation.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossarDocumentation.impl.DocumentImpl
		 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ENTRIES = eINSTANCE.getDocument_Entries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Hyper Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__HYPER_REFS = eINSTANCE.getDocument_HyperRefs();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__CONTAINER = eINSTANCE.getDocument_Container();

		/**
		 * The meta object literal for the '{@link glossarDocumentation.impl.GlossarImpl <em>Glossar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossarDocumentation.impl.GlossarImpl
		 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getGlossar()
		 * @generated
		 */
		EClass GLOSSAR = eINSTANCE.getGlossar();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSAR__CONTAINER = eINSTANCE.getGlossar_Container();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSAR__ENTRIES = eINSTANCE.getGlossar_Entries();

		/**
		 * The meta object literal for the '{@link glossarDocumentation.impl.GlossarEntryImpl <em>Glossar Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossarDocumentation.impl.GlossarEntryImpl
		 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getGlossarEntry()
		 * @generated
		 */
		EClass GLOSSAR_ENTRY = eINSTANCE.getGlossarEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSAR_ENTRY__VALUE = eINSTANCE.getGlossarEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Glossar</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSAR_ENTRY__GLOSSAR = eINSTANCE.getGlossarEntry_Glossar();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSAR_ENTRY__ENTRIES = eINSTANCE.getGlossarEntry_Entries();

		/**
		 * The meta object literal for the '{@link glossarDocumentation.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossarDocumentation.impl.EntryImpl
		 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TYPE = eINSTANCE.getEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Glossarentries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__GLOSSARENTRIES = eINSTANCE.getEntry_Glossarentries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__NAME = eINSTANCE.getEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__DOCUMENT = eINSTANCE.getEntry_Document();

		/**
		 * The meta object literal for the '{@link glossarDocumentation.impl.DocumentationContainerImpl <em>Documentation Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossarDocumentation.impl.DocumentationContainerImpl
		 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getDocumentationContainer()
		 * @generated
		 */
		EClass DOCUMENTATION_CONTAINER = eINSTANCE.getDocumentationContainer();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_CONTAINER__DOCUMENTS = eINSTANCE.getDocumentationContainer_Documents();

		/**
		 * The meta object literal for the '<em><b>Glossar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTATION_CONTAINER__GLOSSAR = eINSTANCE.getDocumentationContainer_Glossar();

		/**
		 * The meta object literal for the '{@link glossarDocumentation.EntryType <em>Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossarDocumentation.EntryType
		 * @see glossarDocumentation.impl.GlossarDocumentationPackageImpl#getEntryType()
		 * @generated
		 */
		EEnum ENTRY_TYPE = eINSTANCE.getEntryType();

	}

} //GlossarDocumentationPackage
