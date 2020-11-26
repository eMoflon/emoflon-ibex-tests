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
		testsuite.ibex.TerraceHouses2BlockSet.integrate.Multiplicity.class //
})
public class AllIntegrateTests {
}
