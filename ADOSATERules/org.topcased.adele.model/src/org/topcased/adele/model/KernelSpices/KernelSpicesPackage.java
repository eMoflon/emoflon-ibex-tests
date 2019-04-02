/**
 */
package org.topcased.adele.model.KernelSpices;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.topcased.adele.model.KernelSpices.KernelSpicesFactory
 * @model kind="package"
 * @generated
 */
public interface KernelSpicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KernelSpices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://KernelSpices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "KernelSpices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelSpicesPackage eINSTANCE = org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.KernelSpices.impl.SKObjectImpl <em>SK Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.KernelSpices.impl.SKObjectImpl
	 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKObject()
	 * @generated
	 */
	int SK_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_OBJECT__ID = 1;

	/**
	 * The number of structural features of the '<em>SK Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl <em>SK Hierarchical Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl
	 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKHierarchicalObject()
	 * @generated
	 */
	int SK_HIERARCHICAL_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_HIERARCHICAL_OBJECT__NAME = SK_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_HIERARCHICAL_OBJECT__ID = SK_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_HIERARCHICAL_OBJECT__LEVEL = SK_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_HIERARCHICAL_OBJECT__PROPERTIES = SK_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_HIERARCHICAL_OBJECT__PARENT = SK_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_HIERARCHICAL_OBJECT__CHILDREN = SK_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_HIERARCHICAL_OBJECT__OD_SYSTEMS = SK_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SK Hierarchical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_HIERARCHICAL_OBJECT_FEATURE_COUNT = SK_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.KernelSpices.impl.SKComponentImpl <em>SK Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.KernelSpices.impl.SKComponentImpl
	 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKComponent()
	 * @generated
	 */
	int SK_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__NAME = SK_HIERARCHICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__ID = SK_HIERARCHICAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__LEVEL = SK_HIERARCHICAL_OBJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__PROPERTIES = SK_HIERARCHICAL_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__PARENT = SK_HIERARCHICAL_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__CHILDREN = SK_HIERARCHICAL_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__OD_SYSTEMS = SK_HIERARCHICAL_OBJECT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__FEATURES = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authorized Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authorized Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT__AUTHORIZED_FEATURES = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SK Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_COMPONENT_FEATURE_COUNT = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.KernelSpices.impl.SKFeatureImpl <em>SK Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.KernelSpices.impl.SKFeatureImpl
	 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKFeature()
	 * @generated
	 */
	int SK_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__NAME = SK_HIERARCHICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__ID = SK_HIERARCHICAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__LEVEL = SK_HIERARCHICAL_OBJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__PROPERTIES = SK_HIERARCHICAL_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__PARENT = SK_HIERARCHICAL_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__CHILDREN = SK_HIERARCHICAL_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__OD_SYSTEMS = SK_HIERARCHICAL_OBJECT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__VISIBILITY = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE__COMPONENT = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SK Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_FEATURE_FEATURE_COUNT = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.KernelSpices.impl.SKRelationImpl <em>SK Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.KernelSpices.impl.SKRelationImpl
	 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKRelation()
	 * @generated
	 */
	int SK_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION__NAME = SK_HIERARCHICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION__ID = SK_HIERARCHICAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION__LEVEL = SK_HIERARCHICAL_OBJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION__PROPERTIES = SK_HIERARCHICAL_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION__PARENT = SK_HIERARCHICAL_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION__CHILDREN = SK_HIERARCHICAL_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION__OD_SYSTEMS = SK_HIERARCHICAL_OBJECT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION__OBJECTS = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SK Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_RELATION_FEATURE_COUNT = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.KernelSpices.impl.SKPropertyImpl <em>SK Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.KernelSpices.impl.SKPropertyImpl
	 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKProperty()
	 * @generated
	 */
	int SK_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY__NAME = SK_HIERARCHICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY__ID = SK_HIERARCHICAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY__LEVEL = SK_HIERARCHICAL_OBJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY__PROPERTIES = SK_HIERARCHICAL_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY__PARENT = SK_HIERARCHICAL_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY__CHILDREN = SK_HIERARCHICAL_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY__OD_SYSTEMS = SK_HIERARCHICAL_OBJECT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY__VALUE = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SK Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SK_PROPERTY_FEATURE_COUNT = SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.KernelSpices.SKFeatureVisibility <em>SK Feature Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.KernelSpices.SKFeatureVisibility
	 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKFeatureVisibility()
	 * @generated
	 */
	int SK_FEATURE_VISIBILITY = 6;


	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.KernelSpices.SKObject <em>SK Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SK Object</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKObject
	 * @generated
	 */
	EClass getSKObject();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.KernelSpices.SKObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKObject#getName()
	 * @see #getSKObject()
	 * @generated
	 */
	EAttribute getSKObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.KernelSpices.SKObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKObject#getId()
	 * @see #getSKObject()
	 * @generated
	 */
	EAttribute getSKObject_Id();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject <em>SK Hierarchical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SK Hierarchical Object</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject
	 * @generated
	 */
	EClass getSKHierarchicalObject();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getLevel()
	 * @see #getSKHierarchicalObject()
	 * @generated
	 */
	EAttribute getSKHierarchicalObject_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getProperties()
	 * @see #getSKHierarchicalObject()
	 * @generated
	 */
	EReference getSKHierarchicalObject_Properties();

	/**
	 * Returns the meta object for the container reference '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getParent()
	 * @see #getSKHierarchicalObject()
	 * @generated
	 */
	EReference getSKHierarchicalObject_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getChildren()
	 * @see #getSKHierarchicalObject()
	 * @generated
	 */
	EReference getSKHierarchicalObject_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getOdSystems <em>Od Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Od Systems</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKHierarchicalObject#getOdSystems()
	 * @see #getSKHierarchicalObject()
	 * @generated
	 */
	EReference getSKHierarchicalObject_OdSystems();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.KernelSpices.SKComponent <em>SK Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SK Component</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKComponent
	 * @generated
	 */
	EClass getSKComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.KernelSpices.SKComponent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKComponent#getFeatures()
	 * @see #getSKComponent()
	 * @generated
	 */
	EReference getSKComponent_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.KernelSpices.SKComponent#getAuthorizedSubcomponents <em>Authorized Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorized Subcomponents</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKComponent#getAuthorizedSubcomponents()
	 * @see #getSKComponent()
	 * @generated
	 */
	EAttribute getSKComponent_AuthorizedSubcomponents();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.KernelSpices.SKComponent#getAuthorizedFeatures <em>Authorized Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorized Features</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKComponent#getAuthorizedFeatures()
	 * @see #getSKComponent()
	 * @generated
	 */
	EAttribute getSKComponent_AuthorizedFeatures();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.KernelSpices.SKFeature <em>SK Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SK Feature</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKFeature
	 * @generated
	 */
	EClass getSKFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.KernelSpices.SKFeature#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKFeature#getVisibility()
	 * @see #getSKFeature()
	 * @generated
	 */
	EAttribute getSKFeature_Visibility();

	/**
	 * Returns the meta object for the container reference '{@link org.topcased.adele.model.KernelSpices.SKFeature#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKFeature#getComponent()
	 * @see #getSKFeature()
	 * @generated
	 */
	EReference getSKFeature_Component();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.KernelSpices.SKRelation <em>SK Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SK Relation</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKRelation
	 * @generated
	 */
	EClass getSKRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.topcased.adele.model.KernelSpices.SKRelation#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objects</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKRelation#getObjects()
	 * @see #getSKRelation()
	 * @generated
	 */
	EReference getSKRelation_Objects();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.KernelSpices.SKProperty <em>SK Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SK Property</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKProperty
	 * @generated
	 */
	EClass getSKProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.KernelSpices.SKProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKProperty#getValue()
	 * @see #getSKProperty()
	 * @generated
	 */
	EAttribute getSKProperty_Value();

	/**
	 * Returns the meta object for enum '{@link org.topcased.adele.model.KernelSpices.SKFeatureVisibility <em>SK Feature Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SK Feature Visibility</em>'.
	 * @see org.topcased.adele.model.KernelSpices.SKFeatureVisibility
	 * @generated
	 */
	EEnum getSKFeatureVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KernelSpicesFactory getKernelSpicesFactory();

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
		 * The meta object literal for the '{@link org.topcased.adele.model.KernelSpices.impl.SKObjectImpl <em>SK Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.KernelSpices.impl.SKObjectImpl
		 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKObject()
		 * @generated
		 */
		EClass SK_OBJECT = eINSTANCE.getSKObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SK_OBJECT__NAME = eINSTANCE.getSKObject_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SK_OBJECT__ID = eINSTANCE.getSKObject_Id();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl <em>SK Hierarchical Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectImpl
		 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKHierarchicalObject()
		 * @generated
		 */
		EClass SK_HIERARCHICAL_OBJECT = eINSTANCE.getSKHierarchicalObject();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SK_HIERARCHICAL_OBJECT__LEVEL = eINSTANCE.getSKHierarchicalObject_Level();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SK_HIERARCHICAL_OBJECT__PROPERTIES = eINSTANCE.getSKHierarchicalObject_Properties();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SK_HIERARCHICAL_OBJECT__PARENT = eINSTANCE.getSKHierarchicalObject_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SK_HIERARCHICAL_OBJECT__CHILDREN = eINSTANCE.getSKHierarchicalObject_Children();

		/**
		 * The meta object literal for the '<em><b>Od Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SK_HIERARCHICAL_OBJECT__OD_SYSTEMS = eINSTANCE.getSKHierarchicalObject_OdSystems();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.KernelSpices.impl.SKComponentImpl <em>SK Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.KernelSpices.impl.SKComponentImpl
		 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKComponent()
		 * @generated
		 */
		EClass SK_COMPONENT = eINSTANCE.getSKComponent();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SK_COMPONENT__FEATURES = eINSTANCE.getSKComponent_Features();

		/**
		 * The meta object literal for the '<em><b>Authorized Subcomponents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS = eINSTANCE.getSKComponent_AuthorizedSubcomponents();

		/**
		 * The meta object literal for the '<em><b>Authorized Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SK_COMPONENT__AUTHORIZED_FEATURES = eINSTANCE.getSKComponent_AuthorizedFeatures();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.KernelSpices.impl.SKFeatureImpl <em>SK Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.KernelSpices.impl.SKFeatureImpl
		 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKFeature()
		 * @generated
		 */
		EClass SK_FEATURE = eINSTANCE.getSKFeature();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SK_FEATURE__VISIBILITY = eINSTANCE.getSKFeature_Visibility();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SK_FEATURE__COMPONENT = eINSTANCE.getSKFeature_Component();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.KernelSpices.impl.SKRelationImpl <em>SK Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.KernelSpices.impl.SKRelationImpl
		 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKRelation()
		 * @generated
		 */
		EClass SK_RELATION = eINSTANCE.getSKRelation();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SK_RELATION__OBJECTS = eINSTANCE.getSKRelation_Objects();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.KernelSpices.impl.SKPropertyImpl <em>SK Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.KernelSpices.impl.SKPropertyImpl
		 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKProperty()
		 * @generated
		 */
		EClass SK_PROPERTY = eINSTANCE.getSKProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SK_PROPERTY__VALUE = eINSTANCE.getSKProperty_Value();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.KernelSpices.SKFeatureVisibility <em>SK Feature Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.KernelSpices.SKFeatureVisibility
		 * @see org.topcased.adele.model.KernelSpices.impl.KernelSpicesPackageImpl#getSKFeatureVisibility()
		 * @generated
		 */
		EEnum SK_FEATURE_VISIBILITY = eINSTANCE.getSKFeatureVisibility();

	}

} //KernelSpicesPackage
