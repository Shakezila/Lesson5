package com.itacademy.zenkouv.megapolis.model;

public class Engine {
	private float volume;

	public Engine(float volume) {
		this.volume = volume;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return String.format("engine volume [%.1f]", volume);
	}
}
