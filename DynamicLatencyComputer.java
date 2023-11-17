//---------------------------------------------------
// Assignment 2
// Written by: Elsa 
// For Object-Oriented Programming I - Winter 2023
//------------------------------------------------------

//Algorithm 2 : Dynamic Latency Computer
//this program calculates the daily standard bandwidths and latencies 

import java.util.Scanner;

public class DynamicLatencyComputer {

	public static void main(String[] args) {
		
		//define each variable 
		
		double M = Math.pow(2,20);
		double G = Math.pow(2,30);
		double T = Math.pow(2,40);
		double P = Math.pow(2,50);
		double E = Math.pow(2,60);
		double Z = Math.pow(2,70);
		double Y = Math.pow(2,80);
		
		double mondayBandwidth = 999*M;
		double tuesdayBandwidth = 0.9*Y;
		double wednesdayBandwidth = 10*G;
		double thursdayBandwidth = 2.5*T;
		double fridayBandwidth = 0.9*P;
		double saturdayBandwidth = 1.1*E;
		double sundayBandwidth = 1.5*Z;
		
		double mondayLatency = 8.0*Math.pow(10, -6);
		double tuesdayLatency = 8.8*Math.pow(10, -21);
		double wednesdayLatency = 8.0*Math.pow(10, -7);
		double thursdayLatency = 3.2*Math.pow(10, -10);
		double fridayLatency = 8.8*Math.pow(10, -12);
		double saturdayLatency = 7.2*Math.pow(10, -15);
		double sundayLatency = 5.3*Math.pow(10, -18);
		
		Scanner myKeyboard = new Scanner(System.in);
		System.out.print("Please enter a Weekday, Mode, and Data Quantity, respectively: "); //prompt message (3.)
		String weekday = myKeyboard.next();
		String mode = myKeyboard.next();
		String dataQuantity = myKeyboard.next();
		
		String weekdayCap = weekday.toUpperCase();
		double latency = 0;
		double bandwidth = 0;
			
		
		switch(weekdayCap)
		{
		case "MONDAY":
			latency = mondayLatency;
			bandwidth = mondayBandwidth;
			break;
		case "TUESDAY":
			latency = tuesdayLatency;
			bandwidth = tuesdayBandwidth;
			break;
		case "WEDNESDAY":
			latency = wednesdayLatency;
			bandwidth = wednesdayBandwidth;
			break;
		case "THURSDAY":
			latency = thursdayLatency;
			bandwidth = thursdayBandwidth;
			break;
		case "FRIDAY":
			latency = fridayLatency;
			bandwidth = fridayBandwidth;
			break;
		case "SATURDAY":
			latency = saturdayLatency;
			bandwidth = saturdayBandwidth;
			break;
		case "SUNDAY":
			latency = sundayLatency;
			bandwidth = sundayBandwidth;
			break;
		default: 
			System.out.println("Error: Invalid value entered for the 'Weekday' variable. Kindly retry with a valid input.");
			System.out.println();
			System.out.print("Once again, thanks for your contribution to Project-S.");
			System.exit(0);
		}
		
		String modeCap = mode.toUpperCase();
		double l = 0;
		double b = 0;
		
		switch(modeCap)
		{
		case "BANDWIDTH":
			b = bandwidth;
			l = latency;
			break;
		case "LATENCY":
			l = latency;
			b = bandwidth;
			break;
		default:
			System.out.println("Error: Invalid value entered for the 'Mode' variable. Kindly retry with a valid input.");
			System.out.println();
			System.out.print("Once again, thanks for your contribution to Project-S.");
			System.exit(0);
		}
		
		double y = 0; //initialize prefix quantifier of the data quantity
		double n = 0; //initialize number of the data quantity 
		
		switch(dataQuantity.toUpperCase())
		{
		case "10GB": //put all cases since case-insensitive 
			n = 10;
			y = G;
			break;
		case "20PB":
			n = 20;
			y = P;
			break;
		case "30ZB":
			n = 30;
			y = Z;
			break;
		default:
			System.out.println("Error: Invalid value entered for the 'Data Quantity' variable. Kindly retry with a valid input.");
			System.out.println();
			System.out.print("Once again, thanks for your contribution to Project-S.");
			System.exit(0);			
		}
		System.out.println(l);
		
		float finalLatency;
		
		finalLatency = (float)(n*y*8/b)*1000;	
		
		
		System.out.print("Latency incurred in transmitting " + dataQuantity.toUpperCase() + " of data, over Project-S microwave network link, is: ");
		System.out.printf("%.6f",finalLatency);
		System.out.println("ms");
		System.out.println();
		System.out.print("Once again, thanks for your contribution to Project-S.");
		
		myKeyboard.close();
	}
	

}

		
	
	
					
