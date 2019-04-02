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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.impl.SKHierarchicalObjectException;
import org.topcased.adele.model.ObjectDescriptionModel.ObjectDescriptionModelPackage;
import org.topcased.adele.model.ObjectDescriptionModel.SKODData;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSFactory;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSMode;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSection;
import org.topcased.adele.model.ObjectDescriptionModel.SKODSystem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SKODS Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryImpl#getDomODS <em>Dom ODS</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryImpl#getCurrentODSDatafileNode <em>Current ODS Datafile Node</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryImpl#getDomData <em>Dom Data</em>}</li>
 *   <li>{@link org.topcased.adele.model.ObjectDescriptionModel.impl.SKODSFactoryImpl#getCurrentObject <em>Current Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */


public class SKODSFactoryImpl extends EObjectImpl implements SKODSFactory {
	/**
	 * The default value of the '{@link #getDomODS() <em>Dom ODS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomODS()
	 * @generated
	 * @ordered
	 */
	protected static final Document DOM_ODS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomODS() <em>Dom ODS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomODS()
	 * @generated
	 * @ordered
	 */
	protected Document domODS = DOM_ODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentODSDatafileNode() <em>Current ODS Datafile Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentODSDatafileNode()
	 * @generated
	 * @ordered
	 */
	protected static final Node CURRENT_ODS_DATAFILE_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentODSDatafileNode() <em>Current ODS Datafile Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentODSDatafileNode()
	 * @generated
	 * @ordered
	 */
	protected Node currentODSDatafileNode = CURRENT_ODS_DATAFILE_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomData() <em>Dom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomData()
	 * @generated NOT
	 * @ordered
	 */
	protected static final HashMap<String, Document> DOM_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomData() <em>Dom Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomData()
	 * @generated NOT
	 * @ordered
	 */
	protected HashMap<String, Document> domData = DOM_DATA_EDEFAULT;

	protected static final HashMap<String, String>  DOM_DATA_KEYS_EDEFAULT = null;

	protected HashMap<String, String> domDataKeys = DOM_DATA_KEYS_EDEFAULT;
	
	protected static final String ODSYSTEMS_NODE_LITERAL = "OdsConfig:ODSystemsType";
	
	protected static final String ODSYSTEM_NODE_LITERAL = "oDSystem";
	
	protected static final String ODSECTION_NODE_LITERAL = "oDSection";
	
	protected static final String DATARECOVERING_NODE_LITERAL = "dataRecovering";
	
	protected static final String LABEL_NODE_LITERAL = "label";
	
	protected static final String OBJECTCONDITION_NODE_LITERAL = "objectCondition";
	
	protected static final String DATAFILE_NODE_LITERAL = "dataFile";
	
	protected static final String INTERNALPROCEDURE_NODE_LITERAL = "internalProcedure";
	
	protected static final String SLASH_NODE_LITERAL = "slash";
	
	protected static final String TEXT_NODE_LITERAL = "text";
	
	protected static final String DATAFIELD_NODE_LITERAL = "dataField";


	/**
	 * The cached value of the '{@link #getCurrentObject() <em>Current Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentObject()
	 * @generated
	 * @ordered
	 */
	protected SKHierarchicalObject currentObject;




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SKODSFactoryImpl() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * 
	 * 	Load in memory the SKODSytem description list from the p_xmlFilename file
	 */
	public SKODSFactoryImpl(String p_xmlFilename) throws SKODSFactoryException {		
		super();
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();   
	        DocumentBuilder builder = factory.newDocumentBuilder();
	        domODS = builder.parse(new File(p_xmlFilename));
        } catch (SAXParseException e) {
            // Error generated by the parser
            throw new SKODSFactoryException("\n** Parsing error" + ", line " +
                e.getLineNumber() + ", uri " + e.getSystemId() + "   " + e.getMessage());
        } catch (SAXException e) {
            // Error generated during parsing
            throw new SKODSFactoryException(e.getMessage());
        } catch (ParserConfigurationException e) {
            // Parser with specified options can't be built
            throw new SKODSFactoryException(e.getMessage());
        } catch (IOException e) {
            // I/O error
            throw new SKODSFactoryException(e.getMessage());
        }
	}


	/**
	 * @generated NOT
	 */
	private Node getSystemsNode () throws SKODSFactoryException {
		if (domODS == null) throw new SKODSFactoryException("ERROR : no DOM object !");
		if (! domODS.hasChildNodes()) throw new SKODSFactoryException("ERROR : no <"+ODSYSTEMS_NODE_LITERAL+"> entity");	
		NodeList childNodes = domODS.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node child = childNodes.item(i);
			if (child.getNodeName().equals(ODSYSTEMS_NODE_LITERAL)) return child;		
		}
		throw new SKODSFactoryException("ERROR : no <"+ ODSYSTEMS_NODE_LITERAL +"> entity");
	}
	
	/**
	 *  @generated NOT
	 */
	private EList<Node> getSubnodes(Node p_parentNode, String p_name) {
		NodeList childNodes = p_parentNode.getChildNodes();
		BasicEList<Node> subnodes = new BasicEList<Node>();
		
		for (int i = 0; i < childNodes.getLength(); i++) {
			if (childNodes.item(i).getNodeName().equals(p_name)) {
				subnodes.add(childNodes.item(i));
			}
		}
		return subnodes;
	}
	
	/**
	 *  @generated NOT
	 */
	private EList<Node> rejectSubnodes(Node p_parentNode, String p_name) {
		NodeList childNodes = p_parentNode.getChildNodes();
		BasicEList<Node> subnodes = new BasicEList<Node>();
		
		for (int i = 0; i < childNodes.getLength(); i++) {
			if (! childNodes.item(i).getNodeName().equals(p_name)) {
				subnodes.add(childNodes.item(i));
			}
		}
		return subnodes;
	}
	
	/**
	 *  @generated NOT
	 */
	private Node getSubnode(Node p_parentNode, String p_name) {
		EList<Node> subnodes = this.getSubnodes(p_parentNode, p_name);
		if (subnodes.size() <= 0) return null;
		
		return (Node) subnodes.get(0);
	}
	
	/**
	 *  @generated NOT
	 */
