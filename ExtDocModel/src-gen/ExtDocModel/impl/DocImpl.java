/**
 */
package ExtDocModel.impl;

import ExtDocModel.Doc;
import ExtDocModel.Entry;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.impl.DocImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link ExtDocModel.impl.DocImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link ExtDocModel.impl.DocImpl#getSubDocs <em>Sub Docs</em>}</li>
 *   <li>{@link ExtDocModel.impl.DocImpl#getSuperDocs <em>Super Docs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocImpl extends NamedElementImpl implements Doc {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entries;

	/**
	 * The cached value of the '{@link #getSubDocs() <em>Sub Docs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<Doc> subDocs;
	/**
	 * The cached value of the '{@link #getSuperDocs() <em>Super Docs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<Doc> superDocs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtDocModelPackage.Literals.DOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder getFolder() {
		if (eContainerFeatureID() != ExtDocModelPackage.DOC__FOLDER)
			return null;
		return (Folder) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolder(Folder newFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFolder, ExtDocModelPackage.DOC__FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFolder(Folder newFolder) {
		if (newFolder != eInternalContainer() || (eContainerFeatureID() != ExtDocModelPackage.DOC__FOLDER && newFolder != null)) {
			if (EcoreUtil.isAncestor(this, newFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFolder != null)
				msgs = ((InternalEObject) newFolder).eInverseAdd(this, ExtDocModelPackage.FOLDER__DOCS, Folder.class, msgs);
			msgs = basicSetFolder(newFolder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.DOC__FOLDER, newFolder, newFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<Entry>(Entry.class, this, ExtDocModelPackage.DOC__ENTRIES, ExtDocModelPackage.ENTRY__DOC);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doc> getSubDocs() {
		if (subDocs == null) {
			subDocs = new EObjectWithInverseResolvingEList.ManyInverse<Doc>(Doc.class, this, ExtDocModelPackage.DOC__SUB_DOCS,
					ExtDocModelPackage.DOC__SUPER_DOCS);
		}
		return subDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doc> getSuperDocs() {
		if (superDocs == null) {
			superDocs = new EObjectWithInverseResolvingEList.ManyInverse<Doc>(Doc.class, this, ExtDocModelPackage.DOC__SUPER_DOCS,
					ExtDocModelPackage.DOC__SUB_DOCS);
		}
		return superDocs;
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
		case ExtDocModelPackage.DOC__FOLDER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFolder((Folder) otherEnd, msgs);
		case ExtDocModelPackage.DOC__ENTRIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntries()).basicAdd(otherEnd, msgs);
		case ExtDocModelPackage.DOC__SUB_DOCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubDocs()).basicAdd(otherEnd, msgs);
		case ExtDocModelPackage.DOC__SUPER_DOCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuperDocs()).basicAdd(otherEnd, msgs);
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
		case ExtDocModelPackage.DOC__FOLDER:
			return basicSetFolder(null, msgs);
		case ExtDocModelPackage.DOC__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
		case ExtDocModelPackage.DOC__SUB_DOCS:
			return ((InternalEList<?>) getSubDocs()).basicRemove(otherEnd, msgs);
		case ExtDocModelPackage.DOC__SUPER_DOCS:
			return ((InternalEList<?>) getSuperDocs()).basicRemove(otherEnd, msgs);
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
		case ExtDocModelPackage.DOC__FOLDER:
			return eInternalContainer().eInverseRemove(this, ExtDocModelPackage.FOLDER__DOCS, Folder.class, msgs);
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
		case ExtDocModelPackage.DOC__FOLDER:
			return getFolder();
		case ExtDocModelPackage.DOC__ENTRIES:
			return getEntries();
		case ExtDocModelPackage.DOC__SUB_DOCS:
			return getSubDocs();
		case ExtDocModelPackage.DOC__SUPER_DOCS:
			return getSuperDocs();
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
		case ExtDocModelPackage.DOC__FOLDER:
			setFolder((Folder) newValue);
			return;
		case ExtDocModelPackage.DOC__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends Entry>) newValue);
			return;
		case ExtDocModelPackage.DOC__SUB_DOCS:
			getSubDocs().clear();
			getSubDocs().addAll((Collection<? extends Doc>) newValue);
			return;
		case ExtDocModelPackage.DOC__SUPER_DOCS:
			getSuperDocs().clear();
			getSuperDocs().addAll((Collection<? extends Doc>) newValue);
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
		case ExtDocModelPackage.DOC__FOLDER:
			setFolder((Folder) null);
			return;
		case ExtDocModelPackage.DOC__ENTRIES:
			getEntries().clear();
			return;
		case ExtDocModelPackage.DOC__SUB_DOCS:
			getSubDocs().clear();
			return;
		case ExtDocModelPackage.DOC__SUPER_DOCS:
			getSuperDocs().clear();
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
		case ExtDocModelPackage.DOC__FOLDER:
			return getFolder() != null;
		case ExtDocModelPackage.DOC__ENTRIES:
			return entries != null && !entries.isEmpty();
		case ExtDocModelPackage.DOC__SUB_DOCS:
			return subDocs != null && !subDocs.isEmpty();
		case ExtDocModelPackage.DOC__SUPER_DOCS:
			return superDocs != null && !superDocs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocImpl
