/**
 */
package FamiliesWithSiblings;

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
 * @see FamiliesWithSiblings.FamiliesWithSiblingsFactory
 * @model kind="package"
 * @generated
 */
public interface FamiliesWithSiblingsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FamiliesWithSiblings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/FamiliesWithSiblings/model/FamiliesWithSiblings.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FamiliesWithSiblings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamiliesWithSiblingsPackage eINSTANCE = FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl.init();

	/**
	 * The meta object id for the '{@link FamiliesWithSiblings.impl.FamilyRegisterImpl <em>Family Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesWithSiblings.impl.FamilyRegisterImpl
	 * @see FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl#getFamilyRegister()
	 * @generated
	 */
	int FAMILY_REGISTER = 0;

	/**
	 * The feature id for the '<em><b>Families</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_REGISTER__FAMILIES = 0;

	/**
	 * The number of structural features of the '<em>Family Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_REGISTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Family Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_REGISTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FamiliesWithSiblings.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesWithSiblings.impl.FamilyImpl
	 * @see FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Father</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__FATHER = 0;

	/**
	 * The feature id for the '<em><b>Mother</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MOTHER = 1;

	/**
	 * The feature id for the '<em><b>Sons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__SONS = 2;

	/**
	 * The feature id for the '<em><b>Daughters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DAUGHTERS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NAME = 4;

	/**
	 * The feature id for the '<em><b>Families Inverse</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__FAMILIES_INVERSE = 5;

	/**
	 * The feature id for the '<em><b>Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__SIBLINGS = 6;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FamiliesWithSiblings.impl.FamilyMemberImpl <em>Family Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FamiliesWithSiblings.impl.FamilyMemberImpl
	 * @see FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl#getFamilyMember()
	 * @generated
	 */
	int FAMILY_MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Father Inverse</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__FATHER_INVERSE = 1;

	/**
	 * The feature id for the '<em><b>Mother Inverse</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__MOTHER_INVERSE = 2;

	/**
	 * The feature id for the '<em><b>Sons Inverse</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__SONS_INVERSE = 3;

	/**
	 * The feature id for the '<em><b>Daughters Inverse</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER__DAUGHTERS_INVERSE = 4;

	/**
	 * The number of structural features of the '<em>Family Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Family Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MEMBER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link FamiliesWithSiblings.FamilyRegister <em>Family Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family Register</em>'.
	 * @see FamiliesWithSiblings.FamilyRegister
	 * @generated
	 */
	EClass getFamilyRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link FamiliesWithSiblings.FamilyRegister#getFamilies <em>Families</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Families</em>'.
	 * @see FamiliesWithSiblings.FamilyRegister#getFamilies()
	 * @see #getFamilyRegister()
	 * @generated
	 */
	EReference getFamilyRegister_Families();

	/**
	 * Returns the meta object for class '{@link FamiliesWithSiblings.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see FamiliesWithSiblings.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the containment reference '{@link FamiliesWithSiblings.Family#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Father</em>'.
	 * @see FamiliesWithSiblings.Family#getFather()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Father();

	/**
	 * Returns the meta object for the containment reference '{@link FamiliesWithSiblings.Family#getMother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mother</em>'.
	 * @see FamiliesWithSiblings.Family#getMother()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Mother();

	/**
	 * Returns the meta object for the containment reference list '{@link FamiliesWithSiblings.Family#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sons</em>'.
	 * @see FamiliesWithSiblings.Family#getSons()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Sons();

	/**
	 * Returns the meta object for the containment reference list '{@link FamiliesWithSiblings.Family#getDaughters <em>Daughters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daughters</em>'.
	 * @see FamiliesWithSiblings.Family#getDaughters()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Daughters();

	/**
	 * Returns the meta object for the attribute '{@link FamiliesWithSiblings.Family#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FamiliesWithSiblings.Family#getName()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_Name();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesWithSiblings.Family#getFamiliesInverse <em>Families Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Families Inverse</em>'.
	 * @see FamiliesWithSiblings.Family#getFamiliesInverse()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_FamiliesInverse();

	/**
	 * Returns the meta object for the reference list '{@link FamiliesWithSiblings.Family#getSiblings <em>Siblings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Siblings</em>'.
	 * @see FamiliesWithSiblings.Family#getSiblings()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Siblings();

	/**
	 * Returns the meta object for class '{@link FamiliesWithSiblings.FamilyMember <em>Family Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family Member</em>'.
	 * @see FamiliesWithSiblings.FamilyMember
	 * @generated
	 */
	EClass getFamilyMember();

	/**
	 * Returns the meta object for the attribute '{@link FamiliesWithSiblings.FamilyMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FamiliesWithSiblings.FamilyMember#getName()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EAttribute getFamilyMember_Name();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesWithSiblings.FamilyMember#getFatherInverse <em>Father Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Father Inverse</em>'.
	 * @see FamiliesWithSiblings.FamilyMember#getFatherInverse()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EReference getFamilyMember_FatherInverse();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesWithSiblings.FamilyMember#getMotherInverse <em>Mother Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mother Inverse</em>'.
	 * @see FamiliesWithSiblings.FamilyMember#getMotherInverse()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EReference getFamilyMember_MotherInverse();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesWithSiblings.FamilyMember#getSonsInverse <em>Sons Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sons Inverse</em>'.
	 * @see FamiliesWithSiblings.FamilyMember#getSonsInverse()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EReference getFamilyMember_SonsInverse();

	/**
	 * Returns the meta object for the container reference '{@link FamiliesWithSiblings.FamilyMember#getDaughtersInverse <em>Daughters Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Daughters Inverse</em>'.
	 * @see FamiliesWithSiblings.FamilyMember#getDaughtersInverse()
	 * @see #getFamilyMember()
	 * @generated
	 */
	EReference getFamilyMember_DaughtersInverse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FamiliesWithSiblingsFactory getFamiliesWithSiblingsFactory();

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
		 * The meta object literal for the '{@link FamiliesWithSiblings.impl.FamilyRegisterImpl <em>Family Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FamiliesWithSiblings.impl.FamilyRegisterImpl
		 * @see FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl#getFamilyRegister()
		 * @generated
		 */
		EClass FAMILY_REGISTER = eINSTANCE.getFamilyRegister();

		/**
		 * The meta object literal for the '<em><b>Families</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_REGISTER__FAMILIES = eINSTANCE.getFamilyRegister_Families();

		/**
		 * The meta object literal for the '{@link FamiliesWithSiblings.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FamiliesWithSiblings.impl.FamilyImpl
		 * @see FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Father</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__FATHER = eINSTANCE.getFamily_Father();

		/**
		 * The meta object literal for the '<em><b>Mother</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MOTHER = eINSTANCE.getFamily_Mother();

		/**
		 * The meta object literal for the '<em><b>Sons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__SONS = eINSTANCE.getFamily_Sons();

		/**
		 * The meta object literal for the '<em><b>Daughters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__DAUGHTERS = eINSTANCE.getFamily_Daughters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY__NAME = eINSTANCE.getFamily_Name();

		/**
		 * The meta object literal for the '<em><b>Families Inverse</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__FAMILIES_INVERSE = eINSTANCE.getFamily_FamiliesInverse();

		/**
		 * The meta object literal for the '<em><b>Siblings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__SIBLINGS = eINSTANCE.getFamily_Siblings();

		/**
		 * The meta object literal for the '{@link FamiliesWithSiblings.impl.FamilyMemberImpl <em>Family Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FamiliesWithSiblings.impl.FamilyMemberImpl
		 * @see FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl#getFamilyMember()
		 * @generated
		 */
		EClass FAMILY_MEMBER = eINSTANCE.getFamilyMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY_MEMBER__NAME = eINSTANCE.getFamilyMember_Name();

		/**
		 * The meta object literal for the '<em><b>Father Inverse</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER__FATHER_INVERSE = eINSTANCE.getFamilyMember_FatherInverse();

		/**
		 * The meta object literal for the '<em><b>Mother Inverse</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER__MOTHER_INVERSE = eINSTANCE.getFamilyMember_MotherInverse();

		/**
		 * The meta object literal for the '<em><b>Sons Inverse</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER__SONS_INVERSE = eINSTANCE.getFamilyMember_SonsInverse();

		/**
		 * The meta object literal for the '<em><b>Daughters Inverse</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MEMBER__DAUGHTERS_INVERSE = eINSTANCE.getFamilyMember_DaughtersInverse();

	}

} //FamiliesWithSiblingsPackage
