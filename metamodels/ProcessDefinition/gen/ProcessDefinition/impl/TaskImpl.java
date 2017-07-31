/**
 */
package ProcessDefinition.impl;

import ProcessDefinition.Import;
import ProcessDefinition.Invocation;
import ProcessDefinition.Module;
import ProcessDefinition.ProcessDefinitionPackage;
import ProcessDefinition.SystemModule;
import ProcessDefinition.Task;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProcessDefinition.impl.TaskImpl#getSystemModule <em>System Module</em>}</li>
 *   <li>{@link ProcessDefinition.impl.TaskImpl#getModule <em>Module</em>}</li>
 *   <li>{@link ProcessDefinition.impl.TaskImpl#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link ProcessDefinition.impl.TaskImpl#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link ProcessDefinition.impl.TaskImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link ProcessDefinition.impl.TaskImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getSystemModule() <em>System Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemModule()
	 * @generated
	 * @ordered
	 */
	protected SystemModule systemModule;

	/**
	 * The cached value of the '{@link #getInvocation() <em>Invocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Invocation> invocation;

	/**
	 * The cached value of the '{@link #getInvocations() <em>Invocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Invocation> invocations;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessDefinitionPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModule getSystemModule() {
		if (systemModule != null && systemModule.eIsProxy()) {
			InternalEObject oldSystemModule = (InternalEObject) systemModule;
			systemModule = (SystemModule) eResolveProxy(oldSystemModule);
			if (systemModule != oldSystemModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProcessDefinitionPackage.TASK__SYSTEM_MODULE, oldSystemModule, systemModule));
			}
		}
		return systemModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModule basicGetSystemModule() {
		return systemModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemModule(SystemModule newSystemModule, NotificationChain msgs) {
		SystemModule oldSystemModule = systemModule;
		systemModule = newSystemModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProcessDefinitionPackage.TASK__SYSTEM_MODULE, oldSystemModule, newSystemModule);
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
	public void setSystemModule(SystemModule newSystemModule) {
		if (newSystemModule != systemModule) {
			NotificationChain msgs = null;
			if (systemModule != null)
				msgs = ((InternalEObject) systemModule).eInverseRemove(this,
						ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS, SystemModule.class, msgs);
			if (newSystemModule != null)
				msgs = ((InternalEObject) newSystemModule).eInverseAdd(this,
						ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS, SystemModule.class, msgs);
			msgs = basicSetSystemModule(newSystemModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.TASK__SYSTEM_MODULE,
					newSystemModule, newSystemModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID() != ProcessDefinitionPackage.TASK__MODULE)
			return null;
		return (Module) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModule, ProcessDefinitionPackage.TASK__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer()
				|| (eContainerFeatureID() != ProcessDefinitionPackage.TASK__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject) newModule).eInverseAdd(this, ProcessDefinitionPackage.MODULE__TASKS,
						Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.TASK__MODULE, newModule,
					newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invocation> getInvocation() {
		if (invocation == null) {
			invocation = new EObjectWithInverseResolvingEList<Invocation>(Invocation.class, this,
					ProcessDefinitionPackage.TASK__INVOCATION, ProcessDefinitionPackage.INVOCATION__INVOKED_TASK);
		}
		return invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invocation> getInvocations() {
		if (invocations == null) {
			invocations = new EObjectContainmentWithInverseEList<Invocation>(Invocation.class, this,
					ProcessDefinitionPackage.TASK__INVOCATIONS, ProcessDefinitionPackage.INVOCATION__TASK);
		}
		return invocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentWithInverseEList<Import>(Import.class, this,
					ProcessDefinitionPackage.TASK__IMPORTS, ProcessDefinitionPackage.IMPORT__IMPORTING_TASK);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.TASK__ID, oldId, id));
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
		case ProcessDefinitionPackage.TASK__SYSTEM_MODULE:
			if (systemModule != null)
				msgs = ((InternalEObject) systemModule).eInverseRemove(this,
						ProcessDefinitionPackage.SYSTEM_MODULE__ALL_TASKS, SystemModule.class, msgs);
			return basicSetSystemModule((SystemModule) otherEnd, msgs);
		case ProcessDefinitionPackage.TASK__MODULE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModule((Module) otherEnd, msgs);
		case ProcessDefinitionPackage.TASK__INVOCATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvocation()).basicAdd(otherEnd, msgs);
		case ProcessDefinitionPackage.TASK__INVOCATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvocations()).basicAdd(otherEnd, msgs);
		case ProcessDefinitionPackage.TASK__IMPORTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getImports()).basicAdd(otherEnd, msgs);
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
		case ProcessDefinitionPackage.TASK__SYSTEM_MODULE:
			return basicSetSystemModule(null, msgs);
		case ProcessDefinitionPackage.TASK__MODULE:
			return basicSetModule(null, msgs);
		case ProcessDefinitionPackage.TASK__INVOCATION:
			return ((InternalEList<?>) getInvocation()).basicRemove(otherEnd, msgs);
		case ProcessDefinitionPackage.TASK__INVOCATIONS:
			return ((InternalEList<?>) getInvocations()).basicRemove(otherEnd, msgs);
		case ProcessDefinitionPackage.TASK__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
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
		case ProcessDefinitionPackage.TASK__MODULE:
			return eInternalContainer().eInverseRemove(this, ProcessDefinitionPackage.MODULE__TASKS, Module.class,
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
		case ProcessDefinitionPackage.TASK__SYSTEM_MODULE:
			if (resolve)
				return getSystemModule();
			return basicGetSystemModule();
		case ProcessDefinitionPackage.TASK__MODULE:
			return getModule();
		case ProcessDefinitionPackage.TASK__INVOCATION:
			return getInvocation();
		case ProcessDefinitionPackage.TASK__INVOCATIONS:
			return getInvocations();
		case ProcessDefinitionPackage.TASK__IMPORTS:
			return getImports();
		case ProcessDefinitionPackage.TASK__ID:
			return getId();
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
		case ProcessDefinitionPackage.TASK__SYSTEM_MODULE:
			setSystemModule((SystemModule) newValue);
			return;
		case ProcessDefinitionPackage.TASK__MODULE:
			setModule((Module) newValue);
			return;
		case ProcessDefinitionPackage.TASK__INVOCATION:
			getInvocation().clear();
			getInvocation().addAll((Collection<? extends Invocation>) newValue);
			return;
		case ProcessDefinitionPackage.TASK__INVOCATIONS:
			getInvocations().clear();
			getInvocations().addAll((Collection<? extends Invocation>) newValue);
			return;
		case ProcessDefinitionPackage.TASK__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case ProcessDefinitionPackage.TASK__ID:
			setId((String) newValue);
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
		case ProcessDefinitionPackage.TASK__SYSTEM_MODULE:
			setSystemModule((SystemModule) null);
			return;
		case ProcessDefinitionPackage.TASK__MODULE:
			setModule((Module) null);
			return;
		case ProcessDefinitionPackage.TASK__INVOCATION:
			getInvocation().clear();
			return;
		case ProcessDefinitionPackage.TASK__INVOCATIONS:
			getInvocations().clear();
			return;
		case ProcessDefinitionPackage.TASK__IMPORTS:
			getImports().clear();
			return;
		case ProcessDefinitionPackage.TASK__ID:
			setId(ID_EDEFAULT);
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
		case ProcessDefinitionPackage.TASK__SYSTEM_MODULE:
			return systemModule != null;
		case ProcessDefinitionPackage.TASK__MODULE:
			return getModule() != null;
		case ProcessDefinitionPackage.TASK__INVOCATION:
			return invocation != null && !invocation.isEmpty();
		case ProcessDefinitionPackage.TASK__INVOCATIONS:
			return invocations != null && !invocations.isEmpty();
		case ProcessDefinitionPackage.TASK__IMPORTS:
			return imports != null && !imports.isEmpty();
		case ProcessDefinitionPackage.TASK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TaskImpl
