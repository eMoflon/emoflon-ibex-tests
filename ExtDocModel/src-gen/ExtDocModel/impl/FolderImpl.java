/**
 */
package ExtDocModel.impl;

import ExtDocModel.Doc;
import ExtDocModel.DocContainer;
import ExtDocModel.ExtDocModelPackage;
import ExtDocModel.Folder;
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
 *   <li>{@link ExtDocModel.impl.FolderImpl#getDocs <em>Docs</em>}</li>
 *   <li>{@link ExtDocModel.impl.FolderImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link ExtDocModel.impl.FolderImpl#getSubFolder <em>Sub Folder</em>}</li>
 *   <li>{@link ExtDocModel.impl.FolderImpl#getSuperFolder <em>Super Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends NamedElementImpl implements Folder {
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
	 * The cached value of the '{@link #getSubFolder() <em>Sub Folder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolder()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> subFolder;

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
		return ExtDocModelPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doc> getDocs() {
		if (docs == null) {
			docs = new EObjectContainmentWithInverseEList<Doc>(Doc.class, this, ExtDocModelPackage.FOLDER__DOCS, ExtDocModelPackage.DOC__FOLDER);
		}
		return docs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocContainer getContainer() {
		if (eContainerFeatureID() != ExtDocModelPackage.FOLDER__CONTAINER)
			return null;
		return (DocContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(DocContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, ExtDocModelPackage.FOLDER__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(DocContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != ExtDocModelPackage.FOLDER__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, ExtDocModelPackage.DOC_CONTAINER__FOLDERS, DocContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.FOLDER__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Folder> getSubFolder() {
		if (subFolder == null) {
			subFolder = new EObjectContainmentWithInverseEList<Folder>(Folder.class, this, ExtDocModelPackage.FOLDER__SUB_FOLDER,
					ExtDocModelPackage.FOLDER__SUPER_FOLDER);
		}
		return subFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder getSuperFolder() {
		if (eContainerFeatureID() != ExtDocModelPackage.FOLDER__SUPER_FOLDER)
			return null;
		return (Folder) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperFolder(Folder newSuperFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperFolder, ExtDocModelPackage.FOLDER__SUPER_FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperFolder(Folder newSuperFolder) {
		if (newSuperFolder != eInternalContainer() || (eContainerFeatureID() != ExtDocModelPackage.FOLDER__SUPER_FOLDER && newSuperFolder != null)) {
			if (EcoreUtil.isAncestor(this, newSuperFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperFolder != null)
				msgs = ((InternalEObject) newSuperFolder).eInverseAdd(this, ExtDocModelPackage.FOLDER__SUB_FOLDER, Folder.class, msgs);
			msgs = basicSetSuperFolder(newSuperFolder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.FOLDER__SUPER_FOLDER, newSuperFolder, newSuperFolder));
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
		case ExtDocModelPackage.FOLDER__DOCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDocs()).basicAdd(otherEnd, msgs);
		case ExtDocModelPackage.FOLDER__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((DocContainer) otherEnd, msgs);
		case ExtDocModelPackage.FOLDER__SUB_FOLDER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubFolder()).basicAdd(otherEnd, msgs);
		case ExtDocModelPackage.FOLDER__SUPER_FOLDER:
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
		case ExtDocModelPackage.FOLDER__DOCS:
			return ((InternalEList<?>) getDocs()).basicRemove(otherEnd, msgs);
		case ExtDocModelPackage.FOLDER__CONTAINER:
			return basicSetContainer(null, msgs);
		case ExtDocModelPackage.FOLDER__SUB_FOLDER:
			return ((InternalEList<?>) getSubFolder()).basicRemove(otherEnd, msgs);
		case ExtDocModelPackage.FOLDER__SUPER_FOLDER:
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
		case ExtDocModelPackage.FOLDER__CONTAINER:
			return eInternalContainer().eInverseRemove(this, ExtDocModelPackage.DOC_CONTAINER__FOLDERS, DocContainer.class, msgs);
		case ExtDocModelPackage.FOLDER__SUPER_FOLDER:
			return eInternalContainer().eInverseRemove(this, ExtDocModelPackage.FOLDER__SUB_FOLDER, Folder.class, msgs);
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
		case ExtDocModelPackage.FOLDER__DOCS:
			return getDocs();
		case ExtDocModelPackage.FOLDER__CONTAINER:
			return getContainer();
		case ExtDocModelPackage.FOLDER__SUB_FOLDER:
			return getSubFolder();
		case ExtDocModelPackage.FOLDER__SUPER_FOLDER:
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
		case ExtDocModelPackage.FOLDER__DOCS:
			getDocs().clear();
			getDocs().addAll((Collection<? extends Doc>) newValue);
			return;
		case ExtDocModelPackage.FOLDER__CONTAINER:
			setContainer((DocContainer) newValue);
			return;
		case ExtDocModelPackage.FOLDER__SUB_FOLDER:
			getSubFolder().clear();
			getSubFolder().addAll((Collection<? extends Folder>) newValue);
			return;
		case ExtDocModelPackage.FOLDER__SUPER_FOLDER:
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
		case ExtDocModelPackage.FOLDER__DOCS:
			getDocs().clear();
			return;
		case ExtDocModelPackage.FOLDER__CONTAINER:
			setContainer((DocContainer) null);
			return;
		case ExtDocModelPackage.FOLDER__SUB_FOLDER:
			getSubFolder().clear();
			return;
		case ExtDocModelPackage.FOLDER__SUPER_FOLDER:
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
		case ExtDocModelPackage.FOLDER__DOCS:
			return docs != null && !docs.isEmpty();
		case ExtDocModelPackage.FOLDER__CONTAINER:
			return getContainer() != null;
		case ExtDocModelPackage.FOLDER__SUB_FOLDER:
			return subFolder != null && !subFolder.isEmpty();
		case ExtDocModelPackage.FOLDER__SUPER_FOLDER:
			return getSuperFolder() != null;
		}
		return super.eIsSet(featureID);
	}

} //FolderImpl
