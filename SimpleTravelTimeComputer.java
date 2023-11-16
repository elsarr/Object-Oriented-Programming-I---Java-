// -----------------------------------
// Assignment 1
// Written by: Elsa 
// For Object Oriented Programming I - Fall 2023 
// -----------------------------------

/* Algorithm 2: Simple Travel-Time Computer 
   This program computes how much travel time it will take Project-S' spaceship
   to travel from the Earth's surface to to any extraterrestrial bodies such as planets, moons, etc.
 */

import java.util.Scanner;

public class SimpleTravelTimeComputer  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //create scanner 
		
		int speedMPH = 28000;//speed of the spaceship in miles per hour 
		double speedKPH = speedMPH*1.61; //speed of the spaceship in kilometers per hour
		
		System.out.println("Project-S Simple Travel-Time Computer:");
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		
		
		System.out.print("Please enter the distance (in km) between the Earth and the extraterrestrial body: "); //prompt message for the user to enter the foreknown distance 
		float distance = input.nextFloat(); //the distances are big and can be decimals so we use a float
		
		double time = distance/speedKPH; //time in hours = distance / speed
		int days = (int) Math.round(time/24); /*to get the number of days we divide time by 24 since there is 24 hours in a day; 
		we round it to the closest day and typecast int because we want a day with no decimals, and an int is smaller than a double*/
		
		System.out.println("Project-S spaceship, constantly travelling at " + speedMPH + "mi/h, will take approximately");
		System.out.println(days + " 'Earth-based days' to get to its foreknown extraterrestrial destination."); 
		
		System.out.println();
		System.out.print("Thank you for your contribution to Project-S."); //complimentary-close message 
		
		input.close(); //close scanner 
		
	}

}
