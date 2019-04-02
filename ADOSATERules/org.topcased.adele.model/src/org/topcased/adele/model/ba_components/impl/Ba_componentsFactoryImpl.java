/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_componentsFactoryImpl.java,v 1.2 2012-03-16 08:07:02 aschach Exp $
 */
package org.topcased.adele.model.ba_components.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.topcased.adele.model.ba_components.*;
import org.topcased.adele.model.ba_components.BAState;
import org.topcased.adele.model.ba_components.Ba_componentsFactory;
import org.topcased.adele.model.ba_components.Ba_componentsPackage;
import org.topcased.adele.model.ba_components.BehaviorAnnex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ba_componentsFactoryImpl extends EFactoryImpl implements Ba_componentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ba_componentsFactory init() {
		try {
			Ba_componentsFactory theBa_componentsFactory = (Ba_componentsFactory)EPackage.Registry.INSTANCE.getEFactory(Ba_componentsPackage.eNS_URI);
			if (theBa_componentsFactory != null) {
				return theBa_componentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ba_componentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_componentsFactoryImpl() {
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
			case Ba_componentsPackage.BEHAVIOR_ANNEX: return createBehaviorAnnex();
			case Ba_componentsPackage.BA_STATE: return createBAState();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Ba_componentsPackage.BA_STATE_KIND:
				return createBAStateKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Ba_componentsPackage.BA_STATE_KIND:
				return convertBAStateKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorAnnex createBehaviorAnnex() {
		BehaviorAnnexImpl behaviorAnnex = new BehaviorAnnexImpl();
		return behaviorAnnex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAState createBAState() {
		BAStateImpl baState = new BAStateImpl();
		return baState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAStateKind createBAStateKindFromString(EDataType eDataType, String initialValue) {
		BAStateKind result = BAStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBAStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_componentsPackage getBa_componentsPackage() {
		return (Ba_componentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ba_componentsPackage getPackage() {
		return Ba_componentsPackage.eINSTANCE;
	}

} //Ba_componentsFactoryImpl
