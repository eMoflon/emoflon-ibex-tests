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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage
 * @generated
 */
public class ADELE_FeaturesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ADELE_FeaturesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_FeaturesSwitch() {
		if (modelPackage == null) {
			modelPackage = ADELE_FeaturesPackage.eINSTANCE;
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
			case ADELE_FeaturesPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseSKFeature(feature);
				if (result == null) result = caseSKHierarchicalObject(feature);
				if (result == null) result = caseSKObject(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.ACCESS: {
				Access access = (Access)theEObject;
				T result = caseAccess(access);
				if (result == null) result = caseFeature(access);
				if (result == null) result = caseSKFeature(access);
				if (result == null) result = caseSKHierarchicalObject(access);
				if (result == null) result = caseSKObject(access);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.DIRECTED_FEATURE: {
				DirectedFeature directedFeature = (DirectedFeature)theEObject;
				T result = caseDirectedFeature(directedFeature);
				if (result == null) result = caseFeature(directedFeature);
				if (result == null) result = caseSKFeature(directedFeature);
				if (result == null) result = caseSKHierarchicalObject(directedFeature);
				if (result == null) result = caseSKObject(directedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.BUS_ACCESS: {
				BusAccess busAccess = (BusAccess)theEObject;
				T result = caseBusAccess(busAccess);
				if (result == null) result = caseAccess(busAccess);
				if (result == null) result = caseFeature(busAccess);
				if (result == null) result = caseSKFeature(busAccess);
				if (result == null) result = caseSKHierarchicalObject(busAccess);
				if (result == null) result = caseSKObject(busAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.DATA_ACCESS: {
				DataAccess dataAccess = (DataAccess)theEObject;
				T result = caseDataAccess(dataAccess);
				if (result == null) result = caseAccess(dataAccess);
				if (result == null) result = caseFeature(dataAccess);
				if (result == null) result = caseSKFeature(dataAccess);
				if (result == null) result = caseSKHierarchicalObject(dataAccess);
				if (result == null) result = caseSKObject(dataAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.SUBPROGRAM_ACCESS: {
				SubprogramAccess subprogramAccess = (SubprogramAccess)theEObject;
				T result = caseSubprogramAccess(subprogramAccess);
				if (result == null) result = caseAccess(subprogramAccess);
				if (result == null) result = caseFeature(subprogramAccess);
				if (result == null) result = caseSKFeature(subprogramAccess);
				if (result == null) result = caseSKHierarchicalObject(subprogramAccess);
				if (result == null) result = caseSKObject(subprogramAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.SUBPROGRAM_GROUP_ACCESS: {
				SubprogramGroupAccess subprogramGroupAccess = (SubprogramGroupAccess)theEObject;
				T result = caseSubprogramGroupAccess(subprogramGroupAccess);
				if (result == null) result = caseAccess(subprogramGroupAccess);
				if (result == null) result = caseFeature(subprogramGroupAccess);
				if (result == null) result = caseSKFeature(subprogramGroupAccess);
				if (result == null) result = caseSKHierarchicalObject(subprogramGroupAccess);
				if (result == null) result = caseSKObject(subprogramGroupAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseDirectedFeature(parameter);
				if (result == null) result = caseFeature(parameter);
				if (result == null) result = caseSKFeature(parameter);
				if (result == null) result = caseSKHierarchicalObject(parameter);
				if (result == null) result = caseSKObject(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.FEATURE_GROUP: {
				FeatureGroup featureGroup = (FeatureGroup)theEObject;
				T result = caseFeatureGroup(featureGroup);
				if (result == null) result = caseDirectedFeature(featureGroup);
				if (result == null) result = caseSKComponent(featureGroup);
				if (result == null) result = caseFeature(featureGroup);
				if (result == null) result = caseSKFeature(featureGroup);
				if (result == null) result = caseSKHierarchicalObject(featureGroup);
				if (result == null) result = caseSKObject(featureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.EVENT_PORT: {
				EventPort eventPort = (EventPort)theEObject;
				T result = caseEventPort(eventPort);
				if (result == null) result = caseDirectedFeature(eventPort);
				if (result == null) result = caseFeature(eventPort);
				if (result == null) result = caseSKFeature(eventPort);
				if (result == null) result = caseSKHierarchicalObject(eventPort);
				if (result == null) result = caseSKObject(eventPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.DATA_PORT: {
				DataPort dataPort = (DataPort)theEObject;
				T result = caseDataPort(dataPort);
				if (result == null) result = caseDirectedFeature(dataPort);
				if (result == null) result = caseFeature(dataPort);
				if (result == null) result = caseSKFeature(dataPort);
				if (result == null) result = caseSKHierarchicalObject(dataPort);
				if (result == null) result = caseSKObject(dataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.EVENT_DATA_PORT: {
				EventDataPort eventDataPort = (EventDataPort)theEObject;
				T result = caseEventDataPort(eventDataPort);
				if (result == null) result = caseDirectedFeature(eventDataPort);
				if (result == null) result = caseFeature(eventDataPort);
				if (result == null) result = caseSKFeature(eventDataPort);
				if (result == null) result = caseSKHierarchicalObject(eventDataPort);
				if (result == null) result = caseSKObject(eventDataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_FeaturesPackage.ABSTRACT_FEATURE: {
				AbstractFeature abstractFeature = (AbstractFeature)theEObject;
				T result = caseAbstractFeature(abstractFeature);
				if (result == null) result = caseDirectedFeature(abstractFeature);
				if (result == null) result = caseFeature(abstractFeature);
				if (result == null) result = caseSKFeature(abstractFeature);
				if (result == null) result = caseSKHierarchicalObject(abstractFeature);
				if (result == null) result = caseSKObject(abstractFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusAccess(BusAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccess(DataAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureGroup(FeatureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventPort(EventPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPort(DataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDataPort(EventDataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccess(Access object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedFeature(DirectedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramAccess(SubprogramAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Group Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Group Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramGroupAccess(SubprogramGroupAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeature(AbstractFeature object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SK Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SK Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSKFeature(SKFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SK Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SK Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSKComponent(SKComponent object) {
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

} //ADELE_FeaturesSwitch
