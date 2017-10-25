/**
 */
package classMultipleInheritanceHierarchy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyFactory
 * @model kind="package"
 * @generated
 */
public interface ClassMultipleInheritanceHierarchyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classMultipleInheritanceHierarchy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ClassMultipleInheritanceHierarchy/model/classMultipleInheritanceHierarchy.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classMultipleInheritanceHierarchy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassMultipleInheritanceHierarchyPackage eINSTANCE = classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link classMultipleInheritanceHierarchy.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classMultipleInheritanceHierarchy.impl.NamedElementImpl
	 * @see classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classMultipleInheritanceHierarchy.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classMultipleInheritanceHierarchy.impl.AttributeImpl
	 * @see classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CLAZZ = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classMultipleInheritanceHierarchy.impl.ClassPackageImpl <em>Class Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classMultipleInheritanceHierarchy.impl.ClassPackageImpl
	 * @see classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl#getClassPackage()
	 * @generated
	 */
	int CLASS_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PACKAGE__CLASSES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classMultipleInheritanceHierarchy.impl.ClazzImpl <em>Clazz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classMultipleInheritanceHierarchy.impl.ClazzImpl
	 * @see classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl#getClazz()
	 * @generated
	 */
	int CLAZZ = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__SUPER_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link classMultipleInheritanceHierarchy.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see classMultipleInheritanceHierarchy.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the container reference '{@link classMultipleInheritanceHierarchy.Attribute#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Clazz</em>'.
	 * @see classMultipleInheritanceHierarchy.Attribute#getClazz()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Clazz();

	/**
	 * Returns the meta object for the attribute '{@link classMultipleInheritanceHierarchy.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see classMultipleInheritanceHierarchy.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link classMultipleInheritanceHierarchy.ClassPackage <em>Class Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Package</em>'.
	 * @see classMultipleInheritanceHierarchy.ClassPackage
	 * @generated
	 */
	EClass getClassPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link classMultipleInheritanceHierarchy.ClassPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see classMultipleInheritanceHierarchy.ClassPackage#getClasses()
	 * @see #getClassPackage()
	 * @generated
	 */
	EReference getClassPackage_Classes();

	/**
	 * Returns the meta object for class '{@link classMultipleInheritanceHierarchy.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clazz</em>'.
	 * @see classMultipleInheritanceHierarchy.Clazz
	 * @generated
	 */
	EClass getClazz();

	/**
	 * Returns the meta object for the reference list '{@link classMultipleInheritanceHierarchy.Clazz#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see classMultipleInheritanceHierarchy.Clazz#getSuperClass()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_SuperClass();

	/**
	 * Returns the meta object for the container reference '{@link classMultipleInheritanceHierarchy.Clazz#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see classMultipleInheritanceHierarchy.Clazz#getPackage()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link classMultipleInheritanceHierarchy.Clazz#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see classMultipleInheritanceHierarchy.Clazz#getAttributes()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_Attributes();

	/**
	 * Returns the meta object for class '{@link classMultipleInheritanceHierarchy.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see classMultipleInheritanceHierarchy.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link classMultipleInheritanceHierarchy.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see classMultipleInheritanceHierarchy.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassMultipleInheritanceHierarchyFactory getClassMultipleInheritanceHierarchyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link classMultipleInheritanceHierarchy.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classMultipleInheritanceHierarchy.impl.AttributeImpl
		 * @see classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CLAZZ = eINSTANCE.getAttribute_Clazz();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link classMultipleInheritanceHierarchy.impl.ClassPackageImpl <em>Class Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classMultipleInheritanceHierarchy.impl.ClassPackageImpl
		 * @see classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl#getClassPackage()
		 * @generated
		 */
		EClass CLASS_PACKAGE = eINSTANCE.getClassPackage();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_PACKAGE__CLASSES = eINSTANCE.getClassPackage_Classes();

		/**
		 * The meta object literal for the '{@link classMultipleInheritanceHierarchy.impl.ClazzImpl <em>Clazz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classMultipleInheritanceHierarchy.impl.ClazzImpl
		 * @see classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl#getClazz()
		 * @generated
		 */
		EClass CLAZZ = eINSTANCE.getClazz();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__SUPER_CLASS = eINSTANCE.getClazz_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__PACKAGE = eINSTANCE.getClazz_Package();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__ATTRIBUTES = eINSTANCE.getClazz_Attributes();

		/**
		 * The meta object literal for the '{@link classMultipleInheritanceHierarchy.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classMultipleInheritanceHierarchy.impl.NamedElementImpl
		 * @see classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //ClassMultipleInheritanceHierarchyPackage
