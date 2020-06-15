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
 * This is the item provider adapter for a {@link Adele2Aadl.ruleComponent2SubcomponentTyped__Marker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ruleComponent2SubcomponentTyped__MarkerItemProvider extends TGGRuleApplicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ruleComponent2SubcomponentTyped__MarkerItemProvider(AdapterFactory adapterFactory) {
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

			addCONTEXT__SRC__adeleImplementationPropertyDescriptor(object);
			addCREATE__SRC__adeleSubcomponentPropertyDescriptor(object);
			addCONTEXT__SRC__adeleSubcomponentImplPropertyDescriptor(object);
			addCONTEXT__TRG__aadlImplementationPropertyDescriptor(object);
			addCREATE__TRG__aadlSubcomponentPropertyDescriptor(object);
			addCONTEXT__TRG__aadlSubcomponentTypePropertyDescriptor(object);
			addCONTEXT__CORR__corrImplementationPropertyDescriptor(object);
			addCREATE__CORR__corrSubcomponentPropertyDescriptor(object);
			addCONTEXT__CORR__corrSubcomponentTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__SRC__adeleImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__SRC__adeleImplementation_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2SubcomponentTyped__Marker_CONTEXT__SRC__adeleImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE SRC adele Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__SRC__adeleSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CREATE__SRC__adeleSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CREATE__SRC__adeleSubcomponent_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleComponent2SubcomponentTyped__Marker_CREATE__SRC__adeleSubcomponent(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Subcomponent Impl feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleSubcomponentImplPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__SRC__adeleSubcomponentImpl_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__SRC__adeleSubcomponentImpl_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2SubcomponentTyped__Marker_CONTEXT__SRC__adeleSubcomponentImpl(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__TRG__aadlImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__TRG__aadlImplementation_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2SubcomponentTyped__Marker_CONTEXT__TRG__aadlImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG aadl Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__aadlSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CREATE__TRG__aadlSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CREATE__TRG__aadlSubcomponent_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleComponent2SubcomponentTyped__Marker_CREATE__TRG__aadlSubcomponent(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Subcomponent Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlSubcomponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__TRG__aadlSubcomponentType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__TRG__aadlSubcomponentType_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2SubcomponentTyped__Marker_CONTEXT__TRG__aadlSubcomponentType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__CORR__corrImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__CORR__corrImplementation_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2SubcomponentTyped__Marker_CONTEXT__CORR__corrImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR corr Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__corrSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CREATE__CORR__corrSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CREATE__CORR__corrSubcomponent_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleComponent2SubcomponentTyped__Marker_CREATE__CORR__corrSubcomponent(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Subcomponent Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrSubcomponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__CORR__corrSubcomponentType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleComponent2SubcomponentTyped__Marker_CONTEXT__CORR__corrSubcomponentType_feature",
						"_UI_ruleComponent2SubcomponentTyped__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleComponent2SubcomponentTyped__Marker_CONTEXT__CORR__corrSubcomponentType(),
				true, false, true, null, null, null));
	}

	/**
	 * This returns ruleComponent2SubcomponentTyped__Marker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ruleComponent2SubcomponentTyped__Marker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ruleComponent2SubcomponentTyped__Marker_type");
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
