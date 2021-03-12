/**
 */
package ExtTypeModel.impl;

import ExtTypeModel.ExtTypeModelPackage;
import ExtTypeModel.JavaDoc;
import ExtTypeModel.Method;
import ExtTypeModel.Parameter;
import ExtTypeModel.Type;

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
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExtTypeModel.impl.MethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ExtTypeModel.impl.MethodImpl#getType <em>Type</em>}</li>
 *   <li>{@link ExtTypeModel.impl.MethodImpl#getDocs <em>Docs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends NamedElementImpl implements Method {
	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The cached value of the '{@link #getDocs() <em>Docs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaDoc> docs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtTypeModelPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, ExtTypeModelPackage.METHOD__PARAMS,
					ExtTypeModelPackage.PARAMETER__METHOD);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (eContainerFeatureID() != ExtTypeModelPackage.METHOD__TYPE)
			return null;
		return (Type) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newType, ExtTypeModelPackage.METHOD__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		if (newType != eInternalContainer() || (eContainerFeatureID() != ExtTypeModelPackage.METHOD__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, ExtTypeModelPackage.TYPE__METHODS, Type.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.METHOD__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JavaDoc> getDocs() {
		if (docs == null) {
			docs = new EObjectContainmentWithInverseEList<JavaDoc>(JavaDoc.class, this, ExtTypeModelPackage.METHOD__DOCS,
					ExtTypeModelPackage.JAVA_DOC__METHOD);
		}
		return docs;
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
		case ExtTypeModelPackage.METHOD__PARAMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParams()).basicAdd(otherEnd, msgs);
		case ExtTypeModelPackage.METHOD__TYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetType((Type) otherEnd, msgs);
		case ExtTypeModelPackage.METHOD__DOCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDocs()).basicAdd(otherEnd, msgs);
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
		case ExtTypeModelPackage.METHOD__PARAMS:
			return ((InternalEList<?>) getParams()).basicRemove(otherEnd, msgs);
		case ExtTypeModelPackage.METHOD__TYPE:
			return basicSetType(null, msgs);
		case ExtTypeModelPackage.METHOD__DOCS:
			return ((InternalEList<?>) getDocs()).basicRemove(otherEnd, msgs);
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
		case ExtTypeModelPackage.METHOD__TYPE:
			return eInternalContainer().eInverseRemove(this, ExtTypeModelPackage.TYPE__METHODS, Type.class, msgs);
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
		case ExtTypeModelPackage.METHOD__PARAMS:
			return getParams();
		case ExtTypeModelPackage.METHOD__TYPE:
			return getType();
		case ExtTypeModelPackage.METHOD__DOCS:
			return getDocs();
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
		case ExtTypeModelPackage.METHOD__PARAMS:
			getParams().clear();
			getParams().addAll((Collection<? extends Parameter>) newValue);
			return;
		case ExtTypeModelPackage.METHOD__TYPE:
			setType((Type) newValue);
			return;
		case ExtTypeModelPackage.METHOD__DOCS:
			getDocs().clear();
			getDocs().addAll((Collection<? extends JavaDoc>) newValue);
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
		case ExtTypeModelPackage.METHOD__PARAMS:
			getParams().clear();
			return;
		case ExtTypeModelPackage.METHOD__TYPE:
			setType((Type) null);
			return;
		case ExtTypeModelPackage.METHOD__DOCS:
			getDocs().clear();
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
		case ExtTypeModelPackage.METHOD__PARAMS:
			return params != null && !params.isEmpty();
		case ExtTypeModelPackage.METHOD__TYPE:
			return getType() != null;
		case ExtTypeModelPackage.METHOD__DOCS:
			return docs != null && !docs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
