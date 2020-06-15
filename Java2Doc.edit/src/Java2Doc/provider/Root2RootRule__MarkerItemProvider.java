/**
 */
package Java2Doc.provider;

import Java2Doc.Java2DocPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import runtime.provider.TGGRuleApplicationItemProvider;

/**
 * This is the item provider adapter for a {@link Java2Doc.Root2RootRule__Marker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Root2RootRule__MarkerItemProvider extends TGGRuleApplicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root2RootRule__MarkerItemProvider(AdapterFactory adapterFactory) {
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

			addCREATE__SRC__pPropertyDescriptor(object);
			addCREATE__TRG__fPropertyDescriptor(object);
			addCREATE__CORR__p2fPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CREATE SRC p feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__SRC__pPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Root2RootRule__Marker_CREATE__SRC__p_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Root2RootRule__Marker_CREATE__SRC__p_feature",
						"_UI_Root2RootRule__Marker_type"),
				Java2DocPackage.Literals.ROOT2_ROOT_RULE_MARKER__CREATE_SRC_P, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG f feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__fPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Root2RootRule__Marker_CREATE__TRG__f_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Root2RootRule__Marker_CREATE__TRG__f_feature",
						"_UI_Root2RootRule__Marker_type"),
				Java2DocPackage.Literals.ROOT2_ROOT_RULE_MARKER__CREATE_TRG_F, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR p2f feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__p2fPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Root2RootRule__Marker_CREATE__CORR__p2f_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Root2RootRule__Marker_CREATE__CORR__p2f_feature",
						"_UI_Root2RootRule__Marker_type"),
				Java2DocPackage.Literals.ROOT2_ROOT_RULE_MARKER__CREATE_CORR_P2F, true, false, true, null, null, null));
	}

	/**
	 * This returns Root2RootRule__Marker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Root2RootRule__Marker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Root2RootRule__Marker_type");
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
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Java2DocEditPlugin.INSTANCE;
	}

}
