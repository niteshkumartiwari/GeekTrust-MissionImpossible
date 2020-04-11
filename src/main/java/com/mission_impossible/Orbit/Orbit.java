package com.mission_impossible.Orbit;

public class Orbit{
	private String orbitName;
	private Double distance;
	private Double craters;
	private Double trafficSpeed;
	
	public Orbit() {
		super();
	}
	
	public Double getTrafficSpeed() {
		return trafficSpeed;
	}
	
	public void setTrafficSpeed(Double trafficSpeed) {
		this.trafficSpeed = trafficSpeed;
	}

	public String getOrbitName() {
		return orbitName;
	}

	public void setOrbitName(String orbitName) {
		this.orbitName = orbitName;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public void setCraters(Double craters) {
		this.craters = craters;
	}

	public Double getDistance() {
		return distance;
	}

	public Double getCraters() {
		return craters;
	}
}
