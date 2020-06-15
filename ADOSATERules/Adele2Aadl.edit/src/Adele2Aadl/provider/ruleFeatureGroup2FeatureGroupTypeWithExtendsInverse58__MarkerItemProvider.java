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
 * This is the item provider adapter for a {@link Adele2Aadl.ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__MarkerItemProvider
		extends TGGRuleApplicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__MarkerItemProvider(AdapterFactory adapterFactory) {
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

			addCONTEXT__SRC__adeleExtTypePropertyDescriptor(object);
			addCONTEXT__SRC__adeleInversePropertyDescriptor(object);
			addCONTEXT__SRC__adelePackagePropertyDescriptor(object);
			addCREATE__SRC__adeleTypePropertyDescriptor(object);
			addCONTEXT__TRG__aadlExtTypePropertyDescriptor(object);
			addCONTEXT__TRG__aadlInversePropertyDescriptor(object);
			addCONTEXT__TRG__aadlPublicPackageSectionPropertyDescriptor(object);
			addCREATE__TRG__aadlTypePropertyDescriptor(object);
			addCREATE__TRG__typeExtensionPropertyDescriptor(object);
			addCONTEXT__CORR__corrAxiomPropertyDescriptor(object);
			addCONTEXT__CORR__corrExtComponentTypePropertyDescriptor(object);
			addCONTEXT__CORR__corrInversePropertyDescriptor(object);
			addCREATE__CORR__corrTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Ext Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleExtTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adeleExtType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adeleExtType_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adeleExtType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Inverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleInversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adeleInverse_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adeleInverse_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adeleInverse(),
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
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adelePackage_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adelePackage_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__SRC__adelePackage(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE SRC adele Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__SRC__adeleTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__SRC__adeleType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__SRC__adeleType_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__SRC__adeleType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Ext Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlExtTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlExtType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlExtType_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlExtType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Inverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlInversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlInverse_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlInverse_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlInverse(),
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
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlPublicPackageSection_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlPublicPackageSection_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__TRG__aadlPublicPackageSection(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG aadl Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__aadlTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__TRG__aadlType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__TRG__aadlType_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__TRG__aadlType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG type Extension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__typeExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__TRG__typeExtension_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__TRG__typeExtension_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__TRG__typeExtension(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Axiom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrAxiomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrAxiom_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrAxiom_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrAxiom(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Ext Component Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrExtComponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrExtComponentType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrExtComponentType_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrExtComponentType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Inverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrInversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrInverse_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrInverse_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CONTEXT__CORR__corrInverse(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR corr Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__corrTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__CORR__corrType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__CORR__corrType_feature",
						"_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_CREATE__CORR__corrType(),
				true, false, true, null, null, null));
	}

	/**
	 * This returns ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator()
				.getImage("full/obj16/ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker_type");
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
