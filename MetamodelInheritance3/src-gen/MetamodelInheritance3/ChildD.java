/**
 */
package MetamodelInheritance3;

import MetamodelInheritance.BaseContaineeA;

import MetamodelInheritance2.ChildContaineeD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance3.ChildD#getC <em>C</em>}</li>
 *   <li>{@link MetamodelInheritance3.ChildD#getA <em>A</em>}</li>
 * </ul>
 *
 * @see MetamodelInheritance3.MetamodelInheritance3Package#getChildD()
 * @model
 * @generated
 */
public interface ChildD extends ChildContaineeD {
	/**
	 * Returns the value of the '<em><b>C</b></em>' reference list.
	 * The list contents are of type {@link MetamodelInheritance3.ChildC}.
	 * It is bidirectional and its opposite is '{@link MetamodelInheritance3.ChildC#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' reference list.
	 * @see MetamodelInheritance3.MetamodelInheritance3Package#getChildD_C()
	 * @see MetamodelInheritance3.ChildC#getD
	 * @model opposite="d"
	 * @generated
	 */
	EList<ChildC> getC();

	/**
	 * Returns the value of the '<em><b>A</b></em>' reference list.
	 * The list contents are of type {@link MetamodelInheritance.BaseContaineeA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference list.
	 * @see MetamodelInheritance3.MetamodelInheritance3Package#getChildD_A()
	 * @model
	 * @generated
	 */
	EList<BaseContaineeA> getA();

} // ChildD
