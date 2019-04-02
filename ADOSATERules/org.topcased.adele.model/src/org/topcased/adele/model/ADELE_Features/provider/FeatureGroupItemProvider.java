/**
 */
package org.topcased.adele.model.ADELE_Features.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesFactory;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesPackage;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.KernelSpices.KernelSpicesFactory;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.ba_features.Ba_featuresFactory;

/**
 * This is the item provider adapter for a {@link org.topcased.adele.model.ADELE_Features.FeatureGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupItemProvider
	extends DirectedFeatureItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupItemProvider(AdapterFactory adapterFactory) {
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

			addAuthorizedSubcomponentsPropertyDescriptor(object);
			addAuthorizedFeaturesPropertyDescriptor(object);
			addInverseFeaturePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addAllRealFeaturesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Authorized Subcomponents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizedSubcomponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SKComponent_authorizedSubcomponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SKComponent_authorizedSubcomponents_feature", "_UI_SKComponent_type"),
				 KernelSpicesPackage.Literals.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authorized Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizedFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SKComponent_authorizedFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SKComponent_authorizedFeatures_feature", "_UI_SKComponent_type"),
				 KernelSpicesPackage.Literals.SK_COMPONENT__AUTHORIZED_FEATURES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverse Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverseFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureGroup_inverseFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureGroup_inverseFeature_feature", "_UI_FeatureGroup_type"),
				 ADELE_FeaturesPackage.Literals.FEATURE_GROUP__INVERSE_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureGroup_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureGroup_type_feature", "_UI_FeatureGroup_type"),
				 ADELE_FeaturesPackage.Literals.FEATURE_GROUP__TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Real Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllRealFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureGroup_allRealFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureGroup_allRealFeatures_feature", "_UI_FeatureGroup_type"),
				 ADELE_FeaturesPackage.Literals.FEATURE_GROUP__ALL_REAL_FEATURES,
				 false,
				 false,
				 false,
				 null,
				 null,
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
			childrenFeatures.add(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES);
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
	 * This returns FeatureGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureGroup)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FeatureGroup_type") :
			getString("_UI_FeatureGroup_type") + " " + label;
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

		switch (notification.getFeatureID(FeatureGroup.class)) {
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_SUBCOMPONENTS:
			case ADELE_FeaturesPackage.FEATURE_GROUP__AUTHORIZED_FEATURES:
			case ADELE_FeaturesPackage.FEATURE_GROUP__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ADELE_FeaturesPackage.FEATURE_GROUP__FEATURES:
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

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createBusAccess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createDataAccess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createSubprogramAccess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createSubprogramGroupAccess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createFeatureGroup()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createEventPort()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createEventDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 ADELE_FeaturesFactory.eINSTANCE.createAbstractFeature()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 Ba_featuresFactory.eINSTANCE.createBAVariable()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES,
				 KernelSpicesFactory.eINSTANCE.createSKFeature()));
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

		boolean qualify =
			childFeature == KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__PROPERTIES ||
			childFeature == KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN ||
			childFeature == KernelSpicesPackage.Literals.SK_COMPONENT__FEATURES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
