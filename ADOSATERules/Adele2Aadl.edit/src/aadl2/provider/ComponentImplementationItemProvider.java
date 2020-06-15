/**
 */
package aadl2.provider;

import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.ComponentImplementation;

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
 * This is the item provider adapter for a {@link aadl2.ComponentImplementation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentImplementationItemProvider extends ComponentClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementationItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addOwnedSubcomponentPropertyDescriptor(object);
			addExtendedPropertyDescriptor(object);
			addOwnedConnectionPropertyDescriptor(object);
			addNoSubcomponentsPropertyDescriptor(object);
			addNoConnectionsPropertyDescriptor(object);
			addNoCallsPropertyDescriptor(object);
			addOwnedProcessorFeaturePropertyDescriptor(object);
			addOwnedInternalFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentImplementation_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_type_feature",
								"_UI_ComponentImplementation_type"),
						Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementation_ownedSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_ownedSubcomponent_feature",
						"_UI_ComponentImplementation_type"),
				Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_SUBCOMPONENT, false, false, false, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Extended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentImplementation_extended_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_extended_feature",
								"_UI_ComponentImplementation_type"),
						Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__EXTENDED, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementation_ownedConnection_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_ownedConnection_feature",
						"_UI_ComponentImplementation_type"),
				Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_CONNECTION, false, false, false, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the No Subcomponents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoSubcomponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementation_noSubcomponents_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_noSubcomponents_feature",
						"_UI_ComponentImplementation_type"),
				Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__NO_SUBCOMPONENTS, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the No Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementation_noConnections_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_noConnections_feature",
						"_UI_ComponentImplementation_type"),
				Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__NO_CONNECTIONS, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the No Calls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoCallsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementation_noCalls_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentImplementation_noCalls_feature",
						"_UI_ComponentImplementation_type"),
				Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__NO_CALLS, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Processor Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedProcessorFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentImplementation_ownedProcessorFeature_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ComponentImplementation_ownedProcessorFeature_feature",
								"_UI_ComponentImplementation_type"),
						Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_PROCESSOR_FEATURE, false, false, false,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Internal Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedInternalFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentImplementation_ownedInternalFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ComponentImplementation_ownedInternalFeature_feature", "_UI_ComponentImplementation_type"),
				Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_INTERNAL_FEATURE, false, false, false, null, null,
				null));
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
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY);
			childrenFeatures.add(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY);
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
		String label = ((ComponentImplementation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ComponentImplementation_type")
				: getString("_UI_ComponentImplementation_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentImplementation.class)) {
		case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_SUBCOMPONENTS:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CONNECTIONS:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CALLS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY:
		case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY:
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

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION,
						Aadl2Factory.eINSTANCE.createFlowImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION,
				Aadl2Factory.eINSTANCE.createImplementationExtension()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION,
				Aadl2Factory.eINSTANCE.createRealization()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW,
						Aadl2Factory.eINSTANCE.createEndToEndFlow()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT,
						Aadl2Factory.eINSTANCE.createAbstractSubcomponent()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION,
						Aadl2Factory.eINSTANCE.createAccessConnection()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION,
						Aadl2Factory.eINSTANCE.createParameterConnection()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION,
						Aadl2Factory.eINSTANCE.createPortConnection()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION,
						Aadl2Factory.eINSTANCE.createFeatureConnection()));

		newChildDescriptors.add(
				createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION,
						Aadl2Factory.eINSTANCE.createFeatureGroupConnection()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE,
				Aadl2Factory.eINSTANCE.createEventSource()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE,
						Aadl2Factory.eINSTANCE.createEventDataSource()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY,
				Aadl2Factory.eINSTANCE.createPortProxy()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY,
						Aadl2Factory.eINSTANCE.createSubprogramProxy()));
	}

}
