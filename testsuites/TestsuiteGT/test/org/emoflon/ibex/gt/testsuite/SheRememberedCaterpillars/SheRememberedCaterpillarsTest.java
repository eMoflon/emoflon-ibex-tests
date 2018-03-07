package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;
import org.junit.Test;

import SheRememberedCaterpillars.ExitPlatform;
import SheRememberedCaterpillars.SheRememberedCaterpillarsPackage;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillarsGraphTransformation.api.matches.NoTwoCharactersOnAnExitPlatformMatch;

/**
 * JUnit tests for SheRememberedCaterpillars Graph Transformation API
 */
public class SheRememberedCaterpillarsTest extends GTTestCase<SheRememberedCaterpillarsGraphTransformationAPI> {
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

	@Test
	public void testFindCharacters() {
		ResourceSet model = this.initResourceSet("SheRememberedCaterpillars.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);
		assertMatchCount(2, api.findCharacter());
		assertAnyMatchExists(api.findCharacterNotOnExit());
		assertAnyMatchExists(api.findCharacterOnExit());
	}

	@Test
	public void testNoIllegalSituation() {
		ResourceSet model = this.initResourceSet("SheRememberedCaterpillars.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);
		assertNoMatch(api.noTwoCharactersOnAnExitPlatform());
	}

	@Test
	public void testIllegalSituation() {
		ResourceSet model = this.initResourceSet("TwoCharactersAtSameExit.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);
		assertAnyMatchExists(api.noTwoCharactersOnAnExitPlatform());
		assertMatchCount(2, api.noTwoCharactersOnAnExitPlatform());
		assertTrue(api.noTwoCharactersOnAnExitPlatform().findAnyMatch()
				.map(NoTwoCharactersOnAnExitPlatformMatch::getPlatform).map(ExitPlatform.class::isInstance).get());
	}
}
