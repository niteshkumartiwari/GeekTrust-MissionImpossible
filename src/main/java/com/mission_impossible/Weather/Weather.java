package com.mission_impossible.Weather;

import java.util.HashSet;
import com.mission_impossible.Vehicle.Vehicle;

public class Weather {
	private Double changePercentage;
	private Boolean increase;
	private HashSet<Vehicle> allowedVehicles;

	public Weather() {
		super();
	}

	public HashSet<Vehicle> getAllowedVehicles() {
		return allowedVehicles;
	}
	
	public void setAllowedVehicles(HashSet<Vehicle> allowedVehicles) {
		this.allowedVehicles = allowedVehicles;
	}

	public void setChangePercentage(Double changePercentage) {
		this.changePercentage = changePercentage;
	}
	
	public void setIncrease(Boolean increase) {
		this.increase= increase;
	}

	public Double getChangePercentage() {
		return changePercentage;
	}
	
	public Boolean getIncrease() {
		return increase;
	}
		
}
