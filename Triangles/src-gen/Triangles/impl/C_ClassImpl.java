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
 * An implementation of the model object '<em><b>CClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Triangles.impl.C_ClassImpl#getA <em>A</em>}</li>
 *   <li>{@link Triangles.impl.C_ClassImpl#getB <em>B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class C_ClassImpl extends AbstractClassImpl implements C_Class {
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
	 * The cached value of the '{@link #getB() <em>B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected EList<B_Class> b;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected C_ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrianglesPackage.Literals.CCLASS;
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
					TrianglesPackage.CCLASS__A, TrianglesPackage.ACLASS__C);
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<B_Class> getB() {
		if (b == null) {
			b = new EObjectWithInverseResolvingEList.ManyInverse<B_Class>(B_Class.class, this,
					TrianglesPackage.CCLASS__B, TrianglesPackage.BCLASS__C);
		}
		return b;
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
		case TrianglesPackage.CCLASS__A:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getA()).basicAdd(otherEnd, msgs);
		case TrianglesPackage.CCLASS__B:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getB()).basicAdd(otherEnd, msgs);
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
		case TrianglesPackage.CCLASS__A:
			return ((InternalEList<?>) getA()).basicRemove(otherEnd, msgs);
		case TrianglesPackage.CCLASS__B:
			return ((InternalEList<?>) getB()).basicRemove(otherEnd, msgs);
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
		case TrianglesPackage.CCLASS__A:
			return getA();
		case TrianglesPackage.CCLASS__B:
			return getB();
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
		case TrianglesPackage.CCLASS__A:
			getA().clear();
			getA().addAll((Collection<? extends A_Class>) newValue);
			return;
		case TrianglesPackage.CCLASS__B:
			getB().clear();
			getB().addAll((Collection<? extends B_Class>) newValue);
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
		case TrianglesPackage.CCLASS__A:
			getA().clear();
			return;
		case TrianglesPackage.CCLASS__B:
			getB().clear();
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
		case TrianglesPackage.CCLASS__A:
			return a != null && !a.isEmpty();
		case TrianglesPackage.CCLASS__B:
			return b != null && !b.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //C_ClassImpl
