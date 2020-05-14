/**
 */
package MetamodelInheritance2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MetamodelInheritance2.MetamodelInheritance2Package
 * @generated
 */
public interface MetamodelInheritance2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelInheritance2Factory eINSTANCE = MetamodelInheritance2.impl.MetamodelInheritance2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Child A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child A</em>'.
	 * @generated
	 */
	ChildA createChildA();

	/**
	 * Returns a new object of class '<em>Child B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child B</em>'.
	 * @generated
	 */
	ChildB createChildB();

	/**
	 * Returns a new object of class '<em>Child Containee D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Containee D</em>'.
	 * @generated
	 */
	ChildContaineeD createChildContaineeD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelInheritance2Package getMetamodelInheritance2Package();

} //MetamodelInheritance2Factory
