package org.emoflon.ibex.gt.testsuite.EMFModels;

import java.util.LinkedList;
import java.util.List;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.moflon.smartemf.runtime.notification.SmartEMFNotification;

public class EMFTestAdapter extends EContentAdapter {
	private List<Notification> changedObjects;
	public EMFTestAdapter(Resource rs) {
		
		changedObjects = new LinkedList<Notification>();		
		
		rs.eAdapters().add(this);
		Notification notification = SmartEMFNotification.createAddNotification(rs, null, this, -1);
		notifyChanged(notification);

	}
	
	@Override
	public void notifyChanged(Notification notification) {
		if(notification instanceof SmartEMFNotification) {
			super.notifyChanged(notification);
			changedObjects.add(notification);			
		}
	}
	
	public final List<Notification> getChanges(){
		return changedObjects;
	}

	public void cleanNotifications() {
		changedObjects.clear();
	}
}
