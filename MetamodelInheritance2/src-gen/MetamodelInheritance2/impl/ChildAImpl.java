/**
 */
package MetamodelInheritance2.impl;

import MetamodelInheritance.BaseContaineeC;

import MetamodelInheritance.impl.BaseContaineeAImpl;

import MetamodelInheritance2.ChildA;
import MetamodelInheritance2.ChildB;
import MetamodelInheritance2.ChildContaineeD;
import MetamodelInheritance2.MetamodelInheritance2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance2.impl.ChildAImpl#getB <em>B</em>}</li>
 *   <li>{@link MetamodelInheritance2.impl.ChildAImpl#getChildD <em>Child D</em>}</li>
 *   <li>{@link MetamodelInheritance2.impl.ChildAImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildAImpl extends BaseContaineeAImpl implements ChildA {
	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildB> b;

	/**
	 * The cached value of the '{@link #getChildD() <em>Child D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildD()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildContaineeD> childD;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseContaineeC> c;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelInheritance2Package.Literals.CHILD_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildB> getB() {
		if (b == null) {
			b = new EObjectResolvingEList<ChildB>(ChildB.class, this, MetamodelInheritance2Package.CHILD_A__B);
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildContaineeD> getChildD() {
		if (childD == null) {
			childD = new EObjectContainmentEList<ChildContaineeD>(ChildContaineeD.class, this,
					MetamodelInheritance2Package.CHILD_A__CHILD_D);
		}
		return childD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseContaineeC> getC() {
		if (c == null) {
			c = new EObjectResolvingEList<BaseContaineeC>(BaseContaineeC.class, this,
					MetamodelInheritance2Package.CHILD_A__C);
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelInheritance2Package.CHILD_A__CHILD_D:
			return ((InternalEList<?>) getChildD()).basicRemove(otherEnd, msgs);
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
		case MetamodelInheritance2Package.CHILD_A__B:
			return getB();
		case MetamodelInheritance2Package.CHILD_A__CHILD_D:
			return getChildD();
		case MetamodelInheritance2Package.CHILD_A__C:
			return getC();
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
		case MetamodelInheritance2Package.CHILD_A__B:
			getB().clear();
			getB().addAll((Collection<? extends ChildB>) newValue);
			return;
		case MetamodelInheritance2Package.CHILD_A__CHILD_D:
			getChildD().clear();
			getChildD().addAll((Collection<? extends ChildContaineeD>) newValue);
			return;
		case MetamodelInheritance2Package.CHILD_A__C:
			getC().clear();
			getC().addAll((Collection<? extends BaseContaineeC>) newValue);
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
		case MetamodelInheritance2Package.CHILD_A__B:
			getB().clear();
			return;
		case MetamodelInheritance2Package.CHILD_A__CHILD_D:
			getChildD().clear();
			return;
		case MetamodelInheritance2Package.CHILD_A__C:
			getC().clear();
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
		case MetamodelInheritance2Package.CHILD_A__B:
			return b != null && !b.isEmpty();
		case MetamodelInheritance2Package.CHILD_A__CHILD_D:
			return childD != null && !childD.isEmpty();
		case MetamodelInheritance2Package.CHILD_A__C:
			return c != null && !c.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChildAImpl
