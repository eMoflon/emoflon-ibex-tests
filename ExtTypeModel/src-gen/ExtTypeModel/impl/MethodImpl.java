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
 *   <li>{@link ExtTypeModel.impl.MethodImpl#getDoc <em>Doc</em>}</li>
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
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected JavaDoc doc;

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
			params = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this,
					ExtTypeModelPackage.METHOD__PARAMS, ExtTypeModelPackage.PARAMETER__METHOD);
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
		if (newType != eInternalContainer()
				|| (eContainerFeatureID() != ExtTypeModelPackage.METHOD__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, ExtTypeModelPackage.TYPE__METHODS, Type.class,
						msgs);
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
	public JavaDoc getDoc() {
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc(JavaDoc newDoc, NotificationChain msgs) {
		JavaDoc oldDoc = doc;
		doc = newDoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExtTypeModelPackage.METHOD__DOC, oldDoc, newDoc);
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
	public void setDoc(JavaDoc newDoc) {
		if (newDoc != doc) {
			NotificationChain msgs = null;
			if (doc != null)
				msgs = ((InternalEObject) doc).eInverseRemove(this, ExtTypeModelPackage.JAVA_DOC__METHOD, JavaDoc.class,
						msgs);
			if (newDoc != null)
				msgs = ((InternalEObject) newDoc).eInverseAdd(this, ExtTypeModelPackage.JAVA_DOC__METHOD, JavaDoc.class,
						msgs);
			msgs = basicSetDoc(newDoc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.METHOD__DOC, newDoc, newDoc));
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
		case ExtTypeModelPackage.METHOD__DOC:
			if (doc != null)
				msgs = ((InternalEObject) doc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExtTypeModelPackage.METHOD__DOC, null, msgs);
			return basicSetDoc((JavaDoc) otherEnd, msgs);
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
		case ExtTypeModelPackage.METHOD__DOC:
			return basicSetDoc(null, msgs);
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
		case ExtTypeModelPackage.METHOD__DOC:
			return getDoc();
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
		case ExtTypeModelPackage.METHOD__DOC:
			setDoc((JavaDoc) newValue);
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
		case ExtTypeModelPackage.METHOD__DOC:
			setDoc((JavaDoc) null);
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
		case ExtTypeModelPackage.METHOD__DOC:
			return doc != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodImpl
