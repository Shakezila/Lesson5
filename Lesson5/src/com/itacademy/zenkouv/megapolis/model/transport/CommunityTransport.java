package com.itacademy.zenkouv.megapolis.model.transport;

import com.itacademy.zenkouv.megapolis.helper.PersonList;
import com.itacademy.zenkouv.megapolis.model.Engine;
import com.itacademy.zenkouv.megapolis.model.person.Driver;

public abstract class CommunityTransport extends Transport {

	protected float cost;
	protected int amountPlaces;
	protected PersonList passangers;

	public CommunityTransport(String mark, Engine engine, int maxSpeed, double tankVolume, String number,
			Driver driver, float coast, int amountPlaces, PersonList passangers) {
		super(mark, engine, maxSpeed, tankVolume, number, driver);
		this.cost = coast;
		this.amountPlaces = amountPlaces;
		this.passangers = passangers;
	}

	public CommunityTransport(String mark, Engine engine, int maxSpeed, double tankVolume, int amountPlaces) {
		super(mark, engine, maxSpeed, tankVolume);
		this.amountPlaces = amountPlaces;
	}

	public int getAmountPlaces() {
		return amountPlaces;
	}

	public float getCost() {
		return cost;
	}

	public PersonList getPassangers() {
		return passangers;
	}
}
