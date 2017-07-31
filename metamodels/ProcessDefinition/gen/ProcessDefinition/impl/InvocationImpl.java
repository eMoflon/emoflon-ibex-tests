/**
 */
package ProcessDefinition.impl;

import ProcessDefinition.Invocation;
import ProcessDefinition.ProcessDefinitionPackage;
import ProcessDefinition.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProcessDefinition.impl.InvocationImpl#getTask <em>Task</em>}</li>
 *   <li>{@link ProcessDefinition.impl.InvocationImpl#getInvokedTask <em>Invoked Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvocationImpl extends EObjectImpl implements Invocation {
	/**
	 * The cached value of the '{@link #getInvokedTask() <em>Invoked Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedTask()
	 * @generated
	 * @ordered
	 */
	protected Task invokedTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessDefinitionPackage.Literals.INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (eContainerFeatureID() != ProcessDefinitionPackage.INVOCATION__TASK)
			return null;
		return (Task) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTask, ProcessDefinitionPackage.INVOCATION__TASK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != eInternalContainer()
				|| (eContainerFeatureID() != ProcessDefinitionPackage.INVOCATION__TASK && newTask != null)) {
			if (EcoreUtil.isAncestor(this, newTask))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTask != null)
				msgs = ((InternalEObject) newTask).eInverseAdd(this, ProcessDefinitionPackage.TASK__INVOCATIONS,
						Task.class, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.INVOCATION__TASK, newTask,
					newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getInvokedTask() {
		if (invokedTask != null && invokedTask.eIsProxy()) {
			InternalEObject oldInvokedTask = (InternalEObject) invokedTask;
			invokedTask = (Task) eResolveProxy(oldInvokedTask);
			if (invokedTask != oldInvokedTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProcessDefinitionPackage.INVOCATION__INVOKED_TASK, oldInvokedTask, invokedTask));
			}
		}
		return invokedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetInvokedTask() {
		return invokedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvokedTask(Task newInvokedTask, NotificationChain msgs) {
		Task oldInvokedTask = invokedTask;
		invokedTask = newInvokedTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProcessDefinitionPackage.INVOCATION__INVOKED_TASK, oldInvokedTask, newInvokedTask);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokedTask(Task newInvokedTask) {
		if (newInvokedTask != invokedTask) {
			NotificationChain msgs = null;
			if (invokedTask != null)
				msgs = ((InternalEObject) invokedTask).eInverseRemove(this, ProcessDefinitionPackage.TASK__INVOCATION,
						Task.class, msgs);
			if (newInvokedTask != null)
				msgs = ((InternalEObject) newInvokedTask).eInverseAdd(this, ProcessDefinitionPackage.TASK__INVOCATION,
						Task.class, msgs);
			msgs = basicSetInvokedTask(newInvokedTask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.INVOCATION__INVOKED_TASK,
					newInvokedTask, newInvokedTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProcessDefinitionPackage.INVOCATION__TASK:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTask((Task) otherEnd, msgs);
		case ProcessDefinitionPackage.INVOCATION__INVOKED_TASK:
			if (invokedTask != null)
				msgs = ((InternalEObject) invokedTask).eInverseRemove(this, ProcessDefinitionPackage.TASK__INVOCATION,
						Task.class, msgs);
			return basicSetInvokedTask((Task) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProcessDefinitionPackage.INVOCATION__TASK:
			return basicSetTask(null, msgs);
		case ProcessDefinitionPackage.INVOCATION__INVOKED_TASK:
			return basicSetInvokedTask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ProcessDefinitionPackage.INVOCATION__TASK:
			return eInternalContainer().eInverseRemove(this, ProcessDefinitionPackage.TASK__INVOCATIONS, Task.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProcessDefinitionPackage.INVOCATION__TASK:
			return getTask();
		case ProcessDefinitionPackage.INVOCATION__INVOKED_TASK:
			if (resolve)
				return getInvokedTask();
			return basicGetInvokedTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProcessDefinitionPackage.INVOCATION__TASK:
			setTask((Task) newValue);
			return;
		case ProcessDefinitionPackage.INVOCATION__INVOKED_TASK:
			setInvokedTask((Task) newValue);
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
		case ProcessDefinitionPackage.INVOCATION__TASK:
			setTask((Task) null);
			return;
		case ProcessDefinitionPackage.INVOCATION__INVOKED_TASK:
			setInvokedTask((Task) null);
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
		case ProcessDefinitionPackage.INVOCATION__TASK:
			return getTask() != null;
		case ProcessDefinitionPackage.INVOCATION__INVOKED_TASK:
			return invokedTask != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InvocationImpl
