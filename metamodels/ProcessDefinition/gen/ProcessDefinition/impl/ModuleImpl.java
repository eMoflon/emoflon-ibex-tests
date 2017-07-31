/**
 */
package ProcessDefinition.impl;

import ProcessDefinition.Import;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProcessDefinition.impl.ModuleImpl#getSystemModule <em>System Module</em>}</li>
 *   <li>{@link ProcessDefinition.impl.ModuleImpl#getImport <em>Import</em>}</li>
 *   <li>{@link ProcessDefinition.impl.ModuleImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ProcessDefinition.impl.ModuleImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements Module {
	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected Import import_;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessDefinitionPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemModule getSystemModule() {
		if (eContainerFeatureID() != ProcessDefinitionPackage.MODULE__SYSTEM_MODULE)
			return null;
		return (SystemModule) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemModule(SystemModule newSystemModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSystemModule, ProcessDefinitionPackage.MODULE__SYSTEM_MODULE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemModule(SystemModule newSystemModule) {
		if (newSystemModule != eInternalContainer()
				|| (eContainerFeatureID() != ProcessDefinitionPackage.MODULE__SYSTEM_MODULE
						&& newSystemModule != null)) {
			if (EcoreUtil.isAncestor(this, newSystemModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystemModule != null)
				msgs = ((InternalEObject) newSystemModule).eInverseAdd(this,
						ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES, SystemModule.class, msgs);
			msgs = basicSetSystemModule(newSystemModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.MODULE__SYSTEM_MODULE,
					newSystemModule, newSystemModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport() {
		if (import_ != null && import_.eIsProxy()) {
			InternalEObject oldImport = (InternalEObject) import_;
			import_ = (Import) eResolveProxy(oldImport);
			if (import_ != oldImport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessDefinitionPackage.MODULE__IMPORT,
							oldImport, import_));
			}
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import basicGetImport() {
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(Import newImport, NotificationChain msgs) {
		Import oldImport = import_;
		import_ = newImport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProcessDefinitionPackage.MODULE__IMPORT, oldImport, newImport);
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
	public void setImport(Import newImport) {
		if (newImport != import_) {
			NotificationChain msgs = null;
			if (import_ != null)
				msgs = ((InternalEObject) import_).eInverseRemove(this, ProcessDefinitionPackage.IMPORT__MODULE,
						Import.class, msgs);
			if (newImport != null)
				msgs = ((InternalEObject) newImport).eInverseAdd(this, ProcessDefinitionPackage.IMPORT__MODULE,
						Import.class, msgs);
			msgs = basicSetImport(newImport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.MODULE__IMPORT, newImport,
					newImport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentWithInverseEList<Task>(Task.class, this,
					ProcessDefinitionPackage.MODULE__TASKS, ProcessDefinitionPackage.TASK__MODULE);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessDefinitionPackage.MODULE__DESCRIPTION,
					oldDescription, description));
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
		case ProcessDefinitionPackage.MODULE__SYSTEM_MODULE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSystemModule((SystemModule) otherEnd, msgs);
		case ProcessDefinitionPackage.MODULE__IMPORT:
			if (import_ != null)
				msgs = ((InternalEObject) import_).eInverseRemove(this, ProcessDefinitionPackage.IMPORT__MODULE,
						Import.class, msgs);
			return basicSetImport((Import) otherEnd, msgs);
		case ProcessDefinitionPackage.MODULE__TASKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTasks()).basicAdd(otherEnd, msgs);
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
		case ProcessDefinitionPackage.MODULE__SYSTEM_MODULE:
			return basicSetSystemModule(null, msgs);
		case ProcessDefinitionPackage.MODULE__IMPORT:
			return basicSetImport(null, msgs);
		case ProcessDefinitionPackage.MODULE__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
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
		case ProcessDefinitionPackage.MODULE__SYSTEM_MODULE:
			return eInternalContainer().eInverseRemove(this, ProcessDefinitionPackage.SYSTEM_MODULE__ALL_MODULES,
					SystemModule.class, msgs);
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
		case ProcessDefinitionPackage.MODULE__SYSTEM_MODULE:
			return getSystemModule();
		case ProcessDefinitionPackage.MODULE__IMPORT:
			if (resolve)
				return getImport();
			return basicGetImport();
		case ProcessDefinitionPackage.MODULE__TASKS:
			return getTasks();
		case ProcessDefinitionPackage.MODULE__DESCRIPTION:
			return getDescription();
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
		case ProcessDefinitionPackage.MODULE__SYSTEM_MODULE:
			setSystemModule((SystemModule) newValue);
			return;
		case ProcessDefinitionPackage.MODULE__IMPORT:
			setImport((Import) newValue);
			return;
		case ProcessDefinitionPackage.MODULE__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case ProcessDefinitionPackage.MODULE__DESCRIPTION:
			setDescription((String) newValue);
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
		case ProcessDefinitionPackage.MODULE__SYSTEM_MODULE:
			setSystemModule((SystemModule) null);
			return;
		case ProcessDefinitionPackage.MODULE__IMPORT:
			setImport((Import) null);
			return;
		case ProcessDefinitionPackage.MODULE__TASKS:
			getTasks().clear();
			return;
		case ProcessDefinitionPackage.MODULE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case ProcessDefinitionPackage.MODULE__SYSTEM_MODULE:
			return getSystemModule() != null;
		case ProcessDefinitionPackage.MODULE__IMPORT:
			return import_ != null;
		case ProcessDefinitionPackage.MODULE__TASKS:
			return tasks != null && !tasks.isEmpty();
		case ProcessDefinitionPackage.MODULE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ModuleImpl
