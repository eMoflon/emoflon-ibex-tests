/**
 * generated by Xtext 2.37.0
 */
package org.emoflon.express.express;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emoflon.express.express.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.emoflon.express.express.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.emoflon.express.express.Function#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.emoflon.express.express.ExpressPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.emoflon.express.express.ExpressPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.emoflon.express.express.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParameterList)
   * @see org.emoflon.express.express.ExpressPackage#getFunction_Parameters()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameters();

  /**
   * Sets the value of the '{@link org.emoflon.express.express.Function#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParameterList value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(ReferenceOrValue)
   * @see org.emoflon.express.express.ExpressPackage#getFunction_ReturnType()
   * @model containment="true"
   * @generated
   */
  ReferenceOrValue getReturnType();

  /**
   * Sets the value of the '{@link org.emoflon.express.express.Function#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(ReferenceOrValue value);

} // Function
