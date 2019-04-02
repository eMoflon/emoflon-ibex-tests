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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.topcased.adele.model.ADELE.util.ADELEModelUtils;
import org.topcased.adele.model.ADELE_Components.Package;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Feature Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl#getAuthorizedSubcomponents <em>Authorized Subcomponents</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl#getAuthorizedFeatures <em>Authorized Features</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl#getInverseFeature <em>Inverse Feature</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl#isType <em>Type</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl#getAllRealFeatures <em>All Real Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureGroupImpl extends DirectedFeatureImpl implements FeatureGroup {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<SKFeature> features;

	/**
	 * The cached value of the '{@link #getAuthorizedSubcomponents() <em>Authorized Subcomponents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SKComponent> authorizedSubcomponents;

	/**
	 * The cached value of the '{@link #getAuthorizedFeatures() <em>Authorized Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<SKComponent> authorizedFeatures;

	/**
	 * The cached value of the '{@link #getInverseFeature() <em>Inverse Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseFeature()
	 * @generated
	 * @ordered
	 */
	protected FeatureGroup inverseFeature;

	/**
	 * The default value of the '{@link #isType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_FeaturesPackage.Literals.FEATURE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<SKFeature>(SKFeature.class, this, ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES, KernelSpicesPackage.SK_FEATURE__COMPONENT);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKComponent> getAuthorizedSubcomponents() {
		return authorizedSubcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizedSubcomponents(EList<SKComponent> newAuthorizedSubcomponents) {
		EList<SKComponent> oldAuthorizedSubcomponents = authorizedSubcomponents;
		authorizedSubcomponents = newAuthorizedSubcomponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS, oldAuthorizedSubcomponents, authorizedSubcomponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKComponent> getAuthorizedFeatures() {
		return authorizedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizedFeatures(EList<SKComponent> newAuthorizedFeatures) {
		EList<SKComponent> oldAuthorizedFeatures = authorizedFeatures;
		authorizedFeatures = newAuthorizedFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_FEATURES, oldAuthorizedFeatures, authorizedFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup getInverseFeature() {
		return inverseFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseFeature(FeatureGroup newInverseFeature) {
		FeatureGroup oldInverseFeature = inverseFeature;
		inverseFeature = newInverseFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_FeaturesPackage.FEATURE_GROUP__INVERSE_FEATURE, oldInverseFeature, inverseFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES:
				return getFeatures();
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS:
				return getAuthorizedSubcomponents();
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_FEATURES:
				return getAuthorizedFeatures();
			case ADELE_FeaturesPackage.FEATURE_GROUP__INVERSE_FEATURE:
				return getInverseFeature();
			case ADELE_FeaturesPackage.FEATURE_GROUP__TYPE:
				return isType();
			case ADELE_FeaturesPackage.FEATURE_GROUP__ALL_REAL_FEATURES:
				return getAllRealFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends SKFeature>)newValue);
				return;
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS:
				setAuthorizedSubcomponents((EList<SKComponent>)newValue);
				return;
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_FEATURES:
				setAuthorizedFeatures((EList<SKComponent>)newValue);
				return;
			case ADELE_FeaturesPackage.FEATURE_GROUP__INVERSE_FEATURE:
				setInverseFeature((FeatureGroup)newValue);
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
			case ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES:
				getFeatures().clear();
				return;
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS:
				setAuthorizedSubcomponents((EList<SKComponent>)null);
				return;
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_FEATURES:
				setAuthorizedFeatures((EList<SKComponent>)null);
				return;
			case ADELE_FeaturesPackage.FEATURE_GROUP__INVERSE_FEATURE:
				setInverseFeature((FeatureGroup)null);
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
			case ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES:
				return features != null && !features.isEmpty();
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS:
				return authorizedSubcomponents != null;
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_FEATURES:
				return authorizedFeatures != null;
			case ADELE_FeaturesPackage.FEATURE_GROUP__INVERSE_FEATURE:
				return inverseFeature != null;
			case ADELE_FeaturesPackage.FEATURE_GROUP__TYPE:
				return isType() != TYPE_EDEFAULT;
			case ADELE_FeaturesPackage.FEATURE_GROUP__ALL_REAL_FEATURES:
				return !getAllRealFeatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SKComponent.class) {
			switch (derivedFeatureID) {
				case ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES: return KernelSpicesPackage.SK_COMPONENT__FEATURES;
				case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS: return KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS;
				case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_FEATURES: return KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SKComponent.class) {
			switch (baseFeatureID) {
				case KernelSpicesPackage.SK_COMPONENT__FEATURES: return ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES;
				case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS: return ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS;
				case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES: return ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_FEATURES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (authorizedSubcomponents: ");
		result.append(authorizedSubcomponents);
		result.append(", authorizedFeatures: ");
		result.append(authorizedFeatures);
		result.append(')');
		return result.toString();
	}

	@Override
	public Feature getRefinedFeature() {
		if ( isType() ) {
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
		
		return super.getRefinedFeature();
	}
	
	@Override
	public Feature basicGetRefinedFeature() {
		if ( isType() ) {
			return refinedFeature;
		}
		
		return super.basicGetRefinedFeature();
	}
	
	public boolean isType() {
		return getParent() instanceof Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the list of all real features.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getAllRealFeatures() {
		final EList<Feature> allFeatures = new EObjectEList<Feature>(
				Feature.class, this,
				ADELE_FeaturesPackage.FEATURE_GROUP__ALL_REAL_FEATURES ) {
			private static final long serialVersionUID = 1L;

			@Override
			protected boolean isNotificationRequired() {
				return false;
			}
		};

		final FeatureGroup type;
		
		if ( isType() ) {
			type = this;
		}
		else {
			final SKComponent classifier = getClassifier();
			
			// Sometimes the classifier is not resolvable and instantiated as a SKComponent.
			if ( classifier instanceof FeatureGroup ) {
				type = (FeatureGroup) classifier;
			}
			else {
				type = null;
			}
		}

		if ( type != null ) {
			// DB: Added for feature duplication
			if ( type.getRefinedFeature() instanceof FeatureGroup ) {
				for ( final Feature inheritedFeat : ( (FeatureGroup) type.getRefinedFeature() ).getAllRealFeatures() ) {
					if ( ADELEModelUtils.findElementByName( inheritedFeat, allFeatures ) == null ) {
						allFeatures.add( inheritedFeat );
					}
				}
			}
			
			// DB: Added for feature duplication
			if ( type.getInverseFeature() != null ) {
				for ( final Feature inheritedFeat : type.getInverseFeature().getAllRealFeatures() ) {
					if ( ADELEModelUtils.findElementByName( inheritedFeat, allFeatures ) == null ) {
						allFeatures.add( inheritedFeat );
					}
				}
			}

			for (final SKFeature skFeature : type.getFeatures()) {
				if (skFeature instanceof Feature) {
					final Feature feature = (Feature) skFeature;

					if ( 	( !feature.isRefinement() || feature.getRefinedFeature() != null ) && 
							ADELEModelUtils.findElementByName( feature, allFeatures ) == null ) {
						allFeatures.add( feature );
					}
				}
			}
		}

		if ( getRefinedFeature() instanceof FeatureGroup ) {
			for ( final Feature inheritedFeat : ( (FeatureGroup) getRefinedFeature() ).getAllRealFeatures() ) {
				if ( ADELEModelUtils.findElementByName( inheritedFeat, allFeatures ) == null ) {
					allFeatures.add( inheritedFeat );
				}
			}
		}

		if ( getInverseFeature() instanceof FeatureGroup ) {
			for ( final Feature inheritedFeat : ( (FeatureGroup) getInverseFeature() ).getAllRealFeatures() ) {
				if ( ADELEModelUtils.findElementByName( inheritedFeat, allFeatures ) == null ) {
					allFeatures.add( inheritedFeat );
				}
			}
		}

		return allFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInverse( final Feature p_feature ) {
		final FeatureGroup type;

		if ( isType() ) {
			type = (FeatureGroup) getRefinedFeature();
		}
		else {
			type = (FeatureGroup) getClassifier();
		}
		
		if ( type == null ) {
			return false;
		}
		
		final String searchedName = p_feature.getName();
		
		if ( searchedName != null ) {
			if ( type.getInverseFeature() != null ) {
				for ( final Feature origFeature : type.getInverseFeature().getAllRealFeatures() ) {
					if ( searchedName.equalsIgnoreCase( origFeature.getName() ) ) {
						return true;
					}
				}
			}

			if ( type.getRefinedFeature() instanceof FeatureGroup ) {
				return ( (FeatureGroup) type.getRefinedFeature() ).isInverse( p_feature );
			}
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKFeature getNamedFeature(String p_name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("feature group")) 
			return true;
		else
			return  super.verify(p_keyword);
	}
	
	/**
	 * Test if the current element is an ADELE feature group
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isFeatureGroup(){
		return true;
	}

//
//	public String aadlSerialization(String packageName, String componentIdentifier, ResourceSet res, SKODSFactory odStructure, boolean isRefined) {
//		String aadl="";
//		String dataPortClassifier="NIL";
//		String refineClause = "NIL";
//		if (isRefined)
//			refineClause = "REFINED TO";
//		
//		ADELE_Component classifier = null;
//		if (getClassifier() != null)
//			classifier = ADELEModelUtils.resolve(getClassifier(), res);
//		if (classifier!=null) {
//			if (classifier.getName().contains(".") || classifier.eContainer() instanceof ADELE_Package)
//				dataPortClassifier = classifier.getName();
//			else if (classifier.isInstance())
//				dataPortClassifier =classifier.getName()+ "_" + classifier.getId().replaceAll("-", "_") + "." + classifier.getImplementationName();
//			else
//				dataPortClassifier =classifier.getName() + "." + classifier.getImplementationName();
//			
//			dataPortClassifier = ADELEModelUtils.getFullNamespaceByEContainer(classifier)+dataPortClassifier;
//		}
//		
//		// untill true management of feature group classifier, create one
//		dataPortClassifier = name +"_" + getId().replaceAll("-", "_");
//		
//		aadl+="isFeature('FEATURE GROUP','"+ packageName+"','"+componentIdentifier+"','"+name+"','NIL','NIL','"+
//				dataPortClassifier+"','NIL','"+refineClause+"','0').\n";
//
////		Waiting real management of feature group classifier
////		aadl+="isComponentType('"+ packageName+"','PUBLIC','"+ name+"','FEATURE GROUP','NIL','0').\n";
//		aadl+="isComponentType('"+ packageName+"','PUBLIC','"+ dataPortClassifier+"','FEATURE GROUP','NIL','0').\n";
//		
//		aadl += aadlFeatureSerialization(packageName, res,odStructure);
//
//		aadl+=super.aadlSerialization(packageName, componentIdentifier, res, odStructure, isRefined);
//		
//		return aadl;
//	}
//
//	private String aadlFeatureSerialization(String packageName,ResourceSet res, SKODSFactory odStructure) {
//		String aadl = "";
//		String typeGeneratingName = name +"_" + getId().replaceAll("-", "_");
//		
//		for (SKFeature localFeature : getChildren()) {
//			if (localFeature instanceof ADELE_Feature)
//				aadl += ( (ADELE_Feature)localFeature ).aadlSerialization(packageName,typeGeneratingName,res,odStructure,false);
//		}
//		
//		return aadl;
//	}

//	public Enumerator getDirection() {
//		return null;
//	}

} //ADELE_FeatureGroupImpl
