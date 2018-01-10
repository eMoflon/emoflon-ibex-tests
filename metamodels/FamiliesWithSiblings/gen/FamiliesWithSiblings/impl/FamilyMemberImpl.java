/**
 */
package FamiliesWithSiblings.impl;

import FamiliesWithSiblings.FamiliesWithSiblingsPackage;
import FamiliesWithSiblings.Family;
import FamiliesWithSiblings.FamilyMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyMemberImpl#getFatherInverse <em>Father Inverse</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyMemberImpl#getMotherInverse <em>Mother Inverse</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyMemberImpl#getSonsInverse <em>Sons Inverse</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyMemberImpl#getDaughtersInverse <em>Daughters Inverse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyMemberImpl extends MinimalEObjectImpl.Container implements FamilyMember {
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
	protected FamilyMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamiliesWithSiblingsPackage.Literals.FAMILY_MEMBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesWithSiblingsPackage.FAMILY_MEMBER__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getFatherInverse() {
		if (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE)
			return null;
		return (Family) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFatherInverse(Family newFatherInverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFatherInverse,
				FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFatherInverse(Family newFatherInverse) {
		if (newFatherInverse != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE
						&& newFatherInverse != null)) {
			if (EcoreUtil.isAncestor(this, newFatherInverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFatherInverse != null)
				msgs = ((InternalEObject) newFatherInverse).eInverseAdd(this,
						FamiliesWithSiblingsPackage.FAMILY__FATHER, Family.class, msgs);
			msgs = basicSetFatherInverse(newFatherInverse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE, newFatherInverse, newFatherInverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getMotherInverse() {
		if (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE)
			return null;
		return (Family) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMotherInverse(Family newMotherInverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMotherInverse,
				FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotherInverse(Family newMotherInverse) {
		if (newMotherInverse != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE
						&& newMotherInverse != null)) {
			if (EcoreUtil.isAncestor(this, newMotherInverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMotherInverse != null)
				msgs = ((InternalEObject) newMotherInverse).eInverseAdd(this,
						FamiliesWithSiblingsPackage.FAMILY__MOTHER, Family.class, msgs);
			msgs = basicSetMotherInverse(newMotherInverse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE, newMotherInverse, newMotherInverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getSonsInverse() {
		if (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE)
			return null;
		return (Family) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSonsInverse(Family newSonsInverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSonsInverse,
				FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSonsInverse(Family newSonsInverse) {
		if (newSonsInverse != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE
						&& newSonsInverse != null)) {
			if (EcoreUtil.isAncestor(this, newSonsInverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSonsInverse != null)
				msgs = ((InternalEObject) newSonsInverse).eInverseAdd(this, FamiliesWithSiblingsPackage.FAMILY__SONS,
						Family.class, msgs);
			msgs = basicSetSonsInverse(newSonsInverse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE, newSonsInverse, newSonsInverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getDaughtersInverse() {
		if (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE)
			return null;
		return (Family) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDaughtersInverse(Family newDaughtersInverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDaughtersInverse,
				FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaughtersInverse(Family newDaughtersInverse) {
		if (newDaughtersInverse != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE
						&& newDaughtersInverse != null)) {
			if (EcoreUtil.isAncestor(this, newDaughtersInverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDaughtersInverse != null)
				msgs = ((InternalEObject) newDaughtersInverse).eInverseAdd(this,
						FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS, Family.class, msgs);
			msgs = basicSetDaughtersInverse(newDaughtersInverse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE, newDaughtersInverse,
					newDaughtersInverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFatherInverse((Family) otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMotherInverse((Family) otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSonsInverse((Family) otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDaughtersInverse((Family) otherEnd, msgs);
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
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE:
			return basicSetFatherInverse(null, msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE:
			return basicSetMotherInverse(null, msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE:
			return basicSetSonsInverse(null, msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE:
			return basicSetDaughtersInverse(null, msgs);
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
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE:
			return eInternalContainer().eInverseRemove(this, FamiliesWithSiblingsPackage.FAMILY__FATHER, Family.class,
					msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE:
			return eInternalContainer().eInverseRemove(this, FamiliesWithSiblingsPackage.FAMILY__MOTHER, Family.class,
					msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE:
			return eInternalContainer().eInverseRemove(this, FamiliesWithSiblingsPackage.FAMILY__SONS, Family.class,
					msgs);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE:
			return eInternalContainer().eInverseRemove(this, FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS,
					Family.class, msgs);
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
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__NAME:
			return getName();
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE:
			return getFatherInverse();
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE:
			return getMotherInverse();
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE:
			return getSonsInverse();
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE:
			return getDaughtersInverse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__NAME:
			setName((String) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE:
			setFatherInverse((Family) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE:
			setMotherInverse((Family) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE:
			setSonsInverse((Family) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE:
			setDaughtersInverse((Family) newValue);
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
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE:
			setFatherInverse((Family) null);
			return;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE:
			setMotherInverse((Family) null);
			return;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE:
			setSonsInverse((Family) null);
			return;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE:
			setDaughtersInverse((Family) null);
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
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE:
			return getFatherInverse() != null;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE:
			return getMotherInverse() != null;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE:
			return getSonsInverse() != null;
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE:
			return getDaughtersInverse() != null;
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

} //FamilyMemberImpl
