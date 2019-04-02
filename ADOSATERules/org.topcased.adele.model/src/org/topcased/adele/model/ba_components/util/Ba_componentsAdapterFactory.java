/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_componentsAdapterFactory.java,v 1.1 2012-03-01 09:19:15 aschach Exp $
 */
package org.topcased.adele.model.ba_components.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.ba_components.BAComponent;
import org.topcased.adele.model.ba_components.BAState;
import org.topcased.adele.model.ba_components.Ba_componentsPackage;
import org.topcased.adele.model.ba_components.BehaviorAnnex;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ba_components.Ba_componentsPackage
 * @generated
 */
public class Ba_componentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ba_componentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_componentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ba_componentsPackage.eINSTANCE;
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
	protected Ba_componentsSwitch<Adapter> modelSwitch =
		new Ba_componentsSwitch<Adapter>() {
			@Override
			public Adapter caseBehaviorAnnex(BehaviorAnnex object) {
				return createBehaviorAnnexAdapter();
			}
			@Override
			public Adapter caseBAState(BAState object) {
				return createBAStateAdapter();
			}
			@Override
			public Adapter caseBAComponent(BAComponent object) {
				return createBAComponentAdapter();
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
			public Adapter caseSKComponent(SKComponent object) {
				return createSKComponentAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ba_components.BehaviorAnnex <em>Behavior Annex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ba_components.BehaviorAnnex
	 * @generated
	 */
	public Adapter createBehaviorAnnexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ba_components.BAState <em>BA State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ba_components.BAState
	 * @generated
	 */
	public Adapter createBAStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ba_components.BAComponent <em>BA Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ba_components.BAComponent
	 * @generated
	 */
	public Adapter createBAComponentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.KernelSpices.SKComponent <em>SK Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.KernelSpices.SKComponent
	 * @generated
	 */
	public Adapter createSKComponentAdapter() {
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

} //Ba_componentsAdapterFactory
