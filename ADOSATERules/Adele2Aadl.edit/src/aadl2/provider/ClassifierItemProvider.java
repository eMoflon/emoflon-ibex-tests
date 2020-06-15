/**
 */
package aadl2.provider;

import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.Classifier;

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
 * This is the item provider adapter for a {@link aadl2.Classifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addClassifierFeaturePropertyDescriptor(object);
			addInheritedMemberPropertyDescriptor(object);
			addGeneralizationPropertyDescriptor(object);
			addGeneralPropertyDescriptor(object);
			addNoPrototypesPropertyDescriptor(object);
			addNoAnnexesPropertyDescriptor(object);
			addNoPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Classifier Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Classifier_classifierFeature_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Classifier_classifierFeature_feature",
								"_UI_Classifier_type"),
						Aadl2Package.Literals.CLASSIFIER__CLASSIFIER_FEATURE, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Inherited Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Classifier_inheritedMember_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Classifier_inheritedMember_feature",
								"_UI_Classifier_type"),
						Aadl2Package.Literals.CLASSIFIER__INHERITED_MEMBER, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Generalization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Classifier_generalization_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Classifier_generalization_feature",
								"_UI_Classifier_type"),
						Aadl2Package.Literals.CLASSIFIER__GENERALIZATION, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the General feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Classifier_general_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Classifier_general_feature",
								"_UI_Classifier_type"),
						Aadl2Package.Literals.CLASSIFIER__GENERAL, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the No Prototypes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoPrototypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Classifier_noPrototypes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Classifier_noPrototypes_feature",
								"_UI_Classifier_type"),
						Aadl2Package.Literals.CLASSIFIER__NO_PROTOTYPES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the No Annexes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoAnnexesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Classifier_noAnnexes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Classifier_noAnnexes_feature",
								"_UI_Classifier_type"),
						Aadl2Package.Literals.CLASSIFIER__NO_ANNEXES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the No Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Classifier_noProperties_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Classifier_noProperties_feature",
								"_UI_Classifier_type"),
						Aadl2Package.Literals.CLASSIFIER__NO_PROPERTIES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(Aadl2Package.Literals.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE);
			childrenFeatures.add(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE);
			childrenFeatures.add(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE_BINDING);
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
		String label = ((Classifier) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Classifier_type")
				: getString("_UI_Classifier_type") + " " + label;
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

		switch (notification.getFeatureID(Classifier.class)) {
		case Aadl2Package.CLASSIFIER__NO_PROTOTYPES:
		case Aadl2Package.CLASSIFIER__NO_ANNEXES:
		case Aadl2Package.CLASSIFIER__NO_PROPERTIES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Aadl2Package.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE:
		case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE:
		case Aadl2Package.CLASSIFIER__OWNED_PROTOTYPE_BINDING:
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

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_ANNEX_SUBCLAUSE,
				Aadl2Factory.eINSTANCE.createDefaultAnnexSubclause()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createFeaturePrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createFeatureGroupPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createAbstractPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createBusPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createDataPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createDevicePrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createMemoryPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createSubprogramPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createSubprogramGroupPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createSystemPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createProcessorPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createProcessPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createThreadPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createThreadGroupPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createVirtualBusPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE,
				Aadl2Factory.eINSTANCE.createVirtualProcessorPrototype()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE_BINDING,
				Aadl2Factory.eINSTANCE.createComponentPrototypeBinding()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE_BINDING,
				Aadl2Factory.eINSTANCE.createFeatureGroupPrototypeBinding()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.CLASSIFIER__OWNED_PROTOTYPE_BINDING,
				Aadl2Factory.eINSTANCE.createFeaturePrototypeBinding()));
	}

}
