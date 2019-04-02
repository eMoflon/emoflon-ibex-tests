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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SK Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.topcased.adele.model.KernelSpices.SKRelation#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKRelation()
 * @model
 * @generated
 */
public interface SKRelation extends SKHierarchicalObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.KernelSpices.SKObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see org.topcased.adele.model.KernelSpices.KernelSpicesPackage#getSKRelation_Objects()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<SKObject> getObjects();
	
	/**
	 * Set the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link org.topcased.adele.model.KernelSpices.SKObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	// DB: Do not allow setting the list. Always use getObjects().add, etc.
	//void setObjects(EList<SKObject> objects);

} // SKRelation