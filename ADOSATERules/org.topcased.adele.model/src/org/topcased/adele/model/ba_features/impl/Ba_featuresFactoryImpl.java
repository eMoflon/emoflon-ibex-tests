/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_featuresFactoryImpl.java,v 1.1 2012-03-01 09:19:12 aschach Exp $
 */
package org.topcased.adele.model.ba_features.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.topcased.adele.model.ba_features.BAVariable;
import org.topcased.adele.model.ba_features.Ba_featuresFactory;
import org.topcased.adele.model.ba_features.Ba_featuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ba_featuresFactoryImpl extends EFactoryImpl implements Ba_featuresFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ba_featuresFactory init() {
		try {
			Ba_featuresFactory theBa_featuresFactory = (Ba_featuresFactory)EPackage.Registry.INSTANCE.getEFactory(Ba_featuresPackage.eNS_URI);
			if (theBa_featuresFactory != null) {
				return theBa_featuresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ba_featuresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_featuresFactoryImpl() {
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
			case Ba_featuresPackage.BA_VARIABLE: return createBAVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAVariable createBAVariable() {
		BAVariableImpl baVariable = new BAVariableImpl();
		return baVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_featuresPackage getBa_featuresPackage() {
		return (Ba_featuresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ba_featuresPackage getPackage() {
		return Ba_featuresPackage.eINSTANCE;
	}

} //Ba_featuresFactoryImpl
