package org.emoflon.ibex.gt.testsuite.EMFModels;

import static org.junit.Assert.assertNotEquals;

import org.eclipse.xtext.serializer.sequencer.EmitterNodeFinder;
import org.junit.Test;

import Village.City;
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
	@Test
	public void ModelModificationTest() {
		VillageGraphTransformationAPI api = this.init("BigCity.xmi");
		
		City city1 = (City) api.countShopsInCity().findAnyMatch().get().getCity();		
		//create a second city
		api.createCity().apply();
		//change containment
		api.changeShopLocation().apply();
		assertNotEquals(city1, api.countShopsInCity().findAnyMatch().get().getCity());
	}
}
