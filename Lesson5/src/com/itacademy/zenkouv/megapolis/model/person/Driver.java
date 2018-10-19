package com.itacademy.zenkouv.megapolis.model.person;

import com.itacademy.zenkouv.megapolis.model.transport.TransportType;

public class Driver extends Person {

	private static int driverId = 0;
	private TransportType transport;

	public Driver(TransportType transport, String name) {
		driverId++;
		this.name = name;
		this.transport = transport;
	}

	public static int getDriverId() {
		return driverId;
	}

	public TransportType getTransport() {
		return transport;
	}

	@Override
	public String toString() {
		return String.format("Driver id[%d], name - %s, transport - %s", driverId, name,
				transport.getTransportName(transport));
	}
}
