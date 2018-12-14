package testsuite.ibex.IBeXTGGGanttToCPM.sync.batch.bwd;

import org.junit.Test;

import testsuite.ibex.IBeXTGGGanttToCPM.sync.GanttToCPMTestCase;

public class BatchBackward extends GanttToCPMTestCase {
	/**
	 * <b>Test</b> for name change of an empty cpm network.<br/>
	 * <b>Expect</b> name in the gantt diagram is also changed.<br/>
	 * <b>Features</b>: bwd, fixed
	 */
	@Test
	public void testCpmNameChangeOfEmpty()
	{
		tool.performAndPropagateTargetEdit(helperCPM::createEmptyGantt2CPMProcedure);

		assertPrecondition("EmptyGantt2CpmGantt", "EmptyGantt2CpmCpm");
		//------------
		tool.performAndPropagateTargetEdit(helperCPM::createEmptyItalyTankRush);
		//------------
		assertPostcondition("EmptyItalyTankRushGantt", "EmptyItalyTankRushCpm");
	}
	
	/**
	 * <b>Test</b> for creation of a simple cpm network.
	 * <br/>
	 * <b>Expect</b> the creation of the corresponding gantt diagram.
	 * <br/>
	 * <b>Features:</b>: bwd, fixed
	 */
	@Test
	public void testCreateCpm()
	{
		// No precondition!
		//------------
		tool.performAndPropagateTargetEdit(helperCPM::createSimpleTankRush);
		//------------
		assertPostcondition("SimpleTankRushGantt", "SimpleTankRushCpm");
	}

	/**
	 * Analogous to @link {@link #testCreateCpm()}, now with all possible dependency types.<br/>
	 * <b>Features:</b>: bwd, fixed
	 */
	@Test 
	public void testCreateComplexGantt(){ // rename to CPM?
		// No precondition!
		//------------
		tool.performAndPropagateTargetEdit(helperCPM::createComplexTankRush);
		//------------
		assertPostcondition("ComplexTankRushGantt", "ComplexTankRushCpm");
	}
}
