package org.emoflon.ibex.gt.testsuite.VoterModel;

import static org.junit.Assert.assertEquals;

import GroupVotersModel.Group;
import GroupVotersModel.Voter;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.Test;

import VoterModelGraphTransformation.api.VoterModelGraphTransformationAPI;

public class VoterModelMultiGraphTest extends VoterModelAbstractTest {
	
	@Test
	public void adoptRuleMGTestHiPE() {
		this.setPatternMatcher(GTAppTestCase.PM_HIPE);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adoptRuleMGTest(api);
		api.terminate();
	}
	
	@Test
	public void adoptRuleMGTestDemocles() {
		this.setPatternMatcher(GTAppTestCase.PM_DEMOCLES);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adoptRuleMGTest(api);
		api.terminate();
	}
	
	@Test
	public void adoptRulePGTestHiPE() {
		this.setPatternMatcher(GTAppTestCase.PM_HIPE);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adoptRulePGTest(api);
		api.terminate();
	}
	
	@Test
	public void adoptRulePGTestDemocles() {
		this.setPatternMatcher(GTAppTestCase.PM_DEMOCLES);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adoptRulePGTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRuleMGTestHiPE() {
		this.setPatternMatcher(GTAppTestCase.PM_HIPE);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRuleMGTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRuleMGTestDemocles() {
		this.setPatternMatcher(GTAppTestCase.PM_DEMOCLES);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRuleMGTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRulePGTestHiPE() {
		this.setPatternMatcher(GTAppTestCase.PM_HIPE);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRulePGTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRulePGTestDemocles() {
		this.setPatternMatcher(GTAppTestCase.PM_DEMOCLES);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRulePGTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRuleMGTerminationTestHiPE() {
		this.setPatternMatcher(GTAppTestCase.PM_HIPE);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRuleMGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRuleMGTerminationTestDemocles() {
		this.setPatternMatcher(GTAppTestCase.PM_DEMOCLES);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRuleMGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRulePGTerminationTestHiPE() {
		this.setPatternMatcher(GTAppTestCase.PM_HIPE);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRulePGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRulePGTerminationTestDemocles() {
		this.setPatternMatcher(GTAppTestCase.PM_DEMOCLES);
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRulePGTerminationTest(api);
		api.terminate();
	}
	
	public void adoptRuleMGTest(final VoterModelGraphTransformationAPI api) {
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
		
		// false voter adopts a true opinion
		assertEquals(1, api.voterWithID(0, 1).countMatches());
		Voter v0_true = api.voterWithID(0, 1).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(8, 0).countMatches());
		Voter v8_false = api.voterWithID(8, 0).findAnyMatch().get().getV();
		assertEquals(1, api.groupWithID(7).countMatches());
		Group g7 = api.groupWithID(7).findAnyMatch().get().getG();
		api.adopt1MG().bindV1(v0_true);
		api.adopt1MG().bindV2(v8_false);
		api.adopt1MG().bindG(g7);
		assertApplicable(api.adopt1MG());
		api.adopt1MG().unbindV1();
		api.adopt1MG().unbindV2();
		api.adopt1MG().unbindG();
		
		assertEquals(5, api.voteTrue().countMatches());
		assertEquals(5, api.voteFalse().countMatches());
		assertEquals(9, api.agreeFalse().countMatches());
		assertEquals(10, api.agreeTrue().countMatches());
		assertEquals(23, api.disagreeInGroup().countMatches());
		assertEquals(25, api.disagree().countMatches());
		assertEquals(0, api.trueNotInGroup().countMatches());
		assertEquals(0, api.falseNotInGroup().countMatches());
		assertEquals(46, api.adoptPatternUnordered().countMatches());
		assertEquals(23, api.adopt1MG().countMatches());
		assertEquals(23, api.adopt2MG().countMatches());
		assertEquals(92, api.rewireToSame1MG().countMatches());
		assertEquals(92, api.rewireToSame2MG().countMatches());
	}
	
	public void adoptRulePGTest(final VoterModelGraphTransformationAPI api) {
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
		assertEquals(330, api.adopt1PG().countMatches());
		assertEquals(330, api.adopt2PG().countMatches());
		assertEquals(330, api.rewireToSame1PG().countMatches());
		assertEquals(330, api.rewireToSame2PG().countMatches());
		
		// false voter adopts a true opinion
		assertEquals(1, api.voterWithID(0, 1).countMatches());
		Voter v0_true = api.voterWithID(0, 1).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(8, 0).countMatches());
		Voter v8_false = api.voterWithID(8, 0).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(3, 1).countMatches());
		Voter v3_true = api.voterWithID(3, 1).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(6, 0).countMatches());
		Voter v6_false = api.voterWithID(6, 0).findAnyMatch().get().getV();
		assertEquals(1, api.groupWithID(7).countMatches());
		Group g7 = api.groupWithID(7).findAnyMatch().get().getG();
		api.adopt1PG().bindV1(v0_true);
		api.adopt1PG().bindV2(v8_false);
		api.adopt1PG().bindV3(v3_true);
		api.adopt1PG().bindV4(v6_false);
		api.adopt1PG().bindG(g7);
		assertApplicable(api.adopt1PG());
		api.adopt1PG().unbindV1();
		api.adopt1PG().unbindV2();
		api.adopt1PG().unbindV3();
		api.adopt1PG().unbindV4();
		api.adopt1PG().unbindG();
		
		assertEquals(5, api.voteTrue().countMatches());
		assertEquals(5, api.voteFalse().countMatches());
		assertEquals(9, api.agreeFalse().countMatches());
		assertEquals(10, api.agreeTrue().countMatches());
		assertEquals(23, api.disagreeInGroup().countMatches());
		assertEquals(25, api.disagree().countMatches());
		assertEquals(0, api.trueNotInGroup().countMatches());
		assertEquals(0, api.falseNotInGroup().countMatches());
		assertEquals(46, api.adoptPatternUnordered().countMatches());
		assertEquals(368, api.adopt1PG().countMatches());
		assertEquals(368, api.adopt2PG().countMatches());
		assertEquals(368, api.rewireToSame1PG().countMatches());
		assertEquals(368, api.rewireToSame2PG().countMatches());
	}
	
	public void rewireRuleMGTest(final VoterModelGraphTransformationAPI api) {
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
		
		// true voter gets rewired to another true voter -> this should decrease the number rewrite matches
		assertEquals(1, api.voterWithID(0, 1).countMatches());
		Voter v0_true = api.voterWithID(0, 1).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(8, 0).countMatches());
		Voter v8_false = api.voterWithID(8, 0).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(3, 1).countMatches());
		Voter v3_true = api.voterWithID(3, 1).findAnyMatch().get().getV();
		assertEquals(1, api.groupWithID(7).countMatches());
		Group g7 = api.groupWithID(7).findAnyMatch().get().getG();
		api.rewireToSame1MG().bindV1(v0_true);
		api.rewireToSame1MG().bindV2(v8_false);
		api.rewireToSame1MG().bindV3(v3_true);
		api.rewireToSame1MG().bindG1(g7);
		assertApplicable(api.rewireToSame1MG());
		api.rewireToSame1MG().unbindV1();
		api.rewireToSame1MG().unbindV2();
		api.rewireToSame1MG().unbindV3();
		api.rewireToSame1MG().unbindG1();
		
		assertEquals(4, api.voteTrue().countMatches());
		assertEquals(6, api.voteFalse().countMatches());
		assertEquals(14, api.agreeFalse().countMatches());
		assertEquals(7, api.agreeTrue().countMatches());
		assertEquals(21, api.disagreeInGroup().countMatches());
		assertEquals(24, api.disagree().countMatches());
		assertEquals(0, api.trueNotInGroup().countMatches());
		assertEquals(0, api.falseNotInGroup().countMatches());
		assertEquals(42, api.adoptPatternUnordered().countMatches());
		assertEquals(21, api.adopt1MG().countMatches());
		assertEquals(21, api.adopt2MG().countMatches());
		assertEquals(63, api.rewireToSame1MG().countMatches());
		assertEquals(105, api.rewireToSame2MG().countMatches());
	}
	
	public void rewireRulePGTest(final VoterModelGraphTransformationAPI api) {
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
		assertEquals(330, api.adopt1PG().countMatches());
		assertEquals(330, api.adopt2PG().countMatches());
		assertEquals(330, api.rewireToSame1PG().countMatches());
		assertEquals(330, api.rewireToSame2PG().countMatches());
		
		// true voter gets rewired to another true voter -> this should decrease the number rewrite matches
		assertEquals(1, api.voterWithID(0, 1).countMatches());
		Voter v0_true = api.voterWithID(0, 1).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(8, 0).countMatches());
		Voter v8_false = api.voterWithID(8, 0).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(3, 1).countMatches());
		Voter v3_true = api.voterWithID(3, 1).findAnyMatch().get().getV();
		assertEquals(1, api.voterWithID(6, 0).countMatches());
		Voter v6_false = api.voterWithID(6, 0).findAnyMatch().get().getV();
		assertEquals(1, api.groupWithID(7).countMatches());
		Group g7 = api.groupWithID(7).findAnyMatch().get().getG();
		api.rewireToSame1PG().bindV1(v0_true);
		api.rewireToSame1PG().bindV2(v8_false);
		api.rewireToSame1PG().bindV3(v3_true);
		api.rewireToSame1PG().bindV4(v6_false);
		api.rewireToSame1PG().bindG1(g7);
		assertApplicable(api.rewireToSame1PG());
		api.rewireToSame1PG().unbindV1();
		api.rewireToSame1PG().unbindV2();
		api.rewireToSame1PG().unbindV3();
		api.rewireToSame1PG().unbindV4();
		api.rewireToSame1PG().unbindG1();
		
		assertEquals(4, api.voteTrue().countMatches());
		assertEquals(6, api.voteFalse().countMatches());
		assertEquals(14, api.agreeFalse().countMatches());
		assertEquals(7, api.agreeTrue().countMatches());
		assertEquals(21, api.disagreeInGroup().countMatches());
		assertEquals(24, api.disagree().countMatches());
		assertEquals(0, api.trueNotInGroup().countMatches());
		assertEquals(0, api.falseNotInGroup().countMatches());
		assertEquals(42, api.adoptPatternUnordered().countMatches());
		assertEquals(315, api.adopt1PG().countMatches());
		assertEquals(315, api.adopt2PG().countMatches());
		assertEquals(315, api.rewireToSame1PG().countMatches());
		assertEquals(315, api.rewireToSame2PG().countMatches());
	}
	
	public void rewireRuleMGTerminationTest(final VoterModelGraphTransformationAPI api) {
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
		
		long count = Long.MAX_VALUE;
		while(api.rewireToSame1MG().isApplicable() && count > api.rewireToSame1MG().countMatches()) {
			count = api.rewireToSame1MG().countMatches();
			assertApplicable(api.rewireToSame1MG());
		}
		
		assertNotApplicable(api.rewireToSame1MG());
	}
	
	public void rewireRulePGTerminationTest(final VoterModelGraphTransformationAPI api) {
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
		assertEquals(330, api.adopt1PG().countMatches());
		assertEquals(330, api.adopt2PG().countMatches());
		assertEquals(330, api.rewireToSame1PG().countMatches());
		assertEquals(330, api.rewireToSame2PG().countMatches());
		
		long count = Long.MAX_VALUE;
		while(api.rewireToSame1MG().isApplicable() && count > api.rewireToSame1PG().countMatches()) {
			count = api.rewireToSame1PG().countMatches();
			assertApplicable(api.rewireToSame1PG());
		}
		
		assertNotApplicable(api.rewireToSame1PG());
	}
	
}
