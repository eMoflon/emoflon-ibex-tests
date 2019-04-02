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
package org.topcased.adele.model.ADELE_Relations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.topcased.adele.model.ADELE.util.ADELEModelUtils;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Features.AccessDirection;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.ADELE_Features.PortDirection;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.Relation;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;
import org.topcased.adele.model.KernelSpices.impl.SKRelationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getOriginalSourceFeature <em>Original Source Feature</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getOriginalSinkFeature <em>Original Sink Feature</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getOriginalSourceSubcomponent <em>Original Source Subcomponent</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getOriginalSinkSubcomponent <em>Original Sink Subcomponent</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getOwningComponent <em>Owning Component</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl#getOriginalRelation <em>Original Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationImpl extends SKRelationImpl implements Relation {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOriginalSourceFeature() <em>Original Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature originalSourceFeature;

	/**
	 * The cached value of the '{@link #getOriginalSinkFeature() <em>Original Sink Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalSinkFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature originalSinkFeature;

	/**
	 * The cached value of the '{@link #getOriginalSourceSubcomponent() <em>Original Source Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalSourceSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected Component originalSourceSubcomponent;

	/**
	 * The cached value of the '{@link #getOriginalSinkSubcomponent() <em>Original Sink Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalSinkSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected Component originalSinkSubcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_RelationsPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(int newMultiplicity) {
		int oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_RelationsPackage.RELATION__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_RelationsPackage.RELATION__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature getOriginalSourceFeature() {
		final Object source = getSource();
		
		if ( source instanceof Feature ) {
			return ( (Feature) source ).getOriginalFeature();
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature getOriginalSinkFeature() {
		final Object sink = getSink();
		
		if ( sink instanceof Feature ) {
			return ( (Feature) sink ).getOriginalFeature();
		}
		
		return null;
//		return originalSinkFeature;
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public Feature basicGetOriginalSourceFeature() {
//		final SKFeature source = (SKFeature) getSource();
//		
//		if ( source instanceof Feature ) {
//			return ( (Feature) source ).getOriginalFeature();
//		}
//		
//		return null;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalSourceFeature(Feature newOriginalSourceFeature) {
		Feature oldOriginalSourceFeature = originalSourceFeature;
		originalSourceFeature = newOriginalSourceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_FEATURE, oldOriginalSourceFeature, originalSourceFeature));
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public Feature basicGetOriginalSinkFeature() {
//		final SKFeature sink = (SKFeature) getSink();
//		
//		if ( sink instanceof Feature ) {
//			return ( (Feature) sink ).getOriginalFeature();
//		}
//		
//		return null;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalSinkFeature(Feature newOriginalSinkFeature) {
		Feature oldOriginalSinkFeature = originalSinkFeature;
		originalSinkFeature = newOriginalSinkFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_FEATURE, oldOriginalSinkFeature, originalSinkFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component getOriginalSourceSubcomponent() {
		final Object source = getSource();
		
		if ( source instanceof Component ) {
			return ( (Component) source ).getOriginalComponent();
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalSourceSubcomponent(Component newOriginalSourceSubcomponent) {
		Component oldOriginalSourceSubcomponent = originalSourceSubcomponent;
		originalSourceSubcomponent = newOriginalSourceSubcomponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_SUBCOMPONENT, oldOriginalSourceSubcomponent, originalSourceSubcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component getOriginalSinkSubcomponent() {
		final Object sink = getSink();
		
		if ( sink instanceof Component ) {
			return ( (Component) sink ).getOriginalComponent();
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalSinkSubcomponent(Component newOriginalSinkSubcomponent) {
		Component oldOriginalSinkSubcomponent = originalSinkSubcomponent;
		originalSinkSubcomponent = newOriginalSinkSubcomponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_SUBCOMPONENT, oldOriginalSinkSubcomponent, originalSinkSubcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKObject getSource() {
		SKObject source = basicGetSource();
		return source != null && source.eIsProxy() ? (SKObject)eResolveProxy((InternalEObject)source) : source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ADELE_RelationsPackage.RELATION__MULTIPLICITY:
				return getMultiplicity();
			case ADELE_RelationsPackage.RELATION__MIN:
				return getMin();
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_FEATURE:
				return getOriginalSourceFeature();
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_FEATURE:
				return getOriginalSinkFeature();
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_SUBCOMPONENT:
				return getOriginalSourceSubcomponent();
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_SUBCOMPONENT:
				return getOriginalSinkSubcomponent();
			case ADELE_RelationsPackage.RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ADELE_RelationsPackage.RELATION__SINK:
				if (resolve) return getSink();
				return basicGetSink();
			case ADELE_RelationsPackage.RELATION__OWNING_COMPONENT:
				if (resolve) return getOwningComponent();
				return basicGetOwningComponent();
			case ADELE_RelationsPackage.RELATION__ORIGINAL_RELATION:
				if (resolve) return getOriginalRelation();
				return basicGetOriginalRelation();
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
			case ADELE_RelationsPackage.RELATION__MULTIPLICITY:
				setMultiplicity((Integer)newValue);
				return;
			case ADELE_RelationsPackage.RELATION__MIN:
				setMin((Integer)newValue);
				return;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_FEATURE:
				setOriginalSourceFeature((Feature)newValue);
				return;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_FEATURE:
				setOriginalSinkFeature((Feature)newValue);
				return;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_SUBCOMPONENT:
				setOriginalSourceSubcomponent((Component)newValue);
				return;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_SUBCOMPONENT:
				setOriginalSinkSubcomponent((Component)newValue);
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
			case ADELE_RelationsPackage.RELATION__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case ADELE_RelationsPackage.RELATION__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_FEATURE:
				setOriginalSourceFeature((Feature)null);
				return;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_FEATURE:
				setOriginalSinkFeature((Feature)null);
				return;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_SUBCOMPONENT:
				setOriginalSourceSubcomponent((Component)null);
				return;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_SUBCOMPONENT:
				setOriginalSinkSubcomponent((Component)null);
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
			case ADELE_RelationsPackage.RELATION__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case ADELE_RelationsPackage.RELATION__MIN:
				return min != MIN_EDEFAULT;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_FEATURE:
				return originalSourceFeature != null;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_FEATURE:
				return originalSinkFeature != null;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SOURCE_SUBCOMPONENT:
				return originalSourceSubcomponent != null;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_SINK_SUBCOMPONENT:
				return originalSinkSubcomponent != null;
			case ADELE_RelationsPackage.RELATION__SOURCE:
				return basicGetSource() != null;
			case ADELE_RelationsPackage.RELATION__SINK:
				return basicGetSink() != null;
			case ADELE_RelationsPackage.RELATION__OWNING_COMPONENT:
				return basicGetOwningComponent() != null;
			case ADELE_RelationsPackage.RELATION__ORIGINAL_RELATION:
				return basicGetOriginalRelation() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(", min: ");
		result.append(min);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean verify(String p_keyword) throws SKHierarchicalObjectException {
		if (p_keyword.equals("relation")) 
			return true;

		return super.verify(p_keyword);
	}
//
//	public String aadlSerialization(String packageName, String componentIdentifier, ResourceSet res, SKODSFactory odStructure) {
//		String aadl="";
//		String compoType = "";
//		String compoImpl = "";
//		String sourceContainerName = "";
//		String sinkContainerName ="";
//		
//		if (getObjects().size()!=2)
//			return aadl;
//		
//		StringTokenizer tok = new StringTokenizer(componentIdentifier,".");
//		compoType = tok.nextToken();
//		if (tok.hasMoreTokens())
//			compoImpl = tok.nextToken();
//
//		SKHierarchicalObject source = getSource();
//		SKHierarchicalObject sink = getSink();
//		SKHierarchicalObject sourceContainer = (SKHierarchicalObject)source.eContainer();
//		SKHierarchicalObject sinkContainer = (SKHierarchicalObject)sink.eContainer();
//
//		if (sourceContainer!=eContainer())
//			sourceContainerName = sourceContainer.getName()+".";
//		if (sinkContainer!=eContainer())
//			sinkContainerName = sinkContainer.getName()+".";
//		
//		String connectionEdge = "->";
//		if (this instanceof ADELE_FeatureGroupConnection)
//			connectionEdge = "<->";
//
//		aadl+="isConnection('"+getConnectionType()+"','"+packageName+"','"+compoType+"','"+compoImpl+
//						"','"+name+"','"+sourceContainerName +source.getName()+"','"+connectionEdge+"','"+
//						sinkContainerName+sink.getName()+"','NIL','0').\n";
//
//		
//		aadl+=calculateODSFacts(odStructure, packageName, compoType, compoImpl);
//		
//		return aadl;
//	}
	
	public boolean isFirstFeatureGroupConnection(SKHierarchicalObject sourceContainer, SKHierarchicalObject sinkContainer) {
		boolean res = false;
		
		res = res && sourceContainer instanceof FeatureGroup;
		res = res && sinkContainer instanceof FeatureGroup;
		
		return res;
	}
	
	public String getConnectionType() {
		return "NIL";
	}
	
//	public SKObject getSource() {
//		if ( getObjects().size() != 2 ) {
//			return null;
//		}
//		
//		final SKObject obj1 = getObjects().get( 0 );
//		final SKObject obj2 = getObjects().get( 1 );
//		
//		if ( obj1 instanceof FeatureGroup )
//			return obj1;
//		
//		if ( obj1 instanceof Feature && obj2 instanceof Feature ) {
//			final Feature firstFeature = (Feature) obj1;
//			final Feature lastFeature = (Feature) obj2;
//			final EObject connParent = eContainer();
//			
//			if ( firstFeature.getComponent() == connParent ) {
//				if ( firstFeature.getDirection() == PortDirection.IN_LITERAL ) {
//					return firstFeature;
//				}
//
//				if ( firstFeature.getDirection() == PortDirection.OUT_LITERAL ) {
//					return lastFeature;
//				}
//				
//				if ( lastFeature.getDirection() == PortDirection.OUT_LITERAL ) {
//					return lastFeature;
//				}
//				
//				return firstFeature;
//			}
//			
//			if ( lastFeature.getComponent() == connParent ) {
//				if ( lastFeature.getDirection() == PortDirection.IN_LITERAL ) {
//					return lastFeature;
//				}
//				
//				if ( lastFeature.getDirection() == PortDirection.OUT_LITERAL ) {
//					return firstFeature;
//				}
//
//				if ( firstFeature.getDirection() == PortDirection.OUT_LITERAL ) {
//					return firstFeature;
//				}
//				
//				return firstFeature;
//			}
//				
//			if ( firstFeature.getDirection() == PortDirection.OUT_LITERAL ) {
//				return firstFeature;
//			}
//
//			if ( firstFeature.getDirection() == PortDirection.IN_LITERAL ) {
//				return lastFeature;
//			}
//
//			if ( lastFeature.getDirection() == PortDirection.OUT_LITERAL ) {
//				return lastFeature;
//			}
//			
//			return firstFeature;
//		}
//		
//		if ( obj1 instanceof Feature ) {
//			final Enumerator direction = ( (Feature) obj1 ).getDirection();
//			
//			if (	PortDirection.OUT_LITERAL == direction ||
//					AccessDirection.PROVIDED_LITERAL == direction ) {
//				return obj1;
//			}
//
//			return obj2;
//		} 
//
//		if (obj2 instanceof Feature ) {
//			return obj1;
//		}
//		
//		return obj1;
//	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKObject basicGetSource() {
		if ( getObjects().size() != 2 ) {
			return null;
		}
		
		final SKObject obj1 = getObjects().get( 0 );
		final SKObject obj2 = getObjects().get( 1 );
		
		if ( obj1 instanceof FeatureGroup )
			return obj1;
		
		if ( obj1 instanceof Feature && obj2 instanceof Feature ) {
			final Feature firstFeature = (Feature) obj1;
			final Feature lastFeature = (Feature) obj2;
			final EObject connParent = eContainer();
			SKComponent firstFeatureComponent = firstFeature.getComponent();
			
			if ( firstFeatureComponent instanceof SKFeature ) {
				firstFeatureComponent = ( (SKFeature) firstFeatureComponent ).getComponent();
			}
			
			if ( firstFeatureComponent == connParent ) {
				if ( firstFeature.getDirection() == PortDirection.IN_LITERAL ) {
					return firstFeature;
				}

				if ( firstFeature.getDirection() == PortDirection.OUT_LITERAL ) {
					return lastFeature;
				}
				
				if ( lastFeature.getDirection() == PortDirection.OUT_LITERAL ) {
					return lastFeature;
				}
				
				return firstFeature;
			}
			
			SKComponent lastFeatureComponent = lastFeature.getComponent();

			if ( lastFeatureComponent instanceof SKFeature ) {
				lastFeatureComponent = ( (SKFeature) lastFeatureComponent ).getComponent();
			}

			if ( lastFeature.getComponent() == connParent ) {
				if ( lastFeature.getDirection() == PortDirection.IN_LITERAL ) {
					return lastFeature;
				}
				
				if ( lastFeature.getDirection() == PortDirection.OUT_LITERAL ) {
					return firstFeature;
				}

				if ( firstFeature.getDirection() == PortDirection.OUT_LITERAL ) {
					return firstFeature;
				}
				
				return firstFeature;
			}
				
			if ( firstFeature.getDirection() == PortDirection.OUT_LITERAL ) {
				return firstFeature;
			}

			if ( firstFeature.getDirection() == PortDirection.IN_LITERAL ) {
				return lastFeature;
			}

			if ( lastFeature.getDirection() == PortDirection.OUT_LITERAL ) {
				return lastFeature;
			}
			
			return firstFeature;
		}
		
		if ( obj1 instanceof Feature ) {
			final Enumerator direction = ( (Feature) obj1 ).getDirection();
			
			if (	PortDirection.OUT_LITERAL == direction ||
					AccessDirection.PROVIDED_LITERAL == direction ) {
				return obj1;
			}

			return obj2;
		} 

		if (obj2 instanceof Feature ) {
			return obj1;
		}
		
		return obj1;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKObject getSink() {
		SKObject sink = basicGetSink();
		return sink != null && sink.eIsProxy() ? (SKObject)eResolveProxy((InternalEObject)sink) : sink;
	}

	//	public SKObject getSink() {
//		final SKObject source = getSource();
//		
//		if ( source == null ) {
//			return null;
//		}
//		
//		final SKObject obj1 = getObjects().get( 0 );
//		final SKObject obj2 = getObjects().get( 1 );
//		
//		return obj2 != source ? obj2 : obj1;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKObject basicGetSink() {
		final SKObject source = getSource();
		
		if ( source == null ) {
			return null;
		}
		
		final SKObject obj1 = getObjects().get( 0 );
		final SKObject obj2 = getObjects().get( 1 );
		
		return obj2 != source ? obj2 : obj1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getOwningComponent() {
		Component owningComponent = basicGetOwningComponent();
		return owningComponent != null && owningComponent.eIsProxy() ? (Component)eResolveProxy((InternalEObject)owningComponent) : owningComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component basicGetOwningComponent() {
		return (Component) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getOriginalRelation() {
		Relation originalRelation = basicGetOriginalRelation();
		return originalRelation != null && originalRelation.eIsProxy() ? (Relation)eResolveProxy((InternalEObject)originalRelation) : originalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Relation basicGetOriginalRelation() {
		final Component parent = getOwningComponent();
		
		if ( parent != null ) {
			final Relation origRel = ADELEModelUtils.findElementByName( this, parent.getAllOriginalRelations() );
			
			if ( origRel != null ) {
				return origRel;
			}
		}

		return this;
	}
	
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

} //ADELE_RelationImpl