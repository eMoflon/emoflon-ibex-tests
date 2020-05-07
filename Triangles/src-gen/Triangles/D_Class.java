/**
 */
package Triangles;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Triangles.D_Class#getA <em>A</em>}</li>
 * </ul>
 *
 * @see Triangles.TrianglesPackage#getD_Class()
 * @model
 * @generated
 */
public interface D_Class extends AbstractClass {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference list.
	 * The list contents are of type {@link Triangles.A_Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference list.
	 * @see Triangles.TrianglesPackage#getD_Class_A()
	 * @model
	 * @generated
	 */
	EList<A_Class> getA();

} // D_Class
