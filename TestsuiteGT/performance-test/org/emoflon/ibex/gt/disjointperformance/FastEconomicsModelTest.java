package org.emoflon.ibex.gt.disjointperformance;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.commons.math3.distribution.BetaDistribution;
import org.eclipse.emf.common.util.URI;
import FastEconomy.api.FastEconomyAPI;
import FastEconomy.api.FastEconomyApp;
import FastEconomy.api.FastEconomyHiPEApp;
import FastEconomy.api.matches.CleanCurrentStateMatch;
import FastEconomy.api.matches.GetMachinesMatch;
import FastEconomy.api.matches.ProduceMatch;
import FastEconomy.api.matches.RemoveOldMachinesMatch;
import FastEconomy.api.matches.UpdateConsumerFirm2Match;
import FastEconomy.api.matches.UpdateConsumerFirm3Match;
import FastEconomy.api.matches.UpdateConsumerFirmMatch;
import FastEconomy.api.matches.UpdateFirmsMatch;
import FastEconomy.api.rules.BuyMachinesRule;
import FastEconomy.api.rules.BuyProductsRule;
import FastEconomy.api.rules.CalculateIndustryWorkersRule;
import FastEconomy.api.rules.CleanCurrentStateRule;
import FastEconomy.api.rules.FindEmploymentRule;
import FastEconomy.api.rules.GetMachinesRule;
import FastEconomy.api.rules.GiveUnemploymentBenefitsRule;
import FastEconomy.api.rules.ProduceRule;
import FastEconomy.api.rules.RemoveOldMachinesRule;
import FastEconomy.api.rules.UpdateConsumerFirm2Rule;
import FastEconomy.api.rules.UpdateConsumerFirm3Rule;
import FastEconomy.api.rules.UpdateConsumerFirmRule;
import FastEconomy.api.rules.UpdateFirmsRule;


public class FastEconomicsModelTest extends org.emoflon.ibex.gt.performance.GTPerformanceTest {
	
	private static int industryFirmNumber = 50;
	private static int consumerFirmNumber = 200;
	private static int workersNumber = 400;
	private static double v = 0.04;
	private static double wage = 1;
	private static double markup = 0.04;
	private static double payback = 3;
	private static double epsilon = 0.5;
	private static int iterations = 100;
	private static double x1 = -0.15;
	private static double x2 = 0.15;
	
