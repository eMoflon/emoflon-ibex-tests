/**
 */
package CompanyLanguage.impl;

import CompanyLanguage.Admin;
import CompanyLanguage.CEO;
import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguagePackage;
import CompanyLanguage.Employee;

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
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CompanyLanguage.impl.CompanyImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link CompanyLanguage.impl.CompanyImpl#getCeo <em>Ceo</em>}</li>
 *   <li>{@link CompanyLanguage.impl.CompanyImpl#getAdmin <em>Admin</em>}</li>
 *   <li>{@link CompanyLanguage.impl.CompanyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompanyImpl extends EObjectImpl implements Company {
	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employee;

	/**
	 * The cached value of the '{@link #getCeo() <em>Ceo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeo()
	 * @generated
	 * @ordered
	 */
	protected EList<CEO> ceo;

	/**
	 * The cached value of the '{@link #getAdmin() <em>Admin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmin()
	 * @generated
	 * @ordered
	 */
	protected EList<Admin> admin;

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
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompanyLanguagePackage.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployee() {
		if (employee == null) {
			employee = new EObjectContainmentEList<Employee>(Employee.class, this,
					CompanyLanguagePackage.COMPANY__EMPLOYEE);
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CEO> getCeo() {
		if (ceo == null) {
			ceo = new EObjectContainmentEList<CEO>(CEO.class, this, CompanyLanguagePackage.COMPANY__CEO);
		}
		return ceo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Admin> getAdmin() {
		if (admin == null) {
			admin = new EObjectContainmentEList<Admin>(Admin.class, this, CompanyLanguagePackage.COMPANY__ADMIN);
		}
		return admin;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompanyLanguagePackage.COMPANY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CompanyLanguagePackage.COMPANY__EMPLOYEE:
			return ((InternalEList<?>) getEmployee()).basicRemove(otherEnd, msgs);
		case CompanyLanguagePackage.COMPANY__CEO:
			return ((InternalEList<?>) getCeo()).basicRemove(otherEnd, msgs);
		case CompanyLanguagePackage.COMPANY__ADMIN:
			return ((InternalEList<?>) getAdmin()).basicRemove(otherEnd, msgs);
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
		case CompanyLanguagePackage.COMPANY__EMPLOYEE:
			return getEmployee();
		case CompanyLanguagePackage.COMPANY__CEO:
			return getCeo();
		case CompanyLanguagePackage.COMPANY__ADMIN:
			return getAdmin();
		case CompanyLanguagePackage.COMPANY__NAME:
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
		case CompanyLanguagePackage.COMPANY__EMPLOYEE:
			getEmployee().clear();
			getEmployee().addAll((Collection<? extends Employee>) newValue);
			return;
		case CompanyLanguagePackage.COMPANY__CEO:
			getCeo().clear();
			getCeo().addAll((Collection<? extends CEO>) newValue);
			return;
		case CompanyLanguagePackage.COMPANY__ADMIN:
			getAdmin().clear();
			getAdmin().addAll((Collection<? extends Admin>) newValue);
			return;
		case CompanyLanguagePackage.COMPANY__NAME:
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
		case CompanyLanguagePackage.COMPANY__EMPLOYEE:
			getEmployee().clear();
			return;
		case CompanyLanguagePackage.COMPANY__CEO:
			getCeo().clear();
			return;
		case CompanyLanguagePackage.COMPANY__ADMIN:
			getAdmin().clear();
			return;
		case CompanyLanguagePackage.COMPANY__NAME:
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
		case CompanyLanguagePackage.COMPANY__EMPLOYEE:
			return employee != null && !employee.isEmpty();
		case CompanyLanguagePackage.COMPANY__CEO:
			return ceo != null && !ceo.isEmpty();
		case CompanyLanguagePackage.COMPANY__ADMIN:
			return admin != null && !admin.isEmpty();
		case CompanyLanguagePackage.COMPANY__NAME:
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
} //CompanyImpl
