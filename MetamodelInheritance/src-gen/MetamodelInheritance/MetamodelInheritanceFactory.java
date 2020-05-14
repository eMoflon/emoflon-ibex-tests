/**
 */
package MetamodelInheritance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MetamodelInheritance.MetamodelInheritancePackage
 * @generated
 */
public interface MetamodelInheritanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelInheritanceFactory eINSTANCE = MetamodelInheritance.impl.MetamodelInheritanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Base Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Container</em>'.
	 * @generated
	 */
	BaseContainer createBaseContainer();

	/**
	 * Returns a new object of class '<em>Base Containee A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Containee A</em>'.
	 * @generated
	 */
	BaseContaineeA createBaseContaineeA();

	/**
	 * Returns a new object of class '<em>Base Containee B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Containee B</em>'.
	 * @generated
	 */
	BaseContaineeB createBaseContaineeB();

	/**
	 * Returns a new object of class '<em>Base Containee C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Containee C</em>'.
	 * @generated
	 */
	BaseContaineeC createBaseContaineeC();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelInheritancePackage getMetamodelInheritancePackage();

} //MetamodelInheritanceFactory
