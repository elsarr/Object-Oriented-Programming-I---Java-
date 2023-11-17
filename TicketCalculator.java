//Assignment 1 question 2 
//Written by: Elsa 
//For Object-Oriented Programming I - Winter 2023

//This program calculates the number of movie ticekts someone can buy with a prepaid giftcard

import java.util.Scanner;

public class TicketCalculator 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Simple Cinema Tickets Invoice Program:");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		final double price = 6.99; //set the constant price of a ticket 
		
		Scanner keyIn = new Scanner(System.in); //create a scanner
		System.out.print("Enter the prepaid giftcard retailer/bank name: ");
		String name = keyIn.nextLine(); //scan everything that was written previously 
		String nameUpper = name.toUpperCase();
		System.out.println("You will be using " + nameUpper + " gift card for your ticket(s) purchase.");
		
		System.out.print("Enter the amount on the gift card (amount should be greater than "+price+"):");//prompting the user to enter an amount bigger than the ticket price 
		double amount = keyIn.nextDouble();
		System.out.println("There is a fund of $" + amount + " on your prepaid " + nameUpper + " gift card.");
		
		int tickets = (int)(amount/price);//convert double into integer for the number of tickets 
		float balance = (float)(amount%price); //convert double to float because float is smaller and will display only 2 decimals 
		System.out.print("Using your " + nameUpper + " gift card you can purchase " + tickets + " tickets and have a balance of $");
		System.out.printf("%.2f", balance);//make balance print with 2 digits after decimal
		System.out.println(" on the gift card.");
		
		System.out.print("Enter the number of tickets you want to purchase (less than or equal to " +tickets+"):");
		int number = keyIn.nextInt();
		double purchase = number*price;
		System.out.println("The purchase of " + number + " ticket(s) costs $" + purchase + "."); 
		
		float newBalance = (float)(amount - purchase);
		System.out.println("The balance left on your " + nameUpper + " gift card is $" + newBalance + ".");
		System.out.println();
		
		System.out.println("Please enter your purchase info:");
		System.out.println();
		
		System.out.print("Day of purcahse (between 1 and 31): ");
		int day = keyIn.nextInt();
		
		System.out.print("Month of purcahse (between 1 and 12): ");
		int month = keyIn.nextInt();
		
		System.out.print("Year of purcahse (between 2023 and 2028): ");
		int year = keyIn.nextInt();
		
		System.out.println("_________________________________________________________________________________");
		System.out.println("                         Cinema Concordia      "+ day+ "/" + month + "/" + year);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("_________________________________________________________________________________");
		
		System.out.println();
		System.out.println(number + " Tickets                                                                 $" + purchase);
		System.out.println("$"+purchase+ " was redeemed from "+nameUpper+" prepayed gift card.");
		System.out.println(nameUpper+ " gift card balance                                           $"+newBalance);
		System.out.println("_________________________________________________________________________________");
		System.out.println("Invoice generated successfully.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Thank you for usig my bespoke Cinema Tickets Invoice Program!");
		
		
		keyIn.close();//close scanner
	
				
		
		

	
	}

	


}
