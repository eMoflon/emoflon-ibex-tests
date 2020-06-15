/**
 */
package Java2Doc.provider;

import Java2Doc.Java2DocPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import runtime.provider.TGGRuleApplicationItemProvider;

/**
 * This is the item provider adapter for a {@link Java2Doc.Sub2SubRule__Marker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Sub2SubRule__MarkerItemProvider extends TGGRuleApplicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sub2SubRule__MarkerItemProvider(AdapterFactory adapterFactory) {
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

			addCONTEXT__SRC__pPropertyDescriptor(object);
			addCREATE__SRC__subPPropertyDescriptor(object);
			addCREATE__TRG__docPropertyDescriptor(object);
			addCONTEXT__TRG__fPropertyDescriptor(object);
			addCREATE__TRG__subFPropertyDescriptor(object);
			addCONTEXT__CORR__p2fPropertyDescriptor(object);
			addCREATE__CORR__sp2sfPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC p feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__pPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Sub2SubRule__Marker_CONTEXT__SRC__p_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Sub2SubRule__Marker_CONTEXT__SRC__p_feature",
						"_UI_Sub2SubRule__Marker_type"),
				Java2DocPackage.Literals.SUB2_SUB_RULE_MARKER__CONTEXT_SRC_P, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE SRC sub P feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__SRC__subPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Sub2SubRule__Marker_CREATE__SRC__subP_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Sub2SubRule__Marker_CREATE__SRC__subP_feature",
						"_UI_Sub2SubRule__Marker_type"),
				Java2DocPackage.Literals.SUB2_SUB_RULE_MARKER__CREATE_SRC_SUB_P, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG doc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__docPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Sub2SubRule__Marker_CREATE__TRG__doc_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Sub2SubRule__Marker_CREATE__TRG__doc_feature",
						"_UI_Sub2SubRule__Marker_type"),
				Java2DocPackage.Literals.SUB2_SUB_RULE_MARKER__CREATE_TRG_DOC, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG f feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__fPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Sub2SubRule__Marker_CONTEXT__TRG__f_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Sub2SubRule__Marker_CONTEXT__TRG__f_feature",
						"_UI_Sub2SubRule__Marker_type"),
				Java2DocPackage.Literals.SUB2_SUB_RULE_MARKER__CONTEXT_TRG_F, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG sub F feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__subFPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Sub2SubRule__Marker_CREATE__TRG__subF_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Sub2SubRule__Marker_CREATE__TRG__subF_feature",
						"_UI_Sub2SubRule__Marker_type"),
				Java2DocPackage.Literals.SUB2_SUB_RULE_MARKER__CREATE_TRG_SUB_F, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR p2f feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__p2fPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Sub2SubRule__Marker_CONTEXT__CORR__p2f_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Sub2SubRule__Marker_CONTEXT__CORR__p2f_feature",
						"_UI_Sub2SubRule__Marker_type"),
				Java2DocPackage.Literals.SUB2_SUB_RULE_MARKER__CONTEXT_CORR_P2F, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR sp2sf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__sp2sfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Sub2SubRule__Marker_CREATE__CORR__sp2sf_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Sub2SubRule__Marker_CREATE__CORR__sp2sf_feature",
						"_UI_Sub2SubRule__Marker_type"),
				Java2DocPackage.Literals.SUB2_SUB_RULE_MARKER__CREATE_CORR_SP2SF, true, false, true, null, null, null));
	}

	/**
	 * This returns Sub2SubRule__Marker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sub2SubRule__Marker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Sub2SubRule__Marker_type");
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
		return Java2DocEditPlugin.INSTANCE;
	}

}
