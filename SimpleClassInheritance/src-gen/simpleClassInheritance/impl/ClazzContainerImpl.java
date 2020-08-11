/**
 */
package simpleClassInheritance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleClassInheritance.Clazz;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.SimpleClassInheritancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clazz Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleClassInheritance.impl.ClazzContainerImpl#getClazzes <em>Clazzes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClazzContainerImpl extends MinimalEObjectImpl.Container implements ClazzContainer {
	/**
	 * The cached value of the '{@link #getClazzes() <em>Clazzes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazzes()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> clazzes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClazzContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleClassInheritancePackage.Literals.CLAZZ_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Clazz> getClazzes() {
		if (clazzes == null) {
			clazzes = new EObjectContainmentWithInverseEList<Clazz>(Clazz.class, this,
					SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES,
					SimpleClassInheritancePackage.CLAZZ__CONTAINER);
		}
		return clazzes;
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
		case SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getClazzes()).basicAdd(otherEnd, msgs);
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
		case SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES:
			return ((InternalEList<?>) getClazzes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES:
			return getClazzes();
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
		case SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES:
			getClazzes().clear();
			getClazzes().addAll((Collection<? extends Clazz>) newValue);
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
		case SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES:
			getClazzes().clear();
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
		case SimpleClassInheritancePackage.CLAZZ_CONTAINER__CLAZZES:
			return clazzes != null && !clazzes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClazzContainerImpl
