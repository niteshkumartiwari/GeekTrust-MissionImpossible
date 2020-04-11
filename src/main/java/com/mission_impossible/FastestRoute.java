package com.mission_impossible;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import com.mission_impossible.Orbit.Orbit;
import com.mission_impossible.Orbit.OrbitFactory;
import com.mission_impossible.Vehicle.Vehicle;
import com.mission_impossible.Weather.Weather;
import com.mission_impossible.Weather.WeatherFactory;


public class FastestRoute {
	public static Double getRouteTime(Vehicle vehicle, Orbit orbit) {
		Double time=Double.valueOf(0);
		Double speed= vehicle.getSpeed();
		
		if(speed > orbit.getTrafficSpeed())
			speed= orbit.getTrafficSpeed();
		
		time=(orbit.getDistance()/speed)*60+ orbit.getCraters()*vehicle.getCraterTime();
		
		return time;
	}
	
	public static void changeCrater(Weather weather, Orbit orbit) {
		Boolean increase= weather.getIncrease();
		Double change= weather.getChangePercentage();
		Double changeCraters= change/100 * orbit.getCraters();
		
		Double craters;
		if(increase) {
			craters= orbit.getCraters()+changeCraters;
		}
		else {
			craters= orbit.getCraters()-changeCraters;
		}
		
		orbit.setCraters(craters);
	}
	
	public static ArrayList<String> result(String weathr,Double orbit1Traffic,Double orbit2Traffic) {
		Weather weather= WeatherFactory.getWeather(weathr);
		ArrayList<Orbit> orbits= new ArrayList<Orbit> ();
		orbits.add(OrbitFactory.getOrbit("ORBIT1",orbit1Traffic));
		orbits.add(OrbitFactory.getOrbit("ORBIT2",orbit2Traffic));
		HashSet<Vehicle> allowedVehicles= weather.getAllowedVehicles();
		
		String resOrbit="",resVehicle="";
		Double minTime= Double.MAX_VALUE;
		
		//Change the crater for orbits as per weather
		for(Orbit orbit: orbits) {
			changeCrater(weather,orbit);
		}
			
		//Finding fastest route with respective vehicle
		for(Vehicle vehicle: allowedVehicles) {
			for(Orbit orbit: orbits) {
				Double time= getRouteTime(vehicle, orbit);
				if(time < minTime) {
					minTime= time;
					resOrbit=orbit.getOrbitName();
					resVehicle= vehicle.getVehicleName();
				}
				
			}
		}
		
		System.out.println(resVehicle+" "+resOrbit);
		
		ArrayList<String> res= new ArrayList<String>(Arrays.asList(resVehicle,resOrbit));
		
		return res;
	}
}
