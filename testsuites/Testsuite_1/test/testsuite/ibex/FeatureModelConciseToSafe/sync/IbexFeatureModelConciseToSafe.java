package testsuite.ibex.FeatureModelConciseToSafe.sync;

import java.io.IOException;

import org.benchmarx.featuremodelconcise.core.FeatureModelConciseComparator;
import org.benchmarx.featuremodelsafe.core.FeatureModelSafeComparator;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.SYNC_App;

import FeatureModelConcise.Feature;
import FeatureModelConcise.FeatureModelConciseFactory;
import FeatureModelConcise.Model;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexFeatureModelConciseToSafe extends IbexAdapter<Model, FeatureModelSafe.Model> {

	public IbexFeatureModelConciseToSafe(boolean flatten, String projectName) {
		super(new FeatureModelConciseComparator(true), new FeatureModelSafeComparator(true), flatten, projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite.ibex.testUtil.Constants.workspacePath, flatten, false);
			
			Model m = FeatureModelConciseFactory.eINSTANCE.createModel();
			Feature root = FeatureModelConciseFactory.eINSTANCE.createFeature();
			m.setName("Test");
			root.setName("Car");
			m.setRoot(root);
			
			synchroniser.getSourceResource().getContents().add(m);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
