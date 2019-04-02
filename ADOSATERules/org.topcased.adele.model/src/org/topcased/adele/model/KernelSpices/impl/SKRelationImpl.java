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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.KernelSpices.SKRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SK Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKRelationImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SKRelationImpl extends SKHierarchicalObjectImpl implements SKRelation {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<SKObject> objects;

	//	protected SKRelationImpl(String p_name) {
//		super(p_name);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SKRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelSpicesPackage.Literals.SK_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	public boolean isRelation() {
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
	public EList<SKObject> getObjects() {
		if (objects == null) {
			objects = new EObjectResolvingEList<SKObject>(SKObject.class, this, KernelSpicesPackage.SK_RELATION__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	// DB: Do not allow setting the list. Always use getObjects().add, etc.
//	public void setObjects(EList<SKObject> objects) {
//		basicSetObjects(objects);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public void basicSetParent(SKHierarchicalObject p_parent) {
//		parent = (SKRelation) p_parent;
//	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	protected void basicAddChild(SKHierarchicalObject p_child) {
//		if (children == null) {
//			children = new EObjectContainmentEList<SKRelation>(SKRelation.class, this, KernelSpicesPackage.SK_RELATION__CHILDREN);
//		}
//		children.add((SKRelation) p_child);		
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelSpicesPackage.SK_RELATION__OBJECTS:
				return getObjects();
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
			case KernelSpicesPackage.SK_RELATION__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends SKObject>)newValue);
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
			case KernelSpicesPackage.SK_RELATION__OBJECTS:
				getObjects().clear();
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
			case KernelSpicesPackage.SK_RELATION__OBJECTS:
				return objects != null && !objects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected boolean validateName(String name, boolean force) {
		return validateName(name);
	}

} //SKRelationImpl