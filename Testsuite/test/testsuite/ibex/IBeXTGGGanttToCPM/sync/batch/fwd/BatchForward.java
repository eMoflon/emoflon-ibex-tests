package testsuite.ibex.IBeXTGGGanttToCPM.sync.batch.fwd;

import org.junit.jupiter.api.Test;

import testsuite.ibex.IBeXTGGGanttToCPM.sync.GanttToCPMTestCase;

public class BatchForward extends GanttToCPMTestCase {
	/**
	 * <b>Test</b> for agreed upon starting state.<br/>
	 * <b>Expect</b> root elements of both source and target models.<br/>
	 * <b>Features</b>: fwd, fixed
	 */
	@Test
	public void testInitialiseSynchronisation() {
		// No precondition!
		//------------
		assertPostcondition("RootElementGantt", "RootElementCpm");
	}
	
	/**
	 * <b>Test</b> for name change of an empty gantt diagram.<br/>
	 * <b>Expect</b> name in the cpm network is also changed.<br/>
	 * <b>Features</b>: fwd, fixed
	 */
	@Test
	public void testGanttNameChangeOfEmpty()
	{
		tool.performAndPropagateSourceEdit(helperGantt::createEmptyGantt2CPMProcedure);

		assertPrecondition("EmptyGantt2CpmGantt", "EmptyGantt2CpmCpm");
		//------------
		tool.performAndPropagateSourceEdit(helperGantt::createEmptyItalyTankRush);
		//------------
		assertPostcondition("EmptyItalyTankRushGantt", "EmptyItalyTankRushCpm");
	}
	
	/**
	 * <b>Test</b> for creation of a simple gantt diagram.
	 * <br/>
	 * <b>Expect</b> the creation of the corresponding cpm network.
	 * <br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testCreateGantt()
	{
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(helperGantt::createSimpleTankRush);
		//------------
		assertPostcondition("SimpleTankRushGantt", "SimpleTankRushCpm");
	}

	/**
	 * Analogous to @link {@link #testCreateGantt()}, now with all possible dependency types.<br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test 
	public void testCreateComplexGantt(){
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(helperGantt::createComplexTankRush);
		//------------
		assertPostcondition("ComplexTankRushGantt", "ComplexTankRushCpm");
	}
}
