/**
 */
package BlockDiagram.impl;

import BlockDiagram.BlockDiagramPackage;
import BlockDiagram.Connector;
import BlockDiagram.Provide;
import BlockDiagram.Require;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BlockDiagram.impl.ConnectorImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link BlockDiagram.impl.ConnectorImpl#getPub <em>Pub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EObjectImpl implements Connector {
	/**
	 * The cached value of the '{@link #getPub() <em>Pub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPub()
	 * @generated
	 * @ordered
	 */
	protected Provide pub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockDiagramPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Require getSub() {
		if (eContainerFeatureID() != BlockDiagramPackage.CONNECTOR__SUB)
			return null;
		return (Require) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSub(Require newSub, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSub, BlockDiagramPackage.CONNECTOR__SUB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSub(Require newSub) {
		if (newSub != eInternalContainer()
				|| (eContainerFeatureID() != BlockDiagramPackage.CONNECTOR__SUB && newSub != null)) {
			if (EcoreUtil.isAncestor(this, newSub))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSub != null)
				msgs = ((InternalEObject) newSub).eInverseAdd(this, BlockDiagramPackage.REQUIRE__CONNECTOR,
						Require.class, msgs);
			msgs = basicSetSub(newSub, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockDiagramPackage.CONNECTOR__SUB, newSub, newSub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provide getPub() {
		if (pub != null && pub.eIsProxy()) {
			InternalEObject oldPub = (InternalEObject) pub;
			pub = (Provide) eResolveProxy(oldPub);
			if (pub != oldPub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockDiagramPackage.CONNECTOR__PUB,
							oldPub, pub));
			}
		}
		return pub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provide basicGetPub() {
		return pub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPub(Provide newPub, NotificationChain msgs) {
		Provide oldPub = pub;
		pub = newPub;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BlockDiagramPackage.CONNECTOR__PUB, oldPub, newPub);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPub(Provide newPub) {
		if (newPub != pub) {
			NotificationChain msgs = null;
			if (pub != null)
				msgs = ((InternalEObject) pub).eInverseRemove(this, BlockDiagramPackage.PROVIDE__CONNECTOR,
						Provide.class, msgs);
			if (newPub != null)
				msgs = ((InternalEObject) newPub).eInverseAdd(this, BlockDiagramPackage.PROVIDE__CONNECTOR,
						Provide.class, msgs);
			msgs = basicSetPub(newPub, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockDiagramPackage.CONNECTOR__PUB, newPub, newPub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockDiagramPackage.CONNECTOR__SUB:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSub((Require) otherEnd, msgs);
		case BlockDiagramPackage.CONNECTOR__PUB:
			if (pub != null)
				msgs = ((InternalEObject) pub).eInverseRemove(this, BlockDiagramPackage.PROVIDE__CONNECTOR,
						Provide.class, msgs);
			return basicSetPub((Provide) otherEnd, msgs);
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
		case BlockDiagramPackage.CONNECTOR__SUB:
			return basicSetSub(null, msgs);
		case BlockDiagramPackage.CONNECTOR__PUB:
			return basicSetPub(null, msgs);
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
		case BlockDiagramPackage.CONNECTOR__SUB:
			return eInternalContainer().eInverseRemove(this, BlockDiagramPackage.REQUIRE__CONNECTOR, Require.class,
					msgs);
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
		case BlockDiagramPackage.CONNECTOR__SUB:
			return getSub();
		case BlockDiagramPackage.CONNECTOR__PUB:
			if (resolve)
				return getPub();
			return basicGetPub();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BlockDiagramPackage.CONNECTOR__SUB:
			setSub((Require) newValue);
			return;
		case BlockDiagramPackage.CONNECTOR__PUB:
			setPub((Provide) newValue);
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
		case BlockDiagramPackage.CONNECTOR__SUB:
			setSub((Require) null);
			return;
		case BlockDiagramPackage.CONNECTOR__PUB:
			setPub((Provide) null);
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
		case BlockDiagramPackage.CONNECTOR__SUB:
			return getSub() != null;
		case BlockDiagramPackage.CONNECTOR__PUB:
			return pub != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConnectorImpl
