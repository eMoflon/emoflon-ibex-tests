/**
 */
package Algorithms;

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
 * @see Algorithms.AlgorithmsFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Algorithms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Algorithms/model/Algorithms.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Algorithms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmsPackage eINSTANCE = Algorithms.impl.AlgorithmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Algorithms.impl.AlgorithmContainerImpl <em>Algorithm Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Algorithms.impl.AlgorithmContainerImpl
	 * @see Algorithms.impl.AlgorithmsPackageImpl#getAlgorithmContainer()
	 * @generated
	 */
	int ALGORITHM_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_CONTAINER__ALGORITHMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_CONTAINER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Algorithm Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Algorithm Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Algorithms.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Algorithms.impl.AlgorithmImpl
	 * @see Algorithms.impl.AlgorithmsPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Algorithms.AlgorithmContainer <em>Algorithm Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Container</em>'.
	 * @see Algorithms.AlgorithmContainer
	 * @generated
	 */
	EClass getAlgorithmContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link Algorithms.AlgorithmContainer#getAlgorithms <em>Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithms</em>'.
	 * @see Algorithms.AlgorithmContainer#getAlgorithms()
	 * @see #getAlgorithmContainer()
	 * @generated
	 */
	EReference getAlgorithmContainer_Algorithms();

	/**
	 * Returns the meta object for the attribute '{@link Algorithms.AlgorithmContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Algorithms.AlgorithmContainer#getName()
	 * @see #getAlgorithmContainer()
	 * @generated
	 */
	EAttribute getAlgorithmContainer_Name();

	/**
	 * Returns the meta object for class '{@link Algorithms.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see Algorithms.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link Algorithms.Algorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Algorithms.Algorithm#getName()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmsFactory getAlgorithmsFactory();

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
		 * The meta object literal for the '{@link Algorithms.impl.AlgorithmContainerImpl <em>Algorithm Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Algorithms.impl.AlgorithmContainerImpl
		 * @see Algorithms.impl.AlgorithmsPackageImpl#getAlgorithmContainer()
		 * @generated
		 */
		EClass ALGORITHM_CONTAINER = eINSTANCE.getAlgorithmContainer();

		/**
		 * The meta object literal for the '<em><b>Algorithms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM_CONTAINER__ALGORITHMS = eINSTANCE.getAlgorithmContainer_Algorithms();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM_CONTAINER__NAME = eINSTANCE.getAlgorithmContainer_Name();

		/**
		 * The meta object literal for the '{@link Algorithms.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Algorithms.impl.AlgorithmImpl
		 * @see Algorithms.impl.AlgorithmsPackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__NAME = eINSTANCE.getAlgorithm_Name();

	}

} //AlgorithmsPackage
