/**
 */
package glossarDocumentation.impl;

import glossarDocumentation.Document;
import glossarDocumentation.DocumentationContainer;
import glossarDocumentation.Glossar;
import glossarDocumentation.GlossarDocumentationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glossarDocumentation.impl.DocumentationContainerImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link glossarDocumentation.impl.DocumentationContainerImpl#getGlossar <em>Glossar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationContainerImpl extends MinimalEObjectImpl.Container implements DocumentationContainer {
	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

	/**
	 * The cached value of the '{@link #getGlossar() <em>Glossar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossar()
	 * @generated
	 * @ordered
	 */
	protected Glossar glossar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossarDocumentationPackage.Literals.DOCUMENTATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectContainmentEList<Document>(Document.class, this,
					GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__DOCUMENTS);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glossar getGlossar() {
		return glossar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossar(Glossar newGlossar, NotificationChain msgs) {
		Glossar oldGlossar = glossar;
		glossar = newGlossar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR, oldGlossar, newGlossar);
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
	public void setGlossar(Glossar newGlossar) {
		if (newGlossar != glossar) {
			NotificationChain msgs = null;
			if (glossar != null)
				msgs = ((InternalEObject) glossar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR, null,
						msgs);
			if (newGlossar != null)
				msgs = ((InternalEObject) newGlossar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR, null,
						msgs);
			msgs = basicSetGlossar(newGlossar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR, newGlossar, newGlossar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__DOCUMENTS:
			return ((InternalEList<?>) getDocuments()).basicRemove(otherEnd, msgs);
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR:
			return basicSetGlossar(null, msgs);
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
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__DOCUMENTS:
			return getDocuments();
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR:
			return getGlossar();
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
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__DOCUMENTS:
			getDocuments().clear();
			getDocuments().addAll((Collection<? extends Document>) newValue);
			return;
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR:
			setGlossar((Glossar) newValue);
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
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__DOCUMENTS:
			getDocuments().clear();
			return;
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR:
			setGlossar((Glossar) null);
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
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__DOCUMENTS:
			return documents != null && !documents.isEmpty();
		case GlossarDocumentationPackage.DOCUMENTATION_CONTAINER__GLOSSAR:
			return glossar != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentationContainerImpl
