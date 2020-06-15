/**
 */
package aadl2.provider;

import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.ListType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aadl2.ListType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListTypeItemProvider extends PropertyTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListTypeItemProvider(AdapterFactory adapterFactory) {
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

			addReferencedElementTypePropertyDescriptor(object);
			addElementTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Referenced Element Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedElementTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListType_referencedElementType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListType_referencedElementType_feature",
								"_UI_ListType_type"),
						Aadl2Package.Literals.LIST_TYPE__REFERENCED_ELEMENT_TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Element Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListType_elementType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListType_elementType_feature",
								"_UI_ListType_type"),
						Aadl2Package.Literals.LIST_TYPE__ELEMENT_TYPE, false, false, false, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ListType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ListType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ListType_type")
				: getString("_UI_ListType_type") + " " + label;
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

		switch (notification.getFeatureID(ListType.class)) {
		case Aadl2Package.LIST_TYPE__OWNED_ELEMENT_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
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

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createAadlBoolean()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createAadlString()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createAadlInteger()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createUnitsType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createAadlReal()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createClassifierType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createRangeType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createRecordType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.LIST_TYPE__OWNED_ELEMENT_TYPE,
				Aadl2Factory.eINSTANCE.createListType()));
	}

}
