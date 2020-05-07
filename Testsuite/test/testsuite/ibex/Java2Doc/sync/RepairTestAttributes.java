package testsuite.ibex.Java2Doc.sync;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.junit.Test;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.sync.util.Java2Doc;
import testsuite.ibex.testUtil.SyncTestCase;

public class RepairTestAttributes extends SyncTestCase<Package, Folder>{
	
	private SimpleJavaHelper helperJava;
	private SimpleDocHelper helperDoc;
	
	public RepairTestAttributes() {
		super(new Java2Doc(projectName));
	}

	private static final String projectName = "Java2Doc";

	@Override
	protected void initHelpers() {
		helperJava = new SimpleJavaHelper();
		helperDoc = new SimpleDocHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Test
	public void testInit()
	{
		//------------
		assertPostcondition("in/init", "expected/init");
	}
	
	@Test
	public void testMoflon_FWD()
	{
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		assertPostcondition("in/moflon_FWD", "expected/moflon_FWD");
	}
	
	@Test
	public void testMoflon_BWD()
	{
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateTargetEdit(p -> helperDoc.createMoflon(p));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		assertPostcondition("expected/moflon_BWD", "in/moflon_BWD");
	}
	
	@Test
	public void testMoflon_rootRenamed_FWD()
	{
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		assertPrecondition("in/moflon_FWD", "expected/moflon_FWD");
		//------------
		tool.performIdleSourceEdit(p -> p.setName("de"));
		assertPostcondition("in/moflon_rootRenamed_FWD", "expected/moflon_rootRenamed_FWD");
	}
	
	@Test
	public void testMoflon_rootRenamed_BWD()
	{
		tool.performAndPropagateTargetEdit(f -> helperDoc.createMoflon(f));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		assertPrecondition("expected/moflon_BWD", "in/moflon_BWD");
		//------------
		tool.performIdleTargetEdit(f -> f.setName("de"));
		assertPostcondition("expected/moflon_rootRenamed_BWD", "in/moflon_rootRenamed_BWD");
	}
	
	
	@Test
	public void testMoflon_ibexRenamed_FWD()
	{
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		assertPrecondition("in/moflon_FWD", "expected/moflon_FWD");
		//------------
		tool.performIdleSourceEdit(p -> helperJava.rename(p, "ibex", "democles"));
		assertPostcondition("in/moflon_ibexRenamed_FWD", "expected/moflon_ibexRenamed_FWD");
	}
	
	@Test
	public void testMoflon_renameRoot_BWD()
	{
		tool.performAndPropagateTargetEdit(f -> helperDoc.createMoflon(f));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		assertPrecondition("expected/moflon_BWD", "in/moflon_BWD");
		//------------
		tool.performIdleTargetEdit(f -> helperDoc.rename(f, "ibex", "democles"));
		assertPostcondition("expected/moflon_ibexRenamed_BWD", "in/moflon_ibexRenamed_BWD");
	}
	
	@Test
	public void testMoflon_GTRenamed_FWD()
	{
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		assertPrecondition("in/moflon_FWD", "expected/moflon_FWD");
		//------------
		tool.performIdleSourceEdit(p -> helperJava.rename(p, "GT", "SDM"));
		assertPostcondition("in/moflon_GTrenamed_FWD", "expected/moflon_GTrenamed_FWD");
	}
	
	@Test
	public void testMoflon_GTRoot_BWD()
	{
		tool.performAndPropagateTargetEdit(f -> helperDoc.createMoflon(f));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		assertPrecondition("expected/moflon_BWD", "in/moflon_BWD");
		//------------
		tool.performIdleTargetEdit(f -> helperDoc.rename(f, "GT", "SDM"));
		assertPostcondition("expected/moflon_GTrenamed_BWD", "in/moflon_GTrenamed_BWD");
	}
}
