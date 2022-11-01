package org.emoflon.ibex.gt.testsuite.HospitalTransformation;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import hospital.gt.api.GtHiPEGtAPI;

	
public class HospitalTransformationAbstractTest extends GTAppTestCase<GtHiPEGtAPI>{

		@Override
		protected String getTestName() {
			return "HospitalTransformation";
		}

		@Override
		protected GtHiPEGtAPI getApi() {
			return new GtHiPEGtAPI();
		}
}

