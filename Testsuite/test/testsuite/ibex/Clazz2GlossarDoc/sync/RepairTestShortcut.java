package testsuite.ibex.Clazz2GlossarDoc.sync;

import org.glossarDoc.core.GlossarDocumentationHelper;
import org.junit.Test;
import org.simpleClass.core.SimpleClassInheritanceHelper;

import glossarDocumentation.DocumentationContainer;
import simpleClassInheritance.Clazz;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.Method;
import simpleClassInheritance.Parameter;
import testsuite.ibex.Clazz2GlossarDoc.sync.util.IbexClazz2GlossarDocAdapter;
import testsuite.ibex.testUtil.SyncTestCase;

public class RepairTestShortcut extends SyncTestCase<ClazzContainer, DocumentationContainer> {

	private static final String projectName = "Clazz2GlossarDoc";

	private SimpleClassInheritanceHelper helperClazz;
	@SuppressWarnings("unused")
	private GlossarDocumentationHelper helperDoc;

	public RepairTestShortcut() {
		super(new IbexClazz2GlossarDocAdapter(projectName));
	}

	@Override
	protected void initHelpers() {
		helperClazz = new SimpleClassInheritanceHelper(tool.getSourceModel());
		helperDoc = new GlossarDocumentationHelper(tool.getTargetModel());
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}

	@Test
	public void moveParameter() {
		tool.performAndPropagateSourceEdit(c -> {
			Clazz c1 = helperClazz.createClazz("C1");
			Method m2 = helperClazz.createMethod(c1, "M2");
			helperClazz.createMethod(c1, "M3");
			helperClazz.createParameter(m2, "P4");
		});

		assertPrecondition("sync/src/init", "sync/trg/init");

		tool.performAndPropagateSourceEdit(c -> {
			Parameter p4 = helperClazz.getParameter(helperClazz.getMethod("M2"), "P4");
			Method m3 = helperClazz.getMethod("M3");
			p4.setMethod(m3);
		});

		// FIXME adrianm: check, if it actually was repaired and not retranslated
		
		assertPostcondition("sync/src/moveparam", "sync/trg/moveparam");
	}

}
