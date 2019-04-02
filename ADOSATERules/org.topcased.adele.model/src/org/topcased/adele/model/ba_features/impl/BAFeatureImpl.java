/**
 * <copyright>
 * </copyright>
 *
 * $Id: BAFeatureImpl.java,v 1.1 2012-03-01 09:19:11 aschach Exp $
 */
package org.topcased.adele.model.ba_features.impl;

import org.eclipse.emf.ecore.EClass;
import org.topcased.adele.model.KernelSpices.impl.SKFeatureImpl;
import org.topcased.adele.model.ba_features.BAFeature;
import org.topcased.adele.model.ba_features.Ba_featuresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BA Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class BAFeatureImpl extends SKFeatureImpl implements BAFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BAFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ba_featuresPackage.Literals.BA_FEATURE;
	}

} //BAFeatureImpl
