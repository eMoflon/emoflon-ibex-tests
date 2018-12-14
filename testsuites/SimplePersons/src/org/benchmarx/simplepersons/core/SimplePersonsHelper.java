package org.benchmarx.simplepersons.core;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;

import SimplePersons.Person;
import SimplePersons.PersonRegister;
import SimplePersons.SimplePersonsFactory;

public class SimplePersonsHelper {
	public void createFemale(PersonRegister register, String name){
		Person p = SimplePersonsFactory.eINSTANCE.createFemale();
		p.setName(name);
		register.getPersons().add(p);
	}

	public void renamePerson(PersonRegister register, String from, String to) {
		register.getPersons().stream()
				.filter(p -> p.getName().equals(from))
				.forEach(p -> p.setName(to));
	}

	public void deletePerson(PersonRegister register, String name) {
		Optional<Person> toBeDeleted = register.getPersons().stream()
				.filter(p -> p.getName().equals(name)).findAny();
		
		toBeDeleted.ifPresent(p -> EcoreUtil.delete(p));
	}
}
