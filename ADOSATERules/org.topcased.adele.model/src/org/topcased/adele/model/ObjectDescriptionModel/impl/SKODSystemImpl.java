/**
 * Copyright (c) 2009 Ellidiss Technologies
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Arnaud Schach, arnaud.schach.com
 * 	Jean-Bertrand Hery
 */
package org.topcased.adele.model.ObjectDescriptionModel.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSMode;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSection;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSystem;
import org.w3c.dom.Document;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SKOD System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl#getStyleSheet <em>Style Sheet</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSystemImpl#getDomData <em>Dom Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SKODSystemImpl extends EObjectImpl implements SKODSystem {
	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<SKODSection> sections;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final SKODSMode MODE_EDEFAULT = SKODSMode.HIERARCHICAL_LITERAL;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected SKODSMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleSheet() <em>Style Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSheet()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_SHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleSheet() <em>Style Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSheet()
	 * @generated
	 * @ordered
	 */
	protected String styleSheet = STYLE_SHEET_EDEFAULT;


	/**
	 * The default value of the '{@link #getDomData() <em>Dom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomData()
	 * @generated NOT
	 * @ordered
	 */
	protected static final HashMap<String, Document>  DOM_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomData() <em>Dom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomData()
	 * @generated NOT
	 * @ordered
	 */
	protected Map<String, Document>  domData = DOM_DATA_EDEFAULT;

	protected static final Map<String, String>  DOM_DATA_KEYS_EDEFAULT = null;

	protected Map<String, String> domDataKeys = DOM_DATA_KEYS_EDEFAULT; 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SKODSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKODSystemImpl(String p_id , String p_label, SKODSMode p_mode, 
			String p_styleSheet, EList<SKODSection> p_sections, 
			HashMap<String, Document> p_domData,
			HashMap<String, String> p_domDataKeys) {
		super();
		id = p_id;
		label = p_label;
		mode = p_mode;
		styleSheet = p_styleSheet;
		domData = p_domData;
		domDataKeys = p_domDataKeys;
		sections = p_sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDescriptionModelPackage.Literals.SKOD_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SKODSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<SKODSection>(SKODSection.class, this, ObjectDescriptionModelPackage.SKOD_SYSTEM__SECTIONS);
		}
		return sections;
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
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SKODSMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleSheet() {
		return styleSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<String, Document> getDomData() {
		return domData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDomData(HashMap<String, Document> p_domData) {
		domData = p_domData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<String, String> getDomDataKeys() {
		return domDataKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isModified() {
		if (sections == null) return false;
		if (sections.isEmpty()) return false;
		for (int i = 0; i < sections.size(); i++) {
			if (((SKODSection) sections.get(i)).isInDeepModified()) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDomFilename(Document p_dom) {
		 Set<Map.Entry<String,Document>> entries = domData.entrySet();
		 Iterator<Map.Entry<String,Document>> iterator = entries.iterator();
		 do {
			 Map.Entry<String, Document> entrie = (Map.Entry<String, Document>) iterator.next();
			 if (entrie.getValue().equals(p_dom)) return entrie.getKey();
		 } while (iterator.hasNext());
		return  null; 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void save() throws IOException, TransformerConfigurationException, TransformerException {
		save(false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param boolean force. If true, force to save all the ODSection, otherwise the 
	 *  changed ODSection only
	 * 
	 * @generated NOT
	 */
	public void save(boolean force) throws IOException, TransformerConfigurationException, TransformerException {
		if (sections != null) {
			HashSet<Document> modifiedDoms = new HashSet<Document>();		
			for (int i = 0; i < sections.size(); i++) {
				modifiedDoms.addAll(((SKODSection) sections.get(i)).deepFlushData(modifiedDoms, force));
			}
			if (modifiedDoms.isEmpty()) return;
			Iterator<Document> iterator = modifiedDoms.iterator();		
			do {
				Document document = iterator.next();
				// Use a Transformer for output
				TransformerFactory tFactory = TransformerFactory.newInstance();
				Transformer transformer = tFactory.newTransformer();		
				DOMSource source = new DOMSource(document);
				String filename =  this.getDomFilename(document);
				final File directory = new File(( new File(filename)).getParent() );
				directory.mkdirs();
				//(new File((new File(filename)).getParent())).mkdirs();
				FileWriter outputStream = new FileWriter(filename);
				StreamResult result = new StreamResult(outputStream);
			    if (document.getDoctype() != null){
			    	String systemValue = (new File(document.getDoctype().getSystemId())).getName();
			        transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, systemValue);
			     }
			    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.transform(source, result);
				outputStream.close();
				
				final IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder( new Path( directory.getPath() ) );
				
				try {
					folder.refreshLocal( IResource.DEPTH_INFINITE, null );
				}
				catch( final CoreException p_ex ) {
					p_ex.printStackTrace();
				}
			} while (iterator.hasNext());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__SECTIONS:
				return getSections();
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__ID:
				return getId();
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__LABEL:
				return getLabel();
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__MODE:
				return getMode();
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__STYLE_SHEET:
				return getStyleSheet();
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__DOM_DATA:
				return getDomData();
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
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends SKODSection>)newValue);
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
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__SECTIONS:
				getSections().clear();
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
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__SECTIONS:
				return sections != null && !sections.isEmpty();
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__MODE:
				return mode != MODE_EDEFAULT;
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__STYLE_SHEET:
				return STYLE_SHEET_EDEFAULT == null ? styleSheet != null : !STYLE_SHEET_EDEFAULT.equals(styleSheet);
			case ObjectDescriptionModelPackage.SKOD_SYSTEM__DOM_DATA:
				return DOM_DATA_EDEFAULT == null ? domData != null : !DOM_DATA_EDEFAULT.equals(domData);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", label: ");
		result.append(label);
		result.append(", mode: ");
		result.append(mode);
		result.append(", styleSheet: ");
		result.append(styleSheet);
		result.append(", domData: ");
		result.append(domData);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void rebuildDomData(SKODSFactory factory, SKHierarchicalObject object) throws SKODSFactoryException{
		if (!domData.isEmpty())
			domData = factory.rebuildDomData(this, object);
	}

} //SKODSystemImpl