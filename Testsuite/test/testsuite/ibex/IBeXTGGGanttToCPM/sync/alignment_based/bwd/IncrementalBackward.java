package testsuite.ibex.IBeXTGGGanttToCPM.sync.alignment_based.bwd;

import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.IBeXTGGGanttToCPM.sync.GanttToCPMTestCase;

public class IncrementalBackward extends GanttToCPMTestCase {
	/**
	 * <b>Test</b> for inserting new activities and events into an existing cpm network. <br/>
	 * <b>Expect</b> : New dependencies and activities are added to the gantt diagram, while the old dependencies and activities
	 * remain unchanged. <br/>
	 * <b>Features</b>: fwd, add, fixed
	 */
	@Test
	public void testIncrementalInserts() {
		tool.performAndPropagateTargetEdit(util
				.execute(helperCPM::createCPM2GanttTestCases)
				.andThen(helperCPM::changeIncrementalID));
		tool.performIdleSourceEdit(helperGantt::changeIncrementalID);
		
		assertPrecondition("TestsGantt", "TestsCPM");
		//------------
		tool.performAndPropagateTargetEdit(util
				.execute(helperCPM::addCPM2GanttHelpers)
				.andThen(helperCPM::addCPM2GanttComparators)
				.andThen(helperCPM::addCPM2GanttModels));
		//------------
		assertPostcondition("TestsHelperModelComparatorGantt", "TestsHelperModelComparatorCPM");
	}
	
	/**
	 * <b>Test</b> for deleting dependencies at first. After that two activites with their incoming dependencies will be deleted.
	 * <b>Expect</b>: Delete the correct events and activities in the gantt diagram.
	 * <b>Features</b>: fwd, del, corr-based, structural
	 */
	@Test
	public void testIncrementalDeletions() {
		tool.performAndPropagateTargetEdit(util
				.execute(helperCPM::createCPM2GanttTestCases)
				.andThen(helperCPM::addCPM2GanttHelpers)
				.andThen(helperCPM::addCPM2GanttComparators)
				.andThen(helperCPM::addCPM2GanttModels)
				.andThen(helperCPM::addCPM2GanttModelsToComparatorDependencies)
				.andThen(helperCPM::changeIncrementalID));
		tool.performIdleSourceEdit(helperGantt::changeIncrementalID);
		
		assertPrecondition("TestsHelperModel-ComparatorGantt", "TestsHelperModel-ComparatorCPM");
		//Delete Dependency
		//------------
		tool.performAndPropagateTargetEdit(helperCPM::deleteCPM2GanttModelsToComparatorDependencies);
		//------------
		assertPostcondition("TestsHelperModelComparatorGantt", "TestsHelperModelComparatorCPM");
		
		//Delete Activity
		//------------
		tool.performAndPropagateTargetEdit(helperCPM::deleteCPM2GanttHelpers);
		//------------
		assertPostcondition("TestsModelComparatorGantt", "TestsModelComparatorCPM");
	}
	
	/**
	 * <b>Test</b> for changing values in different events and activities.
	 * <b>Expect</b>: Change the values of the affected variables in activities and dependencies of the gantt diagram.
	 * <b>Features</b>: fwd, attribute, fixed, structural, corr-based
	 */
	@Ignore("Non-deterministic")
	@Test
	public void testIncrementalValueChange() {
		tool.performAndPropagateTargetEdit(util
				.execute(helperCPM::createCPM2GanttTestCases)
				.andThen(helperCPM::addCPM2GanttHelpers)
				.andThen(helperCPM::addCPM2GanttComparators)
				.andThen(helperCPM::addCPM2GanttModels)
				.andThen(helperCPM::addCPM2GanttModelsToComparatorDependencies)
				.andThen(helperCPM::changeIncrementalID));
		tool.performIdleSourceEdit(helperGantt::changeIncrementalID);
		
		assertPrecondition("TestsHelperModel-ComparatorGantt", "TestsHelperModel-ComparatorCPM");
		//------------
		tool.performAndPropagateTargetEdit(util
				.execute(helperCPM::changeCPM2GanttHelperToBuilder)
				.andThen(helperCPM::changeCPM2GanttModelDuration));
		//------------
		assertPostcondition("TestsBuilderMModel-ComparatorGantt", "TestsBuilderMModel-ComparatorCPM");
		//------------
		tool.performAndPropagateTargetEdit(util
				.execute(helperCPM::changeCPM2GanttTestCasesNameDuration)
				.andThen(helperCPM::changeCPM2GanttModelToComparatorDependencyTypeDurationTargetAndSource));
		//------------
		assertPostcondition("TestsBuilderModelComparatorModifiedGantt", "TestsBuilderModelComparatorModifiedCPM");
	}

	/**
	 * <b>Test</b> for stability of the transformation.<br/>
	 * <b>Expect</b> re-running the transformation after an idle source delta does not change the source model.<br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testStability() {		
		tool.performAndPropagateTargetEdit(util
				.execute(helperCPM::createCPM2GanttTestCases)
				.andThen(helperCPM::addCPM2GanttHelpers)
				.andThen(helperCPM::addCPM2GanttComparators)
				.andThen(helperCPM::addCPM2GanttModels)
				.andThen(helperCPM::addCPM2GanttModelsToComparatorDependencies)
				.andThen(helperCPM::changeIncrementalID));
		tool.performIdleSourceEdit(helperGantt::changeIncrementalID);

		assertPrecondition("TestsHelperModel-ComparatorGantt", "TestsHelperModel-ComparatorCPM");
		//------------
		tool.performAndPropagateTargetEdit(helperCPM::idleDelta);
		//------------
		assertPostcondition("TestsHelperModel-ComparatorGantt", "TestsHelperModel-ComparatorCPM");
	}
	
	/**
	 * <b>Test</b> for hippocraticness of the transformation.<br/>
	 * <b>Expect</b> re-running the transformation after changing the incrementalID does not change the diagram.<br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testHipporcraticness() {
		tool.performAndPropagateTargetEdit(util
				.execute(helperCPM::createCPM2GanttTestCases)
				.andThen(helperCPM::addCPM2GanttHelpers)
				.andThen(helperCPM::addCPM2GanttComparators)
				.andThen(helperCPM::addCPM2GanttModels)
				.andThen(helperCPM::addCPM2GanttModelsToComparatorDependencies)
				.andThen(helperCPM::changeIncrementalID));
		tool.performIdleSourceEdit(helperGantt::changeIncrementalID);
		
		assertPrecondition("TestsHelperModel-ComparatorGantt", "TestsHelperModel-ComparatorCPM");
		//------------
		tool.performAndPropagateTargetEdit(helperCPM::changeIncrementalID);
		//------------
		assertPostcondition("TestsHelperModel-ComparatorGantt", "TestsHelperModel-ComparatorChangedAgainCPM");
	}
}
