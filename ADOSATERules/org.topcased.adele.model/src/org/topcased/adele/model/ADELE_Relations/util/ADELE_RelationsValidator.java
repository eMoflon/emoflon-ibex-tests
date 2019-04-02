/**
 */
package org.topcased.adele.model.ADELE_Relations.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.ADELE_Relations.*;
import org.topcased.adele.model.KernelSpices.SKComponent;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage
 * @generated
 */
public class ADELE_RelationsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ADELE_RelationsValidator INSTANCE = new ADELE_RelationsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.topcased.adele.model.ADELE_Relations";

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
	public ADELE_RelationsValidator() {
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
	  return ADELE_RelationsPackage.eINSTANCE;
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
			case ADELE_RelationsPackage.RELATION:
				return validateRelation((Relation)value, diagnostics, context);
			case ADELE_RelationsPackage.ACCESS_CONNECTION:
				return validateAccessConnection((AccessConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.DIRECTED_FEATURE_CONNECTION:
				return validateDirectedFeatureConnection((DirectedFeatureConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.BUS_ACCESS_CONNECTION:
				return validateBusAccessConnection((BusAccessConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.DATA_ACCESS_CONNECTION:
				return validateDataAccessConnection((DataAccessConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.SUBPROGRAM_ACCESS_CONNECTION:
				return validateSubprogramAccessConnection((SubprogramAccessConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.SUBPROGRAM_GROUP_ACCESS_CONNECTION:
				return validateSubprogramGroupAccessConnection((SubprogramGroupAccessConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.EVENT_PORT_CONNECTION:
				return validateEventPortConnection((EventPortConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.DATA_PORT_CONNECTION:
				return validateDataPortConnection((DataPortConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.EVENT_DATA_PORT_CONNECTION:
				return validateEventDataPortConnection((EventDataPortConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.PARAMETER_CONNECTION:
				return validateParameterConnection((ParameterConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.ABSTRACT_FEATURE_CONNECTION:
				return validateAbstractFeatureConnection((AbstractFeatureConnection)value, diagnostics, context);
			case ADELE_RelationsPackage.FEATURE_GROUP_CONNECTION:
				return validateFeatureGroupConnection((FeatureGroupConnection)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(relation, diagnostics, context);
		return result;
	}

	private boolean hasSubcomponentFeatureOfFeatureGroupConnectionEnd( final Relation p_relation ) {
		for ( final Object end : p_relation.getObjects() ) {
			final Feature feature = (Feature) end;
		
			if ( feature.getComponent() instanceof FeatureGroup ) {
				final SKComponent fgComponent = ( (FeatureGroup) feature.getComponent() ).getComponent();
				
				if ( fgComponent instanceof Component && ( (Component) fgComponent ).isSubcomponent() ) {
					return true;
				}
			}
		}
				
		return false;
	}
	
	/**
	 * Validates the noSubcomponentFeatureOfFeatureGroupConnectionEnd constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(	final Relation p_relation,
																						final DiagnosticChain p_diagnostics,
																						final Map<Object, Object> p_context ) {
		if ( hasSubcomponentFeatureOfFeatureGroupConnectionEnd( p_relation ) ) {
			if ( p_diagnostics != null) {
				p_diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "noSubcomponentFeatureOfFeatureGroupConnectionEnd", getObjectLabel( p_relation, p_context ) },
						 new Object[]{ p_relation },
						 p_context ) );
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
	public boolean validateAccessConnection(AccessConnection accessConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(accessConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedFeatureConnection(DirectedFeatureConnection directedFeatureConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(directedFeatureConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(directedFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(directedFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(directedFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(directedFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(directedFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(directedFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(directedFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(directedFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(directedFeatureConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusAccessConnection(BusAccessConnection busAccessConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(busAccessConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(busAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(busAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(busAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(busAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(busAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(busAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(busAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(busAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(busAccessConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAccessConnection(DataAccessConnection dataAccessConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataAccessConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(dataAccessConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubprogramAccessConnection(SubprogramAccessConnection subprogramAccessConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subprogramAccessConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subprogramAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subprogramAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subprogramAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subprogramAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subprogramAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subprogramAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subprogramAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subprogramAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(subprogramAccessConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubprogramGroupAccessConnection(SubprogramGroupAccessConnection subprogramGroupAccessConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subprogramGroupAccessConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subprogramGroupAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subprogramGroupAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subprogramGroupAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subprogramGroupAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subprogramGroupAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subprogramGroupAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subprogramGroupAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subprogramGroupAccessConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(subprogramGroupAccessConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventPortConnection(EventPortConnection eventPortConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventPortConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(eventPortConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPortConnection(DataPortConnection dataPortConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataPortConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(dataPortConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventDataPortConnection(EventDataPortConnection eventDataPortConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventDataPortConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventDataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventDataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventDataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventDataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventDataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventDataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventDataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventDataPortConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(eventDataPortConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterConnection(ParameterConnection parameterConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(parameterConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFeatureConnection(AbstractFeatureConnection abstractFeatureConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractFeatureConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractFeatureConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(abstractFeatureConnection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureGroupConnection(FeatureGroupConnection featureGroupConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureGroupConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureGroupConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureGroupConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureGroupConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureGroupConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureGroupConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureGroupConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureGroupConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureGroupConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSubcomponentFeatureOfFeatureGroupConnectionEnd(featureGroupConnection, diagnostics, context);
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

} //ADELE_RelationsValidator
