/**
 */
package ExtDocModel.impl;

import ExtDocModel.Annotation;
import ExtDocModel.Doc;
import ExtDocModel.Entry;
import ExtDocModel.ExtDocModelPackage;
import ExtDocModel.GlossaryEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.impl.EntryImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link ExtDocModel.impl.EntryImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ExtDocModel.impl.EntryImpl#getGlossarEntries <em>Glossar Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryImpl extends NamedElementImpl implements Entry {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getGlossarEntries() <em>Glossar Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossarEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<GlossaryEntry> glossarEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtDocModelPackage.Literals.ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Doc getEntry() {
		if (eContainerFeatureID() != ExtDocModelPackage.ENTRY__ENTRY)
			return null;
		return (Doc) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Doc newEntry, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEntry, ExtDocModelPackage.ENTRY__ENTRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntry(Doc newEntry) {
		if (newEntry != eInternalContainer() || (eContainerFeatureID() != ExtDocModelPackage.ENTRY__ENTRY && newEntry != null)) {
			if (EcoreUtil.isAncestor(this, newEntry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntry != null)
				msgs = ((InternalEObject) newEntry).eInverseAdd(this, ExtDocModelPackage.DOC__ENTRIES, Doc.class, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.ENTRY__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.ENTRY__ANNOTATION, oldAnnotation,
					newAnnotation);
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
	@Override
	public void setAnnotation(Annotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject) annotation).eInverseRemove(this, ExtDocModelPackage.ANNOTATION__ENTRY, Annotation.class, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject) newAnnotation).eInverseAdd(this, ExtDocModelPackage.ANNOTATION__ENTRY, Annotation.class, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.ENTRY__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryEntry> getGlossarEntries() {
		if (glossarEntries == null) {
			glossarEntries = new EObjectWithInverseResolvingEList.ManyInverse<GlossaryEntry>(GlossaryEntry.class, this,
					ExtDocModelPackage.ENTRY__GLOSSAR_ENTRIES, ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES);
		}
		return glossarEntries;
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
		case ExtDocModelPackage.ENTRY__ENTRY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEntry((Doc) otherEnd, msgs);
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			if (annotation != null)
				msgs = ((InternalEObject) annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtDocModelPackage.ENTRY__ANNOTATION, null, msgs);
			return basicSetAnnotation((Annotation) otherEnd, msgs);
		case ExtDocModelPackage.ENTRY__GLOSSAR_ENTRIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGlossarEntries()).basicAdd(otherEnd, msgs);
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
		case ExtDocModelPackage.ENTRY__ENTRY:
			return basicSetEntry(null, msgs);
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			return basicSetAnnotation(null, msgs);
		case ExtDocModelPackage.ENTRY__GLOSSAR_ENTRIES:
			return ((InternalEList<?>) getGlossarEntries()).basicRemove(otherEnd, msgs);
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
		case ExtDocModelPackage.ENTRY__ENTRY:
			return eInternalContainer().eInverseRemove(this, ExtDocModelPackage.DOC__ENTRIES, Doc.class, msgs);
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
		case ExtDocModelPackage.ENTRY__ENTRY:
			return getEntry();
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			return getAnnotation();
		case ExtDocModelPackage.ENTRY__GLOSSAR_ENTRIES:
			return getGlossarEntries();
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
		case ExtDocModelPackage.ENTRY__ENTRY:
			setEntry((Doc) newValue);
			return;
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			setAnnotation((Annotation) newValue);
			return;
		case ExtDocModelPackage.ENTRY__GLOSSAR_ENTRIES:
			getGlossarEntries().clear();
			getGlossarEntries().addAll((Collection<? extends GlossaryEntry>) newValue);
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
		case ExtDocModelPackage.ENTRY__ENTRY:
			setEntry((Doc) null);
			return;
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			setAnnotation((Annotation) null);
			return;
		case ExtDocModelPackage.ENTRY__GLOSSAR_ENTRIES:
			getGlossarEntries().clear();
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
		case ExtDocModelPackage.ENTRY__ENTRY:
			return getEntry() != null;
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			return annotation != null;
		case ExtDocModelPackage.ENTRY__GLOSSAR_ENTRIES:
			return glossarEntries != null && !glossarEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryImpl
