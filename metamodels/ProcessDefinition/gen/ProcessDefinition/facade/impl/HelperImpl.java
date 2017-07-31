/**
 */
package ProcessDefinition.facade.impl;

import ProcessDefinition.Task;

import ProcessDefinition.facade.FacadePackage;
import ProcessDefinition.facade.Helper;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProcessDefinition.facade.impl.HelperImpl#getColoredTask <em>Colored Task</em>}</li>
 *   <li>{@link ProcessDefinition.facade.impl.HelperImpl#getVisitedTasks <em>Visited Tasks</em>}</li>
 *   <li>{@link ProcessDefinition.facade.impl.HelperImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HelperImpl extends EObjectImpl implements Helper {
	/**
	 * The cached value of the '{@link #getColoredTask() <em>Colored Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColoredTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> coloredTask;

	/**
	 * The cached value of the '{@link #getVisitedTasks() <em>Visited Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> visitedTasks;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacadePackage.Literals.HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getColoredTask() {
		if (coloredTask == null) {
			coloredTask = new EObjectResolvingEList<Task>(Task.class, this, FacadePackage.HELPER__COLORED_TASK);
		}
		return coloredTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getVisitedTasks() {
		if (visitedTasks == null) {
			visitedTasks = new EObjectResolvingEList<Task>(Task.class, this, FacadePackage.HELPER__VISITED_TASKS);
		}
		return visitedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, FacadePackage.HELPER__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void outputCycle(Task currentTask) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void print(String message) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FacadePackage.HELPER__COLORED_TASK:
			return getColoredTask();
		case FacadePackage.HELPER__VISITED_TASKS:
			return getVisitedTasks();
		case FacadePackage.HELPER__TASKS:
			return getTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FacadePackage.HELPER__COLORED_TASK:
			getColoredTask().clear();
			getColoredTask().addAll((Collection<? extends Task>) newValue);
			return;
		case FacadePackage.HELPER__VISITED_TASKS:
			getVisitedTasks().clear();
			getVisitedTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case FacadePackage.HELPER__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FacadePackage.HELPER__COLORED_TASK:
			getColoredTask().clear();
			return;
		case FacadePackage.HELPER__VISITED_TASKS:
			getVisitedTasks().clear();
			return;
		case FacadePackage.HELPER__TASKS:
			getTasks().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FacadePackage.HELPER__COLORED_TASK:
			return coloredTask != null && !coloredTask.isEmpty();
		case FacadePackage.HELPER__VISITED_TASKS:
			return visitedTasks != null && !visitedTasks.isEmpty();
		case FacadePackage.HELPER__TASKS:
			return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case FacadePackage.HELPER___OUTPUT_CYCLE__TASK:
			outputCycle((Task) arguments.get(0));
			return null;
		case FacadePackage.HELPER___PRINT__STRING:
			print((String) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HelperImpl
