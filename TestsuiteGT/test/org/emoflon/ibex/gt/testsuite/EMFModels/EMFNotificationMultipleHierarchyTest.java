package org.emoflon.ibex.gt.testsuite.EMFModels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
			List<Notification> notifications = adapter.getChanges();
			
			List<Notification> removeNotifs = notifications.stream()
					.filter(n -> n.getEventType() ==  SmartEMFNotification.REMOVE).collect(Collectors.toList());
			assertEquals(1, removeNotifs.size());
			Notification notif = removeNotifs.get(0);
			
			//the first notification is a remove notification
			assertEquals(base, notif.getNotifier());
			
			//then there are 2 removing adapters
			//one for childA and one for childDS
			//we do not need to care about the removing adapter notifications
			//assertEquals(2, adapter.getChanges().stream()
			//		.filter(n -> n.getEventType() == SmartEMFNotification.REMOVING_ADAPTER).count());
			
			//then there is an ADD notification
			List<Notification> addNotifs = notifications.stream()
					.filter(n -> n.getEventType() ==  SmartEMFNotification.ADD).collect(Collectors.toList());
			assertEquals(1, addNotifs.size());
			notif = addNotifs.get(0);
			
			assertEquals(base2, notif.getNotifier());	
			
			//assert that the add is after the remove notification
			int removeIndex = notifications.indexOf(removeNotifs.get(0));
			int addIndex = notifications.indexOf(addNotifs.get(0));
			assertTrue(removeIndex<addIndex);
		}else {
			//in normal EMF, first the removing adapters are generated and then the remove/add notifications
			LinkedList<Notification> notifications = adapter.getChanges();
			
			//we dont need to care about the removing adapter notifications
			//assertEquals(2, notifications.stream()
			//		.filter(n -> n.getEventType() == SmartEMFNotification.REMOVING_ADAPTER).count());

			List<Notification> removeNotifs = notifications.stream()
					.filter(n -> n.getEventType() ==  SmartEMFNotification.REMOVE).collect(Collectors.toList());
			assertEquals(1, removeNotifs.size());
			Notification notif = removeNotifs.get(0);
			assertEquals(notif.getNotifier(), base);
			
			List<Notification> addNotifs = notifications.stream()
					.filter(n -> n.getEventType() ==  SmartEMFNotification.ADD).collect(Collectors.toList());
			assertEquals(1, addNotifs.size());
			notif = addNotifs.get(0);
			assertEquals(notif.getNotifier(), base2);				
		}
		
		adapter.cleanNotifications();
		
		//now create a circulary containment dependency
		childD.getContainmentA().add(childA);
		if(base instanceof SmartObject) {
			//the objects shouldn't be in the model anymore (since they contain each other)
			LinkedList<Notification> notifications = adapter.getChanges();
			
			//first is a remove notification (a is removed from base)
			List<Notification> removeNotifs = notifications.stream()
					.filter(n -> n.getEventType() ==  SmartEMFNotification.REMOVE).collect(Collectors.toList());
			assertEquals(1, removeNotifs.size());
			Notification notif = removeNotifs.get(0);
			assertEquals(notif.getNotifier(), base2);
			
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

			//the two REMOVE_ADAPTER notifications
			assertEquals(2, adapter.getChanges().stream()
					.filter(not -> not.getEventType() == SmartEMFNotification.REMOVING_ADAPTER).count());	
			assertEquals(1, adapter.getChanges().stream()
					.filter(not -> not.getNotifier().equals(childD)).count());	
			assertEquals(1, adapter.getChanges().stream()
					.filter(not -> not.getNotifier().equals(childA)).count());
			
			List<Notification> removeNotifs = notifications.stream()
					.filter(n -> n.getEventType() ==  SmartEMFNotification.REMOVE).collect(Collectors.toList());
			assertEquals(1, removeNotifs.size());
			Notification notif = removeNotifs.get(0);
			assertEquals(notif.getNotifier(), base2);
			assertEquals(notif.getNotifier(), base2);
			
		}
		
	}	
}
