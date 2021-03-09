package testsuite.ibex.ExtType2Doc_SCDerived.sync.util;

import java.io.IOException;

import org.benchmarx.extDocModel.core.ExtDocModelComparator;
import org.benchmarx.extTypeModel.core.ExtTypeModelComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.exttype2doc_scderived.SYNC_App;
import org.emoflon.ibex.tgg.run.exttype2doc_scderived.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.exttype2doc_scderived.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.exttype2doc_scderived.config.ViatraRegistrationHelper;

import ExtDocModel.Folder;
import ExtTypeModel.ExtTypeModelFactory;
import ExtTypeModel.Package;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexExtType2Doc_SCDerived extends IbexAdapter<Package, Folder> {

	public IbexExtType2Doc_SCDerived(String projectName) {
		super(new ExtTypeModelComparator(true), new ExtDocModelComparator(true), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose( //
					new IRegistrationHelper[] { new HiPERegistrationHelper(), new DemoclesRegistrationHelper(), new ViatraRegistrationHelper() });
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, ilpSolver, false);
			
			Package p = ExtTypeModelFactory.eINSTANCE.createPackage();
			p.setName("P0");
			synchroniser.getResourceHandler().getSourceResource().getContents().add(p);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
