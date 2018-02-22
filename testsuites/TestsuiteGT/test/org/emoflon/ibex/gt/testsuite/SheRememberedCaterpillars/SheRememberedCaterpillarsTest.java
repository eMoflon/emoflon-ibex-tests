package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IPatternInterpreter;
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
	protected SheRememberedCaterpillarsGraphTransformationAPI getAPI(final IPatternInterpreter engine,
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
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI("SheRememberedCaterpillars",
				"SheRememberedCaterpillars.xmi");
		assertEquals(2, api.findCharacter().countMatches());
		assertTrue(api.findCharacterNotOnExit().findAnyMatch().isPresent());
		assertTrue(api.findCharacterOnExit().findAnyMatch().isPresent());
	}

	@Test
	public void testNoIllegalSituation() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI("SheRememberedCaterpillars",
				"SheRememberedCaterpillars.xmi");
		assertFalse(api.noTwoCharactersOnAnExitPlatform().findAnyMatch().isPresent());
	}

	@Test
	public void testIllegalSituation() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI("SheRememberedCaterpillars",
				"SheRememberedCaterpillarsIllegal.xmi");
		assertTrue(api.noTwoCharactersOnAnExitPlatform().findAnyMatch().isPresent());
		assertEquals(2, api.noTwoCharactersOnAnExitPlatform().countMatches());
		assertTrue(api.noTwoCharactersOnAnExitPlatform().findAnyMatch()
				.map(NoTwoCharactersOnAnExitPlatformMatch::getPlatform).map(ExitPlatform.class::isInstance).get());
	}
}
