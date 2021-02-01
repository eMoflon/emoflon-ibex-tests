/**
 */
package ExtDocModel.impl;

import ExtDocModel.Annotation;
import ExtDocModel.Doc;
import ExtDocModel.Entry;
import ExtDocModel.EntryType;
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
 *   <li>{@link ExtDocModel.impl.EntryImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link ExtDocModel.impl.EntryImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link ExtDocModel.impl.EntryImpl#getGlossaryEntries <em>Glossary Entries</em>}</li>
 *   <li>{@link ExtDocModel.impl.EntryImpl#getType <em>Type</em>}</li>
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
	 * The cached value of the '{@link #getGlossaryEntries() <em>Glossary Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossaryEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<GlossaryEntry> glossaryEntries;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EntryType TYPE_EDEFAULT = EntryType.FIELD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EntryType type = TYPE_EDEFAULT;

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
	public Doc getDoc() {
		if (eContainerFeatureID() != ExtDocModelPackage.ENTRY__DOC)
			return null;
		return (Doc) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc(Doc newDoc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDoc, ExtDocModelPackage.ENTRY__DOC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoc(Doc newDoc) {
		if (newDoc != eInternalContainer()
				|| (eContainerFeatureID() != ExtDocModelPackage.ENTRY__DOC && newDoc != null)) {
			if (EcoreUtil.isAncestor(this, newDoc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoc != null)
				msgs = ((InternalEObject) newDoc).eInverseAdd(this, ExtDocModelPackage.DOC__ENTRIES, Doc.class, msgs);
			msgs = basicSetDoc(newDoc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.ENTRY__DOC, newDoc, newDoc));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExtDocModelPackage.ENTRY__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject) annotation).eInverseRemove(this, ExtDocModelPackage.ANNOTATION__ENTRY,
						Annotation.class, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject) newAnnotation).eInverseAdd(this, ExtDocModelPackage.ANNOTATION__ENTRY,
						Annotation.class, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.ENTRY__ANNOTATION, newAnnotation,
					newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryEntry> getGlossaryEntries() {
		if (glossaryEntries == null) {
			glossaryEntries = new EObjectWithInverseResolvingEList.ManyInverse<GlossaryEntry>(GlossaryEntry.class, this,
					ExtDocModelPackage.ENTRY__GLOSSARY_ENTRIES, ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES);
		}
		return glossaryEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EntryType newType) {
		EntryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.ENTRY__TYPE, oldType, type));
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
		case ExtDocModelPackage.ENTRY__DOC:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDoc((Doc) otherEnd, msgs);
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			if (annotation != null)
				msgs = ((InternalEObject) annotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExtDocModelPackage.ENTRY__ANNOTATION, null, msgs);
			return basicSetAnnotation((Annotation) otherEnd, msgs);
		case ExtDocModelPackage.ENTRY__GLOSSARY_ENTRIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGlossaryEntries()).basicAdd(otherEnd, msgs);
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
		case ExtDocModelPackage.ENTRY__DOC:
			return basicSetDoc(null, msgs);
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			return basicSetAnnotation(null, msgs);
		case ExtDocModelPackage.ENTRY__GLOSSARY_ENTRIES:
			return ((InternalEList<?>) getGlossaryEntries()).basicRemove(otherEnd, msgs);
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
		case ExtDocModelPackage.ENTRY__DOC:
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
		case ExtDocModelPackage.ENTRY__DOC:
			return getDoc();
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			return getAnnotation();
		case ExtDocModelPackage.ENTRY__GLOSSARY_ENTRIES:
			return getGlossaryEntries();
		case ExtDocModelPackage.ENTRY__TYPE:
			return getType();
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
		case ExtDocModelPackage.ENTRY__DOC:
			setDoc((Doc) newValue);
			return;
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			setAnnotation((Annotation) newValue);
			return;
		case ExtDocModelPackage.ENTRY__GLOSSARY_ENTRIES:
			getGlossaryEntries().clear();
			getGlossaryEntries().addAll((Collection<? extends GlossaryEntry>) newValue);
			return;
		case ExtDocModelPackage.ENTRY__TYPE:
			setType((EntryType) newValue);
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
		case ExtDocModelPackage.ENTRY__DOC:
			setDoc((Doc) null);
			return;
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			setAnnotation((Annotation) null);
			return;
		case ExtDocModelPackage.ENTRY__GLOSSARY_ENTRIES:
			getGlossaryEntries().clear();
			return;
		case ExtDocModelPackage.ENTRY__TYPE:
			setType(TYPE_EDEFAULT);
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
		case ExtDocModelPackage.ENTRY__DOC:
			return getDoc() != null;
		case ExtDocModelPackage.ENTRY__ANNOTATION:
			return annotation != null;
		case ExtDocModelPackage.ENTRY__GLOSSARY_ENTRIES:
			return glossaryEntries != null && !glossaryEntries.isEmpty();
		case ExtDocModelPackage.ENTRY__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EntryImpl
