/**
 */
package glossarDocumentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see glossarDocumentation.GlossarDocumentationPackage
 * @generated
 */
public interface GlossarDocumentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlossarDocumentationFactory eINSTANCE = glossarDocumentation.impl.GlossarDocumentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Glossar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossar</em>'.
	 * @generated
	 */
	Glossar createGlossar();

	/**
	 * Returns a new object of class '<em>Glossar Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossar Entry</em>'.
	 * @generated
	 */
	GlossarEntry createGlossarEntry();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Documentation Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation Container</em>'.
	 * @generated
	 */
	DocumentationContainer createDocumentationContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GlossarDocumentationPackage getGlossarDocumentationPackage();

} //GlossarDocumentationFactory
