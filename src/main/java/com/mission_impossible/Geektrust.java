package com.mission_impossible;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Geektrust{
	public static void main(String args[]) throws Exception {
		//Reading Input 
		Path path = Paths.get(args[0]);
		String[] input = Files.readString(path).split(" ");
		
		String weather= input[0];
		Double Orbit1Traffic= Double.parseDouble(input[1]);
		Double Orbit2Traffic= Double.parseDouble(input[2]);
		
		FastestRoute.result(weather,Orbit1Traffic,Orbit2Traffic);
	}
}