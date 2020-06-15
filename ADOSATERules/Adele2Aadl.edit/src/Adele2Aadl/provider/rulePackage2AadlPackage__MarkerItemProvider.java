/**
 */
package Adele2Aadl.provider;

import Adele2Aadl.Adele2AadlPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import runtime.provider.TGGRuleApplicationItemProvider;

/**
 * This is the item provider adapter for a {@link Adele2Aadl.rulePackage2AadlPackage__Marker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class rulePackage2AadlPackage__MarkerItemProvider extends TGGRuleApplicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rulePackage2AadlPackage__MarkerItemProvider(AdapterFactory adapterFactory) {
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

			addCREATE__SRC__adelePackagePropertyDescriptor(object);
			addCREATE__TRG__aadlPackagePropertyDescriptor(object);
			addCREATE__TRG__aadlPublicPackageSectionPropertyDescriptor(object);
			addCREATE__CORR__corrAxiomPropertyDescriptor(object);
			addCREATE__CORR__corrAxiomOnePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CREATE SRC adele Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__SRC__adelePackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_rulePackage2AadlPackage__Marker_CREATE__SRC__adelePackage_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_rulePackage2AadlPackage__Marker_CREATE__SRC__adelePackage_feature",
						"_UI_rulePackage2AadlPackage__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getrulePackage2AadlPackage__Marker_CREATE__SRC__adelePackage(), true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG aadl Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__aadlPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_rulePackage2AadlPackage__Marker_CREATE__TRG__aadlPackage_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_rulePackage2AadlPackage__Marker_CREATE__TRG__aadlPackage_feature",
						"_UI_rulePackage2AadlPackage__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getrulePackage2AadlPackage__Marker_CREATE__TRG__aadlPackage(), true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG aadl Public Package Section feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__aadlPublicPackageSectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_rulePackage2AadlPackage__Marker_CREATE__TRG__aadlPublicPackageSection_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_rulePackage2AadlPackage__Marker_CREATE__TRG__aadlPublicPackageSection_feature",
						"_UI_rulePackage2AadlPackage__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getrulePackage2AadlPackage__Marker_CREATE__TRG__aadlPublicPackageSection(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR corr Axiom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__corrAxiomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_rulePackage2AadlPackage__Marker_CREATE__CORR__corrAxiom_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_rulePackage2AadlPackage__Marker_CREATE__CORR__corrAxiom_feature",
						"_UI_rulePackage2AadlPackage__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getrulePackage2AadlPackage__Marker_CREATE__CORR__corrAxiom(), true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR corr Axiom One feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__corrAxiomOnePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_rulePackage2AadlPackage__Marker_CREATE__CORR__corrAxiomOne_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_rulePackage2AadlPackage__Marker_CREATE__CORR__corrAxiomOne_feature",
						"_UI_rulePackage2AadlPackage__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getrulePackage2AadlPackage__Marker_CREATE__CORR__corrAxiomOne(), true,
				false, true, null, null, null));
	}

	/**
	 * This returns rulePackage2AadlPackage__Marker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/rulePackage2AadlPackage__Marker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_rulePackage2AadlPackage__Marker_type");
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
