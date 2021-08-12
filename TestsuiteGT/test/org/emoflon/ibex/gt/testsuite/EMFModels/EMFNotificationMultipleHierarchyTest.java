package org.emoflon.ibex.gt.testsuite.EMFModels;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.moflon.smartemf.runtime.SmartObject;
import org.moflon.smartemf.runtime.notification.SmartEMFNotification;

import MetamodelInheritance.BaseContainer;
import MetamodelInheritance.MetamodelInheritanceFactory;
import MetamodelInheritance2.ChildA;
import MetamodelInheritance2.MetamodelInheritance2Factory;
import MetamodelInheritance3.ChildD;
import MetamodelInheritance3.MetamodelInheritance3Factory;

public class EMFNotificationMultipleHierarchyTest extends AbstractEMFTest{
	private static String path =  "./resources/EMFModel/BaseHierachy.xmi";
	
	@Test
	public void testMultipleHierarcyChange() {
		
		MetamodelInheritanceFactory factory = MetamodelInheritanceFactory.eINSTANCE;
		MetamodelInheritance2Factory factory2 = MetamodelInheritance2Factory.eINSTANCE;	
		MetamodelInheritance3Factory factory3 = MetamodelInheritance3Factory.eINSTANCE;
		
		Resource rs = createHierachyResource(path);
		EMFTestAdapter adapter = createAdapter(rs);
		adapter.cleanNotifications();
				
		BaseContainer base = factory.createBaseContainer();
		rs.getContents().add(base);
		ChildA childA = factory2.createChildA();
		//first containment hierarchy
		base.getBaseA().add(childA);
		ChildD childD = factory3.createChildD();
		//second containment hierarchy
		childA.getChildD().add(childD);
		

		//3 add notification are generated
		assertEquals(3, adapter.getChanges().stream()
				.filter(n -> n.getEventType() == SmartEMFNotification.ADD).count());
		
		
		BaseContainer base2 = factory.createBaseContainer();
		rs.getContents().add(base2);
		
		adapter.cleanNotifications();
		
		//change container for the subgraph with multiple hierarchies
		base2.getBaseA().add(childA);
		if(base instanceof SmartObject) {
			LinkedList<Notification> notifications = adapter.getChanges();
			
			Notification n = notifications.poll();
			//the first notification is a remove notification
			assertEquals(n.getEventType(), SmartEMFNotification.REMOVE);
			assertEquals(n.getNotifier(), base);
			//then there are 2 removing adapters
			//one for childA and one for childDS
			assertEquals(notifications.poll().getEventType(), SmartEMFNotification.REMOVING_ADAPTER);
			assertEquals(notifications.poll().getEventType(), SmartEMFNotification.REMOVING_ADAPTER);
			//then there is an ADD notification
			n = notifications.poll();
			assertEquals(n.getEventType(), SmartEMFNotification.ADD);
			assertEquals(n.getNotifier(), base2);		
		}else {
			//in normal EMF, first the removing adapters are generated and then the remove/add notifications
			LinkedList<Notification> notifications = adapter.getChanges();

			assertEquals(notifications.poll().getEventType(), SmartEMFNotification.REMOVING_ADAPTER);
			assertEquals(notifications.poll().getEventType(), SmartEMFNotification.REMOVING_ADAPTER);
			
			Notification n = notifications.poll();
			
			assertEquals(n.getEventType(), SmartEMFNotification.REMOVE);
			assertEquals(n.getNotifier(), base);
			n = notifications.poll();
			assertEquals(n.getEventType(), SmartEMFNotification.ADD);
			assertEquals(n.getNotifier(), base2);	
		}
		
		adapter.cleanNotifications();
		
		//now create a circulary containment dependency
		childD.getContainmentA().add(childA);
		if(base instanceof SmartObject) {
			//the objects shouldnt be in the model anymore (since they contain each other)
			LinkedList<Notification> notifications = adapter.getChanges();
			Notification n = notifications.poll();
			//first is a remove notification (a is removed from base)
			assertEquals(n.getEventType(), SmartEMFNotification.REMOVE);
			assertEquals(n.getNotifier(), base2);
			
			//then two REMOVE_ADAPTER notifications
			assertEquals(2, adapter.getChanges().stream()
					.filter(not -> not.getEventType() == SmartEMFNotification.REMOVING_ADAPTER).count());	
			assertEquals(1, adapter.getChanges().stream()
					.filter(not -> not.getNotifier().equals(childD)).count());	
			assertEquals(1, adapter.getChanges().stream()
					.filter(not -> not.getNotifier().equals(childA)).count());
		} else {
			//again, normal EMF creates first the remove adapters and then the remove notifications
			
			LinkedList<Notification> notifications = adapter.getChanges();

			//then two REMOVE_ADAPTER notifications
			assertEquals(2, adapter.getChanges().stream()
					.filter(not -> not.getEventType() == SmartEMFNotification.REMOVING_ADAPTER).count());	
			assertEquals(1, adapter.getChanges().stream()
					.filter(not -> not.getNotifier().equals(childD)).count());	
			assertEquals(1, adapter.getChanges().stream()
					.filter(not -> not.getNotifier().equals(childA)).count());
			
			Notification n = notifications.poll();
			n = notifications.poll();
			n = notifications.poll();
			//first is a remove notification (a is removed from base)
			assertEquals(n.getEventType(), SmartEMFNotification.REMOVE);
			assertEquals(n.getNotifier(), base2);
			
		}
		
	}	
}
