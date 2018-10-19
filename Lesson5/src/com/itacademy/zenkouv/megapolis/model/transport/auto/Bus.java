package com.itacademy.zenkouv.megapolis.model.transport.auto;

import com.itacademy.zenkouv.megapolis.helper.PersonList;
import com.itacademy.zenkouv.megapolis.model.Engine;
import com.itacademy.zenkouv.megapolis.model.person.Driver;
import com.itacademy.zenkouv.megapolis.model.transport.CommunityTransport;

public class Bus extends CommunityTransport {
	
	private boolean cityBus;
	
	public Bus(String mark, Engine engine, int maxSpeed, double tankVolume, int amountPlaces) {
		super(mark, engine, maxSpeed, tankVolume, amountPlaces);
	}

	public Bus(String mark, Engine engine, int maxSpeed, double tankVolume, String number, Driver driver, float coast,
			int amountPlaces, PersonList passangers, boolean cityBus) {
		super(mark, engine, maxSpeed, tankVolume, number, driver, coast, amountPlaces, passangers);
		this.cityBus = cityBus;
	}

	public boolean isCityBus() {
		return cityBus;
	}

	public void setCityBus(boolean cityBus) {
		this.cityBus = cityBus;
	}
	
	
}
