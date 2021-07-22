package org.emoflon.ibex.gt.testsuite.EMFModels;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.moflon.smartemf.runtime.SmartObject;

import Village.City;
import Village.Company;
import Village.Mall;
import Village.Road;
import Village.Shop;
import Village.VillageFactory;

public class EMFCollectionsTest extends AbstractEMFTest{
	
	private static String path =  "./resources/EMFModel/EmptyCity.xmi";
	
	@Test
	public void testCollections() {
		//test if the underlying collections (based on unique, ordered) are working properly
		
		VillageFactory factory = VillageFactory.eINSTANCE;
		
		City city = factory.createCity();
		Mall mall = factory.createMall();
		city.getMalls().add(mall);
		//create shops
		List<Shop> shops = new ArrayList<Shop>();
		Shop shop1 = factory.createShop();
		Shop shop2 = factory.createShop();
		shops.add(shop1);
		shops.add(shop1);
		shops.add(shop2);
		city.getShops().addAll(shops);
		mall.getShops().addAll(shops);
		//city shops are unique and ordered
		assertEquals(2, city.getShops().size());
		//check if all are ordered		
		Iterator<Shop> iterator = city.getShops().iterator();
		assertEquals(shop1, iterator.next());
		assertEquals(shop2, iterator.next());
		if(mall instanceof SmartObject) {
			//mall shops are not unique and not ordered
			assertEquals(3, mall.getShops().size());			
		} else {
			//else normal EMF handling
			assertEquals(2, mall.getShops().size());				
		}

		
		//company shops are ordered but not unique
		Company company = factory.createCompany();
		company.getShops().addAll(shops);
		if(company instanceof SmartObject) {
			assertEquals(3, company.getShops().size());			
		}else {
			//else normal EMF handling
			assertEquals(2, company.getShops().size());				
		}

		Iterator<Shop> shopIterator = company.getShops().iterator();
		assertEquals(shop1, shopIterator.next());
		if(company instanceof SmartObject) {
			//if smartObject -> shop1 is two times in the list
			assertEquals(shop1, shopIterator.next());		
		}
		assertEquals(shop2, shopIterator.next());
		city.getCompanies().add(company);
		company.getShops().addAll(shops);
		
		Road road1 = factory.createRoad();
		Road road2 = factory.createRoad();
		List<Road> roads = new ArrayList<Road>();
		roads.add(road1);
		roads.add(road2);
		roads.add(road2);
		roads.add(road2);
		//roads are unique but not ordered
		city.getRoads().addAll(roads);	
		assertEquals(2, city.getRoads().size());
	}
}
