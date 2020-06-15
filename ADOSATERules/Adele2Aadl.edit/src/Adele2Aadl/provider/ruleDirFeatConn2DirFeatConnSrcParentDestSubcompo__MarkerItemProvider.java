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
 * This is the item provider adapter for a {@link Adele2Aadl.ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__MarkerItemProvider
		extends TGGRuleApplicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__MarkerItemProvider(AdapterFactory adapterFactory) {
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

			addCONTEXT__SRC__adeleCompImplTypePropertyDescriptor(object);
			addCONTEXT__SRC__adeleComponentFeaturePropertyDescriptor(object);
			addCONTEXT__SRC__adeleComponentImplementationPropertyDescriptor(object);
			addCREATE__SRC__adeleConnectionPropertyDescriptor(object);
			addCONTEXT__SRC__adeleSubcomponentPropertyDescriptor(object);
			addCONTEXT__SRC__adeleSubcomponentPortPropertyDescriptor(object);
			addCONTEXT__TRG__aadlCompImplTypePropertyDescriptor(object);
			addCONTEXT__TRG__aadlComponentFeaturePropertyDescriptor(object);
			addCONTEXT__TRG__aadlComponentImplementationPropertyDescriptor(object);
			addCREATE__TRG__aadlConnectionPropertyDescriptor(object);
			addCONTEXT__TRG__aadlSubcomponentPropertyDescriptor(object);
			addCONTEXT__TRG__aadlSubcomponentFeaturePropertyDescriptor(object);
			addCREATE__TRG__destinationConnectedElementPropertyDescriptor(object);
			addCREATE__TRG__sourceConnectedElementPropertyDescriptor(object);
			addCONTEXT__CORR__corrComponentFeaturePropertyDescriptor(object);
			addCONTEXT__CORR__corrComponentImplementationPropertyDescriptor(object);
			addCONTEXT__CORR__corrComponentTypePropertyDescriptor(object);
			addCREATE__CORR__corrConnectionPropertyDescriptor(object);
			addCONTEXT__CORR__corrSubcomponentPropertyDescriptor(object);
			addCONTEXT__CORR__corrSubcomponentFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Comp Impl Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleCompImplTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleCompImplType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleCompImplType_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleCompImplType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Component Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleComponentFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleComponentFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleComponentFeature_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleComponentFeature(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Component Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleComponentImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleComponentImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleComponentImplementation_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleComponentImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE SRC adele Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__SRC__adeleConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__SRC__adeleConnection_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__SRC__adeleConnection_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__SRC__adeleConnection(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleSubcomponent_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleSubcomponent(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT SRC adele Subcomponent Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__SRC__adeleSubcomponentPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleSubcomponentPort_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleSubcomponentPort_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__SRC__adeleSubcomponentPort(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Comp Impl Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlCompImplTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlCompImplType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlCompImplType_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlCompImplType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Component Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlComponentFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlComponentFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlComponentFeature_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlComponentFeature(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Component Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlComponentImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlComponentImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlComponentImplementation_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlComponentImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG aadl Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__aadlConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__aadlConnection_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__aadlConnection_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__aadlConnection(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlSubcomponent_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlSubcomponent(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT TRG aadl Subcomponent Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__TRG__aadlSubcomponentFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlSubcomponentFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlSubcomponentFeature_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__TRG__aadlSubcomponentFeature(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG destination Connected Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__destinationConnectedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__destinationConnectedElement_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__destinationConnectedElement_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__destinationConnectedElement(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE TRG source Connected Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__TRG__sourceConnectedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__sourceConnectedElement_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__sourceConnectedElement_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__TRG__sourceConnectedElement(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Component Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrComponentFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentFeature_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentFeature(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Component Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrComponentImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentImplementation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentImplementation_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentImplementation(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Component Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrComponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentType_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrComponentType(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CREATE CORR corr Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCREATE__CORR__corrConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__CORR__corrConnection_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__CORR__corrConnection_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CREATE__CORR__corrConnection(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Subcomponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrSubcomponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrSubcomponent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrSubcomponent_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrSubcomponent(),
				true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the CONTEXT CORR corr Subcomponent Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTEXT__CORR__corrSubcomponentFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString(
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrSubcomponentFeature_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrSubcomponentFeature_feature",
						"_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type"),
				Adele2AadlPackage.eINSTANCE
						.getruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_CONTEXT__CORR__corrSubcomponentFeature(),
				true, false, true, null, null, null));
	}

	/**
	 * This returns ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker_type");
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
