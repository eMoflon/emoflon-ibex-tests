package org.topcased.adele.model.ADELE.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.topcased.adele.model.ADELE_Components.Component;
import org.topcased.adele.model.ADELE_Components.Package;
import org.topcased.adele.model.ADELE_Features.Feature;
import org.topcased.adele.model.ADELE_Features.FeatureGroup;
import org.topcased.adele.model.ADELE_Relations.Relation;
import org.topcased.adele.model.KernelSpices.SKComponent;
import org.topcased.adele.model.KernelSpices.SKHierarchicalObject;
import org.topcased.adele.model.KernelSpices.SKObject;

public class ADELEModelUtils {

	public static String getFullNamespace(SKHierarchicalObject object){
		if ( object.eIsProxy() ) {
			return EcoreUtil.getURI( object ).toString();
		}
		
		String namespace="";
		if (object.getName().contains("."))
			object=object.getParent();
		while(object.getParent()!=null){
			namespace = object.getParent().getName()+"::"+namespace;
			object=object.getParent();
		}
		return namespace;
	}
	
	public static String getFullNamespaceByEContainer(SKHierarchicalObject object){
		String namespace="";
		if (object.getName().contains("."))
			object=(SKHierarchicalObject) object.eContainer();
		if (object.eContainer() instanceof Package) {
			while(object.eContainer()!=null){
				namespace = ((SKHierarchicalObject) object.eContainer()).getName()+"::"+namespace;
				object=(SKHierarchicalObject) object.eContainer();
			}
		} else {
			namespace = getRootElementByEContainer(object);
		}
		return namespace;
	}
	
	public static String getRootElementByEContainer(SKHierarchicalObject object){
		if (object.getName().contains("."))
			object=(SKHierarchicalObject) object.eContainer();
		if (object.eContainer()==null)
			return "";
		else {
			while(object.eContainer()!=null){
				object=(SKHierarchicalObject) object.eContainer();
			}
			return ((SKHierarchicalObject) object).getName()+"::";
		}
	}
	
	
	public static <T extends SKObject> T findElementByName( final T p_element,
															final Collection<? extends T> p_elements ) {
		return findElement( p_element.getName(), p_elements );
	}

	public static <T extends SKObject> T findElement( 	final String p_elementName,
														final Collection<T> p_elements ) {
		if ( p_elementName != null ) {
			for ( final T element : p_elements ) {
				if ( p_elementName.equalsIgnoreCase( element.getName() ) ) {
					return element;
				}
			}
		}
		
		return null;
	}
	
	public static Component findComponentImpl( 	final Package p_adelePackage,
												final String p_compoName ) {
		for ( final SKHierarchicalObject componentType : p_adelePackage.getChildren() ) {
			final SKHierarchicalObject foundImpl = findElement( p_compoName, componentType.getChildren() );
			
			if ( foundImpl instanceof Component ) {
				return (Component) foundImpl;
			}
		}
	
		return null;
	}
	
	public static boolean isOriginalElement( final SKHierarchicalObject p_modelElement ) {
		if ( p_modelElement instanceof Feature ) {
			final Feature feature = (Feature) p_modelElement;

			// Inherited features from type are set with refinement flag. But we want to cover refined features
			// which are identified by the refined feature property.
			if (!feature.isRefinement() || feature.getRefinedFeature() != null) {
				final SKComponent component = feature.getComponent();

				if (component instanceof Component) {
					return ((Component) component).isType();
				}

				if (component instanceof FeatureGroup) {
					return ((FeatureGroup) component).isType();
				}
			}

			return false;
		}

		// Duplicated subcomponents are not considered
		if ( p_modelElement instanceof Component ) {
			final Component component = (Component) p_modelElement;
			
			if ( component.getRefinedSubcomponent() != null ) {
				return component.getRefines() != null && component.getRefines() != component.getRefinedSubcomponent().getRefines();
			}
			
			return !component.isSubcomponentRefinement();
		}

		// Duplicated connections are not considered
		if ( p_modelElement instanceof Relation ) {
			return ( (Relation) p_modelElement ).getOriginalRelation() == p_modelElement;
		}
		
		return true;
	}

	public static boolean isLegalAadlIdentifier( final String p_identifier ) {
		if ( p_identifier == null || p_identifier == "" ) {
			return false;
		}
		
		char[] chars = p_identifier.toCharArray();
		char c = chars[0];
		boolean underline = false;
		if (!(((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'))))
			return false;
		for (int x = 1; x < chars.length; x++) {
			c = chars[x];
			if ((c >= 'a') && (c <= 'z')) {
				underline = false;
				continue; // lowercase
			}
			if ((c >= 'A') && (c <= 'Z')) {
				underline = false;
				continue; // uppercase
			}
			if ((c >= '0') && (c <= '9')) {
				underline = false;
				continue; // numeric
			}
			if (c == '_' && !underline) {
				underline = true;
				continue; // numeric
			}
			return false;
		}
		return !underline;
	}
	
	public static boolean isLegalChildrenComponent( final Component p_component ) {
		return isLegalChildrenComponent( p_component, p_component.getParent() );
	}
	
	public static boolean isLegalChildrenComponent( final EObject p_child,
													final EObject p_parent ) {
		if ( p_parent == null || p_parent instanceof Package ) {
			return true;
		}

		if ( ( (Component) p_parent) .isType() ) {
			return p_parent.eClass() == p_child.eClass();
		}
		
		// The subcomponent composition rules are implemented by the editor policies. So return true for now.
		return true;
	}
}
