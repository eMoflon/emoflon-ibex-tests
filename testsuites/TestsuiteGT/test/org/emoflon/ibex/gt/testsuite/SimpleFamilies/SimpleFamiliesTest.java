package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;
import org.junit.Test;

import SimpleFamilies.SimpleFamiliesPackage;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;

/**
 * JUnit tests for SimpleFamilies Graph Transformation API
 */
public class SimpleFamiliesTest extends GTTestCase<SimpleFamiliesGraphTransformationAPI> {
	@Override
	protected SimpleFamiliesGraphTransformationAPI getAPI(final IPatternInterpreter engine, final ResourceSet model) {
		return new SimpleFamiliesGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(SimpleFamiliesPackage.eNS_URI, SimpleFamiliesPackage.eINSTANCE);
		return map;
	}

	@Test
	public void test() {
		SimpleFamiliesGraphTransformationAPI api = this.initAPI("SimpleFamilies", "FamilyRegister.xmi");

		assertEquals(1, api.findRegister().countMatches());
		assertTrue(api.findRegister().findAnyMatch().isPresent());

		assertEquals(2, api.findFamily().countMatches());
		List<String> familyNames = api.findFamily().findMatches().stream().map(m -> m.getFamily().getName())
				.collect(Collectors.toList());
		assertEquals(Arrays.asList("Simpson", "Watson"), familyNames);

		assertEquals(2, api.findFather().countMatches());
		assertEquals(2, api.findMother().countMatches());
		assertEquals(2, api.findDaughter().countMatches());
		assertEquals(1, api.findSon().countMatches());
	}
}
