package org.benchmarx.classInheritanceHierarchy.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ClassInheritanceHierarchy.Attribute;

public class AttributeNormalizer implements Comparator<Attribute>{
	boolean checkAttributeValues;
			
	public AttributeNormalizer(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
	}

	@Override
	public int compare(Attribute attribute1, Attribute attribute2) {
		String attributeString1 = stringify(attribute1);
		String attributeString2 = stringify(attribute2);
		
		return attributeString1.compareTo(attributeString2);
	}
	
	public String stringify(Attribute attribute) {
		return checkAttributeValues ? attribute.getName() + ": " + attribute.getType()
									: "attribute: attributeType";
	}

	public void normalize(List<Attribute> attributes){
		Collections.sort(attributes, this);
	}
}
