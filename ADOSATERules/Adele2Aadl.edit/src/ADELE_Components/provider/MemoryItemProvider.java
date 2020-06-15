/**
 */
package ADELE_Components.provider;

import ADELE_Components.ADELE_ComponentsPackage;
import ADELE_Components.Memory;

import KernelSpices.KernelSpicesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link ADELE_Components.Memory} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoryItemProvider extends ComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns Memory.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Memory"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Memory) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Memory_type")
				: getString("_UI_Memory_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__PROPERTIES
				|| childFeature == KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN
				|| childFeature == KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__BUS_ACCESS_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__DATA_ACCESS_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__EVENT_PORT_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__DATA_PORT_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__EVENT_DATA_PORT_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__PARAMETER_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__ABSTRACT_FEATURE_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__FEATURE_GROUP_CONNECTION
				|| childFeature == ADELE_ComponentsPackage.Literals.COMPONENT__BA_TRANSITION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
