/**
 */
package MetamodelInheritance.impl;

import MetamodelInheritance.*;

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
public class MetamodelInheritanceFactoryImpl extends EFactoryImpl implements MetamodelInheritanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelInheritanceFactory init() {
		try {
			MetamodelInheritanceFactory theMetamodelInheritanceFactory = (MetamodelInheritanceFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetamodelInheritancePackage.eNS_URI);
			if (theMetamodelInheritanceFactory != null) {
				return theMetamodelInheritanceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelInheritanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelInheritanceFactoryImpl() {
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
		case MetamodelInheritancePackage.BASE_CONTAINER:
			return createBaseContainer();
		case MetamodelInheritancePackage.BASE_CONTAINEE_A:
			return createBaseContaineeA();
		case MetamodelInheritancePackage.BASE_CONTAINEE_B:
			return createBaseContaineeB();
		case MetamodelInheritancePackage.BASE_CONTAINEE_C:
			return createBaseContaineeC();
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
	public BaseContainer createBaseContainer() {
		BaseContainerImpl baseContainer = new BaseContainerImpl();
		return baseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseContaineeA createBaseContaineeA() {
		BaseContaineeAImpl baseContaineeA = new BaseContaineeAImpl();
		return baseContaineeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseContaineeB createBaseContaineeB() {
		BaseContaineeBImpl baseContaineeB = new BaseContaineeBImpl();
		return baseContaineeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseContaineeC createBaseContaineeC() {
		BaseContaineeCImpl baseContaineeC = new BaseContaineeCImpl();
		return baseContaineeC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelInheritancePackage getMetamodelInheritancePackage() {
		return (MetamodelInheritancePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelInheritancePackage getPackage() {
		return MetamodelInheritancePackage.eINSTANCE;
	}

} //MetamodelInheritanceFactoryImpl
