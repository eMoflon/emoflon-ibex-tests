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
package org.topcased.adele.model.ADELE_Components.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage;
import org.topcased.adele.model.ADELE_Components.Abstract;
import org.topcased.adele.model.ADELE_Components.Bus;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Components.Data;
import org.topcased.adele.model.ADELE_Components.Device;
import org.topcased.adele.model.ADELE_Components.Memory;
import org.topcased.adele.model.ADELE_Components.Processor;
import org.topcased.adele.model.ADELE_Components.Subprogram;
import org.topcased.adele.model.ADELE_Components.SubprogramGroup;
import org.topcased.adele.model.ADELE_Components.VirtualBus;
import org.topcased.adele.model.ADELE_Components.VirtualProcessor;
import org.topcased.adele.model.KernelSpices.SKComponent;
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
 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage
 * @generated
 */
public class ADELE_ComponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ADELE_ComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_ComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ADELE_ComponentsPackage.eINSTANCE;
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
			case ADELE_ComponentsPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseSKComponent(component);
				if (result == null) result = caseSKHierarchicalObject(component);
				if (result == null) result = caseSKObject(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = caseComponent(bus);
				if (result == null) result = caseSKComponent(bus);
				if (result == null) result = caseSKHierarchicalObject(bus);
				if (result == null) result = caseSKObject(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.PACKAGE: {
				org.topcased.adele.model.ADELE_Components.Package package_ = (org.topcased.adele.model.ADELE_Components.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseComponent(package_);
				if (result == null) result = caseSKComponent(package_);
				if (result == null) result = caseSKHierarchicalObject(package_);
				if (result == null) result = caseSKObject(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseComponent(data);
				if (result == null) result = caseSKComponent(data);
				if (result == null) result = caseSKHierarchicalObject(data);
				if (result == null) result = caseSKObject(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseComponent(device);
				if (result == null) result = caseSKComponent(device);
				if (result == null) result = caseSKHierarchicalObject(device);
				if (result == null) result = caseSKObject(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T result = caseMemory(memory);
				if (result == null) result = caseComponent(memory);
				if (result == null) result = caseSKComponent(memory);
				if (result == null) result = caseSKHierarchicalObject(memory);
				if (result == null) result = caseSKObject(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.PROCESS: {
				org.topcased.adele.model.ADELE_Components.Process process = (org.topcased.adele.model.ADELE_Components.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseComponent(process);
				if (result == null) result = caseSKComponent(process);
				if (result == null) result = caseSKHierarchicalObject(process);
				if (result == null) result = caseSKObject(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = caseComponent(processor);
				if (result == null) result = caseSKComponent(processor);
				if (result == null) result = caseSKHierarchicalObject(processor);
				if (result == null) result = caseSKObject(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.SUBPROGRAM: {
				Subprogram subprogram = (Subprogram)theEObject;
				T result = caseSubprogram(subprogram);
				if (result == null) result = caseComponent(subprogram);
				if (result == null) result = caseSKComponent(subprogram);
				if (result == null) result = caseSKHierarchicalObject(subprogram);
				if (result == null) result = caseSKObject(subprogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.SYSTEM: {
				org.topcased.adele.model.ADELE_Components.System system = (org.topcased.adele.model.ADELE_Components.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseComponent(system);
				if (result == null) result = caseSKComponent(system);
				if (result == null) result = caseSKHierarchicalObject(system);
				if (result == null) result = caseSKObject(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.THREAD: {
				org.topcased.adele.model.ADELE_Components.Thread thread = (org.topcased.adele.model.ADELE_Components.Thread)theEObject;
				T result = caseThread(thread);
				if (result == null) result = caseComponent(thread);
				if (result == null) result = caseSKComponent(thread);
				if (result == null) result = caseSKHierarchicalObject(thread);
				if (result == null) result = caseSKObject(thread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.THREAD_GROUP: {
				org.topcased.adele.model.ADELE_Components.ThreadGroup threadGroup = (org.topcased.adele.model.ADELE_Components.ThreadGroup)theEObject;
				T result = caseThreadGroup(threadGroup);
				if (result == null) result = caseComponent(threadGroup);
				if (result == null) result = caseSKComponent(threadGroup);
				if (result == null) result = caseSKHierarchicalObject(threadGroup);
				if (result == null) result = caseSKObject(threadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.SUBPROGRAM_GROUP: {
				SubprogramGroup subprogramGroup = (SubprogramGroup)theEObject;
				T result = caseSubprogramGroup(subprogramGroup);
				if (result == null) result = caseComponent(subprogramGroup);
				if (result == null) result = caseSKComponent(subprogramGroup);
				if (result == null) result = caseSKHierarchicalObject(subprogramGroup);
				if (result == null) result = caseSKObject(subprogramGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.ABSTRACT: {
				Abstract abstract_ = (Abstract)theEObject;
				T result = caseAbstract(abstract_);
				if (result == null) result = caseComponent(abstract_);
				if (result == null) result = caseSKComponent(abstract_);
				if (result == null) result = caseSKHierarchicalObject(abstract_);
				if (result == null) result = caseSKObject(abstract_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.VIRTUAL_PROCESSOR: {
				VirtualProcessor virtualProcessor = (VirtualProcessor)theEObject;
				T result = caseVirtualProcessor(virtualProcessor);
				if (result == null) result = caseComponent(virtualProcessor);
				if (result == null) result = caseSKComponent(virtualProcessor);
				if (result == null) result = caseSKHierarchicalObject(virtualProcessor);
				if (result == null) result = caseSKObject(virtualProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ADELE_ComponentsPackage.VIRTUAL_BUS: {
				VirtualBus virtualBus = (VirtualBus)theEObject;
				T result = caseVirtualBus(virtualBus);
				if (result == null) result = caseComponent(virtualBus);
				if (result == null) result = caseSKComponent(virtualBus);
				if (result == null) result = caseSKHierarchicalObject(virtualBus);
				if (result == null) result = caseSKObject(virtualBus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.topcased.adele.model.ADELE_Components.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.topcased.adele.model.ADELE_Components.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogram(Subprogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.topcased.adele.model.ADELE_Components.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThread(org.topcased.adele.model.ADELE_Components.Thread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadGroup(org.topcased.adele.model.ADELE_Components.ThreadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramGroup(SubprogramGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstract(Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualProcessor(VirtualProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualBus(VirtualBus object) {
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

} //ADELE_ComponentsSwitch
