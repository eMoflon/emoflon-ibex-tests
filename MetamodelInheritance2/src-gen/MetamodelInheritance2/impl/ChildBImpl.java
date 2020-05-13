/**
 */
package MetamodelInheritance2.impl;

import MetamodelInheritance.impl.BaseContaineeBImpl;

import MetamodelInheritance2.ChildA;
import MetamodelInheritance2.ChildB;
import MetamodelInheritance2.ChildContaineeD;
import MetamodelInheritance2.MetamodelInheritance2Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance2.impl.ChildBImpl#getA <em>A</em>}</li>
 *   <li>{@link MetamodelInheritance2.impl.ChildBImpl#getD <em>D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildBImpl extends BaseContaineeBImpl implements ChildB {
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildA> a;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildContaineeD> d;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelInheritance2Package.Literals.CHILD_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildA> getA() {
		if (a == null) {
			a = new EObjectResolvingEList<ChildA>(ChildA.class, this, MetamodelInheritance2Package.CHILD_B__A);
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildContaineeD> getD() {
		if (d == null) {
			d = new EObjectResolvingEList<ChildContaineeD>(ChildContaineeD.class, this,
					MetamodelInheritance2Package.CHILD_B__D);
		}
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelInheritance2Package.CHILD_B__A:
			return getA();
		case MetamodelInheritance2Package.CHILD_B__D:
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
		case MetamodelInheritance2Package.CHILD_B__A:
			getA().clear();
			getA().addAll((Collection<? extends ChildA>) newValue);
			return;
		case MetamodelInheritance2Package.CHILD_B__D:
			getD().clear();
			getD().addAll((Collection<? extends ChildContaineeD>) newValue);
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
		case MetamodelInheritance2Package.CHILD_B__A:
			getA().clear();
			return;
		case MetamodelInheritance2Package.CHILD_B__D:
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
		case MetamodelInheritance2Package.CHILD_B__A:
			return a != null && !a.isEmpty();
		case MetamodelInheritance2Package.CHILD_B__D:
			return d != null && !d.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChildBImpl
