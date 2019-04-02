/**
 * <copyright>
 * </copyright>
 *
 * $Id: BARelationImpl.java,v 1.1 2012-03-01 09:19:12 aschach Exp $
 */
package org.topcased.adele.model.ba_relations.impl;

import org.eclipse.emf.ecore.EClass;
import org.topcased.adele.model.KernelSpices.impl.SKRelationImpl;
import org.topcased.adele.model.ba_relations.BARelation;
import org.topcased.adele.model.ba_relations.Ba_relationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BA Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class BARelationImpl extends SKRelationImpl implements BARelation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BARelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ba_relationsPackage.Literals.BA_RELATION;
	}

} //BARelationImpl
