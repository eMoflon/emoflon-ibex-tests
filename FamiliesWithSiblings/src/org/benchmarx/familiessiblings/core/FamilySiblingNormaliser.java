package org.benchmarx.familiessiblings.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import FamiliesWithSiblings.Family;

public class FamilySiblingNormaliser implements Comparator<Family>{

	@Override
	public int compare(Family member1, Family member2) {
		return member1.getName().compareTo(member2.getName());
	}

	public void normalize(List<Family> familySiblings){
		Comparator<Family> comparator = new FamilySiblingNormaliser();
		Collections.sort(familySiblings, comparator);
	}
}
