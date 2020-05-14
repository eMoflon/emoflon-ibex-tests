/**
 */
package glossarDocumentation.impl;

import glossarDocumentation.Entry;
import glossarDocumentation.EntryType;
import glossarDocumentation.GlossarDocumentationPackage;
import glossarDocumentation.GlossarEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.impl.EntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link glossarDocumentation.impl.EntryImpl#getGlossarentries <em>Glossarentries</em>}</li>
 *   <li>{@link glossarDocumentation.impl.EntryImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryImpl extends MinimalEObjectImpl.Container implements Entry {
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
	 * The cached value of the '{@link #getGlossarentries() <em>Glossarentries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossarentries()
	 * @generated
	 * @ordered
	 */
	protected EList<GlossarEntry> glossarentries;

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
		return GlossarDocumentationPackage.Literals.ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlossarDocumentationPackage.ENTRY__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossarEntry> getGlossarentries() {
		if (glossarentries == null) {
			glossarentries = new EObjectResolvingEList<GlossarEntry>(GlossarEntry.class, this,
					GlossarDocumentationPackage.ENTRY__GLOSSARENTRIES);
		}
		return glossarentries;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlossarDocumentationPackage.ENTRY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GlossarDocumentationPackage.ENTRY__TYPE:
			return getType();
		case GlossarDocumentationPackage.ENTRY__GLOSSARENTRIES:
			return getGlossarentries();
		case GlossarDocumentationPackage.ENTRY__NAME:
			return getName();
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
		case GlossarDocumentationPackage.ENTRY__TYPE:
			setType((EntryType) newValue);
			return;
		case GlossarDocumentationPackage.ENTRY__GLOSSARENTRIES:
			getGlossarentries().clear();
			getGlossarentries().addAll((Collection<? extends GlossarEntry>) newValue);
			return;
		case GlossarDocumentationPackage.ENTRY__NAME:
			setName((String) newValue);
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
		case GlossarDocumentationPackage.ENTRY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GlossarDocumentationPackage.ENTRY__GLOSSARENTRIES:
			getGlossarentries().clear();
			return;
		case GlossarDocumentationPackage.ENTRY__NAME:
			setName(NAME_EDEFAULT);
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
		case GlossarDocumentationPackage.ENTRY__TYPE:
			return type != TYPE_EDEFAULT;
		case GlossarDocumentationPackage.ENTRY__GLOSSARENTRIES:
			return glossarentries != null && !glossarentries.isEmpty();
		case GlossarDocumentationPackage.ENTRY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntryImpl
