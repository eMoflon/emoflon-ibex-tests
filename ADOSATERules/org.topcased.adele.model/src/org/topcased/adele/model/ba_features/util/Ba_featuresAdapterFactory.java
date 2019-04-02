/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_featuresAdapterFactory.java,v 1.1 2012-03-01 09:19:14 aschach Exp $
 */
package org.topcased.adele.model.ba_features.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.ba_features.BAFeature;
import org.topcased.adele.model.ba_features.BAVariable;
import org.topcased.adele.model.ba_features.Ba_featuresPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ba_features.Ba_featuresPackage
 * @generated
 */
public class Ba_featuresAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ba_featuresPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_featuresAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ba_featuresPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ba_featuresSwitch<Adapter> modelSwitch =
		new Ba_featuresSwitch<Adapter>() {
			@Override
			public Adapter caseBAFeature(BAFeature object) {
				return createBAFeatureAdapter();
			}
			@Override
			public Adapter caseBAVariable(BAVariable object) {
				return createBAVariableAdapter();
			}
			@Override
			public Adapter caseSKObject(SKObject object) {
				return createSKObjectAdapter();
			}
			@Override
			public Adapter caseSKHierarchicalObject(SKHierarchicalObject object) {
				return createSKHierarchicalObjectAdapter();
			}
			@Override
			public Adapter caseSKFeature(SKFeature object) {
				return createSKFeatureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ba_features.BAFeature <em>BA Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ba_features.BAFeature
	 * @generated
	 */
	public Adapter createBAFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ba_features.BAVariable <em>BA Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ba_features.BAVariable
	 * @generated
	 */
	public Adapter createBAVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.KernelSpices.SKObject <em>SK Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.KernelSpices.SKObject
	 * @generated
	 */
	public Adapter createSKObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject <em>SK Hierarchical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject
	 * @generated
	 */
	public Adapter createSKHierarchicalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.KernelSpices.SKFeature <em>SK Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.KernelSpices.SKFeature
	 * @generated
	 */
	public Adapter createSKFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ba_featuresAdapterFactory
