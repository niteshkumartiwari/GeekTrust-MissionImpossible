package com.mission_impossible;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;



public class FastestRouteTest {

	@Test
	public void testResult() {
		ArrayList<String> result= FastestRoute.result("RAINY", Double.valueOf(40), Double.valueOf(25));
		ArrayList<String> expectedResult= new ArrayList<String>(Arrays.asList("CAR","ORBIT2"));
		assertEquals(expectedResult.size(), result.size());
		for (int i = 0; i < expectedResult.size(); i++) {
			assertEquals(expectedResult.get(i), result.get(i));
		}
		
		result= FastestRoute.result("SUNNY", Double.valueOf(12), Double.valueOf(10));
		expectedResult= new ArrayList<String>(Arrays.asList("TUKTUK","ORBIT1"));
		assertEquals(expectedResult.size(), result.size());
		for (int i = 0; i < expectedResult.size(); i++) {
			assertEquals(expectedResult.get(i), result.get(i));
		}
		
		result= FastestRoute.result("WINDY", Double.valueOf(14), Double.valueOf(20));
		expectedResult= new ArrayList<String>(Arrays.asList("CAR","ORBIT2"));
		assertEquals(expectedResult.size(), result.size());
		for (int i = 0; i < expectedResult.size(); i++) {
			assertEquals(expectedResult.get(i), result.get(i));
		}
		
		result= FastestRoute.result("RAINY", Double.valueOf(8), Double.valueOf(15));
		expectedResult= new ArrayList<String>(Arrays.asList("TUKTUK","ORBIT2"));
		assertEquals(expectedResult.size(), result.size());
		for (int i = 0; i < expectedResult.size(); i++) {
			assertEquals(expectedResult.get(i), result.get(i));
		}
	}
}
