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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection;
import org.topcased.adele.model.ADELE_Relations.AccessConnection;
import org.topcased.adele.model.ADELE_Relations.BusAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataPortConnection;
import org.topcased.adele.model.ADELE_Relations.DirectedFeatureConnection;
import org.topcased.adele.model.ADELE_Relations.EventDataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventPortConnection;
import org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection;
import org.topcased.adele.model.ADELE_Relations.ParameterConnection;
import org.topcased.adele.model.ADELE_Relations.Relation;
import org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection;
import org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.KernelSpices.SKRelation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage
 * @generated
 */
public class ADELE_RelationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ADELE_RelationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_RelationsSwitch() {
		if (modelPackage == null) {
			modelPackage = ADELE_RelationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ADELE_RelationsPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseSKRelation(relation);
				if (result == null) result = caseSKHierarchicalObject(relation);
				if (result == null) result = caseSKObject(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.ACCESS_CONNECTION: {
				AccessConnection accessConnection = (AccessConnection)theEObject;
				T result = caseAccessConnection(accessConnection);
				if (result == null) result = caseRelation(accessConnection);
				if (result == null) result = caseSKRelation(accessConnection);
				if (result == null) result = caseSKHierarchicalObject(accessConnection);
				if (result == null) result = caseSKObject(accessConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.DIRECTED_FEATURE_CONNECTION: {
				DirectedFeatureConnection directedFeatureConnection = (DirectedFeatureConnection)theEObject;
				T result = caseDirectedFeatureConnection(directedFeatureConnection);
				if (result == null) result = caseRelation(directedFeatureConnection);
				if (result == null) result = caseSKRelation(directedFeatureConnection);
				if (result == null) result = caseSKHierarchicalObject(directedFeatureConnection);
				if (result == null) result = caseSKObject(directedFeatureConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.BUS_ACCESS_CONNECTION: {
				BusAccessConnection busAccessConnection = (BusAccessConnection)theEObject;
				T result = caseBusAccessConnection(busAccessConnection);
				if (result == null) result = caseAccessConnection(busAccessConnection);
				if (result == null) result = caseRelation(busAccessConnection);
				if (result == null) result = caseSKRelation(busAccessConnection);
				if (result == null) result = caseSKHierarchicalObject(busAccessConnection);
				if (result == null) result = caseSKObject(busAccessConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.DATA_ACCESS_CONNECTION: {
				DataAccessConnection dataAccessConnection = (DataAccessConnection)theEObject;
				T result = caseDataAccessConnection(dataAccessConnection);
				if (result == null) result = caseAccessConnection(dataAccessConnection);
				if (result == null) result = caseRelation(dataAccessConnection);
				if (result == null) result = caseSKRelation(dataAccessConnection);
				if (result == null) result = caseSKHierarchicalObject(dataAccessConnection);
				if (result == null) result = caseSKObject(dataAccessConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.SUBPROGRAM_ACCESS_CONNECTION: {
				SubprogramAccessConnection subprogramAccessConnection = (SubprogramAccessConnection)theEObject;
				T result = caseSubprogramAccessConnection(subprogramAccessConnection);
				if (result == null) result = caseAccessConnection(subprogramAccessConnection);
				if (result == null) result = caseRelation(subprogramAccessConnection);
				if (result == null) result = caseSKRelation(subprogramAccessConnection);
				if (result == null) result = caseSKHierarchicalObject(subprogramAccessConnection);
				if (result == null) result = caseSKObject(subprogramAccessConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.SUBPROGRAM_GROUP_ACCESS_CONNECTION: {
				SubprogramGroupAccessConnection subprogramGroupAccessConnection = (SubprogramGroupAccessConnection)theEObject;
				T result = caseSubprogramGroupAccessConnection(subprogramGroupAccessConnection);
				if (result == null) result = caseAccessConnection(subprogramGroupAccessConnection);
				if (result == null) result = caseRelation(subprogramGroupAccessConnection);
				if (result == null) result = caseSKRelation(subprogramGroupAccessConnection);
				if (result == null) result = caseSKHierarchicalObject(subprogramGroupAccessConnection);
				if (result == null) result = caseSKObject(subprogramGroupAccessConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.EVENT_PORT_CONNECTION: {
				EventPortConnection eventPortConnection = (EventPortConnection)theEObject;
				T result = caseEventPortConnection(eventPortConnection);
				if (result == null) result = caseDirectedFeatureConnection(eventPortConnection);
				if (result == null) result = caseRelation(eventPortConnection);
				if (result == null) result = caseSKRelation(eventPortConnection);
				if (result == null) result = caseSKHierarchicalObject(eventPortConnection);
				if (result == null) result = caseSKObject(eventPortConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.DATA_PORT_CONNECTION: {
				DataPortConnection dataPortConnection = (DataPortConnection)theEObject;
				T result = caseDataPortConnection(dataPortConnection);
				if (result == null) result = caseDirectedFeatureConnection(dataPortConnection);
				if (result == null) result = caseRelation(dataPortConnection);
				if (result == null) result = caseSKRelation(dataPortConnection);
				if (result == null) result = caseSKHierarchicalObject(dataPortConnection);
				if (result == null) result = caseSKObject(dataPortConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.EVENT_DATA_PORT_CONNECTION: {
				EventDataPortConnection eventDataPortConnection = (EventDataPortConnection)theEObject;
				T result = caseEventDataPortConnection(eventDataPortConnection);
				if (result == null) result = caseDirectedFeatureConnection(eventDataPortConnection);
				if (result == null) result = caseRelation(eventDataPortConnection);
				if (result == null) result = caseSKRelation(eventDataPortConnection);
				if (result == null) result = caseSKHierarchicalObject(eventDataPortConnection);
				if (result == null) result = caseSKObject(eventDataPortConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.PARAMETER_CONNECTION: {
				ParameterConnection parameterConnection = (ParameterConnection)theEObject;
				T result = caseParameterConnection(parameterConnection);
				if (result == null) result = caseDirectedFeatureConnection(parameterConnection);
				if (result == null) result = caseRelation(parameterConnection);
				if (result == null) result = caseSKRelation(parameterConnection);
				if (result == null) result = caseSKHierarchicalObject(parameterConnection);
				if (result == null) result = caseSKObject(parameterConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.ABSTRACT_FEATURE_CONNECTION: {
				AbstractFeatureConnection abstractFeatureConnection = (AbstractFeatureConnection)theEObject;
				T result = caseAbstractFeatureConnection(abstractFeatureConnection);
				if (result == null) result = caseDirectedFeatureConnection(abstractFeatureConnection);
				if (result == null) result = caseRelation(abstractFeatureConnection);
				if (result == null) result = caseSKRelation(abstractFeatureConnection);
				if (result == null) result = caseSKHierarchicalObject(abstractFeatureConnection);
				if (result == null) result = caseSKObject(abstractFeatureConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_RelationsPackage.FEATURE_GROUP_CONNECTION: {
				FeatureGroupConnection featureGroupConnection = (FeatureGroupConnection)theEObject;
				T result = caseFeatureGroupConnection(featureGroupConnection);
				if (result == null) result = caseDirectedFeatureConnection(featureGroupConnection);
				if (result == null) result = caseRelation(featureGroupConnection);
				if (result == null) result = caseSKRelation(featureGroupConnection);
				if (result == null) result = caseSKHierarchicalObject(featureGroupConnection);
				if (result == null) result = caseSKObject(featureGroupConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Access Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusAccessConnection(BusAccessConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccessConnection(DataAccessConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Port Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Port Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventPortConnection(EventPortConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Port Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Port Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPortConnection(DataPortConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Data Port Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Data Port Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDataPortConnection(EventDataPortConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessConnection(AccessConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Feature Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Feature Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedFeatureConnection(DirectedFeatureConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Access Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramAccessConnection(SubprogramAccessConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConnection(ParameterConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Group Access Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Group Access Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramGroupAccessConnection(SubprogramGroupAccessConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureConnection(AbstractFeatureConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Group Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Group Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureGroupConnection(FeatureGroupConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SK Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SK Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSKObject(SKObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SK Hierarchical Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SK Hierarchical Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSKHierarchicalObject(SKHierarchicalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SK Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SK Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSKRelation(SKRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ADELE_RelationsSwitch
