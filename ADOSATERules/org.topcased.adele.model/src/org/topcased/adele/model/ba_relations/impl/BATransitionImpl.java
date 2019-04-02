/**
 * <copyright>
 * </copyright>
 *
 * $Id: BATransitionImpl.java,v 1.4 2013-01-04 15:21:51 aschach Exp $
 */
package org.topcased.adele.model.ba_relations.impl;

import org.eclipse.emf.ecore.EClass;
import org.topcased.adele.model.ba_relations.BATransition;
import org.topcased.adele.model.ba_relations.Ba_relationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BA Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BATransitionImpl extends BARelationImpl implements BATransition {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BATransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ba_relationsPackage.Literals.BA_TRANSITION;
	}

	/**
	 * Test if the current element is an behavior transition
	 * @return boolean
	 * @generated NOT
	 */
	public boolean isBATransition(){
		return true;
	}

	/**
	 * @generated NOT
	 */
//	public String aadlSerialization(String packageName, String annexName, ResourceSet res, SKODSFactory odStructure) {
//		String aadl = "";
//		String component_type_identifier="NIL";
//		String component_implementation_identifier="NIL";	
//		
//		ADELE_Component containingCompo = (ADELE_Component) eContainer();
//		if (containingCompo.getName().contains(".")) {
//			StringTokenizer tok = new StringTokenizer(containingCompo.getName(), ".");
//			component_type_identifier=tok.nextToken();
//			component_implementation_identifier=tok.nextToken();
//		} else if ( containingCompo.getClassifier()==null ) {
//			component_type_identifier=containingCompo.getName() +"_" + containingCompo.getId().replaceAll("-", "_");
//			component_implementation_identifier=containingCompo.getImplementationName();
//			if (component_implementation_identifier=="")
//				component_implementation_identifier="impl";
//		}
//
//		SKObject source = getObjects().get(0);
//		SKObject target;
//		if (getObjects().size()==1)
//			target = source;
//		else
//			target = getObjects().get(1);
//		
//		aadl += "isBATransition('"+packageName+"','"+component_type_identifier+"','"+
//				component_implementation_identifier+"','"+annexName+"','"+name+"','"+
//				source.getName()+"','"+target.getName()+"','0','0').\n";
//		
//		aadl += calculateODSFacts(odStructure, packageName, component_type_identifier, component_implementation_identifier,annexName);
//		
//		return aadl;
//	}
//	
//	private String calculateODSFacts(SKODSFactory odStructure, String packageName, String component_type_identifier, String component_implementation_identifier, String annexName){
//		String aadl = "";
//
//		try {
//			SKODSystem odSystem = odStructure.getODSystem(odStructure.getODSystemsId().get(0), (SKHierarchicalObject)this);
//			SKODSection aadlPropertiesSection = getAadlPropertiesSection(odSystem.getSections());
//			
//			//for (SKODSection section : aadlPropertiesSection.getChildren()){
//			//	aadl += calculateODSectionFacts(section.getChildren(), odSystem,packageName, component_type_identifier, component_implementation_identifier,annexName);
//			//}
//			aadl += calculateODSectionFacts(aadlPropertiesSection.getChildren(), odSystem,packageName, component_type_identifier, component_implementation_identifier,annexName);
//		} catch (SKODSFactoryException e) {
//			System.err.println(e.getMessage());
//		}
//		
//		return aadl;
//	}
//	
//	private SKODSection getAadlPropertiesSection(EList<SKODSection> sections) {
//		SKODSection res = null;
//		
//		for (SKODSection section : sections) {
//			if (section.getId().equalsIgnoreCase("PROPERTIES"))
//				res = section;
//			else
//				res = getAadlPropertiesSection(section.getChildren());
//			if (res!=null)
//				break;
//		}
//		return res;
//	}
//
//	private String calculateODSectionFacts(EList<SKODSection> sections, SKODSystem odSystem, String packageName, String component_type_identifier, String component_implementation_identifier, String annexName){
//		String aadl = "";
//
//		for (SKODSection section: sections){
//			SKODData tmp = section.getData();
//			if (tmp!=null && tmp.getValue()!="") {
//				String odsName = section.getId();
//				String constantType = "NIL";  // either NIL or CONSTANT
//				String assignType = "=>";    // either => or +=> or APPLIES TO
//				
//				aadl += "isProperty('"+constantType+"','"+assignType+"','"+packageName+"','"+
//								component_type_identifier+"','"+component_implementation_identifier+"','"+
//								name+"','"+odsName+"','"+tmp.getValue()+"','0').\n";
//
//			}
//			if (tmp!=null && section.getId().equalsIgnoreCase("Condition")){
//				String fileName = odSystem.getDomFilename(tmp.getDom());
//				fileName = fileName.substring(0, fileName.lastIndexOf("."))+".baguards";
//				Scanner scanner=null;
//				String conditionBlock="";
//				try {
//					scanner = new Scanner(new FileInputStream(fileName));
//					while (scanner.hasNextLine()){
//						conditionBlock+=scanner.nextLine().trim() + " ";
//					}
//					scanner.close();
//				} catch (FileNotFoundException e) {
//					if (scanner!=null)
//						scanner.close();
//				}
//				aadl+="isBAConditionBlock('"+packageName+"','"+component_type_identifier+"','"+
//									component_implementation_identifier+"','"+annexName+"','"+name+"','"+conditionBlock.trim()+"','0').\n";
//			}
//			if (tmp!=null && section.getId().equalsIgnoreCase("Action")){
//				String fileName = odSystem.getDomFilename(tmp.getDom());
//				fileName = fileName.substring(0, fileName.lastIndexOf("."))+".baaction";
//				Scanner scanner2=null;
//				String actionBlock="";
//				try {
//					scanner2 = new Scanner(new FileInputStream(fileName));
//					while (scanner2.hasNextLine()){
//						actionBlock+=scanner2.nextLine() + "\n";
//					}
//					scanner2.close();
//				} catch (FileNotFoundException e) {
//					if (scanner2!=null)
//						scanner2.close();
//				}
//				if (actionBlock.replace("{", "").replace("}", "").trim()!="") {
//					aadl+="isBAActionBlock('"+packageName+"','"+component_type_identifier+"','"+
//										component_implementation_identifier+"','"+annexName+"','"+name+"','"+actionBlock.trim().replace("{", "").replace("}", "")+"','0').\n";
//				}
//			}
//			aadl += calculateODSectionFacts(section.getChildren(), odSystem,packageName, component_type_identifier, component_implementation_identifier,annexName);
//		}
//		
//		return aadl;
//	}

} //BATransitionImpl
