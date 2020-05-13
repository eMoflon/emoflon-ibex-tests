/**
 */
package MetamodelInheritance3.impl;

import MetamodelInheritance3.*;

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
public class MetamodelInheritance3FactoryImpl extends EFactoryImpl implements MetamodelInheritance3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelInheritance3Factory init() {
		try {
			MetamodelInheritance3Factory theMetamodelInheritance3Factory = (MetamodelInheritance3Factory) EPackage.Registry.INSTANCE
					.getEFactory(MetamodelInheritance3Package.eNS_URI);
			if (theMetamodelInheritance3Factory != null) {
				return theMetamodelInheritance3Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelInheritance3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelInheritance3FactoryImpl() {
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
		case MetamodelInheritance3Package.CHILD_C:
			return createChildC();
		case MetamodelInheritance3Package.CHILD_D:
			return createChildD();
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
	public ChildC createChildC() {
		ChildCImpl childC = new ChildCImpl();
		return childC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildD createChildD() {
		ChildDImpl childD = new ChildDImpl();
		return childD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelInheritance3Package getMetamodelInheritance3Package() {
		return (MetamodelInheritance3Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelInheritance3Package getPackage() {
		return MetamodelInheritance3Package.eINSTANCE;
	}

} //MetamodelInheritance3FactoryImpl
