/**
 */
package org.topcased.adele.model.ADELE_Components.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.topcased.adele.model.ADELE.util.ADELEModelUtils;
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
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage
 * @generated
 */
public class ADELE_ComponentsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ADELE_ComponentsValidator INSTANCE = new ADELE_ComponentsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.topcased.adele.model.ADELE_Components";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADELE_ComponentsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ADELE_ComponentsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ADELE_ComponentsPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ADELE_ComponentsPackage.BUS:
				return validateBus((Bus)value, diagnostics, context);
			case ADELE_ComponentsPackage.PACKAGE:
				return validatePackage((org.topcased.adele.model.ADELE_Components.Package)value, diagnostics, context);
			case ADELE_ComponentsPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case ADELE_ComponentsPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case ADELE_ComponentsPackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case ADELE_ComponentsPackage.PROCESS:
				return validateProcess((org.topcased.adele.model.ADELE_Components.Process)value, diagnostics, context);
			case ADELE_ComponentsPackage.PROCESSOR:
				return validateProcessor((Processor)value, diagnostics, context);
			case ADELE_ComponentsPackage.SUBPROGRAM:
				return validateSubprogram((Subprogram)value, diagnostics, context);
			case ADELE_ComponentsPackage.SYSTEM:
				return validateSystem((org.topcased.adele.model.ADELE_Components.System)value, diagnostics, context);
			case ADELE_ComponentsPackage.THREAD:
				return validateThread((org.topcased.adele.model.ADELE_Components.Thread)value, diagnostics, context);
			case ADELE_ComponentsPackage.THREAD_GROUP:
				return validateThreadGroup((org.topcased.adele.model.ADELE_Components.ThreadGroup)value, diagnostics, context);
			case ADELE_ComponentsPackage.SUBPROGRAM_GROUP:
				return validateSubprogramGroup((SubprogramGroup)value, diagnostics, context);
			case ADELE_ComponentsPackage.ABSTRACT:
				return validateAbstract((Abstract)value, diagnostics, context);
			case ADELE_ComponentsPackage.VIRTUAL_PROCESSOR:
				return validateVirtualProcessor((VirtualProcessor)value, diagnostics, context);
			case ADELE_ComponentsPackage.VIRTUAL_BUS:
				return validateVirtualBus((VirtualBus)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(component, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueChildrenNames constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateComponent_uniqueChildrenNames(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		final String name = component.getName();
		boolean identicalNameExists = false; 

		if ( name != null && component.getParent() != null ) {
			for ( final SKHierarchicalObject child : component.getParent().getChildren() ) {
				if ( child != component && name.equalsIgnoreCase( child.getName() ) ) {
					identicalNameExists = true;
					
					break;
				}
			}

			if ( identicalNameExists ) {
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "uniqueChildrenNames", getObjectLabel(component, context) },
							 new Object[] { component },
							 context));
				}
				
				return false;
			}
		}

		return true;
	}

	/**
	 * Validates the legalName constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateComponent_legalName(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean legalName = true;
		final String name = component.getName();
		
		if ( name == null ) {
			legalName = false;
		}
		else if ( component.isImplementation() ) {
			final String[] splittedNames = name.split( "\\." );
			
			if ( splittedNames.length != 2 ) {
				legalName = false;
			}
			else {
				final Component type = component.getType();
				
				if ( !splittedNames[ 0 ].equals( type.getName() ) ) {
					legalName = false;
				}
				else if ( !ADELEModelUtils.isLegalAadlIdentifier( splittedNames[ 1 ] ) ) {
					legalName = false;
				}
			}
		}
		else if ( !ADELEModelUtils.isLegalAadlIdentifier( name ) ) {
			legalName = false;
		}
		
		if ( !legalName ) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "legalName", getObjectLabel(component, context) },
						 new Object[] { component },
						 context));
			}
			
			return false;
		}
		
		return true;
	}

	/**
	 * Validates the legalChildren constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateComponent_legalChildren(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if ( !ADELEModelUtils.isLegalChildrenComponent( component ) ) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "legalChildren", getObjectLabel(component, context) },
						 new Object[] { component },
						 context));
			}
			
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(bus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(org.topcased.adele.model.ADELE_Components.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(package_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(package_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(data, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(data, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(data, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(data, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(data, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(device, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(device, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(memory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(org.topcased.adele.model.ADELE_Components.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(process, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessor(Processor processor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(processor, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(processor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubprogram(Subprogram subprogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subprogram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(subprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(subprogram, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(org.topcased.adele.model.ADELE_Components.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(system, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThread(org.topcased.adele.model.ADELE_Components.Thread thread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(thread, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(thread, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(thread, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreadGroup(org.topcased.adele.model.ADELE_Components.ThreadGroup threadGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(threadGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(threadGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(threadGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubprogramGroup(SubprogramGroup subprogramGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subprogramGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(subprogramGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(subprogramGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstract(Abstract abstract_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstract_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(abstract_, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(abstract_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualProcessor(VirtualProcessor virtualProcessor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(virtualProcessor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(virtualProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(virtualProcessor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualBus(VirtualBus virtualBus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(virtualBus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_uniqueChildrenNames(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalName(virtualBus, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_legalChildren(virtualBus, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ADELE_ComponentsValidator
