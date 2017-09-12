/**
 */
package FeatureModelSafe;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FeatureModelSafe.Feature#getSolitarySubFeatures <em>Solitary Sub Features</em>}</li>
 *   <li>{@link FeatureModelSafe.Feature#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see FeatureModelSafe.FeatureModelSafePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Solitary Sub Features</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureModelSafe.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solitary Sub Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solitary Sub Features</em>' containment reference list.
	 * @see FeatureModelSafe.FeatureModelSafePackage#getFeature_SolitarySubFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getSolitarySubFeatures();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureModelSafe.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see FeatureModelSafe.FeatureModelSafePackage#getFeature_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Feature
