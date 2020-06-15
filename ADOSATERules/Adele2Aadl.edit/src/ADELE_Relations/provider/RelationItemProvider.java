/**
 */
package ADELE_Relations.provider;

import ADELE_Relations.ADELE_RelationsPackage;
import ADELE_Relations.Relation;

import Adele2Aadl.provider.Adele2AadlEditPlugin;

import KernelSpices.KernelSpicesPackage;

import KernelSpices.provider.SKRelationItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ADELE_Relations.Relation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationItemProvider extends SKRelationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationItemProvider(AdapterFactory adapterFactory) {
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
			addOriginalSourceFeaturePropertyDescriptor(object);
			addOriginalSinkFeaturePropertyDescriptor(object);
			addOriginalSourceSubcomponentPropertyDescriptor(object);
			addOriginalSinkSubcomponentPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addSinkPropertyDescriptor(object);
			addOwningComponentPropertyDescriptor(object);
			addOriginalRelationPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Relation_multiplicity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Relation_multiplicity_feature",
								"_UI_Relation_type"),
						ADELE_RelationsPackage.Literals.RELATION__MULTIPLICITY, true, false, false,
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
						getResourceLocator(), getString("_UI_Relation_min_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Relation_min_feature",
								"_UI_Relation_type"),
						ADELE_RelationsPackage.Literals.RELATION__MIN, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Original Source Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalSourceFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Relation_originalSourceFeature_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Relation_originalSourceFeature_feature",
								"_UI_Relation_type"),
						ADELE_RelationsPackage.Literals.RELATION__ORIGINAL_SOURCE_FEATURE, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Original Sink Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalSinkFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Relation_originalSinkFeature_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Relation_originalSinkFeature_feature",
								"_UI_Relation_type"),
						ADELE_RelationsPackage.Literals.RELATION__ORIGINAL_SINK_FEATURE, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Original Source Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalSourceSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Relation_originalSourceSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Relation_originalSourceSubcomponent_feature",
						"_UI_Relation_type"),
				ADELE_RelationsPackage.Literals.RELATION__ORIGINAL_SOURCE_SUBCOMPONENT, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Original Sink Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalSinkSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Relation_originalSinkSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Relation_originalSinkSubcomponent_feature",
						"_UI_Relation_type"),
				ADELE_RelationsPackage.Literals.RELATION__ORIGINAL_SINK_SUBCOMPONENT, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Relation_source_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Relation_source_feature",
								"_UI_Relation_type"),
						ADELE_RelationsPackage.Literals.RELATION__SOURCE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sink feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Relation_sink_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Relation_sink_feature",
								"_UI_Relation_type"),
						ADELE_RelationsPackage.Literals.RELATION__SINK, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owning Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Relation_owningComponent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Relation_owningComponent_feature",
								"_UI_Relation_type"),
						ADELE_RelationsPackage.Literals.RELATION__OWNING_COMPONENT, false, false, false, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Original Relation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalRelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Relation_originalRelation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Relation_originalRelation_feature",
								"_UI_Relation_type"),
						ADELE_RelationsPackage.Literals.RELATION__ORIGINAL_RELATION, false, false, false, null, null,
						null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Relation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Relation_type")
				: getString("_UI_Relation_type") + " " + label;
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

		switch (notification.getFeatureID(Relation.class)) {
		case ADELE_RelationsPackage.RELATION__MULTIPLICITY:
		case ADELE_RelationsPackage.RELATION__MIN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
				|| childFeature == KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN;

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
