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
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKProperty;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SK Hierarchical Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl#getOdSystems <em>Od Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SKHierarchicalObjectImpl extends SKObjectImpl implements SKHierarchicalObject {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<SKProperty> properties;
	
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SKHierarchicalObject> children;

	/**
	 * The cached value of the '{@link #getOdSystems() <em>Od Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<SKODSystem> odSystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SKHierarchicalObjectImpl() {
		super();
	}

	protected boolean renamed = false;
	
	protected String oldName = "";

	/**
	 * Flag to know if a change of hierarchical level is running and valid
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	public static final int NO_HCHANGE=0;
	public static final int VALID_HCHANGE=1;
	public static final int INVALID_HCHANGE=2;
	public static final int INVALID_HCHANGE_NAME=3;
	protected int hierarchicalChange = NO_HCHANGE;
	
	/**
	 * oldPosition of the corresponding figure in the editor during 
	 * invalid hierarchical change.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	private Point oldPosition;
	
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	private BasicEList<EModelElement> newChildUp = null;
	
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	private BasicEList<EModelElement> newChildDown = null;
	
	/**
	 * 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	private List<Object> oldOds = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	protected SKHierarchicalObjectImpl(String p_name) {
//		super(p_name);
//	}

//	protected SKHierarchicalObjectImpl() {
//		this("");	
//	}
//
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	protected SKHierarchicalObjectImpl(String p_name, int p_level) {
//		super(p_name);		
//		this.setLevel(p_level);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getLevel() {
		int level = 0;
		SKHierarchicalObject parent = getParent();
		
		while( parent != null ) {
			level++;
			parent = parent.getParent();
		}
		
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<SKProperty>(SKProperty.class, this, KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKHierarchicalObject getParent() {
		if (eContainerFeatureID() != KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT) return null;
		return (SKHierarchicalObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//abstract public EList getChildren(); 

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	abstract protected void basicSetParent(SKHierarchicalObject p_parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public void setParent(SKHierarchicalObject p_parent) {
//		setParent(p_parent, false);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public void setParent(SKHierarchicalObject p_parent, boolean force) {
//		// DB: Handle the case when parent is null.
//		if (!force){
//			if (getId()=="") {
//				setId(UUID.randomUUID().toString());
//				String name=getName();
//				
//				if ( p_parent != null ) {
//					int count = 1;
//					final EList<?> children = p_parent.getChildren();
//	
//					for (int i=0;i<children.size();i++){
//						if (((SKHierarchicalObject)(children.get(i))).getName().equalsIgnoreCase(name)) {
//							name="Copy"+count+"_of_"+getName();
//							i=-1;
//							count++;
//						}
//					}
//				
//					setName(name);
//				}
//			}
//		}
//		
//		this.basicSetParent(p_parent);
//		
//		if ( p_parent != null ) {
//			((SKHierarchicalObjectImpl)p_parent).basicAddChild(this);
//			this.setLevel(p_parent.getLevel() + 1);
//		}
//	}
	
	/**
	 *  <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//abstract protected void basicAddChild(SKHierarchicalObject p_child);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public void addChild(SKHierarchicalObject p_child) {
//		this.basicAddChild(p_child);
//		((SKHierarchicalObjectImpl) p_child).basicSetParent(this);
//		((SKHierarchicalObjectImpl) p_child).setLevel(this.getLevel() + 1);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRoot() {
		return (this.getLevel() == 0);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	public boolean isODSection() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	public boolean isComponent() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	public boolean isFeature() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	public boolean isRelation() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	abstract public boolean verify(String p_keyword) throws SKHierarchicalObjectException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isTerminal() {
		return (getChildren().size()==0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addProperty(String _name) {
		if (properties == null) {
			properties = new EObjectContainmentEList<SKProperty>(SKProperty.class, this, KernelSpicesPackage.SK_PROPERTY);
		}
		SKProperty property = (new KernelSpicesFactoryImpl()).createSKProperty();
		property.setName(_name);
		properties.add(property);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addProperty(String _name, Object value) {
		if (properties == null) {
			properties = new EObjectContainmentEList<SKProperty>(SKProperty.class, this, KernelSpicesPackage.SK_PROPERTY);
		}
		SKProperty property = (new KernelSpicesFactoryImpl()).createSKProperty();
		property.setName(_name);
		property.setValue(value);
		properties.add(property);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProperty(String name, Object value) {
		SKProperty property = getProperty(name);
		if (property != null) property.setValue(value);
		else addProperty(name, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKProperty getProperty(String _name) {
		EList<SKProperty> lprop = getProperties();
		for (int i=0;i<lprop.size();i++){
			if (((SKProperty)lprop.get(i)).getName().equals(_name)) return lprop.get(i);
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
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((SKHierarchicalObject)otherEnd, msgs);
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
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
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT:
				return basicSetParent(null, msgs);
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS:
				return ((InternalEList<?>)getOdSystems()).basicRemove(otherEnd, msgs);
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
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT:
				return eInternalContainer().eInverseRemove(this, KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN, SKHierarchicalObject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//abstract public SKHierarchicalObject getParent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SKHierarchicalObject newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SKHierarchicalObject newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN, SKHierarchicalObject.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKHierarchicalObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<SKHierarchicalObject>(SKHierarchicalObject.class, this, KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN, KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKODSystem> getOdSystems() {
		if (odSystems == null) {
			odSystems = new EObjectContainmentEList<SKODSystem>(SKODSystem.class, this, KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS);
		}
		return odSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addChild(SKHierarchicalObject p_child) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKHierarchicalObject getNamedChild(String p_name) {
		EList<SKHierarchicalObject> children = this.getChildren();
		for (int i = 0; i < children.size(); i++ ) {
			SKHierarchicalObject child = (SKHierarchicalObject) children.get(i);
			if (child.getName().equals(p_name)) return child;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SKHierarchicalObject> getNamedChildren(String p_name) {
		EList<SKHierarchicalObject> children = this.getChildren();
		BasicEList<SKHierarchicalObject> nChildren = new BasicEList<SKHierarchicalObject>();
		for (int i = 0; i < children.size(); i++ ) {
			SKHierarchicalObject child = (SKHierarchicalObject) children.get(i);
			if (child.getName().equals(p_name)) nChildren.add(child);
		}
		return nChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SKHierarchicalObject> findLeveledChildren(int p_level) {
		if ((this.getLevel() + 1) == p_level)
			return this.getChildren();
		else {
			BasicEList<SKHierarchicalObject> lChildren = new BasicEList<SKHierarchicalObject>();
			for (int i = 0; i < this.getChildren().size(); i++) {
				SKHierarchicalObject child = (SKHierarchicalObject) this.getChildren().get(i);
				lChildren.addAll(child.findLeveledChildren(p_level));
			}
			return lChildren;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__LEVEL:
				return getLevel();
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PROPERTIES:
				return getProperties();
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT:
				return getParent();
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN:
				return getChildren();
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS:
				return getOdSystems();
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
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends SKProperty>)newValue);
				return;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT:
				setParent((SKHierarchicalObject)newValue);
				return;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends SKHierarchicalObject>)newValue);
				return;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS:
				getOdSystems().clear();
				getOdSystems().addAll((Collection<? extends SKODSystem>)newValue);
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
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PROPERTIES:
				getProperties().clear();
				return;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT:
				setParent((SKHierarchicalObject)null);
				return;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN:
				getChildren().clear();
				return;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS:
				getOdSystems().clear();
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
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__LEVEL:
				return getLevel() != LEVEL_EDEFAULT;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT:
				return getParent() != null;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN:
				return children != null && !children.isEmpty();
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS:
				return odSystems != null && !odSystems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void setRenamed(boolean changed){
		renamed = changed;
		if (!renamed)
			oldName = name;
	}
	
	public boolean isRenamed(){
		return renamed;
	}
	
	@Override
	public void setName(String newName) {
		setName(newName, false);
	}
	
	public void setName(String newName, boolean force){
		if (validateName(newName,force)){
			if (name != "" && name != null) {
				renamed = true;
				oldName = name;
			}
			super.setName(newName);
		}
	}
	
	abstract protected boolean validateName(String name, boolean force);
	
	public String getNotRenamedName() {
		if (oldName.length()==0) return name;
		else return oldName;
	}
	
	public int getHirerarchicalChange(){
		return hierarchicalChange;
	}
	
	public void setHirerarchicalChange(int level){
		hierarchicalChange=level;
	}
	
	public Point getOldPosition(){
		return oldPosition;
	}
	
	public void setOldPosition(Point position){
		oldPosition=position;
	}
	
	public BasicEList<EModelElement> getNewChildUp(){
		return newChildUp;
	}
	
	public void setNewChildUp(BasicEList<EModelElement> child){
		newChildUp=child;
	}
	
	public BasicEList<EModelElement> getNewChildDown(){
		return newChildDown;
	}
	
	public void setNewChildDown(BasicEList<EModelElement> child){
		newChildDown=child;
	}
	
	public List<Object> getOldOds(){
		return oldOds;
	}
	
	public void setOldOds(List<Object> ods){
		oldOds=ods;
	}

} //SKHierarchicalObjectImpl