//---------------------------------------------------
// Assignment 2
// Written by: Elsa 
// For Object-Oriented Programming I - Winter 2023
//------------------------------------------------------

//Algorithm 1: Static Latency Computer 
//This program monitors point to point connections between computing nodes, so as to ensure that every communication link works with reference to its bandwitch

import java.util.Scanner;

public class StaticLatencyComputer {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Static Latency-Computer Program:"); //welcome message to the user (3.)
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		
		Scanner myKeyboard = new Scanner(System.in);
		System.out.print("Please enter the bandwitch, in {n}{x}bps format, for the network link: "); //bandwidth message (4.)
		String bandwidth = myKeyboard.next();
		
		String xbps = bandwidth.substring((bandwidth.length()-4)); //extract the last 4 characters of the string  
		String stringNumber = bandwidth.substring(0,bandwidth.length()-4); //extract the beginning number from the string
		int n1 = Integer.parseInt(stringNumber); //convert string to integer
		
		//initialize prefixes
		double K = Math.pow(2,10);
		double M = Math.pow(2,20);
		double G = Math.pow(2,30);
		double T = Math.pow(2,40);
		double P = Math.pow(2,50);
		double E = Math.pow(2,60);
		double Z = Math.pow(2,70);
		double Y = Math.pow(2,0);
				
		
		//set a switch with each legal case inputs to make sure the writing of the input is valid
		
		double x = 0; //initialize prefix
		switch(xbps)
		{
		case "Kbps":
			x = K;
			break;
		case "Mbps":
			x = M;
			break;
		case "Gbps":
			x = G;
			break;
		case "Tbps":
			x = T;
			break;
		case "Pbps":
			x = P;
			break;
		case "Ebps":
			x = E;
			break;
		case "Zbps":
			x = Z;
			break;
		case "Ybps":
			x = Y;
			break;
		default:
			System.out.println("Invalid input for bandwidth; please re-run and enter the bandwidth in {n}{x}bps format.");
			System.out.println();
			System.out.print("Thank you for your contribution to Poject-S.");
			System.exit(0); //terminates program
		}
		
		int ip1 = 0;
		int ip2 = 0;
		int ip3 = 0;
		int ip4 = 0;
		
		System.out.print("Please enter the source IP address: "); //ip message (6.)
		if (myKeyboard.hasNextInt()) //checks if what is entered consists of only integers and not strings
			{
			ip1 = myKeyboard.nextInt();
			ip2 = myKeyboard.nextInt();
			ip3 = myKeyboard.nextInt();
			ip4 = myKeyboard.nextInt();
			}
		else
			{
			System.out.println("Error: Your entry for source IP address is incorrect. Kindly retry with valid inputs.");
			System.out.println();
			System.out.print("Thank you for your contribution to Poject-S.");
			System.exit(0);
			}
		
		
		if (ip1>255 || ip1<0 || ip2>255 || ip2<0 || ip3>255 || ip3<0 || ip4>255 || ip4<0)
				{System.out.println("Error: Your entry for source IP address is incorrect. Kindly retry with valid inputs.");
				System.out.println();
				System.out.print("Thank you for your contribution to Poject-S.");
				System.exit(0);}
		
		//making sure that each number of the ip addresses are in range (7.)
		
		System.out.print("Please enter the destination IP address: "); //2nd ip message (6.)
		int ip5 = myKeyboard.nextInt();
		int ip6 = myKeyboard.nextInt();
		int ip7 = myKeyboard.nextInt();
		int ip8 = myKeyboard.nextInt();		
		
		
		if (ip5>255 || ip5<0 || ip6>255 || ip6<0 || ip7>255 || ip7<0 || ip8>255 || ip8<0)
		{System.out.println("Error: Your entry for destination IP address is incorrect. Kindly retry with valid inputs.");
		System.out.println();
		System.out.print("Thank you for your contribution to Poject-S.");
		System.exit(0);}
		
		//data message (8.)
		
		System.out.print("Please enter data amount, in {n}{y}B format, for transmission over the network link: ");
		String data = myKeyboard.next();
		String yB = data.substring((data.length()-2)); //extract the last 2 characters of the string  
		String stringNumber2 = data.substring(0,data.length()-2); //extract the beginning number from the string
		int n2 = Integer.parseInt(stringNumber2);
		
		//9. validate the input with the different legal cases
		
		double y = 0; //initialize second prefix prefix
		switch(yB)
		{
		case "KB":
			y = K;
			break;
		case "MB":
			y = M;
			break;
		case "GB":
			y = G;
			break;
		case "TB":
			y = T;
			break;
		case "PB":
			y = P;
			break;
		case "EB":
			y = E;
			break;
		case "ZB":
			y = Z;
			break;
		case "YB":
			y = Y;
			break;
		default:
			System.out.println("Invalid input for bandwidth; please retry with the data amount in {n}{y}bps format.");
			System.out.println();
			System.out.print("Thank you for your contribution to Poject-S.");
			System.exit(0); //terminates program
		}
		
		double latency;
		double bits = n2*y*8; //1B = 8 bits
		double bps = n1*x;
		latency = bits/bps*1000;
		
		System.out.println("Latency " + "(" + ip1 + "." + ip2 + "." + ip3 + "." + ip4 + " --> " + ip5 + "." + ip6 + "." + ip6 + "." + ip8 + ") = " + latency + "ms");
		System.out.println();
		System.out.print("Thank you for your contribution to Project-S.");
		
		myKeyboard.close();
		}	
}
		
	
	
					
