/**
 */
package classMultipleInheritanceHierarchy.impl;

import classMultipleInheritanceHierarchy.Attribute;
import classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyPackage;
import classMultipleInheritanceHierarchy.ClassPackage;
import classMultipleInheritanceHierarchy.Clazz;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classMultipleInheritanceHierarchy.impl.ClazzImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link classMultipleInheritanceHierarchy.impl.ClazzImpl#getSubClass <em>Sub Class</em>}</li>
 *   <li>{@link classMultipleInheritanceHierarchy.impl.ClazzImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link classMultipleInheritanceHierarchy.impl.ClazzImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClazzImpl extends NamedElementImpl implements Clazz {
	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> superClass;

	/**
	 * The cached value of the '{@link #getSubClass() <em>Sub Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClass()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> subClass;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClazzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassMultipleInheritanceHierarchyPackage.Literals.CLAZZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectWithInverseResolvingEList.ManyInverse<Clazz>(Clazz.class, this,
					ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUPER_CLASS,
					ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUB_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getSubClass() {
		if (subClass == null) {
			subClass = new EObjectWithInverseResolvingEList.ManyInverse<Clazz>(Clazz.class, this,
					ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUB_CLASS,
					ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUPER_CLASS);
		}
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassPackage getPackage() {
		if (eContainerFeatureID() != ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE)
			return null;
		return (ClassPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(ClassPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPackage, ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(ClassPackage newPackage) {
		if (newPackage != eInternalContainer()
				|| (eContainerFeatureID() != ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE
						&& newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject) newPackage).eInverseAdd(this,
						ClassMultipleInheritanceHierarchyPackage.CLASS_PACKAGE__CLASSES, ClassPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this,
					ClassMultipleInheritanceHierarchyPackage.CLAZZ__ATTRIBUTES,
					ClassMultipleInheritanceHierarchyPackage.ATTRIBUTE__CLAZZ);
		}
		return attributes;
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
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUPER_CLASS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSuperClass()).basicAdd(otherEnd, msgs);
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUB_CLASS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubClass()).basicAdd(otherEnd, msgs);
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPackage((ClassPackage) otherEnd, msgs);
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__ATTRIBUTES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributes()).basicAdd(otherEnd, msgs);
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
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUPER_CLASS:
			return ((InternalEList<?>) getSuperClass()).basicRemove(otherEnd, msgs);
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUB_CLASS:
			return ((InternalEList<?>) getSubClass()).basicRemove(otherEnd, msgs);
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE:
			return basicSetPackage(null, msgs);
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE:
			return eInternalContainer().eInverseRemove(this,
					ClassMultipleInheritanceHierarchyPackage.CLASS_PACKAGE__CLASSES, ClassPackage.class, msgs);
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
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUPER_CLASS:
			return getSuperClass();
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUB_CLASS:
			return getSubClass();
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE:
			return getPackage();
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__ATTRIBUTES:
			return getAttributes();
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
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUPER_CLASS:
			getSuperClass().clear();
			getSuperClass().addAll((Collection<? extends Clazz>) newValue);
			return;
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUB_CLASS:
			getSubClass().clear();
			getSubClass().addAll((Collection<? extends Clazz>) newValue);
			return;
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE:
			setPackage((ClassPackage) newValue);
			return;
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
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
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUPER_CLASS:
			getSuperClass().clear();
			return;
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUB_CLASS:
			getSubClass().clear();
			return;
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE:
			setPackage((ClassPackage) null);
			return;
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__ATTRIBUTES:
			getAttributes().clear();
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
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUPER_CLASS:
			return superClass != null && !superClass.isEmpty();
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__SUB_CLASS:
			return subClass != null && !subClass.isEmpty();
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__PACKAGE:
			return getPackage() != null;
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClazzImpl
