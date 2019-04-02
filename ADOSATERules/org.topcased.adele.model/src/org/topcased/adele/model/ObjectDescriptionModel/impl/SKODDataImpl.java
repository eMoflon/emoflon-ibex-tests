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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage;
import org.topcased.adele.model.ObjectDescriptionModel.SKODData;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SKOD Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl#isModified <em>Modified</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl#getDom <em>Dom</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl#isExternal <em>External</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SKODDataImpl extends EObjectImpl implements SKODData {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModified()
	 * @generated
	 * @ordered
	 */
	protected boolean modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDom() <em>Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDom()
	 * @generated
	 * @ordered
	 */
	protected static final Document DOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDom() <em>Dom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDom()
	 * @generated
	 * @ordered
	 */
	protected Document dom = DOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final Node NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SKODDataImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SKODDataImpl(String p_data) {
		super();
		external = false;
		value = p_data;
		modified = false;
		dom = null;
		node = null;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SKODDataImpl(String p_data, Document p_dom, Node p_node) {
		super();		
		external = true;
		value = p_data;
		modified = false;
		dom = p_dom;
		node = p_node;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SKODDataImpl(Document p_dom, Node p_node) {
		super();		
		external = true;
		value = "";
		modified = true;
		dom = p_dom;
		node = p_node;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDescriptionModelPackage.Literals.SKOD_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setValue(String p_data) throws SKODSFactoryException {
		if (! external) throw new SKODSFactoryException("Only external SKODData can be changed");
		value = p_data;
		modified = true;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashSet flush(HashSet p_modifiedDoms) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	public HashSet flush(HashSet p_modifiedDoms) {
//		// TODO: implement this method
//		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModified() {
		return modified;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HashSet<Document> flush (HashSet<Document> p_modifiedDoms,
			boolean force) {
		if ( (this.isModified() || force) && node!=null) {
			node.setTextContent(value);
			p_modifiedDoms.add(dom);
		}
		return p_modifiedDoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDom() {
		return dom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectDescriptionModelPackage.SKOD_DATA__VALUE:
				return getValue();
			case ObjectDescriptionModelPackage.SKOD_DATA__MODIFIED:
				return isModified();
			case ObjectDescriptionModelPackage.SKOD_DATA__DOM:
				return getDom();
			case ObjectDescriptionModelPackage.SKOD_DATA__NODE:
				return getNode();
			case ObjectDescriptionModelPackage.SKOD_DATA__EXTERNAL:
				return isExternal();
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
			case ObjectDescriptionModelPackage.SKOD_DATA__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ObjectDescriptionModelPackage.SKOD_DATA__MODIFIED:
				return modified != MODIFIED_EDEFAULT;
			case ObjectDescriptionModelPackage.SKOD_DATA__DOM:
				return DOM_EDEFAULT == null ? dom != null : !DOM_EDEFAULT.equals(dom);
			case ObjectDescriptionModelPackage.SKOD_DATA__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case ObjectDescriptionModelPackage.SKOD_DATA__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", modified: ");
		result.append(modified);
		result.append(", dom: ");
		result.append(dom);
		result.append(", node: ");
		result.append(node);
		result.append(", external: ");
		result.append(external);
		result.append(')');
		return result.toString();
	}

} //SKODDataImpl
