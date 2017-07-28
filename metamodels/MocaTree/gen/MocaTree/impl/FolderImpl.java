/**
 */
package MocaTree.impl;

import MocaTree.File;
import MocaTree.Folder;
import MocaTree.MocaTreePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MocaTree.impl.FolderImpl#getSubFolder <em>Sub Folder</em>}</li>
 *   <li>{@link MocaTree.impl.FolderImpl#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link MocaTree.impl.FolderImpl#getFile <em>File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends TreeElementImpl implements Folder {
	/**
	 * The cached value of the '{@link #getSubFolder() <em>Sub Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolder()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> subFolder;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<File> file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MocaTreePackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getSubFolder() {
		if (subFolder == null) {
			subFolder = new EObjectContainmentWithInverseEList<Folder>(Folder.class, this,
					MocaTreePackage.FOLDER__SUB_FOLDER, MocaTreePackage.FOLDER__PARENT_FOLDER);
		}
		return subFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getParentFolder() {
		if (eContainerFeatureID() != MocaTreePackage.FOLDER__PARENT_FOLDER)
			return null;
		return (Folder) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFolder(Folder newParentFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentFolder, MocaTreePackage.FOLDER__PARENT_FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFolder(Folder newParentFolder) {
		if (newParentFolder != eInternalContainer()
				|| (eContainerFeatureID() != MocaTreePackage.FOLDER__PARENT_FOLDER && newParentFolder != null)) {
			if (EcoreUtil.isAncestor(this, newParentFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFolder != null)
				msgs = ((InternalEObject) newParentFolder).eInverseAdd(this, MocaTreePackage.FOLDER__SUB_FOLDER,
						Folder.class, msgs);
			msgs = basicSetParentFolder(newParentFolder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.FOLDER__PARENT_FOLDER,
					newParentFolder, newParentFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFile() {
		if (file == null) {
			file = new EObjectContainmentWithInverseEList<File>(File.class, this, MocaTreePackage.FOLDER__FILE,
					MocaTreePackage.FILE__FOLDER);
		}
		return file;
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
		case MocaTreePackage.FOLDER__SUB_FOLDER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubFolder()).basicAdd(otherEnd, msgs);
		case MocaTreePackage.FOLDER__PARENT_FOLDER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentFolder((Folder) otherEnd, msgs);
		case MocaTreePackage.FOLDER__FILE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFile()).basicAdd(otherEnd, msgs);
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
		case MocaTreePackage.FOLDER__SUB_FOLDER:
			return ((InternalEList<?>) getSubFolder()).basicRemove(otherEnd, msgs);
		case MocaTreePackage.FOLDER__PARENT_FOLDER:
			return basicSetParentFolder(null, msgs);
		case MocaTreePackage.FOLDER__FILE:
			return ((InternalEList<?>) getFile()).basicRemove(otherEnd, msgs);
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
		case MocaTreePackage.FOLDER__PARENT_FOLDER:
			return eInternalContainer().eInverseRemove(this, MocaTreePackage.FOLDER__SUB_FOLDER, Folder.class, msgs);
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
		case MocaTreePackage.FOLDER__SUB_FOLDER:
			return getSubFolder();
		case MocaTreePackage.FOLDER__PARENT_FOLDER:
			return getParentFolder();
		case MocaTreePackage.FOLDER__FILE:
			return getFile();
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
		case MocaTreePackage.FOLDER__SUB_FOLDER:
			getSubFolder().clear();
			getSubFolder().addAll((Collection<? extends Folder>) newValue);
			return;
		case MocaTreePackage.FOLDER__PARENT_FOLDER:
			setParentFolder((Folder) newValue);
			return;
		case MocaTreePackage.FOLDER__FILE:
			getFile().clear();
			getFile().addAll((Collection<? extends File>) newValue);
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
		case MocaTreePackage.FOLDER__SUB_FOLDER:
			getSubFolder().clear();
			return;
		case MocaTreePackage.FOLDER__PARENT_FOLDER:
			setParentFolder((Folder) null);
			return;
		case MocaTreePackage.FOLDER__FILE:
			getFile().clear();
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
		case MocaTreePackage.FOLDER__SUB_FOLDER:
			return subFolder != null && !subFolder.isEmpty();
		case MocaTreePackage.FOLDER__PARENT_FOLDER:
			return getParentFolder() != null;
		case MocaTreePackage.FOLDER__FILE:
			return file != null && !file.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FolderImpl
