package org.emoflon.ibex.gt.testsuite.EmfAdapterTest;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
/**
 * class which remembers node updates for attribute updates
 *
*/
public class EMFTestContentAdapter extends EContentAdapter {
	
	
	private Set<Object> addedObjects;
	private Set<Object> changedObjects;
	private Set<Object> otherObjects;
	private boolean debug;
	private boolean isSmartEMF;
	public EMFTestContentAdapter(ResourceSet rsSet, boolean debug, boolean isSmartEMF) {		
		
		addedObjects = new HashSet<Object>();	
		changedObjects = new HashSet<Object>();	
		otherObjects = new HashSet<Object>();	
		this.debug = debug;
		this.isSmartEMF = isSmartEMF;
		
		for(Resource r : rsSet.getResources()) {
			r.eAdapters().add(this);
			Notification notification = new ENotificationImpl(null, Notification.ADD, null, null, r);
			notifyChanged(notification);
		}		
	}

	
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if(notification.getEventType() == Notification.SET) {
			changedObjects.add(notification.getNotifier());
		}
		if(notification.getEventType() == Notification.ADD) {
			addedObjects.add(notification.getNotifier());
		}
		else {
			otherObjects.add(notification.getNotifier());
		}
		if(debug) {
			if(isSmartEMF) System.out.println("Debug SmartEMF: " + string(notification));
			else System.out.println("Debug normal EMF: " + string(notification));

		}
	}
	
	public int getAllChangesAmount() {
		return addedObjects.size() + changedObjects.size() + otherObjects.size();
	}
	public int getAddAmount() {
		return addedObjects.size();
	}
	public Set<Object> getAddedObjects(){
		return addedObjects;
	}
	public Set<Object> getChangedObjects(){
		return changedObjects;
	}
	public Set<Object> getOtherObjects() {
		return otherObjects;
	}
	public void clear() {
		addedObjects.clear();
		changedObjects.clear();
		otherObjects.clear();
	}
	
	@Override
	  protected void removeAdapter(Notifier notifier, boolean checkContainer, boolean checkResource)
	  {
	    removeAdapter(notifier);
	  }
	
	
	  public String string(Notification n)
	  {
	    StringBuilder result = new StringBuilder();
	    result.append("eventType: ");
	    switch (n.getEventType())
	    {
	      case Notification.SET:
	      {
	        result.append("SET");
	        break;
	      }
	      case Notification.UNSET:
	      {
	        result.append("UNSET");
	        break;
	      }
	      case Notification.ADD:
	      {
	        result.append("ADD");
	        break;
	      }
	      case Notification.ADD_MANY:
	      {
	        result.append("ADD_MANY");
	        break;
	      }
	      case Notification.REMOVE:
	      {
	        result.append("REMOVE");
	        break;
	      }
	      case Notification.REMOVE_MANY:
	      {
	        result.append("REMOVE_MANY");
	        break;
	      }
	      case Notification.MOVE:
	      {
	        result.append("MOVE");
	        break;
	      }
	      case Notification.REMOVING_ADAPTER:
	      {
	        result.append("REMOVING_ADAPTER");
	        break;
	      }
	      case Notification.RESOLVE:
	      {
	        result.append("RESOLVE");
	        break;
	      }
	      default:
	      {
	        result.append(n.getEventType());
	        break;
	      }
	    }
	    result.append(", position: ");
	    result.append(n.getPosition());
	    result.append(", feature: ");
	    result.append(n.getFeature());
	    result.append(", oldValue: ");
	    result.append(n.getOldValue());
	    result.append(", newValue: ");
	    if (n.getEventType() == Notification.REMOVE_MANY && n.getNewValue() instanceof int [])
	    {
	      int [] positions = (int [])n.getNewValue();
	      result.append("[");
	      for (int i = 0; i < positions.length; )
	      {
	        result.append(positions[i]);
	        if (++i < positions.length)
	        {
	          result.append(", ");
	        }
	      }
	      result.append("]");
	    }
	    else
	    {
	      result.append(n.getNewValue());
	    }
	    return result.toString();
	  }
}
