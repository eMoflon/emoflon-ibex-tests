/**
 */
package FeatureModelSafe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FeatureModelSafe.Group#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see FeatureModelSafe.FeatureModelSafePackage#getGroup()
 * @model abstract="true"
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureModelSafe.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see FeatureModelSafe.FeatureModelSafePackage#getGroup_Members()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Feature> getMembers();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Group
