package org.emoflon.ibex.gt.testsuite.Economy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import economy.gt.api.GtGtAPI;


public class EconomyDisjunctAttributeTest extends EconomyAbstractTest{

	@Test
	public void testSimpleAttributeCondition() {
		GtGtAPI<?> api = this.init("SimpleMarket.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount((int) api.notDisjointFindBuyers().countMatches(), api.findBuyers());
		assertMatchCount((int) api.notDisjointBuyProduct().countMatches(), api.buyProduct());
		assertApplicableAndApply(api.buyProduct());
		api.buyProduct().applyAny();
		
		//test incremental
		assertMatchCount((int) api.notDisjointBuyProduct().countMatches(), api.buyProduct());
		assertApplicableAndApply(api.buyProduct());
		api.buyProduct().applyAny();
		assertMatchCount((int) api.notDisjointBuyProduct().countMatches(), api.buyProduct());
		assertApplicableAndApply(api.buyProduct());
		api.sellProduct().applyAny();
		assertMatchCount((int) api.notDisjointBuyProduct().countMatches(), api.buyProduct());
		assertApplicableAndApply(api.buyProduct());
		api.sellProduct().applyAny();
		
		api.terminate();
	}
	
	@Test
	public void testMultipleAttributeConditionBetweenTwoPatterns() {
		GtGtAPI<?> api = this.init("SimpleMarket.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount((int) api.notDisjointBuyProductAndService().countMatches(), api.buyProductAndService());
		assertMatchCount((int) api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy());
		assertApplicableAndApply(api.buyProduct());
		api.changeBudget(10.0);
		//test stream functions
		assertEquals(api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy().matchStream().count());
		assertEquals(api.notDisjointBuyProductAndService().countMatches(), api.buyProductAndService().matchStream().count());
		
		assertMatchCount((int) api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy());
		assertApplicableAndApply(api.buyProduct());
		api.changeBudget(20.0);
		assertMatchCount((int) api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy());
		assertMatchCount((int) api.notDisjointBuyProductAndService().countMatches(), api.buyProductAndService());
		//test stream functions
		assertEquals(api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy().matchStream().count());
		assertEquals(api.notDisjointBuyProductAndService().countMatches(), api.buyProductAndService().matchStream().count());
		api.changePrice(20);
		api.changeBudget(20.0);
		api.changeBudget(20.0);
		api.changePrice(20);
		api.changeBudget(100.0);
		api.changeBudget(200.0);
		api.changePrice(20);
		assertMatchCount((int) api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy());
		assertMatchCount((int) api.notDisjointBuyProductAndService().countMatches(), api.buyProductAndService());
		api.buySpecificProduct(10, 20);
		assertMatchCount((int) api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy());
		assertMatchCount((int) api.notDisjointBuyProductAndService().countMatches(), api.buyProductAndService());		
		assertApplicableAndApply(api.sellProduct());
		api.sellSpecificProduct(10, 10);
		assertMatchCount((int) api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy());
		assertMatchCount((int) api.notDisjointBuyProductAndService().countMatches(), api.buyProductAndService());
		
		//test stream functions
		assertEquals(api.notDisjointHasMoneyToBuy().countMatches(), api.hasMoneyToBuy().matchStream().count());
		assertEquals(api.notDisjointBuyProductAndService().countMatches(), api.buyProductAndService().matchStream().count());
		
		api.terminate();
	}
	
	@Test
	public void testMultipleAttributeConditions() {
		GtGtAPI<?> api = this.init("SimpleMarket.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct().countMatches(), api.buyServiceDependentOfProduct());
		//here are cyclic dependencies between source and target pattern
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct2().countMatches(), api.buyServiceDependentOfProduct2());
		
		assertEquals((int) api.notDisjointbuyServiceDependentOfProduct().countMatches(), api.buyServiceDependentOfProduct().matchStream().count());
		assertEquals((int) api.notDisjointbuyServiceDependentOfProduct2().countMatches(), api.buyServiceDependentOfProduct2().matchStream().count());	
		
		api.changeBudget(5.0);
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct().countMatches(), api.buyServiceDependentOfProduct());
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct2().countMatches(), api.buyServiceDependentOfProduct2());
		
		api.changePrice(5.0);
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct().countMatches(), api.buyServiceDependentOfProduct());
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct2().countMatches(), api.buyServiceDependentOfProduct2());
		
		api.changeServicePrice(5.0);
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct().countMatches(), api.buyServiceDependentOfProduct());
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct2().countMatches(), api.buyServiceDependentOfProduct2());		
		
		api.changeServicePrice(100.0);
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct().countMatches(), api.buyServiceDependentOfProduct());
		assertMatchCount((int) api.notDisjointbuyServiceDependentOfProduct2().countMatches(), api.buyServiceDependentOfProduct2());		
		assertEquals((int) api.notDisjointbuyServiceDependentOfProduct().countMatches(), api.buyServiceDependentOfProduct().matchStream().count());
		assertEquals((int) api.notDisjointbuyServiceDependentOfProduct2().countMatches(), api.buyServiceDependentOfProduct2().matchStream().count());
		
		api.terminate();
	}
	
	@Test 
	public void testInjectivityConstraints(){
		GtGtAPI<?> api = this.init("SimpleMarket.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//test two injectivity constraints
		assertMatchCount((int) api.notDisjointFindCheaperProduct().countMatches(), api.findCheaperProduct());
		//test three injectivity constraints
		assertMatchCount((int) api.notDisjointFindCheaperProduct2().countMatches(), api.findCheaperProduct2());
		
		//change the price
		api.changePrice(5.0);
		assertMatchCount((int) api.notDisjointFindCheaperProduct().countMatches(), api.findCheaperProduct());
		assertMatchCount((int) api.notDisjointFindCheaperProduct2().countMatches(), api.findCheaperProduct2());
		
		api.changePrice(200.0);
		assertMatchCount((int) api.notDisjointFindCheaperProduct().countMatches(), api.findCheaperProduct());
		assertMatchCount((int) api.notDisjointFindCheaperProduct2().countMatches(), api.findCheaperProduct2());
		
		//test injectivity incremental
		api.addProduct(10.0);
		assertMatchCount((int) api.notDisjointFindCheaperProduct().countMatches(), api.findCheaperProduct());
		assertMatchCount((int) api.notDisjointFindCheaperProduct2().countMatches(), api.findCheaperProduct2());
		
		api.removeProduct(10.0);
		assertMatchCount((int) api.notDisjointFindCheaperProduct().countMatches(), api.findCheaperProduct());
		assertMatchCount((int) api.notDisjointFindCheaperProduct2().countMatches(), api.findCheaperProduct2());
		
		assertEquals((int) api.notDisjointFindCheaperProduct().countMatches(), api.findCheaperProduct().matchStream().count());
		assertEquals((int) api.notDisjointFindCheaperProduct2().countMatches(), api.findCheaperProduct2().matchStream().count());
	}
	
	@Test 
	public void testInjectivityConstraints2() {
		GtGtAPI<?> api = this.init("SimpleMarket.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount((int) api.notDisjointchangeProductValue(100.0).countMatches(), api.changeProductValue(100.0));
		assertMatchCount((int) api.notDisjointFindCheaperProduct().countMatches(), api.findCheaperProduct());
		assertMatchCount((int) api.notDisjointFindCheaperProduct2().countMatches(), api.findCheaperProduct2());
		api.changeProductValue(100.0).applyAny();
		assertMatchCount((int) api.notDisjointchangeProductValue(50.0).countMatches(), api.changeProductValue(50.0));
		assertMatchCount((int) api.notDisjointFindCheaperProduct().countMatches(), api.findCheaperProduct());
		assertMatchCount((int) api.notDisjointFindCheaperProduct2().countMatches(), api.findCheaperProduct2());
		api.changeProductValue(50.0).applyAny();
		
		api.terminate();
	}
}
