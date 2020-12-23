/**
 */
package ExtTypeModel.impl;

import ExtTypeModel.ExtTypeModelPackage;
import ExtTypeModel.Field;
import ExtTypeModel.Method;
import ExtTypeModel.Type;

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
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExtTypeModel.impl.TypeImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link ExtTypeModel.impl.TypeImpl#getExtendedBy <em>Extended By</em>}</li>
 *   <li>{@link ExtTypeModel.impl.TypeImpl#getInheritsFrom <em>Inherits From</em>}</li>
 *   <li>{@link ExtTypeModel.impl.TypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link ExtTypeModel.impl.TypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link ExtTypeModel.impl.TypeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends NamedElementImpl implements Type {
	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedBy() <em>Extended By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedBy()
	 * @generated
	 * @ordered
	 */
	protected Type extendedBy;

	/**
	 * The cached value of the '{@link #getInheritsFrom() <em>Inherits From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritsFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> inheritsFrom;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtTypeModelPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.TYPE__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getExtendedBy() {
		if (extendedBy != null && extendedBy.eIsProxy()) {
			InternalEObject oldExtendedBy = (InternalEObject) extendedBy;
			extendedBy = (Type) eResolveProxy(oldExtendedBy);
			if (extendedBy != oldExtendedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtTypeModelPackage.TYPE__EXTENDED_BY, oldExtendedBy, extendedBy));
			}
		}
		return extendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetExtendedBy() {
		return extendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedBy(Type newExtendedBy, NotificationChain msgs) {
		Type oldExtendedBy = extendedBy;
		extendedBy = newExtendedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.TYPE__EXTENDED_BY, oldExtendedBy,
					newExtendedBy);
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
	public void setExtendedBy(Type newExtendedBy) {
		if (newExtendedBy != extendedBy) {
			NotificationChain msgs = null;
			if (extendedBy != null)
				msgs = ((InternalEObject) extendedBy).eInverseRemove(this, ExtTypeModelPackage.TYPE__INHERITS_FROM, Type.class, msgs);
			if (newExtendedBy != null)
				msgs = ((InternalEObject) newExtendedBy).eInverseAdd(this, ExtTypeModelPackage.TYPE__INHERITS_FROM, Type.class, msgs);
			msgs = basicSetExtendedBy(newExtendedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.TYPE__EXTENDED_BY, newExtendedBy, newExtendedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getInheritsFrom() {
		if (inheritsFrom == null) {
			inheritsFrom = new EObjectWithInverseResolvingEList<Type>(Type.class, this, ExtTypeModelPackage.TYPE__INHERITS_FROM,
					ExtTypeModelPackage.TYPE__EXTENDED_BY);
		}
		return inheritsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this, ExtTypeModelPackage.TYPE__METHODS,
					ExtTypeModelPackage.METHOD__TYPE);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<Field>(Field.class, this, ExtTypeModelPackage.TYPE__FIELDS, ExtTypeModelPackage.FIELD__METHOD);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtTypeModel.Package getPackage() {
		if (eContainerFeatureID() != ExtTypeModelPackage.TYPE__PACKAGE)
			return null;
		return (ExtTypeModel.Package) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(ExtTypeModel.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPackage, ExtTypeModelPackage.TYPE__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(ExtTypeModel.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != ExtTypeModelPackage.TYPE__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject) newPackage).eInverseAdd(this, ExtTypeModelPackage.PACKAGE__TYPES, ExtTypeModel.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.TYPE__PACKAGE, newPackage, newPackage));
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
		case ExtTypeModelPackage.TYPE__EXTENDED_BY:
			if (extendedBy != null)
				msgs = ((InternalEObject) extendedBy).eInverseRemove(this, ExtTypeModelPackage.TYPE__INHERITS_FROM, Type.class, msgs);
			return basicSetExtendedBy((Type) otherEnd, msgs);
		case ExtTypeModelPackage.TYPE__INHERITS_FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInheritsFrom()).basicAdd(otherEnd, msgs);
		case ExtTypeModelPackage.TYPE__METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods()).basicAdd(otherEnd, msgs);
		case ExtTypeModelPackage.TYPE__FIELDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFields()).basicAdd(otherEnd, msgs);
		case ExtTypeModelPackage.TYPE__PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPackage((ExtTypeModel.Package) otherEnd, msgs);
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
		case ExtTypeModelPackage.TYPE__EXTENDED_BY:
			return basicSetExtendedBy(null, msgs);
		case ExtTypeModelPackage.TYPE__INHERITS_FROM:
			return ((InternalEList<?>) getInheritsFrom()).basicRemove(otherEnd, msgs);
		case ExtTypeModelPackage.TYPE__METHODS:
			return ((InternalEList<?>) getMethods()).basicRemove(otherEnd, msgs);
		case ExtTypeModelPackage.TYPE__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case ExtTypeModelPackage.TYPE__PACKAGE:
			return basicSetPackage(null, msgs);
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
		case ExtTypeModelPackage.TYPE__PACKAGE:
			return eInternalContainer().eInverseRemove(this, ExtTypeModelPackage.PACKAGE__TYPES, ExtTypeModel.Package.class, msgs);
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
		case ExtTypeModelPackage.TYPE__INTERFACE:
			return isInterface();
		case ExtTypeModelPackage.TYPE__EXTENDED_BY:
			if (resolve)
				return getExtendedBy();
			return basicGetExtendedBy();
		case ExtTypeModelPackage.TYPE__INHERITS_FROM:
			return getInheritsFrom();
		case ExtTypeModelPackage.TYPE__METHODS:
			return getMethods();
		case ExtTypeModelPackage.TYPE__FIELDS:
			return getFields();
		case ExtTypeModelPackage.TYPE__PACKAGE:
			return getPackage();
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
		case ExtTypeModelPackage.TYPE__INTERFACE:
			setInterface((Boolean) newValue);
			return;
		case ExtTypeModelPackage.TYPE__EXTENDED_BY:
			setExtendedBy((Type) newValue);
			return;
		case ExtTypeModelPackage.TYPE__INHERITS_FROM:
			getInheritsFrom().clear();
			getInheritsFrom().addAll((Collection<? extends Type>) newValue);
			return;
		case ExtTypeModelPackage.TYPE__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case ExtTypeModelPackage.TYPE__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends Field>) newValue);
			return;
		case ExtTypeModelPackage.TYPE__PACKAGE:
			setPackage((ExtTypeModel.Package) newValue);
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
		case ExtTypeModelPackage.TYPE__INTERFACE:
			setInterface(INTERFACE_EDEFAULT);
			return;
		case ExtTypeModelPackage.TYPE__EXTENDED_BY:
			setExtendedBy((Type) null);
			return;
		case ExtTypeModelPackage.TYPE__INHERITS_FROM:
			getInheritsFrom().clear();
			return;
		case ExtTypeModelPackage.TYPE__METHODS:
			getMethods().clear();
			return;
		case ExtTypeModelPackage.TYPE__FIELDS:
			getFields().clear();
			return;
		case ExtTypeModelPackage.TYPE__PACKAGE:
			setPackage((ExtTypeModel.Package) null);
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
		case ExtTypeModelPackage.TYPE__INTERFACE:
			return interface_ != INTERFACE_EDEFAULT;
		case ExtTypeModelPackage.TYPE__EXTENDED_BY:
			return extendedBy != null;
		case ExtTypeModelPackage.TYPE__INHERITS_FROM:
			return inheritsFrom != null && !inheritsFrom.isEmpty();
		case ExtTypeModelPackage.TYPE__METHODS:
			return methods != null && !methods.isEmpty();
		case ExtTypeModelPackage.TYPE__FIELDS:
			return fields != null && !fields.isEmpty();
		case ExtTypeModelPackage.TYPE__PACKAGE:
			return getPackage() != null;
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
		result.append(" (interface: ");
		result.append(interface_);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
