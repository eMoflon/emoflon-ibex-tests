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
package org.topcased.adele.model.ADELE_Features.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.impl.SKFeatureImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureImpl#isRefinement <em>Refinement</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureImpl#getRefinedFeature <em>Refined Feature</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureImpl#getOriginalFeature <em>Original Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureImpl extends SKFeatureImpl implements Feature {
	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected SKComponent classifier;

	/**
	 * The default value of the '{@link #isRefinement() <em>Refinement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefinement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFINEMENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #getRefinedFeature() <em>Refined Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature refinedFeature;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_FeaturesPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKComponent getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (SKComponent)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ADELE_FeaturesPackage.FEATURE__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKComponent basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(SKComponent newClassifier) {
		SKComponent oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_FeaturesPackage.FEATURE__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isRefinement() {
		if (  getOriginalFeature() != null ) {
			final SKComponent skComponent = getComponent();
			
			if ( skComponent instanceof Component ) {
				return ( (Component) skComponent ).isType();
			}
			
			if ( skComponent instanceof FeatureGroup ) {
				return ( (FeatureGroup) skComponent ).isType();
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature getRefinedFeature() {
		refinedFeature = basicGetRefinedFeature();

		if (refinedFeature != null && refinedFeature.eIsProxy()) {
			InternalEObject oldRefinedFeature = (InternalEObject)refinedFeature;
			refinedFeature = (Feature)eResolveProxy(oldRefinedFeature);
			if (refinedFeature != oldRefinedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ADELE_FeaturesPackage.FEATURE__REFINED_FEATURE, oldRefinedFeature, refinedFeature));
			}
		}
		
		return refinedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetRefinedFeature() {
		final String featureName = getName();
		
		if ( featureName != null ) {
			final SKComponent skComponent = getComponent();
			
			if ( skComponent instanceof Component ) {
				final Component component = (Component) skComponent;
	
				if ( component.isType() ) {
					return getRefinedFeature( component.getRefines() );
				}
			}
			else if ( skComponent instanceof FeatureGroup ) {
				final FeatureGroup featGrParent = (FeatureGroup) skComponent;

				if ( featGrParent.isType() ) {
					return getRefinedFeature( (FeatureGroup) featGrParent.getRefinedFeature() );
				}
			}
		}
		
		return null;
	}

	private Feature getRefinedFeature( final FeatureGroup p_extFeatGroup ) {
		final String featureName = getName();
		
		if ( featureName != null && p_extFeatGroup != null ) {
			assert p_extFeatGroup.isType() : "Feature group should be a type.";
			
			final Feature refFeature = getRefinedFeature( p_extFeatGroup.getFeatures() );
			
			if ( refFeature != null ) {
				return refFeature;
			}

			return getRefinedFeature( (FeatureGroup) p_extFeatGroup.getRefinedFeature() );
		}
	
		return null;
	}

	private Feature getRefinedFeature( final Component p_extendedCompType ) {
		final String featureName = getName();
		
		if ( featureName != null && p_extendedCompType != null ) {
			assert p_extendedCompType.isType() : "Component should be a type.";
			
			final Feature refFeature = getRefinedFeature( p_extendedCompType.getFeatures() );
			
			if ( refFeature != null ) {
				return refFeature;
			}

//			for ( final SKFeature feature : p_extendedCompType.getFeatures() ) {
//				if ( featureName.equals( feature.getName() ) && feature instanceof Feature ) {
//					final Feature adeleFeat = (Feature) feature;
//					
//					if ( ( 	getClassifier() == null && eClass() != feature.eClass() ) ||
//							getClassifier() != adeleFeat.getClassifier() ) {
//						return adeleFeat;
//					}
//				}
//			}
			
			return getRefinedFeature( p_extendedCompType.getRefines() );
		}
		
		return null;
	}

	private Feature getRefinedFeature( final Collection<SKFeature> p_features ) {
		final String featureName = getName();

		for ( final SKFeature feature : p_features ) {
			if ( featureName.equalsIgnoreCase( feature.getName() ) && feature instanceof Feature ) {
				final Feature adeleFeat = (Feature) feature;
				
				if ( ( 	getClassifier() == null && eClass() != feature.eClass() ) ||
						getClassifier() != adeleFeat.getClassifier() ) {
					return adeleFeat;
				}
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedFeature(Feature newRefinedFeature) {
		Feature oldRefinedFeature = refinedFeature;
		refinedFeature = newRefinedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_FeaturesPackage.FEATURE__REFINED_FEATURE, oldRefinedFeature, refinedFeature));
	}
/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getOriginalFeature() {
		Feature originalFeature = basicGetOriginalFeature();
		return originalFeature != null && originalFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)originalFeature) : originalFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * TODO: Review so that this is returned when the original feature is self.
	 */
	public Feature basicGetOriginalFeature() {
		final SKComponent component = getComponent();
		
		if ( component instanceof Component ) {
			return getOriginalFeature( (Component) component );
		}

		if ( component instanceof FeatureGroup ) {
			return getOriginalFeature( (FeatureGroup) component );
		}
		
		return null;
	}

	private Feature getOriginalFeature( final Component p_component ) {
		if ( p_component != null ) {
			final Component type;
			
			if ( p_component.isSubcomponent() ) {
				final Component refinedTo = p_component.getRefines();
				
				if ( refinedTo == null ) {
					type = p_component.getType();
				}
				else if ( refinedTo.isImplementation() ){
					type = refinedTo.getType();
				}
				else {
					type = refinedTo;
				}
			}
			else if ( p_component.isImplementation() ) {
				type = p_component.getType();
			}
			else {
				type = p_component.getRefines();
			}
			
			if ( type != null ) {
				final String featName = getName();
				
				if ( featName != null ) {
					for ( final SKFeature feature : type.getFeatures() ) {
						if ( featName.equalsIgnoreCase( feature.getName() ) && feature instanceof Feature ) {
							final Feature adeleFeat = (Feature) feature;
							
							if ( adeleFeat.getRefinedFeature() != null ) {
								return adeleFeat;
							}
							
							final Feature origFeat = adeleFeat.getOriginalFeature();
							
							return origFeat == null? adeleFeat : origFeat;
						}
					}
					
					// No feature found. Search from extended component if any. Handles the case where the features have not been duplicated
					// yet.
					return getOriginalFeature( type );
				}
			}
		}
		
		return null;
	}

	private Feature getOriginalFeature( final FeatureGroup p_featGroup ) {
		if ( p_featGroup != null ) {
			final FeatureGroup type;
			
			if ( p_featGroup.isType() ) {
				type = p_featGroup.getRefinedFeature() == null ? p_featGroup.getInverseFeature() : (FeatureGroup) p_featGroup.getRefinedFeature();
			}
			else {
				final SKComponent classifier = p_featGroup.getClassifier();
				
				if ( classifier instanceof FeatureGroup ) {
					type = (FeatureGroup) classifier;
				}
				else {
					type = null;
				}
			}
			
			if ( type != null ) {
				final String featName = getName();
				
				if ( featName != null ) {
					for ( final SKFeature feature : type.getFeatures() ) {
						if ( featName.equals( feature.getName() ) && feature instanceof Feature ) {
							final Feature adeleFeat = (Feature) feature;
							
							if ( adeleFeat.getRefinedFeature() != null ) {
								return adeleFeat;
							}
							
							final Feature origFeat = adeleFeat.getOriginalFeature();
							
							return origFeat == null? adeleFeat : origFeat;
						}
					}
					
					return getOriginalFeature( type );
				}
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ADELE_FeaturesPackage.FEATURE__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case ADELE_FeaturesPackage.FEATURE__REFINEMENT:
				return isRefinement();
			case ADELE_FeaturesPackage.FEATURE__REFINED_FEATURE:
				if (resolve) return getRefinedFeature();
				return basicGetRefinedFeature();
			case ADELE_FeaturesPackage.FEATURE__ORIGINAL_FEATURE:
				if (resolve) return getOriginalFeature();
				return basicGetOriginalFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ADELE_FeaturesPackage.FEATURE__CLASSIFIER:
				setClassifier((SKComponent)newValue);
				return;
			case ADELE_FeaturesPackage.FEATURE__REFINED_FEATURE:
				setRefinedFeature((Feature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ADELE_FeaturesPackage.FEATURE__CLASSIFIER:
				setClassifier((SKComponent)null);
				return;
			case ADELE_FeaturesPackage.FEATURE__REFINED_FEATURE:
				setRefinedFeature((Feature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ADELE_FeaturesPackage.FEATURE__CLASSIFIER:
				return classifier != null;
			case ADELE_FeaturesPackage.FEATURE__REFINEMENT:
				return isRefinement() != REFINEMENT_EDEFAULT;
			case ADELE_FeaturesPackage.FEATURE__REFINED_FEATURE:
				return refinedFeature != null;
			case ADELE_FeaturesPackage.FEATURE__ORIGINAL_FEATURE:
				return basicGetOriginalFeature() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean validateName(String name) {
		return validateName(name,false);
	}
	
	protected boolean validateName(String name, boolean force){
		if (!force ) {
			final SKComponent skComponent = getComponent();
			
			if ( skComponent instanceof Component ) {
				final Component component = (Component) skComponent;
				
				if ( 	component.isSubcomponentsLock() && !component.isSubcomponentRefinement() &&
						// Test that the new name is different
						getName() != null && !getName().equals( name ) ) {
					return riseCannotRenameFeatureOfInstance();
				}
			}
		}
		
		if (!force && getComponent() instanceof Component && ( (Component)getComponent()).isFeaturesLock()){
			return riseCannotRenameFeatureOfImplementation();
		}	
		
		if ( getParent()==null && getComponent()!=null){
			EList<SKFeature> brothers = getComponent().getFeatures();
			for (int i=0;i<brothers.size();i++){
				if ( name !=  null && name.equals( brothers.get(i).getName() ) ) {
					return riseNameAlreadyUsed(name, this.getComponent());
				}
			}
		}
		else if (this.getParent()!=null){
			for ( final SKHierarchicalObject brother : getParent().getChildren() ) {
				if ( name !=  null && name.equals( brother.getName() ) ) {
//				if (((SKFeature)brothers.get(i)).getName().equals(name))
					return riseNameAlreadyUsed(name, (SKHierarchicalObject)this.getParent());
				}
			}
		}
		return true;
	}
	
	private boolean riseNameAlreadyUsed(String name, SKHierarchicalObject comp) {
		// DB: TODO move this to proper place (validation).
//		Status status = new Status(IStatus.ERROR, "plugin", 0,
//				"Already used feature name", null);
//		String errorMessage;
//		if (comp.isFeature())
//			errorMessage = "The feature ";
//		else
//			errorMessage = "The component ";
//		errorMessage += comp.getName() + " already contains a feature named " + name;
//		ErrorDialog.openError(Display.getCurrent().getActiveShell(),
//				"Already used feature name", errorMessage, status);
		return true;
	}
	
	private boolean riseCannotRenameFeatureOfInstance() {
//		Status status = new Status(IStatus.ERROR, "plugin", 0,
//				"Rename error", null);
//		String errorMessage = "Features of component instance cannot be renamed.";
//		ErrorDialog.openError(Display.getCurrent().getActiveShell(),
//				"Rename error", errorMessage, status);
		return true;
	}
	
	private boolean riseCannotRenameFeatureOfImplementation() {
//		Status status = new Status(IStatus.ERROR, "plugin", 0,
//				"Rename error", null);
//		String errorMessage = "Features of component implementation cannot be renamed.";
//		ErrorDialog.openError(Display.getCurrent().getActiveShell(),
//				"Rename error", errorMessage, status);
		return true;
	}
//	
//	public String aadlSerialization(String packageName,
//			String componentIdentifier, ResourceSet res,
//			SKODSFactory odStructure, boolean isRefined) {
//		String aadl = "";
//		
//		aadl += calculateODSFacts(odStructure, packageName, componentIdentifier, "NIL");
//		
//		return aadl;
//	}
//	
//	private String calculateODSFacts(SKODSFactory odStructure, String packageName, String component_type_identifier, String component_implementation_identifier){
//		String aadl = "";
//
//		try {
//			SKODSystem odSystem = odStructure.getODSystem(odStructure.getODSystemsId().get(0), (SKHierarchicalObject)this);
//			SKODSection aadlPropertiesSection = getAadlPropertiesSection(odSystem.getSections());
//			
//			for (SKODSection section : aadlPropertiesSection.getChildren()){
//				aadl += calculateODSectionFacts(section.getChildren(), odSystem,packageName, component_type_identifier, component_implementation_identifier,section.getId());
//			}
//		} catch (SKODSFactoryException e) {
//			System.err.println(e.getMessage());
//		}
//		
//		return aadl;
//	}
//	
//	private SKODSection getAadlPropertiesSection(EList<SKODSection> sections) {
//		SKODSection res = null;
//		
//		for (SKODSection section : sections) {
//			if (section.getId().equalsIgnoreCase("PROPERTIES"))
//				res = section;
//			else
//				res = getAadlPropertiesSection(section.getChildren());
//			if (res!=null)
//				break;
//		}
//		return res;
//	}
//	
//	private String calculateODSectionFacts(EList<SKODSection> sections, SKODSystem odSystem, 
//											String packageName, String component_type_identifier, 
//											String component_implementation_identifier, String parentSection) {
//		String aadl = "";
//
//		for (SKODSection section: sections){
//			SKODData tmp = section.getData();
//			String odsName = section.getId();
//			if (tmp!=null && tmp.getValue()!="") {
//				String constantType = "NIL";  // either NIL or CONSTANT
//				String assignType = "=>";    // either => or +=> or APPLIES TO
//				
//				aadl += "isProperty('"+constantType+"','"+assignType+"','"+packageName+"','"+
//								component_type_identifier+"','"+component_implementation_identifier+"','"+
//								name+"','"+ parentSection +"::"+ odsName+"','"+tmp.getValue()+"','0').\n";
//
//			}
//			aadl += calculateODSectionFacts(section.getChildren(), odSystem,packageName, component_type_identifier, component_implementation_identifier,odsName);
//		}
//		
//		return aadl;
//	}
	
} //ADELE_FeatureImpl
