/**
 */
package ADELE_Components.provider;

import ADELE_Components.ADELE_ComponentsPackage;
import ADELE_Components.Component;

import ADELE_Relations.ADELE_RelationsFactory;

import Adele2Aadl.provider.Adele2AadlEditPlugin;

import KernelSpices.KernelSpicesPackage;

import KernelSpices.provider.SKComponentItemProvider;

import ba_relations.Ba_relationsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ADELE_Components.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends SKComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addMultiplicityPropertyDescriptor(object);
			addMinPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addImplementationPropertyDescriptor(object);
			addImplementationNamePropertyDescriptor(object);
			addFeaturesLockPropertyDescriptor(object);
			addSubcomponentsLockPropertyDescriptor(object);
			addRefinesPropertyDescriptor(object);
			addSubcomponentRefinementPropertyDescriptor(object);
			addAllRefinesPropertyDescriptor(object);
			addRefinedSubcomponentPropertyDescriptor(object);
			addAllRealFeaturesPropertyDescriptor(object);
			addAllRealChildrenComponentsPropertyDescriptor(object);
			addOriginalComponentPropertyDescriptor(object);
			addAllRelationsPropertyDescriptor(object);
			addAllRealRelationsPropertyDescriptor(object);
			addAllOriginalRelationsPropertyDescriptor(object);
			addSubcomponentTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Multiplicity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_multiplicity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_multiplicity_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__MULTIPLICITY, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_min_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_min_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__MIN, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Component_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_type_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_implementation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_implementation_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__IMPLEMENTATION, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Implementation Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_implementationName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_implementationName_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__IMPLEMENTATION_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Features Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_featuresLock_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_featuresLock_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__FEATURES_LOCK, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Subcomponents Lock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubcomponentsLockPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_subcomponentsLock_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_subcomponentsLock_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__SUBCOMPONENTS_LOCK, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Refines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_refines_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_refines_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__REFINES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subcomponent Refinement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubcomponentRefinementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_subcomponentRefinement_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_subcomponentRefinement_feature",
						"_UI_Component_type"),
				ADELE_ComponentsPackage.Literals.COMPONENT__SUBCOMPONENT_REFINEMENT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the All Refines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllRefinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_allRefines_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_allRefines_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__ALL_REFINES, false, false, false, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Refined Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinedSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_refinedSubcomponent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_refinedSubcomponent_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__REFINED_SUBCOMPONENT, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the All Real Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllRealFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_allRealFeatures_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_allRealFeatures_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__ALL_REAL_FEATURES, false, false, false, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the All Real Children Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllRealChildrenComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_allRealChildrenComponents_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_allRealChildrenComponents_feature",
						"_UI_Component_type"),
				ADELE_ComponentsPackage.Literals.COMPONENT__ALL_REAL_CHILDREN_COMPONENTS, false, false, false, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Original Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_originalComponent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_originalComponent_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__ORIGINAL_COMPONENT, false, false, false, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the All Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_allRelations_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_allRelations_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__ALL_RELATIONS, false, false, false, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the All Real Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllRealRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_allRealRelations_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_allRealRelations_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__ALL_REAL_RELATIONS, false, false, false, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the All Original Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllOriginalRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_allOriginalRelations_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_allOriginalRelations_feature",
						"_UI_Component_type"),
				ADELE_ComponentsPackage.Literals.COMPONENT__ALL_ORIGINAL_RELATIONS, false, false, false, null, null,
				null));
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
						getResourceLocator(), getString("_UI_Component_subcomponentType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_subcomponentType_feature",
								"_UI_Component_type"),
						ADELE_ComponentsPackage.Literals.COMPONENT__SUBCOMPONENT_TYPE, false, false, false, null, null,
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
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__BA_TRANSITION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__EVENT_DATA_PORT_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__EVENT_PORT_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__DATA_PORT_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__DATA_ACCESS_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__BUS_ACCESS_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__PARAMETER_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__ABSTRACT_FEATURE_CONNECTION);
			childrenFeatures.add(ADELE_ComponentsPackage.Literals.COMPONENT__FEATURE_GROUP_CONNECTION);
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
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type")
				: getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
		case ADELE_ComponentsPackage.COMPONENT__MULTIPLICITY:
		case ADELE_ComponentsPackage.COMPONENT__MIN:
		case ADELE_ComponentsPackage.COMPONENT__IMPLEMENTATION_NAME:
		case ADELE_ComponentsPackage.COMPONENT__FEATURES_LOCK:
		case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENTS_LOCK:
		case ADELE_ComponentsPackage.COMPONENT__SUBCOMPONENT_REFINEMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ADELE_ComponentsPackage.COMPONENT__BA_TRANSITION:
		case ADELE_ComponentsPackage.COMPONENT__EVENT_DATA_PORT_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__EVENT_PORT_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__DATA_PORT_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__DATA_ACCESS_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__BUS_ACCESS_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__PARAMETER_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__ABSTRACT_FEATURE_CONNECTION:
		case ADELE_ComponentsPackage.COMPONENT__FEATURE_GROUP_CONNECTION:
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

		newChildDescriptors.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__BA_TRANSITION,
				Ba_relationsFactory.eINSTANCE.createBATransition()));

		newChildDescriptors
				.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__EVENT_DATA_PORT_CONNECTION,
						ADELE_RelationsFactory.eINSTANCE.createEventDataPortConnection()));

		newChildDescriptors.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__EVENT_PORT_CONNECTION,
				ADELE_RelationsFactory.eINSTANCE.createEventPortConnection()));

		newChildDescriptors.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__DATA_PORT_CONNECTION,
				ADELE_RelationsFactory.eINSTANCE.createDataPortConnection()));

		newChildDescriptors.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__DATA_ACCESS_CONNECTION,
				ADELE_RelationsFactory.eINSTANCE.createDataAccessConnection()));

		newChildDescriptors.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__BUS_ACCESS_CONNECTION,
				ADELE_RelationsFactory.eINSTANCE.createBusAccessConnection()));

		newChildDescriptors
				.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__SUBPROGRAM_ACCESS_CONNECTION,
						ADELE_RelationsFactory.eINSTANCE.createSubprogramAccessConnection()));

		newChildDescriptors.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__PARAMETER_CONNECTION,
				ADELE_RelationsFactory.eINSTANCE.createParameterConnection()));

		newChildDescriptors.add(
				createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__SUBPROGRAM_GROUP_ACCESS_CONNECTION,
						ADELE_RelationsFactory.eINSTANCE.createSubprogramGroupAccessConnection()));

		newChildDescriptors
				.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__ABSTRACT_FEATURE_CONNECTION,
						ADELE_RelationsFactory.eINSTANCE.createAbstractFeatureConnection()));

		newChildDescriptors
				.add(createChildParameter(ADELE_ComponentsPackage.Literals.COMPONENT__FEATURE_GROUP_CONNECTION,
						ADELE_RelationsFactory.eINSTANCE.createFeatureGroupConnection()));
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Adele2AadlEditPlugin.INSTANCE;
	}

}
