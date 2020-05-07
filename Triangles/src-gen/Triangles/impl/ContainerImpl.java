/**
 */
package Triangles.impl;

import Triangles.A_Class;
import Triangles.B_Class;
import Triangles.C_Class;
import Triangles.D_Class;
import Triangles.E_Class;
import Triangles.TrianglesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Triangles.impl.ContainerImpl#getA <em>A</em>}</li>
 *   <li>{@link Triangles.impl.ContainerImpl#getB <em>B</em>}</li>
 *   <li>{@link Triangles.impl.ContainerImpl#getC <em>C</em>}</li>
 *   <li>{@link Triangles.impl.ContainerImpl#getD <em>D</em>}</li>
 *   <li>{@link Triangles.impl.ContainerImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements Triangles.Container {
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected EList<A_Class> a;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected EList<B_Class> b;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected EList<C_Class> c;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected EList<D_Class> d;

	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected EList<E_Class> e;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrianglesPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<A_Class> getA() {
		if (a == null) {
			a = new EObjectContainmentEList<A_Class>(A_Class.class, this, TrianglesPackage.CONTAINER__A);
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
			b = new EObjectContainmentEList<B_Class>(B_Class.class, this, TrianglesPackage.CONTAINER__B);
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
			c = new EObjectContainmentEList<C_Class>(C_Class.class, this, TrianglesPackage.CONTAINER__C);
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<D_Class> getD() {
		if (d == null) {
			d = new EObjectContainmentEList<D_Class>(D_Class.class, this, TrianglesPackage.CONTAINER__D);
		}
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<E_Class> getE() {
		if (e == null) {
			e = new EObjectContainmentEList<E_Class>(E_Class.class, this, TrianglesPackage.CONTAINER__E);
		}
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrianglesPackage.CONTAINER__A:
			return ((InternalEList<?>) getA()).basicRemove(otherEnd, msgs);
		case TrianglesPackage.CONTAINER__B:
			return ((InternalEList<?>) getB()).basicRemove(otherEnd, msgs);
		case TrianglesPackage.CONTAINER__C:
			return ((InternalEList<?>) getC()).basicRemove(otherEnd, msgs);
		case TrianglesPackage.CONTAINER__D:
			return ((InternalEList<?>) getD()).basicRemove(otherEnd, msgs);
		case TrianglesPackage.CONTAINER__E:
			return ((InternalEList<?>) getE()).basicRemove(otherEnd, msgs);
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
		case TrianglesPackage.CONTAINER__A:
			return getA();
		case TrianglesPackage.CONTAINER__B:
			return getB();
		case TrianglesPackage.CONTAINER__C:
			return getC();
		case TrianglesPackage.CONTAINER__D:
			return getD();
		case TrianglesPackage.CONTAINER__E:
			return getE();
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
		case TrianglesPackage.CONTAINER__A:
			getA().clear();
			getA().addAll((Collection<? extends A_Class>) newValue);
			return;
		case TrianglesPackage.CONTAINER__B:
			getB().clear();
			getB().addAll((Collection<? extends B_Class>) newValue);
			return;
		case TrianglesPackage.CONTAINER__C:
			getC().clear();
			getC().addAll((Collection<? extends C_Class>) newValue);
			return;
		case TrianglesPackage.CONTAINER__D:
			getD().clear();
			getD().addAll((Collection<? extends D_Class>) newValue);
			return;
		case TrianglesPackage.CONTAINER__E:
			getE().clear();
			getE().addAll((Collection<? extends E_Class>) newValue);
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
		case TrianglesPackage.CONTAINER__A:
			getA().clear();
			return;
		case TrianglesPackage.CONTAINER__B:
			getB().clear();
			return;
		case TrianglesPackage.CONTAINER__C:
			getC().clear();
			return;
		case TrianglesPackage.CONTAINER__D:
			getD().clear();
			return;
		case TrianglesPackage.CONTAINER__E:
			getE().clear();
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
		case TrianglesPackage.CONTAINER__A:
			return a != null && !a.isEmpty();
		case TrianglesPackage.CONTAINER__B:
			return b != null && !b.isEmpty();
		case TrianglesPackage.CONTAINER__C:
			return c != null && !c.isEmpty();
		case TrianglesPackage.CONTAINER__D:
			return d != null && !d.isEmpty();
		case TrianglesPackage.CONTAINER__E:
			return e != null && !e.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
