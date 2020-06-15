/**
 */
package aadl2.provider;

import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.Subcomponent;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aadl2.Subcomponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubcomponentItemProvider extends StructuralFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubcomponentItemProvider(AdapterFactory adapterFactory) {
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

			addInModePropertyDescriptor(object);
			addSubcomponentTypePropertyDescriptor(object);
			addPrototypePropertyDescriptor(object);
			addAllModesPropertyDescriptor(object);
			addRefinedPropertyDescriptor(object);
			addClassifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the In Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInModePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ModalElement_inMode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ModalElement_inMode_feature",
								"_UI_ModalElement_type"),
						Aadl2Package.Literals.MODAL_ELEMENT__IN_MODE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subcomponent Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubcomponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Subcomponent_subcomponentType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Subcomponent_subcomponentType_feature",
								"_UI_Subcomponent_type"),
						Aadl2Package.Literals.SUBCOMPONENT__SUBCOMPONENT_TYPE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Prototype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrototypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Subcomponent_prototype_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Subcomponent_prototype_feature",
								"_UI_Subcomponent_type"),
						Aadl2Package.Literals.SUBCOMPONENT__PROTOTYPE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All Modes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllModesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Subcomponent_allModes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Subcomponent_allModes_feature",
								"_UI_Subcomponent_type"),
						Aadl2Package.Literals.SUBCOMPONENT__ALL_MODES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Refined feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Subcomponent_refined_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Subcomponent_refined_feature",
								"_UI_Subcomponent_type"),
						Aadl2Package.Literals.SUBCOMPONENT__REFINED, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Subcomponent_classifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Subcomponent_classifier_feature",
								"_UI_Subcomponent_type"),
						Aadl2Package.Literals.SUBCOMPONENT__CLASSIFIER, false, false, false, null, null, null));
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
			childrenFeatures.add(Aadl2Package.Literals.ARRAYABLE_ELEMENT__ARRAY_DIMENSION);
			childrenFeatures.add(Aadl2Package.Literals.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING);
			childrenFeatures.add(Aadl2Package.Literals.SUBCOMPONENT__OWNED_MODE_BINDING);
			childrenFeatures.add(Aadl2Package.Literals.SUBCOMPONENT__IMPLEMENTATION_REFERENCE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Subcomponent) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Subcomponent_type")
				: getString("_UI_Subcomponent_type") + " " + label;
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

		switch (notification.getFeatureID(Subcomponent.class)) {
		case Aadl2Package.SUBCOMPONENT__ALL_MODES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION:
		case Aadl2Package.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING:
		case Aadl2Package.SUBCOMPONENT__OWNED_MODE_BINDING:
		case Aadl2Package.SUBCOMPONENT__IMPLEMENTATION_REFERENCE:
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

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.ARRAYABLE_ELEMENT__ARRAY_DIMENSION,
				Aadl2Factory.eINSTANCE.createArrayDimension()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING,
				Aadl2Factory.eINSTANCE.createComponentPrototypeBinding()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING,
				Aadl2Factory.eINSTANCE.createFeatureGroupPrototypeBinding()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING,
				Aadl2Factory.eINSTANCE.createFeaturePrototypeBinding()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.SUBCOMPONENT__OWNED_MODE_BINDING,
				Aadl2Factory.eINSTANCE.createModeBinding()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.SUBCOMPONENT__IMPLEMENTATION_REFERENCE,
				Aadl2Factory.eINSTANCE.createComponentImplementationReference()));
	}

}
