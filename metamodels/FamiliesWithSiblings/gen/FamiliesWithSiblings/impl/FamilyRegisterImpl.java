/**
 */
package FamiliesWithSiblings.impl;

import FamiliesWithSiblings.FamiliesWithSiblingsPackage;
import FamiliesWithSiblings.Family;
import FamiliesWithSiblings.FamilyRegister;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyRegisterImpl#getFamilies <em>Families</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyRegisterImpl extends MinimalEObjectImpl.Container implements FamilyRegister {
	/**
	 * The cached value of the '{@link #getFamilies() <em>Families</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilies()
	 * @generated
	 * @ordered
	 */
	protected EList<Family> families;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamiliesWithSiblingsPackage.Literals.FAMILY_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Family> getFamilies() {
		if (families == null) {
			families = new EObjectContainmentWithInverseEList<Family>(Family.class, this,
					FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES,
					FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE);
		}
		return families;
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
		case FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFamilies()).basicAdd(otherEnd, msgs);
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
		case FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES:
			return ((InternalEList<?>) getFamilies()).basicRemove(otherEnd, msgs);
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
		case FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES:
			return getFamilies();
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
		case FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES:
			getFamilies().clear();
			getFamilies().addAll((Collection<? extends Family>) newValue);
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
		case FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES:
			getFamilies().clear();
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
		case FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES:
			return families != null && !families.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyRegisterImpl
