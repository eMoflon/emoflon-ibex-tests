package testsuite.ibex.ExtType2Doc_SCDerived.sync.util;

import java.io.IOException;

import org.benchmarx.extDocModel.core.ExtDocModelComparator;
import org.benchmarx.extTypeModel.core.ExtTypeModelComparator;
import org.emoflon.ibex.tgg.run.exttype2doc_scderived.SYNC_App;
import org.emoflon.ibex.tgg.run.exttype2doc_scderived.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;

import ExtDocModel.DocContainer;
import ExtTypeModel.ExtTypeModelFactory;
import ExtTypeModel.Project;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexExtType2Doc_SCDerived extends IbexAdapter<Project, DocContainer> {

	public IbexExtType2Doc_SCDerived(String projectName) {
		super(new ExtTypeModelComparator(true), new ExtDocModelComparator(true), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose( //
					new IRegistrationHelper[] { new HiPERegistrationHelper() });
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, ilpSolver, false);
			
			Project pr = ExtTypeModelFactory.eINSTANCE.createProject();
			synchroniser.getResourceHandler().getSourceResource().getContents().add(pr);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
