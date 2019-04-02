/**
 * <copyright>
 * </copyright>
 *
 * $Id: BAVariableImpl.java,v 1.3 2012-04-30 12:07:23 aschach Exp $
 */
package org.topcased.adele.model.ba_features.impl;

import java.util.StringTokenizer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.topcased.adele.model.ADELE.util.ADELEModelUtils;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Components.Data;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory;
import org.topcased.adele.model.ba_features.BAVariable;
import org.topcased.adele.model.ba_features.Ba_featuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BA Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ba_features.impl.BAVariableImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BAVariableImpl extends BAFeatureImpl implements BAVariable {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Data type;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BAVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ba_featuresPackage.Literals.BA_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Data)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ba_featuresPackage.BA_VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Data newType) {
		Data oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ba_featuresPackage.BA_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ba_featuresPackage.BA_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case Ba_featuresPackage.BA_VARIABLE__TYPE:
				setType((Data)newValue);
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
			case Ba_featuresPackage.BA_VARIABLE__TYPE:
				setType((Data)null);
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
			case Ba_featuresPackage.BA_VARIABLE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}


	/**
	 * Test if the current element is an behavior variable
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isBAVariable() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String aadlSerialization(String packageName,String annexName,ResourceSet res, SKODSFactory odStructure) {
		String aadl = "";
		String component_type_identifier="NIL";
		String component_implementation_identifier="NIL";	
		String type = "none";
		
		if (getType()!=null) {
			type = ADELEModelUtils.getFullNamespaceByEContainer(getType())+getType().getName();
		}
		
		Component containingCompo = (Component) eContainer();
		if (containingCompo.getName().contains(".")) {
			StringTokenizer tok = new StringTokenizer(containingCompo.getName(), ".");
			component_type_identifier=tok.nextToken();
			component_implementation_identifier=tok.nextToken();
		} else if ( containingCompo.getClassifier()==null ) {
			component_type_identifier=containingCompo.getName() +"_" + containingCompo.getId().replaceAll("-", "_");
			component_implementation_identifier=containingCompo.getImplementationName();
			if (component_implementation_identifier=="")
				component_implementation_identifier="impl";
		}
		
		aadl += "isBAVariable('"+packageName+"','"+component_type_identifier+"','"+
				component_implementation_identifier+"','"+annexName+"','"+name+"','"+type+"','NIL','NIL','0').\n";
		
		return aadl;
	}

} //BAVariableImpl
