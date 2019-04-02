/**
 */
package org.topcased.adele.model.ADELE_Features.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.topcased.adele.model.ADELE.util.ADELEModelUtils;
import org.topcased.adele.model.ADELE_Features.*;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage
 * @generated
 */
public class ADELE_FeaturesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ADELE_FeaturesValidator INSTANCE = new ADELE_FeaturesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.topcased.adele.model.ADELE_Features";

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
	public ADELE_FeaturesValidator() {
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
	  return ADELE_FeaturesPackage.eINSTANCE;
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
			case ADELE_FeaturesPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case ADELE_FeaturesPackage.ACCESS:
				return validateAccess((Access)value, diagnostics, context);
			case ADELE_FeaturesPackage.DIRECTED_FEATURE:
				return validateDirectedFeature((DirectedFeature)value, diagnostics, context);
			case ADELE_FeaturesPackage.BUS_ACCESS:
				return validateBusAccess((BusAccess)value, diagnostics, context);
			case ADELE_FeaturesPackage.DATA_ACCESS:
				return validateDataAccess((DataAccess)value, diagnostics, context);
			case ADELE_FeaturesPackage.SUBPROGRAM_ACCESS:
				return validateSubprogramAccess((SubprogramAccess)value, diagnostics, context);
			case ADELE_FeaturesPackage.SUBPROGRAM_GROUP_ACCESS:
				return validateSubprogramGroupAccess((SubprogramGroupAccess)value, diagnostics, context);
			case ADELE_FeaturesPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case ADELE_FeaturesPackage.FEATURE_GROUP:
				return validateFeatureGroup((FeatureGroup)value, diagnostics, context);
			case ADELE_FeaturesPackage.EVENT_PORT:
				return validateEventPort((EventPort)value, diagnostics, context);
			case ADELE_FeaturesPackage.DATA_PORT:
				return validateDataPort((DataPort)value, diagnostics, context);
			case ADELE_FeaturesPackage.EVENT_DATA_PORT:
				return validateEventDataPort((EventDataPort)value, diagnostics, context);
			case ADELE_FeaturesPackage.ABSTRACT_FEATURE:
				return validateAbstractFeature((AbstractFeature)value, diagnostics, context);
			case ADELE_FeaturesPackage.PORT_DIRECTION:
				return validatePortDirection((PortDirection)value, diagnostics, context);
			case ADELE_FeaturesPackage.ACCESS_DIRECTION:
				return validateAccessDirection((AccessDirection)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(feature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueFeatureNames constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFeature_uniqueFeatureNames(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		final String name = feature.getName();
		boolean identicalNameExists = false; 

		if ( name != null && feature.getComponent() != null ) {
			for ( final SKHierarchicalObject child : feature.getComponent().getFeatures() ) {
				if ( child != feature && name.equalsIgnoreCase( child.getName() ) ) {
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
							 new Object[] { "uniqueFeatureNames", getObjectLabel(feature, context) },
							 new Object[] { feature },
							 context));
				}
		
				return false;
			}
		}
		
		return true;
	}

	/**
	 * Validates the legalName constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFeature_legalName(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if ( !ADELEModelUtils.isLegalAadlIdentifier( feature.getName() ) ) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "legalName", getObjectLabel(feature, context) },
						 new Object[] { feature },
						 context));
			}
			
			return false;
		}
		
		return true;
	}

	/**
	 * Validates the componentNotNull constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFeature_componentNotNull(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		final boolean componentOK;
		
		if ( feature instanceof FeatureGroup ) {
			if ( ( (FeatureGroup) feature ).isType() ) {
				componentOK = feature.getComponent() == null;
			}
			else {
				componentOK = feature.getComponent() != null;
			}
		}
		else {
			componentOK = feature.getComponent() != null;
		}
		
		if ( !componentOK ) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "componentNotNull", getObjectLabel(feature, context) },
						 new Object[] { feature },
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
	public boolean validateAccess(Access access, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(access, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(access, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(access, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(access, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(access, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(access, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(access, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(access, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(access, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(access, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(access, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(access, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedFeature(DirectedFeature directedFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(directedFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(directedFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(directedFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusAccess(BusAccess busAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(busAccess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(busAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(busAccess, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAccess(DataAccess dataAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataAccess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(dataAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(dataAccess, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubprogramAccess(SubprogramAccess subprogramAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subprogramAccess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(subprogramAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(subprogramAccess, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubprogramGroupAccess(SubprogramGroupAccess subprogramGroupAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subprogramGroupAccess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(subprogramGroupAccess, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(subprogramGroupAccess, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(parameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureGroup(FeatureGroup featureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatureGroup_consistentDirections(featureGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the consistentDirections constraint of '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFeatureGroup_consistentDirections(FeatureGroup featureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		final boolean valid;
		
		if ( featureGroup.isType() ) {
			valid = true;
		}
		else {
			if ( PortDirection.INOUT_LITERAL == featureGroup.getDirection() ) {
				valid = true;
			}
			else {
				boolean sameDirection = true;
				
				if ( featureGroup.getClassifier() != null ) {
					for ( final SKFeature feature : featureGroup.getClassifier().getFeatures() ) {
						if ( feature instanceof DirectedFeature ) {
							final PortDirection direction = ( (DirectedFeature) feature ).getDirection();

							if ( featureGroup.getDirection() != direction ) {
								sameDirection = false;
								
								break;
							}
						}
//						else if ( feature instanceof FeatureGroup ) {
//							direction = ( (FeatureGroup) feature ).getDirection();
//						}
//						else {
//							direction = null;
//						}
					}
				}
				
				valid = sameDirection;
			}
		}
		
		if ( !valid ) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "consistentDirections", getObjectLabel(featureGroup, context) },
						 new Object[] { featureGroup },
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
	public boolean validateEventPort(EventPort eventPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(eventPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(eventPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPort(DataPort dataPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(dataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(dataPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventDataPort(EventDataPort eventDataPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventDataPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(eventDataPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(eventDataPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFeature(AbstractFeature abstractFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_uniqueFeatureNames(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_legalName(abstractFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_componentNotNull(abstractFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDirection(PortDirection portDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessDirection(AccessDirection accessDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //ADELE_FeaturesValidator
