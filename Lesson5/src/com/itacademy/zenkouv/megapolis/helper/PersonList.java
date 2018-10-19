package com.itacademy.zenkouv.megapolis.helper;

import com.itacademy.zenkouv.megapolis.model.person.Person;

public final class PersonList {

	private Person[] personList;

	public PersonList() {
		personList = new Person[0];
	}

	public PersonList(int size) {
		personList = new Person[size];
	}

	public Person[] getPersonList() {
		return personList;
	}

	public void setPersonList(Person[] personList) {
		this.personList = personList;
	}

	private Person[] add(int index, Person person) {
		Person[] newPersonList = new Person[index];
		if (personList[0] == null) {
			newPersonList[0] = person;
		} else {
			for (int i = 0; i < personList.length; i++) {
				newPersonList[i] = personList[i];
			}
			newPersonList[index] = person;
		}
		return newPersonList;
	}

	public PersonList add(Person person) {
		int size = personList.length + 1;
		PersonList newPersonList = new PersonList(size);
		newPersonList.add(size, person);
		return newPersonList;
	}

	public PersonList remove(Person person) {
		int size = this.personList.length - 1;
		PersonList newPersonList = new PersonList(size);

		if (personList.length == 0) {
			return null;
		} else {
			for (Person p : personList) {
				if (!p.equals(person)) {
					newPersonList.add(p);
				}
			}
		}
		return newPersonList;
	}
}
