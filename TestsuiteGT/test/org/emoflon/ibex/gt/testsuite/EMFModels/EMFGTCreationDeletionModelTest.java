package org.emoflon.ibex.gt.testsuite.EMFModels;

import org.eclipse.xtext.serializer.sequencer.EmitterNodeFinder;
import org.junit.Test;

import VillageGraphTransformation.api.VillageGraphTransformationAPI;

public class EMFGTCreationDeletionModelTest extends EMFGTModelTest{
	
	@Test
	public void testModelCreationAndDeletion() {
		VillageGraphTransformationAPI api = this.init("EmptyCity.xmi");
		
		//create a mall and shops
		api.createMall().apply();
		api.createShop().apply();
		api.createShop().apply();
		//both mall and shops now should reference the same shops
		api.openCityShopInMall().apply();
		api.openCityShopInMall().apply();


		assertMatchCount(2, api.countShopsInMall());
		//delete the shops in the city -> both mall and city shouldn't have any references to the shops
		api.deleteShop().apply();
		api.deleteShop().apply();
		assertMatchCount(0, api.countShopsInCity());
		assertMatchCount(0, api.countShopsInMall());
	}
	
	@Test
	public void RecursiveDeletionTest() {
		VillageGraphTransformationAPI api = this.init("BigCity.xmi");
		
		//model should have 4 products
		assertMatchCount(4, api.countProducts());
		//delete the shop where the products are located
		api.deleteShop().apply();
		//products contained by shop -> model should have no products left
		assertNoMatch(api.countProducts());
		//No references by the company anymore
		assertNoMatch(api.countProductsByCompany());
		
	}
}
