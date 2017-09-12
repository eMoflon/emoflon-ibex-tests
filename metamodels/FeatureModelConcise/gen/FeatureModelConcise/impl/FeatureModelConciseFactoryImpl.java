/**
 */
package FeatureModelConcise.impl;

import FeatureModelConcise.*;

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
public class FeatureModelConciseFactoryImpl extends EFactoryImpl implements FeatureModelConciseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureModelConciseFactory init() {
		try {
			FeatureModelConciseFactory theFeatureModelConciseFactory = (FeatureModelConciseFactory) EPackage.Registry.INSTANCE
					.getEFactory(FeatureModelConcisePackage.eNS_URI);
			if (theFeatureModelConciseFactory != null) {
				return theFeatureModelConciseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureModelConciseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelConciseFactoryImpl() {
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
		case FeatureModelConcisePackage.MODEL:
			return createModel();
		case FeatureModelConcisePackage.FEATURE:
			return createFeature();
		case FeatureModelConcisePackage.XOR_GROUP:
			return createXorGroup();
		case FeatureModelConcisePackage.OR_GROUP:
			return createOrGroup();
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
	public XorGroup createXorGroup() {
		XorGroupImpl xorGroup = new XorGroupImpl();
		return xorGroup;
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
	public FeatureModelConcisePackage getFeatureModelConcisePackage() {
		return (FeatureModelConcisePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeatureModelConcisePackage getPackage() {
		return FeatureModelConcisePackage.eINSTANCE;
	}

} //FeatureModelConciseFactoryImpl
