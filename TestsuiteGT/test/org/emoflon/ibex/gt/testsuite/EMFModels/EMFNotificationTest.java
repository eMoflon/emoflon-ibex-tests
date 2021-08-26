package org.emoflon.ibex.gt.testsuite.EMFModels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.Test;
import org.moflon.smartemf.runtime.SmartObject;
import org.moflon.smartemf.runtime.notification.SmartEMFNotification;

import Village.City;
import Village.Company;
import Village.Product;
import Village.Shop;
import Village.VillageFactory;
import scala.noinline;

public class EMFNotificationTest extends AbstractEMFTest {
	
	private static String path =  "./resources/EMFModel/EmptyCity.xmi";
	
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
		
		//each addition of a city to a resource creates an add notification
		assertEquals(2, adapter.getChanges().stream()
				.filter(n -> n.getEventType() == SmartEMFNotification.ADD).count());
		
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
		if(city1 instanceof SmartObject) {
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
		} else {
			List<Notification> addNotification = adapter.getChanges();
			//old EMF does not create notification for each add and each set of the eOpposite,
			//but summarizes it into a single ADD_MANY notification
			assertEquals(1, addNotification.size());	
			assertEquals(Notification.ADD_MANY, addNotification.get(0).getEventType());
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

		if(city1 instanceof SmartObject) {
			LinkedList<Notification> modNotification = adapter.getChanges();
			//smartEMF creates a REMOVE_ADAPTER, a REMOVE,an ADD and a SET notification (for the eOpposite)
			//in exactly this order
			//we do not care about the adapte
			//assertEquals(1, modNotification.stream()
			//		.filter(n -> n.getEventType() == SmartEMFNotification.REMOVING_ADAPTER).count());
			modNotification.removeIf(n -> n.getEventType() == Notification.REMOVING_ADAPTER);
			List<Notification> removeNotif = modNotification.stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.REMOVE).collect(Collectors.toList());
			List<Notification> addNotif = modNotification.stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.ADD).collect(Collectors.toList());			
			//there should only be one add and remove notification
			assertEquals(1, removeNotif.size());
			assertEquals(1, addNotif.size());
			int removeIndex = modNotification.indexOf(removeNotif.get(0));
			int addIndex = modNotification.indexOf(addNotif.get(0));
			//the remove notification should be before the add notification			
			assertTrue(removeIndex<addIndex);
			//there is one set notification	
			assertEquals(1, modNotification.stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.SET).count());
			//ignoring the removing adapter, there are exactly 3 notifications
			assertEquals(3, modNotification.size());
		} else {
			LinkedList<Notification> modNotification = adapter.getChanges();
			//old EMF creates only a REMOVE_ADAPTER, a REMOVE and an ADD notification
			modNotification.removeIf(n -> n.getEventType() == Notification.REMOVING_ADAPTER);
			assertEquals(1, modNotification.stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.REMOVE).count());
			assertEquals(1, modNotification.stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.ADD).count());
			assertEquals(2, modNotification.size());
		}
		
		adapter.cleanNotifications();
		//eOpposite should have changed for shop1 but not for the others
		assertEquals(shop1.getCity(), city2);
		assertEquals(shop2.getCity(), city1);
		assertEquals(shop3.getCity(), city1);
	}	
	/**
	 * extension of the testRecursiveChanges-Test specifically for notifications;
	 */
	@Test
	public void testComplexNotificationCreation() {
		VillageFactory factory = VillageFactory.eINSTANCE;

		Resource rs = createResource(path);
		EMFTestAdapter adapter = createAdapter(rs);

		City city = factory.createCity();
		rs.getContents().add(city);
		adapter.cleanNotifications();
		
		Shop shop = factory.createShop();

		city.getShops().add(shop);
		
		if(city instanceof SmartObject) {
			List<Notification> shopNotification = adapter.getChanges().stream()
					.filter(n->n.getEventType() == SmartEMFNotification.SET).collect(Collectors.toList());
			List<Notification> cityNotification = adapter.getChanges().stream()
					.filter(n->n.getEventType() == SmartEMFNotification.ADD).collect(Collectors.toList());
			assertEquals(1, shopNotification.size());
			assertEquals(1, cityNotification.size());
			assertTrue(cityNotification.get(0).getNewValue() instanceof Shop);
			assertTrue(shopNotification.get(0).getNewValue() instanceof City);
		} else {
			//old EMF only creates an ADD notification
			List<Notification> notifications = adapter.getChanges();
			assertEquals(1, notifications.size());
			assertTrue(notifications.get(0).getEventType() == Notification.ADD);
		}
		
		Company company = factory.createCompany();
		city.getCompanies().add(company);
		company.getShops().add(shop);
		//create product
		Product product = factory.createProduct();
		shop.getGoods().add(product);
		company.getGoods().add(product);
		
		adapter.cleanNotifications();
		
		//put shop directly into the resource
		rs.getContents().add(shop);
		
		if(city instanceof SmartObject) {
			LinkedList<Notification> notifications = adapter.getChanges();
			
			//let us ignore again the two removing adapters notification
			//we just want to see if two are created
			//assertEquals(2, adapter.getChanges().stream()
			//		.filter(n -> n.getEventType() == SmartEMFNotification.REMOVING_ADAPTER).count());
			notifications.removeIf(n -> n.getEventType() == Notification.REMOVING_ADAPTER);

			//then we get the notification that the shop was removed from the city
			List<Notification> removeNotif = notifications.stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.REMOVE).collect(Collectors.toList());
			List<Notification> addNotif = notifications.stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.ADD).collect(Collectors.toList());			
			
			//there should only be one add and remove notification
			assertEquals(1, removeNotif.size());
			assertEquals(1, addNotif.size());
			int removeIndex = notifications.indexOf(removeNotif.get(0));
			int addIndex = notifications.indexOf(addNotif.get(0));
			assertTrue(removeIndex<addIndex);
			
			Notification notif = removeNotif.get(0);
			assertEquals(notif.getNotifier(), city);
			assertEquals(notif.getOldValue(), shop);
			
			//then we should get the notification that it was added to the resource 
			notif = addNotif.get(0);
			assertEquals(notif.getNotifier(), rs);
			assertEquals(notif.getNewValue(), shop);
			
			//this should be all notification
			assertEquals(2, notifications.size());
		} else {
			//ignore the REMOVING_ADAPTER notifications
			//old EMF creates a SET notification (that unsets the city from the shop)
			List<Notification> shopNotification = adapter.getChanges().stream()
					.filter(n->n.getEventType() == SmartEMFNotification.SET).collect(Collectors.toList());
			assertEquals(SmartEMFNotification.SET, shopNotification.get(0).getEventType());
			assertEquals(city, shopNotification.get(0).getOldValue());
			assertEquals(shop, shopNotification.get(0).getNotifier());
			assertNull(shopNotification.get(0).getNewValue());
			
			assertEquals(1, adapter.getChanges().stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.REMOVE).count());
			assertEquals(1, adapter.getChanges().stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.ADD).count());
		}
		
		adapter.cleanNotifications();
		
		//remove the shop -> the products should be removed too since they are contained within the shop instance
		EMFManipulationUtils.delete(shop, true); 

		if(city instanceof SmartObject) {
			LinkedList<Notification> notifications = adapter.getChanges();
			
			//again, let us ignore the two removing adapters notification
			//we just want to see if two are created
			assertEquals(2, adapter.getChanges().stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.REMOVING_ADAPTER).count());
			notifications.removeIf(n -> n.getEventType() == Notification.REMOVING_ADAPTER);		
			
			Notification notif = notifications.poll();
			
			//here is a REMOVE_MANY notification (and not a simple REMOVE notification).		
			assertTrue(notif.getEventType() == SmartEMFNotification.REMOVE_MANY);
			assertTrue(((List) notif.getOldValue()).get(0) instanceof Product);
			
			notif = notifications.poll();
			//the shop is removed	
			assertTrue(notif.getEventType() == SmartEMFNotification.REMOVE);
			assertTrue(notif.getOldValue() instanceof Shop);
		} else {
			LinkedList<Notification> notifications = adapter.getChanges();
			//the reference from the company to the shop is removed
			//then, the reference from the company to the product is removed
			//the shop is removed from the resource
			assertEquals(3, adapter.getChanges().stream()
					.filter(n -> n.getEventType() == SmartEMFNotification.REMOVE).count());
			notifications.removeIf(n -> n.getEventType() == SmartEMFNotification.REMOVE);
			
			//the rest are REMOVING_ADAPTER notifications
			for(Notification n: notifications) {
				assertTrue(n.getEventType() == SmartEMFNotification.REMOVING_ADAPTER);	
			}
		}
	}
}
