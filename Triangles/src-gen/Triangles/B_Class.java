/**
 */
package Triangles;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Triangles.B_Class#getA <em>A</em>}</li>
 *   <li>{@link Triangles.B_Class#getC <em>C</em>}</li>
 * </ul>
 *
 * @see Triangles.TrianglesPackage#getB_Class()
 * @model
 * @generated
 */
public interface B_Class extends AbstractClass {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference list.
	 * The list contents are of type {@link Triangles.A_Class}.
	 * It is bidirectional and its opposite is '{@link Triangles.A_Class#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference list.
	 * @see Triangles.TrianglesPackage#getB_Class_A()
	 * @see Triangles.A_Class#getB
	 * @model opposite="b"
	 * @generated
	 */
	EList<A_Class> getA();

	/**
	 * Returns the value of the '<em><b>C</b></em>' reference list.
	 * The list contents are of type {@link Triangles.C_Class}.
	 * It is bidirectional and its opposite is '{@link Triangles.C_Class#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' reference list.
	 * @see Triangles.TrianglesPackage#getB_Class_C()
	 * @see Triangles.C_Class#getB
	 * @model opposite="b"
	 * @generated
	 */
	EList<C_Class> getC();

} // B_Class
