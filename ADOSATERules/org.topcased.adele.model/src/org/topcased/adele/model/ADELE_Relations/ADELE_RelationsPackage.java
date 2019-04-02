/**
 */
package org.topcased.adele.model.ADELE_Relations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.topcased.adele.model.ADELE_Relations.ADELE_RelationsFactory
 * @model kind="package"
 * @generated
 */
public interface ADELE_RelationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ADELE_Relations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ADELE_Relations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ADELE_Relations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ADELE_RelationsPackage eINSTANCE = org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.RelationImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = KernelSpicesPackage.SK_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = KernelSpicesPackage.SK_RELATION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LEVEL = KernelSpicesPackage.SK_RELATION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PROPERTIES = KernelSpicesPackage.SK_RELATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PARENT = KernelSpicesPackage.SK_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CHILDREN = KernelSpicesPackage.SK_RELATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OD_SYSTEMS = KernelSpicesPackage.SK_RELATION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OBJECTS = KernelSpicesPackage.SK_RELATION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICITY = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MIN = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORIGINAL_SOURCE_FEATURE = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORIGINAL_SINK_FEATURE = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORIGINAL_SOURCE_SUBCOMPONENT = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORIGINAL_SINK_SUBCOMPONENT = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SINK = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OWNING_COMPONENT = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORIGINAL_RELATION = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = KernelSpicesPackage.SK_RELATION_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.AccessConnectionImpl <em>Access Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.AccessConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getAccessConnection()
	 * @generated
	 */
	int ACCESS_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__ID = RELATION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__LEVEL = RELATION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__PROPERTIES = RELATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__PARENT = RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__CHILDREN = RELATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__OD_SYSTEMS = RELATION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__OBJECTS = RELATION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__MULTIPLICITY = RELATION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__MIN = RELATION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE = RELATION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE = RELATION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = RELATION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = RELATION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__SINK = RELATION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__OWNING_COMPONENT = RELATION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION__ORIGINAL_RELATION = RELATION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONNECTION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.DirectedFeatureConnectionImpl <em>Directed Feature Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.DirectedFeatureConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getDirectedFeatureConnection()
	 * @generated
	 */
	int DIRECTED_FEATURE_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__ID = RELATION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__LEVEL = RELATION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__PROPERTIES = RELATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__PARENT = RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__CHILDREN = RELATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__OD_SYSTEMS = RELATION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__OBJECTS = RELATION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__MULTIPLICITY = RELATION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__MIN = RELATION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_FEATURE = RELATION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_FEATURE = RELATION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = RELATION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = RELATION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__SINK = RELATION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__OWNING_COMPONENT = RELATION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION__ORIGINAL_RELATION = RELATION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Directed Feature Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_FEATURE_CONNECTION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.BusAccessConnectionImpl <em>Bus Access Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.BusAccessConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getBusAccessConnection()
	 * @generated
	 */
	int BUS_ACCESS_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__NAME = ACCESS_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__ID = ACCESS_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__LEVEL = ACCESS_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__PROPERTIES = ACCESS_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__PARENT = ACCESS_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__CHILDREN = ACCESS_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__OD_SYSTEMS = ACCESS_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__OBJECTS = ACCESS_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__MULTIPLICITY = ACCESS_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__MIN = ACCESS_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE = ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE = ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__SOURCE = ACCESS_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__SINK = ACCESS_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__OWNING_COMPONENT = ACCESS_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION__ORIGINAL_RELATION = ACCESS_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Bus Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ACCESS_CONNECTION_FEATURE_COUNT = ACCESS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.DataAccessConnectionImpl <em>Data Access Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.DataAccessConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getDataAccessConnection()
	 * @generated
	 */
	int DATA_ACCESS_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__NAME = ACCESS_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__ID = ACCESS_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__LEVEL = ACCESS_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__PROPERTIES = ACCESS_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__PARENT = ACCESS_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__CHILDREN = ACCESS_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__OD_SYSTEMS = ACCESS_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__OBJECTS = ACCESS_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__MULTIPLICITY = ACCESS_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__MIN = ACCESS_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE = ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE = ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__SOURCE = ACCESS_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__SINK = ACCESS_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__OWNING_COMPONENT = ACCESS_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION__ORIGINAL_RELATION = ACCESS_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Data Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_CONNECTION_FEATURE_COUNT = ACCESS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.EventPortConnectionImpl <em>Event Port Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.EventPortConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getEventPortConnection()
	 * @generated
	 */
	int EVENT_PORT_CONNECTION = 7;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.DataPortConnectionImpl <em>Data Port Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.DataPortConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getDataPortConnection()
	 * @generated
	 */
	int DATA_PORT_CONNECTION = 8;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.EventDataPortConnectionImpl <em>Event Data Port Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.EventDataPortConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getEventDataPortConnection()
	 * @generated
	 */
	int EVENT_DATA_PORT_CONNECTION = 9;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.SubprogramAccessConnectionImpl <em>Subprogram Access Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.SubprogramAccessConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getSubprogramAccessConnection()
	 * @generated
	 */
	int SUBPROGRAM_ACCESS_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__NAME = ACCESS_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__ID = ACCESS_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__LEVEL = ACCESS_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__PROPERTIES = ACCESS_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__PARENT = ACCESS_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__CHILDREN = ACCESS_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__OD_SYSTEMS = ACCESS_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__OBJECTS = ACCESS_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__MULTIPLICITY = ACCESS_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__MIN = ACCESS_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE = ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE = ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__SOURCE = ACCESS_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__SINK = ACCESS_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__OWNING_COMPONENT = ACCESS_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION__ORIGINAL_RELATION = ACCESS_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Subprogram Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_ACCESS_CONNECTION_FEATURE_COUNT = ACCESS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.ParameterConnectionImpl <em>Parameter Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ParameterConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getParameterConnection()
	 * @generated
	 */
	int PARAMETER_CONNECTION = 10;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.SubprogramGroupAccessConnectionImpl <em>Subprogram Group Access Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.SubprogramGroupAccessConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getSubprogramGroupAccessConnection()
	 * @generated
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__NAME = ACCESS_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__ID = ACCESS_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__LEVEL = ACCESS_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__PROPERTIES = ACCESS_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__PARENT = ACCESS_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__CHILDREN = ACCESS_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__OD_SYSTEMS = ACCESS_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__OBJECTS = ACCESS_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__MULTIPLICITY = ACCESS_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__MIN = ACCESS_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE = ACCESS_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE = ACCESS_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = ACCESS_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = ACCESS_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__SOURCE = ACCESS_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__SINK = ACCESS_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__OWNING_COMPONENT = ACCESS_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION__ORIGINAL_RELATION = ACCESS_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Subprogram Group Access Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_GROUP_ACCESS_CONNECTION_FEATURE_COUNT = ACCESS_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__NAME = DIRECTED_FEATURE_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__ID = DIRECTED_FEATURE_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__LEVEL = DIRECTED_FEATURE_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__PROPERTIES = DIRECTED_FEATURE_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__PARENT = DIRECTED_FEATURE_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__CHILDREN = DIRECTED_FEATURE_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__OD_SYSTEMS = DIRECTED_FEATURE_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__OBJECTS = DIRECTED_FEATURE_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__MULTIPLICITY = DIRECTED_FEATURE_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__MIN = DIRECTED_FEATURE_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__ORIGINAL_SOURCE_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__ORIGINAL_SINK_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__SOURCE = DIRECTED_FEATURE_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__SINK = DIRECTED_FEATURE_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__OWNING_COMPONENT = DIRECTED_FEATURE_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION__ORIGINAL_RELATION = DIRECTED_FEATURE_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Event Port Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PORT_CONNECTION_FEATURE_COUNT = DIRECTED_FEATURE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__NAME = DIRECTED_FEATURE_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__ID = DIRECTED_FEATURE_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__LEVEL = DIRECTED_FEATURE_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__PROPERTIES = DIRECTED_FEATURE_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__PARENT = DIRECTED_FEATURE_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__CHILDREN = DIRECTED_FEATURE_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__OD_SYSTEMS = DIRECTED_FEATURE_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__OBJECTS = DIRECTED_FEATURE_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__MULTIPLICITY = DIRECTED_FEATURE_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__MIN = DIRECTED_FEATURE_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__ORIGINAL_SOURCE_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__ORIGINAL_SINK_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__SOURCE = DIRECTED_FEATURE_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__SINK = DIRECTED_FEATURE_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__OWNING_COMPONENT = DIRECTED_FEATURE_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION__ORIGINAL_RELATION = DIRECTED_FEATURE_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Data Port Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_CONNECTION_FEATURE_COUNT = DIRECTED_FEATURE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__NAME = DIRECTED_FEATURE_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__ID = DIRECTED_FEATURE_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__LEVEL = DIRECTED_FEATURE_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__PROPERTIES = DIRECTED_FEATURE_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__PARENT = DIRECTED_FEATURE_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__CHILDREN = DIRECTED_FEATURE_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__OD_SYSTEMS = DIRECTED_FEATURE_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__OBJECTS = DIRECTED_FEATURE_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__MULTIPLICITY = DIRECTED_FEATURE_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__MIN = DIRECTED_FEATURE_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__ORIGINAL_SOURCE_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__ORIGINAL_SINK_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__SOURCE = DIRECTED_FEATURE_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__SINK = DIRECTED_FEATURE_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__OWNING_COMPONENT = DIRECTED_FEATURE_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION__ORIGINAL_RELATION = DIRECTED_FEATURE_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Event Data Port Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DATA_PORT_CONNECTION_FEATURE_COUNT = DIRECTED_FEATURE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__NAME = DIRECTED_FEATURE_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__ID = DIRECTED_FEATURE_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__LEVEL = DIRECTED_FEATURE_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__PROPERTIES = DIRECTED_FEATURE_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__PARENT = DIRECTED_FEATURE_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__CHILDREN = DIRECTED_FEATURE_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__OD_SYSTEMS = DIRECTED_FEATURE_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__OBJECTS = DIRECTED_FEATURE_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__MULTIPLICITY = DIRECTED_FEATURE_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__MIN = DIRECTED_FEATURE_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__ORIGINAL_SOURCE_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__ORIGINAL_SINK_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__SOURCE = DIRECTED_FEATURE_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__SINK = DIRECTED_FEATURE_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__OWNING_COMPONENT = DIRECTED_FEATURE_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION__ORIGINAL_RELATION = DIRECTED_FEATURE_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Parameter Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONNECTION_FEATURE_COUNT = DIRECTED_FEATURE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.AbstractFeatureConnectionImpl <em>Abstract Feature Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.AbstractFeatureConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getAbstractFeatureConnection()
	 * @generated
	 */
	int ABSTRACT_FEATURE_CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__NAME = DIRECTED_FEATURE_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__ID = DIRECTED_FEATURE_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__LEVEL = DIRECTED_FEATURE_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__PROPERTIES = DIRECTED_FEATURE_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__PARENT = DIRECTED_FEATURE_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__CHILDREN = DIRECTED_FEATURE_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__OD_SYSTEMS = DIRECTED_FEATURE_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__OBJECTS = DIRECTED_FEATURE_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__MULTIPLICITY = DIRECTED_FEATURE_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__MIN = DIRECTED_FEATURE_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__ORIGINAL_SOURCE_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__ORIGINAL_SINK_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__SOURCE = DIRECTED_FEATURE_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__SINK = DIRECTED_FEATURE_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__OWNING_COMPONENT = DIRECTED_FEATURE_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION__ORIGINAL_RELATION = DIRECTED_FEATURE_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Abstract Feature Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_CONNECTION_FEATURE_COUNT = DIRECTED_FEATURE_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ADELE_Relations.impl.FeatureGroupConnectionImpl <em>Feature Group Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ADELE_Relations.impl.FeatureGroupConnectionImpl
	 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getFeatureGroupConnection()
	 * @generated
	 */
	int FEATURE_GROUP_CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__NAME = DIRECTED_FEATURE_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__ID = DIRECTED_FEATURE_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__LEVEL = DIRECTED_FEATURE_CONNECTION__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__PROPERTIES = DIRECTED_FEATURE_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__PARENT = DIRECTED_FEATURE_CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__CHILDREN = DIRECTED_FEATURE_CONNECTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__OD_SYSTEMS = DIRECTED_FEATURE_CONNECTION__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__OBJECTS = DIRECTED_FEATURE_CONNECTION__OBJECTS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__MULTIPLICITY = DIRECTED_FEATURE_CONNECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__MIN = DIRECTED_FEATURE_CONNECTION__MIN;

	/**
	 * The feature id for the '<em><b>Original Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__ORIGINAL_SOURCE_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Sink Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__ORIGINAL_SINK_FEATURE = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_FEATURE;

	/**
	 * The feature id for the '<em><b>Original Source Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SOURCE_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Original Sink Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT = DIRECTED_FEATURE_CONNECTION__ORIGINAL_SINK_SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__SOURCE = DIRECTED_FEATURE_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__SINK = DIRECTED_FEATURE_CONNECTION__SINK;

	/**
	 * The feature id for the '<em><b>Owning Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__OWNING_COMPONENT = DIRECTED_FEATURE_CONNECTION__OWNING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Original Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION__ORIGINAL_RELATION = DIRECTED_FEATURE_CONNECTION__ORIGINAL_RELATION;

	/**
	 * The number of structural features of the '<em>Feature Group Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_CONNECTION_FEATURE_COUNT = DIRECTED_FEATURE_CONNECTION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.BusAccessConnection <em>Bus Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.BusAccessConnection
	 * @generated
	 */
	EClass getBusAccessConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.DataAccessConnection <em>Data Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.DataAccessConnection
	 * @generated
	 */
	EClass getDataAccessConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.EventPortConnection <em>Event Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Port Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.EventPortConnection
	 * @generated
	 */
	EClass getEventPortConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.DataPortConnection <em>Data Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.DataPortConnection
	 * @generated
	 */
	EClass getDataPortConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.EventDataPortConnection <em>Event Data Port Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Data Port Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.EventDataPortConnection
	 * @generated
	 */
	EClass getEventDataPortConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Relations.Relation#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getMultiplicity()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ADELE_Relations.Relation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getMin()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Min();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSourceFeature <em>Original Source Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Source Feature</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSourceFeature()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_OriginalSourceFeature();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSinkFeature <em>Original Sink Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Sink Feature</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSinkFeature()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_OriginalSinkFeature();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSourceSubcomponent <em>Original Source Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Source Subcomponent</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSourceSubcomponent()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_OriginalSourceSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSinkSubcomponent <em>Original Sink Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Sink Subcomponent</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getOriginalSinkSubcomponent()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_OriginalSinkSubcomponent();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Relations.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Relations.Relation#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getSink()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Sink();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOwningComponent <em>Owning Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Component</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getOwningComponent()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_OwningComponent();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ADELE_Relations.Relation#getOriginalRelation <em>Original Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Relation</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.Relation#getOriginalRelation()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_OriginalRelation();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.AccessConnection <em>Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.AccessConnection
	 * @generated
	 */
	EClass getAccessConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.DirectedFeatureConnection <em>Directed Feature Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Feature Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.DirectedFeatureConnection
	 * @generated
	 */
	EClass getDirectedFeatureConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection <em>Subprogram Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.SubprogramAccessConnection
	 * @generated
	 */
	EClass getSubprogramAccessConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.ParameterConnection <em>Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.ParameterConnection
	 * @generated
	 */
	EClass getParameterConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection <em>Subprogram Group Access Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Group Access Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.SubprogramGroupAccessConnection
	 * @generated
	 */
	EClass getSubprogramGroupAccessConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection <em>Abstract Feature Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.AbstractFeatureConnection
	 * @generated
	 */
	EClass getAbstractFeatureConnection();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection <em>Feature Group Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group Connection</em>'.
	 * @see org.topcased.adele.model.ADELE_Relations.FeatureGroupConnection
	 * @generated
	 */
	EClass getFeatureGroupConnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ADELE_RelationsFactory getADELE_RelationsFactory();

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
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.BusAccessConnectionImpl <em>Bus Access Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.BusAccessConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getBusAccessConnection()
		 * @generated
		 */
		EClass BUS_ACCESS_CONNECTION = eINSTANCE.getBusAccessConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.DataAccessConnectionImpl <em>Data Access Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.DataAccessConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getDataAccessConnection()
		 * @generated
		 */
		EClass DATA_ACCESS_CONNECTION = eINSTANCE.getDataAccessConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.EventPortConnectionImpl <em>Event Port Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.EventPortConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getEventPortConnection()
		 * @generated
		 */
		EClass EVENT_PORT_CONNECTION = eINSTANCE.getEventPortConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.DataPortConnectionImpl <em>Data Port Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.DataPortConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getDataPortConnection()
		 * @generated
		 */
		EClass DATA_PORT_CONNECTION = eINSTANCE.getDataPortConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.EventDataPortConnectionImpl <em>Event Data Port Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.EventDataPortConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getEventDataPortConnection()
		 * @generated
		 */
		EClass EVENT_DATA_PORT_CONNECTION = eINSTANCE.getEventDataPortConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.RelationImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICITY = eINSTANCE.getRelation_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MIN = eINSTANCE.getRelation_Min();

		/**
		 * The meta object literal for the '<em><b>Original Source Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ORIGINAL_SOURCE_FEATURE = eINSTANCE.getRelation_OriginalSourceFeature();

		/**
		 * The meta object literal for the '<em><b>Original Sink Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ORIGINAL_SINK_FEATURE = eINSTANCE.getRelation_OriginalSinkFeature();

		/**
		 * The meta object literal for the '<em><b>Original Source Subcomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ORIGINAL_SOURCE_SUBCOMPONENT = eINSTANCE.getRelation_OriginalSourceSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Original Sink Subcomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ORIGINAL_SINK_SUBCOMPONENT = eINSTANCE.getRelation_OriginalSinkSubcomponent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SINK = eINSTANCE.getRelation_Sink();

		/**
		 * The meta object literal for the '<em><b>Owning Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OWNING_COMPONENT = eINSTANCE.getRelation_OwningComponent();

		/**
		 * The meta object literal for the '<em><b>Original Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ORIGINAL_RELATION = eINSTANCE.getRelation_OriginalRelation();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.AccessConnectionImpl <em>Access Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.AccessConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getAccessConnection()
		 * @generated
		 */
		EClass ACCESS_CONNECTION = eINSTANCE.getAccessConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.DirectedFeatureConnectionImpl <em>Directed Feature Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.DirectedFeatureConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getDirectedFeatureConnection()
		 * @generated
		 */
		EClass DIRECTED_FEATURE_CONNECTION = eINSTANCE.getDirectedFeatureConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.SubprogramAccessConnectionImpl <em>Subprogram Access Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.SubprogramAccessConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getSubprogramAccessConnection()
		 * @generated
		 */
		EClass SUBPROGRAM_ACCESS_CONNECTION = eINSTANCE.getSubprogramAccessConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.ParameterConnectionImpl <em>Parameter Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ParameterConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getParameterConnection()
		 * @generated
		 */
		EClass PARAMETER_CONNECTION = eINSTANCE.getParameterConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.SubprogramGroupAccessConnectionImpl <em>Subprogram Group Access Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.SubprogramGroupAccessConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getSubprogramGroupAccessConnection()
		 * @generated
		 */
		EClass SUBPROGRAM_GROUP_ACCESS_CONNECTION = eINSTANCE.getSubprogramGroupAccessConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.AbstractFeatureConnectionImpl <em>Abstract Feature Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.AbstractFeatureConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getAbstractFeatureConnection()
		 * @generated
		 */
		EClass ABSTRACT_FEATURE_CONNECTION = eINSTANCE.getAbstractFeatureConnection();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ADELE_Relations.impl.FeatureGroupConnectionImpl <em>Feature Group Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ADELE_Relations.impl.FeatureGroupConnectionImpl
		 * @see org.topcased.adele.model.ADELE_Relations.impl.ADELE_RelationsPackageImpl#getFeatureGroupConnection()
		 * @generated
		 */
		EClass FEATURE_GROUP_CONNECTION = eINSTANCE.getFeatureGroupConnection();

	}

} //ADELE_RelationsPackage
