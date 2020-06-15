/**
 */
package aadl2.provider;

import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.PackageSection;

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
 * This is the item provider adapter for a {@link aadl2.PackageSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageSectionItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSectionItemProvider(AdapterFactory adapterFactory) {
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

			addImportedUnitPropertyDescriptor(object);
			addNoAnnexesPropertyDescriptor(object);
			addNoPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Imported Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PackageSection_importedUnit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PackageSection_importedUnit_feature",
								"_UI_PackageSection_type"),
						Aadl2Package.Literals.PACKAGE_SECTION__IMPORTED_UNIT, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_PackageSection_noAnnexes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PackageSection_noAnnexes_feature",
								"_UI_PackageSection_type"),
						Aadl2Package.Literals.PACKAGE_SECTION__NO_ANNEXES, true, false, false,
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
						getResourceLocator(), getString("_UI_PackageSection_noProperties_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PackageSection_noProperties_feature",
								"_UI_PackageSection_type"),
						Aadl2Package.Literals.PACKAGE_SECTION__NO_PROPERTIES, true, false, false,
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
			childrenFeatures.add(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_PACKAGE_RENAME);
			childrenFeatures.add(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME);
			childrenFeatures.add(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER);
			childrenFeatures.add(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME);
			childrenFeatures.add(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY);
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
		String label = ((PackageSection) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PackageSection_type")
				: getString("_UI_PackageSection_type") + " " + label;
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

		switch (notification.getFeatureID(PackageSection.class)) {
		case Aadl2Package.PACKAGE_SECTION__NO_ANNEXES:
		case Aadl2Package.PACKAGE_SECTION__NO_PROPERTIES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Aadl2Package.PACKAGE_SECTION__OWNED_PACKAGE_RENAME:
		case Aadl2Package.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME:
		case Aadl2Package.PACKAGE_SECTION__OWNED_CLASSIFIER:
		case Aadl2Package.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME:
		case Aadl2Package.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY:
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

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_PACKAGE_RENAME,
				Aadl2Factory.eINSTANCE.createPackageRename()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME,
				Aadl2Factory.eINSTANCE.createComponentTypeRename()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createFeatureGroupType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createAbstractType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createAbstractImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createBusType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createBusImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createDataImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createDeviceType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createDeviceImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createMemoryType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createMemoryImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createSubprogramType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createSubprogramImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createSubprogramGroupType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createSubprogramGroupImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createSystemType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createSystemImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createProcessorType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createProcessorImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createProcessType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createProcessImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createThreadType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createThreadImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createThreadGroupType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createThreadGroupImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createVirtualBusType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createVirtualBusImplementation()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createVirtualProcessorType()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_CLASSIFIER,
				Aadl2Factory.eINSTANCE.createVirtualProcessorImplementation()));

		newChildDescriptors
				.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME,
						Aadl2Factory.eINSTANCE.createFeatureGroupTypeRename()));

		newChildDescriptors.add(createChildParameter(Aadl2Package.Literals.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY,
				Aadl2Factory.eINSTANCE.createDefaultAnnexLibrary()));
	}

}
