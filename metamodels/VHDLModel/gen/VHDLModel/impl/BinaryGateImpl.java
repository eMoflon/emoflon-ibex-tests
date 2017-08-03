/**
 */
package VHDLModel.impl;

import VHDLModel.BinaryGate;
import VHDLModel.InputPort;
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
 * An implementation of the model object '<em><b>Binary Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link VHDLModel.impl.BinaryGateImpl#getInputport2 <em>Inputport2</em>}</li>
 *   <li>{@link VHDLModel.impl.BinaryGateImpl#getInputport1 <em>Inputport1</em>}</li>
 *   <li>{@link VHDLModel.impl.BinaryGateImpl#getOutputport <em>Outputport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BinaryGateImpl extends BlockImpl implements BinaryGate {
	/**
	 * The cached value of the '{@link #getInputport2() <em>Inputport2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputport2()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputport2;

	/**
	 * The cached value of the '{@link #getInputport1() <em>Inputport1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputport1()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputport1;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VHDLModelPackage.Literals.BINARY_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInputport2() {
		return inputport2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputport2(InputPort newInputport2, NotificationChain msgs) {
		InputPort oldInputport2 = inputport2;
		inputport2 = newInputport2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					VHDLModelPackage.BINARY_GATE__INPUTPORT2, oldInputport2, newInputport2);
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
	public void setInputport2(InputPort newInputport2) {
		if (newInputport2 != inputport2) {
			NotificationChain msgs = null;
			if (inputport2 != null)
				msgs = ((InternalEObject) inputport2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.BINARY_GATE__INPUTPORT2, null, msgs);
			if (newInputport2 != null)
				msgs = ((InternalEObject) newInputport2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.BINARY_GATE__INPUTPORT2, null, msgs);
			msgs = basicSetInputport2(newInputport2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VHDLModelPackage.BINARY_GATE__INPUTPORT2,
					newInputport2, newInputport2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInputport1() {
		return inputport1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputport1(InputPort newInputport1, NotificationChain msgs) {
		InputPort oldInputport1 = inputport1;
		inputport1 = newInputport1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					VHDLModelPackage.BINARY_GATE__INPUTPORT1, oldInputport1, newInputport1);
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
	public void setInputport1(InputPort newInputport1) {
		if (newInputport1 != inputport1) {
			NotificationChain msgs = null;
			if (inputport1 != null)
				msgs = ((InternalEObject) inputport1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.BINARY_GATE__INPUTPORT1, null, msgs);
			if (newInputport1 != null)
				msgs = ((InternalEObject) newInputport1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.BINARY_GATE__INPUTPORT1, null, msgs);
			msgs = basicSetInputport1(newInputport1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VHDLModelPackage.BINARY_GATE__INPUTPORT1,
					newInputport1, newInputport1));
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
					VHDLModelPackage.BINARY_GATE__OUTPUTPORT, oldOutputport, newOutputport);
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
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.BINARY_GATE__OUTPUTPORT, null, msgs);
			if (newOutputport != null)
				msgs = ((InternalEObject) newOutputport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VHDLModelPackage.BINARY_GATE__OUTPUTPORT, null, msgs);
			msgs = basicSetOutputport(newOutputport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VHDLModelPackage.BINARY_GATE__OUTPUTPORT,
					newOutputport, newOutputport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VHDLModelPackage.BINARY_GATE__INPUTPORT2:
			return basicSetInputport2(null, msgs);
		case VHDLModelPackage.BINARY_GATE__INPUTPORT1:
			return basicSetInputport1(null, msgs);
		case VHDLModelPackage.BINARY_GATE__OUTPUTPORT:
			return basicSetOutputport(null, msgs);
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
		case VHDLModelPackage.BINARY_GATE__INPUTPORT2:
			return getInputport2();
		case VHDLModelPackage.BINARY_GATE__INPUTPORT1:
			return getInputport1();
		case VHDLModelPackage.BINARY_GATE__OUTPUTPORT:
			return getOutputport();
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
		case VHDLModelPackage.BINARY_GATE__INPUTPORT2:
			setInputport2((InputPort) newValue);
			return;
		case VHDLModelPackage.BINARY_GATE__INPUTPORT1:
			setInputport1((InputPort) newValue);
			return;
		case VHDLModelPackage.BINARY_GATE__OUTPUTPORT:
			setOutputport((OutputPort) newValue);
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
		case VHDLModelPackage.BINARY_GATE__INPUTPORT2:
			setInputport2((InputPort) null);
			return;
		case VHDLModelPackage.BINARY_GATE__INPUTPORT1:
			setInputport1((InputPort) null);
			return;
		case VHDLModelPackage.BINARY_GATE__OUTPUTPORT:
			setOutputport((OutputPort) null);
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
		case VHDLModelPackage.BINARY_GATE__INPUTPORT2:
			return inputport2 != null;
		case VHDLModelPackage.BINARY_GATE__INPUTPORT1:
			return inputport1 != null;
		case VHDLModelPackage.BINARY_GATE__OUTPUTPORT:
			return outputport != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //BinaryGateImpl
