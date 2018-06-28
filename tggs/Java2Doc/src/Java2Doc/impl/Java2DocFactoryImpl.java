/**
 */
package Java2Doc.impl;

import Java2Doc.*;

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
public class Java2DocFactoryImpl extends EFactoryImpl implements Java2DocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Java2DocFactory init() {
		try {
			Java2DocFactory theJava2DocFactory = (Java2DocFactory)EPackage.Registry.INSTANCE.getEFactory(Java2DocPackage.eNS_URI);
			if (theJava2DocFactory != null) {
				return theJava2DocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Java2DocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2DocFactoryImpl() {
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
			case Java2DocPackage.PACKAGE2_FOLDER: return createPackage2Folder();
			case Java2DocPackage.CLASS2_DOC: return createClass2Doc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package2Folder createPackage2Folder() {
		Package2FolderImpl package2Folder = new Package2FolderImpl();
		return package2Folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2Doc createClass2Doc() {
		Class2DocImpl class2Doc = new Class2DocImpl();
		return class2Doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2DocPackage getJava2DocPackage() {
		return (Java2DocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Java2DocPackage getPackage() {
		return Java2DocPackage.eINSTANCE;
	}

} //Java2DocFactoryImpl
