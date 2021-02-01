/**
 */
package ExtDocModel.impl;

import ExtDocModel.Doc;
import ExtDocModel.DocContainer;
import ExtDocModel.ExtDocModelPackage;
import ExtDocModel.Glossary;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExtDocModel.impl.DocContainerImpl#getDocs <em>Docs</em>}</li>
 *   <li>{@link ExtDocModel.impl.DocContainerImpl#getGlossary <em>Glossary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocContainerImpl extends MinimalEObjectImpl.Container implements DocContainer {
	/**
	 * The cached value of the '{@link #getDocs() <em>Docs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocs()
	 * @generated
	 * @ordered
	 */
	protected EList<Doc> docs;

	/**
	 * The cached value of the '{@link #getGlossary() <em>Glossary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossary()
	 * @generated
	 * @ordered
	 */
	protected Glossary glossary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtDocModelPackage.Literals.DOC_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doc> getDocs() {
		if (docs == null) {
			docs = new EObjectContainmentWithInverseEList<Doc>(Doc.class, this, ExtDocModelPackage.DOC_CONTAINER__DOCS,
					ExtDocModelPackage.DOC__CONTAINER);
		}
		return docs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glossary getGlossary() {
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossary(Glossary newGlossary, NotificationChain msgs) {
		Glossary oldGlossary = glossary;
		glossary = newGlossary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExtDocModelPackage.DOC_CONTAINER__GLOSSARY, oldGlossary, newGlossary);
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
	@Override
	public void setGlossary(Glossary newGlossary) {
		if (newGlossary != glossary) {
			NotificationChain msgs = null;
			if (glossary != null)
				msgs = ((InternalEObject) glossary).eInverseRemove(this, ExtDocModelPackage.GLOSSARY__CONTAINER,
						Glossary.class, msgs);
			if (newGlossary != null)
				msgs = ((InternalEObject) newGlossary).eInverseAdd(this, ExtDocModelPackage.GLOSSARY__CONTAINER,
						Glossary.class, msgs);
			msgs = basicSetGlossary(newGlossary, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDocModelPackage.DOC_CONTAINER__GLOSSARY,
					newGlossary, newGlossary));
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
		case ExtDocModelPackage.DOC_CONTAINER__DOCS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDocs()).basicAdd(otherEnd, msgs);
		case ExtDocModelPackage.DOC_CONTAINER__GLOSSARY:
			if (glossary != null)
				msgs = ((InternalEObject) glossary).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExtDocModelPackage.DOC_CONTAINER__GLOSSARY, null, msgs);
			return basicSetGlossary((Glossary) otherEnd, msgs);
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
		case ExtDocModelPackage.DOC_CONTAINER__DOCS:
			return ((InternalEList<?>) getDocs()).basicRemove(otherEnd, msgs);
		case ExtDocModelPackage.DOC_CONTAINER__GLOSSARY:
			return basicSetGlossary(null, msgs);
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
		case ExtDocModelPackage.DOC_CONTAINER__DOCS:
			return getDocs();
		case ExtDocModelPackage.DOC_CONTAINER__GLOSSARY:
			return getGlossary();
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
		case ExtDocModelPackage.DOC_CONTAINER__DOCS:
			getDocs().clear();
			getDocs().addAll((Collection<? extends Doc>) newValue);
			return;
		case ExtDocModelPackage.DOC_CONTAINER__GLOSSARY:
			setGlossary((Glossary) newValue);
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
		case ExtDocModelPackage.DOC_CONTAINER__DOCS:
			getDocs().clear();
			return;
		case ExtDocModelPackage.DOC_CONTAINER__GLOSSARY:
			setGlossary((Glossary) null);
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
		case ExtDocModelPackage.DOC_CONTAINER__DOCS:
			return docs != null && !docs.isEmpty();
		case ExtDocModelPackage.DOC_CONTAINER__GLOSSARY:
			return glossary != null;
		}
		return super.eIsSet(featureID);
	}

} //DocContainerImpl
