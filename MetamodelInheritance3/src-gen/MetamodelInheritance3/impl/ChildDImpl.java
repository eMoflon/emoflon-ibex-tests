/**
 */
package MetamodelInheritance3.impl;

import MetamodelInheritance.BaseContaineeA;

import MetamodelInheritance2.impl.ChildContaineeDImpl;

import MetamodelInheritance3.ChildC;
import MetamodelInheritance3.ChildD;
import MetamodelInheritance3.MetamodelInheritance3Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance3.impl.ChildDImpl#getC <em>C</em>}</li>
 *   <li>{@link MetamodelInheritance3.impl.ChildDImpl#getA <em>A</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildDImpl extends ChildContaineeDImpl implements ChildD {
	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildC> c;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseContaineeA> a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelInheritance3Package.Literals.CHILD_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildC> getC() {
		if (c == null) {
			c = new EObjectWithInverseResolvingEList.ManyInverse<ChildC>(ChildC.class, this,
					MetamodelInheritance3Package.CHILD_D__C, MetamodelInheritance3Package.CHILD_C__D);
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseContaineeA> getA() {
		if (a == null) {
			a = new EObjectResolvingEList<BaseContaineeA>(BaseContaineeA.class, this,
					MetamodelInheritance3Package.CHILD_D__A);
		}
		return a;
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
		case MetamodelInheritance3Package.CHILD_D__C:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getC()).basicAdd(otherEnd, msgs);
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
		case MetamodelInheritance3Package.CHILD_D__C:
			return ((InternalEList<?>) getC()).basicRemove(otherEnd, msgs);
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
		case MetamodelInheritance3Package.CHILD_D__C:
			return getC();
		case MetamodelInheritance3Package.CHILD_D__A:
			return getA();
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
		case MetamodelInheritance3Package.CHILD_D__C:
			getC().clear();
			getC().addAll((Collection<? extends ChildC>) newValue);
			return;
		case MetamodelInheritance3Package.CHILD_D__A:
			getA().clear();
			getA().addAll((Collection<? extends BaseContaineeA>) newValue);
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
		case MetamodelInheritance3Package.CHILD_D__C:
			getC().clear();
			return;
		case MetamodelInheritance3Package.CHILD_D__A:
			getA().clear();
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
		case MetamodelInheritance3Package.CHILD_D__C:
			return c != null && !c.isEmpty();
		case MetamodelInheritance3Package.CHILD_D__A:
			return a != null && !a.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChildDImpl
