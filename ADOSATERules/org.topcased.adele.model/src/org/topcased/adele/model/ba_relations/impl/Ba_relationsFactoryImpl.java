/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_relationsFactoryImpl.java,v 1.1 2012-03-01 09:19:12 aschach Exp $
 */
package org.topcased.adele.model.ba_relations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.topcased.adele.model.ba_relations.BATransition;
import org.topcased.adele.model.ba_relations.Ba_relationsFactory;
import org.topcased.adele.model.ba_relations.Ba_relationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ba_relationsFactoryImpl extends EFactoryImpl implements Ba_relationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ba_relationsFactory init() {
		try {
			Ba_relationsFactory theBa_relationsFactory = (Ba_relationsFactory)EPackage.Registry.INSTANCE.getEFactory(Ba_relationsPackage.eNS_URI);
			if (theBa_relationsFactory != null) {
				return theBa_relationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ba_relationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_relationsFactoryImpl() {
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
			case Ba_relationsPackage.BA_TRANSITION: return createBATransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BATransition createBATransition() {
		BATransitionImpl baTransition = new BATransitionImpl();
		return baTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_relationsPackage getBa_relationsPackage() {
		return (Ba_relationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ba_relationsPackage getPackage() {
		return Ba_relationsPackage.eINSTANCE;
	}

} //Ba_relationsFactoryImpl
