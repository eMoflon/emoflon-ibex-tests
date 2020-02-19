/**
 */
package Triangles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Triangles.Container#getA <em>A</em>}</li>
 *   <li>{@link Triangles.Container#getB <em>B</em>}</li>
 *   <li>{@link Triangles.Container#getC <em>C</em>}</li>
 *   <li>{@link Triangles.Container#getD <em>D</em>}</li>
 *   <li>{@link Triangles.Container#getE <em>E</em>}</li>
 * </ul>
 *
 * @see Triangles.TrianglesPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link Triangles.A_Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see Triangles.TrianglesPackage#getContainer_A()
	 * @model containment="true"
	 * @generated
	 */
	EList<A_Class> getA();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link Triangles.B_Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see Triangles.TrianglesPackage#getContainer_B()
	 * @model containment="true"
	 * @generated
	 */
	EList<B_Class> getB();

	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference list.
	 * The list contents are of type {@link Triangles.C_Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference list.
	 * @see Triangles.TrianglesPackage#getContainer_C()
	 * @model containment="true"
	 * @generated
	 */
	EList<C_Class> getC();

	/**
	 * Returns the value of the '<em><b>D</b></em>' containment reference list.
	 * The list contents are of type {@link Triangles.D_Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' containment reference list.
	 * @see Triangles.TrianglesPackage#getContainer_D()
	 * @model containment="true"
	 * @generated
	 */
	EList<D_Class> getD();

	/**
	 * Returns the value of the '<em><b>E</b></em>' containment reference list.
	 * The list contents are of type {@link Triangles.E_Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' containment reference list.
	 * @see Triangles.TrianglesPackage#getContainer_E()
	 * @model containment="true"
	 * @generated
	 */
	EList<E_Class> getE();

} // Container
