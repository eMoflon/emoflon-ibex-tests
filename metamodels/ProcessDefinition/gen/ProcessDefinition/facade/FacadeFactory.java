/**
 */
package ProcessDefinition.facade;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ProcessDefinition.facade.FacadePackage
 * @generated
 */
public interface FacadeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacadeFactory eINSTANCE = ProcessDefinition.facade.impl.FacadeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Helper</em>'.
	 * @generated
	 */
	Helper createHelper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FacadePackage getFacadePackage();

} //FacadeFactory