	@Override
	protected String getTestName() {
		return "FastEconomicsTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("simulationTime", "memoryUsage", "bipGrowth");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			FastEconomyApp app = new FastEconomyHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			FastEconomyAPI api = app.initAPI();
			//create model
			api.createMarket(v, wage, markup, payback).apply();
			api.createGoverment().apply();
			
			for(int i = 0; i < modelSize*industryFirmNumber; i++) {
				api.createIndustryFirm(epsilon, i).apply();
			}
			for(int i = 0; i < modelSize*consumerFirmNumber; i++) {
				api.createConsumerFirm(i).apply();
			}
			for(int i= 0; i < modelSize*workersNumber; i++) {
				api.createWorker().apply();
			}
			save(app);
		}
	}

	private URI createURI(final int modelSize) {
		return URI.createFileURI(String.format("%s/model-%s.xmi", RESULT_DIRECTORY + getTestName(), modelSize));
	}

	@Override
	public void run(int modelSize) {
		FastEconomyApp app = new FastEconomyHiPEApp(WORKSPACE_PATH);
//					FastEconomyApp app = new FastEconomyDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		FastEconomyAPI api = app.initAPI();
		
		double begin = 0;
		double end = 0;
		// Execute apply
		long countSimulatinoStart = System.currentTimeMillis();
		api.updateMatches();
		for(int i = 0; i<iterations; i++) {
			if(i == 0) {
				begin = simulate(api, modelSize);					
			}
			else if(i == iterations-1) {
				end = simulate(api, modelSize);				
			}
			else {
				simulate(api, modelSize);	
			}
		
		}	
		long countSimulationEnd = System.currentTimeMillis();
		
		long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long applyDuration = timeDifference(countSimulatinoStart, countSimulationEnd);
		long bip = (long) (end - begin);
		
		addResult(modelSize, applyDuration, memoryUsage/1000000, bip);
		
		System.gc();		
	}
	
	private double simulate(FastEconomyAPI api, int modelSize) {
		double bip = 0;
		//update wages
		UpdateFirmsRule updateRule = api.updateFirms();
		for(UpdateFirmsMatch m: updateRule.matchStream().collect(Collectors.toList())) {
			updateRule.apply(m);
		}
		api.updateGoverment().apply();
		
		//update industry firms
		BetaDistribution betaRnd = new BetaDistribution(3, 3);
		Random rnd = new Random();
		for(int i = 0; i < modelSize*industryFirmNumber; i++) {
			double calculatedX1 = (x1 + (1+x2)*rnd.nextDouble())*betaRnd.sample();
			double calculatedX2 = (x1 + (1+x2)*rnd.nextDouble())*betaRnd.sample();
			api.updateMachineFirm(calculatedX1, calculatedX2, i).apply();			
		}
		for(int i = 0; i < modelSize*industryFirmNumber; i++) {
			api.imitate(i).applyStochastic();
			api.innovate(i).applyStochastic();
		}
		
		//update consumer firms
		UpdateConsumerFirmRule updateRule1 = api.updateConsumerFirm();
		UpdateConsumerFirm2Rule updateRule2 = api.updateConsumerFirm2();
		UpdateConsumerFirm3Rule updateRule3 = api.updateConsumerFirm3();
		
		for(UpdateConsumerFirmMatch m: updateRule1.matchStream().collect(Collectors.toList())) {
			updateRule1.apply(m);
		}
		for(UpdateConsumerFirm2Match m: updateRule2.matchStream().collect(Collectors.toList())) {
			updateRule2.apply(m);
		}
		for(UpdateConsumerFirm3Match m: updateRule3.matchStream().collect(Collectors.toList())) {
			updateRule3.apply(m);
		}
		
		//remove the old machines 
		RemoveOldMachinesRule removeRule = api.removeOldMachines();
		for(RemoveOldMachinesMatch m: removeRule.matchStream().collect(Collectors.toList())) {
			removeRule.apply(m);
		}
		bip += api.findAllConsumerFirms().matchStream().mapToDouble(m -> m.getF().getInvestmentBudget()).sum();
		//buy new machines
		BuyMachinesRule buyRule = api.buyMachines();
		while(buyRule.isApplicable()) {
			buyRule.apply();
		}
		//calculate the needed workers
		for(int i = 0; i < modelSize*consumerFirmNumber; i++) {
			api.calculateConsumptionWorkers(i).apply();
		}
		CalculateIndustryWorkersRule workerRule = api.calculateIndustryWorkers();
		workerRule.forEachMatch(m -> workerRule.apply(m));
		
		//search employment
		FindEmploymentRule employmentRule = api.findEmployment();
		while(employmentRule.isApplicable()) {
			employmentRule.apply();
		}
		GiveUnemploymentBenefitsRule unemploymentRule = api.giveUnemploymentBenefits();
		unemploymentRule.forEachMatch(m -> unemploymentRule.apply(m));
		
		bip += api.findAllWorkers().matchStream().mapToDouble(m -> m.getW().getBudget()).sum();
		
		//produce consumer goods 
		ProduceRule produceRule = api.produce();
		for(ProduceMatch m: produceRule.matchStream().collect(Collectors.toList())) {
		produceRule.apply(m);
		}
		produceRule.forEachMatch(m -> produceRule.apply(m));
		
		//buy products
		BuyProductsRule buyGoodsRule = api.buyProducts();
		while(buyGoodsRule.isApplicable()) {
			buyGoodsRule.apply();
		}
		//receive products
		GetMachinesRule getMachineRule = api.getMachines();
		for(GetMachinesMatch m: getMachineRule.matchStream().collect(Collectors.toList())) {
			getMachineRule.apply(m);
		}
		api.updateWages().apply();
		
		CleanCurrentStateRule cleanStateRule = api.cleanCurrentState();
		for(CleanCurrentStateMatch m: cleanStateRule.matchStream().collect(Collectors.toList())) {
			cleanStateRule.apply(m);
		}
		return bip;
	}
}
