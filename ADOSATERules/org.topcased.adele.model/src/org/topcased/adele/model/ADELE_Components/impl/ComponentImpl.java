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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.topcased.adele.model.ADELE.util.ADELEModelUtils;
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsPackage;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Components.Package;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection;
import org.topcased.adele.model.ADELE_Relations.BusAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataAccessConnection;
import org.topcased.adele.model.ADELE_Relations.DataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventDataPortConnection;
import org.topcased.adele.model.ADELE_Relations.EventPortConnection;
import org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection;
import org.topcased.adele.model.ADELE_Relations.ParameterConnection;
import org.topcased.adele.model.ADELE_Relations.Relation;
import org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection;
import org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKFeature;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.impl.SKComponentImpl;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;
import org.topcased.adele.model.ba_relations.BATransition;
import org.topcased.adele.model.errors.UncompatibleRefinesReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ADELE Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getImplementationName <em>Implementation Name</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#isFeaturesLock <em>Features Lock</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#isSubcomponentsLock <em>Subcomponents Lock</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#isSubcomponentRefinement <em>Subcomponent Refinement</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getBaTransition <em>Ba Transition</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getEventDataPortConnection <em>Event Data Port Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getEventPortConnection <em>Event Port Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getDataPortConnection <em>Data Port Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getDataAccessConnection <em>Data Access Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getBusAccessConnection <em>Bus Access Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getSubprogramAccessConnection <em>Subprogram Access Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getParameterConnection <em>Parameter Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getSubprogramGroupAccessConnection <em>Subprogram Group Access Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getAbstractFeatureConnection <em>Abstract Feature Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getFeatureGroupConnection <em>Feature Group Connection</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getAllRefines <em>All Refines</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getRefinedSubcomponent <em>Refined Subcomponent</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getAllRealFeatures <em>All Real Features</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getAllRealChildrenComponents <em>All Real Children Components</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getOriginalComponent <em>Original Component</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getAllRelations <em>All Relations</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getAllRealRelations <em>All Real Relations</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getAllOriginalRelations <em>All Original Relations</em>}</li>
 *   <li>{@link org.topcased.adele.model.ADELE_Components.impl.ComponentImpl#getSubcomponentType <em>Subcomponent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends SKComponentImpl implements
		Component {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Component type;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected Component implementation;

	/**
	 * The default value of the '{@link #getImplementationName() <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImplementationName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getImplementationName() <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImplementationName()
	 * @generated
	 * @ordered
	 */
	protected String implementationName = IMPLEMENTATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isFeaturesLock() <em>Features Lock</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isFeaturesLock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FEATURES_LOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFeaturesLock() <em>Features Lock</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFeaturesLock()
	 * @generated
	 * @ordered
	 */
	protected boolean featuresLock = FEATURES_LOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #isSubcomponentsLock() <em>Subcomponents Lock</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSubcomponentsLock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBCOMPONENTS_LOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubcomponentsLock() <em>Subcomponents Lock</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSubcomponentsLock()
	 * @generated
	 * @ordered
	 */
	protected boolean subcomponentsLock = SUBCOMPONENTS_LOCK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Component refines;

	/**
	 * The default value of the '{@link #isSubcomponentRefinement() <em>Subcomponent Refinement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubcomponentRefinement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBCOMPONENT_REFINEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubcomponentRefinement() <em>Subcomponent Refinement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubcomponentRefinement()
	 * @generated
	 * @ordered
	 */
	protected boolean subcomponentRefinement = SUBCOMPONENT_REFINEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaTransition() <em>Ba Transition</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getBaTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<BATransition> baTransition;

	/**
	 * The cached value of the '{@link #getEventDataPortConnection()
	 * <em>Event Data Port Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEventDataPortConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDataPortConnection> eventDataPortConnection;

	/**
	 * The cached value of the '{@link #getEventPortConnection()
	 * <em>Event Port Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEventPortConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<EventPortConnection> eventPortConnection;

	/**
	 * The cached value of the '{@link #getDataPortConnection()
	 * <em>Data Port Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDataPortConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPortConnection> dataPortConnection;

	/**
	 * The cached value of the '{@link #getDataAccessConnection()
	 * <em>Data Access Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDataAccessConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAccessConnection> dataAccessConnection;

	/**
	 * The cached value of the '{@link #getBusAccessConnection()
	 * <em>Bus Access Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBusAccessConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<BusAccessConnection> busAccessConnection;

	/**
	 * The cached value of the '{@link #getSubprogramAccessConnection()
	 * <em>Subprogram Access Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubprogramAccessConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramAccessConnection> subprogramAccessConnection;

	/**
	 * The cached value of the '{@link #getParameterConnection()
	 * <em>Parameter Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParameterConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterConnection> parameterConnection;

	/**
	 * The cached value of the '{@link #getSubprogramGroupAccessConnection() <em>Subprogram Group Access Connection</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubprogramGroupAccessConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramGroupAccessConnection> subprogramGroupAccessConnection;

	/**
	 * The cached value of the '{@link #getAbstractFeatureConnection()
	 * <em>Abstract Feature Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAbstractFeatureConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFeatureConnection> abstractFeatureConnection;

	/**
	 * The cached value of the '{@link #getFeatureGroupConnection()
	 * <em>Feature Group Connection</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFeatureGroupConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureGroupConnection> featureGroupConnection;

	/**
	 * The cached value of the '{@link #getRefinedSubcomponent() <em>Refined Subcomponent</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRefinedSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected Component refinedSubcomponent;

	protected boolean dontHandleNextRename = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_ComponentsPackage.Literals.COMPONENT;
	}

	/**
	 * Test if the current element is an ADELE component
	 * 
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isADELE_Component() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(int newMultiplicity) {
		int oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Component)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ADELE_ComponentsPackage.COMPONENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Component newType) {
		Component oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component getImplementation() {
		if (implementation != null && implementation.eIsProxy()) {
			InternalEObject oldImplementation = (InternalEObject)implementation;
			implementation = (Component)eResolveProxy(oldImplementation);
			if (implementation != oldImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION, oldImplementation, implementation));
			}
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(Component newImplementation) {
		Component oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationName() {
		return implementationName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationName(String newImplementationName) {
		String oldImplementationName = implementationName;
		implementationName = newImplementationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION_NAME, oldImplementationName, implementationName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFeaturesLock() {
		return featuresLock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturesLock(boolean newFeaturesLock) {
		boolean oldFeaturesLock = featuresLock;
		featuresLock = newFeaturesLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__FEATURES_LOCK, oldFeaturesLock, featuresLock));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubcomponentsLock() {
		return subcomponentsLock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubcomponentsLock(boolean newSubcomponentsLock) {
		boolean oldSubcomponentsLock = subcomponentsLock;
		subcomponentsLock = newSubcomponentsLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENTS_LOCK, oldSubcomponentsLock, subcomponentsLock));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (Component)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ADELE_ComponentsPackage.COMPONENT__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(Component newRefines) {
		Component oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__REFINES, oldRefines, refines));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubcomponentRefinement() {
		return subcomponentRefinement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubcomponentRefinement(boolean newSubcomponentRefinement) {
		boolean oldSubcomponentRefinement = subcomponentRefinement;
		subcomponentRefinement = newSubcomponentRefinement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENT_REFINEMENT, oldSubcomponentRefinement, subcomponentRefinement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BATransition> getBaTransition() {
		if (baTransition == null) {
			baTransition = new EObjectContainmentEList<BATransition>(BATransition.class, this, ADELE_ComponentsPackage.COMPONENT__BA_TRANSITION);
		}
		return baTransition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventDataPortConnection> getEventDataPortConnection() {
		if (eventDataPortConnection == null) {
			eventDataPortConnection = new EObjectContainmentEList<EventDataPortConnection>(EventDataPortConnection.class, this, ADELE_ComponentsPackage.COMPONENT__EVENT_DATA_PORT_CONNECTION);
		}
		return eventDataPortConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventPortConnection> getEventPortConnection() {
		if (eventPortConnection == null) {
			eventPortConnection = new EObjectContainmentEList<EventPortConnection>(EventPortConnection.class, this, ADELE_ComponentsPackage.COMPONENT__EVENT_PORT_CONNECTION);
		}
		return eventPortConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPortConnection> getDataPortConnection() {
		if (dataPortConnection == null) {
			dataPortConnection = new EObjectContainmentEList<DataPortConnection>(DataPortConnection.class, this, ADELE_ComponentsPackage.COMPONENT__DATA_PORT_CONNECTION);
		}
		return dataPortConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataAccessConnection> getDataAccessConnection() {
		if (dataAccessConnection == null) {
			dataAccessConnection = new EObjectContainmentEList<DataAccessConnection>(DataAccessConnection.class, this, ADELE_ComponentsPackage.COMPONENT__DATA_ACCESS_CONNECTION);
		}
		return dataAccessConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusAccessConnection> getBusAccessConnection() {
		if (busAccessConnection == null) {
			busAccessConnection = new EObjectContainmentEList<BusAccessConnection>(BusAccessConnection.class, this, ADELE_ComponentsPackage.COMPONENT__BUS_ACCESS_CONNECTION);
		}
		return busAccessConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubprogramAccessConnection> getSubprogramAccessConnection() {
		if (subprogramAccessConnection == null) {
			subprogramAccessConnection = new EObjectContainmentEList<SubprogramAccessConnection>(SubprogramAccessConnection.class, this, ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION);
		}
		return subprogramAccessConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterConnection> getParameterConnection() {
		if (parameterConnection == null) {
			parameterConnection = new EObjectContainmentEList<ParameterConnection>(ParameterConnection.class, this, ADELE_ComponentsPackage.COMPONENT__PARAMETER_CONNECTION);
		}
		return parameterConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubprogramGroupAccessConnection> getSubprogramGroupAccessConnection() {
		if (subprogramGroupAccessConnection == null) {
			subprogramGroupAccessConnection = new EObjectContainmentEList<SubprogramGroupAccessConnection>(SubprogramGroupAccessConnection.class, this, ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION);
		}
		return subprogramGroupAccessConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFeatureConnection> getAbstractFeatureConnection() {
		if (abstractFeatureConnection == null) {
			abstractFeatureConnection = new EObjectContainmentEList<AbstractFeatureConnection>(AbstractFeatureConnection.class, this, ADELE_ComponentsPackage.COMPONENT__ABSTRACT_FEATURE_CONNECTION);
		}
		return abstractFeatureConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureGroupConnection> getFeatureGroupConnection() {
		if (featureGroupConnection == null) {
			featureGroupConnection = new EObjectContainmentEList<FeatureGroupConnection>(FeatureGroupConnection.class, this, ADELE_ComponentsPackage.COMPONENT__FEATURE_GROUP_CONNECTION);
		}
		return featureGroupConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Component> getAllRefines() {
		final EList<Component> allRefines = new EObjectEList<Component>(
				Component.class, this,
				ADELE_ComponentsPackage.COMPONENT__ALL_REFINES) {
			private static final long serialVersionUID = -4874703841538162705L;

			@Override
			protected boolean isNotificationRequired() {
				return false;
			}
		};

		if ( getRefines() != null ) {
			allRefines.add( getRefines() );
			allRefines.addAll( getRefines().getAllRefines() );
		}

		return allRefines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component getRefinedSubcomponent() {
		if ( isSubcomponent() && getParent() instanceof Component ) {
			final String searchedName = getName();
				
			if ( searchedName != null ) {
				for ( final Component extendedCompo : ( (Component) getParent() ).getAllRefines() ) {
					for ( final SKHierarchicalObject children : extendedCompo.getChildren() ) {
						if ( children instanceof Component ) {
							final Component subcompo = (Component) children;
	
							if ( 	searchedName.equalsIgnoreCase( subcompo.getName() ) &&
									( !subcompo.isSubcomponentRefinement() || subcompo.getRefinedSubcomponent() != null ) &&
									 			// Refinement just changes the category	
									( getRefines() != null || subcompo.eClass() != eClass() ) ) {
								return subcompo;
							}
						}
					}
				}
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedSubcomponent(Component newRefinedSubcomponent) {
		Component oldRefinedSubcomponent = refinedSubcomponent;
		refinedSubcomponent = newRefinedSubcomponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ADELE_ComponentsPackage.COMPONENT__REFINED_SUBCOMPONENT, oldRefinedSubcomponent, refinedSubcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component basicGetSubcomponentType() {
		final Component refinedType = getRefines();
		
		if ( refinedType != null ) {
			return refinedType;
		}
		
		final Component refinedSubcompo = getRefinedSubcomponent();
			
		if ( refinedSubcompo == null ) {
			return getType();
		}
		
		if ( refinedSubcompo.getRefines() != null ) {
			return refinedSubcompo.getRefines();
		}
			
		return refinedSubcompo.getSubcomponentType();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Returns the list of all real features (not cloned).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SKFeature> getAllRealFeatures() {
		final EList<SKFeature> allFeatures = new EObjectEList<SKFeature>(
				SKFeature.class, this,
				ADELE_ComponentsPackage.COMPONENT__ALL_REAL_FEATURES ) {
			private static final long serialVersionUID = 1L;

			@Override
			protected boolean isNotificationRequired() {
				return false;
			}
		};

		final Component compType;

		if ( isSubcomponent() ) {
			compType = getSubcomponentType();
		}
		else if ( isImplementation() ) {
			compType = getType();
		} 
		else {
			compType = this;
		}

		if (compType != null) {
			for (final SKFeature skFeature : compType.getFeatures()) {
				if ( skFeature instanceof Feature ) {
					final Feature feature = (Feature) skFeature;

					if ( 	( !feature.isRefinement() || feature.getRefinedFeature() != null ) && 
							ADELEModelUtils.findElementByName( feature, allFeatures ) == null ) {
						allFeatures.add( feature );
					}
				}
				else {
					allFeatures.add( skFeature );
				}
			}

			if ( compType.getRefines() != null ) {
				for (final SKFeature skFeature : compType.getRefines().getAllRealFeatures() ) {
					if ( ADELEModelUtils.findElementByName( skFeature, allFeatures ) == null ) {
						allFeatures.add( skFeature );
					}
				}
			}
		}

		if ( getRefines() != null ) {
			for ( final SKFeature inheritedFeat : getRefines().getAllRealFeatures() ) {
				if ( ADELEModelUtils.findElementByName( inheritedFeat, allFeatures ) == null ) {
					allFeatures.add( inheritedFeat );
				}
			}
		}

		return allFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSubcomponent() {
		return getLevel() > 2;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Returns all real children of the component. The ones that are not cloned.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SKComponent> getAllRealChildrenComponents() {
		final EList<SKComponent> allChildrenCompos = new EObjectEList<SKComponent>(
				SKComponent.class, this,
				ADELE_ComponentsPackage.COMPONENT__ALL_REAL_CHILDREN_COMPONENTS) {
			private static final long serialVersionUID = 1L;

			@Override
			protected boolean isNotificationRequired() {
				return false;
			}
		};

		for ( final SKHierarchicalObject skChildren : getChildren() ) {
			if ( skChildren instanceof SKComponent ) {
				final SKComponent skChildCompo = (SKComponent) skChildren;

				if ( skChildCompo instanceof Component ) {
					final Component childCompo = (Component) skChildren;
	
					if ( !childCompo.isSubcomponentRefinement() || childCompo.getRefinedSubcomponent() != null  ) {
						allChildrenCompos.add(childCompo);
					}
				}
				else {
					allChildrenCompos.add( skChildCompo );
				}
			}
		}

		if ( getRefines() != null && !isType() ) {
			for ( final SKComponent inheritedComp : getRefines().getAllRealChildrenComponents() ) {
				if ( ADELEModelUtils.findElementByName( inheritedComp, allChildrenCompos ) == null ) {
					allChildrenCompos.add( inheritedComp );
				}
			}
		}

		return allChildrenCompos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getOriginalComponent() {
		Component originalComponent = basicGetOriginalComponent();
		return originalComponent != null && originalComponent.eIsProxy() ? (Component)eResolveProxy((InternalEObject)originalComponent) : originalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component basicGetOriginalComponent() {
		final String compName = getName();
		
		if ( getRefinedSubcomponent() == null && compName != null && getParent() instanceof Component ) {
			final Component parentSubCompo = getOriginalComponent( ( (Component) getParent() ).getRefines() );
			
			if ( parentSubCompo != null ) {
				return parentSubCompo;
			}
		}
		
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Relation> getAllRelations() {
		final EList<Relation> allRelations = new EObjectEList<Relation>(	Relation.class, 
																			this,
																			ADELE_ComponentsPackage.COMPONENT__ALL_RELATIONS);
		allRelations.addAll( getAbstractFeatureConnection() );
		allRelations.addAll( getBusAccessConnection() );
		allRelations.addAll( getDataAccessConnection() );
		allRelations.addAll( getDataPortConnection() );
		allRelations.addAll( getEventDataPortConnection() );
		allRelations.addAll( getEventPortConnection() );
		allRelations.addAll( getFeatureGroupConnection() );
		allRelations.addAll( getParameterConnection() );
		allRelations.addAll( getSubprogramAccessConnection() );
		allRelations.addAll( getSubprogramGroupAccessConnection() );
		
		return allRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Relation> getAllRealRelations() {
		final EList<Relation> allRealRelations = new EObjectEList<Relation>(	Relation.class, 
																				this,
																				ADELE_ComponentsPackage.COMPONENT__ALL_REAL_RELATIONS);
		allRealRelations.addAll( getAllOriginalRelations() );
		
		if ( getRefines() != null ) {
			allRealRelations.removeAll( getRefines().getAllOriginalRelations() );
		}
		
		return allRealRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Relation> getAllOriginalRelations() {
		final EList<Relation> allOriginalRelations = new EObjectEList<Relation>(	Relation.class, 
																					this,
																					ADELE_ComponentsPackage.COMPONENT__ALL_ORIGINAL_RELATIONS );
		
		if ( getRefines() != null ) {
			allOriginalRelations.addAll( getRefines().getAllOriginalRelations() );
		}

		for ( final Relation relation : getAllRelations() ) {
			if  ( ADELEModelUtils.findElementByName( relation, allOriginalRelations ) == null ) {
				allOriginalRelations.add( relation );
			}
		}
		
		return allOriginalRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getSubcomponentType() {
		Component subcomponentType = basicGetSubcomponentType();
		return subcomponentType != null && subcomponentType.eIsProxy() ? (Component)eResolveProxy((InternalEObject)subcomponentType) : subcomponentType;
	}

	private Component getOriginalComponent( final Component p_component ) {
		if ( p_component != null ) {
			final String compName = getName();
		
			for ( final SKHierarchicalObject child : p_component.getChildren() ) {
				if ( compName.equalsIgnoreCase( child.getName() ) && child instanceof Component ) {
					final Component subCompo = (Component) child;
					final Component origSubcompo = subCompo.getOriginalComponent();
					
					return origSubcompo == null? subCompo : origSubcompo;
				}
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setRefinesValidated(Component newRefines)
			throws UncompatibleRefinesReference {
		if (newRefines != null) {
			EList<SKHierarchicalObject> refinedCompoChildren = newRefines.getChildren();
			
			for (int i = 0; i < refinedCompoChildren.size(); i++) {
				for (int j = 0; j < getChildren().size(); j++) {
					if (refinedCompoChildren.get(i).getName().equalsIgnoreCase( getChildren().get(j).getName())) {
						if (refinedCompoChildren.get(i).getClass() == getChildren().get(j).getClass()) {
							checkRefinementFeatures(	(SKComponent) refinedCompoChildren.get(i),
														(SKComponent) getChildren().get(j) );
						}
						else {
							throw new UncompatibleRefinesReference(	"Uncompatibility between subcomponents in the classifiers.");
						}
					}
				}
			}

			EList<SKFeature> refinedCompoFeatures = newRefines.getFeatures();
			for (int i = 0; i < refinedCompoFeatures.size(); i++) {
				for (int j = 0; j < getFeatures().size(); j++) {
					if (refinedCompoFeatures.get(i).getName()
							.equalsIgnoreCase( getFeatures().get(j).getName()))
						checkRefinementFeature(refinedCompoFeatures.get(i),	getFeatures().get(j));
				}
			}
		}

		setRefines(newRefines);
		// if (newRefines!=null && newRefines.getType()!=null)
		// setType(newRefines.getType());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void checkRefinementFeatures(SKComponent refinedChild,
			SKComponent localChild) throws UncompatibleRefinesReference {
		EList<SKFeature> refinedChildFeatures = refinedChild.getFeatures();
		EList<SKFeature> localChildFeatures = localChild.getFeatures();

		for (int i = 0; i < refinedChildFeatures.size(); i++) {
			boolean missingFeature = true;
			for (int j = 0; j < localChildFeatures.size(); j++) {
				if (refinedChildFeatures.get(i).getName()
						.equalsIgnoreCase(localChildFeatures.get(j).getName())) {
					checkRefinementFeature(refinedChildFeatures.get(i),
							localChildFeatures.get(j));
					missingFeature = false;
				}
			}
			if (missingFeature)
				throw new UncompatibleRefinesReference("Feature "
						+ refinedChildFeatures.get(i).getName()
						+ " is missing in the target classifier: "
						+ localChild.getName() + ".");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void checkRefinementFeature(	SKFeature refinedFeature,
											SKFeature localFeature)
	throws UncompatibleRefinesReference {

		if (refinedFeature.getName().equalsIgnoreCase(localFeature.getName())) {
			boolean error = false;
			error = error
					|| refinedFeature.getClass() != localFeature.getClass();

			try {
				Method method = refinedFeature.getClass().getMethod(
						"getDirection", (Class[]) null);
				Object refinedDirection = method.invoke(refinedFeature,
						(Object[]) null);
				Object localDirection = method.invoke(localFeature,
						(Object[]) null);
				error = error || refinedDirection != localDirection;
			} catch (SecurityException e) {
			} catch (NoSuchMethodException e) {
			} catch (IllegalArgumentException e) {
			} catch (IllegalAccessException e) {
			} catch (InvocationTargetException e) {
			}

			error = error
					|| ((Feature) refinedFeature).getClassifier() != ((Feature) localFeature)
							.getClassifier();

			if (error)
				throw new UncompatibleRefinesReference(
						"Uncompatibility between refined feature "
								+ refinedFeature.getName()
								+ " from classifier "
								+ refinedFeature.getComponent().getName()
								+ " and feature " + localFeature.getName()
								+ " from classifier "
								+ localFeature.getComponent().getName() + ".");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Component getClassifier() {
		if (implementation != null)
			return implementation;
		else if (type != null)
			return type;
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isType() {
		return (implementation == null &&
		// DB: This was also returning true for subcomponents
				type == null && getLevel() == 1) || implementationName != "";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isImplementation() {
		return (implementation == null && type != null)
				|| implementationName != "";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isInstance() {
		boolean res = (implementation != null || implementationName != "");
		if (eContainer != null && eContainer instanceof Component)
			res = res || ((Component) eContainer()).isImplementation();
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isClassifier() {
		return (isImplementation() || isType());
	}

	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// public String aadlSerialization(String packageName, ResourceSet res,
	// SKODSFactory odStructure) {
	// // TODO: implement this method
	// // Ensure that you remove @generated or mark it @generated NOT
	// throw new UnsupportedOperationException();
	// }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	// public String aadlSerialization(String packageName,ResourceSet res,
	// SKODSFactory odStructure) {
	// String aadl="";
	// if (isInstance()) {
	//
	// if (eContainer instanceof ADELE_Component &&
	// ((ADELE_Component)eContainer).getName().contains(".") ) {
	// } else {
	// if (getClassifier()==null || ( getRefines()!=null &&
	// !((ADELE_Component)eContainer()).getName().contains(".")) ) {
	// aadl += aadlComponentTypeSerialization(packageName, res,odStructure);
	// aadl += aadlComponentImplementationSerialization(packageName,
	// res,odStructure);
	// }
	// }
	//
	// aadl += aadlSubcomponentSerialization(packageName, res,odStructure);
	//
	// } else {
	// if (isType()) {
	// aadl += aadlComponentTypeSerialization(packageName, res,odStructure);
	// aadl += calculateODSFacts(odStructure, packageName, name, "NIL");
	// }
	// if (isImplementation()) {
	// aadl += aadlComponentImplementationSerialization(packageName,
	// res,odStructure);
	//
	// StringTokenizer tok = new StringTokenizer(name, ".");
	// aadl += calculateODSFacts(odStructure, packageName, tok.nextToken(),
	// tok.nextToken());
	// }
	// }
	// return aadl;
	// }
	//
	// private String aadlComponentTypeSerialization(String
	// packageName,ResourceSet res, SKODSFactory odStructure) {
	// String aadl="";
	// String refinedFullname ="NIL";
	// ADELE_Component refinedCompo = getRefines();
	// String typeGeneratingName = name;
	//
	// if (isInstance()) {
	// typeGeneratingName = typeGeneratingName+"_" + getId().replaceAll("-",
	// "_");
	// }
	//
	// if (refinedCompo != null) {
	// refinedFullname = ADELEModelUtils.getFullNamespace(refinedCompo)+
	// ( new StringTokenizer(refinedCompo.getName(), ".").nextToken());
	// if (refinedCompo.isInstance())
	// refinedFullname = refinedFullname + "_" +
	// refinedCompo.getId().replaceAll("-", "_");
	// }
	//
	// aadl +=
	// "isComponentType('"+packageName+"','PUBLIC','"+typeGeneratingName+"','"+
	// getClassName() +"','" +refinedFullname+ "',0).\n";
	//
	// aadl += aadlFeatureSerialization(packageName, res,odStructure);
	//
	// if (eContainer() instanceof ADELE_Package) {
	// for (SKComponent child : getChildren()) {
	// aadl += ( (ADELE_Component)child
	// ).aadlSerialization(packageName,res,odStructure);
	// }
	// }
	//
	// return aadl;
	// }
	//
	// private String aadlComponentImplementationSerialization(String
	// packageName,ResourceSet res, SKODSFactory odStructure) {
	// String aadl="";
	// String type = "NIL";
	// String implementation = "NIL";
	// String typeRefined = "NIL";
	// String implRefined = "NIL";
	//
	// if (isInstance()) {
	// type =name+"_" + getId().replaceAll("-", "_");
	// implementation = ( (getImplementationName()!="") ?
	// getImplementationName() : "impl");
	// } else {
	// type = ( (getClassifier()!=null) ?
	// ADELEModelUtils.getFullNamespace(getClassifier())+getClassifier().getName()
	// : "NIL" );
	// implementation = name.substring(name.indexOf(".")+1);
	// }
	//
	// ADELE_Component ref = getRefines();
	// if (ref!=null) {
	// StringTokenizer tok = new StringTokenizer(ref.getName(), ".");
	// typeRefined =
	// ADELEModelUtils.getFullNamespaceByEContainer(ref)+tok.nextToken();
	// if (ref.isInstance())
	// typeRefined = typeRefined + "_" + ref.getId().replaceAll("-", "_");
	// if (tok.hasMoreTokens())
	// implRefined = tok.nextToken();
	// }
	//
	// aadl += "isComponentImplementation('"+packageName+"','PUBLIC','"+ type +
	// "','" + implementation +"','"+ getClassName()
	// +"','"+typeRefined+"','"+implRefined+"',0).\n";
	//
	// for (SKComponent child : getChildren()) {
	// if (child instanceof ADELE_Component)
	// aadl += ( (ADELE_Component)child
	// ).aadlSerialization(packageName,res,odStructure);
	// }
	//
	// aadl += aadlConnectionSerialization(packageName, res,odStructure);
	//
	// aadl += aadlBASerialization(packageName, res,odStructure);
	//
	// return aadl;
	// }
	//
	// private String aadlSubcomponentSerialization(String
	// packageName,ResourceSet res, SKODSFactory odStructure) {
	// String aadl="";
	// String refinedToClause = "NIL";
	//
	// if ( ((ADELE_Component)eContainer()).getRefines()!=null) {
	// if (isSubcomponentRefinement()) {
	// refinedToClause = "REFINED TO ";
	// EList<SKComponent> refinedSubcomponents =
	// ((ADELE_Component)eContainer()).getRefines().getChildren();
	// for (SKComponent subcompo : refinedSubcomponents) {
	// if (((ADELE_Component)subcompo).getName().equalsIgnoreCase(getName())){
	// if (((ADELE_Component)subcompo).getRefines()==getRefines())
	// return "";
	// break;
	// }
	// }
	// }
	// }
	//
	// String classifierName = "NIL";
	// String classifierPackage = "";
	// ADELE_Component classifier=null;
	// String component_type_identifier="NIL";
	// String component_implementation_identifier="NIL";
	// String componentPackage = packageName;
	//
	// if (getRefines()!=null)
	// classifier = ADELEModelUtils.resolve(getRefines(), res);
	// else if (getClassifier()!=null)
	// classifier = ADELEModelUtils.resolve(getClassifier(), res);
	//
	// if (classifier == null) {
	// if (eContainer instanceof ADELE_Component &&
	// ((ADELE_Component)eContainer).getName().contains(".") ) {
	// } else {
	// classifierName = name+"_" + getId().replaceAll("-", "_") + "." +
	// (getImplementationName()!="" ? getImplementationName() : "impl");
	// }
	// } else if (classifier.getName().contains(".") || classifier.eContainer()
	// instanceof ADELE_Package) {
	// classifierName = classifier.getName();
	// } else if (classifier.isInstance()) {
	// classifierName = classifier.getName()+"_" +
	// classifier.getId().replaceAll("-", "_") + "." +
	// classifier.getImplementationName();
	// } else {
	// classifierName = classifier.getName() + "." +
	// classifier.getImplementationName();
	// }
	// if (classifier != null) {
	// classifierPackage =
	// ADELEModelUtils.getFullNamespaceByEContainer(classifier);
	// }
	//
	// ADELE_Component containingCompo = (ADELE_Component) eContainer();
	// if (containingCompo.getName().contains(".")) {
	// StringTokenizer tok = new StringTokenizer(containingCompo.getName(),
	// ".");
	// component_type_identifier=tok.nextToken();
	// component_implementation_identifier=tok.nextToken();
	// } else if ( containingCompo.getClassifier()==null ) {
	// component_type_identifier=containingCompo.getName()+"_" +
	// containingCompo.getId().replaceAll("-", "_");
	// if (packageName.contains(":"))
	// componentPackage = packageName.substring(0,
	// packageName.lastIndexOf(":")-1);
	// component_implementation_identifier=containingCompo.getImplementationName();
	// if (component_implementation_identifier=="")
	// component_implementation_identifier="impl";
	// }
	//
	//
	// aadl += "isSubcomponent('"+componentPackage+"','"+
	// component_type_identifier +"','"+component_implementation_identifier+
	// "','"+name+"','"+getClassName()+"','"+ classifierPackage + classifierName
	// + "','NIL','"+refinedToClause+"',0).\n";
	//
	// aadl += calculateODSFacts(odStructure, packageName,
	// component_type_identifier, component_implementation_identifier);
	//
	// return aadl;
	// }
	//
	// private String aadlFeatureSerialization(String packageName,ResourceSet
	// res, SKODSFactory odStructure) {
	// String aadl = "";
	// String typeGeneratingName = name;
	//
	// if (isInstance()) {
	// typeGeneratingName = typeGeneratingName+"_" + getId().replaceAll("-",
	// "_");
	// }
	//
	// EList<SKFeature> refinedFeatures = new BasicEList<SKFeature>();
	// EList<SKFeature> localFeatures = new BasicEList<SKFeature>();
	// ADELE_Component refinedType=getRefines();
	//
	// if (refinedType!=null && !refinedType.isType())
	// refinedType=refinedType.getType();
	//
	// for (SKFeature localFeature : getFeatures()) {
	// String localFeatureName = localFeature.getName();
	// boolean isRefined = false;
	// boolean isInherited = false;
	// if (refinedType!=null) {
	// for (SKFeature refinedFeature : refinedType.getFeatures()) {
	// if (refinedFeature.getName().equalsIgnoreCase(localFeatureName)){
	// if
	// (((ADELE_Feature)localFeature).getClassifier()!=((ADELE_Feature)refinedFeature).getClassifier()){
	// isRefined = true;
	// refinedFeatures.add(localFeature);
	// } else {
	// isInherited = true;
	// }
	// break;
	// }
	// }
	// }
	// if (isRefined) {
	// isRefined = false;
	// } else if (!isInherited) {
	// localFeatures.add(localFeature);
	// } else {
	// isInherited = false;
	// }
	// }
	//
	//
	// for (SKFeature feat : localFeatures) {
	// if (feat instanceof ADELE_Feature)
	// aadl += ( (ADELE_Feature)feat
	// ).aadlSerialization(packageName,typeGeneratingName,res,odStructure,false);
	// }
	// for (SKFeature feat : refinedFeatures) {
	// if (feat instanceof ADELE_Feature)
	// aadl += ( (ADELE_Feature)feat
	// ).aadlSerialization(packageName,typeGeneratingName,res,odStructure,true);
	// }
	//
	// return aadl;
	// }
	//
	// protected String aadlConnectionSerialization(String
	// packageName,ResourceSet res, SKODSFactory odStructure) {
	// String aadl="";
	// String component_type_identifier="NIL";
	// String component_implementation_identifier="NIL";
	//
	// if (getName().contains(".")) {
	// StringTokenizer tok = new StringTokenizer(getName(), ".");
	// component_type_identifier=tok.nextToken();
	// component_implementation_identifier=tok.nextToken();
	// } else {
	// component_type_identifier=getName()+"_" + getId().replaceAll("-", "_");
	// component_implementation_identifier=getImplementationName();
	// if (component_implementation_identifier=="")
	// component_implementation_identifier="impl";
	// }
	//
	// EList<ADELE_Relation> allConnections = new BasicEList<ADELE_Relation>();
	// allConnections.addAll(getAbstractFeatureConnection());
	// allConnections.addAll(getBusAccessConnection());
	// allConnections.addAll(getDataAccessConnection());
	// allConnections.addAll(getDataPortConnection());
	// allConnections.addAll(getEventDataPortConnection());
	// allConnections.addAll(getEventPortConnection());
	// allConnections.addAll(getParameterConnection());
	// allConnections.addAll(getSubprogramAccessConnection());
	// allConnections.addAll(getSubprogramGroupAccessConnection());
	// allConnections.addAll(getFeatureGroupConnection());
	//
	// for (ADELE_Relation cnx : allConnections) {
	// aadl += cnx.aadlSerialization(packageName,
	// component_type_identifier+"."+component_implementation_identifier,
	// res,odStructure);
	// }
	//
	// return aadl;
	// }
	//
	// private String aadlBASerialization(String packageName,ResourceSet res,
	// SKODSFactory odStructure) {
	// String aadl = "";
	//
	// for (SKFeature variable : getFeatures()) {
	// if (variable instanceof BAVariable)
	// aadl += ((BAVariable)variable).aadlSerialization(packageName, getId(),
	// res,odStructure);
	// }
	//
	// for (SKComponent state: getChildren()) {
	// if (state instanceof BAState)
	// aadl += ((BAState)state).aadlSerialization(packageName, getId(),
	// res,odStructure);
	// }
	//
	// for (BATransition batransition : getBaTransition()) {
	// aadl += batransition.aadlSerialization(packageName, getId(),
	// res,odStructure);
	// }
	//
	// if (aadl != "") {
	// String component_type_identifier="NIL";
	// String component_implementation_identifier="NIL";
	//
	// if (getName().contains(".")) {
	// StringTokenizer tok = new StringTokenizer(getName(), ".");
	// component_type_identifier=tok.nextToken();
	// component_implementation_identifier=tok.nextToken();
	// } else {
	// component_type_identifier=getName()+"_" + getId().replaceAll("-", "_");
	// component_implementation_identifier=getImplementationName();
	// if (component_implementation_identifier=="")
	// component_implementation_identifier="impl";
	// }
	//
	// aadl += "isAnnex('"+packageName+"','"+component_type_identifier+"','"+
	// component_implementation_identifier+"','"+getId()+"','Behavior Annex','','0').\n";
	// }
	//
	// return aadl;
	// }
	//
	// private String calculateODSFacts(SKODSFactory odStructure, String
	// packageName, String component_type_identifier, String
	// component_implementation_identifier){
	// String aadl = "";
	//
	// try {
	// SKODSystem odSystem =
	// odStructure.getODSystem(odStructure.getODSystemsId().get(0),
	// (SKHierarchicalObject)this);
	// SKODSection aadlPropertiesSection =
	// getAadlPropertiesSection(odSystem.getSections());
	//
	// for (SKODSection section : aadlPropertiesSection.getChildren()){
	// aadl += calculateODSectionFacts(section.getChildren(),
	// odSystem,packageName, component_type_identifier,
	// component_implementation_identifier,section.getId());
	// }
	// } catch (SKODSFactoryException e) {
	// System.err.println(e.getMessage());
	// }
	//
	// return aadl;
	// }
	//
	// private SKODSection getAadlPropertiesSection(EList<SKODSection> sections)
	// {
	// SKODSection res = null;
	//
	// for (SKODSection section : sections) {
	// if (section.getId().equalsIgnoreCase("PROPERTIES"))
	// res = section;
	// else
	// res = getAadlPropertiesSection( (section.getChildren());
	// if (res!=null)
	// break;
	// }
	// return res;
	// }
	//
	// private String calculateODSectionFacts(EList<SKODSection> sections,
	// SKODSystem odSystem,
	// String packageName, String component_type_identifier,
	// String component_implementation_identifier, String parentSection) {
	// String aadl = "";
	//
	// for (SKODSection section: sections){
	// SKODData tmp = section.getData();
	// String odsName = section.getId();
	// if (tmp!=null && tmp.getValue()!="") {
	// String constantType = "NIL"; // either NIL or CONSTANT
	// String assignType = "=>"; // either => or +=> or APPLIES TO
	// String instanceName ="NIL";
	//
	// if (isInstance()) {
	// instanceName = name;
	// assignType = "APPLIES TO";
	// }
	//
	// aadl +=
	// "isProperty('"+constantType+"','"+assignType+"','"+packageName+"','"+
	// component_type_identifier+"','"+component_implementation_identifier+"','"+
	// instanceName+"','"+ parentSection +"::"+
	// odsName+"','"+tmp.getValue()+"','0').\n";
	//
	// }
	// aadl += calculateODSectionFacts(section.getChildren(),
	// odSystem,packageName, component_type_identifier,
	// component_implementation_identifier,odsName);
	// }
	//
	// return aadl;
	// }

	public String getClassName() {
		return eClass().getName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ADELE_ComponentsPackage.COMPONENT__BA_TRANSITION:
				return ((InternalEList<?>)getBaTransition()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__EVENT_DATA_PORT_CONNECTION:
				return ((InternalEList<?>)getEventDataPortConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__EVENT_PORT_CONNECTION:
				return ((InternalEList<?>)getEventPortConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__DATA_PORT_CONNECTION:
				return ((InternalEList<?>)getDataPortConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__DATA_ACCESS_CONNECTION:
				return ((InternalEList<?>)getDataAccessConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__BUS_ACCESS_CONNECTION:
				return ((InternalEList<?>)getBusAccessConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION:
				return ((InternalEList<?>)getSubprogramAccessConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__PARAMETER_CONNECTION:
				return ((InternalEList<?>)getParameterConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION:
				return ((InternalEList<?>)getSubprogramGroupAccessConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__ABSTRACT_FEATURE_CONNECTION:
				return ((InternalEList<?>)getAbstractFeatureConnection()).basicRemove(otherEnd, msgs);
			case ADELE_ComponentsPackage.COMPONENT__FEATURE_GROUP_CONNECTION:
				return ((InternalEList<?>)getFeatureGroupConnection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ADELE_ComponentsPackage.COMPONENT__MULTIPLICITY:
				return getMultiplicity();
			case ADELE_ComponentsPackage.COMPONENT__MIN:
				return getMin();
			case ADELE_ComponentsPackage.COMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION:
				if (resolve) return getImplementation();
				return basicGetImplementation();
			case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION_NAME:
				return getImplementationName();
			case ADELE_ComponentsPackage.COMPONENT__FEATURES_LOCK:
				return isFeaturesLock();
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENTS_LOCK:
				return isSubcomponentsLock();
			case ADELE_ComponentsPackage.COMPONENT__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENT_REFINEMENT:
				return isSubcomponentRefinement();
			case ADELE_ComponentsPackage.COMPONENT__BA_TRANSITION:
				return getBaTransition();
			case ADELE_ComponentsPackage.COMPONENT__EVENT_DATA_PORT_CONNECTION:
				return getEventDataPortConnection();
			case ADELE_ComponentsPackage.COMPONENT__EVENT_PORT_CONNECTION:
				return getEventPortConnection();
			case ADELE_ComponentsPackage.COMPONENT__DATA_PORT_CONNECTION:
				return getDataPortConnection();
			case ADELE_ComponentsPackage.COMPONENT__DATA_ACCESS_CONNECTION:
				return getDataAccessConnection();
			case ADELE_ComponentsPackage.COMPONENT__BUS_ACCESS_CONNECTION:
				return getBusAccessConnection();
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION:
				return getSubprogramAccessConnection();
			case ADELE_ComponentsPackage.COMPONENT__PARAMETER_CONNECTION:
				return getParameterConnection();
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION:
				return getSubprogramGroupAccessConnection();
			case ADELE_ComponentsPackage.COMPONENT__ABSTRACT_FEATURE_CONNECTION:
				return getAbstractFeatureConnection();
			case ADELE_ComponentsPackage.COMPONENT__FEATURE_GROUP_CONNECTION:
				return getFeatureGroupConnection();
			case ADELE_ComponentsPackage.COMPONENT__ALL_REFINES:
				return getAllRefines();
			case ADELE_ComponentsPackage.COMPONENT__REFINED_SUBCOMPONENT:
				return getRefinedSubcomponent();
			case ADELE_ComponentsPackage.COMPONENT__ALL_REAL_FEATURES:
				return getAllRealFeatures();
			case ADELE_ComponentsPackage.COMPONENT__ALL_REAL_CHILDREN_COMPONENTS:
				return getAllRealChildrenComponents();
			case ADELE_ComponentsPackage.COMPONENT__ORIGINAL_COMPONENT:
				if (resolve) return getOriginalComponent();
				return basicGetOriginalComponent();
			case ADELE_ComponentsPackage.COMPONENT__ALL_RELATIONS:
				return getAllRelations();
			case ADELE_ComponentsPackage.COMPONENT__ALL_REAL_RELATIONS:
				return getAllRealRelations();
			case ADELE_ComponentsPackage.COMPONENT__ALL_ORIGINAL_RELATIONS:
				return getAllOriginalRelations();
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENT_TYPE:
				if (resolve) return getSubcomponentType();
				return basicGetSubcomponentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ADELE_ComponentsPackage.COMPONENT__MULTIPLICITY:
				setMultiplicity((Integer)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__MIN:
				setMin((Integer)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__TYPE:
				setType((Component)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION:
				setImplementation((Component)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION_NAME:
				setImplementationName((String)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__FEATURES_LOCK:
				setFeaturesLock((Boolean)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENTS_LOCK:
				setSubcomponentsLock((Boolean)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__REFINES:
				setRefines((Component)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENT_REFINEMENT:
				setSubcomponentRefinement((Boolean)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__BA_TRANSITION:
				getBaTransition().clear();
				getBaTransition().addAll((Collection<? extends BATransition>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__EVENT_DATA_PORT_CONNECTION:
				getEventDataPortConnection().clear();
				getEventDataPortConnection().addAll((Collection<? extends EventDataPortConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__EVENT_PORT_CONNECTION:
				getEventPortConnection().clear();
				getEventPortConnection().addAll((Collection<? extends EventPortConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__DATA_PORT_CONNECTION:
				getDataPortConnection().clear();
				getDataPortConnection().addAll((Collection<? extends DataPortConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__DATA_ACCESS_CONNECTION:
				getDataAccessConnection().clear();
				getDataAccessConnection().addAll((Collection<? extends DataAccessConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__BUS_ACCESS_CONNECTION:
				getBusAccessConnection().clear();
				getBusAccessConnection().addAll((Collection<? extends BusAccessConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION:
				getSubprogramAccessConnection().clear();
				getSubprogramAccessConnection().addAll((Collection<? extends SubprogramAccessConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__PARAMETER_CONNECTION:
				getParameterConnection().clear();
				getParameterConnection().addAll((Collection<? extends ParameterConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION:
				getSubprogramGroupAccessConnection().clear();
				getSubprogramGroupAccessConnection().addAll((Collection<? extends SubprogramGroupAccessConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__ABSTRACT_FEATURE_CONNECTION:
				getAbstractFeatureConnection().clear();
				getAbstractFeatureConnection().addAll((Collection<? extends AbstractFeatureConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__FEATURE_GROUP_CONNECTION:
				getFeatureGroupConnection().clear();
				getFeatureGroupConnection().addAll((Collection<? extends FeatureGroupConnection>)newValue);
				return;
			case ADELE_ComponentsPackage.COMPONENT__REFINED_SUBCOMPONENT:
				setRefinedSubcomponent((Component)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ADELE_ComponentsPackage.COMPONENT__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case ADELE_ComponentsPackage.COMPONENT__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case ADELE_ComponentsPackage.COMPONENT__TYPE:
				setType((Component)null);
				return;
			case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION:
				setImplementation((Component)null);
				return;
			case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION_NAME:
				setImplementationName(IMPLEMENTATION_NAME_EDEFAULT);
				return;
			case ADELE_ComponentsPackage.COMPONENT__FEATURES_LOCK:
				setFeaturesLock(FEATURES_LOCK_EDEFAULT);
				return;
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENTS_LOCK:
				setSubcomponentsLock(SUBCOMPONENTS_LOCK_EDEFAULT);
				return;
			case ADELE_ComponentsPackage.COMPONENT__REFINES:
				setRefines((Component)null);
				return;
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENT_REFINEMENT:
				setSubcomponentRefinement(SUBCOMPONENT_REFINEMENT_EDEFAULT);
				return;
			case ADELE_ComponentsPackage.COMPONENT__BA_TRANSITION:
				getBaTransition().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__EVENT_DATA_PORT_CONNECTION:
				getEventDataPortConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__EVENT_PORT_CONNECTION:
				getEventPortConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__DATA_PORT_CONNECTION:
				getDataPortConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__DATA_ACCESS_CONNECTION:
				getDataAccessConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__BUS_ACCESS_CONNECTION:
				getBusAccessConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION:
				getSubprogramAccessConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__PARAMETER_CONNECTION:
				getParameterConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION:
				getSubprogramGroupAccessConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__ABSTRACT_FEATURE_CONNECTION:
				getAbstractFeatureConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__FEATURE_GROUP_CONNECTION:
				getFeatureGroupConnection().clear();
				return;
			case ADELE_ComponentsPackage.COMPONENT__REFINED_SUBCOMPONENT:
				setRefinedSubcomponent((Component)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ADELE_ComponentsPackage.COMPONENT__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case ADELE_ComponentsPackage.COMPONENT__MIN:
				return min != MIN_EDEFAULT;
			case ADELE_ComponentsPackage.COMPONENT__TYPE:
				return type != null;
			case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION:
				return implementation != null;
			case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION_NAME:
				return IMPLEMENTATION_NAME_EDEFAULT == null ? implementationName != null : !IMPLEMENTATION_NAME_EDEFAULT.equals(implementationName);
			case ADELE_ComponentsPackage.COMPONENT__FEATURES_LOCK:
				return featuresLock != FEATURES_LOCK_EDEFAULT;
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENTS_LOCK:
				return subcomponentsLock != SUBCOMPONENTS_LOCK_EDEFAULT;
			case ADELE_ComponentsPackage.COMPONENT__REFINES:
				return refines != null;
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENT_REFINEMENT:
				return subcomponentRefinement != SUBCOMPONENT_REFINEMENT_EDEFAULT;
			case ADELE_ComponentsPackage.COMPONENT__BA_TRANSITION:
				return baTransition != null && !baTransition.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__EVENT_DATA_PORT_CONNECTION:
				return eventDataPortConnection != null && !eventDataPortConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__EVENT_PORT_CONNECTION:
				return eventPortConnection != null && !eventPortConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__DATA_PORT_CONNECTION:
				return dataPortConnection != null && !dataPortConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__DATA_ACCESS_CONNECTION:
				return dataAccessConnection != null && !dataAccessConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__BUS_ACCESS_CONNECTION:
				return busAccessConnection != null && !busAccessConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION:
				return subprogramAccessConnection != null && !subprogramAccessConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__PARAMETER_CONNECTION:
				return parameterConnection != null && !parameterConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION:
				return subprogramGroupAccessConnection != null && !subprogramGroupAccessConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__ABSTRACT_FEATURE_CONNECTION:
				return abstractFeatureConnection != null && !abstractFeatureConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__FEATURE_GROUP_CONNECTION:
				return featureGroupConnection != null && !featureGroupConnection.isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__ALL_REFINES:
				return !getAllRefines().isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__REFINED_SUBCOMPONENT:
				return refinedSubcomponent != null;
			case ADELE_ComponentsPackage.COMPONENT__ALL_REAL_FEATURES:
				return !getAllRealFeatures().isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__ALL_REAL_CHILDREN_COMPONENTS:
				return !getAllRealChildrenComponents().isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__ORIGINAL_COMPONENT:
				return basicGetOriginalComponent() != null;
			case ADELE_ComponentsPackage.COMPONENT__ALL_RELATIONS:
				return !getAllRelations().isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__ALL_REAL_RELATIONS:
				return !getAllRealRelations().isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__ALL_ORIGINAL_RELATIONS:
				return !getAllOriginalRelations().isEmpty();
			case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENT_TYPE:
				return basicGetSubcomponentType() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(", implementationName: ");
		result.append(implementationName);
		result.append(", featuresLock: ");
		result.append(featuresLock);
		result.append(", subcomponentsLock: ");
		result.append(subcomponentsLock);
		result.append(", subcomponentRefinement: ");
		result.append(subcomponentRefinement);
		result.append(')');
		return result.toString();
	}

	/*
	 * @Override public String getName() { if (getType()==null) return
	 * super.getName(); else return getType().getName()+"."+super.getName(); }
	 */

	@Override
	public boolean verify(String p_keyword)
			throws SKHierarchicalObjectException {
		if (p_keyword.equals("component"))
			return true;
		else
			return super.verify(p_keyword);
	}

	@Override
	public boolean validateName(String _name) {
		return validateName(_name, false);
	}

	protected boolean validateName(String _name, boolean force) {
		if (!force && getParent() != null
				&& ((Component) getParent()).getImplementation() != null) {
			return riseCannotRenameInstance();
		}
		if (!force && isSubcomponentRefinement()) {
			return riseCannotRenameRefine();
		}
		if (_name.contains(".") && !_name.startsWith(".")
				&& !_name.endsWith(".")) {
			if (_name.indexOf(".") == _name.lastIndexOf(".")
					&& ((oldName == "" && getParent() == null) || (getParent() != null
							&& getParent().getParent() != null && getParent()
							.getParent() instanceof Package))) {
				String type = _name.substring(0, _name.indexOf("."));
				String impl = _name.substring(_name.indexOf(".") + 1);
				if (!isValidIdentifierSyntax(type)
						|| !isValidIdentifierSyntax(impl))
					return riseNotAlphanumeric();
				if (getParent() != null && !type.equalsIgnoreCase( getParent().getName()))
					return riseWrongType(type, getParent().getName());
			} else
				return riseNotAlphanumeric();
		} else if (!isValidIdentifierSyntax(_name)) {
			return riseNotAlphanumeric();
		}

		if (getParent() != null) {
			// EList<SKComponent> brothers = getParent().getChildren();

			// TODO: Commented for TGG. Need to be moved somewhere else by
			// validation?
			// for ( final SKComponent brother : getParent().getChildren() ) {
			//
			// // DB: Do not this component since setting the new name with the
			// current name raises a false exception.
			// if ( brother != this && _name.equals( brother.getName() ) ) {
			// return riseNameAlreadyUsed(_name, getParent());
			// }
			// }
		}

		return true;
	}

	private boolean isValidIdentifierSyntax(final String s) {
		if (s == null || s == "")
			return true;
		char[] chars = s.toCharArray();
		char c = chars[0];
		boolean underline = false;
		if (!(((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'))))
			return false;
		for (int x = 1; x < chars.length; x++) {
			c = chars[x];
			if ((c >= 'a') && (c <= 'z')) {
				underline = false;
				continue; // lowercase
			}
			if ((c >= 'A') && (c <= 'Z')) {
				underline = false;
				continue; // uppercase
			}
			if ((c >= '0') && (c <= '9')) {
				underline = false;
				continue; // numeric
			}
			if (c == '_' && !underline) {
				underline = true;
				continue; // numeric
			}
			return false;
		}
		return !underline;
	}

//	private boolean riseNameAlreadyUsed(String _name, SKComponent comp) {
//		// final Status status = new Status(IStatus.ERROR, "plugin", 0,
//		// "Already used component name", null);
//		final String errorMessage = "The component " + comp.getName()
//				+ " already contains a component named " + _name;
//
//		openError("Component Name Already Used", "Component Name Already Used",
//				errorMessage);
//
//		// TODO: DB Temporarily return true to test.
//		return true;
//	}

	private void openError(final String p_dialogTitle,
			final String p_statusMessage, final String p_dialogMessage) {
		final Status status = new Status(IStatus.ERROR, "plugin", 0,
				p_statusMessage, null);
		// DB: Due to refresh on resource change, this may be called on non UI
		// thread.
		// TODO: Review to perform the validation outside the model.
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				ErrorDialog.openError(Display.getDefault().getActiveShell(),
						p_dialogTitle, p_dialogMessage, status);
			}
		});
	}

	private boolean riseNotAlphanumeric() {
		// Status status = new Status(IStatus.ERROR, "plugin", 0,
		// "Syntax error in the name of the component", null);
		String errorMessage = "Component identifier should fit tue following syntax:\n";
		errorMessage += "\tidentifier ::= identifier_letter {[underline] letter_or_digit}*\n";
		errorMessage += "\tletter_or_digit ::= identifier_letter | digit\n\n";
		errorMessage += "For more information see chapter 14 (Lexical Elements) of the AADL standard.";
		openError("Syntax error", "Syntax error in the name of the component",
				errorMessage);

		return false;
	}

	private boolean riseWrongType(String type, String parentName) {
		// Status status = new Status(IStatus.ERROR, "plugin", 0,
		// "Syntax error in the name of the component", null);
//		final String errorMessage = "Component type identifier should be "
//				+ parentName + "and not " + type + ".";
		//openError("Syntax error", "Syntax error in the name of the component",
			//	errorMessage);

		return true;
	}

	private boolean riseCannotRenameInstance() {
		// Status status = new Status(IStatus.ERROR, "plugin", 0,
		// "Rename Error", null);

		final String errorMessage = "Subcomponents of component instance cannot be renamed.";
		openError("Rename Error", "Rename Error", errorMessage);

		return true;
	}

	private boolean riseCannotRenameRefine() {
		// Status status = new Status(IStatus.ERROR, "plugin", 0,
		// "Rename error", null);
		// final String errorMessage =
		// "Refined subcomponents cannot be renamed.";
		// openError( "Rename Error", "Rename Error", errorMessage );

		return true;
	}

	public boolean getDontHandleNextRename() {
		return dontHandleNextRename;
	}

	public void setDontHandleNextRenam(boolean flag) {
		dontHandleNextRename = flag;
	}
	//
	// protected boolean isSubcomponent() {
	// return getLevel() == 3;
	// }
	//
	// @Override
	// public EList<SKFeature> getFeatures() {
	// if ( isSubcomponent() ) {
	// final Component componentType = getType();
	//
	// return componentType.getFeatures();
	// }
	//
	// return super.getFeatures();
	// }
} // ADELE_ComponentImpl