package testsuite.ibex.ArToQou.sync;

import org.benchmarx.ar.core.ArHelper;
import org.benchmarx.qou.core.QouHelper;
import org.junit.Test;

import Ar.ArFactory;
import Ar.RClass;
import Ar.SClass;
import Ar.TClass;
import Qou.QClass;
import testsuite.ibex.ArToQou.sync.util.IbexArToQou;
import testsuite.ibex.testUtil.SyncTestCase;

public class ShortCutInplaceAttribute extends SyncTestCase<RClass, QClass> {
	
	private static final String projectName = "ArToQou";
	
	private ArHelper helperAr;
	private QouHelper helperQou;

	public ShortCutInplaceAttribute() {
		super(new IbexArToQou(projectName));
	}

	@Override
	protected void initHelpers() {
		helperAr = new ArHelper();
		helperQou = new QouHelper();
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
	public void attributeChange_FWD() {
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateTargetEdit(helperQou::createULess);
		tool.performAndPropagateSourceEdit(helperAr::fillIDs);
		assertPrecondition("expected/u_less", "in/u_less");
		
		tool.performAndPropagateSourceEdit(r -> {
			SClass s = r.getS().get(0);
			TClass t = ArFactory.eINSTANCE.createTClass();
			s.setT(t);
		});
		assertPostcondition("in/u_more", "expected/u_more");
	}
	
	@Test
	public void attributeChange_BWD() {
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateTargetEdit(helperQou::createULess);
		tool.performAndPropagateSourceEdit(helperAr::fillIDs);
		assertPrecondition("expected/u_less", "in/u_less");
		
		tool.performAndPropagateTargetEdit(q -> {
			q.getU().get(0).setHasMore(true);
		});
		assertPostcondition("in/u_more", "expected/u_more");
	}

}
