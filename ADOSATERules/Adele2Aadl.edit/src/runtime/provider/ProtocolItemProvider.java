/**
 */
package runtime.provider;

import Adele2Aadl.Adele2AadlFactory;

import Adele2Aadl.provider.Adele2AadlEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import runtime.Protocol;
import runtime.RuntimeFactory;
import runtime.RuntimePackage;

/**
 * This is the item provider adapter for a {@link runtime.Protocol} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(RuntimePackage.Literals.PROTOCOL__STEPS);
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
	 * This returns Protocol.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Protocol"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Protocol_type");
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

		switch (notification.getFeatureID(Protocol.class)) {
		case RuntimePackage.PROTOCOL__STEPS:
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

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				RuntimeFactory.eINSTANCE.createTGGRuleApplication()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createBusAccess2BusAccessRule__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createRuleAccessConn2AccessConnSrcSubcompoFeatDestSubcompoBus__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAadlPackage2AadlPublicPackageSection__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessRefinedSytemsAbsfeature__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessSystem__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentBusAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentRefined5__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentSubprogramAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentSubprogramGroupAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedData__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedRefined__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcParentDestSubcompo__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcParentDestSubcompoFeat__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS, Adele2AadlFactory.eINSTANCE
						.createruleAccessConn2AccessConnSrcParentDestSubcompoFeatSameAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoDestParent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoDestSubcompo11__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoDestSubcompoFeat12__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoFeatDestParent13__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS, Adele2AadlFactory.eINSTANCE
						.createruleAccessConn2AccessConnSrcSubcompoFeatDestParentSameAccess14__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoFeatDestSubcompo15__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS, Adele2AadlFactory.eINSTANCE
						.createruleAccessConn2AccessConnSrcSubcompoFeatDestSubcompoFeatAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationAbstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationData__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationDevice__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationProcess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationProcessor__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationSystem__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationThreadGroup__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationVirtualProcessor__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationWithExtendscomponent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeAbstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeBus__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeData__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeDevice__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeProcess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeProcessor__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeSubprogram__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeSubprogramGroup__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeSystem__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeThread__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeThreadGroup__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeVirtualBus__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeVirtualProcessor__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeWithExtends__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeWithExtendsSystem__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2Subcomponent21__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentRefinedConcreteTtt__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentRefinedTyped__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentRefinedTypedAsParent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTyped__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedAsParentRefinedTyped28__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedAsParentRefinedabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedAsParentabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedRefinedTyped30__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedRefinedTypedAsParent31__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedRefinedabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleComponentData2DataSubcomponent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcParentDestSubcompoSamePort__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcParentFeatGroupDestSubcompo__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcParentFeatGroupInverse__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS, Adele2AadlFactory.eINSTANCE
						.createruleDirFeatConn2DirFeatConnSrcParentFeatGroupInverseDestSubcompo__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcSubcompoDestParent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcSubcompoDestParentFeatGroup__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcSubcompoDestParentSamePort__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcSubcompoDestSubcompo44__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS, Adele2AadlFactory.eINSTANCE
						.createruleDirFeatConn2DirFeatConnSrcSubcompoDestSubcompoSamePort45__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirectedFeat2DirectedFeatRefinedAbstractFeature__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirectedFeat2DirectedFeatTyped34__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirectedFeat2DirectedFeatTypedRefined35__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleDirectedFeat2DirectedFeatabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupAccess2FeatGroupAccess46__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupAccess2FeatGroupAccessTyped__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupAccess2FeatGroupAccessTypedRefined__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeat__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeatRefined__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeatTyped__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeatTypedAsParent__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS, Adele2AadlFactory.eINSTANCE
						.createruleFeatGroupDirFeat2FeatGroupDirFeatTypedAsParentRefinedabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeatTypedRefinedabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatureGroup2FeatureGroupType56__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatureGroup2FeatureGroupTypeWithExtends57__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleFeatureGroup2FeatureGroupTypeWithInverse59__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createrulePackage2AadlPackage__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleSystem2AbsractDataPort__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleSystem2AbsractDataPortTest__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruleSystem2AbsractFeature__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruletest2test__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.PROTOCOL__STEPS,
				Adele2AadlFactory.eINSTANCE.createruletest2testextend__Marker()));
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
