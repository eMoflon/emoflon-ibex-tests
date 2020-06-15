/**
 */
package MetamodelInheritance3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MetamodelInheritance3.MetamodelInheritance3Package
 * @generated
 */
public interface MetamodelInheritance3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelInheritance3Factory eINSTANCE = MetamodelInheritance3.impl.MetamodelInheritance3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Child C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child C</em>'.
	 * @generated
	 */
	ChildC createChildC();

	/**
	 * Returns a new object of class '<em>Child D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child D</em>'.
	 * @generated
	 */
	ChildD createChildD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelInheritance3Package getMetamodelInheritance3Package();

} //MetamodelInheritance3Factory
