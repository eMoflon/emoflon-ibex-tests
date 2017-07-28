/**
 */
package BlockDiagram.impl;

import BlockDiagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockDiagramFactoryImpl extends EFactoryImpl implements BlockDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockDiagramFactory init() {
		try {
			BlockDiagramFactory theBlockDiagramFactory = (BlockDiagramFactory) EPackage.Registry.INSTANCE
					.getEFactory(BlockDiagramPackage.eNS_URI);
			if (theBlockDiagramFactory != null) {
				return theBlockDiagramFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BlockDiagramPackage.BLOCK:
			return createBlock();
		case BlockDiagramPackage.BLOCK_SYSTEM:
			return createBlockSystem();
		case BlockDiagramPackage.CONNECTOR:
			return createConnector();
		case BlockDiagramPackage.PORT:
			return createPort();
		case BlockDiagramPackage.PROVIDE:
			return createProvide();
		case BlockDiagramPackage.REQUIRE:
			return createRequire();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockSystem createBlockSystem() {
		BlockSystemImpl blockSystem = new BlockSystemImpl();
		return blockSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provide createProvide() {
		ProvideImpl provide = new ProvideImpl();
		return provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Require createRequire() {
		RequireImpl require = new RequireImpl();
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockDiagramPackage getBlockDiagramPackage() {
		return (BlockDiagramPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlockDiagramPackage getPackage() {
		return BlockDiagramPackage.eINSTANCE;
	}

} //BlockDiagramFactoryImpl
