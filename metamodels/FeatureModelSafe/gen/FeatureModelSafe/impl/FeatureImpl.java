/**
 */
package FeatureModelSafe.impl;

import FeatureModelSafe.Feature;
import FeatureModelSafe.FeatureModelSafePackage;
import FeatureModelSafe.Group;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FeatureModelSafe.impl.FeatureImpl#getSolitarySubFeatures <em>Solitary Sub Features</em>}</li>
 *   <li>{@link FeatureModelSafe.impl.FeatureImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends NamedElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getSolitarySubFeatures() <em>Solitary Sub Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolitarySubFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> solitarySubFeatures;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelSafePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSolitarySubFeatures() {
		if (solitarySubFeatures == null) {
			solitarySubFeatures = new EObjectContainmentEList<Feature>(Feature.class, this,
					FeatureModelSafePackage.FEATURE__SOLITARY_SUB_FEATURES);
		}
		return solitarySubFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, FeatureModelSafePackage.FEATURE__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FeatureModelSafePackage.FEATURE__SOLITARY_SUB_FEATURES:
			return ((InternalEList<?>) getSolitarySubFeatures()).basicRemove(otherEnd, msgs);
		case FeatureModelSafePackage.FEATURE__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
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
		case FeatureModelSafePackage.FEATURE__SOLITARY_SUB_FEATURES:
			return getSolitarySubFeatures();
		case FeatureModelSafePackage.FEATURE__GROUPS:
			return getGroups();
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
		case FeatureModelSafePackage.FEATURE__SOLITARY_SUB_FEATURES:
			getSolitarySubFeatures().clear();
			getSolitarySubFeatures().addAll((Collection<? extends Feature>) newValue);
			return;
		case FeatureModelSafePackage.FEATURE__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
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
		case FeatureModelSafePackage.FEATURE__SOLITARY_SUB_FEATURES:
			getSolitarySubFeatures().clear();
			return;
		case FeatureModelSafePackage.FEATURE__GROUPS:
			getGroups().clear();
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
		case FeatureModelSafePackage.FEATURE__SOLITARY_SUB_FEATURES:
			return solitarySubFeatures != null && !solitarySubFeatures.isEmpty();
		case FeatureModelSafePackage.FEATURE__GROUPS:
			return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FeatureImpl
