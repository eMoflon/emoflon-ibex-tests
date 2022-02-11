/**
 * generated by Xtext 2.25.0
 */
package org.emoflon.express.express;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emoflon.express.express.UserDefinedTypeList#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.emoflon.express.express.ExpressPackage#getUserDefinedTypeList()
 * @model
 * @generated
 */
public interface UserDefinedTypeList extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link org.emoflon.express.express.UserDefinedType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see org.emoflon.express.express.ExpressPackage#getUserDefinedTypeList_Elements()
   * @model
   * @generated
   */
  EList<UserDefinedType> getElements();

} // UserDefinedTypeList