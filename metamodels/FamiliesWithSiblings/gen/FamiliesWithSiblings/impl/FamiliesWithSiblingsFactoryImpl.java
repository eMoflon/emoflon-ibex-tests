/**
 */
package FamiliesWithSiblings.impl;

import FamiliesWithSiblings.*;

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
public class FamiliesWithSiblingsFactoryImpl extends EFactoryImpl implements FamiliesWithSiblingsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamiliesWithSiblingsFactory init() {
		try {
			FamiliesWithSiblingsFactory theFamiliesWithSiblingsFactory = (FamiliesWithSiblingsFactory) EPackage.Registry.INSTANCE
					.getEFactory(FamiliesWithSiblingsPackage.eNS_URI);
			if (theFamiliesWithSiblingsFactory != null) {
				return theFamiliesWithSiblingsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FamiliesWithSiblingsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesWithSiblingsFactoryImpl() {
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
		case FamiliesWithSiblingsPackage.FAMILY_REGISTER:
			return createFamilyRegister();
		case FamiliesWithSiblingsPackage.FAMILY:
			return createFamily();
		case FamiliesWithSiblingsPackage.FAMILY_MEMBER:
			return createFamilyMember();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyRegister createFamilyRegister() {
		FamilyRegisterImpl familyRegister = new FamilyRegisterImpl();
		return familyRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family createFamily() {
		FamilyImpl family = new FamilyImpl();
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMember createFamilyMember() {
		FamilyMemberImpl familyMember = new FamilyMemberImpl();
		return familyMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliesWithSiblingsPackage getFamiliesWithSiblingsPackage() {
		return (FamiliesWithSiblingsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FamiliesWithSiblingsPackage getPackage() {
		return FamiliesWithSiblingsPackage.eINSTANCE;
	}

} //FamiliesWithSiblingsFactoryImpl
