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
 * This is the item provider adapter for a {@link Adele2Aadl.ruleSystem2AbsractDataPort__Marker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ruleSystem2AbsractDataPort__MarkerItemProvider extends TGGRuleApplicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ruleSystem2AbsractDataPort__MarkerItemProvider(AdapterFactory adapterFactory) {
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

			addCREATE__SRC__adeleFeaturePropertyDescriptor(object);
			addCONTEXT__SRC__adeleTypePropertyDescriptor(object);
			addCREATE__TRG__aadlFeaturePropertyDescriptor(object);
			addCONTEXT__TRG__aadlTypePropertyDescriptor(object);
			addCREATE__CORR__corrFeaturePropertyDescriptor(object);
			addCONTEXT__CORR__corrTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CREATE SRC adele Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__SRC__adeleFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleSystem2AbsractDataPort__Marker_CREATE__SRC__adeleFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleSystem2AbsractDataPort__Marker_CREATE__SRC__adeleFeature_feature",
						"_UI_ruleSystem2AbsractDataPort__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleSystem2AbsractDataPort__Marker_CREATE__SRC__adeleFeature(), true,
				false, true, null, null, null));
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
				getString("_UI_ruleSystem2AbsractDataPort__Marker_CONTEXT__SRC__adeleType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleSystem2AbsractDataPort__Marker_CONTEXT__SRC__adeleType_feature",
						"_UI_ruleSystem2AbsractDataPort__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleSystem2AbsractDataPort__Marker_CONTEXT__SRC__adeleType(), true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG aadl Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__aadlFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleSystem2AbsractDataPort__Marker_CREATE__TRG__aadlFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleSystem2AbsractDataPort__Marker_CREATE__TRG__aadlFeature_feature",
						"_UI_ruleSystem2AbsractDataPort__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleSystem2AbsractDataPort__Marker_CREATE__TRG__aadlFeature(), true,
				false, true, null, null, null));
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
				getString("_UI_ruleSystem2AbsractDataPort__Marker_CONTEXT__TRG__aadlType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleSystem2AbsractDataPort__Marker_CONTEXT__TRG__aadlType_feature",
						"_UI_ruleSystem2AbsractDataPort__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleSystem2AbsractDataPort__Marker_CONTEXT__TRG__aadlType(), true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR corr Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__corrFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ruleSystem2AbsractDataPort__Marker_CREATE__CORR__corrFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleSystem2AbsractDataPort__Marker_CREATE__CORR__corrFeature_feature",
						"_UI_ruleSystem2AbsractDataPort__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleSystem2AbsractDataPort__Marker_CREATE__CORR__corrFeature(), true,
				false, true, null, null, null));
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
				getString("_UI_ruleSystem2AbsractDataPort__Marker_CONTEXT__CORR__corrType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleSystem2AbsractDataPort__Marker_CONTEXT__CORR__corrType_feature",
						"_UI_ruleSystem2AbsractDataPort__Marker_type"),
				Adele2AadlPackage.eINSTANCE.getruleSystem2AbsractDataPort__Marker_CONTEXT__CORR__corrType(), true,
				false, true, null, null, null));
	}

	/**
	 * This returns ruleSystem2AbsractDataPort__Marker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ruleSystem2AbsractDataPort__Marker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ruleSystem2AbsractDataPort__Marker_type");
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
