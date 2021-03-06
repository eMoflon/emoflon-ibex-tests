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
 * An implementation of the model object '<em><b>AClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Triangles.impl.A_ClassImpl#getB <em>B</em>}</li>
 *   <li>{@link Triangles.impl.A_ClassImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A_ClassImpl extends AbstractClassImpl implements A_Class {
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
	protected A_ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrianglesPackage.Literals.ACLASS;
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
					TrianglesPackage.ACLASS__B, TrianglesPackage.BCLASS__A);
		}
		return b;
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
					TrianglesPackage.ACLASS__C, TrianglesPackage.CCLASS__A);
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
		case TrianglesPackage.ACLASS__B:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getB()).basicAdd(otherEnd, msgs);
		case TrianglesPackage.ACLASS__C:
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
		case TrianglesPackage.ACLASS__B:
			return ((InternalEList<?>) getB()).basicRemove(otherEnd, msgs);
		case TrianglesPackage.ACLASS__C:
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
		case TrianglesPackage.ACLASS__B:
			return getB();
		case TrianglesPackage.ACLASS__C:
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
		case TrianglesPackage.ACLASS__B:
			getB().clear();
			getB().addAll((Collection<? extends B_Class>) newValue);
			return;
		case TrianglesPackage.ACLASS__C:
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
		case TrianglesPackage.ACLASS__B:
			getB().clear();
			return;
		case TrianglesPackage.ACLASS__C:
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
		case TrianglesPackage.ACLASS__B:
			return b != null && !b.isEmpty();
		case TrianglesPackage.ACLASS__C:
			return c != null && !c.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //A_ClassImpl
