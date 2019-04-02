/**
 * Copyright (c) 2009 Ellidiss Technologies
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Arnaud Schach, arnaud.schach.com
 * 	Jean-Bertrand Hery
 */
package org.topcased.adele.model.KernelSpices.provider;


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
import org.topcased.adele.model.KernelSpices.KernelSpicesFactory;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.ba_features.Ba_featuresFactory;

/**
 * This is the item provider adapter for a {@link org.topcased.adele.model.KernelSpices.SKComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SKComponentItemProvider
	extends SKHierarchicalObjectItemProvider
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
	public SKComponentItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns SKComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SKComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SKComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SKComponent_type") :
			getString("_UI_SKComponent_type") + " " + label;
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

		switch (notification.getFeatureID(SKComponent.class)) {
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_SUBCOMPONENTS:
			case KernelSpicesPackage.SK_COMPONENT__AUTHORIZED_FEATURES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case KernelSpicesPackage.SK_COMPONENT__FEATURES:
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
				 KernelSpicesFactory.eINSTANCE.createSKFeature()));

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
