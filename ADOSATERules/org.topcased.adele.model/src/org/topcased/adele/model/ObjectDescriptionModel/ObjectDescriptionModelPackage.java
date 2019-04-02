/**
 * Copyright (c) 2009 Ellidiss Technologies
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Arnaud Schach, arnaud.schach.com
 * 	Jean-Bertrand Hery
 */
package org.topcased.adele.model.ObjectDescriptionModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectDescriptionModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ObjectDescriptionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ObjectDescriptionModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ObjectDescriptionModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectDescriptionModelPackage eINSTANCE = org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSectionImpl <em>SKOD Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSectionImpl
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODSection()
	 * @generated
	 */
	int SKOD_SECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__NAME = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__ID = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__LEVEL = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__PROPERTIES = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__PARENT = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__CHILDREN = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Od Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__OD_SYSTEMS = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__LABEL = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dom ODS Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__DOM_ODS_NODE = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION__DATA = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SKOD Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SECTION_FEATURE_COUNT = KernelSpicesPackage.SK_HIERARCHICAL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl <em>SKOD System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODSystem()
	 * @generated
	 */
	int SKOD_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SYSTEM__SECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SYSTEM__ID = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SYSTEM__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SYSTEM__MODE = 3;

	/**
	 * The feature id for the '<em><b>Style Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SYSTEM__STYLE_SHEET = 4;

	/**
	 * The feature id for the '<em><b>Dom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SYSTEM__DOM_DATA = 5;

	/**
	 * The number of structural features of the '<em>SKOD System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_SYSTEM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryImpl <em>SKODS Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryImpl
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODSFactory()
	 * @generated
	 */
	int SKODS_FACTORY = 2;

	/**
	 * The feature id for the '<em><b>Dom ODS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKODS_FACTORY__DOM_ODS = 0;

	/**
	 * The feature id for the '<em><b>Current ODS Datafile Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKODS_FACTORY__CURRENT_ODS_DATAFILE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Dom Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKODS_FACTORY__DOM_DATA = 2;

	/**
	 * The feature id for the '<em><b>Current Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKODS_FACTORY__CURRENT_OBJECT = 3;

	/**
	 * The number of structural features of the '<em>SKODS Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKODS_FACTORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl <em>SKOD Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODData()
	 * @generated
	 */
	int SKOD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_DATA__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_DATA__MODIFIED = 1;

	/**
	 * The feature id for the '<em><b>Dom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_DATA__DOM = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_DATA__NODE = 3;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_DATA__EXTERNAL = 4;

	/**
	 * The number of structural features of the '<em>SKOD Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKOD_DATA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSMode <em>SKODS Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSMode
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODSMode()
	 * @generated
	 */
	int SKODS_MODE = 4;

	/**
	 * The meta object id for the '<em>Document</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Document
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 5;

	/**
	 * The meta object id for the '<em>Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Node
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The meta object id for the '<em>Hash Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getHashMap()
	 * @generated
	 */
	int HASH_MAP = 7;

	/**
	 * The meta object id for the '<em>Hash Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashSet
	 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getHashSet()
	 * @generated
	 */
	int HASH_SET = 8;


	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSection <em>SKOD Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SKOD Section</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSection
	 * @generated
	 */
	EClass getSKODSection();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getLabel()
	 * @see #getSKODSection()
	 * @generated
	 */
	EAttribute getSKODSection_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getDomODSNode <em>Dom ODS Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dom ODS Node</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getDomODSNode()
	 * @see #getSKODSection()
	 * @generated
	 */
	EAttribute getSKODSection_DomODSNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSection#getData()
	 * @see #getSKODSection()
	 * @generated
	 */
	EReference getSKODSection_Data();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem <em>SKOD System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SKOD System</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSystem
	 * @generated
	 */
	EClass getSKODSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getSections()
	 * @see #getSKODSystem()
	 * @generated
	 */
	EReference getSKODSystem_Sections();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getId()
	 * @see #getSKODSystem()
	 * @generated
	 */
	EAttribute getSKODSystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getLabel()
	 * @see #getSKODSystem()
	 * @generated
	 */
	EAttribute getSKODSystem_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getMode()
	 * @see #getSKODSystem()
	 * @generated
	 */
	EAttribute getSKODSystem_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getStyleSheet <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Sheet</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getStyleSheet()
	 * @see #getSKODSystem()
	 * @generated
	 */
	EAttribute getSKODSystem_StyleSheet();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getDomData <em>Dom Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dom Data</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSystem#getDomData()
	 * @see #getSKODSystem()
	 * @generated
	 */
	EAttribute getSKODSystem_DomData();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory <em>SKODS Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SKODS Factory</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory
	 * @generated
	 */
	EClass getSKODSFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getDomODS <em>Dom ODS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dom ODS</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getDomODS()
	 * @see #getSKODSFactory()
	 * @generated
	 */
	EAttribute getSKODSFactory_DomODS();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getCurrentODSDatafileNode <em>Current ODS Datafile Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current ODS Datafile Node</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getCurrentODSDatafileNode()
	 * @see #getSKODSFactory()
	 * @generated
	 */
	EAttribute getSKODSFactory_CurrentODSDatafileNode();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getDomData <em>Dom Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dom Data</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getDomData()
	 * @see #getSKODSFactory()
	 * @generated
	 */
	EAttribute getSKODSFactory_DomData();

	/**
	 * Returns the meta object for the reference '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getCurrentObject <em>Current Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Object</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory#getCurrentObject()
	 * @see #getSKODSFactory()
	 * @generated
	 */
	EReference getSKODSFactory_CurrentObject();

	/**
	 * Returns the meta object for class '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData <em>SKOD Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SKOD Data</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODData
	 * @generated
	 */
	EClass getSKODData();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODData#getValue()
	 * @see #getSKODData()
	 * @generated
	 */
	EAttribute getSKODData_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#isModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODData#isModified()
	 * @see #getSKODData()
	 * @generated
	 */
	EAttribute getSKODData_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#getDom <em>Dom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dom</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODData#getDom()
	 * @see #getSKODData()
	 * @generated
	 */
	EAttribute getSKODData_Dom();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODData#getNode()
	 * @see #getSKODData()
	 * @generated
	 */
	EAttribute getSKODData_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODData#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODData#isExternal()
	 * @see #getSKODData()
	 * @generated
	 */
	EAttribute getSKODData_External();

	/**
	 * Returns the meta object for enum '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSMode <em>SKODS Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SKODS Mode</em>'.
	 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSMode
	 * @generated
	 */
	EEnum getSKODSMode();

	/**
	 * Returns the meta object for data type '{@link org.w3c.dom.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Document</em>'.
	 * @see org.w3c.dom.Document
	 * @model instanceClass="org.w3c.dom.Document"
	 *        extendedMetaData="baseType='http://www.eclipse.org/emf/2002/Ecore#EJavaObject'"
	 * @generated
	 */
	EDataType getDocument();

	/**
	 * Returns the meta object for data type '{@link org.w3c.dom.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node</em>'.
	 * @see org.w3c.dom.Node
	 * @model instanceClass="org.w3c.dom.Node"
	 * @generated
	 */
	EDataType getNode();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Hash Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Map</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap"
	 * @generated
	 */
	EDataType getHashMap();

	/**
	 * Returns the meta object for data type '{@link java.util.HashSet <em>Hash Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Set</em>'.
	 * @see java.util.HashSet
	 * @model instanceClass="java.util.HashSet"
	 * @generated
	 */
	EDataType getHashSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjectDescriptionModelFactory getObjectDescriptionModelFactory();

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
		 * The meta object literal for the '{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSectionImpl <em>SKOD Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSectionImpl
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODSection()
		 * @generated
		 */
		EClass SKOD_SECTION = eINSTANCE.getSKODSection();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_SECTION__LABEL = eINSTANCE.getSKODSection_Label();

		/**
		 * The meta object literal for the '<em><b>Dom ODS Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_SECTION__DOM_ODS_NODE = eINSTANCE.getSKODSection_DomODSNode();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKOD_SECTION__DATA = eINSTANCE.getSKODSection_Data();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl <em>SKOD System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODSystem()
		 * @generated
		 */
		EClass SKOD_SYSTEM = eINSTANCE.getSKODSystem();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKOD_SYSTEM__SECTIONS = eINSTANCE.getSKODSystem_Sections();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_SYSTEM__ID = eINSTANCE.getSKODSystem_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_SYSTEM__LABEL = eINSTANCE.getSKODSystem_Label();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_SYSTEM__MODE = eINSTANCE.getSKODSystem_Mode();

		/**
		 * The meta object literal for the '<em><b>Style Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_SYSTEM__STYLE_SHEET = eINSTANCE.getSKODSystem_StyleSheet();

		/**
		 * The meta object literal for the '<em><b>Dom Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_SYSTEM__DOM_DATA = eINSTANCE.getSKODSystem_DomData();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryImpl <em>SKODS Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryImpl
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODSFactory()
		 * @generated
		 */
		EClass SKODS_FACTORY = eINSTANCE.getSKODSFactory();

		/**
		 * The meta object literal for the '<em><b>Dom ODS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKODS_FACTORY__DOM_ODS = eINSTANCE.getSKODSFactory_DomODS();

		/**
		 * The meta object literal for the '<em><b>Current ODS Datafile Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKODS_FACTORY__CURRENT_ODS_DATAFILE_NODE = eINSTANCE.getSKODSFactory_CurrentODSDatafileNode();

		/**
		 * The meta object literal for the '<em><b>Dom Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKODS_FACTORY__DOM_DATA = eINSTANCE.getSKODSFactory_DomData();

		/**
		 * The meta object literal for the '<em><b>Current Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKODS_FACTORY__CURRENT_OBJECT = eINSTANCE.getSKODSFactory_CurrentObject();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl <em>SKOD Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.SKODDataImpl
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODData()
		 * @generated
		 */
		EClass SKOD_DATA = eINSTANCE.getSKODData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_DATA__VALUE = eINSTANCE.getSKODData_Value();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_DATA__MODIFIED = eINSTANCE.getSKODData_Modified();

		/**
		 * The meta object literal for the '<em><b>Dom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_DATA__DOM = eINSTANCE.getSKODData_Dom();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_DATA__NODE = eINSTANCE.getSKODData_Node();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKOD_DATA__EXTERNAL = eINSTANCE.getSKODData_External();

		/**
		 * The meta object literal for the '{@link org.topcased.adele.model.ObjectDescriptionModel.SKODSMode <em>SKODS Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.topcased.adele.model.ObjectDescriptionModel.SKODSMode
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getSKODSMode()
		 * @generated
		 */
		EEnum SKODS_MODE = eINSTANCE.getSKODSMode();

		/**
		 * The meta object literal for the '<em>Document</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Document
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getDocument()
		 * @generated
		 */
		EDataType DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em>Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Node
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getNode()
		 * @generated
		 */
		EDataType NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em>Hash Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getHashMap()
		 * @generated
		 */
		EDataType HASH_MAP = eINSTANCE.getHashMap();

		/**
		 * The meta object literal for the '<em>Hash Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashSet
		 * @see org.topcased.adele.model.ObjectDescriptionModel.impl.ObjectDescriptionModelPackageImpl#getHashSet()
		 * @generated
		 */
		EDataType HASH_SET = eINSTANCE.getHashSet();

	}

} //ObjectDescriptionModelPackage
