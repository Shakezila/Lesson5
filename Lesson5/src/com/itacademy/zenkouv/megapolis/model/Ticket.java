package com.itacademy.zenkouv.megapolis.model;

import java.util.Date;

import com.itacademy.zenkouv.megapolis.model.transport.TransportType;

public class Ticket {

	private static int ticketId = 0;
	private String direction;
	private double cost;
	private Date date;
	private TransportType transport;

	public Ticket(String direction, double cost, TransportType transport) {
		ticketId++;
		this.direction = direction;
		this.cost = cost;
		date = new Date();
		this.transport = transport;
	}

	public static int getTicketId() {
		return ticketId;
	}

	public String getDirection() {
		return direction;
	}

	public double getCost() {
		return cost;
	}

	public Date getDate() {
		return date;
	}

	public TransportType getTransport() {
		return transport;
	}

	@Override
	public String toString() {
		return String.format("Ticket id[%d]: direction - %s, cost - %.2f, purchase date - %s, transport - %s", ticketId,
				direction, cost, date.toString(), transport.getTransportName(transport));
	}
}
