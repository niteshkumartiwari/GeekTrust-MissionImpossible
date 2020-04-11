package com.mission_impossible.Vehicle;


public class VehicleFactory {
	public static Vehicle getVehicle(String vehicle) {
		if(vehicle==null) {
			return null;
		}
		else {
			Vehicle tmpVehicle=new Vehicle();
			if(vehicle.equalsIgnoreCase("BIKE")) {
				tmpVehicle.setSpeed(Double.valueOf(10));
				tmpVehicle.setCraterTime(Double.valueOf(2));
				tmpVehicle.setVehicleName("BIKE");
				return tmpVehicle;
			}
			else if(vehicle.equalsIgnoreCase("TUKTUK")) {
				tmpVehicle.setSpeed(Double.valueOf(12));
				tmpVehicle.setCraterTime(Double.valueOf(1));
				tmpVehicle.setVehicleName("TUKTUK");
				return tmpVehicle;
			}
			else if(vehicle.equalsIgnoreCase("CAR")) {
				tmpVehicle.setSpeed(Double.valueOf(20));
				tmpVehicle.setCraterTime(Double.valueOf(3));
				tmpVehicle.setVehicleName("CAR");
				return tmpVehicle;
			}
		}
		
		return null;
	}
}
