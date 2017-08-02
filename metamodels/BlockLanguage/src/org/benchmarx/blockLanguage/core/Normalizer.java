package org.benchmarx.blockLanguage.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Normalizer<T> implements Comparator<T> {
	protected boolean checkAttributeValues;
	
	Normalizer(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
	}

	@Override
	public int compare(T o1, T o2) {
		String o1String = stringify(o1);
		String o2String = stringify(o2);
		
		return o1String.compareTo(o2String);
	}
	
	public void normalize(List<T> objects){
		Collections.sort(objects, this);
	}
	
	public abstract String stringify(T o);
}
