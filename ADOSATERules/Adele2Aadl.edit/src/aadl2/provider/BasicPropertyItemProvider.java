/**
 */
package aadl2.provider;

import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.BasicProperty;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aadl2.BasicProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicPropertyItemProvider extends TypedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicPropertyItemProvider(AdapterFactory adapterFactory) {
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

			addReferencedPropertyTypePropertyDescriptor(object);
			addPropertyTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Referenced Property Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedPropertyTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BasicProperty_referencedPropertyType_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BasicProperty_referencedPropertyType_feature",
						"_UI_BasicProperty_type"),
				Aadl2Package.Literals.BASIC_PROPERTY__REFERENCED_PROPERTY_TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BasicProperty_propertyType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BasicProperty_propertyType_feature",
								"_UI_BasicProperty_type"),
						Aadl2Package.Literals.BASIC_PROPERTY__PROPERTY_TYPE, false, false, false, null, null, null));
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
			childrenFeatures.add(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE);
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
	 * This returns BasicProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BasicProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BasicProperty) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BasicProperty_type")
				: getString("_UI_BasicProperty_type") + " " + label;
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

		switch (notification.getFeatureID(BasicProperty.class)) {
		case Aadl2Package.BASIC_PROPERTY__OWNED_PROPERTY_TYPE:
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

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createAadlBoolean()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createAadlString()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createAadlInteger()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createUnitsType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createAadlReal()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createClassifierType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createRangeType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createRecordType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.BASIC_PROPERTY__OWNED_PROPERTY_TYPE,
				Aadl2Factory.eINSTANCE.createListType()));
	}

}