//	private String getSubnodeTextValue(Node p_parentNode) {
//		Node subnode = this.getSubnode(p_parentNode, "#text");
//		if (subnode == null) return null;
//		
//		return subnode.getNodeValue().trim();			
//	}	

	/**
	 * @generated NOT
	 */
	private EList<Node> getSystemNodes () throws SKODSFactoryException {
		Node systemsNode = this.getSystemsNode();		
		return this.getSubnodes(systemsNode, ODSYSTEM_NODE_LITERAL);
	}

	/**
	 * @generated NOT
	 */
	private Node getSystemNode(String p_dsId) throws SKODSFactoryException {
		EList<Node> systemNodes = this.getSystemNodes();
		for (int i = 0; i < systemNodes.size(); i++) {
			Node systemNode = (Node) systemNodes.get(i);
			if (! systemNode.hasAttributes()) throw new SKODSFactoryException("ERROR : required 'id' attribute is missing in <" + ODSYSTEM_NODE_LITERAL + "> entity");
			Node attribute = systemNode.getAttributes().getNamedItem("id");
			if (attribute == null) throw new SKODSFactoryException("ERROR : required 'id' attribute is missing in <" + ODSYSTEM_NODE_LITERAL + "> entity");
			if (attribute.getNodeValue().equals(p_dsId)) return systemNode;
		}	
		return null;
	}
	
	/**
	 *  @generated NOT
	 */
	private EList<Node> getSectionNodes(Node p_parentNode) {
		return this.getSubnodes(p_parentNode, ODSECTION_NODE_LITERAL);
	}

	/**
	 *  @generated NOT
	 */
	private BOCTree getBOCTree(Node p_parentNode) throws BOCTreeException {
		Node objectConditionNode = this.getSubnode(p_parentNode, OBJECTCONDITION_NODE_LITERAL);
		if (objectConditionNode == null) return new BOCTree();
		
		NodeList childNodes = objectConditionNode.getChildNodes();
		if (childNodes.getLength() <= 0) return new BOCTree();
		
		// useless nodes supression
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node node = childNodes.item(i);
			//if (nodeName.equals("#text") && (node.getNodeValue().trim().length() != 0)) return new BOCTree(node.getNodeValue().trim());
			//if (nodeName.equals("#cdata-section") && (node.getNodeValue().trim().length() != 0)) return new BOCTree(node.getNodeValue().trim());
			if (!(node.getNodeName().equals("#text"))) return new BOCTree(node);
		}

		return new BOCTree();
	}
	
	/**
	 *  @generated NOT
	 */
	private Boolean objectSatisfyCondition(SKHierarchicalObject p_object, BOCTree p_bocTree) throws SKHierarchicalObjectException {
		if (p_bocTree.isNull()) return true;  
		
		return p_bocTree.eval(p_object);
	}
	
	/**
	 *  @generated NOT
	 *  
	 */
	private String getValueVariable(String p_variableName) {
		return "$" + p_variableName; // A MODIFIER
	}
		
	/**
	 *  @generated NOT
	 *  
	 */
	private String buildFilename(Node p_parentNode, SKHierarchicalObject p_object) throws SKODSFactoryException {
		String filename = new String("");
		
		NodeList childNodes = p_parentNode.getChildNodes();
		
		for (int i= 0; i < childNodes.getLength(); i++) {
			Node childNode = childNodes.item(i);
			String childNodeName = childNode.getNodeName();
			if (childNodeName.equals(SLASH_NODE_LITERAL))
				filename = filename.concat("/");  // A MODIFIER (utiliser le séparateur de l'OS)
			else if (childNodeName.equals("Space"))
				filename = filename.concat(" "); 
			else if (childNodeName.equals(TEXT_NODE_LITERAL))
				filename = filename.concat(childNode.getAttributes().getNamedItem("value").getNodeValue().trim());
			else if(childNodeName.equals("Variable")) {
				if (! childNode.hasAttributes())throw new SKODSFactoryException("ERROR: In <DataFile> entity, <Variable> entity has not name attribute");				
				Node attribute = childNode.getAttributes().getNamedItem("name");
				if (attribute == null)
					throw new SKODSFactoryException("ERROR: In <DataFile> entity, <Variable> entity has not name attribute");
				else {
					String variableName = attribute.getNodeValue();
					String valueVariable = this.getValueVariable(variableName);
					if (valueVariable == null)
						throw new SKODSFactoryException("ERROR: In <DataFile> entity, <Variable> '" + variableName + "' is undefined");
					else
						filename = filename.concat(valueVariable);
				}
			} else if(childNodeName.equals(INTERNALPROCEDURE_NODE_LITERAL)) {
				if (! childNode.hasAttributes())throw new SKODSFactoryException("ERROR: In <DataFile> entity, <InternalProcedure> entity has not name attribute");				
				Node attribute = childNode.getAttributes().getNamedItem("name");
				if (attribute == null)
					throw new SKODSFactoryException("ERROR: In <DataFile> entity, <InternalProcedure> entity has not name attribute");
				else {
					String procedureName = attribute.getNodeValue();
					if (procedureName.length()==0) throw new SKODSFactoryException("ERROR: In <DataFile> entity, <InternalProcedure> entity has not name attribute");
					try {
						attribute = childNode.getAttributes().getNamedItem("subject");
						if ((attribute == null) || (attribute.getNodeValue().equals("context"))) {
							Method method = this.getClass().getMethod(procedureName, (Class []) null);
							final String strVal = (String) method.invoke(this, (Object []) null);
							
							if ( strVal == null ) {
								return null;
							}
							
							filename = filename.concat( strVal );
						}
						else if (attribute.getNodeValue().equals("currentObject")) {
							Method method = p_object.getClass().getMethod(procedureName, (Class []) null);
							filename = filename.concat((String) method.invoke(p_object, (Object []) null));						
						} else throw new SKODSFactoryException("ERROR: In <DataFile> entity, <InternalProcedure> entity has not valid subject");
					} catch (Exception e) {
						throw new SKODSFactoryException(e.getMessage(), e );
					}			
				}
			} else if (childNodeName.equals("#text")) {
			} else if (! childNodeName.equals("#comment"))throw new SKODSFactoryException("ERROR: In <DataFile> entity, TAG <" + childNodeName + "> unknows");				
		}
		return (new Path(filename)).toOSString();
	}
	
	/**
	 *  @generated NOT
	 *  
	 */
	private SKODData buildEmptyDom(String p_xmlFilename, String p_fieldname, SKHierarchicalObject p_object) throws SKODSFactoryException {
       	Document document;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    try {
	      DocumentBuilder builder = factory.newDocumentBuilder();
	      document = builder.newDocument();  
	      Element root = (Element)document.createElement("SKHierarchicalObject"); 
	      document.appendChild(root);
	      root.setAttribute("class", p_object.getClass().getSimpleName());
	      root.setAttribute("name", p_object.getName());
	      Node node = root.appendChild(document.createElement(p_fieldname));
	      node.setTextContent("");
	      domData.put(p_xmlFilename, document);
	      return new SKODDataImpl(document, node);	      
	    } catch (ParserConfigurationException e) {
	    	throw new SKODSFactoryException(e.getMessage());
	    }
	}
	

	/**
	 *  @generated NOT
	 *  
	 */
	private SKODData loadData(String p_xmlFilename, String p_fieldname, SKHierarchicalObject p_object) throws SKODSFactoryException {
		try {
			domDataKeys.put(p_fieldname, p_xmlFilename);
			
			Document dom;			
			if (domData.containsKey(p_xmlFilename))
				dom = domData.get(p_xmlFilename);
			else {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();   
		        DocumentBuilder builder = factory.newDocumentBuilder();
		        dom = builder.parse(new File(p_xmlFilename));
				if (dom == null) throw new SKODSFactoryException("ERROR : no DOM object !");
				if (! dom.hasChildNodes()) throw new SKODSFactoryException("ERROR : no <" + p_fieldname + "> entity");
		        domData.put(p_xmlFilename, dom);
			}

			Node firstNode = (Node) this.rejectSubnodes(dom, "#comment").get(0);			
			if (firstNode == null ) throw new SKODSFactoryException("ERROR : no <SKHierarchicalObject> entity");
			NodeList childNodes = firstNode.getChildNodes();
			Node childNode = null;
			for (int i = 0; i < childNodes.getLength(); i++) {
				if (childNodes.item(i).getNodeName().equals(p_fieldname)) childNode = childNodes.item(i);				
			}
			String value = "";
			if (childNode == null)  {
				childNode = firstNode.appendChild(dom.createElement(p_fieldname));		
				childNode.setTextContent(value);
				return new SKODDataImpl(dom, childNode);
			} else {
				value = childNode.getTextContent();		
				return new SKODDataImpl(value, dom, childNode);
			}		
			
        } catch (SAXParseException e) {
            // Error generated by the parser
            throw new SKODSFactoryException("\n** Parsing error" + ", line " +
                e.getLineNumber() + ", uri " + e.getSystemId() + "   " + e.getMessage());
        } catch (SAXException e) {
            // Error generated during parsing
            throw new SKODSFactoryException(e.getMessage());
        } catch (ParserConfigurationException e) {
            // Parser with specified options can't be built
            throw new SKODSFactoryException(e.getMessage());
        } catch (FileNotFoundException e) {
        	return buildEmptyDom(p_xmlFilename, p_fieldname, p_object);
        }
        catch (IOException e) {
            // I/O error
            throw new SKODSFactoryException(e.getMessage());
        }
	}
	/**
	 *  @generated NOT
	 *  
	 */
	private SKODData loadExterneData(String p_xmlFilename, String p_fieldname, SKHierarchicalObject p_object) throws SKODSFactoryException {
		try {
			domDataKeys.put(p_fieldname, p_xmlFilename);
			
			Document dom;			
			if (domData.containsKey(p_xmlFilename))
				dom = domData.get(p_xmlFilename);
			else {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();   
		        DocumentBuilder builder = factory.newDocumentBuilder();
		        dom = builder.newDocument();
				domData.put(p_xmlFilename, dom);
			}

			return new SKODDataImpl(dom, null);
			
		} catch (ParserConfigurationException e) {
            // Parser with specified options can't be built
            throw new SKODSFactoryException(e.getMessage());
        } 
	}

	/**
	 *  @generated NOT
	 */
	private SKODData recoverData(Node p_sectionNode, SKHierarchicalObject p_object) throws SKODSFactoryException {
		Node recoveringNode = this.getSubnode(p_sectionNode, DATARECOVERING_NODE_LITERAL);		
		if ((recoveringNode == null) || (! recoveringNode.hasChildNodes())) return null;

		Node childNode = this.getSubnode(recoveringNode, INTERNALPROCEDURE_NODE_LITERAL);
		if(childNode != null) {
			if (! childNode.hasAttributes()) throw new SKODSFactoryException("missing 'name' attribute in <InternalProcedure>");
			Node attribute = childNode.getAttributes().getNamedItem("name");
			if (attribute == null ) throw new SKODSFactoryException("missing 'name' attribute in <InternalProcedure>");		
			try {
				String procedureName = attribute.getNodeValue();					
				if (procedureName.length()==0) throw new SKODSFactoryException("missing 'name' attribute in <InternalProcedure>");
				attribute = childNode.getAttributes().getNamedItem("subject");
				if ((attribute == null) || (attribute.getNodeValue().equals("context"))) {
					Method method = this.getClass().getMethod(procedureName, (Class []) null);
					return new SKODDataImpl((String) method.invoke(this, (Object []) null));
				} else if (attribute.getNodeValue().equals("currentObject")) {
					Method method = p_object.getClass().getMethod(procedureName, (Class []) null);
					return new SKODDataImpl((String) method.invoke(p_object, (Object []) null));						
				} else throw new SKODSFactoryException("ERROR: In <DataRecovering> entity, <InternalProcedure> entity has not valid subject");
			} catch (Exception e) {
				throw new SKODSFactoryException(e.getMessage());
			}
		}

		childNode = this.getSubnode(recoveringNode, DATAFIELD_NODE_LITERAL);
		if (childNode == null)  throw new SKODSFactoryException("missing required <DataField> in <DataRecovering>");
		if (! childNode.hasAttributes()) throw new SKODSFactoryException("missing 'name' attribute in <DataField>");
		Node attribute = childNode.getAttributes().getNamedItem("name");
		if (attribute == null ) throw new SKODSFactoryException("missing 'name' attribute in <DataField>");

		String filename = null;
		

		childNode = this.getSubnode(recoveringNode, "ExterneDataFile");
		if (childNode != null) {
			filename = this.buildFilename(childNode, p_object);
			return this.loadExterneData(filename, attribute.getNodeValue(), p_object);
		}

		childNode = this.getSubnode(recoveringNode, DATAFILE_NODE_LITERAL);
		if (childNode != null) 
			filename = this.buildFilename(childNode, p_object);
		else if (currentODSDatafileNode != null)
			filename = this.buildFilename(currentODSDatafileNode, p_object);
		else throw new SKODSFactoryException("missing <DataFile> Tag for recovering data");
		
		if ( filename == null ) {
			return null;
		}
		
		SKODData res = this.loadData(filename, attribute.getNodeValue(), p_object); 
		
		res.getNode().setUserData("type", this.getSubnode(p_sectionNode,"type"), null);
		
		return res;
	}
	
	
	/**
	 *  @generated NOT
	 */
	private String getODSectionLabel(Node p_sectionNode, SKHierarchicalObject p_object) throws SKODSFactoryException {
		Node labelNode = this.getSubnode(p_sectionNode, LABEL_NODE_LITERAL);
		if (labelNode == null) return "";
		
		NamedNodeMap attributes = labelNode.getAttributes();			
		
		Node attribute = attributes.getNamedItem("procedure");
		if (attribute == null)
			return attributes.getNamedItem("value").getNodeValue();
		else {
			try {
				String procedureName = attribute.getNodeValue();					
				attribute = attributes.getNamedItem("subject");
				if ((attribute == null) || (attribute.getNodeValue().equals("context"))) {
					Method method = this.getClass().getMethod(procedureName, (Class []) null);
					return (String) method.invoke(this, (Object []) null);
				} else if (attribute.getNodeValue().equals("currentObject")) {
					Method method = p_object.getClass().getMethod(procedureName, (Class []) null);
					return (String) method.invoke(p_object, (Object []) null);						
				} else throw new SKODSFactoryException("ERROR: In <Label> entity, procedure attribute has not valid subject");
			} catch (Exception e) {
				throw new SKODSFactoryException(e.getMessage());
			}
		}
	}
	
	/**
	 *  @generated NOT
	 */
	private SKODSection performLoopCondition(SKODSection p_section, EList<Node> p_subsectionNodes, SKODSMode p_mode, SKHierarchicalObject p_object, String p_procedure, String p_eMode) throws SKODSFactoryException {
		try {		
			Method method = p_object.getClass().getMethod(p_procedure, (Class []) null);
			@SuppressWarnings("unchecked")
			BasicEList<SKHierarchicalObject> objects = (BasicEList<SKHierarchicalObject>) method.invoke(p_object, (Object []) null);
			if (objects.size() > 0) {
				for (int i = 0; i < objects.size(); i++) {
					for (int j = 0; j < p_subsectionNodes.size(); j++) {
						SKODSection section = this.getODSection(p_section, (Node) p_subsectionNodes.get(j), p_mode, (SKHierarchicalObject) objects.get(i));
						if (p_eMode.equals("deep")) this.performLoopCondition(section, p_subsectionNodes, p_mode, (SKHierarchicalObject) objects.get(i), p_procedure, p_eMode);
					}
				} 					
			}
			return p_section;
		} catch (Exception e) {
			throw new SKODSFactoryException(e.getMessage());
		}
}
		
	
	/**
	 *  @generated NOT
	 */
	private SKODSection getODSection(SKODSection p_parentSection, Node p_sectionNode, SKODSMode p_mode, SKHierarchicalObject p_object) throws SKODSFactoryException {
		if (! p_sectionNode.hasAttributes()) return null;		
		NamedNodeMap attributes = p_sectionNode.getAttributes();
		
		Node attribute = attributes.getNamedItem( "id" );
		
		if ( attribute == null ) {
			throw new SKODSFactoryException( "In ODSection <" + p_parentSection.getId() + "> required attribute 'id'" );
		}
		
		String id = attribute.getNodeValue();
					
		try {
			String label = getODSectionLabel(p_sectionNode, p_object);
		
			BOCTree bocTree = getBOCTree( p_sectionNode );
			
			if ( !objectSatisfyCondition( p_object, bocTree ) ) {
				return null;	
			}
						
			final SKODData data = recoverData(p_sectionNode, p_object);
			SKODSection section = new SKODSectionImpl(id, label, data, p_sectionNode);
			
			if ( p_parentSection != null ) {
				section.setParent(p_parentSection);
			}

			Node loopConditionNode = this.getSubnode(p_sectionNode, "LoopCondition");
			if (loopConditionNode == null) {
				EList<Node> subsectionNodes = this.getSectionNodes(p_sectionNode);			
				if (subsectionNodes != null) {
					for (int i = 0; i < subsectionNodes.size(); i++) this.getODSection(section, (Node) subsectionNodes.get(i), p_mode, p_object);
				}
			} else { /* LoopCondition */
				if (! loopConditionNode.hasAttributes())throw new SKODSFactoryException("In ODSection <" + section.getId() + "> " + ", in <LoopCondition> missing required attribute");
				attributes = loopConditionNode.getAttributes();
				attribute = attributes.getNamedItem("procedure");
				if (attribute ==  null)throw new SKODSFactoryException("In ODSection <" + section.getId() + "> " + ", in <LoopCondition> 'procedure' missing required attribute");
				String procedure = attribute.getNodeValue();
				if (procedure.length() == 0) throw new SKODSFactoryException("missing 'procedure' name in <LoopCondition>");		
				String mode = "flat"; // Default mode
				attribute = attributes.getNamedItem("mode");
				if (attribute != null) {
					mode = attribute.getNodeValue();
					if (! mode.equals("deep")) mode = "flat" ; // 2 values modes : deep/flat
				}
				EList<Node> subsectionNodes = this.getSectionNodes(loopConditionNode);
				if (subsectionNodes != null) {
					this.performLoopCondition(section, subsectionNodes, p_mode, p_object, procedure, mode);
				}
			}
			return section;
		} catch (BOCTreeException e) {
			throw new SKODSFactoryException("In ODSection <" + id + "> " + e.getMessage(), e );
		} catch (SKHierarchicalObjectException e) {
			throw new SKODSFactoryException("In ODSection <" + id + "> " + e.getMessage(), e );
		} catch (SKODSFactoryException e) {
			throw new SKODSFactoryException("In ODSection <" + id + "> " + e.getMessage(), e );
		}
	}
	
	/**
	 *  @generated NOT
	 */
	private EList<SKODSection> getODSections(Node p_systemNode, SKODSMode p_mode, SKHierarchicalObject p_object) throws SKODSFactoryException {
		EList<Node> sectionNodes = this.getSectionNodes(p_systemNode);
		if (sectionNodes.size() <= 0) return null;
		
		BasicEList<SKODSection> sections = new BasicEList<SKODSection>();
		for (int i = 0; i < sectionNodes.size(); i++) {
			SKODSection section = this.getODSection(null, (Node) sectionNodes.get(i), p_mode, p_object);
			
			if (section != null) {
				sections.add(section);
			}
		}
		return sections;				
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * 
	 * Returns a SKODSystem with ID p_dsId for p_object SKHierarchicalObject
	 */
	public SKODSystem getODSystem(String p_dsId, SKHierarchicalObject p_object) throws SKODSFactoryException {
		currentObject = p_object;
		domData = new HashMap<String, Document>();
		domDataKeys = new HashMap<String, String>();

		Node systemNode = this.getSystemNode(p_dsId);
		if (systemNode == null) return null;
			
		NamedNodeMap attributes = systemNode.getAttributes();

		Node attribute = attributes.getNamedItem("label");
		if (attribute == null) throw new SKODSFactoryException("In ODSystem <" + p_dsId + "> " + "required attribute : label");
		String label = attribute.getNodeValue();
		
		attribute = attributes.getNamedItem("mode");
		SKODSMode mode = SKODSMode.getByName((attribute == null) ? "HIERARCHICAL" : attribute.getNodeValue());

		attribute = attributes.getNamedItem("styleSheet");
		String styleSheet = (attribute == null) ? null : attribute.getNodeValue();
		
		Node recoveringNode = this.getSubnode(systemNode, DATARECOVERING_NODE_LITERAL);		
		if ((recoveringNode != null) && (recoveringNode.hasChildNodes())) {
			currentODSDatafileNode = this.getSubnode(recoveringNode, DATAFILE_NODE_LITERAL);
		}
		
		EList<SKODSection> sections = this.getODSections(systemNode, mode, p_object);
		SKODSystem odSystem = new SKODSystemImpl(p_dsId, label, mode, styleSheet, sections, domData, domDataKeys);
		return odSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectDescriptionModelPackage.Literals.SKODS_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Document getDomODS() {
		return domODS;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Node getCurrentODSDatafileNode() {
		return currentODSDatafileNode;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HashMap<String, Document> getDomData() {
		return domData;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SKHierarchicalObject getCurrentObject() {
		if (currentObject != null && currentObject.eIsProxy()) {
			InternalEObject oldCurrentObject = (InternalEObject)currentObject;
			currentObject = (SKHierarchicalObject)eResolveProxy(oldCurrentObject);
			if (currentObject != oldCurrentObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectDescriptionModelPackage.SKODS_FACTORY__CURRENT_OBJECT, oldCurrentObject, currentObject));
			}
		}
		return currentObject;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private SKHierarchicalObject basicGetCurrentObject() {
		return currentObject;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCurrentWorkspaceDirectory() {
		return Platform.getInstanceLocation().getURL().getPath();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCurrentProjectDirectory() {
		String path = getCurrentWorkspaceDirectory();
		path += File.separator+currentObject.eResource().getURI().segment(1);
		return(path);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCurrentDesignDirectory() {
		String path = getCurrentWorkspaceDirectory();
		path += currentObject.eResource().getURI().trimSegments(1).toPlatformString(true);
		return(path);
	}


/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentObjectDirectory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentObjectLocation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public String getCurrentObjectDirectory() {
//		
//		return (getCurrentDesignDirectory()+File.separator+getCurrentObjectLocation());
//	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
//	public String getCurrentObjectLocation() {
//		String path = "";
//		SKHierarchicalObject parent = currentObject;
//		while (parent.getParent()!=null){
//			parent = parent.getParent();
//			path = parent.getId()+File.separator+path;
//		}
//		if (currentObject.isFeature()){
//			parent = ((SKFeature)parent).getComponent();
//			path = parent.getId()+File.separator+path;
//			while (parent.getParent()!=null){
//				parent = parent.getParent();
//				path = parent.getId()+File.separator+path;
//			}
//		}
//		if (currentObject.isRelation()){
//			Object tmp = ((SKRelation)parent).getObjects().get(0);
//			if (tmp instanceof SKFeature){
//				parent = ((SKFeature)tmp).getComponent().getParent();
//				if (parent!=null) {
//					path = parent.getId()+File.separator+path;
//					while (parent.getParent()!=null){
//						parent = parent.getParent();
//						path = parent.getId()+File.separator+path;
//					}
//				}
//			}
//			else if (tmp instanceof SKComponent){
//				parent = ((SKComponent)tmp).getParent();
//				if (parent!=null) {
//					path = parent.getId()+File.separator+path;
//					while (parent.getParent()!=null){
//						parent = parent.getParent();
//						path = parent.getId()+File.separator+path;
//					}
//				}
//			}
//		}
//		return path;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCurrentProjectName() {
		return(currentObject.eResource().getURI().segment(1));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCurrentDesignName() {
		String filename = currentObject.eResource().getURI().lastSegment();
		return(filename.substring(0, filename.indexOf(".")));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCurrentObjectName() {
		return(this.getCurrentObject().getNotRenamedName());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCurrentObjectId() {
		return(this.getCurrentObject().getId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Cette méthode est un bouchon !
	 * @generated NOT
	 */
	public String getCurrentDesignTree() {
		return("CurrentDesignTree");
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Cette méthode est un bouchon !
	 * @generated NOT
	 */
	public String getCurrentInheritanceTree() {
		return("CurrentInheritanceTree");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectDescriptionModelPackage.SKODS_FACTORY__DOM_ODS:
				return getDomODS();
			case ObjectDescriptionModelPackage.SKODS_FACTORY__CURRENT_ODS_DATAFILE_NODE:
				return getCurrentODSDatafileNode();
			case ObjectDescriptionModelPackage.SKODS_FACTORY__DOM_DATA:
				return getDomData();
			case ObjectDescriptionModelPackage.SKODS_FACTORY__CURRENT_OBJECT:
				if (resolve) return getCurrentObject();
				return basicGetCurrentObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ObjectDescriptionModelPackage.SKODS_FACTORY__DOM_ODS:
				return DOM_ODS_EDEFAULT == null ? domODS != null : !DOM_ODS_EDEFAULT.equals(domODS);
			case ObjectDescriptionModelPackage.SKODS_FACTORY__CURRENT_ODS_DATAFILE_NODE:
				return CURRENT_ODS_DATAFILE_NODE_EDEFAULT == null ? currentODSDatafileNode != null : !CURRENT_ODS_DATAFILE_NODE_EDEFAULT.equals(currentODSDatafileNode);
			case ObjectDescriptionModelPackage.SKODS_FACTORY__DOM_DATA:
				return DOM_DATA_EDEFAULT == null ? domData != null : !DOM_DATA_EDEFAULT.equals(domData);
			case ObjectDescriptionModelPackage.SKODS_FACTORY__CURRENT_OBJECT:
				return currentObject != null;
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
		result.append(" (domODS: ");
		result.append(domODS);
		result.append(", currentODSDatafileNode: ");
		result.append(currentODSDatafileNode);
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
	public EList<String> getODSystemsId() {
		try {
			EList<Node> odsystems = getSystemNodes();
			EList<String> result = new BasicEList<String>(odsystems.size());
			for (int i = 0; i < odsystems.size(); i++) {
				result.add(((Node) odsystems.get(i)).getAttributes()
						.getNamedItem("id").getNodeValue());
			}
			return result;
		} catch (SKODSFactoryException e) {
			return new BasicEList<String>();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getODSystemsLabel() {
		try {
			EList<Node> odsystems = getSystemNodes();
			EList<String> result = new BasicEList<String>(odsystems.size());
			for (int i = 0; i < odsystems.size(); i++) {
				result.add(((Node) odsystems.get(i)).getAttributes()
						.getNamedItem("label").getNodeValue());
			}
			return result;
		} catch (SKODSFactoryException e) {
			return new BasicEList<String>();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<String, Document> rebuildDomData(SKODSystem oldOdsystem,
			SKHierarchicalObject p_object) throws SKODSFactoryException{
		Map<String, Document> newDomData = new HashMap<String, Document>();
		Map<String, String> newDomDataKeys = this.getODSystem(oldOdsystem.getId(), p_object).getDomDataKeys();
		Map<String, Document> oldDomData = oldOdsystem.getDomData();
		Map<String, String> oldDomDataKeys = oldOdsystem.getDomDataKeys();
		Iterator<String> it = oldDomDataKeys.keySet().iterator();
		do {
			String currentKey = it.next();
			String oldFilename = oldDomDataKeys.get(currentKey);
			Document doc = oldDomData.get(oldFilename);
			String newFilename = newDomDataKeys.get(currentKey);
			if (newFilename!=null && doc != null) newDomData.put(newFilename, doc);
		} while (it.hasNext());
		return newDomData;
	}

} //SKODSFactoryImpl