package com.itacademy.zenkouv.megapolis.model.person;

import com.itacademy.zenkouv.megapolis.model.Ticket;

public class Passanger extends Person {

	private static int passangerId = 0;
	private Ticket ticket;

	public Passanger(Ticket ticket, String name) {
		passangerId++;
		this.ticket = ticket;
		this.name = name;
	}

	public static int getPassangerId() {
		return passangerId;
	}

	public Ticket getTicket() {
		return ticket;
	}

	@Override
	public String toString() {
		return String.format("Passanger id[%d], name - %s.\n%s", passangerId, name, ticket);
	}
}
