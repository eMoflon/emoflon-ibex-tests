/**
 */
package Triangles;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Triangles.C_Class#getA <em>A</em>}</li>
 *   <li>{@link Triangles.C_Class#getB <em>B</em>}</li>
 * </ul>
 *
 * @see Triangles.TrianglesPackage#getC_Class()
 * @model
 * @generated
 */
public interface C_Class extends AbstractClass {
	/**
	 * Returns the value of the '<em><b>A</b></em>' reference list.
	 * The list contents are of type {@link Triangles.A_Class}.
	 * It is bidirectional and its opposite is '{@link Triangles.A_Class#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference list.
	 * @see Triangles.TrianglesPackage#getC_Class_A()
	 * @see Triangles.A_Class#getC
	 * @model opposite="c"
	 * @generated
	 */
	EList<A_Class> getA();

	/**
	 * Returns the value of the '<em><b>B</b></em>' reference list.
	 * The list contents are of type {@link Triangles.B_Class}.
	 * It is bidirectional and its opposite is '{@link Triangles.B_Class#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference list.
	 * @see Triangles.TrianglesPackage#getC_Class_B()
	 * @see Triangles.B_Class#getC
	 * @model opposite="c"
	 * @generated
	 */
	EList<B_Class> getB();

} // C_Class
