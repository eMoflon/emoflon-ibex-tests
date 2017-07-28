/**
 */
package MocaTree.impl;

import MocaTree.Attribute;
import MocaTree.File;
import MocaTree.MocaTreePackage;
import MocaTree.Node;

import MocaTree.Text;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MocaTree.impl.NodeImpl#getFile <em>File</em>}</li>
 *   <li>{@link MocaTree.impl.NodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link MocaTree.impl.NodeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link MocaTree.impl.NodeImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link MocaTree.impl.NodeImpl#getStartLineIndex <em>Start Line Index</em>}</li>
 *   <li>{@link MocaTree.impl.NodeImpl#getStopIndex <em>Stop Index</em>}</li>
 *   <li>{@link MocaTree.impl.NodeImpl#getStopLineIndex <em>Stop Line Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends TextImpl implements Node {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> children;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The default value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int START_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected int startIndex = START_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartLineIndex() <em>Start Line Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLineIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int START_LINE_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartLineIndex() <em>Start Line Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLineIndex()
	 * @generated
	 * @ordered
	 */
	protected int startLineIndex = START_LINE_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopIndex() <em>Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int STOP_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStopIndex() <em>Stop Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopIndex()
	 * @generated
	 * @ordered
	 */
	protected int stopIndex = STOP_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopLineIndex() <em>Stop Line Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopLineIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int STOP_LINE_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStopLineIndex() <em>Stop Line Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopLineIndex()
	 * @generated
	 * @ordered
	 */
	protected int stopLineIndex = STOP_LINE_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MocaTreePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<Text>(Text.class, this, MocaTreePackage.NODE__CHILDREN,
					MocaTreePackage.TEXT__PARENT_NODE);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this,
					MocaTreePackage.NODE__ATTRIBUTE, MocaTreePackage.ATTRIBUTE__NODE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIndex(int newStartIndex) {
		int oldStartIndex = startIndex;
		startIndex = newStartIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.NODE__START_INDEX, oldStartIndex,
					startIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartLineIndex() {
		return startLineIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLineIndex(int newStartLineIndex) {
		int oldStartLineIndex = startLineIndex;
		startLineIndex = newStartLineIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.NODE__START_LINE_INDEX,
					oldStartLineIndex, startLineIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStopIndex() {
		return stopIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopIndex(int newStopIndex) {
		int oldStopIndex = stopIndex;
		stopIndex = newStopIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.NODE__STOP_INDEX, oldStopIndex,
					stopIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStopLineIndex() {
		return stopLineIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopLineIndex(int newStopLineIndex) {
		int oldStopLineIndex = stopLineIndex;
		stopLineIndex = newStopLineIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.NODE__STOP_LINE_INDEX,
					oldStopLineIndex, stopLineIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		if (eContainerFeatureID() != MocaTreePackage.NODE__FILE)
			return null;
		return (File) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(File newFile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFile, MocaTreePackage.NODE__FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		if (newFile != eInternalContainer()
				|| (eContainerFeatureID() != MocaTreePackage.NODE__FILE && newFile != null)) {
			if (EcoreUtil.isAncestor(this, newFile))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFile != null)
				msgs = ((InternalEObject) newFile).eInverseAdd(this, MocaTreePackage.FILE__ROOT_NODE, File.class, msgs);
			msgs = basicSetFile(newFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MocaTreePackage.NODE__FILE, newFile, newFile));
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
		case MocaTreePackage.NODE__FILE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFile((File) otherEnd, msgs);
		case MocaTreePackage.NODE__CHILDREN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildren()).basicAdd(otherEnd, msgs);
		case MocaTreePackage.NODE__ATTRIBUTE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttribute()).basicAdd(otherEnd, msgs);
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
		case MocaTreePackage.NODE__FILE:
			return basicSetFile(null, msgs);
		case MocaTreePackage.NODE__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case MocaTreePackage.NODE__ATTRIBUTE:
			return ((InternalEList<?>) getAttribute()).basicRemove(otherEnd, msgs);
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
		case MocaTreePackage.NODE__FILE:
			return eInternalContainer().eInverseRemove(this, MocaTreePackage.FILE__ROOT_NODE, File.class, msgs);
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
		case MocaTreePackage.NODE__FILE:
			return getFile();
		case MocaTreePackage.NODE__CHILDREN:
			return getChildren();
		case MocaTreePackage.NODE__ATTRIBUTE:
			return getAttribute();
		case MocaTreePackage.NODE__START_INDEX:
			return getStartIndex();
		case MocaTreePackage.NODE__START_LINE_INDEX:
			return getStartLineIndex();
		case MocaTreePackage.NODE__STOP_INDEX:
			return getStopIndex();
		case MocaTreePackage.NODE__STOP_LINE_INDEX:
			return getStopLineIndex();
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
		case MocaTreePackage.NODE__FILE:
			setFile((File) newValue);
			return;
		case MocaTreePackage.NODE__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends Text>) newValue);
			return;
		case MocaTreePackage.NODE__ATTRIBUTE:
			getAttribute().clear();
			getAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case MocaTreePackage.NODE__START_INDEX:
			setStartIndex((Integer) newValue);
			return;
		case MocaTreePackage.NODE__START_LINE_INDEX:
			setStartLineIndex((Integer) newValue);
			return;
		case MocaTreePackage.NODE__STOP_INDEX:
			setStopIndex((Integer) newValue);
			return;
		case MocaTreePackage.NODE__STOP_LINE_INDEX:
			setStopLineIndex((Integer) newValue);
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
		case MocaTreePackage.NODE__FILE:
			setFile((File) null);
			return;
		case MocaTreePackage.NODE__CHILDREN:
			getChildren().clear();
			return;
		case MocaTreePackage.NODE__ATTRIBUTE:
			getAttribute().clear();
			return;
		case MocaTreePackage.NODE__START_INDEX:
			setStartIndex(START_INDEX_EDEFAULT);
			return;
		case MocaTreePackage.NODE__START_LINE_INDEX:
			setStartLineIndex(START_LINE_INDEX_EDEFAULT);
			return;
		case MocaTreePackage.NODE__STOP_INDEX:
			setStopIndex(STOP_INDEX_EDEFAULT);
			return;
		case MocaTreePackage.NODE__STOP_LINE_INDEX:
			setStopLineIndex(STOP_LINE_INDEX_EDEFAULT);
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
		case MocaTreePackage.NODE__FILE:
			return getFile() != null;
		case MocaTreePackage.NODE__CHILDREN:
			return children != null && !children.isEmpty();
		case MocaTreePackage.NODE__ATTRIBUTE:
			return attribute != null && !attribute.isEmpty();
		case MocaTreePackage.NODE__START_INDEX:
			return startIndex != START_INDEX_EDEFAULT;
		case MocaTreePackage.NODE__START_LINE_INDEX:
			return startLineIndex != START_LINE_INDEX_EDEFAULT;
		case MocaTreePackage.NODE__STOP_INDEX:
			return stopIndex != STOP_INDEX_EDEFAULT;
		case MocaTreePackage.NODE__STOP_LINE_INDEX:
			return stopLineIndex != STOP_LINE_INDEX_EDEFAULT;
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
		result.append(" (startIndex: ");
		result.append(startIndex);
		result.append(", startLineIndex: ");
		result.append(startLineIndex);
		result.append(", stopIndex: ");
		result.append(stopIndex);
		result.append(", stopLineIndex: ");
		result.append(stopLineIndex);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
