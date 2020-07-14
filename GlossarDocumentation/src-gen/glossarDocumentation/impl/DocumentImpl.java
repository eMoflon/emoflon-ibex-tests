/**
 */
package glossarDocumentation.impl;

import glossarDocumentation.Document;
import glossarDocumentation.DocumentationContainer;
import glossarDocumentation.Entry;
import glossarDocumentation.GlossarDocumentationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.impl.DocumentImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link glossarDocumentation.impl.DocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link glossarDocumentation.impl.DocumentImpl#getHyperRefs <em>Hyper Refs</em>}</li>
 *   <li>{@link glossarDocumentation.impl.DocumentImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link glossarDocumentation.impl.DocumentImpl#getReverseHRef <em>Reverse HRef</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
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
	 * The cached value of the '{@link #getHyperRefs() <em>Hyper Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> hyperRefs;

	/**
	 * The cached value of the '{@link #getReverseHRef() <em>Reverse HRef</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseHRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> reverseHRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossarDocumentationPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<Entry>(Entry.class, this,
					GlossarDocumentationPackage.DOCUMENT__ENTRIES, GlossarDocumentationPackage.ENTRY__DOCUMENT);
		}
		return entries;
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
		case GlossarDocumentationPackage.DOCUMENT__ENTRIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntries()).basicAdd(otherEnd, msgs);
		case GlossarDocumentationPackage.DOCUMENT__HYPER_REFS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHyperRefs()).basicAdd(otherEnd, msgs);
		case GlossarDocumentationPackage.DOCUMENT__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((DocumentationContainer) otherEnd, msgs);
		case GlossarDocumentationPackage.DOCUMENT__REVERSE_HREF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReverseHRef()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlossarDocumentationPackage.DOCUMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Document> getHyperRefs() {
		if (hyperRefs == null) {
			hyperRefs = new EObjectWithInverseResolvingEList.ManyInverse<Document>(Document.class, this,
					GlossarDocumentationPackage.DOCUMENT__HYPER_REFS,
					GlossarDocumentationPackage.DOCUMENT__REVERSE_HREF);
		}
		return hyperRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentationContainer getContainer() {
		if (eContainerFeatureID() != GlossarDocumentationPackage.DOCUMENT__CONTAINER)
			return null;
		return (DocumentationContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(DocumentationContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, GlossarDocumentationPackage.DOCUMENT__CONTAINER,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(DocumentationContainer newContainer) {
		if (newContainer != eInternalContainer()
				|| (eContainerFeatureID() != GlossarDocumentationPackage.DOCUMENT__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
						GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__DOCUMENTS, DocumentationContainer.class,
						msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossarDocumentationPackage.DOCUMENT__CONTAINER,
					newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Document> getReverseHRef() {
		if (reverseHRef == null) {
			reverseHRef = new EObjectWithInverseResolvingEList.ManyInverse<Document>(Document.class, this,
					GlossarDocumentationPackage.DOCUMENT__REVERSE_HREF,
					GlossarDocumentationPackage.DOCUMENT__HYPER_REFS);
		}
		return reverseHRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GlossarDocumentationPackage.DOCUMENT__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
		case GlossarDocumentationPackage.DOCUMENT__HYPER_REFS:
			return ((InternalEList<?>) getHyperRefs()).basicRemove(otherEnd, msgs);
		case GlossarDocumentationPackage.DOCUMENT__CONTAINER:
			return basicSetContainer(null, msgs);
		case GlossarDocumentationPackage.DOCUMENT__REVERSE_HREF:
			return ((InternalEList<?>) getReverseHRef()).basicRemove(otherEnd, msgs);
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
		case GlossarDocumentationPackage.DOCUMENT__CONTAINER:
			return eInternalContainer().eInverseRemove(this,
					GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__DOCUMENTS, DocumentationContainer.class, msgs);
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
		case GlossarDocumentationPackage.DOCUMENT__ENTRIES:
			return getEntries();
		case GlossarDocumentationPackage.DOCUMENT__NAME:
			return getName();
		case GlossarDocumentationPackage.DOCUMENT__HYPER_REFS:
			return getHyperRefs();
		case GlossarDocumentationPackage.DOCUMENT__CONTAINER:
			return getContainer();
		case GlossarDocumentationPackage.DOCUMENT__REVERSE_HREF:
			return getReverseHRef();
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
		case GlossarDocumentationPackage.DOCUMENT__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends Entry>) newValue);
			return;
		case GlossarDocumentationPackage.DOCUMENT__NAME:
			setName((String) newValue);
			return;
		case GlossarDocumentationPackage.DOCUMENT__HYPER_REFS:
			getHyperRefs().clear();
			getHyperRefs().addAll((Collection<? extends Document>) newValue);
			return;
		case GlossarDocumentationPackage.DOCUMENT__CONTAINER:
			setContainer((DocumentationContainer) newValue);
			return;
		case GlossarDocumentationPackage.DOCUMENT__REVERSE_HREF:
			getReverseHRef().clear();
			getReverseHRef().addAll((Collection<? extends Document>) newValue);
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
		case GlossarDocumentationPackage.DOCUMENT__ENTRIES:
			getEntries().clear();
			return;
		case GlossarDocumentationPackage.DOCUMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GlossarDocumentationPackage.DOCUMENT__HYPER_REFS:
			getHyperRefs().clear();
			return;
		case GlossarDocumentationPackage.DOCUMENT__CONTAINER:
			setContainer((DocumentationContainer) null);
			return;
		case GlossarDocumentationPackage.DOCUMENT__REVERSE_HREF:
			getReverseHRef().clear();
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
		case GlossarDocumentationPackage.DOCUMENT__ENTRIES:
			return entries != null && !entries.isEmpty();
		case GlossarDocumentationPackage.DOCUMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GlossarDocumentationPackage.DOCUMENT__HYPER_REFS:
			return hyperRefs != null && !hyperRefs.isEmpty();
		case GlossarDocumentationPackage.DOCUMENT__CONTAINER:
			return getContainer() != null;
		case GlossarDocumentationPackage.DOCUMENT__REVERSE_HREF:
			return reverseHRef != null && !reverseHRef.isEmpty();
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

} //DocumentImpl
