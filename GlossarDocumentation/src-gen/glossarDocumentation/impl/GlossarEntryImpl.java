/**
 */
package glossarDocumentation.impl;

import glossarDocumentation.Entry;
import glossarDocumentation.Glossar;
import glossarDocumentation.GlossarDocumentationPackage;
import glossarDocumentation.GlossarEntry;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossar Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.impl.GlossarEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link glossarDocumentation.impl.GlossarEntryImpl#getGlossar <em>Glossar</em>}</li>
 *   <li>{@link glossarDocumentation.impl.GlossarEntryImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossarEntryImpl extends MinimalEObjectImpl.Container implements GlossarEntry {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	protected GlossarEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossarDocumentationPackage.Literals.GLOSSAR_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossarDocumentationPackage.GLOSSAR_ENTRY__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glossar getGlossar() {
		if (eContainerFeatureID() != GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR)
			return null;
		return (Glossar) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossar(Glossar newGlossar, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGlossar, GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlossar(Glossar newGlossar) {
		if (newGlossar != eInternalContainer()
				|| (eContainerFeatureID() != GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR
						&& newGlossar != null)) {
			if (EcoreUtil.isAncestor(this, newGlossar))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGlossar != null)
				msgs = ((InternalEObject) newGlossar).eInverseAdd(this, GlossarDocumentationPackage.GLOSSAR__ENTRIES,
						Glossar.class, msgs);
			msgs = basicSetGlossar(newGlossar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR,
					newGlossar, newGlossar));
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
					GlossarDocumentationPackage.GLOSSAR_ENTRY__ENTRIES,
					GlossarDocumentationPackage.ENTRY__GLOSSARENTRIES);
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
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetGlossar((Glossar) otherEnd, msgs);
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__ENTRIES:
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
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR:
			return basicSetGlossar(null, msgs);
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__ENTRIES:
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
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR:
			return eInternalContainer().eInverseRemove(this, GlossarDocumentationPackage.GLOSSAR__ENTRIES,
					Glossar.class, msgs);
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
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__VALUE:
			return getValue();
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR:
			return getGlossar();
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__ENTRIES:
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
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__VALUE:
			setValue((String) newValue);
			return;
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR:
			setGlossar((Glossar) newValue);
			return;
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__ENTRIES:
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
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR:
			setGlossar((Glossar) null);
			return;
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__ENTRIES:
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
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__GLOSSAR:
			return getGlossar() != null;
		case GlossarDocumentationPackage.GLOSSAR_ENTRY__ENTRIES:
			return entries != null && !entries.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //GlossarEntryImpl
