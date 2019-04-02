/**
 */
package org.topcased.adele.model.ADELE_Features;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.topcased.adele.model.ADELE_Features.ADELE_FeaturesFactory
 * @model kind="package"
 * @generated
 */
public interface ADELE_FeaturesPackage extends EPackage {

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ADELE_Features";
	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ADELE_Features";
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ADELE_Features";
	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ADELE_FeaturesPackage eINSTANCE = org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl.init();
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.FeatureImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = KernelSpicesPackage.SK_FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = KernelSpicesPackage.SK_FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LEVEL = KernelSpicesPackage.SK_FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROPERTIES = KernelSpicesPackage.SK_FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PARENT = KernelSpicesPackage.SK_FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDREN = KernelSpicesPackage.SK_FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OD_SYSTEMS = KernelSpicesPackage.SK_FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VISIBILITY = KernelSpicesPackage.SK_FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COMPONENT = KernelSpicesPackage.SK_FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CLASSIFIER = KernelSpicesPackage.SK_FEATURE_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFINEMENT = KernelSpicesPackage.SK_FEATURE_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFINED_FEATURE = KernelSpicesPackage.SK_FEATURE_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ORIGINAL_FEATURE = KernelSpicesPackage.SK_FEATURE_FEATURE_COUNT + 3;
	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = KernelSpicesPackage.SK_FEATURE_FEATURE_COUNT + 4;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.AccessImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 1;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__NAME = FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__ID = FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__LEVEL = FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__PROPERTIES = FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__PARENT = FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__CHILDREN = FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__OD_SYSTEMS = FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__VISIBILITY = FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__COMPONENT = FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__CLASSIFIER = FEATURE__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__REFINEMENT = FEATURE__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__REFINED_FEATURE = FEATURE__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__ORIGINAL_FEATURE = FEATURE__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__DIRECTION = FEATURE_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.DirectedFeatureImpl <em>Directed Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.DirectedFeatureImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getDirectedFeature()
	 * @generated
	 */
	int DIRECTED_FEATURE = 2;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__NAME = FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__ID = FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__LEVEL = FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__PROPERTIES = FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__PARENT = FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__CHILDREN = FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__OD_SYSTEMS = FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__VISIBILITY = FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__COMPONENT = FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__CLASSIFIER = FEATURE__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__REFINEMENT = FEATURE__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__REFINED_FEATURE = FEATURE__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__ORIGINAL_FEATURE = FEATURE__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE__DIRECTION = FEATURE_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Directed Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.BusAccessImpl <em>Bus Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.BusAccessImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getBusAccess()
	 * @generated
	 */
	int BUS_ACCESS = 3;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__NAME = ACCESS__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__ID = ACCESS__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__LEVEL = ACCESS__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__PROPERTIES = ACCESS__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__PARENT = ACCESS__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__CHILDREN = ACCESS__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__OD_SYSTEMS = ACCESS__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__VISIBILITY = ACCESS__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__COMPONENT = ACCESS__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__CLASSIFIER = ACCESS__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__REFINEMENT = ACCESS__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__REFINED_FEATURE = ACCESS__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__ORIGINAL_FEATURE = ACCESS__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS__DIRECTION = ACCESS__DIRECTION;
	/**
	 * The number of structural features of the '<em>Bus Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.DataAccessImpl <em>Data Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.DataAccessImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getDataAccess()
	 * @generated
	 */
	int DATA_ACCESS = 4;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__NAME = ACCESS__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__ID = ACCESS__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__LEVEL = ACCESS__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__PROPERTIES = ACCESS__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__PARENT = ACCESS__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__CHILDREN = ACCESS__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__OD_SYSTEMS = ACCESS__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__VISIBILITY = ACCESS__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__COMPONENT = ACCESS__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__CLASSIFIER = ACCESS__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__REFINEMENT = ACCESS__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__REFINED_FEATURE = ACCESS__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__ORIGINAL_FEATURE = ACCESS__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS__DIRECTION = ACCESS__DIRECTION;
	/**
	 * The number of structural features of the '<em>Data Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.SubprogramAccessImpl <em>Subprogram Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.SubprogramAccessImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getSubprogramAccess()
	 * @generated
	 */
	int SUBPROGRAM_ACCESS = 5;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__NAME = ACCESS__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__ID = ACCESS__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__LEVEL = ACCESS__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__PROPERTIES = ACCESS__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__PARENT = ACCESS__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__CHILDREN = ACCESS__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__OD_SYSTEMS = ACCESS__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__VISIBILITY = ACCESS__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__COMPONENT = ACCESS__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__CLASSIFIER = ACCESS__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__REFINEMENT = ACCESS__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__REFINED_FEATURE = ACCESS__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__ORIGINAL_FEATURE = ACCESS__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS__DIRECTION = ACCESS__DIRECTION;
	/**
	 * The number of structural features of the '<em>Subprogram Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.SubprogramGroupAccessImpl <em>Subprogram Group Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.SubprogramGroupAccessImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getSubprogramGroupAccess()
	 * @generated
	 */
	int SUBPROGRAM_GROUP_ACCESS = 6;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__NAME = ACCESS__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__ID = ACCESS__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__LEVEL = ACCESS__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__PROPERTIES = ACCESS__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__PARENT = ACCESS__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__CHILDREN = ACCESS__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__OD_SYSTEMS = ACCESS__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__VISIBILITY = ACCESS__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__COMPONENT = ACCESS__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__CLASSIFIER = ACCESS__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__REFINEMENT = ACCESS__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__REFINED_FEATURE = ACCESS__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__ORIGINAL_FEATURE = ACCESS__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS__DIRECTION = ACCESS__DIRECTION;
	/**
	 * The number of structural features of the '<em>Subprogram Group Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_FEATURE_COUNT = ACCESS_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.ParameterImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = DIRECTED_FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = DIRECTED_FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LEVEL = DIRECTED_FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PROPERTIES = DIRECTED_FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARENT = DIRECTED_FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CHILDREN = DIRECTED_FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OD_SYSTEMS = DIRECTED_FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VISIBILITY = DIRECTED_FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMPONENT = DIRECTED_FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLASSIFIER = DIRECTED_FEATURE__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REFINEMENT = DIRECTED_FEATURE__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REFINED_FEATURE = DIRECTED_FEATURE__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ORIGINAL_FEATURE = DIRECTED_FEATURE__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = DIRECTED_FEATURE__DIRECTION;
	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = DIRECTED_FEATURE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getFeatureGroup()
	 * @generated
	 */
	int FEATURE_GROUP = 8;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__NAME = DIRECTED_FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ID = DIRECTED_FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__LEVEL = DIRECTED_FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__PROPERTIES = DIRECTED_FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__PARENT = DIRECTED_FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CHILDREN = DIRECTED_FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__OD_SYSTEMS = DIRECTED_FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__VISIBILITY = DIRECTED_FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__COMPONENT = DIRECTED_FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CLASSIFIER = DIRECTED_FEATURE__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__REFINEMENT = DIRECTED_FEATURE__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__REFINED_FEATURE = DIRECTED_FEATURE__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ORIGINAL_FEATURE = DIRECTED_FEATURE__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__DIRECTION = DIRECTED_FEATURE__DIRECTION;
	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__FEATURES = DIRECTED_FEATURE_FEATURE_COUNT + 0;
	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS = DIRECTED_FEATURE_FEATURE_COUNT + 1;
	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__AUTHORIZED_FEATURES = DIRECTED_FEATURE_FEATURE_COUNT + 2;
	/**
	 * The feature id for the '<em><b>Inverse Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__INVERSE_FEATURE = DIRECTED_FEATURE_FEATURE_COUNT + 3;
	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__TYPE = DIRECTED_FEATURE_FEATURE_COUNT + 4;
	/**
	 * The feature id for the '<em><b>All Real Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_REAL_FEATURES = DIRECTED_FEATURE_FEATURE_COUNT + 5;
	/**
	 * The number of structural features of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_FEATURE_COUNT = DIRECTED_FEATURE_FEATURE_COUNT + 6;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.EventPortImpl <em>Event Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.EventPortImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getEventPort()
	 * @generated
	 */
	int EVENT_PORT = 9;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__NAME = DIRECTED_FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__ID = DIRECTED_FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__LEVEL = DIRECTED_FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__PROPERTIES = DIRECTED_FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__PARENT = DIRECTED_FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__CHILDREN = DIRECTED_FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__OD_SYSTEMS = DIRECTED_FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__VISIBILITY = DIRECTED_FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__COMPONENT = DIRECTED_FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__CLASSIFIER = DIRECTED_FEATURE__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__REFINEMENT = DIRECTED_FEATURE__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__REFINED_FEATURE = DIRECTED_FEATURE__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__ORIGINAL_FEATURE = DIRECTED_FEATURE__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT__DIRECTION = DIRECTED_FEATURE__DIRECTION;
	/**
	 * The number of structural features of the '<em>Event Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_FEATURE_COUNT = DIRECTED_FEATURE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.DataPortImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 10;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__NAME = DIRECTED_FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__ID = DIRECTED_FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__LEVEL = DIRECTED_FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__PROPERTIES = DIRECTED_FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__PARENT = DIRECTED_FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__CHILDREN = DIRECTED_FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__OD_SYSTEMS = DIRECTED_FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__VISIBILITY = DIRECTED_FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__COMPONENT = DIRECTED_FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__CLASSIFIER = DIRECTED_FEATURE__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__REFINEMENT = DIRECTED_FEATURE__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__REFINED_FEATURE = DIRECTED_FEATURE__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__ORIGINAL_FEATURE = DIRECTED_FEATURE__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__DIRECTION = DIRECTED_FEATURE__DIRECTION;
	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = DIRECTED_FEATURE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.EventDataPortImpl <em>Event Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.EventDataPortImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getEventDataPort()
	 * @generated
	 */
	int EVENT_DATA_PORT = 11;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__NAME = DIRECTED_FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__ID = DIRECTED_FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__LEVEL = DIRECTED_FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__PROPERTIES = DIRECTED_FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__PARENT = DIRECTED_FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__CHILDREN = DIRECTED_FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__OD_SYSTEMS = DIRECTED_FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__VISIBILITY = DIRECTED_FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__COMPONENT = DIRECTED_FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__CLASSIFIER = DIRECTED_FEATURE__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__REFINEMENT = DIRECTED_FEATURE__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__REFINED_FEATURE = DIRECTED_FEATURE__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__ORIGINAL_FEATURE = DIRECTED_FEATURE__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT__DIRECTION = DIRECTED_FEATURE__DIRECTION;
	/**
	 * The number of structural features of the '<em>Event Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_FEATURE_COUNT = DIRECTED_FEATURE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.impl.AbstractFeatureImpl
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getAbstractFeature()
	 * @generated
	 */
	int ABSTRACT_FEATURE = 12;
	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__NAME = DIRECTED_FEATURE__NAME;
	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__ID = DIRECTED_FEATURE__ID;
	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__LEVEL = DIRECTED_FEATURE__LEVEL;
	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__PROPERTIES = DIRECTED_FEATURE__PROPERTIES;
	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__PARENT = DIRECTED_FEATURE__PARENT;
	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__CHILDREN = DIRECTED_FEATURE__CHILDREN;
	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__OD_SYSTEMS = DIRECTED_FEATURE__OD_SYSTEMS;
	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__VISIBILITY = DIRECTED_FEATURE__VISIBILITY;
	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__COMPONENT = DIRECTED_FEATURE__COMPONENT;
	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__CLASSIFIER = DIRECTED_FEATURE__CLASSIFIER;
	/**
	 * The feature id for the '<em><b>Refinement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__REFINEMENT = DIRECTED_FEATURE__REFINEMENT;
	/**
	 * The feature id for the '<em><b>Refined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__REFINED_FEATURE = DIRECTED_FEATURE__REFINED_FEATURE;
	/**
	 * The feature id for the '<em><b>Original Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__ORIGINAL_FEATURE = DIRECTED_FEATURE__ORIGINAL_FEATURE;
	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__DIRECTION = DIRECTED_FEATURE__DIRECTION;
	/**
	 * The number of structural features of the '<em>Abstract Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_FEATURE_COUNT = DIRECTED_FEATURE_FEATURE_COUNT + 0;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.PortDirection <em>Port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.PortDirection
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getPortDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 13;
	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Features.AccessDirection <em>Access Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Features.AccessDirection
	 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getAccessDirection()
	 * @generated
	 */
	int ACCESS_DIRECTION = 14;

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Features.Feature#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.Feature#getClassifier()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Features.Feature#isRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.Feature#isRefinement()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Refinement();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Features.Feature#getRefinedFeature <em>Refined Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Feature</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.Feature#getRefinedFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RefinedFeature();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Features.Feature#getOriginalFeature <em>Original Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Feature</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.Feature#getOriginalFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OriginalFeature();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Features.Access#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.Access#getDirection()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Direction();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.DirectedFeature <em>Directed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Feature</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.DirectedFeature
	 * @generated
	 */
	EClass getDirectedFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Features.DirectedFeature#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.DirectedFeature#getDirection()
	 * @see #getDirectedFeature()
	 * @generated
	 */
	EAttribute getDirectedFeature_Direction();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.BusAccess <em>Bus Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Access</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.BusAccess
	 * @generated
	 */
	EClass getBusAccess();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.DataAccess <em>Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.DataAccess
	 * @generated
	 */
	EClass getDataAccess();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.SubprogramAccess <em>Subprogram Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Access</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.SubprogramAccess
	 * @generated
	 */
	EClass getSubprogramAccess();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.SubprogramGroupAccess <em>Subprogram Group Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Group Access</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.SubprogramGroupAccess
	 * @generated
	 */
	EClass getSubprogramGroupAccess();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Features.FeatureGroup#getInverseFeature <em>Inverse Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse Feature</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.FeatureGroup#getInverseFeature()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_InverseFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Features.FeatureGroup#isType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.FeatureGroup#isType()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EAttribute getFeatureGroup_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.adele.model.ADELE_Features.FeatureGroup#getAllRealFeatures <em>All Real Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Real Features</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.FeatureGroup#getAllRealFeatures()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_AllRealFeatures();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.EventPort <em>Event Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Port</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.EventPort
	 * @generated
	 */
	EClass getEventPort();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.EventDataPort <em>Event Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Data Port</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.EventDataPort
	 * @generated
	 */
	EClass getEventDataPort();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Features.AbstractFeature <em>Abstract Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.AbstractFeature
	 * @generated
	 */
	EClass getAbstractFeature();

