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
package org.topcased.adele.model.KernelSpices;

import org.eclipse.emf.common.util.EList;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SK Hierarchical Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getLevel <em>Level</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getParent <em>Parent</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getChildren <em>Children</em>}</li>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getOdSystems <em>Od Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKHierarchicalObject()
 * @model abstract="true"
 * @generated
 */
public interface SKHierarchicalObject extends SKObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Par convention, un SKHierarchicalObject dont le parent=null (pas de parent) a un leve=0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKHierarchicalObject_Level()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.KernelSpices.SKProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKHierarchicalObject_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<SKProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject}.
	 * It is bidirectional and its opposite is '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKHierarchicalObject_Children()
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SKHierarchicalObject> getChildren();

	/**
	 * Returns the value of the '<em><b>Od Systems</b></em>' containment reference list.
	 * The list contents are of type {@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Od Systems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Od Systems</em>' containment reference list.
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKHierarchicalObject_OdSystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<SKODSystem> getOdSystems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addChild(SKHierarchicalObject p_child);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRoot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isODSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRelation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isTerminal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addProperty(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addProperty(String name, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setProperty(String name, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	SKProperty getProperty(String name);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean verify(String p_keyword) throws SKHierarchicalObjectException;

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SKHierarchicalObject)
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKHierarchicalObject_Parent()
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	SKHierarchicalObject getParent();

	/**
	 * Sets the value of the '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SKHierarchicalObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	//void setParent(SKHierarchicalObject p_parent, boolean force);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I return my fist direct child with name=p_name
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	SKHierarchicalObject getNamedChild(String p_name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I return all my direct children with name=p_name
	 * <!-- end-model-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<SKHierarchicalObject> getNamedChildren(String p_name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I return all my children with level=p_level
	 * <!-- end-model-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<SKHierarchicalObject> findLeveledChildren(int p_level);
	
	void setRenamed(boolean changed);
	
	boolean isRenamed();
	
	String getNotRenamedName();

} // SKHierarchicalObject