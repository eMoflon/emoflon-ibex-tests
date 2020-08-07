/**
 */
package simpleClassInheritance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleClassInheritance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleClassInheritanceFactoryImpl extends EFactoryImpl implements SimpleClassInheritanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleClassInheritanceFactory init() {
		try {
			SimpleClassInheritanceFactory theSimpleClassInheritanceFactory = (SimpleClassInheritanceFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimpleClassInheritancePackage.eNS_URI);
			if (theSimpleClassInheritanceFactory != null) {
				return theSimpleClassInheritanceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleClassInheritanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClassInheritanceFactoryImpl() {
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
		case SimpleClassInheritancePackage.CLAZZ:
			return createClazz();
		case SimpleClassInheritancePackage.FIELD:
			return createField();
		case SimpleClassInheritancePackage.METHOD:
			return createMethod();
		case SimpleClassInheritancePackage.PARAMETER:
			return createParameter();
		case SimpleClassInheritancePackage.CLAZZ_CONTAINER:
			return createClazzContainer();
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
	public Clazz createClazz() {
		ClazzImpl clazz = new ClazzImpl();
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClazzContainer createClazzContainer() {
		ClazzContainerImpl clazzContainer = new ClazzContainerImpl();
		return clazzContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleClassInheritancePackage getSimpleClassInheritancePackage() {
		return (SimpleClassInheritancePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleClassInheritancePackage getPackage() {
		return SimpleClassInheritancePackage.eINSTANCE;
	}

} //SimpleClassInheritanceFactoryImpl
