/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * An enum type is a special data type that enables for a variable to be 
 *  a set of predefined constants. 
 * The variable must be equal to one of the values that have been
 *  predefined for it.
 * 
 * 
 * This program uses enumeration to save position and name of the planets
 *     
 *
 ****************************************************************************/



//have to import the following:
import java.util.Scanner;
import java.lang.*;

//enum showing Planet and distance
//NAME(Distance in million km)
enum PlanetEnum {
	MERCURY(57.9), 
	VENUS(108.2), 
	EARTH(149.6), 
	MARS(227.9), 
	JUPITER(778.3), 
	SATURN(1427.0), 
	URANUS(2871.0), 
	NEPTUNE(4497.1); //close off last enum (;)

	double distance;
	//need to define specifically what the data type is
	PlanetEnum(double p) {
		distance = p;
	}
	double getDistance() {
		return distance;
	} 
}//closing for enum


//---------------------------------------------------------------------------------
public class Planet {

	public static void main(String args[]) {

		//set up a scanner to get the response from the user
		Scanner scanner = new Scanner(System.in);
	
		//set variables to a default	
		String input = null;
		boolean notGottenDistance = true;
		PlanetEnum selectedPlanet;
	
		//get input
		//while (haveGottenDistance == "") {
		while (notGottenDistance) {
			//keep asking for input
			System.out.print("Where would you like to go to? Selection:   ");
			for(PlanetEnum planets : PlanetEnum.values()) { 
				System.out.print(planets + "  ");
			}
			
			System.out.println("");
			
			
			//Get input as a string value-----
			input = scanner.nextLine();
		
			//see if input is in enum
			//EnumUtils.isValidEnum(MyEnum.class, myValue)
			try {
				//if input is in enum
				selectedPlanet = PlanetEnum.valueOf(input.toUpperCase());
				//then print out output
				System.out.println("\nYou wanted to go to " + input);
				System.out.println("You would need to travel " + selectedPlanet.getDistance() + " million km");
				notGottenDistance= false;
				
			} catch (IllegalArgumentException x) {  
				//if input is not in enum
				System.out.println("Please input a valid planet!\n");
			}
			
		}//closing for while
		
	}//closing for main
  
} //closing for Planet

