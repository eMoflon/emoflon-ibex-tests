package org.benchmarx.database.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Database.Column;

public class ColumnNormalizer implements Comparator<Column>{
	boolean checkAttributeValues;
	
	public ColumnNormalizer(boolean checkAttributeValues) {
		this.checkAttributeValues = checkAttributeValues;
	}

	@Override
	public int compare(Column column1, Column column2) {
		return stringify(column1).compareTo(stringify(column2));
	}
	
	public String stringify(Column column) {
		return checkAttributeValues ? ""+column.getName()
									: "column";
	}

	public void normalize(List<Column> columns){
		Collections.sort(columns, this);
	}
}
