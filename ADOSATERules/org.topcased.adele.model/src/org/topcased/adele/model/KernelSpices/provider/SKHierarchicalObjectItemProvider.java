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
import org.topcased.adele.model.ADELE_Components.ADELE_ComponentsFactory;
import org.topcased.adele.model.ADELE_Features.ADELE_FeaturesFactory;
import org.topcased.adele.model.ADELE_Relations.ADELE_RelationsFactory;
import org.topcased.adele.model.KernelSpices.KernelSpicesFactory;
import org.topcased.adele.model.KernelSpices.KernelSpicesPackage;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelFactory;
import org.topcased.adele.model.ba_components.Ba_componentsFactory;
import org.topcased.adele.model.ba_features.Ba_featuresFactory;
import org.topcased.adele.model.ba_relations.Ba_relationsFactory;

/**
 * This is the item provider adapter for a {@link org.topcased.adele.model.KernelSpices.SKHierarchicalObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SKHierarchicalObjectItemProvider
	extends SKObjectItemProvider
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
	public SKHierarchicalObjectItemProvider(AdapterFactory adapterFactory) {
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

			addLevelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SKHierarchicalObject_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SKHierarchicalObject_level_feature", "_UI_SKHierarchicalObject_type"),
				 KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__LEVEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__PROPERTIES);
			childrenFeatures.add(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN);
			childrenFeatures.add(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS);
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
		String label = ((SKHierarchicalObject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SKHierarchicalObject_type") :
			getString("_UI_SKHierarchicalObject_type") + " " + label;
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

		switch (notification.getFeatureID(SKHierarchicalObject.class)) {
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__LEVEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__PROPERTIES:
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__CHILDREN:
			case KernelSpicesPackage.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS:
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
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__PROPERTIES,
				 KernelSpicesFactory.eINSTANCE.createSKProperty()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 KernelSpicesFactory.eINSTANCE.createSKComponent()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 KernelSpicesFactory.eINSTANCE.createSKFeature()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 KernelSpicesFactory.eINSTANCE.createSKRelation()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 KernelSpicesFactory.eINSTANCE.createSKProperty()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createSubprogram()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createThread()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createThreadGroup()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createSubprogramGroup()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createAbstract()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createVirtualProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_ComponentsFactory.eINSTANCE.createVirtualBus()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createBusAccess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createDataAccess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createSubprogramAccess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createSubprogramGroupAccess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createFeatureGroup()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createEventPort()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createEventDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_FeaturesFactory.eINSTANCE.createAbstractFeature()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createBusAccessConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createDataAccessConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createSubprogramAccessConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createSubprogramGroupAccessConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createEventPortConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createDataPortConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createEventDataPortConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createParameterConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createAbstractFeatureConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ADELE_RelationsFactory.eINSTANCE.createFeatureGroupConnection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 Ba_componentsFactory.eINSTANCE.createBehaviorAnnex()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 Ba_componentsFactory.eINSTANCE.createBAState()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 Ba_featuresFactory.eINSTANCE.createBAVariable()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 Ba_relationsFactory.eINSTANCE.createBATransition()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN,
				 ObjectDescriptionModelFactory.eINSTANCE.createSKODSection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__OD_SYSTEMS,
				 ObjectDescriptionModelFactory.eINSTANCE.createSKODSystem()));
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
			childFeature == KernelSpicesPackage.Literals.SK_HIERARCHICAL_OBJECT__CHILDREN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
