package com.itacademy.zenkouv.megapolis.model.transport.auto;

import com.itacademy.zenkouv.megapolis.model.Engine;
import com.itacademy.zenkouv.megapolis.model.person.Driver;
import com.itacademy.zenkouv.megapolis.model.transport.Transport;

public abstract class AutoTransport extends Transport {

	protected int cargo;
	
	public AutoTransport(String mark, Engine engine, int maxSpeed, double tankVolume, String number, Driver driver, int cargo) {
		super(mark, engine, maxSpeed, tankVolume, number, driver);
		this.cargo = cargo;
	}

	public AutoTransport(String mark, Engine engine, int maxSpeed, double tankVolume, int cargo) {
		super(mark, engine, maxSpeed, tankVolume);
		this.cargo = cargo;
	}

	public int getCargo() {
		return cargo;
	}
}
