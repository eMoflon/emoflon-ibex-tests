/**
 */
package BlockDiagram.impl;

import BlockDiagram.Block;
import BlockDiagram.BlockDiagramPackage;
import BlockDiagram.BlockSystem;
import BlockDiagram.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BlockDiagram.impl.BlockImpl#getBlockSystem <em>Block System</em>}</li>
 *   <li>{@link BlockDiagram.impl.BlockImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link BlockDiagram.impl.BlockImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends EObjectImpl implements Block {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockDiagramPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockSystem getBlockSystem() {
		if (eContainerFeatureID() != BlockDiagramPackage.BLOCK__BLOCK_SYSTEM)
			return null;
		return (BlockSystem) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockSystem(BlockSystem newBlockSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBlockSystem, BlockDiagramPackage.BLOCK__BLOCK_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockSystem(BlockSystem newBlockSystem) {
		if (newBlockSystem != eInternalContainer()
				|| (eContainerFeatureID() != BlockDiagramPackage.BLOCK__BLOCK_SYSTEM && newBlockSystem != null)) {
			if (EcoreUtil.isAncestor(this, newBlockSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBlockSystem != null)
				msgs = ((InternalEObject) newBlockSystem).eInverseAdd(this, BlockDiagramPackage.BLOCK_SYSTEM__BLOCKS,
						BlockSystem.class, msgs);
			msgs = basicSetBlockSystem(newBlockSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockDiagramPackage.BLOCK__BLOCK_SYSTEM,
					newBlockSystem, newBlockSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, BlockDiagramPackage.BLOCK__PORTS,
					BlockDiagramPackage.PORT__BLOCK);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockDiagramPackage.BLOCK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockDiagramPackage.BLOCK__BLOCK_SYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBlockSystem((BlockSystem) otherEnd, msgs);
		case BlockDiagramPackage.BLOCK__PORTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPorts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockDiagramPackage.BLOCK__BLOCK_SYSTEM:
			return basicSetBlockSystem(null, msgs);
		case BlockDiagramPackage.BLOCK__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case BlockDiagramPackage.BLOCK__BLOCK_SYSTEM:
			return eInternalContainer().eInverseRemove(this, BlockDiagramPackage.BLOCK_SYSTEM__BLOCKS,
					BlockSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockDiagramPackage.BLOCK__BLOCK_SYSTEM:
			return getBlockSystem();
		case BlockDiagramPackage.BLOCK__PORTS:
			return getPorts();
		case BlockDiagramPackage.BLOCK__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BlockDiagramPackage.BLOCK__BLOCK_SYSTEM:
			setBlockSystem((BlockSystem) newValue);
			return;
		case BlockDiagramPackage.BLOCK__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case BlockDiagramPackage.BLOCK__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BlockDiagramPackage.BLOCK__BLOCK_SYSTEM:
			setBlockSystem((BlockSystem) null);
			return;
		case BlockDiagramPackage.BLOCK__PORTS:
			getPorts().clear();
			return;
		case BlockDiagramPackage.BLOCK__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BlockDiagramPackage.BLOCK__BLOCK_SYSTEM:
			return getBlockSystem() != null;
		case BlockDiagramPackage.BLOCK__PORTS:
			return ports != null && !ports.isEmpty();
		case BlockDiagramPackage.BLOCK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //BlockImpl
