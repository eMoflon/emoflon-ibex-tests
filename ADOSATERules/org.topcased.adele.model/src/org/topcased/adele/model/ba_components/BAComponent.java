/**
 * <copyright>
 * </copyright>
 *
 * $Id: BAComponent.java,v 1.2 2012-03-16 08:11:19 aschach Exp $
 */
package org.topcased.adele.model.ba_components;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.topcased.adele.model.KernelSpices.SKComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BA Component</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.topcased.adele.model.ba_components.Ba_componentsPackage#getBAComponent()
 * @model abstract="true"
 * @generated
 */
public interface BAComponent extends SKComponent {
	String aadlSerialization(String packageName,ResourceSet res);
} // BAComponent
