package com.mission_impossible.Vehicle;

public class Vehicle {
	private String vehicleName;
	private Double speed;
	private Double craterTime;
	
	public Vehicle() {
		super();
	}
	
	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public void setCraterTime(Double craterTime) {
		this.craterTime = craterTime;
	}

	public Double getSpeed() {
		return speed;
	}

	public Double getCraterTime() {
		return craterTime;
	}
}
