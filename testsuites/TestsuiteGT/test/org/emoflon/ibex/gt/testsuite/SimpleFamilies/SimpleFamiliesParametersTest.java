package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimpleFamiliesGraphTransformation.api.matches.DeleteFamilyMatch;
import SimpleFamiliesGraphTransformation.api.matches.FindFamilyMatch;

/**
 * Tests for applications of parameterized rules with the SimpleFamilies Graph
 * Transformation API.
 */
public class SimpleFamiliesParametersTest extends SimpleFamiliesAbstractTest {
	@Test
	public void deleteWatsonFamilyWithFamilyBinding() {
		ResourceSet model = this.initResourceSet("DeleteWatsonFamilyWithFamilyBinding.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		Family watsonFamily = api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName().equals("Watson")) //
				.map(m -> m.getFamily()) //
				.findAny().get();
		DeleteFamilyMatch m = assertApplicable(api.deleteFamily().bindFamily(watsonFamily).apply());
		assertMatchCount(1, api.findFamily());
		assertEquals("Watson", m.getFamily().getName());

		saveResourceSet(model);
	}

	@Test
	public void deleteWatsonFamilyWithMatchBinding() {
		ResourceSet model = this.initResourceSet("DeleteWatsonFamilyWithMatchBinding.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		FindFamilyMatch watsonMatch = api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName().equals("Watson")) //
				.findAny().get();
		DeleteFamilyMatch m = assertApplicable(api.deleteFamily().bind(watsonMatch.toIMatch()).apply());
		assertMatchCount(1, api.findFamily());
		assertEquals("Watson", m.getFamily().getName());

		saveResourceSet(model);
	}
}
