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
 * This is the item provider adapter for a {@link Adele2Aadl.ruleComponent2ComponentImplementationDevice__Marker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ruleComponent2ComponentImplementationDevice__MarkerItemProvider extends TGGRuleApplicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ruleComponent2ComponentImplementationDevice__MarkerItemProvider(AdapterFactory adapterFactory) {
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

			addCREATE__SRC__adeleImplementationPropertyDescriptor(object);
			addCONTEXT__SRC__adelePackagePropertyDescriptor(object);
			addCONTEXT__SRC__adeleTypePropertyDescriptor(object);
			addCREATE__TRG__aadlImplementationPropertyDescriptor(object);
			addCONTEXT__TRG__aadlPublicPackageSectionPropertyDescriptor(object);
			addCREATE__TRG__aadlRealizationPropertyDescriptor(object);
			addCONTEXT__TRG__aadlTypePropertyDescriptor(object);
			addCONTEXT__CORR__corrAxiomOnePropertyDescriptor(object);
			addCREATE__CORR__corrImplementationPropertyDescriptor(object);
			addCREATE__CORR__corrImplementationRPropertyDescriptor(object);
			addCONTEXT__CORR__corrTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CREATE SRC adele Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__SRC__adeleImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__SRC__adeleImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__SRC__adeleImplementation_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CREATE__SRC__adeleImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adelePackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__SRC__adelePackage_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__SRC__adelePackage_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CONTEXT__SRC__adelePackage(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__SRC__adeleType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__SRC__adeleType_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CONTEXT__SRC__adeleType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG aadl Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__aadlImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__TRG__aadlImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__TRG__aadlImplementation_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CREATE__TRG__aadlImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Public Package Section feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlPublicPackageSectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__TRG__aadlPublicPackageSection_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__TRG__aadlPublicPackageSection_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CONTEXT__TRG__aadlPublicPackageSection(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG aadl Realization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__aadlRealizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__TRG__aadlRealization_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__TRG__aadlRealization_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CREATE__TRG__aadlRealization(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__TRG__aadlType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__TRG__aadlType_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CONTEXT__TRG__aadlType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Axiom One feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrAxiomOnePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__CORR__corrAxiomOne_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__CORR__corrAxiomOne_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CONTEXT__CORR__corrAxiomOne(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR corr Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__corrImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__CORR__corrImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__CORR__corrImplementation_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CREATE__CORR__corrImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR corr Implementation R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__corrImplementationRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__CORR__corrImplementationR_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CREATE__CORR__corrImplementationR_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CREATE__CORR__corrImplementationR(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__CORR__corrType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_CONTEXT__CORR__corrType_feature",
						"_UI_ruleComponent2ComponentImplementationDevice__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2ComponentImplementationDevice__Marker_CONTEXT__CORR__corrType(),
				true, false, true, null, null, null));
	}

	/**
	 * This returns ruleComponent2ComponentImplementationDevice__Marker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ruleComponent2ComponentImplementationDevice__Marker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ruleComponent2ComponentImplementationDevice__Marker_type");
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
