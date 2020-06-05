package org.benchmarx.terracehouses.core;

import TerraceHouses.Building;
import TerraceHouses.District;
import TerraceHouses.House;
import TerraceHouses.Structure;
import TerraceHouses.TerraceHousesFactory;

public class TerraceHousesHelper {

	@SuppressWarnings("unused")
	public void buildTerrace(Structure root) {
		Structure house1 = createHouse(root, "Apartment House", "5338 Colorado Ave NW", false);
		Structure house2 = createHouse(house1, "Smith's House", "5404 Colorado Ave NW", false);
		Structure house3 = createHouse(house2, "Wilson's House", "5406 Colorado Ave NW", true);
	}
	
	public Building createFirstBuilding(District root, String name, String address) {
		Building newBuilding = TerraceHousesFactory.eINSTANCE.createBuilding();
		newBuilding.setName(name);
		newBuilding.setAddress(address);
		root.getStreetBeginnings().add(newBuilding);
		return newBuilding;
	}

	public Building createBuilding(Structure structureBefore, String name, String address) {
		Building newBuilding = TerraceHousesFactory.eINSTANCE.createBuilding();
		newBuilding.setName(name);
		newBuilding.setAddress(address);
		structureBefore.setNext(newBuilding);
		return newBuilding;
	}

	public House createHouse(Structure structureBefore, String name, String address, boolean pitchedRoof) {
		House newHouse = TerraceHousesFactory.eINSTANCE.createHouse();
		newHouse.setName(name);
		newHouse.setAddress(address);
		newHouse.setPitchedRoof(pitchedRoof);
		structureBefore.setNext(newHouse);
		return newHouse;
	}
	
	public House getHouse(District root, String name) {
		for (Structure str : root.getStreetBeginnings()) {
			House house = getHouse(str, name);
			if(house != null)
				return house;
		}
		return null;
	}
	
	public Building getBuilding(District root, String name) {
		for (Structure str : root.getStreetBeginnings()) {
			Building building = getBuilding(str, name);
			if(building != null)
				return building;
		}
		return null;
	}

	private House getHouse(Structure root, String name) {
		if (root == null)
			return null;

		if (root instanceof House && root.getName().equals(name))
			return (House) root;

		return getHouse(root.getNext(), name);
	}

	private Building getBuilding(Structure root, String name) {
		if (root == null)
			return null;

		if(root instanceof Building && root.getName().equals(name))
			return (Building) root;
		
		return getBuilding(root.getNext(), name);
	}
	
	// EVAL //
	
	public void generateHouseRow(Structure root, int length) {
		Structure previous = root;
		for (int i = 1; i < length; i++) {
			previous = createHouse(previous, "Haus" + i, "", i > 5);
		}
	}
	
	public Structure changeRoof(Structure root, int number, boolean pitchedRoof) {
		Structure previous = root;
		for (int i = 1; i <= number; i++) {
			Structure current = previous.getNext();
			if(current == null) {
				if (previous instanceof House) {
					((House) previous).setPitchedRoof(pitchedRoof);
					return previous;
				}
				return null;
			}
			previous = current;
		}
		if (previous instanceof House) {
			((House) previous).setPitchedRoof(pitchedRoof);
			return previous;
		}
		return null;
	}

}
