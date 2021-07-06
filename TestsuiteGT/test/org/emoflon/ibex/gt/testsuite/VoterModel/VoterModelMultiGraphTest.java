package org.emoflon.ibex.gt.testsuite.VoterModel;

import static org.junit.Assert.assertEquals;

import GroupVotersModel.Voter;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.Test;

import VoterModelGraphTransformation.api.VoterModelGraphTransformationAPI;

public class VoterModelMultiGraphTest extends VoterModelAbstractTest {
	
	@Test
	public void adoptRuleTestHiPE() {
		this.setPatternMatcher(GTAppTestCase.PM_HIPE);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adoptRuleTest(api);
		api.terminate();
	}
	
	@Test
	public void adoptRuleTestDemocles() {
		this.setPatternMatcher(GTAppTestCase.PM_DEMOCLES);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adoptRuleTest(api);
		api.terminate();
	}
	
	public void adoptRuleTest(final VoterModelGraphTransformationAPI api) {
		// Sanity Checks
		assertEquals(4, api.voteTrue().countMatches());
		assertEquals(6, api.voteFalse().countMatches());
		assertEquals(14, api.agreeFalse().countMatches());
		assertEquals(6, api.agreeTrue().countMatches());
		assertEquals(22, api.disagreeInGroup().countMatches());
		assertEquals(24, api.disagree().countMatches());
		assertEquals(0, api.trueNotInGroup().countMatches());
		assertEquals(0, api.falseNotInGroup().countMatches());
		assertEquals(44, api.adoptPatternUnordered().countMatches());
		assertEquals(22, api.adopt1MG().countMatches());
		assertEquals(22, api.adopt2MG().countMatches());
		assertEquals(66, api.rewireToSame1MG().countMatches());
		assertEquals(110, api.rewireToSame2MG().countMatches());
		
		// false voter adopts a true opinion -> this should decrease the number rewrite matches
		assertEquals(1, api.voterWithID(0, 1).countMatches());
		Voter v0_true = api.voterWithID(0, 1).findAnyMatch().get().getV();
		assertApplicable(api.adopt1MG().bindV1(v0_true));
		
		assertEquals(5, api.voteTrue().countMatches());
		assertEquals(5, api.voteFalse().countMatches());
		assertEquals(9, api.agreeFalse().countMatches());
		assertEquals(9, api.agreeTrue().countMatches());
		assertEquals(24, api.disagreeInGroup().countMatches());
		assertEquals(25, api.disagree().countMatches());
		assertEquals(0, api.trueNotInGroup().countMatches());
		assertEquals(0, api.falseNotInGroup().countMatches());
		assertEquals(48, api.adoptPatternUnordered().countMatches());
		assertEquals(4, api.adopt1MG().countMatches());
		assertEquals(24, api.adopt2MG().countMatches());
		assertEquals(96, api.rewireToSame1MG().countMatches());
		assertEquals(96, api.rewireToSame2MG().countMatches());
	}
	
}
