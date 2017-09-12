/**
 */
package FeatureModelSafe.impl;

import FeatureModelSafe.*;

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
public class FeatureModelSafeFactoryImpl extends EFactoryImpl implements FeatureModelSafeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureModelSafeFactory init() {
		try {
			FeatureModelSafeFactory theFeatureModelSafeFactory = (FeatureModelSafeFactory) EPackage.Registry.INSTANCE
					.getEFactory(FeatureModelSafePackage.eNS_URI);
			if (theFeatureModelSafeFactory != null) {
				return theFeatureModelSafeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureModelSafeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelSafeFactoryImpl() {
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
		case FeatureModelSafePackage.MODEL:
			return createModel();
		case FeatureModelSafePackage.FEATURE:
			return createFeature();
		case FeatureModelSafePackage.OR_GROUP:
			return createOrGroup();
		case FeatureModelSafePackage.XOR_GROUP:
			return createXorGroup();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrGroup createOrGroup() {
		OrGroupImpl orGroup = new OrGroupImpl();
		return orGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XorGroup createXorGroup() {
		XorGroupImpl xorGroup = new XorGroupImpl();
		return xorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelSafePackage getFeatureModelSafePackage() {
		return (FeatureModelSafePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeatureModelSafePackage getPackage() {
		return FeatureModelSafePackage.eINSTANCE;
	}

} //FeatureModelSafeFactoryImpl
