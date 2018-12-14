/**
 */
package Java2Doc;

import org.eclipse.emf.ecore.EClass;
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
 * @see Java2Doc.Java2DocFactory
 * @model kind="package"
 * @generated
 */
public interface Java2DocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Java2Doc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Java2Doc/model/Java2Doc.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Java2Doc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Java2DocPackage eINSTANCE = Java2Doc.impl.Java2DocPackageImpl.init();

	/**
	 * The meta object id for the '{@link Java2Doc.impl.Package2FolderImpl <em>Package2 Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java2Doc.impl.Package2FolderImpl
	 * @see Java2Doc.impl.Java2DocPackageImpl#getPackage2Folder()
	 * @generated
	 */
	int PACKAGE2_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_FOLDER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_FOLDER__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Package2 Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_FOLDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Package2 Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE2_FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Java2Doc.impl.Class2DocImpl <em>Class2 Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java2Doc.impl.Class2DocImpl
	 * @see Java2Doc.impl.Java2DocPackageImpl#getClass2Doc()
	 * @generated
	 */
	int CLASS2_DOC = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_DOC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_DOC__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Class2 Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_DOC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class2 Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_DOC_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Java2Doc.Package2Folder <em>Package2 Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package2 Folder</em>'.
	 * @see Java2Doc.Package2Folder
	 * @generated
	 */
	EClass getPackage2Folder();

	/**
	 * Returns the meta object for the reference '{@link Java2Doc.Package2Folder#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Java2Doc.Package2Folder#getSource()
	 * @see #getPackage2Folder()
	 * @generated
	 */
	EReference getPackage2Folder_Source();

	/**
	 * Returns the meta object for the reference '{@link Java2Doc.Package2Folder#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Java2Doc.Package2Folder#getTarget()
	 * @see #getPackage2Folder()
	 * @generated
	 */
	EReference getPackage2Folder_Target();

	/**
	 * Returns the meta object for class '{@link Java2Doc.Class2Doc <em>Class2 Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class2 Doc</em>'.
	 * @see Java2Doc.Class2Doc
	 * @generated
	 */
	EClass getClass2Doc();

	/**
	 * Returns the meta object for the reference '{@link Java2Doc.Class2Doc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Java2Doc.Class2Doc#getSource()
	 * @see #getClass2Doc()
	 * @generated
	 */
	EReference getClass2Doc_Source();

	/**
	 * Returns the meta object for the reference '{@link Java2Doc.Class2Doc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Java2Doc.Class2Doc#getTarget()
	 * @see #getClass2Doc()
	 * @generated
	 */
	EReference getClass2Doc_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Java2DocFactory getJava2DocFactory();

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
		 * The meta object literal for the '{@link Java2Doc.impl.Package2FolderImpl <em>Package2 Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java2Doc.impl.Package2FolderImpl
		 * @see Java2Doc.impl.Java2DocPackageImpl#getPackage2Folder()
		 * @generated
		 */
		EClass PACKAGE2_FOLDER = eINSTANCE.getPackage2Folder();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE2_FOLDER__SOURCE = eINSTANCE.getPackage2Folder_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE2_FOLDER__TARGET = eINSTANCE.getPackage2Folder_Target();

		/**
		 * The meta object literal for the '{@link Java2Doc.impl.Class2DocImpl <em>Class2 Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java2Doc.impl.Class2DocImpl
		 * @see Java2Doc.impl.Java2DocPackageImpl#getClass2Doc()
		 * @generated
		 */
		EClass CLASS2_DOC = eINSTANCE.getClass2Doc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS2_DOC__SOURCE = eINSTANCE.getClass2Doc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS2_DOC__TARGET = eINSTANCE.getClass2Doc_Target();

	}

} //Java2DocPackage
