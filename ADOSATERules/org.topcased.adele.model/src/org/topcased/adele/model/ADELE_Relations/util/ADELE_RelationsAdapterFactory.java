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
package org.topcased.adele.model.ADELE_Relations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.topcased.adele.model.ADELE_Relations.*;
import org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection;
import org.topcased.adele.model.ADELE_Relations.BusAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventDataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventPortConnection;
import org.topcased.adele.model.ADELE_Relations.ParameterConnection;
import org.topcased.adele.model.ADELE_Relations.Relation;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection;
import org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.KernelSpices.SKRelation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage
 * @generated
 */
public class ADELE_RelationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ADELE_RelationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_RelationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ADELE_RelationsPackage.eINSTANCE;
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
	protected ADELE_RelationsSwitch<Adapter> modelSwitch =
		new ADELE_RelationsSwitch<Adapter>() {
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseAccessConnection(AccessConnection object) {
				return createAccessConnectionAdapter();
			}
			@Override
			public Adapter caseDirectedFeatureConnection(DirectedFeatureConnection object) {
				return createDirectedFeatureConnectionAdapter();
			}
			@Override
			public Adapter caseBusAccessConnection(BusAccessConnection object) {
				return createBusAccessConnectionAdapter();
			}
			@Override
			public Adapter caseDataAccessConnection(DataAccessConnection object) {
				return createDataAccessConnectionAdapter();
			}
			@Override
			public Adapter caseSubprogramAccessConnection(SubprogramAccessConnection object) {
				return createSubprogramAccessConnectionAdapter();
			}
			@Override
			public Adapter caseSubprogramGroupAccessConnection(SubprogramGroupAccessConnection object) {
				return createSubprogramGroupAccessConnectionAdapter();
			}
			@Override
			public Adapter caseEventPortConnection(EventPortConnection object) {
				return createEventPortConnectionAdapter();
			}
			@Override
			public Adapter caseDataPortConnection(DataPortConnection object) {
				return createDataPortConnectionAdapter();
			}
			@Override
			public Adapter caseEventDataPortConnection(EventDataPortConnection object) {
				return createEventDataPortConnectionAdapter();
			}
			@Override
			public Adapter caseParameterConnection(ParameterConnection object) {
				return createParameterConnectionAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureConnection(AbstractFeatureConnection object) {
				return createAbstractFeatureConnectionAdapter();
			}
			@Override
			public Adapter caseFeatureGroupConnection(FeatureGroupConnection object) {
				return createFeatureGroupConnectionAdapter();
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
			public Adapter caseSKRelation(SKRelation object) {
				return createSKRelationAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.BusAccessConnection <em>Bus Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.BusAccessConnection
	 * @generated
	 */
	public Adapter createBusAccessConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.DataAccessConnection <em>Data Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.DataAccessConnection
	 * @generated
	 */
	public Adapter createDataAccessConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.EventPortConnection <em>Event Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.EventPortConnection
	 * @generated
	 */
	public Adapter createEventPortConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.DataPortConnection <em>Data Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.DataPortConnection
	 * @generated
	 */
	public Adapter createDataPortConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.EventDataPortConnection <em>Event Data Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.EventDataPortConnection
	 * @generated
	 */
	public Adapter createEventDataPortConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.AccessConnection <em>Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.AccessConnection
	 * @generated
	 */
	public Adapter createAccessConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.DirectedFeatureConnection <em>Directed Feature Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.DirectedFeatureConnection
	 * @generated
	 */
	public Adapter createDirectedFeatureConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection <em>Subprogram Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection
	 * @generated
	 */
	public Adapter createSubprogramAccessConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.ParameterConnection <em>Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.ParameterConnection
	 * @generated
	 */
	public Adapter createParameterConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection <em>Subprogram Group Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection
	 * @generated
	 */
	public Adapter createSubprogramGroupAccessConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection <em>Abstract Feature Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection
	 * @generated
	 */
	public Adapter createAbstractFeatureConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection <em>Feature Group Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection
	 * @generated
	 */
	public Adapter createFeatureGroupConnectionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.topcased.adele.model.KernelSpices.SKRelation <em>SK Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.topcased.adele.model.KernelSpices.SKRelation
	 * @generated
	 */
	public Adapter createSKRelationAdapter() {
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

} //ADELE_RelationsAdapterFactory
