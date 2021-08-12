package org.emoflon.ibex.gt.EMFGTModels;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import VillageGraphTransformation.api.VillageGraphTransformationAPI;
import VillageGraphTransformation.api.VillageGraphTransformationApp;

public class EMFGTModelTest extends GTAppTestCase<VillageGraphTransformationApp, VillageGraphTransformationAPI>{
	
	@Override
	protected String getTestName() {
		return "EMFModel";
	}

	@Override
	protected VillageGraphTransformationApp getApp() {
		return new VillageGraphTransformationApp(initEngine(), workspacePath);
	}
}
