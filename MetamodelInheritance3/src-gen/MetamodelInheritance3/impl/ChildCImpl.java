/**
 */
package MetamodelInheritance3.impl;

import MetamodelInheritance.impl.BaseContaineeCImpl;

import MetamodelInheritance3.ChildC;
import MetamodelInheritance3.ChildD;
import MetamodelInheritance3.MetamodelInheritance3Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance3.impl.ChildCImpl#getD <em>D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildCImpl extends BaseContaineeCImpl implements ChildC {
	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildD> d;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelInheritance3Package.Literals.CHILD_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildD> getD() {
		if (d == null) {
			d = new EObjectWithInverseResolvingEList.ManyInverse<ChildD>(ChildD.class, this,
					MetamodelInheritance3Package.CHILD_C__D, MetamodelInheritance3Package.CHILD_D__C);
		}
		return d;
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
		case MetamodelInheritance3Package.CHILD_C__D:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getD()).basicAdd(otherEnd, msgs);
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
		case MetamodelInheritance3Package.CHILD_C__D:
			return ((InternalEList<?>) getD()).basicRemove(otherEnd, msgs);
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
		case MetamodelInheritance3Package.CHILD_C__D:
			return getD();
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
		case MetamodelInheritance3Package.CHILD_C__D:
			getD().clear();
			getD().addAll((Collection<? extends ChildD>) newValue);
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
		case MetamodelInheritance3Package.CHILD_C__D:
			getD().clear();
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
		case MetamodelInheritance3Package.CHILD_C__D:
			return d != null && !d.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChildCImpl
