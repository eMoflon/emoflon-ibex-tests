package org.emoflon.ibex.gt.testsuite.EMFModels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.moflon.smartemf.persistence.SmartEMFResourceFactoryImpl;
import org.moflon.smartemf.runtime.SmartObject;
import org.moflon.smartemf.runtime.notification.SmartEMFNotification;

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
import Village.VillagePackage;

import org.emoflon.ibex.common.emf.EMFManipulationUtils;


public class EMFDirectModelTest extends AbstractEMFTest {

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
	public void testModelChange() {
		//test that changing the model works
		VillageFactory factory = VillageFactory.eINSTANCE;
		Resource rs = createResource(path);
		EMFTestAdapter adapter = createAdapter(rs);
		adapter.cleanNotifications();
		
		City city1 = factory.createCity();
		City city2 = factory.createCity();
		rs.getContents().add(city1);
		rs.getContents().add(city2);
		//each addition of a city to a resource creates a remove and an add notification
		assertEquals(2, adapter.getChanges().stream()
				.filter(n -> n.getEventType() == SmartEMFNotification.ADD).count());
		assertEquals(2, adapter.getChanges().stream()
				.filter(n -> n.getEventType() == SmartEMFNotification.REMOVE).count());
		adapter.cleanNotifications();
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
		
		//adding the shops should lead to 6 notifications;
		//3 for the references city->shop and 3 for the eOpposite
		List<Notification> shopNotification = adapter.getChanges().stream()
				.filter(n->n.getEventType() == SmartEMFNotification.SET).collect(Collectors.toList());
		List<Notification> cityNotification = adapter.getChanges().stream()
				.filter(n->n.getEventType() == SmartEMFNotification.ADD).collect(Collectors.toList());
		assertEquals(3, shopNotification.size());
		assertEquals(3, cityNotification.size());
		
		//the Set notifications should have a city instance as new value
		for(Notification n: cityNotification) {
			assertTrue(n.getNewValue() instanceof Shop);
		}
		//the Add notifications should have a city instance as new value
		for(Notification n: shopNotification) {
			assertTrue(n.getNewValue() instanceof City);
		}
		adapter.cleanNotifications();
		
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
