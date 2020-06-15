/**
 */
package Triangles;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Triangles.A_Class#getB <em>B</em>}</li>
 *   <li>{@link Triangles.A_Class#getC <em>C</em>}</li>
 * </ul>
 *
 * @see Triangles.TrianglesPackage#getA_Class()
 * @model
 * @generated
 */
public interface A_Class extends AbstractClass {
	/**
	 * Returns the value of the '<em><b>B</b></em>' reference list.
	 * The list contents are of type {@link Triangles.B_Class}.
	 * It is bidirectional and its opposite is '{@link Triangles.B_Class#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference list.
	 * @see Triangles.TrianglesPackage#getA_Class_B()
	 * @see Triangles.B_Class#getA
	 * @model opposite="a"
	 * @generated
	 */
	EList<B_Class> getB();

	/**
	 * Returns the value of the '<em><b>C</b></em>' reference list.
	 * The list contents are of type {@link Triangles.C_Class}.
	 * It is bidirectional and its opposite is '{@link Triangles.C_Class#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' reference list.
	 * @see Triangles.TrianglesPackage#getA_Class_C()
	 * @see Triangles.C_Class#getA
	 * @model opposite="a"
	 * @generated
	 */
	EList<C_Class> getC();

} // A_Class
