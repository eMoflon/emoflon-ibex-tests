/**
 */
package FeatureModelConcise.impl;

import FeatureModelConcise.Feature;
import FeatureModelConcise.FeatureModelConcisePackage;
import FeatureModelConcise.Group;

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
 *   <li>{@link FeatureModelConcise.impl.FeatureImpl#getSubfeatures <em>Subfeatures</em>}</li>
 *   <li>{@link FeatureModelConcise.impl.FeatureImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends NamedElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getSubfeatures() <em>Subfeatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> subfeatures;

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
		return FeatureModelConcisePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSubfeatures() {
		if (subfeatures == null) {
			subfeatures = new EObjectContainmentEList<Feature>(Feature.class, this,
					FeatureModelConcisePackage.FEATURE__SUBFEATURES);
		}
		return subfeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, FeatureModelConcisePackage.FEATURE__GROUPS);
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
		case FeatureModelConcisePackage.FEATURE__SUBFEATURES:
			return ((InternalEList<?>) getSubfeatures()).basicRemove(otherEnd, msgs);
		case FeatureModelConcisePackage.FEATURE__GROUPS:
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
		case FeatureModelConcisePackage.FEATURE__SUBFEATURES:
			return getSubfeatures();
		case FeatureModelConcisePackage.FEATURE__GROUPS:
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
		case FeatureModelConcisePackage.FEATURE__SUBFEATURES:
			getSubfeatures().clear();
			getSubfeatures().addAll((Collection<? extends Feature>) newValue);
			return;
		case FeatureModelConcisePackage.FEATURE__GROUPS:
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
		case FeatureModelConcisePackage.FEATURE__SUBFEATURES:
			getSubfeatures().clear();
			return;
		case FeatureModelConcisePackage.FEATURE__GROUPS:
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
		case FeatureModelConcisePackage.FEATURE__SUBFEATURES:
			return subfeatures != null && !subfeatures.isEmpty();
		case FeatureModelConcisePackage.FEATURE__GROUPS:
			return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FeatureImpl
