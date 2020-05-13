/**
 */
package MetamodelInheritance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetamodelInheritance.BaseContainer#getBaseA <em>Base A</em>}</li>
 *   <li>{@link MetamodelInheritance.BaseContainer#getBaseB <em>Base B</em>}</li>
 *   <li>{@link MetamodelInheritance.BaseContainer#getBaseC <em>Base C</em>}</li>
 * </ul>
 *
 * @see MetamodelInheritance.MetamodelInheritancePackage#getBaseContainer()
 * @model
 * @generated
 */
public interface BaseContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Base A</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelInheritance.BaseContaineeA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base A</em>' containment reference list.
	 * @see MetamodelInheritance.MetamodelInheritancePackage#getBaseContainer_BaseA()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseContaineeA> getBaseA();

	/**
	 * Returns the value of the '<em><b>Base B</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelInheritance.BaseContaineeB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base B</em>' containment reference list.
	 * @see MetamodelInheritance.MetamodelInheritancePackage#getBaseContainer_BaseB()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseContaineeB> getBaseB();

	/**
	 * Returns the value of the '<em><b>Base C</b></em>' containment reference list.
	 * The list contents are of type {@link MetamodelInheritance.BaseContaineeC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base C</em>' containment reference list.
	 * @see MetamodelInheritance.MetamodelInheritancePackage#getBaseContainer_BaseC()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseContaineeC> getBaseC();

} // BaseContainer
