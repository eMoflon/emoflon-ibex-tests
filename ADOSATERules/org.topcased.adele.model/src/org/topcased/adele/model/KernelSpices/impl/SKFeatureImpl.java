/**
 * Copyright (c) 2009 Ellidiss Technologies
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Arnaud Schach, arnaud.schach.com
 * 	Jean-Bertrand Hery
 */
package org.topcased.adele.model.KernelSpices.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.SKFeatureVisibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SK Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKFeatureImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKFeatureImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SKFeatureImpl extends SKHierarchicalObjectImpl implements SKFeature {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final SKFeatureVisibility VISIBILITY_EDEFAULT = SKFeatureVisibility.PROVIDED_LITERAL;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected SKFeatureVisibility visibility = VISIBILITY_EDEFAULT;

	//	protected SKFeatureImpl(String p_name) {
//		super(p_name);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SKFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	public boolean isFeature() {
		return true;
	}

	/**
	 * @generated NOT
	 * Cette méthode est un bouchon
	 */
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword == "true")
			return true;
		else
			return false;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelSpicesPackage.Literals.SK_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKFeatureVisibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(SKFeatureVisibility newVisibility) {
		SKFeatureVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelSpicesPackage.SK_FEATURE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKComponent getComponent() {
		if (eContainerFeatureID() != KernelSpicesPackage.SK_FEATURE__COMPONENT) return null;
		return (SKComponent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(SKComponent newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, KernelSpicesPackage.SK_FEATURE__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(SKComponent newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != KernelSpicesPackage.SK_FEATURE__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, KernelSpicesPackage.SK_COMPONENT__FEATURES, SKComponent.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelSpicesPackage.SK_FEATURE__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public SKFeature getParent() {
//		return parent;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public void basicSetParent(SKHierarchicalObject p_parent) {
//		parent = (SKFeature) p_parent;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	protected void basicAddChild(SKHierarchicalObject p_child) {
//		if (children == null) {
//			children = new EObjectContainmentEList<SKFeature>(SKFeature.class, this, KernelSpicesPackage.SK_FEATURE__CHILDREN);
//		}
//		children.add((SKFeature) p_child);		
//	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelSpicesPackage.SK_FEATURE__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((SKComponent)otherEnd, msgs);
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
			case KernelSpicesPackage.SK_FEATURE__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case KernelSpicesPackage.SK_FEATURE__COMPONENT:
				return eInternalContainer().eInverseRemove(this, KernelSpicesPackage.SK_COMPONENT__FEATURES, SKComponent.class, msgs);
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
			case KernelSpicesPackage.SK_FEATURE__VISIBILITY:
				return getVisibility();
			case KernelSpicesPackage.SK_FEATURE__COMPONENT:
				return getComponent();
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
			case KernelSpicesPackage.SK_FEATURE__VISIBILITY:
				setVisibility((SKFeatureVisibility)newValue);
				return;
			case KernelSpicesPackage.SK_FEATURE__COMPONENT:
				setComponent((SKComponent)newValue);
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
			case KernelSpicesPackage.SK_FEATURE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case KernelSpicesPackage.SK_FEATURE__COMPONENT:
				setComponent((SKComponent)null);
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
			case KernelSpicesPackage.SK_FEATURE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case KernelSpicesPackage.SK_FEATURE__COMPONENT:
				return getComponent() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

	@Override
	protected boolean validateName(String name, boolean force) {
		return validateName(name);
	}

} //SKFeatureImpl