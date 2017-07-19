package org.benchmarx.database.core;

import Database.Column;
import Database.DB;
import Database.DatabaseFactory;
import Database.Table;

public class DatabaseHelper {

	public void createTable(DB db, String heading){
		Table t = DatabaseFactory.eINSTANCE.createTable();
		t.setHeading(heading);
		db.getTables().add(t);
	}
	
	public void createColumnInSingleTable(DB db, String name){
		createColumnInTable(db, name, 0);
	}
	
	public void createColumnInTable(DB db, String name, int pos){
		Table t = db.getTables().get(pos);
		
		Column c = DatabaseFactory.eINSTANCE.createColumn();
		c.setName(name);
		
		t.getColumns().add(c);
	}
}
