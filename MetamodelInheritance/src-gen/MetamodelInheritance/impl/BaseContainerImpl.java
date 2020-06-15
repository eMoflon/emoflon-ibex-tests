/**
 */
package MetamodelInheritance.impl;

import MetamodelInheritance.BaseContaineeA;
import MetamodelInheritance.BaseContaineeB;
import MetamodelInheritance.BaseContaineeC;
import MetamodelInheritance.BaseContainer;
import MetamodelInheritance.MetamodelInheritancePackage;

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
 * An implementation of the model object '<em><b>Base Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance.impl.BaseContainerImpl#getBaseA <em>Base A</em>}</li>
 *   <li>{@link MetamodelInheritance.impl.BaseContainerImpl#getBaseB <em>Base B</em>}</li>
 *   <li>{@link MetamodelInheritance.impl.BaseContainerImpl#getBaseC <em>Base C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseContainerImpl extends MinimalEObjectImpl.Container implements BaseContainer {
	/**
	 * The cached value of the '{@link #getBaseA() <em>Base A</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseA()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseContaineeA> baseA;

	/**
	 * The cached value of the '{@link #getBaseB() <em>Base B</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseB()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseContaineeB> baseB;

	/**
	 * The cached value of the '{@link #getBaseC() <em>Base C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseC()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseContaineeC> baseC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelInheritancePackage.Literals.BASE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseContaineeA> getBaseA() {
		if (baseA == null) {
			baseA = new EObjectContainmentEList<BaseContaineeA>(BaseContaineeA.class, this,
					MetamodelInheritancePackage.BASE_CONTAINER__BASE_A);
		}
		return baseA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseContaineeB> getBaseB() {
		if (baseB == null) {
			baseB = new EObjectContainmentEList<BaseContaineeB>(BaseContaineeB.class, this,
					MetamodelInheritancePackage.BASE_CONTAINER__BASE_B);
		}
		return baseB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseContaineeC> getBaseC() {
		if (baseC == null) {
			baseC = new EObjectContainmentEList<BaseContaineeC>(BaseContaineeC.class, this,
					MetamodelInheritancePackage.BASE_CONTAINER__BASE_C);
		}
		return baseC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_A:
			return ((InternalEList<?>) getBaseA()).basicRemove(otherEnd, msgs);
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_B:
			return ((InternalEList<?>) getBaseB()).basicRemove(otherEnd, msgs);
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_C:
			return ((InternalEList<?>) getBaseC()).basicRemove(otherEnd, msgs);
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
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_A:
			return getBaseA();
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_B:
			return getBaseB();
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_C:
			return getBaseC();
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
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_A:
			getBaseA().clear();
			getBaseA().addAll((Collection<? extends BaseContaineeA>) newValue);
			return;
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_B:
			getBaseB().clear();
			getBaseB().addAll((Collection<? extends BaseContaineeB>) newValue);
			return;
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_C:
			getBaseC().clear();
			getBaseC().addAll((Collection<? extends BaseContaineeC>) newValue);
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
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_A:
			getBaseA().clear();
			return;
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_B:
			getBaseB().clear();
			return;
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_C:
			getBaseC().clear();
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
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_A:
			return baseA != null && !baseA.isEmpty();
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_B:
			return baseB != null && !baseB.isEmpty();
		case MetamodelInheritancePackage.BASE_CONTAINER__BASE_C:
			return baseC != null && !baseC.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaseContainerImpl
