/**
 */
package Strategies;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Strategies.StrategiesPackage
 * @generated
 */
public interface StrategiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StrategiesFactory eINSTANCE = Strategies.impl.StrategiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Strategy Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy Container</em>'.
	 * @generated
	 */
	StrategyContainer createStrategyContainer();

	/**
	 * Returns a new object of class '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy</em>'.
	 * @generated
	 */
	Strategy createStrategy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StrategiesPackage getStrategiesPackage();

} //StrategiesFactory
