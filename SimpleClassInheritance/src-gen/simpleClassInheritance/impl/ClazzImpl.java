/**
 */
package simpleClassInheritance.impl;

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

import simpleClassInheritance.Clazz;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.Field;
import simpleClassInheritance.Method;
import simpleClassInheritance.SimpleClassInheritancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleClassInheritance.impl.ClazzImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link simpleClassInheritance.impl.ClazzImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link simpleClassInheritance.impl.ClazzImpl#getSuperClazz <em>Super Clazz</em>}</li>
 *   <li>{@link simpleClassInheritance.impl.ClazzImpl#getSubClazzes <em>Sub Clazzes</em>}</li>
 *   <li>{@link simpleClassInheritance.impl.ClazzImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClazzImpl extends NamedElementImpl implements Clazz {
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
	 * The cached value of the '{@link #getSubClazzes() <em>Sub Clazzes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClazzes()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> subClazzes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClazzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleClassInheritancePackage.Literals.CLAZZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this,
					SimpleClassInheritancePackage.CLAZZ__METHODS, SimpleClassInheritancePackage.METHOD__CLAZZ);
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
			fields = new EObjectContainmentWithInverseEList<Field>(Field.class, this,
					SimpleClassInheritancePackage.CLAZZ__FIELDS, SimpleClassInheritancePackage.FIELD__CLAZZ);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clazz getSuperClazz() {
		if (eContainerFeatureID() != SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ)
			return null;
		return (Clazz) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperClazz(Clazz newSuperClazz, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperClazz, SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperClazz(Clazz newSuperClazz) {
		if (newSuperClazz != eInternalContainer()
				|| (eContainerFeatureID() != SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ
						&& newSuperClazz != null)) {
			if (EcoreUtil.isAncestor(this, newSuperClazz))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperClazz != null)
				msgs = ((InternalEObject) newSuperClazz).eInverseAdd(this,
						SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES, Clazz.class, msgs);
			msgs = basicSetSuperClazz(newSuperClazz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ,
					newSuperClazz, newSuperClazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Clazz> getSubClazzes() {
		if (subClazzes == null) {
			subClazzes = new EObjectContainmentWithInverseEList<Clazz>(Clazz.class, this,
					SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES, SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ);
		}
		return subClazzes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClazzContainer getContainer() {
		if (eContainerFeatureID() != SimpleClassInheritancePackage.CLAZZ__CONTAINER)
			return null;
		return (ClazzContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ClazzContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainer, SimpleClassInheritancePackage.CLAZZ__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(ClazzContainer newContainer) {
		if (newContainer != eInternalContainer()
				|| (eContainerFeatureID() != SimpleClassInheritancePackage.CLAZZ__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
						SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES, ClazzContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleClassInheritancePackage.CLAZZ__CONTAINER,
					newContainer, newContainer));
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
		case SimpleClassInheritancePackage.CLAZZ__METHODS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethods()).basicAdd(otherEnd, msgs);
		case SimpleClassInheritancePackage.CLAZZ__FIELDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFields()).basicAdd(otherEnd, msgs);
		case SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSuperClazz((Clazz) otherEnd, msgs);
		case SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubClazzes()).basicAdd(otherEnd, msgs);
		case SimpleClassInheritancePackage.CLAZZ__CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainer((ClazzContainer) otherEnd, msgs);
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
		case SimpleClassInheritancePackage.CLAZZ__METHODS:
			return ((InternalEList<?>) getMethods()).basicRemove(otherEnd, msgs);
		case SimpleClassInheritancePackage.CLAZZ__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ:
			return basicSetSuperClazz(null, msgs);
		case SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES:
			return ((InternalEList<?>) getSubClazzes()).basicRemove(otherEnd, msgs);
		case SimpleClassInheritancePackage.CLAZZ__CONTAINER:
			return basicSetContainer(null, msgs);
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
		case SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ:
			return eInternalContainer().eInverseRemove(this, SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES,
					Clazz.class, msgs);
		case SimpleClassInheritancePackage.CLAZZ__CONTAINER:
			return eInternalContainer().eInverseRemove(this, SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES,
					ClazzContainer.class, msgs);
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
		case SimpleClassInheritancePackage.CLAZZ__METHODS:
			return getMethods();
		case SimpleClassInheritancePackage.CLAZZ__FIELDS:
			return getFields();
		case SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ:
			return getSuperClazz();
		case SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES:
			return getSubClazzes();
		case SimpleClassInheritancePackage.CLAZZ__CONTAINER:
			return getContainer();
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
		case SimpleClassInheritancePackage.CLAZZ__METHODS:
			getMethods().clear();
			getMethods().addAll((Collection<? extends Method>) newValue);
			return;
		case SimpleClassInheritancePackage.CLAZZ__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends Field>) newValue);
			return;
		case SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ:
			setSuperClazz((Clazz) newValue);
			return;
		case SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES:
			getSubClazzes().clear();
			getSubClazzes().addAll((Collection<? extends Clazz>) newValue);
			return;
		case SimpleClassInheritancePackage.CLAZZ__CONTAINER:
			setContainer((ClazzContainer) newValue);
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
		case SimpleClassInheritancePackage.CLAZZ__METHODS:
			getMethods().clear();
			return;
		case SimpleClassInheritancePackage.CLAZZ__FIELDS:
			getFields().clear();
			return;
		case SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ:
			setSuperClazz((Clazz) null);
			return;
		case SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES:
			getSubClazzes().clear();
			return;
		case SimpleClassInheritancePackage.CLAZZ__CONTAINER:
			setContainer((ClazzContainer) null);
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
		case SimpleClassInheritancePackage.CLAZZ__METHODS:
			return methods != null && !methods.isEmpty();
		case SimpleClassInheritancePackage.CLAZZ__FIELDS:
			return fields != null && !fields.isEmpty();
		case SimpleClassInheritancePackage.CLAZZ__SUPER_CLAZZ:
			return getSuperClazz() != null;
		case SimpleClassInheritancePackage.CLAZZ__SUB_CLAZZES:
			return subClazzes != null && !subClazzes.isEmpty();
		case SimpleClassInheritancePackage.CLAZZ__CONTAINER:
			return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //ClazzImpl
