/**
 */
package Triangles.impl;

import Triangles.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrianglesFactoryImpl extends EFactoryImpl implements TrianglesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrianglesFactory init() {
		try {
			TrianglesFactory theTrianglesFactory = (TrianglesFactory) EPackage.Registry.INSTANCE
					.getEFactory(TrianglesPackage.eNS_URI);
			if (theTrianglesFactory != null) {
				return theTrianglesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TrianglesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrianglesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TrianglesPackage.CONTAINER:
			return createContainer();
		case TrianglesPackage.ACLASS:
			return createA_Class();
		case TrianglesPackage.BCLASS:
			return createB_Class();
		case TrianglesPackage.CCLASS:
			return createC_Class();
		case TrianglesPackage.ECLASS:
			return createE_Class();
		case TrianglesPackage.DCLASS:
			return createD_Class();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Triangles.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A_Class createA_Class() {
		A_ClassImpl a_Class = new A_ClassImpl();
		return a_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public B_Class createB_Class() {
		B_ClassImpl b_Class = new B_ClassImpl();
		return b_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public C_Class createC_Class() {
		C_ClassImpl c_Class = new C_ClassImpl();
		return c_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public E_Class createE_Class() {
		E_ClassImpl e_Class = new E_ClassImpl();
		return e_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public D_Class createD_Class() {
		D_ClassImpl d_Class = new D_ClassImpl();
		return d_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrianglesPackage getTrianglesPackage() {
		return (TrianglesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TrianglesPackage getPackage() {
		return TrianglesPackage.eINSTANCE;
	}

} //TrianglesFactoryImpl
