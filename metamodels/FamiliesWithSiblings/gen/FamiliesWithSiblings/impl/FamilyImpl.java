/**
 */
package FamiliesWithSiblings.impl;

import FamiliesWithSiblings.FamiliesWithSiblingsPackage;
import FamiliesWithSiblings.Family;
import FamiliesWithSiblings.FamilyMember;
import FamiliesWithSiblings.FamilyRegister;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyImpl#getFather <em>Father</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyImpl#getSons <em>Sons</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyImpl#getDaughters <em>Daughters</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyImpl#getName <em>Name</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyImpl#getFamiliesInverse <em>Families Inverse</em>}</li>
 *   <li>{@link FamiliesWithSiblings.impl.FamilyImpl#getSiblings <em>Siblings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyImpl extends MinimalEObjectImpl.Container implements Family {
	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected FamilyMember father;

	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected FamilyMember mother;

	/**
	 * The cached value of the '{@link #getSons() <em>Sons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSons()
	 * @generated
	 * @ordered
	 */
	protected EList<FamilyMember> sons;

	/**
	 * The cached value of the '{@link #getDaughters() <em>Daughters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaughters()
	 * @generated
	 * @ordered
	 */
	protected EList<FamilyMember> daughters;

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
	 * The cached value of the '{@link #getSiblings() <em>Siblings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiblings()
	 * @generated
	 * @ordered
	 */
	protected EList<Family> siblings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamiliesWithSiblingsPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember getFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFather(FamilyMember newFather, NotificationChain msgs) {
		FamilyMember oldFather = father;
		father = newFather;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FamiliesWithSiblingsPackage.FAMILY__FATHER, oldFather, newFather);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(FamilyMember newFather) {
		if (newFather != father) {
			NotificationChain msgs = null;
			if (father != null)
				msgs = ((InternalEObject) father).eInverseRemove(this,
						FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE, FamilyMember.class, msgs);
			if (newFather != null)
				msgs = ((InternalEObject) newFather).eInverseAdd(this,
						FamiliesWithSiblingsPackage.FAMILY_MEMBER__FATHER_INVERSE, FamilyMember.class, msgs);
			msgs = basicSetFather(newFather, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesWithSiblingsPackage.FAMILY__FATHER, newFather,
					newFather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember getMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMother(FamilyMember newMother, NotificationChain msgs) {
		FamilyMember oldMother = mother;
		mother = newMother;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FamiliesWithSiblingsPackage.FAMILY__MOTHER, oldMother, newMother);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(FamilyMember newMother) {
		if (newMother != mother) {
			NotificationChain msgs = null;
			if (mother != null)
				msgs = ((InternalEObject) mother).eInverseRemove(this,
						FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE, FamilyMember.class, msgs);
			if (newMother != null)
				msgs = ((InternalEObject) newMother).eInverseAdd(this,
						FamiliesWithSiblingsPackage.FAMILY_MEMBER__MOTHER_INVERSE, FamilyMember.class, msgs);
			msgs = basicSetMother(newMother, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesWithSiblingsPackage.FAMILY__MOTHER, newMother,
					newMother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyMember> getSons() {
		if (sons == null) {
			sons = new EObjectContainmentWithInverseEList<FamilyMember>(FamilyMember.class, this,
					FamiliesWithSiblingsPackage.FAMILY__SONS, FamiliesWithSiblingsPackage.FAMILY_MEMBER__SONS_INVERSE);
		}
		return sons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyMember> getDaughters() {
		if (daughters == null) {
			daughters = new EObjectContainmentWithInverseEList<FamilyMember>(FamilyMember.class, this,
					FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS,
					FamiliesWithSiblingsPackage.FAMILY_MEMBER__DAUGHTERS_INVERSE);
		}
		return daughters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesWithSiblingsPackage.FAMILY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyRegister getFamiliesInverse() {
		if (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE)
			return null;
		return (FamilyRegister) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamiliesInverse(FamilyRegister newFamiliesInverse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFamiliesInverse,
				FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamiliesInverse(FamilyRegister newFamiliesInverse) {
		if (newFamiliesInverse != eInternalContainer()
				|| (eContainerFeatureID() != FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE
						&& newFamiliesInverse != null)) {
			if (EcoreUtil.isAncestor(this, newFamiliesInverse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFamiliesInverse != null)
				msgs = ((InternalEObject) newFamiliesInverse).eInverseAdd(this,
						FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES, FamilyRegister.class, msgs);
			msgs = basicSetFamiliesInverse(newFamiliesInverse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE,
					newFamiliesInverse, newFamiliesInverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Family> getSiblings() {
		if (siblings == null) {
			siblings = new EObjectResolvingEList<Family>(Family.class, this,
					FamiliesWithSiblingsPackage.FAMILY__SIBLINGS);
		}
		return siblings;
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
		case FamiliesWithSiblingsPackage.FAMILY__FATHER:
			if (father != null)
				msgs = ((InternalEObject) father).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FamiliesWithSiblingsPackage.FAMILY__FATHER, null, msgs);
			return basicSetFather((FamilyMember) otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY__MOTHER:
			if (mother != null)
				msgs = ((InternalEObject) mother).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FamiliesWithSiblingsPackage.FAMILY__MOTHER, null, msgs);
			return basicSetMother((FamilyMember) otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY__SONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSons()).basicAdd(otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDaughters()).basicAdd(otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFamiliesInverse((FamilyRegister) otherEnd, msgs);
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
		case FamiliesWithSiblingsPackage.FAMILY__FATHER:
			return basicSetFather(null, msgs);
		case FamiliesWithSiblingsPackage.FAMILY__MOTHER:
			return basicSetMother(null, msgs);
		case FamiliesWithSiblingsPackage.FAMILY__SONS:
			return ((InternalEList<?>) getSons()).basicRemove(otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS:
			return ((InternalEList<?>) getDaughters()).basicRemove(otherEnd, msgs);
		case FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE:
			return basicSetFamiliesInverse(null, msgs);
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
		case FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE:
			return eInternalContainer().eInverseRemove(this, FamiliesWithSiblingsPackage.FAMILY_REGISTER__FAMILIES,
					FamilyRegister.class, msgs);
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
		case FamiliesWithSiblingsPackage.FAMILY__FATHER:
			return getFather();
		case FamiliesWithSiblingsPackage.FAMILY__MOTHER:
			return getMother();
		case FamiliesWithSiblingsPackage.FAMILY__SONS:
			return getSons();
		case FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS:
			return getDaughters();
		case FamiliesWithSiblingsPackage.FAMILY__NAME:
			return getName();
		case FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE:
			return getFamiliesInverse();
		case FamiliesWithSiblingsPackage.FAMILY__SIBLINGS:
			return getSiblings();
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
		case FamiliesWithSiblingsPackage.FAMILY__FATHER:
			setFather((FamilyMember) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__MOTHER:
			setMother((FamilyMember) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__SONS:
			getSons().clear();
			getSons().addAll((Collection<? extends FamilyMember>) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS:
			getDaughters().clear();
			getDaughters().addAll((Collection<? extends FamilyMember>) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__NAME:
			setName((String) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE:
			setFamiliesInverse((FamilyRegister) newValue);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__SIBLINGS:
			getSiblings().clear();
			getSiblings().addAll((Collection<? extends Family>) newValue);
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
		case FamiliesWithSiblingsPackage.FAMILY__FATHER:
			setFather((FamilyMember) null);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__MOTHER:
			setMother((FamilyMember) null);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__SONS:
			getSons().clear();
			return;
		case FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS:
			getDaughters().clear();
			return;
		case FamiliesWithSiblingsPackage.FAMILY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE:
			setFamiliesInverse((FamilyRegister) null);
			return;
		case FamiliesWithSiblingsPackage.FAMILY__SIBLINGS:
			getSiblings().clear();
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
		case FamiliesWithSiblingsPackage.FAMILY__FATHER:
			return father != null;
		case FamiliesWithSiblingsPackage.FAMILY__MOTHER:
			return mother != null;
		case FamiliesWithSiblingsPackage.FAMILY__SONS:
			return sons != null && !sons.isEmpty();
		case FamiliesWithSiblingsPackage.FAMILY__DAUGHTERS:
			return daughters != null && !daughters.isEmpty();
		case FamiliesWithSiblingsPackage.FAMILY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FamiliesWithSiblingsPackage.FAMILY__FAMILIES_INVERSE:
			return getFamiliesInverse() != null;
		case FamiliesWithSiblingsPackage.FAMILY__SIBLINGS:
			return siblings != null && !siblings.isEmpty();
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

} //FamilyImpl
