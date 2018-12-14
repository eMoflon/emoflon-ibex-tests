/**
 */
package simpleJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleJava.SimpleJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleJava.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link simpleJava.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link simpleJava.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleJava.impl.PackageImpl#getFullQualifier <em>Full Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements simpleJava.Package {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<simpleJava.Class> classes;

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<simpleJava.Package> subPackages;

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
	 * The default value of the '{@link #getFullQualifier() <em>Full Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullQualifier() <em>Full Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullQualifier()
	 * @generated
	 * @ordered
	 */
	protected String fullQualifier = FULL_QUALIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleJavaPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<simpleJava.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<simpleJava.Class>(simpleJava.Class.class, this, SimpleJavaPackage.PACKAGE__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<simpleJava.Package> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentEList<simpleJava.Package>(simpleJava.Package.class, this, SimpleJavaPackage.PACKAGE__SUB_PACKAGES);
		}
		return subPackages;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullQualifier() {
		return fullQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullQualifier(String newFullQualifier) {
		String oldFullQualifier = fullQualifier;
		fullQualifier = newFullQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleJavaPackage.PACKAGE__FULL_QUALIFIER, oldFullQualifier, fullQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleJavaPackage.PACKAGE__CLASSES:
			return ((InternalEList<?>) getClasses()).basicRemove(otherEnd, msgs);
		case SimpleJavaPackage.PACKAGE__SUB_PACKAGES:
			return ((InternalEList<?>) getSubPackages()).basicRemove(otherEnd, msgs);
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
		case SimpleJavaPackage.PACKAGE__CLASSES:
			return getClasses();
		case SimpleJavaPackage.PACKAGE__SUB_PACKAGES:
			return getSubPackages();
		case SimpleJavaPackage.PACKAGE__NAME:
			return getName();
		case SimpleJavaPackage.PACKAGE__FULL_QUALIFIER:
			return getFullQualifier();
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
		case SimpleJavaPackage.PACKAGE__CLASSES:
			getClasses().clear();
			getClasses().addAll((Collection<? extends simpleJava.Class>) newValue);
			return;
		case SimpleJavaPackage.PACKAGE__SUB_PACKAGES:
			getSubPackages().clear();
			getSubPackages().addAll((Collection<? extends simpleJava.Package>) newValue);
			return;
		case SimpleJavaPackage.PACKAGE__NAME:
			setName((String) newValue);
			return;
		case SimpleJavaPackage.PACKAGE__FULL_QUALIFIER:
			setFullQualifier((String) newValue);
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
		case SimpleJavaPackage.PACKAGE__CLASSES:
			getClasses().clear();
			return;
		case SimpleJavaPackage.PACKAGE__SUB_PACKAGES:
			getSubPackages().clear();
			return;
		case SimpleJavaPackage.PACKAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimpleJavaPackage.PACKAGE__FULL_QUALIFIER:
			setFullQualifier(FULL_QUALIFIER_EDEFAULT);
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
		case SimpleJavaPackage.PACKAGE__CLASSES:
			return classes != null && !classes.isEmpty();
		case SimpleJavaPackage.PACKAGE__SUB_PACKAGES:
			return subPackages != null && !subPackages.isEmpty();
		case SimpleJavaPackage.PACKAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimpleJavaPackage.PACKAGE__FULL_QUALIFIER:
			return FULL_QUALIFIER_EDEFAULT == null ? fullQualifier != null : !FULL_QUALIFIER_EDEFAULT.equals(fullQualifier);
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
		result.append(", fullQualifier: ");
		result.append(fullQualifier);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
