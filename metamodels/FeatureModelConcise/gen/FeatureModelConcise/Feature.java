/**
 */
package FeatureModelConcise;

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
 *   <li>{@link FeatureModelConcise.Feature#getSubfeatures <em>Subfeatures</em>}</li>
 *   <li>{@link FeatureModelConcise.Feature#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see FeatureModelConcise.FeatureModelConcisePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subfeatures</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureModelConcise.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subfeatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfeatures</em>' containment reference list.
	 * @see FeatureModelConcise.FeatureModelConcisePackage#getFeature_Subfeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getSubfeatures();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link FeatureModelConcise.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see FeatureModelConcise.FeatureModelConcisePackage#getFeature_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Feature
