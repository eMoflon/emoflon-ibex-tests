package org.benchmarx.database.core

import java.util.Comparator
import java.util.List
import Database.Table
import java.util.Collections
import Database.Column
import java.util.ArrayList

class TableNormalizer implements Comparator<Table>{
	boolean checkAttributeValues
	
	ColumnNormalizer columnNormalizer
	
	new (boolean checkAttributeValues){
		this.checkAttributeValues = checkAttributeValues
		columnNormalizer = new ColumnNormalizer(checkAttributeValues)
	}
	
	override compare(Table table1, Table table2) {
		val tableString1 = stringify(table1)
		val tableString2 = stringify(table2)
		
		return tableString1.compareTo(tableString2)
	}
	
	def normalize(List<Table> tables) {
		Collections.sort(tables, this)
	}
	
	def stringify(Table table) {
		return '''
		Table {
			heading = "«IF checkAttributeValues»«table.heading»«ELSE»table«ENDIF»",
			columns = [
			«val List<Column> sortedList = new ArrayList<Column>(table.columns)»
			«columnNormalizer.normalize(sortedList)»
			«FOR c : sortedList SEPARATOR ", "»
				«columnNormalizer.stringify(c)»
			«ENDFOR»
			]
		}
		'''
	}
	
}