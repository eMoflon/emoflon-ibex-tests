package org.benchmarx.database.core;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
		t.getColumns().add(c);
		c.setName(name);
	}
	
	public void deleteTable(DB db, String name){
		Table toBeDeleted = db.getTables().stream()
				.filter(t -> t.getHeading().equals(name)).findAny().get();
		EcoreUtil.delete(toBeDeleted);
	}
	
	public void deleteTable(DB db, int pos){
		Table toBeDeleted = db.getTables().get(pos);
		EcoreUtil.delete(toBeDeleted);
	}
	
	public void deleteColumnFromTable(DB db, String name, String tableName){
		Table table = db.getTables().stream()
				.filter(t -> t.getHeading().equals(tableName)).findAny().get();
		Optional<Column> toBeDeleted = table.getColumns().stream()
				.filter(t -> t.getName().equals(name)).findAny();
		toBeDeleted.ifPresent(t -> EcoreUtil.delete(t));
	}
	
	public void renameTable(DB db, String name, String newName){
		Optional<Table> toBeRenamed = db.getTables().stream()
				.filter(t -> t.getHeading().equals(name)).findAny();
		toBeRenamed.ifPresent(t -> t.setHeading(newName));
	}
	
	public void renameColumnFromTable(DB db, String name, String newName, String tableName){
		Table table = db.getTables().stream()
				.filter(t -> t.getHeading().equals(tableName)).findAny().get();
		Optional<Column> toBeDeleted = table.getColumns().stream()
				.filter(t -> t.getName().equals(name)).findAny();
		toBeDeleted.ifPresent(t -> t.setName(newName));
	}
}
