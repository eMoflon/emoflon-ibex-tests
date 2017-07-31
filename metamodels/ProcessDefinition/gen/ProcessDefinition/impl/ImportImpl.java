/**
 */
package ProcessDefinition.impl;

import ProcessDefinition.Import;
import ProcessDefinition.Module;
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
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProcessDefinition.impl.ImportImpl#getImportingTask <em>Importing Task</em>}</li>
 *   <li>{@link ProcessDefinition.impl.ImportImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends EObjectImpl implements Import {
	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected Module module;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessDefinitionPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getImportingTask() {
		if (eContainerFeatureID() != ProcessDefinitionPackage.IMPORT__IMPORTING_TASK)
			return null;
		return (Task) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportingTask(Task newImportingTask, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newImportingTask, ProcessDefinitionPackage.IMPORT__IMPORTING_TASK,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingTask(Task newImportingTask) {
		if (newImportingTask != eInternalContainer()
				|| (eContainerFeatureID() != ProcessDefinitionPackage.IMPORT__IMPORTING_TASK
						&& newImportingTask != null)) {
			if (EcoreUtil.isAncestor(this, newImportingTask))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportingTask != null)
				msgs = ((InternalEObject) newImportingTask).eInverseAdd(this, ProcessDefinitionPackage.TASK__IMPORTS,
						Task.class, msgs);
			msgs = basicSetImportingTask(newImportingTask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.IMPORT__IMPORTING_TASK,
					newImportingTask, newImportingTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject) module;
			module = (Module) eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessDefinitionPackage.IMPORT__MODULE,
							oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		Module oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProcessDefinitionPackage.IMPORT__MODULE, oldModule, newModule);
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
	public void setModule(Module newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject) module).eInverseRemove(this, ProcessDefinitionPackage.MODULE__IMPORT,
						Module.class, msgs);
			if (newModule != null)
				msgs = ((InternalEObject) newModule).eInverseAdd(this, ProcessDefinitionPackage.MODULE__IMPORT,
						Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.IMPORT__MODULE, newModule,
					newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProcessDefinitionPackage.IMPORT__IMPORTING_TASK:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetImportingTask((Task) otherEnd, msgs);
		case ProcessDefinitionPackage.IMPORT__MODULE:
			if (module != null)
				msgs = ((InternalEObject) module).eInverseRemove(this, ProcessDefinitionPackage.MODULE__IMPORT,
						Module.class, msgs);
			return basicSetModule((Module) otherEnd, msgs);
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
		case ProcessDefinitionPackage.IMPORT__IMPORTING_TASK:
			return basicSetImportingTask(null, msgs);
		case ProcessDefinitionPackage.IMPORT__MODULE:
			return basicSetModule(null, msgs);
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
		case ProcessDefinitionPackage.IMPORT__IMPORTING_TASK:
			return eInternalContainer().eInverseRemove(this, ProcessDefinitionPackage.TASK__IMPORTS, Task.class, msgs);
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
		case ProcessDefinitionPackage.IMPORT__IMPORTING_TASK:
			return getImportingTask();
		case ProcessDefinitionPackage.IMPORT__MODULE:
			if (resolve)
				return getModule();
			return basicGetModule();
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
		case ProcessDefinitionPackage.IMPORT__IMPORTING_TASK:
			setImportingTask((Task) newValue);
			return;
		case ProcessDefinitionPackage.IMPORT__MODULE:
			setModule((Module) newValue);
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
		case ProcessDefinitionPackage.IMPORT__IMPORTING_TASK:
			setImportingTask((Task) null);
			return;
		case ProcessDefinitionPackage.IMPORT__MODULE:
			setModule((Module) null);
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
		case ProcessDefinitionPackage.IMPORT__IMPORTING_TASK:
			return getImportingTask() != null;
		case ProcessDefinitionPackage.IMPORT__MODULE:
			return module != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ImportImpl
