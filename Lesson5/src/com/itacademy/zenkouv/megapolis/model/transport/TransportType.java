package com.itacademy.zenkouv.megapolis.model.transport;

public enum TransportType {

	bus, plane, train, subway, ship, ferry, tram, trolleybus, taxi;

	public String getTransportName(TransportType transport) {
		if (transport.equals(bus)) {
			return "bus";
		} else if (transport.equals(plane)) {
			return "plane";
		} else if (transport.equals(train)) {
			return "train";
		} else if (transport.equals(train)) {
			return "subway";
		} else if (transport.equals(ship)) {
			return "ship";
		} else if (transport.equals(ferry)) {
			return "ferry";
		} else if (transport.equals(tram)) {
			return "tram";
		} else if (transport.equals(trolleybus)) {
			return "trollebus";
		} else if (transport.equals(taxi)) {
			return "subway";
		}
		return "unknown transport";
	}
}
