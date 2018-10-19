package com.itacademy.zenkouv.megapolis.run;

import com.itacademy.zenkouv.megapolis.helper.PersonList;
import com.itacademy.zenkouv.megapolis.model.Ticket;
import com.itacademy.zenkouv.megapolis.model.person.Passanger;
import com.itacademy.zenkouv.megapolis.model.transport.TransportType;

public class Main {
	public static void main(String[] args) {

		
		PersonList passangers = new PersonList();
		PersonList spassangers;
		
		spassangers = passangers.add(new Passanger(new Ticket("North",12,TransportType.bus), "Anton"));
		
		System.out.println(spassangers.getPersonList()[0]);
	}
}
