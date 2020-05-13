/**
 */
package MetamodelInheritance3.util;

import MetamodelInheritance.BaseContaineeC;

import MetamodelInheritance2.ChildContaineeD;

import MetamodelInheritance3.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MetamodelInheritance3.MetamodelInheritance3Package
 * @generated
 */
public class MetamodelInheritance3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelInheritance3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelInheritance3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodelInheritance3Package.eINSTANCE;
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
	protected MetamodelInheritance3Switch<Adapter> modelSwitch = new MetamodelInheritance3Switch<Adapter>() {
		@Override
		public Adapter caseChildC(ChildC object) {
			return createChildCAdapter();
		}

		@Override
		public Adapter caseChildD(ChildD object) {
			return createChildDAdapter();
		}

		@Override
		public Adapter caseBaseContaineeC(BaseContaineeC object) {
			return createBaseContaineeCAdapter();
		}

		@Override
		public Adapter caseChildContaineeD(ChildContaineeD object) {
			return createChildContaineeDAdapter();
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
	 * Creates a new adapter for an object of class '{@link MetamodelInheritance3.ChildC <em>Child C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelInheritance3.ChildC
	 * @generated
	 */
	public Adapter createChildCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelInheritance3.ChildD <em>Child D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelInheritance3.ChildD
	 * @generated
	 */
	public Adapter createChildDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MetamodelInheritance.BaseContaineeC <em>Base Containee C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MetamodelInheritance.BaseContaineeC
	 * @generated
	 */
	public Adapter createBaseContaineeCAdapter() {
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

} //MetamodelInheritance3AdapterFactory
