/**
 * <copyright>
 * </copyright>
 *
 * $Id: ADELE_FeatureGroupConnectionImpl.java,v 1.1 2012-04-30 12:05:52 aschach Exp $
 */
package org.topcased.adele.model.ADELE_Relations.impl;

import org.eclipse.emf.ecore.EClass;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsPackage;
import org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADELE Feature Group Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FeatureGroupConnectionImpl extends DirectedFeatureConnectionImpl implements FeatureGroupConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ADELE_RelationsPackage.Literals.FEATURE_GROUP_CONNECTION;
	}
	
	public String getConnectionType() {
		return "FEATURE GROUP";
	}
//
//	public String aadlSerialization(String packageName,
//			String componentIdentifier, ResourceSet res,
//			SKODSFactory odStructure) {
//		// TODO Auto-generated method stub
//		return super.aadlSerialization(packageName, componentIdentifier, res, odStructure);
//	}

} //ADELE_FeatureGroupConnectionImpl
