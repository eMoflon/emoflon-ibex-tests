package org.emoflon.ibex.gt.testsuite.Persons;

import static org.junit.jupiter.api.Assertions.*;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.jupiter.api.Test;

import persons.gt.api.GtGtAPI;
import persons.gt.api.GtHiPEGtAPI;

/**
 * Tests for the SimplePersons Graph Transformation API.
 */
public class PersonsTest
		extends GTAppTestCase<GtGtAPI<?>> {

	@Override
	public String getTestName() {
		return "Persons";
	}

	@Override
	protected GtGtAPI<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtAPI<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtAPI();}
			case PM_VIATRA ->{throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
			case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
			default -> {yield new GtHiPEGtAPI();}
		};
	}

	@Test
	public void countPersons() {
		GtGtAPI<?> api = this.init("PersonRegister.xmi");

		assertMatchCount(5, api.findFemale());
		assertMatchCount(5, api.findMale());
		assertMatchCount(10, api.findPerson());
		assertMatchCount(1, api.findRegister());
		
		api.terminate();
	}

	@Test
	public void findFirstAndLastPersonInAlphabeticalOrder() {
		GtGtAPI<?> api = this.init("PersonRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(1, api.findFirstPerson());
		assertEquals("Adams, Adriana", api.findFirstPerson().findAnyMatch().get().person().getName());

		assertMatchCount(1, api.findLastPerson());
		assertEquals("Smith, Sarah", api.findLastPerson().findAnyMatch().get().person().getName());
		
		api.terminate();
	}
}
