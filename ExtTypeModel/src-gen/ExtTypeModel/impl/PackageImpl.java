/**
 */
package ExtTypeModel.impl;

import ExtTypeModel.ExtTypeModelPackage;
import ExtTypeModel.Project;
import ExtTypeModel.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExtTypeModel.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link ExtTypeModel.impl.PackageImpl#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link ExtTypeModel.impl.PackageImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link ExtTypeModel.impl.PackageImpl#getFQname <em>FQname</em>}</li>
 *   <li>{@link ExtTypeModel.impl.PackageImpl#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements ExtTypeModel.Package {
	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtTypeModel.Package> subPackages;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The default value of the '{@link #getFQname() <em>FQname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQname()
	 * @generated
	 * @ordered
	 */
	protected static final String FQNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFQname() <em>FQname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQname()
	 * @generated
	 * @ordered
	 */
	protected String fQname = FQNAME_EDEFAULT;

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
		return ExtTypeModelPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtTypeModel.Package> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentWithInverseEList<ExtTypeModel.Package>(ExtTypeModel.Package.class, this,
					ExtTypeModelPackage.PACKAGE__SUB_PACKAGES, ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtTypeModel.Package getSuperPackage() {
		if (eContainerFeatureID() != ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE)
			return null;
		return (ExtTypeModel.Package) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperPackage(ExtTypeModel.Package newSuperPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSuperPackage, ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperPackage(ExtTypeModel.Package newSuperPackage) {
		if (newSuperPackage != eInternalContainer() || (eContainerFeatureID() != ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE && newSuperPackage != null)) {
			if (EcoreUtil.isAncestor(this, newSuperPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperPackage != null)
				msgs = ((InternalEObject) newSuperPackage).eInverseAdd(this, ExtTypeModelPackage.PACKAGE__SUB_PACKAGES, ExtTypeModel.Package.class, msgs);
			msgs = basicSetSuperPackage(newSuperPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE, newSuperPackage, newSuperPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<Type>(Type.class, this, ExtTypeModelPackage.PACKAGE__TYPES, ExtTypeModelPackage.TYPE__PACKAGE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFQname() {
		return fQname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFQname(String newFQname) {
		String oldFQname = fQname;
		fQname = newFQname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.PACKAGE__FQNAME, oldFQname, fQname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getProject() {
		if (eContainerFeatureID() != ExtTypeModelPackage.PACKAGE__PROJECT)
			return null;
		return (Project) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProject, ExtTypeModelPackage.PACKAGE__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != ExtTypeModelPackage.PACKAGE__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject) newProject).eInverseAdd(this, ExtTypeModelPackage.PROJECT__ROOT_PACKAGES, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtTypeModelPackage.PACKAGE__PROJECT, newProject, newProject));
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
		case ExtTypeModelPackage.PACKAGE__SUB_PACKAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubPackages()).basicAdd(otherEnd, msgs);
		case ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSuperPackage((ExtTypeModel.Package) otherEnd, msgs);
		case ExtTypeModelPackage.PACKAGE__TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTypes()).basicAdd(otherEnd, msgs);
		case ExtTypeModelPackage.PACKAGE__PROJECT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProject((Project) otherEnd, msgs);
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
		case ExtTypeModelPackage.PACKAGE__SUB_PACKAGES:
			return ((InternalEList<?>) getSubPackages()).basicRemove(otherEnd, msgs);
		case ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE:
			return basicSetSuperPackage(null, msgs);
		case ExtTypeModelPackage.PACKAGE__TYPES:
			return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
		case ExtTypeModelPackage.PACKAGE__PROJECT:
			return basicSetProject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE:
			return eInternalContainer().eInverseRemove(this, ExtTypeModelPackage.PACKAGE__SUB_PACKAGES, ExtTypeModel.Package.class, msgs);
		case ExtTypeModelPackage.PACKAGE__PROJECT:
			return eInternalContainer().eInverseRemove(this, ExtTypeModelPackage.PROJECT__ROOT_PACKAGES, Project.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtTypeModelPackage.PACKAGE__SUB_PACKAGES:
			return getSubPackages();
		case ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE:
			return getSuperPackage();
		case ExtTypeModelPackage.PACKAGE__TYPES:
			return getTypes();
		case ExtTypeModelPackage.PACKAGE__FQNAME:
			return getFQname();
		case ExtTypeModelPackage.PACKAGE__PROJECT:
			return getProject();
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
		case ExtTypeModelPackage.PACKAGE__SUB_PACKAGES:
			getSubPackages().clear();
			getSubPackages().addAll((Collection<? extends ExtTypeModel.Package>) newValue);
			return;
		case ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE:
			setSuperPackage((ExtTypeModel.Package) newValue);
			return;
		case ExtTypeModelPackage.PACKAGE__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends Type>) newValue);
			return;
		case ExtTypeModelPackage.PACKAGE__FQNAME:
			setFQname((String) newValue);
			return;
		case ExtTypeModelPackage.PACKAGE__PROJECT:
			setProject((Project) newValue);
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
		case ExtTypeModelPackage.PACKAGE__SUB_PACKAGES:
			getSubPackages().clear();
			return;
		case ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE:
			setSuperPackage((ExtTypeModel.Package) null);
			return;
		case ExtTypeModelPackage.PACKAGE__TYPES:
			getTypes().clear();
			return;
		case ExtTypeModelPackage.PACKAGE__FQNAME:
			setFQname(FQNAME_EDEFAULT);
			return;
		case ExtTypeModelPackage.PACKAGE__PROJECT:
			setProject((Project) null);
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
		case ExtTypeModelPackage.PACKAGE__SUB_PACKAGES:
			return subPackages != null && !subPackages.isEmpty();
		case ExtTypeModelPackage.PACKAGE__SUPER_PACKAGE:
			return getSuperPackage() != null;
		case ExtTypeModelPackage.PACKAGE__TYPES:
			return types != null && !types.isEmpty();
		case ExtTypeModelPackage.PACKAGE__FQNAME:
			return FQNAME_EDEFAULT == null ? fQname != null : !FQNAME_EDEFAULT.equals(fQname);
		case ExtTypeModelPackage.PACKAGE__PROJECT:
			return getProject() != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fQname: ");
		result.append(fQname);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
