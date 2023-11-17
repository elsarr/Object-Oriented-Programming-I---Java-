// -----------------------------------
// Assignment 3
// Written by: Elsa 
// For Object-Oriented programming I - Fall 2023 
// -----------------------------------

/* Question 1: Basic Calculator: Addition and Subtraction
   This program offers to calculate either the addition or subtraction of a list of numbers
   The first number represents the number of numbers we want to sum up or subtract 
   and then the rest are the actual numbers which we perform the operation on.
 */

import java.util.Scanner; 

public class BasicCalculator 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to this calculator, offering Addition ad Subtraction.");
		int number; //initialize variable for do-while loop 2
		
		String repeat = ""; //initialize for do-while loop 1
		do //do-while loop 1 which checks if we want to do another operation, hence why it is called repeat
		{
			do //do-while loop 2 continues to ask for a number until number is 1 or 2 
			
			{
				System.out.print("Please select 1 for Addition or 2 for Subtraction: ");
				number = in.nextInt();
				if (number != 1 && number != 2) //if number is not 1 and not 2 then prints error and continues
					System.out.println("Operation not supported");
			}
			while(number != 1 && number!= 2); //
			
			System.out.print("Please input your numbers: ");
			int count = in.nextInt();
			
			double addition = 0;
			double subtraction = 0;
					
			if (number == 1) //1 represents addition
			{
				
				for (;count>0;count--) //count is the first number entered and represents how many numbers will proceed
				{
					double num = in.nextDouble();
					addition += num; //adds all the following numbers 
					
				}
				System.out.print("The result of your addition is: ");
				System.out.printf("%.2f",addition); //2 decimal print
				System.out.println();
			}
			else if (number == 2) //2 represents subtraction
			{
				double num1 = in.nextDouble();
				subtraction = num1; //initialize the first number (after count) to be the start of the subtraction
				for(count -= 1;count>0;count--) //start at count-1 because we start at the second number since the first number is already stored in a variable
					{
					double num2 = in.nextDouble();
					subtraction -= num2; //subtract the following numbers from the first number 
					}
				System.out.print("The result of your subtraction is: ");
				System.out.printf("%.2f",subtraction);
				System.out.println();
				
			}
			
			System.out.print("Do you want to perform another operation? y/yes: ");
			repeat = in.next();
			
			switch(repeat) //check the validity of the cases for the input 
			{
			case "y":
			case "Y":
			case "yes":
			case "Yes":
				continue;
			default:
				{System.out.print("Goodbye!");
				System.exit(0);}
					
				
			}
		}
		while(repeat.toLowerCase().equals("yes") || repeat.toLowerCase().equals("y")); //repeat everything until the user doesn't want to anymore

		in.close(); //close scanner
	}

}

