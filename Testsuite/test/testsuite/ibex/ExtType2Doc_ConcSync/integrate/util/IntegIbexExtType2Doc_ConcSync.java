package testsuite.ibex.ExtType2Doc_ConcSync.integrate.util;

import java.io.IOException;

import org.benchmarx.extDocModel.core.ExtDocModelComparator;
import org.benchmarx.extTypeModel.core.ExtTypeModelComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.exttype2doc_concsync.INTEGRATE_App;
import org.emoflon.ibex.tgg.run.exttype2doc_concsync.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.exttype2doc_concsync.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.exttype2doc_concsync.config.ViatraRegistrationHelper;

import ExtDocModel.DocContainer;
import ExtTypeModel.Project;
import testsuite.ibex.testUtil.IntegIbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IntegIbexExtType2Doc_ConcSync extends IntegIbexAdapter<Project, DocContainer> {

	private final String inputFolder;

	public IntegIbexExtType2Doc_ConcSync(String projectName, String inputFolder) {
		super(new ExtTypeModelComparator(true), new ExtDocModelComparator(true), new ExtType2Doc_ConcSync_CorrComp(),
				projectName);
		this.inputFolder = inputFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			INTEGRATE_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[] {
					new HiPERegistrationHelper(), new DemoclesRegistrationHelper(), new ViatraRegistrationHelper() });
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					"/resources/integ/in/" + inputFolder, ilpSolver, false);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
