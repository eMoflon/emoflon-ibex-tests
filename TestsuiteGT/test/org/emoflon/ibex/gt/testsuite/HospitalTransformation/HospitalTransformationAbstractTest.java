package org.emoflon.ibex.gt.testsuite.HospitalTransformation;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import hospital.HospitalTransformation.api.HospitalTransformationAPI;
import hospital.HospitalTransformation.api.HospitalTransformationApp;
	
public class HospitalTransformationAbstractTest extends GTAppTestCase<HospitalTransformationApp, HospitalTransformationAPI>{

		@Override
		protected String getTestName() {
			return "HospitalTransformation";
		}

		@Override
		protected HospitalTransformationApp getApp() {
			return new HospitalTransformationApp(initEngine(), workspacePath);
		}
}

