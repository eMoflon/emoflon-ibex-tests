/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ba_componentsSwitch.java,v 1.1 2012-03-01 09:19:15 aschach Exp $
 */
package org.topcased.adele.model.ba_components.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.ba_components.BAComponent;
import org.topcased.adele.model.ba_components.BAState;
import org.topcased.adele.model.ba_components.Ba_componentsPackage;
import org.topcased.adele.model.ba_components.BehaviorAnnex;

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
 * @see org.topcased.adele.model.ba_components.Ba_componentsPackage
 * @generated
 */
public class Ba_componentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ba_componentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ba_componentsSwitch() {
		if (modelPackage == null) {
			modelPackage = Ba_componentsPackage.eINSTANCE;
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
			case Ba_componentsPackage.BEHAVIOR_ANNEX: {
				BehaviorAnnex behaviorAnnex = (BehaviorAnnex)theEObject;
				T result = caseBehaviorAnnex(behaviorAnnex);
				if (result == null) result = caseBAComponent(behaviorAnnex);
				if (result == null) result = caseSKComponent(behaviorAnnex);
				if (result == null) result = caseSKHierarchicalObject(behaviorAnnex);
				if (result == null) result = caseSKObject(behaviorAnnex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ba_componentsPackage.BA_STATE: {
				BAState baState = (BAState)theEObject;
				T result = caseBAState(baState);
				if (result == null) result = caseBAComponent(baState);
				if (result == null) result = caseSKComponent(baState);
				if (result == null) result = caseSKHierarchicalObject(baState);
				if (result == null) result = caseSKObject(baState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ba_componentsPackage.BA_COMPONENT: {
				BAComponent baComponent = (BAComponent)theEObject;
				T result = caseBAComponent(baComponent);
				if (result == null) result = caseSKComponent(baComponent);
				if (result == null) result = caseSKHierarchicalObject(baComponent);
				if (result == null) result = caseSKObject(baComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Annex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Annex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorAnnex(BehaviorAnnex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BA State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BA State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAState(BAState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BA Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BA Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAComponent(BAComponent object) {
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

} //Ba_componentsSwitch
