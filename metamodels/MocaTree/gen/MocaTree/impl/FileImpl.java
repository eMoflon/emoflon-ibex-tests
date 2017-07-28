/**
 */
package MocaTree.impl;

import MocaTree.File;
import MocaTree.Folder;
import MocaTree.MocaTreePackage;
import MocaTree.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MocaTree.impl.FileImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link MocaTree.impl.FileImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends TreeElementImpl implements File {
	/**
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected Node rootNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MocaTreePackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getFolder() {
		if (eContainerFeatureID() != MocaTreePackage.FILE__FOLDER)
			return null;
		return (Folder) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolder(Folder newFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFolder, MocaTreePackage.FILE__FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolder(Folder newFolder) {
		if (newFolder != eInternalContainer()
				|| (eContainerFeatureID() != MocaTreePackage.FILE__FOLDER && newFolder != null)) {
			if (EcoreUtil.isAncestor(this, newFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFolder != null)
				msgs = ((InternalEObject) newFolder).eInverseAdd(this, MocaTreePackage.FOLDER__FILE, Folder.class,
						msgs);
			msgs = basicSetFolder(newFolder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.FILE__FOLDER, newFolder, newFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootNode(Node newRootNode, NotificationChain msgs) {
		Node oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MocaTreePackage.FILE__ROOT_NODE, oldRootNode, newRootNode);
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
	public void setRootNode(Node newRootNode) {
		if (newRootNode != rootNode) {
			NotificationChain msgs = null;
			if (rootNode != null)
				msgs = ((InternalEObject) rootNode).eInverseRemove(this, MocaTreePackage.NODE__FILE, Node.class, msgs);
			if (newRootNode != null)
				msgs = ((InternalEObject) newRootNode).eInverseAdd(this, MocaTreePackage.NODE__FILE, Node.class, msgs);
			msgs = basicSetRootNode(newRootNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.FILE__ROOT_NODE, newRootNode,
					newRootNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MocaTreePackage.FILE__FOLDER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFolder((Folder) otherEnd, msgs);
		case MocaTreePackage.FILE__ROOT_NODE:
			if (rootNode != null)
				msgs = ((InternalEObject) rootNode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MocaTreePackage.FILE__ROOT_NODE, null, msgs);
			return basicSetRootNode((Node) otherEnd, msgs);
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
		case MocaTreePackage.FILE__FOLDER:
			return basicSetFolder(null, msgs);
		case MocaTreePackage.FILE__ROOT_NODE:
			return basicSetRootNode(null, msgs);
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
		case MocaTreePackage.FILE__FOLDER:
			return eInternalContainer().eInverseRemove(this, MocaTreePackage.FOLDER__FILE, Folder.class, msgs);
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
		case MocaTreePackage.FILE__FOLDER:
			return getFolder();
		case MocaTreePackage.FILE__ROOT_NODE:
			return getRootNode();
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
		case MocaTreePackage.FILE__FOLDER:
			setFolder((Folder) newValue);
			return;
		case MocaTreePackage.FILE__ROOT_NODE:
			setRootNode((Node) newValue);
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
		case MocaTreePackage.FILE__FOLDER:
			setFolder((Folder) null);
			return;
		case MocaTreePackage.FILE__ROOT_NODE:
			setRootNode((Node) null);
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
		case MocaTreePackage.FILE__FOLDER:
			return getFolder() != null;
		case MocaTreePackage.FILE__ROOT_NODE:
			return rootNode != null;
		}
		return super.eIsSet(featureID);
	}

} //FileImpl
