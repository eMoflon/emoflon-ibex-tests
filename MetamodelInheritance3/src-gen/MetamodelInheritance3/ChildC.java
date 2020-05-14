/**
 */
package MetamodelInheritance3;

import MetamodelInheritance.BaseContaineeC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance3.ChildC#getD <em>D</em>}</li>
 * </ul>
 *
 * @see MetamodelInheritance3.MetamodelInheritance3Package#getChildC()
 * @model
 * @generated
 */
public interface ChildC extends BaseContaineeC {
	/**
	 * Returns the value of the '<em><b>D</b></em>' reference list.
	 * The list contents are of type {@link MetamodelInheritance3.ChildD}.
	 * It is bidirectional and its opposite is '{@link MetamodelInheritance3.ChildD#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' reference list.
	 * @see MetamodelInheritance3.MetamodelInheritance3Package#getChildC_D()
	 * @see MetamodelInheritance3.ChildD#getC
	 * @model opposite="c"
	 * @generated
	 */
	EList<ChildD> getD();

} // ChildC
