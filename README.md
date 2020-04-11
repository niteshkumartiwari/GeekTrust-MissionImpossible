1. Setup Environment(https://mkyong.com/maven/how-to-install-maven-in-windows/)
2. To clean our project
```
mvn clean
```
3. To compile the project
```
mvn compile
```
4. To compile test
```
mvn test-compile
```
5. To run the tests
```
mvn test
```
6  To create jar file(located in target folder)
```
mvn install
```

# Use Jar File Directly
```
	java -jar geektrust.jar <path_to_input_file>
```
	
Input Format:
```
	WEATHER ORBIT_1_TRAFFIC_SPEED ORBIT_2_TRAFFIC_SPEED 
```

Output Format:
```
	VEHICLE_NAME ORBIT_NO
```
