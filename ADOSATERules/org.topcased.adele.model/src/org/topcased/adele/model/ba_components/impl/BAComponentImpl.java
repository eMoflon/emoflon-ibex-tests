/**
 * <copyright>
 * </copyright>
 *
 * $Id: BAComponentImpl.java,v 1.2 2012-03-16 08:11:21 aschach Exp $
 */
package org.topcased.adele.model.ba_components.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.topcased.adele.model.KernelSpices.impl.SKComponentImpl;
import org.topcased.adele.model.ba_components.BAComponent;
import org.topcased.adele.model.ba_components.Ba_componentsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BA Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class BAComponentImpl extends SKComponentImpl implements BAComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BAComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ba_componentsPackage.Literals.BA_COMPONENT;
	}
	
	public String aadlSerialization(String packageName, ResourceSet res) {
		return "";
	}

} //BAComponentImpl
