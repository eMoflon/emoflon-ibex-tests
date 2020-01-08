package testsuite.ibex.FeatureModelConciseToSafe.sync;

import java.io.IOException;

import org.benchmarx.featuremodelconcise.core.FeatureModelConciseComparator;
import org.benchmarx.featuremodelsafe.core.FeatureModelSafeComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.SYNC_App;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.config.HiPERegistrationHelper;

import FeatureModelConcise.Feature;
import FeatureModelConcise.FeatureModelConciseFactory;
import FeatureModelConcise.Model;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexFeatureModelConciseToSafe extends IbexAdapter<Model, FeatureModelSafe.Model> {

	public IbexFeatureModelConciseToSafe(String projectName) {
		super(new FeatureModelConciseComparator(true), new FeatureModelSafeComparator(true), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			Model m = FeatureModelConciseFactory.eINSTANCE.createModel();
			Feature root = FeatureModelConciseFactory.eINSTANCE.createFeature();
			m.setName("Test");
			root.setName("Car");
			m.setRoot(root);
			
			synchroniser.getResourceHandler().getSourceResource().getContents().add(m);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
