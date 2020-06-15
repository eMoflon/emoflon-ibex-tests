/**
 */
package aadl2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>aadl2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aadl2Tests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Aadl2Tests("aadl2 Tests");
		suite.addTestSuite(CommentTest.class);
		suite.addTestSuite(PropertyAssociationTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(BasicPropertyTest.class);
		suite.addTestSuite(MetaclassReferenceTest.class);
		suite.addTestSuite(ModalElementTest.class);
		suite.addTestSuite(ModeTest.class);
		suite.addTestSuite(ContainedNamedElementTest.class);
		suite.addTestSuite(ContainmentPathElementTest.class);
		suite.addTestSuite(ArrayRangeTest.class);
		suite.addTestSuite(ModalPropertyValueTest.class);
		suite.addTestSuite(ArrayDimensionTest.class);
		suite.addTestSuite(ArraySizeTest.class);
		suite.addTestSuite(ComponentImplementationReferenceTest.class);
		suite.addTestSuite(ModeTransitionTest.class);
		suite.addTestSuite(ModeTransitionTriggerTest.class);
		suite.addTestSuite(FlowSpecificationTest.class);
		suite.addTestSuite(FlowEndTest.class);
		suite.addTestSuite(TypeExtensionTest.class);
		suite.addTestSuite(FeatureGroupTest.class);
		suite.addTestSuite(FeatureGroupTypeTest.class);
		suite.addTestSuite(GroupExtensionTest.class);
		suite.addTestSuite(BusAccessTest.class);
		suite.addTestSuite(DataAccessTest.class);
		suite.addTestSuite(DataPortTest.class);
		suite.addTestSuite(EventDataPortTest.class);
		suite.addTestSuite(EventPortTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(SubprogramAccessTest.class);
		suite.addTestSuite(SubprogramGroupAccessTest.class);
		suite.addTestSuite(AbstractFeatureTest.class);
		suite.addTestSuite(FeaturePrototypeTest.class);
		suite.addTestSuite(FeatureGroupPrototypeTest.class);
		suite.addTestSuite(ModeBindingTest.class);
		suite.addTestSuite(FlowImplementationTest.class);
		suite.addTestSuite(FlowSegmentTest.class);
		suite.addTestSuite(ConnectedElementTest.class);
		suite.addTestSuite(ImplementationExtensionTest.class);
		suite.addTestSuite(RealizationTest.class);
		suite.addTestSuite(EndToEndFlowTest.class);
		suite.addTestSuite(EndToEndFlowSegmentTest.class);
		suite.addTestSuite(AbstractSubcomponentTest.class);
		suite.addTestSuite(AccessConnectionTest.class);
		suite.addTestSuite(ParameterConnectionTest.class);
		suite.addTestSuite(PortConnectionTest.class);
		suite.addTestSuite(FeatureConnectionTest.class);
		suite.addTestSuite(FeatureGroupConnectionTest.class);
		suite.addTestSuite(EventSourceTest.class);
		suite.addTestSuite(EventDataSourceTest.class);
		suite.addTestSuite(PortProxyTest.class);
		suite.addTestSuite(SubprogramProxyTest.class);
		suite.addTestSuite(DefaultAnnexLibraryTest.class);
		suite.addTestSuite(DefaultAnnexSubclauseTest.class);
		suite.addTestSuite(PublicPackageSectionTest.class);
		suite.addTestSuite(PackageRenameTest.class);
		suite.addTestSuite(AadlPackageTest.class);
		suite.addTestSuite(PrivatePackageSectionTest.class);
		suite.addTestSuite(ComponentTypeRenameTest.class);
		suite.addTestSuite(FeatureGroupTypeRenameTest.class);
		suite.addTestSuite(ComponentPrototypeBindingTest.class);
		suite.addTestSuite(ComponentPrototypeActualTest.class);
		suite.addTestSuite(FeatureGroupPrototypeBindingTest.class);
		suite.addTestSuite(FeatureGroupPrototypeActualTest.class);
		suite.addTestSuite(FeaturePrototypeBindingTest.class);
		suite.addTestSuite(AccessSpecificationTest.class);
		suite.addTestSuite(PortSpecificationTest.class);
		suite.addTestSuite(FeaturePrototypeReferenceTest.class);
		suite.addTestSuite(SubprogramCallSequenceTest.class);
		suite.addTestSuite(SubprogramCallTest.class);
		suite.addTestSuite(AbstractTypeTest.class);
		suite.addTestSuite(AbstractImplementationTest.class);
		suite.addTestSuite(BusSubcomponentTest.class);
		suite.addTestSuite(DataSubcomponentTest.class);
		suite.addTestSuite(DeviceSubcomponentTest.class);
		suite.addTestSuite(MemorySubcomponentTest.class);
		suite.addTestSuite(ProcessSubcomponentTest.class);
		suite.addTestSuite(ProcessorSubcomponentTest.class);
		suite.addTestSuite(SystemSubcomponentTest.class);
		suite.addTestSuite(SubprogramSubcomponentTest.class);
		suite.addTestSuite(SubprogramGroupSubcomponentTest.class);
		suite.addTestSuite(ThreadSubcomponentTest.class);
		suite.addTestSuite(ThreadGroupSubcomponentTest.class);
		suite.addTestSuite(VirtualBusSubcomponentTest.class);
		suite.addTestSuite(VirtualProcessorSubcomponentTest.class);
		suite.addTestSuite(AbstractPrototypeTest.class);
		suite.addTestSuite(BusTypeTest.class);
		suite.addTestSuite(BusImplementationTest.class);
		suite.addTestSuite(BusPrototypeTest.class);
		suite.addTestSuite(DataTypeTest.class);
		suite.addTestSuite(DataImplementationTest.class);
		suite.addTestSuite(DataPrototypeTest.class);
		suite.addTestSuite(DeviceTypeTest.class);
		suite.addTestSuite(DeviceImplementationTest.class);
		suite.addTestSuite(DevicePrototypeTest.class);
		suite.addTestSuite(MemoryTypeTest.class);
		suite.addTestSuite(MemoryImplementationTest.class);
		suite.addTestSuite(MemoryPrototypeTest.class);
		suite.addTestSuite(SubprogramTypeTest.class);
		suite.addTestSuite(SubprogramImplementationTest.class);
		suite.addTestSuite(SubprogramPrototypeTest.class);
		suite.addTestSuite(SubprogramGroupTypeTest.class);
		suite.addTestSuite(SubprogramGroupImplementationTest.class);
		suite.addTestSuite(SubprogramGroupPrototypeTest.class);
		suite.addTestSuite(SystemTypeTest.class);
		suite.addTestSuite(SystemImplementationTest.class);
		suite.addTestSuite(SystemPrototypeTest.class);
		suite.addTestSuite(ProcessorTypeTest.class);
		suite.addTestSuite(ProcessorImplementationTest.class);
		suite.addTestSuite(ProcessorPrototypeTest.class);
		suite.addTestSuite(ProcessTypeTest.class);
		suite.addTestSuite(ProcessImplementationTest.class);
		suite.addTestSuite(ProcessPrototypeTest.class);
		suite.addTestSuite(ThreadTypeTest.class);
		suite.addTestSuite(ThreadImplementationTest.class);
		suite.addTestSuite(ThreadPrototypeTest.class);
		suite.addTestSuite(ThreadGroupTypeTest.class);
		suite.addTestSuite(ThreadGroupImplementationTest.class);
		suite.addTestSuite(ThreadGroupPrototypeTest.class);
		suite.addTestSuite(VirtualBusTypeTest.class);
		suite.addTestSuite(VirtualBusImplementationTest.class);
		suite.addTestSuite(VirtualBusPrototypeTest.class);
		suite.addTestSuite(VirtualProcessorTypeTest.class);
		suite.addTestSuite(VirtualProcessorImplementationTest.class);
		suite.addTestSuite(VirtualProcessorPrototypeTest.class);
		suite.addTestSuite(BasicPropertyAssociationTest.class);
		suite.addTestSuite(PropertyConstantTest.class);
		suite.addTestSuite(StringLiteralTest.class);
		suite.addTestSuite(UnitLiteralTest.class);
		suite.addTestSuite(EnumerationLiteralTest.class);
		suite.addTestSuite(ClassifierValueTest.class);
		suite.addTestSuite(ReferenceValueTest.class);
		suite.addTestSuite(BooleanLiteralTest.class);
		suite.addTestSuite(RangeValueTest.class);
		suite.addTestSuite(IntegerLiteralTest.class);
		suite.addTestSuite(RealLiteralTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(RecordValueTest.class);
		suite.addTestSuite(ComputedValueTest.class);
		suite.addTestSuite(ListValueTest.class);
		suite.addTestSuite(NamedValueTest.class);
		suite.addTestSuite(PropertySetTest.class);
		suite.addTestSuite(GlobalNamespaceTest.class);
		suite.addTestSuite(AadlBooleanTest.class);
		suite.addTestSuite(AadlStringTest.class);
		suite.addTestSuite(AadlIntegerTest.class);
		suite.addTestSuite(UnitsTypeTest.class);
		suite.addTestSuite(EnumerationTypeTest.class);
		suite.addTestSuite(NumericRangeTest.class);
		suite.addTestSuite(AadlRealTest.class);
		suite.addTestSuite(ClassifierTypeTest.class);
		suite.addTestSuite(RangeTypeTest.class);
		suite.addTestSuite(RecordTypeTest.class);
		suite.addTestSuite(RecordFieldTest.class);
		suite.addTestSuite(ReferenceTypeTest.class);
		suite.addTestSuite(ListTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aadl2Tests(String name) {
		super(name);
	}

} //Aadl2Tests
