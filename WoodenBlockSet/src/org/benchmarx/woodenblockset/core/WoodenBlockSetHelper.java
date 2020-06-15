package org.benchmarx.woodenblockset.core;

import org.eclipse.emf.ecore.EClass;

import WoodenBlockSet.BlockSet;
import WoodenBlockSet.Construction;
import WoodenBlockSet.Cube;
import WoodenBlockSet.Cuboid;
import WoodenBlockSet.Playroom;
import WoodenBlockSet.Shape3D;
import WoodenBlockSet.TriangularPrism;
import WoodenBlockSet.WoodenBlockSetFactory;
import WoodenBlockSet.WoodenBlockSetPackage;

public class WoodenBlockSetHelper {

	public void setColors(Playroom root) {
		root.getBlocksets().forEach(set -> {
			set.getConstructions().forEach(constr -> {
				constr.getComponents().forEach(comp -> {
					if (comp instanceof Cube)
						comp.setColor("green");
					else if (comp instanceof TriangularPrism)
						comp.setColor("blue");
					else if (comp instanceof Cuboid)
						comp.setColor("red");
				});
			});
		});
	}
	
	public Construction getConstruction(Playroom root, String name) {
		for (BlockSet set : root.getBlocksets()) {
			for (Construction constr : set.getConstructions()) {
				if (constr.getName().equals(name))
					return constr;
			}
		}
		return null;
	}
	
	public Shape3D createCube(Construction constr, String color) {
		return createShape3D(constr, WoodenBlockSetPackage.eINSTANCE.getCube(), color);
	}
	
	public Cuboid createCuboid(Construction constr, String color) {
		return (Cuboid) createShape3D(constr, WoodenBlockSetPackage.eINSTANCE.getCuboid(), color);
	}
	
	public TriangularPrism createTriangularPrism(Construction constr, String color) {
		return (TriangularPrism) createShape3D(constr, WoodenBlockSetPackage.eINSTANCE.getTriangularPrism(), color);
	}

	private Shape3D createShape3D(Construction constr, EClass eClass, String color) {
		Shape3D shape = (Shape3D) WoodenBlockSetFactory.eINSTANCE.create(eClass);
		shape.setColor(color);
		constr.getComponents().add(shape);
		return shape;
	}

}
