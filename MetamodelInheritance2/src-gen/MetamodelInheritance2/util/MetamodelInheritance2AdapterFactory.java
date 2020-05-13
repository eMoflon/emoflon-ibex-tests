/**
 */
package MetamodelInheritance2.util;

import MetamodelInheritance.BaseContaineeA;
import MetamodelInheritance.BaseContaineeB;

import MetamodelInheritance2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MetamodelInheritance2.MetamodelInheritance2Package
 * @generated
 */
public class MetamodelInheritance2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelInheritance2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelInheritance2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodelInheritance2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelInheritance2Switch<Adapter> modelSwitch = new MetamodelInheritance2Switch<Adapter>() {
		@Override
		public Adapter caseChildA(ChildA object) {
			return createChildAAdapter();
		}

		@Override
		public Adapter caseChildB(ChildB object) {
			return createChildBAdapter();
		}

		@Override
		public Adapter caseChildContaineeD(ChildContaineeD object) {
			return createChildContaineeDAdapter();
		}

		@Override
		public Adapter caseBaseContaineeA(BaseContaineeA object) {
			return createBaseContaineeAAdapter();
		}

		@Override
		public Adapter caseBaseContaineeB(BaseContaineeB object) {
			return createBaseContaineeBAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelInheritance2.ChildA <em>Child A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelInheritance2.ChildA
	 * @generated
	 */
	public Adapter createChildAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelInheritance2.ChildB <em>Child B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelInheritance2.ChildB
	 * @generated
	 */
	public Adapter createChildBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelInheritance2.ChildContaineeD <em>Child Containee D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelInheritance2.ChildContaineeD
	 * @generated
	 */
	public Adapter createChildContaineeDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelInheritance.BaseContaineeA <em>Base Containee A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelInheritance.BaseContaineeA
	 * @generated
	 */
	public Adapter createBaseContaineeAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelInheritance.BaseContaineeB <em>Base Containee B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelInheritance.BaseContaineeB
	 * @generated
	 */
	public Adapter createBaseContaineeBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetamodelInheritance2AdapterFactory
