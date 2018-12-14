/**
 */
package Java2Doc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Java2Doc.Java2DocPackage
 * @generated
 */
public interface Java2DocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Java2DocFactory eINSTANCE = Java2Doc.impl.Java2DocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Package2 Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package2 Folder</em>'.
	 * @generated
	 */
	Package2Folder createPackage2Folder();

	/**
	 * Returns a new object of class '<em>Class2 Doc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class2 Doc</em>'.
	 * @generated
	 */
	Class2Doc createClass2Doc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Java2DocPackage getJava2DocPackage();

} //Java2DocFactory
