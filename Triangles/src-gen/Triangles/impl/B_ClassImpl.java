/**
 */
package Triangles.impl;

import Triangles.A_Class;
import Triangles.B_Class;
import Triangles.C_Class;
import Triangles.TrianglesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Triangles.impl.B_ClassImpl#getA <em>A</em>}</li>
 *   <li>{@link Triangles.impl.B_ClassImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class B_ClassImpl extends AbstractClassImpl implements B_Class {
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected EList<A_Class> a;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected EList<C_Class> c;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B_ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrianglesPackage.Literals.BCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<A_Class> getA() {
		if (a == null) {
			a = new EObjectWithInverseResolvingEList.ManyInverse<A_Class>(A_Class.class, this,
					TrianglesPackage.BCLASS__A, TrianglesPackage.ACLASS__B);
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<C_Class> getC() {
		if (c == null) {
			c = new EObjectWithInverseResolvingEList.ManyInverse<C_Class>(C_Class.class, this,
					TrianglesPackage.BCLASS__C, TrianglesPackage.CCLASS__B);
		}
		return c;
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
		case TrianglesPackage.BCLASS__A:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getA()).basicAdd(otherEnd, msgs);
		case TrianglesPackage.BCLASS__C:
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
		case TrianglesPackage.BCLASS__A:
			return ((InternalEList<?>) getA()).basicRemove(otherEnd, msgs);
		case TrianglesPackage.BCLASS__C:
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
		case TrianglesPackage.BCLASS__A:
			return getA();
		case TrianglesPackage.BCLASS__C:
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
		case TrianglesPackage.BCLASS__A:
			getA().clear();
			getA().addAll((Collection<? extends A_Class>) newValue);
			return;
		case TrianglesPackage.BCLASS__C:
			getC().clear();
			getC().addAll((Collection<? extends C_Class>) newValue);
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
		case TrianglesPackage.BCLASS__A:
			getA().clear();
			return;
		case TrianglesPackage.BCLASS__C:
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
		case TrianglesPackage.BCLASS__A:
			return a != null && !a.isEmpty();
		case TrianglesPackage.BCLASS__C:
			return c != null && !c.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //B_ClassImpl
