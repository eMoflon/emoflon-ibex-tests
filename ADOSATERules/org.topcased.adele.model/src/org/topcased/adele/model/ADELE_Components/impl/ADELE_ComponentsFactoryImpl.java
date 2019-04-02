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
package org.topcased.adele.model.ADELE_Components.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsFactory;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage;
import org.topcased.adele.model.ADELE_Components.Abstract;
import org.topcased.adele.model.ADELE_Components.Bus;
import org.topcased.adele.model.ADELE_Components.Data;
import org.topcased.adele.model.ADELE_Components.Device;
import org.topcased.adele.model.ADELE_Components.Memory;
import org.topcased.adele.model.ADELE_Components.Processor;
import org.topcased.adele.model.ADELE_Components.Subprogram;
import org.topcased.adele.model.ADELE_Components.SubprogramGroup;
import org.topcased.adele.model.ADELE_Components.VirtualBus;
import org.topcased.adele.model.ADELE_Components.VirtualProcessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADELE_ComponentsFactoryImpl extends EFactoryImpl implements ADELE_ComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ADELE_ComponentsFactory init() {
		try {
			ADELE_ComponentsFactory theADELE_ComponentsFactory = (ADELE_ComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(ADELE_ComponentsPackage.eNS_URI);
			if (theADELE_ComponentsFactory != null) {
				return theADELE_ComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ADELE_ComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_ComponentsFactoryImpl() {
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
			case ADELE_ComponentsPackage.BUS: return createBus();
			case ADELE_ComponentsPackage.PACKAGE: return createPackage();
			case ADELE_ComponentsPackage.DATA: return createData();
			case ADELE_ComponentsPackage.DEVICE: return createDevice();
			case ADELE_ComponentsPackage.MEMORY: return createMemory();
			case ADELE_ComponentsPackage.PROCESS: return createProcess();
			case ADELE_ComponentsPackage.PROCESSOR: return createProcessor();
			case ADELE_ComponentsPackage.SUBPROGRAM: return createSubprogram();
			case ADELE_ComponentsPackage.SYSTEM: return createSystem();
			case ADELE_ComponentsPackage.THREAD: return createThread();
			case ADELE_ComponentsPackage.THREAD_GROUP: return createThreadGroup();
			case ADELE_ComponentsPackage.SUBPROGRAM_GROUP: return createSubprogramGroup();
			case ADELE_ComponentsPackage.ABSTRACT: return createAbstract();
			case ADELE_ComponentsPackage.VIRTUAL_PROCESSOR: return createVirtualProcessor();
			case ADELE_ComponentsPackage.VIRTUAL_BUS: return createVirtualBus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.topcased.adele.model.ADELE_Components.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.topcased.adele.model.ADELE_Components.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subprogram createSubprogram() {
		SubprogramImpl subprogram = new SubprogramImpl();
		return subprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.topcased.adele.model.ADELE_Components.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.topcased.adele.model.ADELE_Components.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.topcased.adele.model.ADELE_Components.ThreadGroup createThreadGroup() {
		ThreadGroupImpl threadGroup = new ThreadGroupImpl();
		return threadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramGroup createSubprogramGroup() {
		SubprogramGroupImpl subprogramGroup = new SubprogramGroupImpl();
		return subprogramGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstract createAbstract() {
		AbstractImpl abstract_ = new AbstractImpl();
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualProcessor createVirtualProcessor() {
		VirtualProcessorImpl virtualProcessor = new VirtualProcessorImpl();
		return virtualProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBus createVirtualBus() {
		VirtualBusImpl virtualBus = new VirtualBusImpl();
		return virtualBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_ComponentsPackage getADELE_ComponentsPackage() {
		return (ADELE_ComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ADELE_ComponentsPackage getPackage() {
		return ADELE_ComponentsPackage.eINSTANCE;
	}

} //ADELE_ComponentsFactoryImpl
