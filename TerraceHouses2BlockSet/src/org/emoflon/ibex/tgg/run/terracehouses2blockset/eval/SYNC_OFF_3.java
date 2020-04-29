package org.emoflon.ibex.tgg.run.terracehouses2blockset.eval;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.benchmark.FullBenchmarkLogger;
import org.emoflon.ibex.tgg.operational.repair.shortcut.rule.OperationalShortcutRule;
import org.emoflon.ibex.tgg.operational.repair.shortcut.updatepolicy.IShortcutRuleUpdatePolicy;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config._DefaultRegistrationHelper;

import TerraceHouses.Building;
import TerraceHouses.TerraceHousesFactory;
import WoodenBlockSet.BlockSet;

public class SYNC_OFF_3 extends SYNC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();
	
	private static TerraceHousesHelper helperH = new TerraceHousesHelper();
	private static WoodenBlockSetHelper helperB = new WoodenBlockSetHelper();
	
	private static final List<String> dontUse = Arrays.asList( //
			"FlatRoof2Construction->PitchedRoof2Construction_CHANGER", //
			"PitchedRoof2Construction->FlatRoof2Construction_CHANGER");
	
	private static IShortcutRuleUpdatePolicy updatepolicy = (shortcutRules, brokenMatch, target) -> {
		for (OperationalShortcutRule scr : shortcutRules) {
			if(!dontUse.contains(scr.getScRule().getName()))
				return scr;
		}
		return null;
	};

	public SYNC_OFF_3() throws IOException {
		super(registrationHelper.createIbexOptions() //
				.debug.ibexDebug(false) //
				.debug.benchmarkLogger(new FullBenchmarkLogger()) //
				.propagate.usePrecedenceGraph(true) //
				.repair.repairAttributes(false) //
				.repair.useShortcutRules(true) //
				.repair.relaxedSCPatternMatching(false) //
				.repair.advancedOverlapStrategies(false) //
				.repair.shortcutRuleUpdatePolicy(updatepolicy) //
				.resourceHandler(new TGGResourceHandler() {
					@Override
					public void loadModels() throws IOException {
						source = createResource(options.project.path() + "/instances/src.xmi");
						target = createResource(options.project.path() + "/instances/trg.xmi");
						corr = createResource(options.project.path() + "/instances/corr.xmi");
						protocol = createResource(options.project.path() + "/instances/protocol.xmi");
					}
				}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		System.out.println("OFF_ENDE");

		SYNC_OFF_3 sync = new SYNC_OFF_3();
		
		Building root = TerraceHousesFactory.eINSTANCE.createBuilding();
		sync.getResourceHandler().getSourceResource().getContents().add(root);
		sync.forward();
		
		helperH.generateHouseRow(root, 300);
		sync.forward();
		helperB.setColors((BlockSet) sync.getResourceHandler().getTargetResource().getContents().get(0));
		
		helperH.changeRoof(root, 300, false);
		sync.forward();

		sync.saveModels();
		sync.terminate();
		
		sync.getOptions().debug.benchmarkLogger().getRunLogs().forEach(log -> System.out.println(log.toString()));
	}

}
