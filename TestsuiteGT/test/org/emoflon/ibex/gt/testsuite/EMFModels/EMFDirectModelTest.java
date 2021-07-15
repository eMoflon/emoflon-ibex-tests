package org.emoflon.ibex.gt.testsuite.EMFModels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.moflon.smartemf.runtime.SmartObject;

import Persons.Person;
import Persons.PersonRegister;
import Persons.PersonsFactory;
import Village.City;
import Village.Company;
import Village.Mall;
import Village.Product;
import Village.Road;
import Village.Shop;
import Village.VillageFactory;

import org.emoflon.ibex.common.emf.EMFManipulationUtils;


public class EMFDirectModelTest {

	private static String path =  "./resources/EMFModel/EmptyCity.xmi";
	@Test
	public void testCityCreation() {
		//simple creation and removal of nodes and unidirectional and bidirectional edges
		VillageFactory factory = VillageFactory.eINSTANCE;
		
		//create a small city model

		City city = factory.createCity();
		Mall mall = factory.createMall();
		city.getMalls().add(mall);
		assertEquals(1, city.getMalls().size());
		assertNotNull(mall.getVillage());
		//create shops
		List<Shop> shops = new ArrayList<Shop>();
		Shop shop1 = factory.createShop();
		Shop shop2 = factory.createShop();
		shops.add(shop1);
		shops.add(shop1);
		shops.add(shop2);
		city.getShops().addAll(shops);
		mall.getShops().addAll(shops);
		//delete all shops
		for(Shop shop: shops) {
			EMFManipulationUtils.delete(shop, true); 
		}
		//shops should have no container
		assertNull(shop1.eContainer());
		assertNull(shop2.eContainer());
		//shops were removed from containment -> should be removed from the whole model
		assertEquals(0, city.getShops().size());
		//non containment, unidirectional references should also be deleted
		assertEquals(0, mall.getShops().size());
		//shops belong to no city
		assertNull(shop1.getCity());
		assertNull(shop2.getCity());
	
	}
	
	@Test
	public void testRecursiveChanges() {
		//test if the nodes are removed recursively if the container is deleted
	
		VillageFactory factory = VillageFactory.eINSTANCE;


		City city = factory.createCity();

		Shop shop = factory.createShop();

		city.getShops().add(shop);
		Company company = factory.createCompany();
		city.getCompanies().add(company);
		company.getShops().add(shop);
		//create products
		List<Product> products = new ArrayList<Product>();
		Product product1 = factory.createProduct();
		Product product2 = factory.createProduct();	
		Product product3 = factory.createProduct();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		shop.getGoods().addAll(products);
		company.getGoods().addAll(products);
		
		assertEquals(1, city.getShops().size());
		assertEquals(3, shop.getGoods().size());
		assertEquals(3, company.getGoods().size());
		//eOpposite should work
		assertEquals(company, product1.getProducedBy());
		assertEquals(company, product2.getProducedBy());
		assertEquals(company, product3.getProducedBy());
		
		//remove the shop -> the products should be removed too since they are contained within the shop instance
		EMFManipulationUtils.delete(shop, true); 
		
		assertEquals(0, city.getShops().size());
		//shop is not contained anywhere
		assertNull(shop.eContainer());
		assertEquals(0, company.getShops().size());		
		assertEquals(0, company.getGoods().size());
		//goods have no eOpposite anymore
		assertNull(product1.getProducedBy());
		assertNull(product2.getProducedBy());
		assertNull(product3.getProducedBy());
	}
	
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
		//mall shops are not unique and not ordered
		assertEquals(3, mall.getShops().size());
		//can we check if this is not ordered? (it could be ordered by luck)
		
		//company shops are ordered but not unique
		Company company = factory.createCompany();
		company.getShops().addAll(shops);
		assertEquals(3, company.getShops().size());
		Iterator<Shop> shopIterator = company.getShops().iterator();
		assertEquals(shop1, shopIterator.next());
		assertEquals(shop1, shopIterator.next());
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
		//again: can we check if it is not ordered?
	}
	
	@Test
	public void testModelChange() {
		//test that changing the model works
		VillageFactory factory = VillageFactory.eINSTANCE;

		City city1 = factory.createCity();
		City city2 = factory.createCity();
		//create shops
		List<Shop> shops = new ArrayList<Shop>();
		Shop shop1 = factory.createShop();
		Shop shop2 = factory.createShop();
		Shop shop3 = factory.createShop();
		shops.add(shop1);
		shops.add(shop2);
		shops.add(shop3);
		city1.getShops().addAll(shops);
		assertEquals(3, city1.getShops().size());
		assertEquals(0, city2.getShops().size());
		//test eOpposite
		assertEquals(shop1.getCity(), city1);
		assertEquals(shop2.getCity(), city1);
		assertEquals(shop3.getCity(), city1);
		//change containment reference
		city2.getShops().add(shop1);
		assertEquals(1, city2.getShops().size());		
		assertEquals(2, city1.getShops().size());
		//eOpposite should have changed for shop1 but not for the others
		assertEquals(shop1.getCity(), city2);
		assertEquals(shop2.getCity(), city1);
		assertEquals(shop3.getCity(), city1);

	}	

}
