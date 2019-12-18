package testsuite.ibex.ArToQou.sync;

import org.benchmarx.ar.core.ArHelper;
import org.junit.Test;

import Ar.AClass;
import Ar.BClass;
import Ar.RClass;
import Qou.QClass;
import testsuite.ibex.ArToQou.sync.util.IbexArToQou;
import testsuite.ibex.testUtil.SyncTestCase;

public class ShortCutInheritance extends SyncTestCase<RClass, QClass> {
	
	private static final String projectName = "ArToQou";
	
	private ArHelper helperAr;

	public ShortCutInheritance() {
		super(new IbexArToQou(projectName));
	}

	@Override
	protected void initHelpers() {
		helperAr = new ArHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Test
	public void initialTest() {
		assertPostcondition("in/init", "expected/init");
	}
	
	@Test
	public void abba_sequence() {
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateSourceEdit(r -> {
			AClass a1 = helperAr.createAClass("a1");
			BClass b2 = helperAr.createBClass("b2");
			BClass b3 = helperAr.createBClass("b3");
			AClass a4 = helperAr.createAClass("a4");
			
			r.setFirst(a1);
			a1.setNextB(b2);
			
			b2.setNextA(b3);
			b3.setNextA(a4);
		});
	}

}
