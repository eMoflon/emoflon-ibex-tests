/**
 */
package VHDLModel.impl;

import VHDLModel.InputPort;
import VHDLModel.NotGate;
import VHDLModel.OutputPort;
import VHDLModel.VHDLModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VHDLModel.impl.NotGateImpl#getOutputport <em>Outputport</em>}</li>
 *   <li>{@link VHDLModel.impl.NotGateImpl#getInputport <em>Inputport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotGateImpl extends BlockImpl implements NotGate {
	/**
	 * The cached value of the '{@link #getOutputport() <em>Outputport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputport()
	 * @generated
	 * @ordered
	 */
	protected OutputPort outputport;

	/**
	 * The cached value of the '{@link #getInputport() <em>Inputport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputport()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VHDLModelPackage.Literals.NOT_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getOutputport() {
		return outputport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputport(OutputPort newOutputport, NotificationChain msgs) {
		OutputPort oldOutputport = outputport;
		outputport = newOutputport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					VHDLModelPackage.NOT_GATE__OUTPUTPORT, oldOutputport, newOutputport);
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
	public void setOutputport(OutputPort newOutputport) {
		if (newOutputport != outputport) {
			NotificationChain msgs = null;
			if (outputport != null)
				msgs = ((InternalEObject) outputport).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.NOT_GATE__OUTPUTPORT, null, msgs);
			if (newOutputport != null)
				msgs = ((InternalEObject) newOutputport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.NOT_GATE__OUTPUTPORT, null, msgs);
			msgs = basicSetOutputport(newOutputport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VHDLModelPackage.NOT_GATE__OUTPUTPORT, newOutputport,
					newOutputport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInputport() {
		return inputport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputport(InputPort newInputport, NotificationChain msgs) {
		InputPort oldInputport = inputport;
		inputport = newInputport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					VHDLModelPackage.NOT_GATE__INPUTPORT, oldInputport, newInputport);
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
	public void setInputport(InputPort newInputport) {
		if (newInputport != inputport) {
			NotificationChain msgs = null;
			if (inputport != null)
				msgs = ((InternalEObject) inputport).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.NOT_GATE__INPUTPORT, null, msgs);
			if (newInputport != null)
				msgs = ((InternalEObject) newInputport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.NOT_GATE__INPUTPORT, null, msgs);
			msgs = basicSetInputport(newInputport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VHDLModelPackage.NOT_GATE__INPUTPORT, newInputport,
					newInputport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VHDLModelPackage.NOT_GATE__OUTPUTPORT:
			return basicSetOutputport(null, msgs);
		case VHDLModelPackage.NOT_GATE__INPUTPORT:
			return basicSetInputport(null, msgs);
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
		case VHDLModelPackage.NOT_GATE__OUTPUTPORT:
			return getOutputport();
		case VHDLModelPackage.NOT_GATE__INPUTPORT:
			return getInputport();
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
		case VHDLModelPackage.NOT_GATE__OUTPUTPORT:
			setOutputport((OutputPort) newValue);
			return;
		case VHDLModelPackage.NOT_GATE__INPUTPORT:
			setInputport((InputPort) newValue);
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
		case VHDLModelPackage.NOT_GATE__OUTPUTPORT:
			setOutputport((OutputPort) null);
			return;
		case VHDLModelPackage.NOT_GATE__INPUTPORT:
			setInputport((InputPort) null);
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
		case VHDLModelPackage.NOT_GATE__OUTPUTPORT:
			return outputport != null;
		case VHDLModelPackage.NOT_GATE__INPUTPORT:
			return inputport != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NotGateImpl
