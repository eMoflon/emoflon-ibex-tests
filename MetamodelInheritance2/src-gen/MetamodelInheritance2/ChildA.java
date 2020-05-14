/**
 */
package MetamodelInheritance2;

import MetamodelInheritance.BaseContaineeA;
import MetamodelInheritance.BaseContaineeC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance2.ChildA#getB <em>B</em>}</li>
 *   <li>{@link MetamodelInheritance2.ChildA#getChildD <em>Child D</em>}</li>
 *   <li>{@link MetamodelInheritance2.ChildA#getC <em>C</em>}</li>
 * </ul>
 *
 * @see MetamodelInheritance2.MetamodelInheritance2Package#getChildA()
 * @model
 * @generated
 */
public interface ChildA extends BaseContaineeA {
	/**
	 * Returns the value of the '<em><b>B</b></em>' reference list.
	 * The list contents are of type {@link MetamodelInheritance2.ChildB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference list.
	 * @see MetamodelInheritance2.MetamodelInheritance2Package#getChildA_B()
	 * @model
	 * @generated
	 */
	EList<ChildB> getB();

	/**
	 * Returns the value of the '<em><b>Child D</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelInheritance2.ChildContaineeD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child D</em>' containment reference list.
	 * @see MetamodelInheritance2.MetamodelInheritance2Package#getChildA_ChildD()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChildContaineeD> getChildD();

	/**
	 * Returns the value of the '<em><b>C</b></em>' reference list.
	 * The list contents are of type {@link MetamodelInheritance.BaseContaineeC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' reference list.
	 * @see MetamodelInheritance2.MetamodelInheritance2Package#getChildA_C()
	 * @model
	 * @generated
	 */
	EList<BaseContaineeC> getC();

} // ChildA
