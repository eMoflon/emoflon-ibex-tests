/**
 */
package aadl2.provider;

import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.ModalPropertyValue;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aadl2.ModalPropertyValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModalPropertyValueItemProvider extends ModalElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalPropertyValueItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE);
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
	 * This returns ModalPropertyValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModalPropertyValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModalPropertyValue) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ModalPropertyValue_type")
				: getString("_UI_ModalPropertyValue_type") + " " + label;
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

		switch (notification.getFeatureID(ModalPropertyValue.class)) {
		case Aadl2Package.MODAL_PROPERTY_VALUE__OWNED_VALUE:
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

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createClassifierValue()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createReferenceValue()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createRangeValue()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createRecordValue()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createComputedValue()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createListValue()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.MODAL_PROPERTY_VALUE__OWNED_VALUE,
				Aadl2Factory.eINSTANCE.createNamedValue()));
	}

}
