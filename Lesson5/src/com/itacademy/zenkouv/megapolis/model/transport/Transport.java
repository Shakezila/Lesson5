package com.itacademy.zenkouv.megapolis.model.transport;

import com.itacademy.zenkouv.megapolis.model.Engine;
import com.itacademy.zenkouv.megapolis.model.person.Driver;

public abstract class Transport {

	protected String mark;
	protected String number;
	protected Engine engine;
	protected int maxSpeed;
	protected double tankVolume;
	protected Driver driver;
	
	public Transport(String mark, Engine engine, int maxSpeed, double tankVolume) {
		super();
		this.mark = mark;
		this.engine = engine;
		this.maxSpeed = maxSpeed;
		this.tankVolume = tankVolume;
	}
	
	public Transport(String mark, Engine engine, int maxSpeed, double tankVolume, String number, Driver driver) {
		this(mark, engine, maxSpeed, tankVolume);
		this.number = number;
		this.driver = driver;
	}

	public String getMark() {
		return mark;
	}

	public String getNumber() {
		return number;
	}

	public Engine getEngine() {
		return engine;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public double getTankVolume() {
		return tankVolume;
	}

	public void run() {
		System.out.println("Engine start!");
	}

	public void stop() {
		System.out.println("Engine stop!");
	}
}
