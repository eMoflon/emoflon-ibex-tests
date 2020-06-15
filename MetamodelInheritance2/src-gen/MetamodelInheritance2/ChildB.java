/**
 */
package MetamodelInheritance2;

import MetamodelInheritance.BaseContaineeB;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance2.ChildB#getA <em>A</em>}</li>
 *   <li>{@link MetamodelInheritance2.ChildB#getD <em>D</em>}</li>
 * </ul>
 *
 * @see MetamodelInheritance2.MetamodelInheritance2Package#getChildB()
 * @model
 * @generated
 */
public interface ChildB extends BaseContaineeB {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference list.
	 * The list contents are of type {@link MetamodelInheritance2.ChildA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference list.
	 * @see MetamodelInheritance2.MetamodelInheritance2Package#getChildB_A()
	 * @model
	 * @generated
	 */
	EList<ChildA> getA();

	/**
	 * Returns the value of the '<em><b>D</b></em>' reference list.
	 * The list contents are of type {@link MetamodelInheritance2.ChildContaineeD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' reference list.
	 * @see MetamodelInheritance2.MetamodelInheritance2Package#getChildB_D()
	 * @model
	 * @generated
	 */
	EList<ChildContaineeD> getD();

} // ChildB
