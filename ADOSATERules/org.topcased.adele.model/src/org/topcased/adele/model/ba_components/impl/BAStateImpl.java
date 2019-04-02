/**
 * <copyright>
 * </copyright>
 *
 * $Id: BAStateImpl.java,v 1.3 2012-04-30 12:07:02 aschach Exp $
 */
package org.topcased.adele.model.ba_components.impl;

import java.util.StringTokenizer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory;
import org.topcased.adele.model.ba_components.BAState;
import org.topcased.adele.model.ba_components.BAStateKind;
import org.topcased.adele.model.ba_components.Ba_componentsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BA State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ba_components.impl.BAStateImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BAStateImpl extends BAComponentImpl implements BAState {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final BAStateKind KIND_EDEFAULT = BAStateKind.NONE;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected BAStateKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BAStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ba_componentsPackage.Literals.BA_STATE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAStateKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(BAStateKind newKind) {
		BAStateKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ba_componentsPackage.BA_STATE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ba_componentsPackage.BA_STATE__KIND:
				return getKind();
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
			case Ba_componentsPackage.BA_STATE__KIND:
				setKind((BAStateKind)newValue);
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
			case Ba_componentsPackage.BA_STATE__KIND:
				setKind(KIND_EDEFAULT);
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
			case Ba_componentsPackage.BA_STATE__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

	@Override
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		// TODO Auto-generated method stub
		if ( eFeature.getName().equals("parent") && newValue instanceof BAStateImpl) {
			return;
		}
		super.eSet(eFeature, newValue);
	}
//
//
//	/**
//	 * Test if the current element is an behavior state
//	 * @return boolean
//	 * @generated NOT
//	 */
//	public boolean isBAState() {
//		return true;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String aadlSerialization(String packageName,String annexName, ResourceSet res, SKODSFactory odStructure) {
		String aadl="";
		String component_type_identifier="NIL";
		String component_implementation_identifier="NIL";	
		String kind="NIL";
		
		if ( getKind()==null || getKind().getLiteral().equalsIgnoreCase("none"))
			kind = "NIL";
		else
			kind = getKind().getLiteral().replaceAll("_", " ").toUpperCase();
		
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
		
		aadl += "isBAState('"+packageName+"','"+component_type_identifier+"','"+component_implementation_identifier+"','"+
						annexName+"','"+name+"','"+kind+"','0').\n";
				
		return aadl;
	}

} //BAStateImpl
