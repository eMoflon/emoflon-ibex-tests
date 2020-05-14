/**
 */
package MetamodelInheritance2.impl;

import MetamodelInheritance2.*;

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
public class MetamodelInheritance2FactoryImpl extends EFactoryImpl implements MetamodelInheritance2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelInheritance2Factory init() {
		try {
			MetamodelInheritance2Factory theMetamodelInheritance2Factory = (MetamodelInheritance2Factory) EPackage.Registry.INSTANCE
					.getEFactory(MetamodelInheritance2Package.eNS_URI);
			if (theMetamodelInheritance2Factory != null) {
				return theMetamodelInheritance2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelInheritance2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelInheritance2FactoryImpl() {
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
		case MetamodelInheritance2Package.CHILD_A:
			return createChildA();
		case MetamodelInheritance2Package.CHILD_B:
			return createChildB();
		case MetamodelInheritance2Package.CHILD_CONTAINEE_D:
			return createChildContaineeD();
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
	public ChildA createChildA() {
		ChildAImpl childA = new ChildAImpl();
		return childA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildB createChildB() {
		ChildBImpl childB = new ChildBImpl();
		return childB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildContaineeD createChildContaineeD() {
		ChildContaineeDImpl childContaineeD = new ChildContaineeDImpl();
		return childContaineeD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelInheritance2Package getMetamodelInheritance2Package() {
		return (MetamodelInheritance2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelInheritance2Package getPackage() {
		return MetamodelInheritance2Package.eINSTANCE;
	}

} //MetamodelInheritance2FactoryImpl
