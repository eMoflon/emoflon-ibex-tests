/**
 */
package BlockDiagram;

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
 * @see BlockDiagram.BlockDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface BlockDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BlockDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/BlockDiagram/model/BlockDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BlockDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockDiagramPackage eINSTANCE = BlockDiagram.impl.BlockDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link BlockDiagram.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BlockDiagram.impl.BlockImpl
	 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Block System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BlockDiagram.impl.BlockSystemImpl <em>Block System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BlockDiagram.impl.BlockSystemImpl
	 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getBlockSystem()
	 * @generated
	 */
	int BLOCK_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SYSTEM__BLOCKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SYSTEM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Block System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Block System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BlockDiagram.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BlockDiagram.impl.ConnectorImpl
	 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SUB = 0;

	/**
	 * The feature id for the '<em><b>Pub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PUB = 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BlockDiagram.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BlockDiagram.impl.PortImpl
	 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BlockDiagram.impl.ProvideImpl <em>Provide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BlockDiagram.impl.ProvideImpl
	 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getProvide()
	 * @generated
	 */
	int PROVIDE = 4;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE__BLOCK = PORT__BLOCK;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE__CONNECTOR = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDE_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BlockDiagram.impl.RequireImpl <em>Require</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BlockDiagram.impl.RequireImpl
	 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getRequire()
	 * @generated
	 */
	int REQUIRE = 5;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__BLOCK = PORT__BLOCK;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE__CONNECTOR = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Require</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link BlockDiagram.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see BlockDiagram.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the container reference '{@link BlockDiagram.Block#getBlockSystem <em>Block System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block System</em>'.
	 * @see BlockDiagram.Block#getBlockSystem()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_BlockSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link BlockDiagram.Block#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see BlockDiagram.Block#getPorts()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ports();

	/**
	 * Returns the meta object for the attribute '{@link BlockDiagram.Block#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BlockDiagram.Block#getId()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Id();

	/**
	 * Returns the meta object for class '{@link BlockDiagram.BlockSystem <em>Block System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block System</em>'.
	 * @see BlockDiagram.BlockSystem
	 * @generated
	 */
	EClass getBlockSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link BlockDiagram.BlockSystem#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see BlockDiagram.BlockSystem#getBlocks()
	 * @see #getBlockSystem()
	 * @generated
	 */
	EReference getBlockSystem_Blocks();

	/**
	 * Returns the meta object for the attribute '{@link BlockDiagram.BlockSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BlockDiagram.BlockSystem#getName()
	 * @see #getBlockSystem()
	 * @generated
	 */
	EAttribute getBlockSystem_Name();

	/**
	 * Returns the meta object for class '{@link BlockDiagram.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see BlockDiagram.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the container reference '{@link BlockDiagram.Connector#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sub</em>'.
	 * @see BlockDiagram.Connector#getSub()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Sub();

	/**
	 * Returns the meta object for the reference '{@link BlockDiagram.Connector#getPub <em>Pub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pub</em>'.
	 * @see BlockDiagram.Connector#getPub()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Pub();

	/**
	 * Returns the meta object for class '{@link BlockDiagram.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see BlockDiagram.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link BlockDiagram.Port#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block</em>'.
	 * @see BlockDiagram.Port#getBlock()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Block();

	/**
	 * Returns the meta object for the attribute '{@link BlockDiagram.Port#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BlockDiagram.Port#getId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Id();

	/**
	 * Returns the meta object for class '{@link BlockDiagram.Provide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provide</em>'.
	 * @see BlockDiagram.Provide
	 * @generated
	 */
	EClass getProvide();

	/**
	 * Returns the meta object for the reference '{@link BlockDiagram.Provide#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see BlockDiagram.Provide#getConnector()
	 * @see #getProvide()
	 * @generated
	 */
	EReference getProvide_Connector();

	/**
	 * Returns the meta object for class '{@link BlockDiagram.Require <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require</em>'.
	 * @see BlockDiagram.Require
	 * @generated
	 */
	EClass getRequire();

	/**
	 * Returns the meta object for the containment reference '{@link BlockDiagram.Require#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connector</em>'.
	 * @see BlockDiagram.Require#getConnector()
	 * @see #getRequire()
	 * @generated
	 */
	EReference getRequire_Connector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockDiagramFactory getBlockDiagramFactory();

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
		 * The meta object literal for the '{@link BlockDiagram.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BlockDiagram.impl.BlockImpl
		 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Block System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BLOCK_SYSTEM = eINSTANCE.getBlock_BlockSystem();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__PORTS = eINSTANCE.getBlock_Ports();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__ID = eINSTANCE.getBlock_Id();

		/**
		 * The meta object literal for the '{@link BlockDiagram.impl.BlockSystemImpl <em>Block System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BlockDiagram.impl.BlockSystemImpl
		 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getBlockSystem()
		 * @generated
		 */
		EClass BLOCK_SYSTEM = eINSTANCE.getBlockSystem();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_SYSTEM__BLOCKS = eINSTANCE.getBlockSystem_Blocks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_SYSTEM__NAME = eINSTANCE.getBlockSystem_Name();

		/**
		 * The meta object literal for the '{@link BlockDiagram.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BlockDiagram.impl.ConnectorImpl
		 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SUB = eINSTANCE.getConnector_Sub();

		/**
		 * The meta object literal for the '<em><b>Pub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PUB = eINSTANCE.getConnector_Pub();

		/**
		 * The meta object literal for the '{@link BlockDiagram.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BlockDiagram.impl.PortImpl
		 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BLOCK = eINSTANCE.getPort_Block();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ID = eINSTANCE.getPort_Id();

		/**
		 * The meta object literal for the '{@link BlockDiagram.impl.ProvideImpl <em>Provide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BlockDiagram.impl.ProvideImpl
		 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getProvide()
		 * @generated
		 */
		EClass PROVIDE = eINSTANCE.getProvide();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDE__CONNECTOR = eINSTANCE.getProvide_Connector();

		/**
		 * The meta object literal for the '{@link BlockDiagram.impl.RequireImpl <em>Require</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BlockDiagram.impl.RequireImpl
		 * @see BlockDiagram.impl.BlockDiagramPackageImpl#getRequire()
		 * @generated
		 */
		EClass REQUIRE = eINSTANCE.getRequire();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE__CONNECTOR = eINSTANCE.getRequire_Connector();

	}

} //BlockDiagramPackage
