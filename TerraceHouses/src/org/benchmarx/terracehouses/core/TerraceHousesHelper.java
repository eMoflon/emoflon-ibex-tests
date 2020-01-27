package org.benchmarx.terracehouses.core;

import TerraceHouses.Building;
import TerraceHouses.House;
import TerraceHouses.TerraceHousesFactory;

public class TerraceHousesHelper {

	@SuppressWarnings("unused")
	public void buildTerrace(Building root) {
		Building house1 = createHouse(root, "Apartment House", "5338 Colorado Ave NW", false);
		Building house2 = createHouse(house1, "Smith's House", "5404 Colorado Ave NW", true);
		Building house3 = createHouse(house2, "Wilson's House", "5406 Colorado Ave NW", true);
	}

	public Building createBuilding(Building buildingBefore, String name, String address) {
		Building newBuilding = TerraceHousesFactory.eINSTANCE.createBuilding();
		newBuilding.setName(name);
		newBuilding.setAddress(address);
		buildingBefore.setNext(newBuilding);
		return newBuilding;
	}

	public House createHouse(Building buildingBefore, String name, String address, boolean pitchedRoof) {
		House newHouse = TerraceHousesFactory.eINSTANCE.createHouse();
		newHouse.setName(name);
		newHouse.setAddress(address);
		newHouse.setPitchedRoof(pitchedRoof);
		buildingBefore.setNext(newHouse);
		return newHouse;
	}

	public House getHouse(Building root, String name) {
		if (root == null)
			return null;

		if (root instanceof House && root.getName().equals(name))
			return (House) root;

		return getHouse(root.getNext(), name);
	}

	public Building getBuilding(Building root, String name) {
		if (root == null)
			return null;

		if(root.getName().equals(name))
			return root;
		
		return getBuilding(root.getNext(), name);
	}

}
