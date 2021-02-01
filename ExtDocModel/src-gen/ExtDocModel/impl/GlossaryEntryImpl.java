/**
 */
package ExtDocModel.impl;

import ExtDocModel.Entry;
import ExtDocModel.ExtDocModelPackage;
import ExtDocModel.Glossary;
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
 * An implementation of the model object '<em><b>Glossary Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.impl.GlossaryEntryImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link ExtDocModel.impl.GlossaryEntryImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryEntryImpl extends NamedElementImpl implements GlossaryEntry {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtDocModelPackage.Literals.GLOSSARY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glossary getGlossary() {
		if (eContainerFeatureID() != ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY)
			return null;
		return (Glossary) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossary(Glossary newGlossary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGlossary, ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossary(Glossary newGlossary) {
		if (newGlossary != eInternalContainer()
				|| (eContainerFeatureID() != ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY && newGlossary != null)) {
			if (EcoreUtil.isAncestor(this, newGlossary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGlossary != null)
				msgs = ((InternalEObject) newGlossary).eInverseAdd(this, ExtDocModelPackage.GLOSSARY__ENTRIES,
						Glossary.class, msgs);
			msgs = basicSetGlossary(newGlossary, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY,
					newGlossary, newGlossary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entry> getEntries() {
		if (entries == null) {
			entries = new EObjectWithInverseResolvingEList.ManyInverse<Entry>(Entry.class, this,
					ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES, ExtDocModelPackage.ENTRY__GLOSSARY_ENTRIES);
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
		case ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetGlossary((Glossary) otherEnd, msgs);
		case ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntries()).basicAdd(otherEnd, msgs);
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
		case ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY:
			return basicSetGlossary(null, msgs);
		case ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
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
		case ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY:
			return eInternalContainer().eInverseRemove(this, ExtDocModelPackage.GLOSSARY__ENTRIES, Glossary.class,
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
		case ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY:
			return getGlossary();
		case ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES:
			return getEntries();
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
		case ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY:
			setGlossary((Glossary) newValue);
			return;
		case ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends Entry>) newValue);
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
		case ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY:
			setGlossary((Glossary) null);
			return;
		case ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES:
			getEntries().clear();
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
		case ExtDocModelPackage.GLOSSARY_ENTRY__GLOSSARY:
			return getGlossary() != null;
		case ExtDocModelPackage.GLOSSARY_ENTRY__ENTRIES:
			return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlossaryEntryImpl
