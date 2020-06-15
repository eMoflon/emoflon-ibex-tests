/**
 */
package Triangles;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Triangles.E_Class#getB <em>B</em>}</li>
 * </ul>
 *
 * @see Triangles.TrianglesPackage#getE_Class()
 * @model
 * @generated
 */
public interface E_Class extends AbstractClass {
	/**
	 * Returns the value of the '<em><b>B</b></em>' reference list.
	 * The list contents are of type {@link Triangles.B_Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference list.
	 * @see Triangles.TrianglesPackage#getE_Class_B()
	 * @model
	 * @generated
	 */
	EList<B_Class> getB();

} // E_Class
