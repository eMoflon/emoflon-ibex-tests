package org.benchmarx.woodenblockset.core;

import org.eclipse.emf.ecore.EClass;

import WoodenBlockSet.BlockSet;
import WoodenBlockSet.Construction;
import WoodenBlockSet.Cube;
import WoodenBlockSet.Cuboid;
import WoodenBlockSet.Playroom;
import WoodenBlockSet.Printed3DShape;
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

	public Construction createConstruction(BlockSet blockSet, String name) {
		Construction constr = WoodenBlockSetFactory.eINSTANCE.createConstruction();
		constr.setName(name);
		blockSet.getConstructions().add(constr);
		return constr;
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

	public Printed3DShape createPrinted3DShape(Construction constr, String name, String color) {
		Printed3DShape shape = WoodenBlockSetFactory.eINSTANCE.createPrinted3DShape();
		shape.setName(name);
		shape.setColor(color);
		constr.getComponents().add(shape);
		return shape;
	}

	public Printed3DShape createPrinted3DShape(BlockSet blockset, String name, String color) {
		Printed3DShape shape = WoodenBlockSetFactory.eINSTANCE.createPrinted3DShape();
		shape.setName(name);
		shape.setColor(color);
		blockset.getUnits().add(shape);
		return shape;
	}

	public Printed3DShape getPrinted3dShape(Playroom root, String name) {
		for (BlockSet set : root.getBlocksets()) {
			for (Printed3DShape shape : set.getUnits()) {
				if (name.equals(shape.getName()))
					return shape;
			}
		}
		return null;
	}

}
