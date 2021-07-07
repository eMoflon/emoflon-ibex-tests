package org.emoflon.ibex.gt.testsuite.VoterModel;

import GroupVotersModel.GroupVotersContainer;
import VoterModelGraphTransformation.api.VoterModelGraphTransformationAPI;
import util.visualization.VoterModelUi;

public class VoterModelVisualization extends VoterModelAbstractTest {
	
	public static void main(String[] args) {
		VoterModelVisualization vis = new VoterModelVisualization();
		VoterModelGraphTransformationAPI api = vis.init("VoterModel1.xmi");
		VoterModelUi ui = new VoterModelUi((GroupVotersContainer) api.getModel().getResources().get(0).getContents().get(0), "VoterModel1");
		ui.display();
		api.terminate();
	}
}
