/**
 */
package ProcessDefinition.impl;

import ProcessDefinition.Module;
import ProcessDefinition.ProcessDefinitionPackage;
import ProcessDefinition.SystemModule;
import ProcessDefinition.Task;

import ProcessDefinition.facade.Helper;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProcessDefinition.impl.SystemModuleImpl#getHelper <em>Helper</em>}</li>
 *   <li>{@link ProcessDefinition.impl.SystemModuleImpl#getAllTasks <em>All Tasks</em>}</li>
 *   <li>{@link ProcessDefinition.impl.SystemModuleImpl#getAllModules <em>All Modules</em>}</li>
 *   <li>{@link ProcessDefinition.impl.SystemModuleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemModuleImpl extends EObjectImpl implements SystemModule {
	/**
	 * The cached value of the '{@link #getHelper() <em>Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelper()
	 * @generated
	 * @ordered
	 */
	protected Helper helper;

	/**
	 * The cached value of the '{@link #getAllTasks() <em>All Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> allTasks;

	/**
	 * The cached value of the '{@link #getAllModules() <em>All Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> allModules;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessDefinitionPackage.Literals.SYSTEM_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Helper getHelper() {
		return helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHelper(Helper newHelper, NotificationChain msgs) {
		Helper oldHelper = helper;
		helper = newHelper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProcessDefinitionPackage.SYSTEM_MODULE__HELPER, oldHelper, newHelper);
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
	public void setHelper(Helper newHelper) {
		if (newHelper != helper) {
			NotificationChain msgs = null;
			if (helper != null)
				msgs = ((InternalEObject) helper).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ProcessDefinitionPackage.SYSTEM_MODULE__HELPER, null, msgs);
			if (newHelper != null)
				msgs = ((InternalEObject) newHelper).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ProcessDefinitionPackage.SYSTEM_MODULE__HELPER, null, msgs);
			msgs = basicSetHelper(newHelper, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.SYSTEM_MODULE__HELPER,
					newHelper, newHelper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getAllTasks() {
		if (allTasks == null) {
			allTasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this,
					ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS, ProcessDefinitionPackage.TASK__SYSTEM_MODULE);
		}
		return allTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getAllModules() {
		if (allModules == null) {
			allModules = new EObjectContainmentWithInverseEList<Module>(Module.class, this,
					ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES,
					ProcessDefinitionPackage.MODULE__SYSTEM_MODULE);
		}
		return allModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.SYSTEM_MODULE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAllTasks()).basicAdd(otherEnd, msgs);
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAllModules()).basicAdd(otherEnd, msgs);
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
		case ProcessDefinitionPackage.SYSTEM_MODULE__HELPER:
			return basicSetHelper(null, msgs);
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS:
			return ((InternalEList<?>) getAllTasks()).basicRemove(otherEnd, msgs);
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES:
			return ((InternalEList<?>) getAllModules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProcessDefinitionPackage.SYSTEM_MODULE__HELPER:
			return getHelper();
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS:
			return getAllTasks();
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES:
			return getAllModules();
		case ProcessDefinitionPackage.SYSTEM_MODULE__NAME:
			return getName();
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
		case ProcessDefinitionPackage.SYSTEM_MODULE__HELPER:
			setHelper((Helper) newValue);
			return;
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS:
			getAllTasks().clear();
			getAllTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES:
			getAllModules().clear();
			getAllModules().addAll((Collection<? extends Module>) newValue);
			return;
		case ProcessDefinitionPackage.SYSTEM_MODULE__NAME:
			setName((String) newValue);
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
		case ProcessDefinitionPackage.SYSTEM_MODULE__HELPER:
			setHelper((Helper) null);
			return;
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS:
			getAllTasks().clear();
			return;
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES:
			getAllModules().clear();
			return;
		case ProcessDefinitionPackage.SYSTEM_MODULE__NAME:
			setName(NAME_EDEFAULT);
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
		case ProcessDefinitionPackage.SYSTEM_MODULE__HELPER:
			return helper != null;
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS:
			return allTasks != null && !allTasks.isEmpty();
		case ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES:
			return allModules != null && !allModules.isEmpty();
		case ProcessDefinitionPackage.SYSTEM_MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SystemModuleImpl
