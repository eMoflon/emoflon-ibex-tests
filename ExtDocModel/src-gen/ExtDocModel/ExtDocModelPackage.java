/**
 */
package ExtDocModel;

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
 * @see ExtDocModel.ExtDocModelFactory
 * @model kind="package"
 * @generated
 */
public interface ExtDocModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExtDocModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ExtDocModel/model/ExtDocModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ExtDocModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtDocModelPackage eINSTANCE = ExtDocModel.impl.ExtDocModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ExtDocModel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.impl.NamedElementImpl
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtDocModel.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.impl.FolderImpl
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DOCS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExtDocModel.impl.DocContainerImpl <em>Doc Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.impl.DocContainerImpl
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getDocContainer()
	 * @generated
	 */
	int DOC_CONTAINER = 7;

	/**
	 * The meta object id for the '{@link ExtDocModel.impl.DocImpl <em>Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.impl.DocImpl
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getDoc()
	 * @generated
	 */
	int DOC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__FOLDER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__ENTRIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__SUB_DOCS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC__SUPER_DOCS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExtDocModel.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.impl.EntryImpl
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__DOC = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Glossary Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__GLOSSARY_ENTRIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExtDocModel.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.impl.AnnotationImpl
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtDocModel.impl.GlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.impl.GlossaryImpl
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getGlossary()
	 * @generated
	 */
	int GLOSSARY = 5;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtDocModel.impl.GlossaryEntryImpl <em>Glossary Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.impl.GlossaryEntryImpl
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getGlossaryEntry()
	 * @generated
	 */
	int GLOSSARY_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__GLOSSARY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__ENTRIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glossary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glossary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_CONTAINER__FOLDERS = 0;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_CONTAINER__GLOSSARY = 1;

	/**
	 * The number of structural features of the '<em>Doc Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Doc Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExtDocModel.EntryType <em>Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExtDocModel.EntryType
	 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 8;

	/**
	 * Returns the meta object for class '{@link ExtDocModel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ExtDocModel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ExtDocModel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExtDocModel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ExtDocModel.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see ExtDocModel.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtDocModel.Folder#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Docs</em>'.
	 * @see ExtDocModel.Folder#getDocs()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Docs();

	/**
	 * Returns the meta object for the container reference '{@link ExtDocModel.Folder#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see ExtDocModel.Folder#getContainer()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Container();

	/**
	 * Returns the meta object for class '{@link ExtDocModel.DocContainer <em>Doc Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Container</em>'.
	 * @see ExtDocModel.DocContainer
	 * @generated
	 */
	EClass getDocContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtDocModel.DocContainer#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see ExtDocModel.DocContainer#getFolders()
	 * @see #getDocContainer()
	 * @generated
	 */
	EReference getDocContainer_Folders();

	/**
	 * Returns the meta object for the containment reference '{@link ExtDocModel.DocContainer#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glossary</em>'.
	 * @see ExtDocModel.DocContainer#getGlossary()
	 * @see #getDocContainer()
	 * @generated
	 */
	EReference getDocContainer_Glossary();

	/**
	 * Returns the meta object for class '{@link ExtDocModel.Doc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc</em>'.
	 * @see ExtDocModel.Doc
	 * @generated
	 */
	EClass getDoc();

	/**
	 * Returns the meta object for the container reference '{@link ExtDocModel.Doc#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Folder</em>'.
	 * @see ExtDocModel.Doc#getFolder()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_Folder();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtDocModel.Doc#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see ExtDocModel.Doc#getEntries()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_Entries();

	/**
	 * Returns the meta object for the reference list '{@link ExtDocModel.Doc#getSubDocs <em>Sub Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Docs</em>'.
	 * @see ExtDocModel.Doc#getSubDocs()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_SubDocs();

	/**
	 * Returns the meta object for the reference list '{@link ExtDocModel.Doc#getSuperDocs <em>Super Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Docs</em>'.
	 * @see ExtDocModel.Doc#getSuperDocs()
	 * @see #getDoc()
	 * @generated
	 */
	EReference getDoc_SuperDocs();

	/**
	 * Returns the meta object for class '{@link ExtDocModel.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see ExtDocModel.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the container reference '{@link ExtDocModel.Entry#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Doc</em>'.
	 * @see ExtDocModel.Entry#getDoc()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtDocModel.Entry#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see ExtDocModel.Entry#getAnnotations()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Annotations();

	/**
	 * Returns the meta object for the reference list '{@link ExtDocModel.Entry#getGlossaryEntries <em>Glossary Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Glossary Entries</em>'.
	 * @see ExtDocModel.Entry#getGlossaryEntries()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_GlossaryEntries();

	/**
	 * Returns the meta object for the attribute '{@link ExtDocModel.Entry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ExtDocModel.Entry#getType()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Type();

	/**
	 * Returns the meta object for class '{@link ExtDocModel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ExtDocModel.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the container reference '{@link ExtDocModel.Annotation#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entry</em>'.
	 * @see ExtDocModel.Annotation#getEntry()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Entry();

	/**
	 * Returns the meta object for the attribute '{@link ExtDocModel.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ExtDocModel.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link ExtDocModel.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see ExtDocModel.Glossary
	 * @generated
	 */
	EClass getGlossary();

	/**
	 * Returns the meta object for the containment reference list '{@link ExtDocModel.Glossary#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see ExtDocModel.Glossary#getEntries()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Entries();

	/**
	 * Returns the meta object for the container reference '{@link ExtDocModel.Glossary#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see ExtDocModel.Glossary#getContainer()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Container();

	/**
	 * Returns the meta object for class '{@link ExtDocModel.GlossaryEntry <em>Glossary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary Entry</em>'.
	 * @see ExtDocModel.GlossaryEntry
	 * @generated
	 */
	EClass getGlossaryEntry();

	/**
	 * Returns the meta object for the container reference '{@link ExtDocModel.GlossaryEntry#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Glossary</em>'.
	 * @see ExtDocModel.GlossaryEntry#getGlossary()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EReference getGlossaryEntry_Glossary();

	/**
	 * Returns the meta object for the reference list '{@link ExtDocModel.GlossaryEntry#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entries</em>'.
	 * @see ExtDocModel.GlossaryEntry#getEntries()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EReference getGlossaryEntry_Entries();

	/**
	 * Returns the meta object for enum '{@link ExtDocModel.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Type</em>'.
	 * @see ExtDocModel.EntryType
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
	ExtDocModelFactory getExtDocModelFactory();

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
		 * The meta object literal for the '{@link ExtDocModel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.impl.NamedElementImpl
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ExtDocModel.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.impl.FolderImpl
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Docs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__DOCS = eINSTANCE.getFolder_Docs();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CONTAINER = eINSTANCE.getFolder_Container();

		/**
		 * The meta object literal for the '{@link ExtDocModel.impl.DocContainerImpl <em>Doc Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.impl.DocContainerImpl
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getDocContainer()
		 * @generated
		 */
		EClass DOC_CONTAINER = eINSTANCE.getDocContainer();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_CONTAINER__FOLDERS = eINSTANCE.getDocContainer_Folders();

		/**
		 * The meta object literal for the '<em><b>Glossary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_CONTAINER__GLOSSARY = eINSTANCE.getDocContainer_Glossary();

		/**
		 * The meta object literal for the '{@link ExtDocModel.impl.DocImpl <em>Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.impl.DocImpl
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getDoc()
		 * @generated
		 */
		EClass DOC = eINSTANCE.getDoc();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__FOLDER = eINSTANCE.getDoc_Folder();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__ENTRIES = eINSTANCE.getDoc_Entries();

		/**
		 * The meta object literal for the '<em><b>Sub Docs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__SUB_DOCS = eINSTANCE.getDoc_SubDocs();

		/**
		 * The meta object literal for the '<em><b>Super Docs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC__SUPER_DOCS = eINSTANCE.getDoc_SuperDocs();

		/**
		 * The meta object literal for the '{@link ExtDocModel.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.impl.EntryImpl
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__DOC = eINSTANCE.getEntry_Doc();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__ANNOTATIONS = eINSTANCE.getEntry_Annotations();

		/**
		 * The meta object literal for the '<em><b>Glossary Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__GLOSSARY_ENTRIES = eINSTANCE.getEntry_GlossaryEntries();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TYPE = eINSTANCE.getEntry_Type();

		/**
		 * The meta object literal for the '{@link ExtDocModel.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.impl.AnnotationImpl
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ENTRY = eINSTANCE.getAnnotation_Entry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link ExtDocModel.impl.GlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.impl.GlossaryImpl
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getGlossary()
		 * @generated
		 */
		EClass GLOSSARY = eINSTANCE.getGlossary();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__ENTRIES = eINSTANCE.getGlossary_Entries();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__CONTAINER = eINSTANCE.getGlossary_Container();

		/**
		 * The meta object literal for the '{@link ExtDocModel.impl.GlossaryEntryImpl <em>Glossary Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.impl.GlossaryEntryImpl
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getGlossaryEntry()
		 * @generated
		 */
		EClass GLOSSARY_ENTRY = eINSTANCE.getGlossaryEntry();

		/**
		 * The meta object literal for the '<em><b>Glossary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_ENTRY__GLOSSARY = eINSTANCE.getGlossaryEntry_Glossary();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_ENTRY__ENTRIES = eINSTANCE.getGlossaryEntry_Entries();

		/**
		 * The meta object literal for the '{@link ExtDocModel.EntryType <em>Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExtDocModel.EntryType
		 * @see ExtDocModel.impl.ExtDocModelPackageImpl#getEntryType()
		 * @generated
		 */
		EEnum ENTRY_TYPE = eINSTANCE.getEntryType();

	}

} //ExtDocModelPackage
