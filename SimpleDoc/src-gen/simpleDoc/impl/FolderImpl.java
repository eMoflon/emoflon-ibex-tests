/**
 */
package simpleDoc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleDoc.Doc;
import simpleDoc.Folder;
import simpleDoc.SimpleDocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleDoc.impl.FolderImpl#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link simpleDoc.impl.FolderImpl#getDocs <em>Docs</em>}</li>
 *   <li>{@link simpleDoc.impl.FolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleDoc.impl.FolderImpl#getSuperFolder <em>Super Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends MinimalEObjectImpl.Container implements Folder {
	/**
	 * The cached value of the '{@link #getSubFolders() <em>Sub Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> subFolders;

	/**
	 * The cached value of the '{@link #getDocs() <em>Docs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<Doc> docs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
		return SimpleDocPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Folder> getSubFolders() {
		if (subFolders == null) {
			subFolders = new EObjectContainmentWithInverseEList<Folder>(Folder.class, this, SimpleDocPackage.FOLDER__SUB_FOLDERS,
					SimpleDocPackage.FOLDER__SUPER_FOLDER);
		}
		return subFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doc> getDocs() {
		if (docs == null) {
			docs = new EObjectContainmentWithInverseEList<Doc>(Doc.class, this, SimpleDocPackage.FOLDER__DOCS, SimpleDocPackage.DOC__FOLDER);
		}
		return docs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleDocPackage.FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder getSuperFolder() {
		if (eContainerFeatureID() != SimpleDocPackage.FOLDER__SUPER_FOLDER)
			return null;
		return (Folder) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperFolder(Folder newSuperFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperFolder, SimpleDocPackage.FOLDER__SUPER_FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperFolder(Folder newSuperFolder) {
		if (newSuperFolder != eInternalContainer() || (eContainerFeatureID() != SimpleDocPackage.FOLDER__SUPER_FOLDER && newSuperFolder != null)) {
			if (EcoreUtil.isAncestor(this, newSuperFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperFolder != null)
				msgs = ((InternalEObject) newSuperFolder).eInverseAdd(this, SimpleDocPackage.FOLDER__SUB_FOLDERS, Folder.class, msgs);
			msgs = basicSetSuperFolder(newSuperFolder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleDocPackage.FOLDER__SUPER_FOLDER, newSuperFolder, newSuperFolder));
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
		case SimpleDocPackage.FOLDER__SUB_FOLDERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubFolders()).basicAdd(otherEnd, msgs);
		case SimpleDocPackage.FOLDER__DOCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDocs()).basicAdd(otherEnd, msgs);
		case SimpleDocPackage.FOLDER__SUPER_FOLDER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSuperFolder((Folder) otherEnd, msgs);
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
		case SimpleDocPackage.FOLDER__SUB_FOLDERS:
			return ((InternalEList<?>) getSubFolders()).basicRemove(otherEnd, msgs);
		case SimpleDocPackage.FOLDER__DOCS:
			return ((InternalEList<?>) getDocs()).basicRemove(otherEnd, msgs);
		case SimpleDocPackage.FOLDER__SUPER_FOLDER:
			return basicSetSuperFolder(null, msgs);
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
		case SimpleDocPackage.FOLDER__SUPER_FOLDER:
			return eInternalContainer().eInverseRemove(this, SimpleDocPackage.FOLDER__SUB_FOLDERS, Folder.class, msgs);
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
		case SimpleDocPackage.FOLDER__SUB_FOLDERS:
			return getSubFolders();
		case SimpleDocPackage.FOLDER__DOCS:
			return getDocs();
		case SimpleDocPackage.FOLDER__NAME:
			return getName();
		case SimpleDocPackage.FOLDER__SUPER_FOLDER:
			return getSuperFolder();
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
		case SimpleDocPackage.FOLDER__SUB_FOLDERS:
			getSubFolders().clear();
			getSubFolders().addAll((Collection<? extends Folder>) newValue);
			return;
		case SimpleDocPackage.FOLDER__DOCS:
			getDocs().clear();
			getDocs().addAll((Collection<? extends Doc>) newValue);
			return;
		case SimpleDocPackage.FOLDER__NAME:
			setName((String) newValue);
			return;
		case SimpleDocPackage.FOLDER__SUPER_FOLDER:
			setSuperFolder((Folder) newValue);
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
		case SimpleDocPackage.FOLDER__SUB_FOLDERS:
			getSubFolders().clear();
			return;
		case SimpleDocPackage.FOLDER__DOCS:
			getDocs().clear();
			return;
		case SimpleDocPackage.FOLDER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimpleDocPackage.FOLDER__SUPER_FOLDER:
			setSuperFolder((Folder) null);
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
		case SimpleDocPackage.FOLDER__SUB_FOLDERS:
			return subFolders != null && !subFolders.isEmpty();
		case SimpleDocPackage.FOLDER__DOCS:
			return docs != null && !docs.isEmpty();
		case SimpleDocPackage.FOLDER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimpleDocPackage.FOLDER__SUPER_FOLDER:
			return getSuperFolder() != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FolderImpl
