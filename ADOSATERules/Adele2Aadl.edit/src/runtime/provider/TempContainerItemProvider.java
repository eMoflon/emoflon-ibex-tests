/**
 */
package runtime.provider;

import ADELE_Components.ADELE_ComponentsFactory;

import ADELE_Features.ADELE_FeaturesFactory;

import ADELE_Relations.ADELE_RelationsFactory;

import Adele2Aadl.Adele2AadlFactory;

import Adele2Aadl.provider.Adele2AadlEditPlugin;

import KernelSpices.KernelSpicesFactory;

import ObjectDescriptionModel.ObjectDescriptionModelFactory;

import aadl2.Aadl2Factory;

import ba_relations.Ba_relationsFactory;

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

import runtime.RuntimeFactory;
import runtime.RuntimePackage;
import runtime.TempContainer;

/**
 * This is the item provider adapter for a {@link runtime.TempContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TempContainerItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempContainerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS);
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
	 * This returns TempContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TempContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TempContainer_type");
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

		switch (notification.getFeatureID(TempContainer.class)) {
		case RuntimePackage.TEMP_CONTAINER__OBJECTS:
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

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				RuntimeFactory.eINSTANCE.createProtocol()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				RuntimeFactory.eINSTANCE.createTGGRuleApplication()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				RuntimeFactory.eINSTANCE.createTempContainer()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentTypeTE()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentTypeFG()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentTypeGE()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrFeature()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentSCT()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentSKC()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentDST()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentImplementationR()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrComponentImplementationIE()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrAccessConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrAccessConnectionttrgCE()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrSubcomponenttrgSC()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrAxiomPPS()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrAxiomAP()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrDirectedFeature()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrDirectedFeatureFG()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrDirectedFeatureConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createCorrDirectedFeatureConnectionCE()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createBusAccess2BusAccessRule__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createRuleAccessConn2AccessConnSrcSubcompoFeatDestSubcompoBus__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAadlPackage2AadlPublicPackageSection__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessRefinedSytemsAbsfeature__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessSystem__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentBusAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentRefined5__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentSubprogramAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentSubprogramGroupAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedAsParentabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedData__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccess2AccessTypedRefined__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcParentDestSubcompo__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcParentDestSubcompoFeat__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS, Adele2AadlFactory.eINSTANCE
						.createruleAccessConn2AccessConnSrcParentDestSubcompoFeatSameAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoDestParent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoDestSubcompo11__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoDestSubcompoFeat12__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoFeatDestParent13__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS, Adele2AadlFactory.eINSTANCE
						.createruleAccessConn2AccessConnSrcSubcompoFeatDestParentSameAccess14__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleAccessConn2AccessConnSrcSubcompoFeatDestSubcompo15__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS, Adele2AadlFactory.eINSTANCE
						.createruleAccessConn2AccessConnSrcSubcompoFeatDestSubcompoFeatAccess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationAbstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationData__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationDevice__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationProcess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationProcessor__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationSystem__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationThreadGroup__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationVirtualProcessor__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentImplementationWithExtendscomponent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeAbstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeBus__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeData__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeDevice__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeProcess__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeProcessor__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeSubprogram__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeSubprogramGroup__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeSystem__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeThread__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeThreadGroup__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeVirtualBus__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeVirtualProcessor__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeWithExtends__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2ComponentTypeWithExtendsSystem__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2Subcomponent21__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentRefinedConcreteTtt__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentRefinedTyped__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentRefinedTypedAsParent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTyped__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedAsParentRefinedTyped28__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedAsParentRefinedabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedAsParentabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedRefinedTyped30__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedRefinedTypedAsParent31__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponent2SubcomponentTypedRefinedabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleComponentData2DataSubcomponent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcParentDestSubcompo__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcParentDestSubcompoSamePort__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcParentFeatGroupDestSubcompo__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcParentFeatGroupInverse__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS, Adele2AadlFactory.eINSTANCE
						.createruleDirFeatConn2DirFeatConnSrcParentFeatGroupInverseDestSubcompo__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcSubcompoDestParent__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcSubcompoDestParentFeatGroup__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcSubcompoDestParentSamePort__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirFeatConn2DirFeatConnSrcSubcompoDestSubcompo44__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS, Adele2AadlFactory.eINSTANCE
						.createruleDirFeatConn2DirFeatConnSrcSubcompoDestSubcompoSamePort45__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirectedFeat2DirectedFeatRefinedAbstractFeature__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirectedFeat2DirectedFeatTyped34__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirectedFeat2DirectedFeatTypedRefined35__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleDirectedFeat2DirectedFeatabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupAccess2FeatGroupAccess46__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupAccess2FeatGroupAccessTyped__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupAccess2FeatGroupAccessTypedRefined__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeat__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeatRefined__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeatTyped__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeatTypedAsParent__Marker()));

		newChildDescriptors
				.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS, Adele2AadlFactory.eINSTANCE
						.createruleFeatGroupDirFeat2FeatGroupDirFeatTypedAsParentRefinedabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatGroupDirFeat2FeatGroupDirFeatTypedRefinedabstract__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatureGroup2FeatureGroupType56__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatureGroup2FeatureGroupTypeWithExtends57__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleFeatureGroup2FeatureGroupTypeWithInverse59__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createrulePackage2AadlPackage__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleSystem2AbsractDataPort__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleSystem2AbsractDataPortTest__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruleSystem2AbsractFeature__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruletest2test__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Adele2AadlFactory.eINSTANCE.createruletest2testextend__Marker()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createBus()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createData()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createSubprogram()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createThread()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createThreadGroup()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createSubprogramGroup()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createAbstract()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createVirtualProcessor()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_ComponentsFactory.eINSTANCE.createVirtualBus()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPropertyAssociation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createBasicProperty()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createMetaclassReference()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createModalElement()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createMode()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createContainedNamedElement()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createContainmentPathElement()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createArrayRange()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createModalPropertyValue()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createArrayDimension()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createArraySize()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createComponentImplementationReference()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createModeTransition()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createModeTransitionTrigger()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFlowSpecification()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFlowEnd()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createTypeExtension()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeatureGroup()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeatureGroupType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createGroupExtension()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createBusAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDataAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDataPort()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createEventDataPort()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createEventPort()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramGroupAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAbstractFeature()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeaturePrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeatureGroupPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createModeBinding()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFlowImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFlowSegment()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createConnectedElement()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createImplementationExtension()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createRealization()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createEndToEndFlow()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createEndToEndFlowSegment()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAbstractSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAccessConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createParameterConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPortConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeatureConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeatureGroupConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createEventSource()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createEventDataSource()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPortProxy()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramProxy()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDefaultAnnexLibrary()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDefaultAnnexSubclause()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPublicPackageSection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPackageRename()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAadlPackage()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPrivatePackageSection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createComponentTypeRename()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeatureGroupTypeRename()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createComponentPrototypeBinding()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createComponentPrototypeActual()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeatureGroupPrototypeBinding()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeatureGroupPrototypeActual()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeaturePrototypeBinding()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAccessSpecification()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPortSpecification()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createFeaturePrototypeReference()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramCallSequence()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramCall()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAbstractType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAbstractImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createBusSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDataSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDeviceSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createMemorySubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProcessSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProcessorSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSystemSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramGroupSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createThreadSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createThreadGroupSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createVirtualBusSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createVirtualProcessorSubcomponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAbstractPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createBusType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createBusImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createBusPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDataType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDataImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDataPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDeviceType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDeviceImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createDevicePrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createMemoryType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createMemoryImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createMemoryPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramGroupType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramGroupImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSubprogramGroupPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSystemType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSystemImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createSystemPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProcessorType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProcessorImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProcessorPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProcessType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProcessImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createProcessPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createThreadType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createThreadImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createThreadPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createThreadGroupType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createThreadGroupImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createThreadGroupPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createVirtualBusType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createVirtualBusImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createVirtualBusPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createVirtualProcessorType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createVirtualProcessorImplementation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createVirtualProcessorPrototype()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createBasicPropertyAssociation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPropertyConstant()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createUnitLiteral()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createClassifierValue()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createReferenceValue()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createRangeValue()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createRecordValue()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createComputedValue()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createListValue()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createNamedValue()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createPropertySet()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createGlobalNamespace()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAadlBoolean()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAadlString()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAadlInteger()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createUnitsType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createNumericRange()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createAadlReal()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createClassifierType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createRangeType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createRecordType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createRecordField()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Aadl2Factory.eINSTANCE.createListType()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createBusAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createDataAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createSubprogramAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createSubprogramGroupAccess()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createFeatureGroup()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createEventPort()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createDataPort()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createEventDataPort()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_FeaturesFactory.eINSTANCE.createAbstractFeature()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				KernelSpicesFactory.eINSTANCE.createSKComponent()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				KernelSpicesFactory.eINSTANCE.createSKFeature()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				KernelSpicesFactory.eINSTANCE.createSKRelation()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				KernelSpicesFactory.eINSTANCE.createSKProperty()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createBusAccessConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createDataAccessConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createSubprogramAccessConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createSubprogramGroupAccessConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createEventPortConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createDataPortConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createEventDataPortConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createParameterConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createAbstractFeatureConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ADELE_RelationsFactory.eINSTANCE.createFeatureGroupConnection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				Ba_relationsFactory.eINSTANCE.createBATransition()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ObjectDescriptionModelFactory.eINSTANCE.createSKODSection()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ObjectDescriptionModelFactory.eINSTANCE.createSKODSystem()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ObjectDescriptionModelFactory.eINSTANCE.createSKODSFactory()));

		newChildDescriptors.add(createChildParameter(RuntimePackage.Literals.TEMP_CONTAINER__OBJECTS,
				ObjectDescriptionModelFactory.eINSTANCE.createSKODData()));
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