	/**
	 * Returns the meta object for enum '{@link org.topcased.adele.model.ADELE_Features.PortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.PortDirection
	 * @generated
	 */
	EEnum getPortDirection();

	/**
	 * Returns the meta object for enum '{@link org.topcased.adele.model.ADELE_Features.AccessDirection <em>Access Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Direction</em>'.
	 * @see org.topcased.adele.model.ADELE_Features.AccessDirection
	 * @generated
	 */
	EEnum getAccessDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ADELE_FeaturesFactory getADELE_FeaturesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.FeatureImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CLASSIFIER = eINSTANCE.getFeature_Classifier();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__REFINEMENT = eINSTANCE.getFeature_Refinement();

		/**
		 * The meta object literal for the '<em><b>Refined Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REFINED_FEATURE = eINSTANCE.getFeature_RefinedFeature();

		/**
		 * The meta object literal for the '<em><b>Original Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ORIGINAL_FEATURE = eINSTANCE.getFeature_OriginalFeature();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.AccessImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getAccess()
		 * @generated
		 */
		EClass ACCESS = eINSTANCE.getAccess();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS__DIRECTION = eINSTANCE.getAccess_Direction();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.DirectedFeatureImpl <em>Directed Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.DirectedFeatureImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getDirectedFeature()
		 * @generated
		 */
		EClass DIRECTED_FEATURE = eINSTANCE.getDirectedFeature();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_FEATURE__DIRECTION = eINSTANCE.getDirectedFeature_Direction();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.BusAccessImpl <em>Bus Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.BusAccessImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getBusAccess()
		 * @generated
		 */
		EClass BUS_ACCESS = eINSTANCE.getBusAccess();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.DataAccessImpl <em>Data Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.DataAccessImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getDataAccess()
		 * @generated
		 */
		EClass DATA_ACCESS = eINSTANCE.getDataAccess();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.SubprogramAccessImpl <em>Subprogram Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.SubprogramAccessImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getSubprogramAccess()
		 * @generated
		 */
		EClass SUBPROGRAM_ACCESS = eINSTANCE.getSubprogramAccess();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.SubprogramGroupAccessImpl <em>Subprogram Group Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.SubprogramGroupAccessImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getSubprogramGroupAccess()
		 * @generated
		 */
		EClass SUBPROGRAM_GROUP_ACCESS = eINSTANCE.getSubprogramGroupAccess();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.ParameterImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.FeatureGroupImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getFeatureGroup()
		 * @generated
		 */
		EClass FEATURE_GROUP = eINSTANCE.getFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Inverse Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__INVERSE_FEATURE = eINSTANCE.getFeatureGroup_InverseFeature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_GROUP__TYPE = eINSTANCE.getFeatureGroup_Type();

		/**
		 * The meta object literal for the '<em><b>All Real Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__ALL_REAL_FEATURES = eINSTANCE.getFeatureGroup_AllRealFeatures();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.EventPortImpl <em>Event Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.EventPortImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getEventPort()
		 * @generated
		 */
		EClass EVENT_PORT = eINSTANCE.getEventPort();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.DataPortImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.EventDataPortImpl <em>Event Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.EventDataPortImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getEventDataPort()
		 * @generated
		 */
		EClass EVENT_DATA_PORT = eINSTANCE.getEventDataPort();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.impl.AbstractFeatureImpl
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getAbstractFeature()
		 * @generated
		 */
		EClass ABSTRACT_FEATURE = eINSTANCE.getAbstractFeature();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.PortDirection <em>Port Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.PortDirection
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getPortDirection()
		 * @generated
		 */
		EEnum PORT_DIRECTION = eINSTANCE.getPortDirection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Features.AccessDirection <em>Access Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Features.AccessDirection
		 * @see org.topcased.adele.model.ADELE_Features.impl.ADELE_FeaturesPackageImpl#getAccessDirection()
		 * @generated
		 */
		EEnum ACCESS_DIRECTION = eINSTANCE.getAccessDirection();

	}


} //ADELE_FeaturesPackage
