package com.mission_impossible.Orbit;

public class OrbitFactory {
	public static Orbit getOrbit(String orbit, Double trafficSpeed) {		
		if(orbit==null) {
			return null;
		}
		else {
			Orbit tmpOrbit=new Orbit();
			if(orbit.equalsIgnoreCase("ORBIT1")) {
				tmpOrbit.setDistance(Double.valueOf(18));
				tmpOrbit.setCraters(Double.valueOf(20));
				tmpOrbit.setOrbitName("ORBIT1");
				tmpOrbit.setTrafficSpeed(trafficSpeed);
				return tmpOrbit;
			}
			else if(orbit.equalsIgnoreCase("ORBIT2")) {
				tmpOrbit.setDistance(Double.valueOf(20));
				tmpOrbit.setCraters(Double.valueOf(10));
				tmpOrbit.setOrbitName("ORBIT2");
				tmpOrbit.setTrafficSpeed(trafficSpeed);
				return tmpOrbit;
			}
		}
		
		return null;
	}
}
