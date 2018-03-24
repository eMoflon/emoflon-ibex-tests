package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;

import SheRememberedCaterpillars.COLOR;
import SheRememberedCaterpillars.SheRememberedCaterpillarsPackage;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;

/**
 * Abstract test class for the SheRememberedCaterpillars Graph Transformation
 * API. All tests for this API should inherit from this class.
 */
public abstract class SheRememberedCaterpillarsAbstractTest
		extends GTTestCase<SheRememberedCaterpillarsGraphTransformationAPI> {
	@Override
	public String getTestName() {
		return "SheRememberedCaterpillars";
	}

	@Override
	protected SheRememberedCaterpillarsGraphTransformationAPI getAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new SheRememberedCaterpillarsGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(SheRememberedCaterpillarsPackage.eNS_URI, SheRememberedCaterpillarsPackage.eINSTANCE);
		return map;
	}

	public static void assertCharacterColorCount(final SheRememberedCaterpillarsGraphTransformationAPI api,
			final int blueCount, final int redCount, final int purpleCount) {
		assertMatchCount(blueCount, api.findCharacterOfColor(COLOR.BLUE));
		assertMatchCount(redCount, api.findCharacterOfColor(COLOR.RED));
		assertMatchCount(purpleCount, api.findCharacterOfColor(COLOR.PURPLE));
	}
}
