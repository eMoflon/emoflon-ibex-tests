/**
 */
package classMultipleInheritanceHierarchy.impl;

import classMultipleInheritanceHierarchy.*;

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
public class ClassMultipleInheritanceHierarchyFactoryImpl extends EFactoryImpl
		implements ClassMultipleInheritanceHierarchyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassMultipleInheritanceHierarchyFactory init() {
		try {
			ClassMultipleInheritanceHierarchyFactory theClassMultipleInheritanceHierarchyFactory = (ClassMultipleInheritanceHierarchyFactory) EPackage.Registry.INSTANCE
					.getEFactory(ClassMultipleInheritanceHierarchyPackage.eNS_URI);
			if (theClassMultipleInheritanceHierarchyFactory != null) {
				return theClassMultipleInheritanceHierarchyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassMultipleInheritanceHierarchyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMultipleInheritanceHierarchyFactoryImpl() {
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
		case ClassMultipleInheritanceHierarchyPackage.ATTRIBUTE:
			return createAttribute();
		case ClassMultipleInheritanceHierarchyPackage.CLASS_PACKAGE:
			return createClassPackage();
		case ClassMultipleInheritanceHierarchyPackage.CLAZZ:
			return createClazz();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassPackage createClassPackage() {
		ClassPackageImpl classPackage = new ClassPackageImpl();
		return classPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz createClazz() {
		ClazzImpl clazz = new ClazzImpl();
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMultipleInheritanceHierarchyPackage getClassMultipleInheritanceHierarchyPackage() {
		return (ClassMultipleInheritanceHierarchyPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassMultipleInheritanceHierarchyPackage getPackage() {
		return ClassMultipleInheritanceHierarchyPackage.eINSTANCE;
	}

} //ClassMultipleInheritanceHierarchyFactoryImpl
