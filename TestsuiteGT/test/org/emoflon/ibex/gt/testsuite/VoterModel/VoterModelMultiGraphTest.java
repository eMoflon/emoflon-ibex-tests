package org.emoflon.ibex.gt.testsuite.VoterModel;

import static org.junit.jupiter.api.Assertions.*

import java.util.function.Supplier;

import GroupVotersModel.Group;
import GroupVotersModel.Voter;
import org.junit.jupiter.api.Test;

import VoterModelGraphTransformation.api.VoterModelGraphTransformationAPI;

public class VoterModelMultiGraphTest extends VoterModelAbstractTest {
	
	@Test
	public void adoptRuleMGTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adoptRuleMGTest(api);
		api.terminate();
	}
	
	@Test
	public void adoptRulePGTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adoptRulePGTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRuleMGTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRuleMGTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRulePGTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRulePGTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRule1MGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");

		rewireRule1MGTerminationTest(api);	
		api.terminate();
	}
	
	@Test
	public void rewireRule2MGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");

		rewireRule2MGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRule1PGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");

		rewireRule1PGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireRule2PGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireRule2PGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void adopt1MGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adopt1MGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void adopt1PGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adopt1PGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void adopt2MGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adopt2MGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void adopt2PGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		adopt2PGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireAlternatingMGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");
		
		rewireAlternatingMGTerminationTest(api);
		api.terminate();
	}
	
	@Test
	public void rewireAlternatingPGTerminationTest() {
		VoterModelGraphTransformationAPI api = this.init("VoterModel1.xmi");

		rewireAlternatingPGTerminationTest(api);
		api.terminate();
	}
	
	public void adoptRuleMGTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
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
		
		automaticCheck(api);
	}
	
	public void adoptRulePGTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
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
		
		automaticCheck(api);
	}
	
	public void rewireRuleMGTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
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
		
		automaticCheck(api);
	}
	
	public void rewireRulePGTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
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
		
		automaticCheck(api);
	}
	
	public void rewireRule1MGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = Long.MAX_VALUE;
		while(api.rewireToSame1MG().isApplicable() && count > api.rewireToSame1MG().countMatches()) {
			count = api.rewireToSame1MG().countMatches();
			assertApplicable(api.rewireToSame1MG());
			automaticCheck(api);
		}
		
		assertNotApplicable(api.rewireToSame1MG());
	}
	
	public void rewireRule2MGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = Long.MAX_VALUE;
		while(api.rewireToSame2MG().isApplicable() && count > api.rewireToSame2MG().countMatches()) {
			count = api.rewireToSame2MG().countMatches();
			assertApplicable(api.rewireToSame2MG());
			automaticCheck(api);
		}
		
		assertNotApplicable(api.rewireToSame2MG());
	}
	
	public void rewireRule1PGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = Long.MAX_VALUE;
		while(api.rewireToSame1PG().isApplicable() && count > api.rewireToSame1PG().countMatches()) {
			count = api.rewireToSame1PG().countMatches();
			assertApplicable(api.rewireToSame1PG());
			automaticCheck(api);
		}
		
		assertNotApplicable(api.rewireToSame1PG());
	}
	
	public void rewireRule2PGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = Long.MAX_VALUE;
		while(api.rewireToSame2PG().isApplicable() && count > api.rewireToSame2PG().countMatches()) {
			count = api.rewireToSame2PG().countMatches();
			assertApplicable(api.rewireToSame2PG());
			automaticCheck(api);
		}
		
		assertNotApplicable(api.rewireToSame2PG());
	}
	
	public void adopt1MGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = -1;
		while(api.adopt1MG().isApplicable() && count < api.voteTrue().countMatches()) {
			count = api.voteTrue().countMatches();
			assertApplicable(api.adopt1MG());
			automaticCheck(api);
		}
		
		assertNotApplicable(api.adopt1MG());
		assertNotApplicable(api.adopt2MG());
	}
	
	public void adopt2MGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = -1;
		while(api.adopt2MG().isApplicable() && count < api.voteFalse().countMatches()) {
			count = api.voteFalse().countMatches();
			assertApplicable(api.adopt2MG());
			automaticCheck(api);
		}
		
		assertNotApplicable(api.adopt1MG());
		assertNotApplicable(api.adopt2MG());
	}
	
	public void adopt1PGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = -1;
		while(api.adopt1PG().isApplicable() && count < api.voteTrue().countMatches()) {
			count = api.voteTrue().countMatches();
			assertApplicable(api.adopt1PG());
			automaticCheck(api);
		}
		
		assertNotApplicable(api.adopt1PG());
		assertNotApplicable(api.adopt2PG());
	}
	
	public void adopt2PGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = -1;
		while(api.adopt2PG().isApplicable() && count < api.voteFalse().countMatches()) {
			count = api.voteFalse().countMatches();
			assertApplicable(api.adopt2PG());
			automaticCheck(api);
		}
		
		assertNotApplicable(api.adopt1PG());
		assertNotApplicable(api.adopt2PG());
	}
	
	
	
	public void rewireAlternatingMGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		
		long count = Long.MAX_VALUE;
		Supplier<Long> lastCounter = () -> api.rewireToSame1MG().countMatches();
		int iteration = 0;
		while((api.rewireToSame1MG().isApplicable() || api.rewireToSame2MG().isApplicable()) 
				&& count > lastCounter.get()) {		
			if(iteration % 2 == 0 && api.rewireToSame1MG().isApplicable()) {
				count = api.rewireToSame1MG().countMatches();
				lastCounter = () -> api.rewireToSame1MG().countMatches();
				assertApplicable(api.rewireToSame1MG());
			} else {
				count = api.rewireToSame2MG().countMatches();
				lastCounter = () -> api.rewireToSame2MG().countMatches();
				assertApplicable(api.rewireToSame2MG());
			}
			
			automaticCheck(api);
			iteration++;
		}
		
		assertNotApplicable(api.rewireToSame1MG());
		assertNotApplicable(api.rewireToSame2MG());
	}
	
	public void rewireAlternatingPGTerminationTest(final VoterModelGraphTransformationAPI api) {
		sanityCheck(api);
		long count = Long.MAX_VALUE;
		Supplier<Long> lastCounter = () -> api.rewireToSame1PG().countMatches();
		int iteration = 0;
		while((api.rewireToSame1PG().isApplicable() || api.rewireToSame2PG().isApplicable()) 
				&& count > lastCounter.get()) {		
			if(iteration % 2 == 0 && api.rewireToSame1PG().isApplicable()) {
				count = api.rewireToSame1PG().countMatches();
				lastCounter = () -> api.rewireToSame1PG().countMatches();
				assertApplicable(api.rewireToSame1PG());
			} else {
				count = api.rewireToSame2PG().countMatches();
				lastCounter = () -> api.rewireToSame2PG().countMatches();
				assertApplicable(api.rewireToSame2PG());
			}
			
			automaticCheck(api);
			iteration++;
		}
		
		assertNotApplicable(api.rewireToSame1PG());
		assertNotApplicable(api.rewireToSame2PG());
	}
	
	private void sanityCheck(final VoterModelGraphTransformationAPI api) {
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
		
		assertEquals(330, api.adopt1PG().countMatches());
		assertEquals(330, api.adopt2PG().countMatches());
		assertEquals(330, api.rewireToSame1PG().countMatches());
		assertEquals(330, api.rewireToSame2PG().countMatches());	
	}
	
	private void automaticCheck(final VoterModelGraphTransformationAPI api) {
		long numOfTrue = api.voteTrue().countMatches();
		long numOfFalse = api.voteFalse().countMatches();
		long numOfDisagreeInGroup = api.disagreeInGroup().countMatches();
		
		assertEquals(numOfTrue*numOfFalse, api.disagree().countMatches());
		assertEquals(numOfDisagreeInGroup*2, api.adoptPatternUnordered().countMatches());
		
		assertEquals(numOfDisagreeInGroup, api.adopt1MG().countMatches());
		assertEquals(numOfDisagreeInGroup, api.adopt2MG().countMatches());
		assertEquals(numOfDisagreeInGroup*(numOfTrue-1), api.rewireToSame1MG().countMatches());
		assertEquals(numOfDisagreeInGroup*(numOfFalse-1), api.rewireToSame2MG().countMatches());
		
		assertEquals(numOfDisagreeInGroup*(numOfTrue-1)*(numOfFalse-1), api.adopt1PG().countMatches());
		assertEquals(numOfDisagreeInGroup*(numOfTrue-1)*(numOfFalse-1), api.adopt2PG().countMatches());
		assertEquals(numOfDisagreeInGroup*(numOfTrue-1)*(numOfFalse-1), api.rewireToSame1PG().countMatches());
		assertEquals(numOfDisagreeInGroup*(numOfTrue-1)*(numOfFalse-1), api.rewireToSame2PG().countMatches());
	}
	
}
