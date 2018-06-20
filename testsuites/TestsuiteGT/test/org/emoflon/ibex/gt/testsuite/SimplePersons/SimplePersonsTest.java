package org.emoflon.ibex.gt.testsuite.SimplePersons;

import static org.junit.Assert.assertEquals;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.Test;

import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationAPI;
import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationApp;

/**
 * Tests for the SimplePersons Graph Transformation API.
 */
public class SimplePersonsTest
		extends GTAppTestCase<SimplePersonsGraphTransformationApp, SimplePersonsGraphTransformationAPI> {

	@Override
	public String getTestName() {
		return "SimplePersons";
	}

	@Override
	protected SimplePersonsGraphTransformationApp getApp() {
		return new SimplePersonsGraphTransformationApp(initEngine(), workspacePath);
	}

	@Test
	public void countPersons() {
		SimplePersonsGraphTransformationAPI api = this.init("PersonRegister.xmi");

		assertMatchCount(5, api.findFemale());
		assertMatchCount(5, api.findMale());
		assertMatchCount(10, api.findPerson());
		assertMatchCount(1, api.findRegister());
	}

	@Test
	public void findFirstAndLastPersonInAlphabeticalOrder() {
		SimplePersonsGraphTransformationAPI api = this.init("PersonRegister.xmi");

		assertMatchCount(1, api.findFirstPerson());
		assertEquals("Adams, Adriana", api.findFirstPerson().findAnyMatch().get().getPerson().getName());

		assertMatchCount(1, api.findLastPerson());
		assertEquals("Smith, Sarah", api.findLastPerson().findAnyMatch().get().getPerson().getName());
	}
}
