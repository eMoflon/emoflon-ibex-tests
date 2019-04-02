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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SK Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKComponentImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKComponentImpl#getAuthorizedSubcomponents <em>Authorized Subcomponents</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKComponentImpl#getAuthorizedFeatures <em>Authorized Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SKComponentImpl extends SKHierarchicalObjectImpl implements SKComponent {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<SKFeature> features;

	/**
	 * The cached value of the '{@link #getAuthorizedSubcomponents() <em>Authorized Subcomponents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SKComponent> authorizedSubcomponents;

	/**
	 * The cached value of the '{@link #getAuthorizedFeatures() <em>Authorized Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<SKComponent> authorizedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SKComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public SKComponentImpl(String p_name) {
//		super(p_name);	
//	}

//	public SKComponentImpl() {
//		this("");
//	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelSpicesPackage.Literals.SK_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<SKFeature>(SKFeature.class, this, KernelSpicesPackage.SK_COMPONENT__FEATURES, KernelSpicesPackage.SK_FEATURE__COMPONENT);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	public boolean isComponent() {
		return true;
	}

	/**
	 * @generated NOT
	 * Cette méthode est un bouchon
	 */
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("true"))
			return true;
		else
			return false;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKFeature getNamedFeature(String p_name) {
		EList<SKFeature> features = this.getFeatures();
		for (int i = 0; i < features.size(); i++ ) {
			if (features.get(i).getName().equals(p_name)) return features.get(i);
		}
		return null;
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
			case KernelSpicesPackage.SK_COMPONENT__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	protected void basicAddChild(SKHierarchicalObject p_child) {
//		if (children == null) {
//			children = new EObjectContainmentEList<SKComponent>(SKComponent.class, this, KernelSpicesPackage.SK_COMPONENT__CHILDREN);
//		}
//		children.add((SKComponent) p_child);		
//	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public void setOdSystems(EList<SKODSystem> _odSystems) {
//		EList<SKODSystem> oldOdsSystems = odSystems;
//		odSystems = _odSystems;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, KernelSpicesPackage.SK_COMPONENT__OD_SYSTEMS, oldOdsSystems, odSystems));
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKComponent> getAuthorizedSubcomponents() {
		return authorizedSubcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizedSubcomponents(EList<SKComponent> newAuthorizedSubcomponents) {
		EList<SKComponent> oldAuthorizedSubcomponents = authorizedSubcomponents;
		authorizedSubcomponents = newAuthorizedSubcomponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS, oldAuthorizedSubcomponents, authorizedSubcomponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKComponent> getAuthorizedFeatures() {
		return authorizedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizedFeatures(EList<SKComponent> newAuthorizedFeatures) {
		EList<SKComponent> oldAuthorizedFeatures = authorizedFeatures;
		authorizedFeatures = newAuthorizedFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES, oldAuthorizedFeatures, authorizedFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelSpicesPackage.SK_COMPONENT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case KernelSpicesPackage.SK_COMPONENT__FEATURES:
				return getFeatures();
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS:
				return getAuthorizedSubcomponents();
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES:
				return getAuthorizedFeatures();
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
			case KernelSpicesPackage.SK_COMPONENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends SKFeature>)newValue);
				return;
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS:
				setAuthorizedSubcomponents((EList<SKComponent>)newValue);
				return;
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES:
				setAuthorizedFeatures((EList<SKComponent>)newValue);
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
			case KernelSpicesPackage.SK_COMPONENT__FEATURES:
				getFeatures().clear();
				return;
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS:
				setAuthorizedSubcomponents((EList<SKComponent>)null);
				return;
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES:
				setAuthorizedFeatures((EList<SKComponent>)null);
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
			case KernelSpicesPackage.SK_COMPONENT__FEATURES:
				return features != null && !features.isEmpty();
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS:
				return authorizedSubcomponents != null;
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES:
				return authorizedFeatures != null;
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
		result.append(" (authorizedSubcomponents: ");
		result.append(authorizedSubcomponents);
		result.append(", authorizedFeatures: ");
		result.append(authorizedFeatures);
		result.append(')');
		return result.toString();
	}

	@Override
	protected boolean validateName(String name, boolean force) {
		return validateName(name);
	}

} //SKComponentImpl