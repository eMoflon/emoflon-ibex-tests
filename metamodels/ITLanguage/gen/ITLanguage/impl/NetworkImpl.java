/**
 */
package ITLanguage.impl;

import ITLanguage.ITLanguagePackage;
import ITLanguage.Laptop;
import ITLanguage.Network;
import ITLanguage.PC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ITLanguage.impl.NetworkImpl#getPc <em>Pc</em>}</li>
 *   <li>{@link ITLanguage.impl.NetworkImpl#getLaptop <em>Laptop</em>}</li>
 *   <li>{@link ITLanguage.impl.NetworkImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends EObjectImpl implements Network {
	/**
	 * The cached value of the '{@link #getPc() <em>Pc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPc()
	 * @generated
	 * @ordered
	 */
	protected EList<PC> pc;

	/**
	 * The cached value of the '{@link #getLaptop() <em>Laptop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaptop()
	 * @generated
	 * @ordered
	 */
	protected EList<Laptop> laptop;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ITLanguagePackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PC> getPc() {
		if (pc == null) {
			pc = new EObjectContainmentEList<PC>(PC.class, this, ITLanguagePackage.NETWORK__PC);
		}
		return pc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Laptop> getLaptop() {
		if (laptop == null) {
			laptop = new EObjectContainmentEList<Laptop>(Laptop.class, this, ITLanguagePackage.NETWORK__LAPTOP);
		}
		return laptop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ITLanguagePackage.NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ITLanguagePackage.NETWORK__PC:
			return ((InternalEList<?>) getPc()).basicRemove(otherEnd, msgs);
		case ITLanguagePackage.NETWORK__LAPTOP:
			return ((InternalEList<?>) getLaptop()).basicRemove(otherEnd, msgs);
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
		case ITLanguagePackage.NETWORK__PC:
			return getPc();
		case ITLanguagePackage.NETWORK__LAPTOP:
			return getLaptop();
		case ITLanguagePackage.NETWORK__NAME:
			return getName();
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
		case ITLanguagePackage.NETWORK__PC:
			getPc().clear();
			getPc().addAll((Collection<? extends PC>) newValue);
			return;
		case ITLanguagePackage.NETWORK__LAPTOP:
			getLaptop().clear();
			getLaptop().addAll((Collection<? extends Laptop>) newValue);
			return;
		case ITLanguagePackage.NETWORK__NAME:
			setName((String) newValue);
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
		case ITLanguagePackage.NETWORK__PC:
			getPc().clear();
			return;
		case ITLanguagePackage.NETWORK__LAPTOP:
			getLaptop().clear();
			return;
		case ITLanguagePackage.NETWORK__NAME:
			setName(NAME_EDEFAULT);
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
		case ITLanguagePackage.NETWORK__PC:
			return pc != null && !pc.isEmpty();
		case ITLanguagePackage.NETWORK__LAPTOP:
			return laptop != null && !laptop.isEmpty();
		case ITLanguagePackage.NETWORK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NetworkImpl
