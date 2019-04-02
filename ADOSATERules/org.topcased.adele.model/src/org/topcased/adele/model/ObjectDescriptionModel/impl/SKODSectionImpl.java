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

package org.topcased.adele.model.ObjectDescriptionModel.impl;

import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage;
import org.topcased.adele.model.ObjectDescriptionModel.SKODData;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSection;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SKOD Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSectionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSectionImpl#getDomODSNode <em>Dom ODS Node</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSectionImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SKODSectionImpl extends SKHierarchicalObjectImpl implements SKODSection {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomODSNode() <em>Dom ODS Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomODSNode()
	 * @generated
	 * @ordered
	 */
	protected static final Node DOM_ODS_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomODSNode() <em>Dom ODS Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomODSNode()
	 * @generated
	 * @ordered
	 */
	protected Node domODSNode = DOM_ODS_NODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected SKODData data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKODSectionImpl(String p_id, String p_label, SKODData p_data, Node p_reference) {
		super();
		setName( p_id );
		label = p_label;
		data = p_data;
		domODSNode = p_reference;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SKODSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getDomODSNode() {
		return domODSNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKODData getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(SKODData newData, NotificationChain msgs) {
		SKODData oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObjectDescriptionModelPackage.SKOD_SECTION__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public SKODSection getParent() {
//		return parent;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	protected void basicSetParent(SKHierarchicalObject p_parent) {
//		parent = (SKODSection) p_parent;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	protected void basicAddChild(SKHierarchicalObject p_child) {
//		if (children == null) {
//			children = new EObjectContainmentEList(SKODSection.class, this, ObjectDescriptionModelPackage.SKOD_SECTION__CHILDREN);
//		}
//		children.add((SKODSection) p_child);		
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addChild(String p_id, String p_label, SKODData p_data, Node p_reference) {
		SKODSectionImpl child = new SKODSectionImpl(p_id, p_label, p_data, p_reference);
		this.addChild(child);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getId() {
		return this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isModified() {
		return (data != null && this.getData().isModified()); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInDeepModified() {
		if (this.isModified()) return true;
		if (children == null) return false;
		for (int i = 0; i < children.size(); i++) {
			if (((SKODSection) children.get(i)).isInDeepModified()) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected HashSet<Document> flushData(HashSet<Document> p_modifiedDoms,
			boolean force) {
		if (data == null)
			return p_modifiedDoms;
		else
			return data.flush(p_modifiedDoms, force); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HashSet<Document> deepFlushData(HashSet<Document> p_modifiedDoms,
			boolean force) {
		if (children == null || children.isEmpty()) return this.flushData(p_modifiedDoms, force);
		HashSet<Document> modifiedDoms = p_modifiedDoms;
		for (int i = 0; i < children.size(); i++) {
			modifiedDoms.addAll(((SKODSection) children.get(i)).deepFlushData(modifiedDoms, force));
		}
		return modifiedDoms;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setValueData(String p_data) throws SKODSFactoryException {
		if (data != null) {
			data.setValue(p_data);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashSet deepFlushData(HashSet p_modifiedDoms) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public HashSet deepFlushData(HashSet p_modifiedDoms) {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	public boolean isODSection() {
		return true;
	}

	/**
	 * Cette méthode est un bouchon
	 * @generated NOT
	 */
	public boolean verify(String p_keyword) {
		return true; // A TERMINER
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDescriptionModelPackage.Literals.SKOD_SECTION;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectDescriptionModelPackage.SKOD_SECTION__DATA:
				return basicSetData(null, msgs);
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
			case ObjectDescriptionModelPackage.SKOD_SECTION__LABEL:
				return getLabel();
			case ObjectDescriptionModelPackage.SKOD_SECTION__DOM_ODS_NODE:
				return getDomODSNode();
			case ObjectDescriptionModelPackage.SKOD_SECTION__DATA:
				return getData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ObjectDescriptionModelPackage.SKOD_SECTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ObjectDescriptionModelPackage.SKOD_SECTION__DOM_ODS_NODE:
				return DOM_ODS_NODE_EDEFAULT == null ? domODSNode != null : !DOM_ODS_NODE_EDEFAULT.equals(domODSNode);
			case ObjectDescriptionModelPackage.SKOD_SECTION__DATA:
				return data != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", domODSNode: ");
		result.append(domODSNode);
		result.append(')');
		return result.toString();
	}

	@Override
	protected boolean validateName(String name, boolean force) {
		return validateName(name);
	}

} //SKODSectionImpl