package testsuite.ibex.ExtType2Doc_SCDerived.sync;

import org.benchmarx.extDocModel.core.ExtDocHelper;
import org.benchmarx.extTypeModel.core.ExtTypeHelper;
import org.junit.Test;

import ExtDocModel.Doc;
import ExtDocModel.Folder;
import ExtTypeModel.Package;
import ExtTypeModel.Type;
import testsuite.ibex.ExtType2Doc_SCDerived.sync.util.IbexExtType2Doc_SCDerived;
import testsuite.ibex.testUtil.SyncTestCase;

public class Derived extends SyncTestCase<Package, Folder> {

	private static final String projectName = "ExtType2Doc_SCDerived";

	private ExtTypeHelper helperExtType;
	private ExtDocHelper helperExtDoc;

	public Derived() {
		super(new IbexExtType2Doc_SCDerived(projectName));
	}

	@Override
	protected void initHelpers() {
		helperExtType = new ExtTypeHelper(tool.getSourceModel());
		helperExtDoc = new ExtDocHelper(tool.getTargetModel());
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}

	@Test
	public void testInit() {
		assertPostcondition("src/init", "trg/init");
	}

	@Test
	public void derivedTypeNames() {
		tool.performAndPropagateSourceEdit(p -> {
			Package p1 = helperExtType.createPackage(p, "P1");
			Type t2 = helperExtType.createType(p1, "T2");
			Type t3 = helperExtType.createType(p1, "T3");
			helperExtType.createTypeExtensionLink(t2, t3);
		});
		
		assertPostcondition("src/derivedTypeNames", "trg/derivedTypeNames");
		
		tool.performAndPropagateTargetEdit(dc -> {
			Doc d3 = helperExtDoc.getDoc("P0.P1.T3");
			d3.setName("changed_derived_name.T3");
		});
		
		assertPostcondition("src/derivedTypeNames", "trg/derivedTypeNames");
	}

}
