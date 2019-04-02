/**
 * Copyright (c) 2009 Ellidiss Technologies
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Arnaud Schach, arnaud.schach.com
 */
package org.topcased.adele.model.ADELE_Features.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.topcased.adele.model.ADELE_Features.*;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.AbstractFeature;
import org.topcased.adele.model.ADELE_Features.BusAccess;
import org.topcased.adele.model.ADELE_Features.DataAccess;
import org.topcased.adele.model.ADELE_Features.DataPort;
import org.topcased.adele.model.ADELE_Features.EventDataPort;
import org.topcased.adele.model.ADELE_Features.EventPort;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.ADELE_Features.Parameter;
import org.topcased.adele.model.ADELE_Features.SubprogramAccess;
import org.topcased.adele.model.ADELE_Features.SubprogramGroupAccess;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage
 * @generated
 */
public class ADELE_FeaturesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ADELE_FeaturesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_FeaturesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ADELE_FeaturesPackage.eINSTANCE;
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
	protected ADELE_FeaturesSwitch<Adapter> modelSwitch =
		new ADELE_FeaturesSwitch<Adapter>() {
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseAccess(Access object) {
				return createAccessAdapter();
			}
			@Override
			public Adapter caseDirectedFeature(DirectedFeature object) {
				return createDirectedFeatureAdapter();
			}
			@Override
			public Adapter caseBusAccess(BusAccess object) {
				return createBusAccessAdapter();
			}
			@Override
			public Adapter caseDataAccess(DataAccess object) {
				return createDataAccessAdapter();
			}
			@Override
			public Adapter caseSubprogramAccess(SubprogramAccess object) {
				return createSubprogramAccessAdapter();
			}
			@Override
			public Adapter caseSubprogramGroupAccess(SubprogramGroupAccess object) {
				return createSubprogramGroupAccessAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseFeatureGroup(FeatureGroup object) {
				return createFeatureGroupAdapter();
			}
			@Override
			public Adapter caseEventPort(EventPort object) {
				return createEventPortAdapter();
			}
			@Override
			public Adapter caseDataPort(DataPort object) {
				return createDataPortAdapter();
			}
			@Override
			public Adapter caseEventDataPort(EventDataPort object) {
				return createEventDataPortAdapter();
			}
			@Override
			public Adapter caseAbstractFeature(AbstractFeature object) {
				return createAbstractFeatureAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.BusAccess <em>Bus Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.BusAccess
	 * @generated
	 */
	public Adapter createBusAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.DataAccess <em>Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.DataAccess
	 * @generated
	 */
	public Adapter createDataAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.FeatureGroup
	 * @generated
	 */
	public Adapter createFeatureGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.EventPort <em>Event Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.EventPort
	 * @generated
	 */
	public Adapter createEventPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.DataPort
	 * @generated
	 */
	public Adapter createDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.EventDataPort <em>Event Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.EventDataPort
	 * @generated
	 */
	public Adapter createEventDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.Access
	 * @generated
	 */
	public Adapter createAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.DirectedFeature <em>Directed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.DirectedFeature
	 * @generated
	 */
	public Adapter createDirectedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.SubprogramAccess <em>Subprogram Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.SubprogramAccess
	 * @generated
	 */
	public Adapter createSubprogramAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.SubprogramGroupAccess <em>Subprogram Group Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.SubprogramGroupAccess
	 * @generated
	 */
	public Adapter createSubprogramGroupAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Features.AbstractFeature <em>Abstract Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Features.AbstractFeature
	 * @generated
	 */
	public Adapter createAbstractFeatureAdapter() {
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

} //ADELE_FeaturesAdapterFactory
