package testsuite.ibex.intergate;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ //
		testsuite.ibex.Clazz2GlossarDoc.integrate.Basic.class, //
		testsuite.ibex.Clazz2GlossarDoc.integrate.Combined.class, //
		testsuite.ibex.Clazz2GlossarDoc.integrate.Move.class, //
		testsuite.ibex.CompanyToIT.integrate.Basic.class, //
		testsuite.ibex.Java2Doc.integrate.Del.class, //
		testsuite.ibex.Java2Doc.integrate.DeletePreserve.class, //
		testsuite.ibex.TerraceHouses2BlockSet.integrate.Multiplicity.class, //
		testsuite.ibex.Express2Uml.integrate.DeletePreserveConflictMultiAttr.class, //
		testsuite.ibex.Express2Uml.integrate.DeletePreserveConflictMultiEntity.class, //
		testsuite.ibex.Express2Uml.integrate.DeletePreserveConflictSingleAttr.class, //
		testsuite.ibex.Express2Uml.operationaldelta.DeleteCorrespondencesOperationalDelta.class, //
		testsuite.ibex.Express2Uml.operationaldelta.MergeAndPreserveOperationalDelta.class, //
		testsuite.ibex.Express2Uml.operationaldelta.PreferSourceOperationalDelta.class, //
		testsuite.ibex.Express2Uml.operationaldelta.PreferTargetOperationalDelta.class, //
		testsuite.ibex.Express2Uml.operationaldelta.RevokeAdditionOperationalDelta.class, //
		testsuite.ibex.Express2Uml.operationaldelta.RevokeDeletionOperationalDelta.class //
})
public class AllIntegrateTests {
}
