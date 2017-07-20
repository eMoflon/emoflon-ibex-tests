/**
 */
package ITLanguage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see ITLanguage.ITLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ITLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ITLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ITLanguage/model/ITLanguage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ITLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ITLanguagePackage eINSTANCE = ITLanguage.impl.ITLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link ITLanguage.impl.ITImpl <em>IT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ITLanguage.impl.ITImpl
	 * @see ITLanguage.impl.ITLanguagePackageImpl#getIT()
	 * @generated
	 */
	int IT = 0;

	/**
	 * The feature id for the '<em><b>Router</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT__ROUTER = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT__NAME = 2;

	/**
	 * The number of structural features of the '<em>IT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>IT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ITLanguage.impl.LaptopImpl <em>Laptop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ITLanguage.impl.LaptopImpl
	 * @see ITLanguage.impl.ITLanguagePackageImpl#getLaptop()
	 * @generated
	 */
	int LAPTOP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Laptop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Laptop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ITLanguage.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ITLanguage.impl.NetworkImpl
	 * @see ITLanguage.impl.ITLanguagePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Pc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PC = 0;

	/**
	 * The feature id for the '<em><b>Laptop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LAPTOP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 2;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ITLanguage.impl.PCImpl <em>PC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ITLanguage.impl.PCImpl
	 * @see ITLanguage.impl.ITLanguagePackageImpl#getPC()
	 * @generated
	 */
	int PC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__NAME = 0;

	/**
	 * The number of structural features of the '<em>PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ITLanguage.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ITLanguage.impl.RouterImpl
	 * @see ITLanguage.impl.ITLanguagePackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 4;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link ITLanguage.IT <em>IT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IT</em>'.
	 * @see ITLanguage.IT
	 * @generated
	 */
	EClass getIT();

	/**
	 * Returns the meta object for the containment reference list '{@link ITLanguage.IT#getRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Router</em>'.
	 * @see ITLanguage.IT#getRouter()
	 * @see #getIT()
	 * @generated
	 */
	EReference getIT_Router();

	/**
	 * Returns the meta object for the containment reference list '{@link ITLanguage.IT#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see ITLanguage.IT#getNetwork()
	 * @see #getIT()
	 * @generated
	 */
	EReference getIT_Network();

	/**
	 * Returns the meta object for the attribute '{@link ITLanguage.IT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ITLanguage.IT#getName()
	 * @see #getIT()
	 * @generated
	 */
	EAttribute getIT_Name();

	/**
	 * Returns the meta object for class '{@link ITLanguage.Laptop <em>Laptop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Laptop</em>'.
	 * @see ITLanguage.Laptop
	 * @generated
	 */
	EClass getLaptop();

	/**
	 * Returns the meta object for the attribute '{@link ITLanguage.Laptop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ITLanguage.Laptop#getName()
	 * @see #getLaptop()
	 * @generated
	 */
	EAttribute getLaptop_Name();

	/**
	 * Returns the meta object for class '{@link ITLanguage.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see ITLanguage.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link ITLanguage.Network#getPc <em>Pc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pc</em>'.
	 * @see ITLanguage.Network#getPc()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Pc();

	/**
	 * Returns the meta object for the containment reference list '{@link ITLanguage.Network#getLaptop <em>Laptop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Laptop</em>'.
	 * @see ITLanguage.Network#getLaptop()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Laptop();

	/**
	 * Returns the meta object for the attribute '{@link ITLanguage.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ITLanguage.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for class '{@link ITLanguage.PC <em>PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC</em>'.
	 * @see ITLanguage.PC
	 * @generated
	 */
	EClass getPC();

	/**
	 * Returns the meta object for the attribute '{@link ITLanguage.PC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ITLanguage.PC#getName()
	 * @see #getPC()
	 * @generated
	 */
	EAttribute getPC_Name();

	/**
	 * Returns the meta object for class '{@link ITLanguage.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see ITLanguage.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the reference '{@link ITLanguage.Router#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see ITLanguage.Router#getNetwork()
	 * @see #getRouter()
	 * @generated
	 */
	EReference getRouter_Network();

	/**
	 * Returns the meta object for the attribute '{@link ITLanguage.Router#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ITLanguage.Router#getName()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ITLanguageFactory getITLanguageFactory();

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
		 * The meta object literal for the '{@link ITLanguage.impl.ITImpl <em>IT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ITLanguage.impl.ITImpl
		 * @see ITLanguage.impl.ITLanguagePackageImpl#getIT()
		 * @generated
		 */
		EClass IT = eINSTANCE.getIT();

		/**
		 * The meta object literal for the '<em><b>Router</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IT__ROUTER = eINSTANCE.getIT_Router();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IT__NETWORK = eINSTANCE.getIT_Network();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IT__NAME = eINSTANCE.getIT_Name();

		/**
		 * The meta object literal for the '{@link ITLanguage.impl.LaptopImpl <em>Laptop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ITLanguage.impl.LaptopImpl
		 * @see ITLanguage.impl.ITLanguagePackageImpl#getLaptop()
		 * @generated
		 */
		EClass LAPTOP = eINSTANCE.getLaptop();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAPTOP__NAME = eINSTANCE.getLaptop_Name();

		/**
		 * The meta object literal for the '{@link ITLanguage.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ITLanguage.impl.NetworkImpl
		 * @see ITLanguage.impl.ITLanguagePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Pc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__PC = eINSTANCE.getNetwork_Pc();

		/**
		 * The meta object literal for the '<em><b>Laptop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__LAPTOP = eINSTANCE.getNetwork_Laptop();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '{@link ITLanguage.impl.PCImpl <em>PC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ITLanguage.impl.PCImpl
		 * @see ITLanguage.impl.ITLanguagePackageImpl#getPC()
		 * @generated
		 */
		EClass PC = eINSTANCE.getPC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PC__NAME = eINSTANCE.getPC_Name();

		/**
		 * The meta object literal for the '{@link ITLanguage.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ITLanguage.impl.RouterImpl
		 * @see ITLanguage.impl.ITLanguagePackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER__NETWORK = eINSTANCE.getRouter_Network();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__NAME = eINSTANCE.getRouter_Name();

	}

} //ITLanguagePackage
