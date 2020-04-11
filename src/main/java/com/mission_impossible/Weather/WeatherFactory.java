package com.mission_impossible.Weather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import com.mission_impossible.Vehicle.Vehicle;
import com.mission_impossible.Vehicle.VehicleFactory;

public class WeatherFactory {
	private static HashSet<Vehicle> getSetResult(ArrayList<String> vehicles){
		HashSet<Vehicle> allowedVehicle= new HashSet<Vehicle>();
		
		for(String vehicle: vehicles) {
			allowedVehicle.add(VehicleFactory.getVehicle(vehicle));
		}
		
		return allowedVehicle;
	}
	
	public static Weather getWeather(String weather) {
		if(weather==null) {
			return null;
		}
		else {
			Weather tmpWeather=new Weather();
			HashSet<Vehicle> allowedVehicle= new HashSet<Vehicle>();
			ArrayList<String> vehicles= new ArrayList<String>();
			
			if(weather.equalsIgnoreCase("SUNNY")) {
				vehicles.addAll(Arrays.asList("BIKE","TUKTUK","CAR"));
				allowedVehicle=getSetResult(vehicles);
				
				tmpWeather.setChangePercentage(Double.valueOf(10));
				tmpWeather.setIncrease(false);
				tmpWeather.setAllowedVehicles(allowedVehicle);
				
				return tmpWeather;
			}
			else if(weather.equalsIgnoreCase("RAINY")) {
				vehicles.addAll(Arrays.asList("TUKTUK","CAR"));
				allowedVehicle=getSetResult(vehicles);
				
				tmpWeather.setChangePercentage(Double.valueOf(20));
				tmpWeather.setIncrease(true);
				tmpWeather.setAllowedVehicles(allowedVehicle);
				
				return tmpWeather;
			}
			else if(weather.equalsIgnoreCase("WINDY")) {
				vehicles.addAll(Arrays.asList("BIKE","CAR"));
				allowedVehicle=getSetResult(vehicles);
				
				tmpWeather.setChangePercentage(Double.valueOf(0));
				tmpWeather.setIncrease(true);
				tmpWeather.setAllowedVehicles(allowedVehicle);
				
				return tmpWeather;
			}
		}
		
		return null;
	}
}
